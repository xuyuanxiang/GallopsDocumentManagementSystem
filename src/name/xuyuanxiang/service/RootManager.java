package name.xuyuanxiang.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import name.xuyuanxiang.model.Root;

@Transactional
public class RootManager extends BaseManager<Root, String> {

	public RootManager() {
		super(Root.class);
	}

	public List<Root> getUnHidden() {
		String hql = "from Root where hidden = ?";
		List<Object> parameters = new ArrayList<Object>();
		parameters.add(false);
		return rootDao.findByHQL(hql, parameters);
	}

	public Root getEnableRoot() {
		String hql = "from Root where enabled = ?";
		List<Object> parameters = new ArrayList<Object>();
		parameters.add(true);
		Root root = rootDao.getFirstResult(hql, parameters);
//		Constants.root = root;
		return root;
	}

	public boolean existName(String name, String rootId) {
		Root root = rootDao.getByName(name);
		return root != null && !root.getId().equals(rootId);
	}

	public boolean existPath(String path, String rootId) {
		Root root = rootDao.getByPath(path);
		return root != null && !root.getId().equals(rootId);
	}

}
