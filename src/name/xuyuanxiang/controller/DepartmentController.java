package name.xuyuanxiang.controller;

import java.util.Set;

import name.xuyuanxiang.model.Department;
import name.xuyuanxiang.model.Group;
import name.xuyuanxiang.service.DepartmentManager;
import name.xuyuanxiang.service.GroupManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.stereotype.Controller;

@Controller
@RemotingDestination
public class DepartmentController {

	@Autowired
	private DepartmentManager departmentManager;

	@Autowired
	private GroupManager groupManager;

	public Department getTopLevelDepartment() {
		Department department = departmentManager.getTopLevelDepartment();
		return department;
	}

	public Set<Department> getDepartmentsByGroup(String groupId) {
		Group group = groupManager.get(groupId);
		return group == null ? null : group.getDepartments();
	}

	public void setDepartmentManager(DepartmentManager departmentManager) {
		this.departmentManager = departmentManager;
	}

	public void setGroupManager(GroupManager groupManager) {
		this.groupManager = groupManager;
	}

}
