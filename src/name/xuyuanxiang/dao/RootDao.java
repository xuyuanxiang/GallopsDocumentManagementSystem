package name.xuyuanxiang.dao;

import java.util.List;

import org.hibernate.Query;

import name.xuyuanxiang.model.Root;

public class RootDao extends BaseDao<Root, String> {

	public RootDao() {
		super(Root.class);
	}

	@SuppressWarnings("unchecked")
	public Root getByName(String name) {
		Query query = getSession().createQuery(
				"from Root where name = ?");
		query.setParameter(0, name);
		List<Root> list = query.list();
		if(list != null && !list.isEmpty())
			return list.get(0);
		return null;
	}

	@SuppressWarnings("unchecked")
	public Root getByPath(String path) {
		Query query = getSession().createQuery(
				"from Root where absolutePath = ?");
		query.setParameter(0, path);
		List<Root> list = query.list();
		if(list != null && !list.isEmpty())
			return list.get(0);
		return null;
	}
}
