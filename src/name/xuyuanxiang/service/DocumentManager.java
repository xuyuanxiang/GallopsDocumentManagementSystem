package name.xuyuanxiang.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.transaction.annotation.Transactional;

import name.xuyuanxiang.common.Page;
import name.xuyuanxiang.model.Document;

@Transactional
public class DocumentManager extends BaseManager<Document, String> {

	public DocumentManager() {
		super(Document.class);
	}

	public Page<Document> findDocumentsByName(String name, Integer pageNo,
			Integer pageSize) {
		String hql = "from Document where enabled = ? and destoried = ?";
		List<Object> parameters = new ArrayList<Object>();
		parameters.add(true);
		parameters.add(false);
		if (StringUtils.isNotEmpty(name)) {
			hql += " and UPPER(alias) like '%" + name.toLowerCase() + "%'";
		}
		return documentDao.getPageByHQL(hql, parameters, pageNo, pageSize);
	}

	public Page<Document> findTopLevelDocumentsByRoot(String rootId,
			Integer pageNo, Integer pageSize) {
		String hql = "from Document where enabled = ? and destoried = ? and root.id = ? and parent.id is null";
		List<Object> parameters = new ArrayList<Object>();
		parameters.add(true);
		parameters.add(false);
		parameters.add(rootId);
		return documentDao.getPageByHQL(hql, parameters, pageNo, pageSize);
	}

	public Document getByRootAndPathName(String rootId, String pathName) {
		String hql = "from Document where root.id = ? and pathname = ? and enabled = ? and destoried = ?";
		List<Object> parameters = new ArrayList<Object>();
		parameters.add(rootId);
		parameters.add(pathName);
		parameters.add(true);
		parameters.add(false);
		return documentDao.getFirstResult(hql, parameters);
	}

	public Page<Document> getChildren(String documentId, Integer pageNo,
			Integer pageSize) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("parent.id", documentId);
		parameters.put("enabled", true);
		parameters.put("destoried", false);
		return documentDao.getPageByParameters(pageNo, pageSize, parameters,
				"created", false);
	}

	public Page<Document> getSharedDocumentsByName(String name, Integer pageNo,
			Integer pageSize) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		if (StringUtils.isNotEmpty(name))
			parameters.put("alias", name);
		parameters.put("shared", true);
		parameters.put("enabled", true);
		parameters.put("destoried", false);
		return documentDao.getPageByParameters(pageNo, pageSize, parameters,
				"created", false);
	}

	public Page<Document> getDocumentsByNameAndOwner(String name,
			String userId, Integer pageNo, Integer pageSize) {
		String hql = "from Document where enabled = ? and destoried = ? and id in (select dinstinct(document.id) from Version where creator.id = ?)";
		List<Object> parameters = new ArrayList<Object>();
		parameters.add(true);
		parameters.add(false);
		parameters.add(userId);
		if (StringUtils.isNotEmpty(name)) {
			hql += " and UPPER(alias) like '%?%'";
			parameters.add(name.toUpperCase());
		}
		return documentDao.getPageByHQL(hql, parameters, pageNo, pageSize);
	}

	public Document getUnsuccessUpLoadDocument(String rootId, String parentId,
			String alias) {
		String hql = "from Document where root.id = ? and alias = ?";
		List<Object> parameters = new ArrayList<Object>();
		parameters.add(rootId);
		parameters.add(alias);
		if (StringUtils.isNotEmpty(parentId)) {
			hql += " and parent.id = ?";
			parameters.add(parentId);
		} else {
			hql += " and parent.id is null";
		}
		List<Document> list = documentDao.findByHQL(hql, parameters);
		if (list != null && !list.isEmpty())
			return list.get(0);
		return null;
	}

	public Page<Document> getRecycleDocuments(Integer pageNo, Integer pageSize) {
		// String hql =
		// "from Document as doc1 where doc1.enabled = ? and doc1.destoried = ? and doc1.parent.id in (select doc2.id from Document as doc2 where doc2.enabled = ? and doc2.enabled = ?)";
		// List<Object> parameters = new ArrayList<Object>();
		// parameters.add(false);
		// parameters.add(false);
		// parameters.add(true);
		// parameters.add(false);
		// return documentDao.getPageByHQL(hql, parameters, pageNo, pageSize);
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("enabled", false);
		parameters.put("destoried", false);
		return documentDao.getPageByParameters(pageNo, pageSize, parameters,
				"lastModified", false);
	}

	public boolean existName(String rootId, String parentId, String name) {
		return documentDao.existName(rootId, parentId, name);
	}
}
