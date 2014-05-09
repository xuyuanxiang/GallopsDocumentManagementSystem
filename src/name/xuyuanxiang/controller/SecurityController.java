package name.xuyuanxiang.controller;

import java.util.HashSet;
import java.util.Set;

import name.xuyuanxiang.model.Document;
import name.xuyuanxiang.model.Group;
import name.xuyuanxiang.model.Operation;
import name.xuyuanxiang.model.Security;
import name.xuyuanxiang.service.DocumentManager;
import name.xuyuanxiang.service.GroupManager;
import name.xuyuanxiang.service.OperationManager;
import name.xuyuanxiang.service.SecurityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.stereotype.Controller;

import flex.messaging.io.ArrayCollection;

@Controller
@RemotingDestination
public class SecurityController {

	@Autowired
	private SecurityManager securityManager;

	@Autowired
	private DocumentManager documentManager;

	@Autowired
	private GroupManager groupManager;

	@Autowired
	private OperationManager operationManager;

	public Security getByDocumentAndGroup(String docId, String groupId) {
		return securityManager.getByDocumentAndGroup(docId, groupId);
	}

	public Security create(String documentId, String groupId,
			ArrayCollection operationIds) {
		Document document = documentManager.get(documentId);
		if (document == null)
			return null;
		Group group = groupManager.get(groupId);
		if (group == null)
			return null;
		Operation operation = null;
		Set<Operation> operations = new HashSet<Operation>();
		for (Object obj : operationIds) {
			operation = operationManager.get(obj + "");
			if (operation != null)
				operations.add(operation);
		}
		Security security = new Security();
		security.setDocument(document);
		security.setGroup(group);
		security.setOperations(operations);
		return save(security);
	}

	public Security addOperations(String securityId,
			ArrayCollection operationIds) {
		Security security = securityManager.get(securityId);
		if (security != null) {
			Operation operation = null;
			Set<Operation> operations = new HashSet<Operation>();
			for (Object obj : operationIds) {
				operation = operationManager.get(obj + "");
				if (operation != null)
					operations.add(operation);
			}
			security.setOperations(operations);
			return save(security);
		}
		return null;
	}

	public Security removeOperation(String securityId, String operationId) {
		Security security = securityManager.get(securityId);
		if (security != null) {
			security.removeOperation(operationId);
			return save(security);
		}
		return null;
	}

	public Security save(Security security) {
		return securityManager.save(security);
	}

	public void setSecurityManager(SecurityManager securityManager) {
		this.securityManager = securityManager;
	}

	public void setDocumentManager(DocumentManager documentManager) {
		this.documentManager = documentManager;
	}

	public void setGroupManager(GroupManager groupManager) {
		this.groupManager = groupManager;
	}

	public void setOperationManager(OperationManager operationManager) {
		this.operationManager = operationManager;
	}

}
