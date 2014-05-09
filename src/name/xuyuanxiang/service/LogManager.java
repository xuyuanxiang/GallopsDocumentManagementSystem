package name.xuyuanxiang.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import name.xuyuanxiang.common.Page;
import name.xuyuanxiang.model.Log;

@Transactional
public class LogManager extends BaseManager<Log, String> {

	public LogManager() {
		super(Log.class);
	}

	public Page<Log> getLogsByDocument(String docId, Integer pageNo,
			Integer pageSize) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("document.id", docId);
		return logDao.getPageByParameters(pageNo, pageSize, parameters,
				"created", false);
	}

}
