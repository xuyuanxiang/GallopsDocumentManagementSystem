package name.xuyuanxiang.controller;

import java.util.List;
import java.util.Set;

import name.xuyuanxiang.model.Group;
import name.xuyuanxiang.model.Role;
import name.xuyuanxiang.service.GroupManager;
import name.xuyuanxiang.service.RoleManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.stereotype.Controller;

@Controller
@RemotingDestination
public class RoleController {

	@Autowired
	private RoleManager roleManager;

	@Autowired
	private GroupManager groupManager;

	public Set<Role> getRolesByGroup(String groupId) {
		Group group = groupManager.get(groupId);
		return group == null ? null : group.getRoles();
	}

	public List<Role> getAll() {
		return roleManager.getAll();
	}

	public Role get(String id) {
		return roleManager.get(id);
	}

	public void setRoleManager(RoleManager roleManager) {
		this.roleManager = roleManager;
	}

	public void setGroupManager(GroupManager groupManager) {
		this.groupManager = groupManager;
	}

}
