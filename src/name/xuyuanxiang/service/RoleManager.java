package name.xuyuanxiang.service;

import org.springframework.transaction.annotation.Transactional;

import name.xuyuanxiang.model.Role;

@Transactional
public class RoleManager extends BaseManager<Role, String> {

	public RoleManager() {
		super(Role.class);
	}

}
