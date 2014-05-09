package name.xuyuanxiang.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import name.xuyuanxiang.model.Security;

@Transactional
public class SecurityManager extends BaseManager<Security, String> {

	public SecurityManager() {
		super(Security.class);
	}

	public Security getByDocumentAndGroup(String docId, String groupId) {
		String hql = "from Security where document.id = ? and group.id = ?";
		List<Object> parameters = new ArrayList<Object>();
		parameters.add(docId);
		parameters.add(groupId);
		return securityDao.getFirstResult(hql, parameters);
	}

}
