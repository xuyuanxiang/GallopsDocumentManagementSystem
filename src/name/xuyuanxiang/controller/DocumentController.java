package name.xuyuanxiang.controller;

import java.io.File;
import java.util.Date;

import name.xuyuanxiang.common.Constants;
import name.xuyuanxiang.common.Page;
import name.xuyuanxiang.model.Document;
import name.xuyuanxiang.model.Root;
import name.xuyuanxiang.model.User;
import name.xuyuanxiang.model.Version;
import name.xuyuanxiang.service.DocumentManager;
import name.xuyuanxiang.service.RootManager;
import name.xuyuanxiang.service.UserManager;
import name.xuyuanxiang.service.VersionManager;
import name.xuyuanxiang.util.DocumentKit;
import name.xuyuanxiang.util.Office2PDFKit;
import name.xuyuanxiang.util.SWFKit;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.stereotype.Controller;

@Controller
@RemotingDestination
public class DocumentController {

	@Autowired
	private DocumentManager documentManager;

	@Autowired
	private RootManager rootManager;

	@Autowired
	private UserManager userManager;

	@Autowired
	private VersionManager versionManager;

	public String preview(String id) {
		Version version  = versionManager.getCurrVersionByDocument(id);
		if (version != null) {
			File file = new File(version.getPathname());
			if (file.isFile()) {
				File swf = new File(Constants.PREVIEW + version.getId()
						+ ".swf");
				if (!swf.isFile()) {
					File pdf = new File(file.getPath().replace(
							version.getType(), "pdf"));
					if (!pdf.isFile()) {
						Office2PDFKit.office2PDF(file, pdf.getPath());
					}
					SWFKit.toSwf(pdf, swf);
				}
				if (swf.isFile()) {
					String path = swf.getPath().replace(Constants.PREVIEW, "")
							.replace("\\", "/");
					while (path.indexOf("\\") >= 0) {
						path = path.replace("\\", "/");
					}
					return "/dm/preview/" + path;
				} else {
					return "在线预览格式正在转换中...";
				}
			}
		}
		return "文件不存在！";
	}

	public Document disableDocument(String id) {
		Document document = documentManager.get(id);
		if (document != null) {
			document.setEnabled(false);
//			document.setDestoried(true);
			return documentManager.save(document);
		}
		return null;
	}

	public Document enableDocument(String id) {
		Document document = documentManager.get(id);
		if (document != null) {
			document.setEnabled(true);
			document.setDestoried(false);
			return documentManager.save(document);
		}
		return null;
	}

	public boolean existName(String parentId, String name) {
		Document parent = documentManager.get(parentId);
		Boolean rtn = false;
		if (parent == null) {
			Root root = rootManager.getEnableRoot();
			rtn = documentManager.existName(root.getId(), "", name);
		} else {
			rtn = documentManager.existName(parent.getRoot().getId(),
					parent.getId(), name);
		}
		return rtn;
	}

	public Page<Document> findDocumentsByName(String name, Integer pageNo,
			Integer pageSize) {
		return documentManager.findDocumentsByName(name, pageNo, pageSize);
	}

	public Page<Document> findTopLevelDocumentsByRoot(String rootId,
			Integer pageNo, Integer pageSize) {
		Page<Document> page = documentManager.findTopLevelDocumentsByRoot(
				rootId, pageNo, pageSize);
		return page;
	}

	public Page<Document> getRecycleDocuments(Integer pageNo, Integer pageSize) {
		return documentManager.getRecycleDocuments(pageNo, pageSize);
	}

	public Document createFolder(String parentId, String userId, String name) {
		User user = userManager.get(userId);
		if (user != null) {
			Document parent = null;
			if (StringUtils.isNotEmpty(parentId)) {
				parent = documentManager.get(parentId);
			}
			Root root = (parent == null || parent.getRoot() == null) ? rootManager
					.getEnableRoot() : parent.getRoot();
			Document document = new Document();
			document.setRoot(root);
			document.setParent(parent);
			document.setCreated(new Date());
			document.setOwner(user);
			document.setAlias(name);
			document = documentManager.save(document);
			String pathname = (parent == null ? root.getAbsolutePath() : parent
					.getPathname() + "\\")
					+ document.getId();
			document.setPathname(DocumentKit.mkdir(pathname));
			document.setLastModified(new Date());
			document.setType("文件夹");
			document.setEnabled(true);
			return documentManager.save(document);
		}
		return null;
	}

	public Document createDocument(Document document) {
		Document curr = documentManager.getUnsuccessUpLoadDocument(document
				.getRoot().getId(), document.getParent() == null ? ""
				: document.getParent().getId(), document.getAlias());
		if (curr == null) {
			document.setCreated(new Date());
			document = documentManager.save(document);
		} else {
			document = curr;
		}
		Version version = versionManager.getCurrVersionByDocument(document
				.getId());
		if (version == null) {
			version = new Version();
		}
		version.setDocument(document);
		version.setCreater(document.getOwner());
		version.setType(document.getType());
		version.setSize(document.getSize());
		version.setCreated(new Date());
		version.setAlias(document.getAlias());
		version = versionManager.save(version);
		String pathname = (document.getParent() == null ? document.getRoot()
				.getAbsolutePath() : document.getParent().getPathname() + "\\")
				+ version.getId() + "." + document.getType();
		version.setPathname(pathname);
		version.setEnabled(true);
		version = versionManager.save(version);
		document.setPathname(version.getPathname());
		document.setDestoried(true);
		document.setLastModified(version.getCreated());
		return documentManager.save(document);
	}

	public Document updateDocument(String docId, Version version) {
		Document document = documentManager.get(docId);
		if (document != null) {
			Version old = versionManager.getCurrVersionByDocument(document
					.getId());
			old.setEnabled(false);
			versionManager.save(old);
			version.setCreated(new Date());
			version = versionManager.save(version);
			String pathname = (document.getParent() == null ? document
					.getRoot().getAbsolutePath() : document.getParent()
					.getPathname() + "\\")
					+ version.getId() + "." + document.getType();
			version.setPathname(pathname);
			version.setEnabled(true);
			version = versionManager.save(version);
			document.setEnabled(true);
			document.setPathname(version.getPathname());
			document.setLastModified(version.getCreated());
			document.setType(version.getType());
			document.setSize(version.getSize());
			document.setAlias(version.getAlias());
			return documentManager.save(document);
		}
		return null;
	}

	public Document save(Document document) {
		return documentManager.save(document);
	}

	public Page<Document> getChildren(String documentId, Integer pageNo,
			Integer pageSize) {
		return documentManager.getChildren(documentId, pageNo, pageSize);
	}

	public void setDocumentManager(DocumentManager documentManager) {
		this.documentManager = documentManager;
	}

	public void setRootManager(RootManager rootManager) {
		this.rootManager = rootManager;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public void setVersionManager(VersionManager versionManager) {
		this.versionManager = versionManager;
	}

}
