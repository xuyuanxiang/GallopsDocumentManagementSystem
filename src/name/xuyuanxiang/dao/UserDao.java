package name.xuyuanxiang.dao;

import java.util.List;

import org.hibernate.Query;

import name.xuyuanxiang.model.User;

public class UserDao extends BaseDao<User, String> {

	public UserDao() {
		super(User.class);
	}

	@SuppressWarnings("unchecked")
	public User getByUsername(String username) {
		Query query = getSession().createQuery("from User where username = ?");
		query.setParameter(0, username);
		List<User> list = query.list();
		if (list != null && !list.isEmpty())
			return list.get(0);
		return null;
	}

}
