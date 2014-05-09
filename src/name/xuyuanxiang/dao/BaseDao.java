package name.xuyuanxiang.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import name.xuyuanxiang.common.Page;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class BaseDao<T, PK extends Serializable> {

	private SessionFactory sessionFactory;
	private Class<T> persistentClass;

	public BaseDao(final Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}

	@SuppressWarnings("unchecked")
	public T get(PK id) {
		Session sess = getSession();
		T entity = (T) sess.get(persistentClass, id);
		return entity;
	}

	@SuppressWarnings("unchecked")
	public T save(T object) {
		Session sess = getSession();
		return (T) sess.merge(object);
	}

	@SuppressWarnings("unchecked")
	public boolean exists(PK id) {
		Session sess = getSession();
		T entity = (T) sess.get(persistentClass, id);
		return entity != null;
	}

	@SuppressWarnings("unchecked")
	public void remove(PK id) {
		Session sess = getSession();
		T entity = (T) sess.get(persistentClass, id);
		sess.delete(entity);
	}

	public void remove(T object) {
		Session sess = getSession();
		sess.delete(object);
	}

	@SuppressWarnings("unchecked")
	public List<T> getAll() {
		Session sess = getSession();
		return sess.createCriteria(persistentClass).list();
	}

	public List<T> getAllDistinct() {
		Collection<T> result = new LinkedHashSet<T>(getAll());
		return new ArrayList<T>(result);
	}

	@SuppressWarnings("unchecked")
	public List<T> findByNamedQuery(String queryName,
			Map<String, Object> queryParams) {
		Session sess = getSession();
		Query namedQuery = sess.getNamedQuery(queryName);
		if (queryParams != null) {
			for (String s : queryParams.keySet()) {
				namedQuery.setParameter(s, queryParams.get(s));
			}
		}
		return namedQuery.list();
	}

	@SuppressWarnings("unchecked")
	public Page<T> getPageByParameters(int pageNo, int pageSize,
			Map<String, Object> parameters, String orderByFieldName,
			boolean isAsc) {
		if (pageNo == 0)
			pageNo = 1;
		if (pageSize == 0)
			pageSize = 15;
		Criteria criteria = this.getSession().createCriteria(persistentClass);
		if (parameters != null) {
			Set<String> keys = parameters.keySet();
			for (String key : keys) {
				criteria.add(Restrictions.like(key, parameters.get(key)));
			}
		}
		long rowCount = (Long) criteria.setProjection(Projections.rowCount())
				.uniqueResult();
		criteria.setProjection(null);
		criteria.setFirstResult((pageNo - 1) * pageSize);
		criteria.setMaxResults(pageSize);
		if (StringUtils.isNotEmpty(orderByFieldName)) {
			if (isAsc) {
				criteria.addOrder(Order.asc(orderByFieldName));
			} else {
				criteria.addOrder(Order.desc(orderByFieldName));
			}
		}
		Collection<T> result = new LinkedHashSet<T>(criteria.list());
		return new Page<T>(pageNo, pageSize, rowCount, new ArrayList<T>(result));
	}

	@SuppressWarnings("unchecked")
	public Page<T> getPageByHQL(String hql, List<Object> parameters,
			int pageNo, int pageSize) {
		if (pageNo == 0)
			pageNo = 1;
		if (pageSize == 0)
			pageSize = 15;
		Query count = getSession().createQuery("select count(*) " + hql);
		Query query = getSession().createQuery(hql);
		if (parameters != null) {
			for (int i = 0; i < parameters.size(); i++) {
				count.setParameter(i, parameters.get(i));
				query.setParameter(i, parameters.get(i));
			}
		}
		Long rowCount = (Long) count.list().get(0);
		query.setFirstResult((pageNo - 1) * pageSize);
		query.setMaxResults(pageSize);
		Collection<T> result = new LinkedHashSet<T>(query.list());
		return new Page<T>(pageNo, pageSize, rowCount, new ArrayList<T>(result));
	}

	@SuppressWarnings("unchecked")
	public T getFirstResult(String hql, List<Object> parameters) {
		Query query = getSession().createQuery(hql);
		if (parameters != null) {
			for (int i = 0; i < parameters.size(); i++) {
				query.setParameter(i, parameters.get(i));
			}
		}
		List<T> list = query.list();
		if (list != null && !list.isEmpty())
			return list.get(0);
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<T> findByHQL(String hql, List<Object> parameters) {
		Query query = getSession().createQuery(hql);
		if (parameters != null) {
			for (int i = 0; i < parameters.size(); i++) {
				query.setParameter(i, parameters.get(i));
			}
		}
		return query.list();
	}

	public int updateByHQL(String hql, List<Object> parameters) {
		Query query = getSession().createQuery(hql);
		if (parameters != null) {
			for (int i = 0; i < parameters.size(); i++) {
				query.setParameter(i, parameters.get(i));
			}
		}
		return query.executeUpdate();
	}

	public Session getSession() {
		Session session = getSessionFactory().getCurrentSession();
		if (session == null)
			session = getSessionFactory().openSession();
		return session;
	}

	public void closeSession() {
		getSessionFactory().close();
	}

	public SessionFactory getSessionFactory() {
		return this.sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
