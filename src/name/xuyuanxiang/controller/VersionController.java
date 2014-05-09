package name.xuyuanxiang.controller;

import name.xuyuanxiang.common.Page;
import name.xuyuanxiang.model.Version;
import name.xuyuanxiang.service.VersionManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.stereotype.Controller;

@Controller
@RemotingDestination
public class VersionController {
	@Autowired
	private VersionManager versionManager;

	public Page<Version> getVersionsByDocument(String docId, Integer pageNo,
			Integer pageSize) {
		Page<Version> page = versionManager.getVersionsByDocument(docId,
				pageNo, pageSize);
		return page;
	}

	public Version enableVersion(String docId, String versionId) {
		Version old = versionManager.getCurrVersionByDocument(docId);
		if (old != null) {
			old.setEnabled(false);
			versionManager.save(old);
		}
		Version version = versionManager.get(versionId);
		version.setEnabled(true);
		return versionManager.save(version);
	}

	public void setVersionManager(VersionManager versionManager) {
		this.versionManager = versionManager;
	}

}
