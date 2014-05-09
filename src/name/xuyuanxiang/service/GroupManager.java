package name.xuyuanxiang.service;

import org.springframework.transaction.annotation.Transactional;

import name.xuyuanxiang.model.Group;

@Transactional
public class GroupManager extends BaseManager<Group, String> {

	public GroupManager() {
		super(Group.class);
	}

	public Group enableOrDisableGroup(String id) {
		Group group = groupDao.get(id);
		if (group != null) {
			group.setEnable(!group.getEnable());
			return save(group);
		}
		return null;
	}

	public boolean existName(String name) {
		return groupDao.existName(name);
	}

}
