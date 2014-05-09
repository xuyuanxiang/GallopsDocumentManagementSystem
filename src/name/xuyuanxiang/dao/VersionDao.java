package name.xuyuanxiang.dao;

import java.util.HashMap;
import java.util.Map;

import name.xuyuanxiang.common.Page;
import name.xuyuanxiang.model.Version;

public class VersionDao extends BaseDao<Version, String> {

	public VersionDao() {
		super(Version.class);
	}

	public Page<Version> getPageByDocument(String docId, Integer pageNo,
			Integer pageSize) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("document.id", docId);
		return getPageByParameters(pageNo, pageSize, parameters, "created",
				false);
	}

}
