package name.xuyuanxiang.controller;

import java.io.File;
import java.util.List;

import name.xuyuanxiang.model.Root;
import name.xuyuanxiang.service.RootManager;
import name.xuyuanxiang.util.DocumentKit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.stereotype.Controller;

@Controller
@RemotingDestination
public class RootController {

	@Autowired
	private RootManager rootManager;

	public Root save(Root root) {
		String path = root.getAbsolutePath();
		path = DocumentKit.mkdir(path);
		if (new File(path).isDirectory()) {
			root.setAbsolutePath(path+"\\");
			return rootManager.save(root);
		} else {
			return null;
		}
	}

	public Root getEnableRoot() {
		return rootManager.getEnableRoot();
	}

	public Root enable(String id) {
		Root root = rootManager.getEnableRoot();
		if (root != null) {
			root.setEnabled(false);
			rootManager.save(root);
		}
		Root curr = rootManager.get(id);
		curr.setEnabled(true);
		DocumentKit.mkdir(curr.getAbsolutePath());
		curr = rootManager.save(curr);
//		Constants.root = curr;
		return curr;
	}

	public List<Root> getUnHidden() {
		List<Root> rtn = rootManager.getUnHidden();
		return rtn;
	}

	public List<Root> getAll() {
		return rootManager.getAll();
	}

	public boolean existName(String name, String rootId) {
		return rootManager.existName(name, rootId);
	}

	public boolean existPath(String path, String rootId) {
		return rootManager.existPath(path, rootId);
	}

	public void setRootManager(RootManager rootManager) {
		this.rootManager = rootManager;
	}

}
