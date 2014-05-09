package name.xuyuanxiang.controller;

import java.util.List;

import name.xuyuanxiang.model.Document;
import name.xuyuanxiang.model.Group;
import name.xuyuanxiang.model.Operation;
import name.xuyuanxiang.model.Security;
import name.xuyuanxiang.model.User;
import name.xuyuanxiang.service.DocumentManager;
import name.xuyuanxiang.service.OperationManager;
import name.xuyuanxiang.service.UserManager;
import name.xuyuanxiang.service.SecurityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.stereotype.Controller;

@Controller
@RemotingDestination
public class OperationController {

	@Autowired
	private OperationManager operationManager;

	@Autowired
	private DocumentManager documentManager;

	@Autowired
	private UserManager userManager;

	@Autowired
	private SecurityManager securityManager;

	public Operation save(Operation operation) {
		return operationManager.save(operation);
	}
	
	public List<Operation> getAll(){
		return operationManager.getAll();
	}

	public boolean hasOperation(String docId, String userId,
			String operationName) {
		Operation operation = operationManager.getByName(operationName);
		if (operation == null)
			return false;
		Document document = documentManager.get(docId);
		if (document == null)
			return false;
		User user = userManager.get(userId);
		if (user == null)
			return false;
		if (document.getOwner() != null
				&& user.getId().equals(document.getOwner().getId())) {
			return true;
		}
		Security security = null;
		for (Group group : user.getGroups()) {
			security = securityManager.getByDocumentAndGroup(document.getId(),
					group.getId());
			if (security == null)
				return false;
			for (Operation tmp : security.getOperations()) {
				if (operation.getId().equals(tmp.getId()))
					return true;
			}
		}
		return false;
	}

	public void setOperationManager(OperationManager operationManager) {
		this.operationManager = operationManager;
	}

	public void setDocumentManager(DocumentManager documentManager) {
		this.documentManager = documentManager;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public void setSecurityManager(SecurityManager securityManager) {
		this.securityManager = securityManager;
	}

}
