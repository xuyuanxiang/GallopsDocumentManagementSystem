package name.xuyuanxiang.service;

import java.util.ArrayList;
import java.util.List;

import name.xuyuanxiang.common.Page;
import name.xuyuanxiang.model.Version;

public class VersionManager extends BaseManager<Version, String> {

	public VersionManager() {
		super(Version.class);
	}

	public Page<Version> getVersionsByDocument(String docId, Integer pageNo,
			Integer pageSize) {
		return versionDao.getPageByDocument(docId, pageNo, pageSize);
	}

	public Version getCurrVersionByDocument(String docId) {
		String hql = "from Version where enabled = ? and document.id = ?";
		List<Object> parameters = new ArrayList<Object>();
		parameters.add(true);
		parameters.add(docId);
		return versionDao.getFirstResult(hql, parameters);
	}

}
