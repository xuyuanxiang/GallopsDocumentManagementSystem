package name.xuyuanxiang.controller;

import java.util.List;
import java.util.Set;

import name.xuyuanxiang.model.Group;
import name.xuyuanxiang.model.Privilege;
import name.xuyuanxiang.model.User;
import name.xuyuanxiang.service.GroupManager;
import name.xuyuanxiang.service.PrivilegeManager;
import name.xuyuanxiang.service.UserManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.stereotype.Controller;

@Controller
@RemotingDestination
public class PrivilegeController {

	@Autowired
	private PrivilegeManager privilegeManager;

	@Autowired
	private UserManager userManager;

	@Autowired
	private GroupManager groupManager;

	public boolean hasPrivilege(String userId, String name) {
		User user = userManager.get(userId);
		Privilege privilege = privilegeManager.getByName(name);
		return user.hasPrivilege(privilege);
	}

	public List<Privilege> getPrivilegesByUser(String userId) {
		User user = userManager.get(userId);
		return user.getPrivileges();
	}

	public List<Privilege> getTopLevelPrivilege() {
		return privilegeManager.getTopLevelPrivilege();
	}

	public List<Privilege> getAll() {
		return privilegeManager.getAll();
	}

	public Privilege get(String id) {
		return privilegeManager.get(id);
	}

	public List<Privilege> getChildren(String id) {
		return privilegeManager.getChildren(id);
	}

	public Set<Privilege> getPrivilegesByGroup(String groupId) {
		Group group = groupManager.get(groupId);
		return group == null ? null : group.getPrivileges();
	}

	public void setPrivilegeManager(PrivilegeManager privilegeManager) {
		this.privilegeManager = privilegeManager;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public void setGroupManager(GroupManager groupManager) {
		this.groupManager = groupManager;
	}

}
