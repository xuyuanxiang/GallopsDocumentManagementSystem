package name.xuyuanxiang.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import name.xuyuanxiang.model.Department;
import name.xuyuanxiang.model.Group;
import name.xuyuanxiang.model.Privilege;
import name.xuyuanxiang.model.Role;
import name.xuyuanxiang.service.DepartmentManager;
import name.xuyuanxiang.service.GroupManager;
import name.xuyuanxiang.service.PrivilegeManager;
import name.xuyuanxiang.service.RoleManager;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.stereotype.Controller;

import flex.messaging.io.ArrayCollection;

@Controller
@RemotingDestination
public class GroupController {

	@Autowired
	private GroupManager groupManager;

	@Autowired
	private RoleManager roleManager;

	@Autowired
	private DepartmentManager departmentManager;

	@Autowired
	private PrivilegeManager privilegeManager;

	public Group getById(String id) {
		return groupManager.get(id);
	}

	public List<Group> getAll() {
		return groupManager.getAll();
	}

	public Group enableOrDisableGroup(String id) {
		return groupManager.enableOrDisableGroup(id);
	}

	public Group saveOrUpdate(Group curr) {
		if (StringUtils.isNotEmpty(curr.getId())) {
			Group group = groupManager.get(curr.getId());
			if (StringUtils.isNotEmpty(curr.getName()))
				group.setName(curr.getName());
			if (StringUtils.isNotEmpty(curr.getDescription()))
				group.setDescription(curr.getDescription());
			return groupManager.save(group);
		} else {
			return groupManager.save(curr);
		}
	}

	public boolean existName(String name) {
		return groupManager.existName(name);
	}

	public Group addPrivileges(String groupId, ArrayCollection privilegeIds) {
		Group group = groupManager.get(groupId);
		if (group != null) {
			Privilege privilege = null;
			Set<Privilege> privileges = new HashSet<Privilege>();
			for (Object obj : privilegeIds) {
				privilege = privilegeManager.get(obj + "");
				if (privilege != null)
					privileges.add(privilege);
			}
			group.setPrivileges(privileges);
			return groupManager.save(group);
		}
		return null;
	}

	public Group addDepartments(String groupId, ArrayCollection deptIds) {
		Group group = groupManager.get(groupId);
		if (group != null) {
			Department department = null;
			Set<Department> departments = new HashSet<Department>();
			for (Object obj : deptIds) {
				department = departmentManager.get(obj + "");
				if (department != null)
					departments.add(department);
			}
			group.setDepartments(departments);
			return groupManager.save(group);
		}
		return null;
	}

	public Group addRoles(String groupId, ArrayCollection roleIds) {
		Group group = groupManager.get(groupId);
		if (group != null) {
			Role role = null;
			Set<Role> roleSet = new HashSet<Role>();
			for (Object obj : roleIds) {
				role = roleManager.get(obj + "");
				if (role != null)
					roleSet.add(role);
			}
			group.setRoles(roleSet);
			return groupManager.save(group);
		}
		return null;
	}

	public Group removeDepartment(String groupId, String deptId) {
		Group group = groupManager.get(groupId);
		if (group != null && StringUtils.isNotEmpty(deptId)) {
			group.removeDepartment(deptId);
			return groupManager.save(group);
		}
		return null;
	}

	public Group removeRole(String groupId, String roleId) {
		Group group = groupManager.get(groupId);
		if (group != null && StringUtils.isNotEmpty(roleId)) {
			group.removeRole(roleId);
			return groupManager.save(group);
		}
		return null;
	}

	public Group removePrivilege(String groupId, String privilegeId) {
		Group group = groupManager.get(groupId);
		if (group != null && StringUtils.isNotEmpty(privilegeId)) {
			group.removePrivilege(privilegeId);
			return groupManager.save(group);
		}
		return null;
	}

	public void setGroupManager(GroupManager groupManager) {
		this.groupManager = groupManager;
	}

	public void setRoleManager(RoleManager roleManager) {
		this.roleManager = roleManager;
	}

	public void setDepartmentManager(DepartmentManager departmentManager) {
		this.departmentManager = departmentManager;
	}

	public void setPrivilegeManager(PrivilegeManager privilegeManager) {
		this.privilegeManager = privilegeManager;
	}

}
