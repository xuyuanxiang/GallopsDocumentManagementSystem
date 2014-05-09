package name.xuyuanxiang.service;

import org.springframework.transaction.annotation.Transactional;

import name.xuyuanxiang.model.Department;

@Transactional
public class DepartmentManager extends BaseManager<Department, String> {

	public DepartmentManager() {
		super(Department.class);
	}

	public Department getTopLevelDepartment() {
		String hql = "from Department where parent.id is null";
		return departmentDao.getFirstResult(hql, null);
	}

}
