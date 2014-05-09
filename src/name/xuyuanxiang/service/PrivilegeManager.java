package name.xuyuanxiang.service;

import java.util.ArrayList;
import java.util.List;

import name.xuyuanxiang.model.Privilege;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class PrivilegeManager extends BaseManager<Privilege, String> {

	public PrivilegeManager() {
		super(Privilege.class);
	}

	public Privilege getByName(String name) {
		String hql = "from Privilege where name =?";
		List<Object> parameters = new ArrayList<Object>();
		parameters.add(name);
		return privilegeDao.getFirstResult(hql, parameters);
	}

	public List<Privilege> getTopLevelPrivilege() {
		String hql = "from Privilege where parent.id is null";
		return privilegeDao.findByHQL(hql, null);
	}

	public List<Privilege> getChildren(String id) {
		String hql = "from Privilege where parent.id = ?";
		List<Object> parameters = new ArrayList<Object>();
		parameters.add(id);
		return privilegeDao.findByHQL(hql, parameters);
	}

}
