package name.xuyuanxiang.controller;

import java.util.Date;

import name.xuyuanxiang.common.Page;
import name.xuyuanxiang.model.Document;
import name.xuyuanxiang.model.Log;
import name.xuyuanxiang.model.User;
import name.xuyuanxiang.service.DocumentManager;
import name.xuyuanxiang.service.LogManager;
import name.xuyuanxiang.service.UserManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.stereotype.Controller;

@Controller
@RemotingDestination
public class LogController {

	@Autowired
	private LogManager logManager;

	@Autowired
	private UserManager userManager;

	@Autowired
	private DocumentManager documentManager;

	public Log save(Log log) {
		return logManager.save(log);
	}

	public Log addLog(String userId, String documentId, String details) {
		Document document = documentManager.get(documentId);
		if (document == null)
			return null;
		User user = userManager.get(userId);
		if (user == null)
			return null;
		Log log = new Log();
		log.setUser(user);
		log.setDocument(document);
		log.setCreated(new Date());
		log.setDetails(details);
		return save(log);
	}

	public Page<Log> getLogsByDocument(String docId, Integer pageNo,
			Integer pageSize) {
		return logManager.getLogsByDocument(docId, pageNo, pageSize);
	}

	public void setLogManager(LogManager logManager) {
		this.logManager = logManager;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public void setDocumentManager(DocumentManager documentManager) {
		this.documentManager = documentManager;
	}

}
