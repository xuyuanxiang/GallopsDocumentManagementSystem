package name.xuyuanxiang.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.myapps.webservice.client.UserService;

import name.xuyuanxiang.common.Page;
import name.xuyuanxiang.dao.BaseDao;
import name.xuyuanxiang.dao.DepartmentDao;
import name.xuyuanxiang.dao.DocumentDao;
import name.xuyuanxiang.dao.GroupDao;
import name.xuyuanxiang.dao.LogDao;
import name.xuyuanxiang.dao.OperationDao;
import name.xuyuanxiang.dao.PrivilegeDao;
import name.xuyuanxiang.dao.RoleDao;
import name.xuyuanxiang.dao.RootDao;
import name.xuyuanxiang.dao.SecurityDao;
import name.xuyuanxiang.dao.UserDao;
import name.xuyuanxiang.dao.VersionDao;

public class BaseManager<T, PK extends Serializable> {

	protected BaseDao<T, PK> dao;
	protected Class<? extends T> clazz;
	protected Map<String, ? extends BaseDao<T, PK>> daos = new HashMap<String, BaseDao<T, PK>>();
	protected DocumentDao documentDao;
	protected SecurityDao securityDao;
	protected UserDao userDao;
	protected GroupDao groupDao;
	protected LogDao logDao;
	protected OperationDao operationDao;
	protected DepartmentDao departmentDao;
	protected RoleDao roleDao;
	protected PrivilegeDao privilegeDao;
	protected RootDao rootDao;
	protected VersionDao versionDao;
	protected UserService userService;

	public BaseManager(Map<String, ? extends BaseDao<T, PK>> daos) {
		this.daos = daos;
	}

	public BaseManager(Class<? extends T> clazz) {
		this.clazz = clazz;
	}

	protected BaseDao<T, PK> getDao() {
		String key = clazz.getName();
		int index = key.lastIndexOf(".");
		return daos.get(key.substring(index + 1, key.length()));
	}

	public T get(PK id) {
		return getDao().get(id);
	}

	public T save(T object) {
		return getDao().save(object);
	}

	public boolean exist(PK id) {
		return getDao().exists(id);
	}

	public void remove(PK id) {
		getDao().remove(id);
	}

	public void remove(T object) {
		getDao().remove(object);
	}

	public List<T> getAll() {
		return getDao().getAllDistinct();
	}

	public Page<T> getPage(Integer pageNo, Integer pageSize) {
		return getDao()
				.getPageByParameters(pageNo, pageSize, null, null, false);
	}

	public void setDaos(Map<String, ? extends BaseDao<T, PK>> daos) {
		this.daos = daos;
	}

	public void setDocumentDao(DocumentDao documentDao) {
		this.documentDao = documentDao;
	}

	public void setSecurityDao(SecurityDao securityDao) {
		this.securityDao = securityDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void setGroupDao(GroupDao groupDao) {
		this.groupDao = groupDao;
	}

	public void setLogDao(LogDao logDao) {
		this.logDao = logDao;
	}

	public void setOperationDao(OperationDao operationDao) {
		this.operationDao = operationDao;
	}

	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}

	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}

	public void setPrivilegeDao(PrivilegeDao privilegeDao) {
		this.privilegeDao = privilegeDao;
	}

	public void setRootDao(RootDao rootDao) {
		this.rootDao = rootDao;
	}

	public void setVersionDao(VersionDao versionDao) {
		this.versionDao = versionDao;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
