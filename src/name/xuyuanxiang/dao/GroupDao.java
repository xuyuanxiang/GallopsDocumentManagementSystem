package name.xuyuanxiang.dao;

import org.hibernate.Query;

import name.xuyuanxiang.model.Group;

public class GroupDao extends BaseDao<Group, String> {

	public GroupDao() {
		super(Group.class);
	}

	public boolean existName(String name) {
		Query query = getSession().createQuery(
				"select count(*) from Group where name = ?");
		query.setParameter(0, name);
		return (Long) query.list().get(0) > 0;
	}

}
