package name.xuyuanxiang.dao;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Query;

import name.xuyuanxiang.model.Document;

public class DocumentDao extends BaseDao<Document, String> {

	public DocumentDao() {
		super(Document.class);
	}

	public boolean existName(String rootId, String parentId, String name) {
		String hql = "select count(*) from Document where alias = ? and root.id = ? and enabled = ? and destoried = ?";
		Query query = null;
		if (StringUtils.isNotEmpty(parentId)) {
			hql += " and parent.id = ?";
			query = getSession().createQuery(hql);
			query.setParameter(0, name);
			query.setParameter(1, rootId);
			query.setParameter(2, true);
			query.setParameter(3, false);
			query.setParameter(4, parentId);
		} else {
			hql += " and parent.id is null";
			query = getSession().createQuery(hql);
			query.setParameter(0, name);
			query.setParameter(1, rootId);
			query.setParameter(2, true);
			query.setParameter(3, false);
		}
		return (Long) query.list().get(0) > 0;
	}

}
