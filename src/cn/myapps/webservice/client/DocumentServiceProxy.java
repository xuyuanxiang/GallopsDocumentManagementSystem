package cn.myapps.webservice.client;

public class DocumentServiceProxy implements cn.myapps.webservice.client.DocumentService {
  private String _endpoint = null;
  private cn.myapps.webservice.client.DocumentService documentService = null;
  
  public DocumentServiceProxy() {
    _initDocumentServiceProxy();
  }
  
  public DocumentServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initDocumentServiceProxy();
  }
  
  private void _initDocumentServiceProxy() {
    try {
      documentService = (new cn.myapps.webservice.client.DocumentServiceServiceLocator()).getDocumentService();
      if (documentService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)documentService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)documentService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (documentService != null)
      ((javax.xml.rpc.Stub)documentService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cn.myapps.webservice.client.DocumentService getDocumentService() {
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService;
  }
  
  public int removeDocument(java.lang.String documentId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.removeDocument(documentId, applicationId);
  }
  
  public int createDocumentByGuest(java.lang.String formName, java.util.HashMap parameters, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.createDocumentByGuest(formName, parameters, applicationId);
  }
  
  public int createDocumentByGuest(java.lang.String formName, java.lang.String parameters, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.createDocumentByGuest(formName, parameters, applicationId);
  }
  
  public int createDocumentAndStartFlowByDomainUser(java.lang.String formName, java.util.HashMap parameters, java.lang.String domainUserId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.createDocumentAndStartFlowByDomainUser(formName, parameters, domainUserId, applicationId);
  }
  
  public int createDocumentAndStartFlowByDomainUser(java.lang.String formName, java.lang.String parameters, java.lang.String domainUserId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.createDocumentAndStartFlowByDomainUser(formName, parameters, domainUserId, applicationId);
  }
  
  public java.lang.String searchSimpleDocumentByFilterFormat2XML(java.lang.String formName, java.util.HashMap parameters, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchSimpleDocumentByFilterFormat2XML(formName, parameters, applicationId, domainUserId);
  }
  
  public java.lang.String searchSimpleDocumentByFilterFormat2XML(java.lang.String formName, java.lang.String parameters, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchSimpleDocumentByFilterFormat2XML(formName, parameters, applicationId, domainUserId);
  }
  
  public java.lang.String searchDocumentsByFilterFormat2Json(java.lang.String formName, java.util.HashMap parameters, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchDocumentsByFilterFormat2Json(formName, parameters, applicationId);
  }
  
  public java.lang.String searchDocumentsByFilterFormat2Json(java.lang.String formName, java.util.HashMap parameters, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchDocumentsByFilterFormat2Json(formName, parameters, applicationId, domainUserId);
  }
  
  public java.lang.String searchDocumentsByFilterFormat2Json(java.lang.String formName, java.lang.String parameters, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchDocumentsByFilterFormat2Json(formName, parameters, applicationId);
  }
  
  public java.lang.String searchDocumentsByFilterFormat2Json(java.lang.String formName, java.lang.String parameters, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchDocumentsByFilterFormat2Json(formName, parameters, applicationId, domainUserId);
  }
  
  public java.lang.String searchSimpleDocumentByFilterFormat2Json(java.lang.String formName, java.util.HashMap parameters, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchSimpleDocumentByFilterFormat2Json(formName, parameters, applicationId, domainUserId);
  }
  
  public java.lang.String searchSimpleDocumentByFilterFormat2Json(java.lang.String formName, java.lang.String parameters, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchSimpleDocumentByFilterFormat2Json(formName, parameters, applicationId, domainUserId);
  }
  
  public java.lang.Object[] searchDocumentsBySQL(java.lang.String sql, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchDocumentsBySQL(sql, applicationId, domainUserId);
  }
  
  public java.lang.Object[] searchDocumentsBySQL(java.lang.String sql, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchDocumentsBySQL(sql, applicationId);
  }
  
  public cn.myapps.webservice.model.SimpleDocument searchDocumentBySQL(java.lang.String sql, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchDocumentBySQL(sql, applicationId, domainUserId);
  }
  
  public java.lang.String searchDocumentsBySQLFormat2XML(java.lang.String sql, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchDocumentsBySQLFormat2XML(sql, applicationId, domainUserId);
  }
  
  public java.lang.String searchDocumentsBySQLFormat2XML(java.lang.String sql, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchDocumentsBySQLFormat2XML(sql, applicationId);
  }
  
  public java.lang.String searchSimpleDocumentBySQLFormat2XML(java.lang.String sql, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchSimpleDocumentBySQLFormat2XML(sql, applicationId, domainUserId);
  }
  
  public java.lang.String searchDocumentsBySQLFormat2Json(java.lang.String sql, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchDocumentsBySQLFormat2Json(sql, applicationId, domainUserId);
  }
  
  public java.lang.String searchDocumentsBySQLFormat2Json(java.lang.String sql, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchDocumentsBySQLFormat2Json(sql, applicationId);
  }
  
  public java.lang.String searchSimpleDocumentBySQLFormat2Json(java.lang.String sql, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchSimpleDocumentBySQLFormat2Json(sql, applicationId, domainUserId);
  }
  
  public java.lang.Object[] searchDocumentsByDQL(java.lang.String dql, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchDocumentsByDQL(dql, applicationId, domainUserId);
  }
  
  public java.lang.Object[] searchDocumentsByDQL(java.lang.String dql, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchDocumentsByDQL(dql, applicationId);
  }
  
  public cn.myapps.webservice.model.SimpleDocument searchDocumentByDQL(java.lang.String dql, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchDocumentByDQL(dql, applicationId, domainUserId);
  }
  
  public java.lang.String searchDocumentsByDQLFormat2XML(java.lang.String dql, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchDocumentsByDQLFormat2XML(dql, applicationId);
  }
  
  public java.lang.String searchDocumentsByDQLFormat2XML(java.lang.String dql, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchDocumentsByDQLFormat2XML(dql, applicationId, domainUserId);
  }
  
  public java.lang.String searchSimpleDocumentByDQLFormat2XML(java.lang.String dql, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchSimpleDocumentByDQLFormat2XML(dql, applicationId, domainUserId);
  }
  
  public java.lang.String searchDocumentsByDQLFormat2Json(java.lang.String dql, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchDocumentsByDQLFormat2Json(dql, applicationId);
  }
  
  public java.lang.String searchDocumentsByDQLFormat2Json(java.lang.String dql, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchDocumentsByDQLFormat2Json(dql, applicationId, domainUserId);
  }
  
  public java.lang.String searchSimpleDocumentByDQLFormat2Json(java.lang.String dql, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchSimpleDocumentByDQLFormat2Json(dql, applicationId, domainUserId);
  }
  
  public cn.myapps.webservice.model.SimpleDocument searchDocumentByFilter(java.lang.String formName, java.util.HashMap parameters, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchDocumentByFilter(formName, parameters, applicationId, domainUserId);
  }
  
  public cn.myapps.webservice.model.SimpleDocument searchDocumentByFilter(java.lang.String formName, java.lang.String parameters, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchDocumentByFilter(formName, parameters, applicationId, domainUserId);
  }
  
  public java.lang.String searchDocumentsByFilterFormat2XML(java.lang.String formName, java.lang.String parameters, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchDocumentsByFilterFormat2XML(formName, parameters, applicationId, domainUserId);
  }
  
  public java.lang.String searchDocumentsByFilterFormat2XML(java.lang.String formName, java.util.HashMap parameters, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchDocumentsByFilterFormat2XML(formName, parameters, applicationId);
  }
  
  public java.lang.String searchDocumentsByFilterFormat2XML(java.lang.String formName, java.lang.String parameters, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchDocumentsByFilterFormat2XML(formName, parameters, applicationId);
  }
  
  public java.lang.String searchDocumentsByFilterFormat2XML(java.lang.String formName, java.util.HashMap parameters, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchDocumentsByFilterFormat2XML(formName, parameters, applicationId, domainUserId);
  }
  
  public int removeDocumentByUser(java.lang.String documentId, java.lang.String applicationId, java.lang.String userId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.removeDocumentByUser(documentId, applicationId, userId);
  }
  
  public java.lang.Object[] searchDocumentsByFilter(java.lang.String formName, java.lang.String parameters, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchDocumentsByFilter(formName, parameters, applicationId, domainUserId);
  }
  
  public java.lang.Object[] searchDocumentsByFilter(java.lang.String formName, java.util.HashMap parameters, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchDocumentsByFilter(formName, parameters, applicationId);
  }
  
  public java.lang.Object[] searchDocumentsByFilter(java.lang.String formName, java.util.HashMap parameters, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchDocumentsByFilter(formName, parameters, applicationId, domainUserId);
  }
  
  public java.lang.Object[] searchDocumentsByFilter(java.lang.String formName, java.lang.String parameters, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.searchDocumentsByFilter(formName, parameters, applicationId);
  }
  
  public int updateDocumentByGuest(java.lang.String documentId, java.lang.String parameters, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.updateDocumentByGuest(documentId, parameters, applicationId);
  }
  
  public int updateDocumentByGuest(java.lang.String documentId, java.util.HashMap parameters, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.updateDocumentByGuest(documentId, parameters, applicationId);
  }
  
  public int createDocumentByDomainUser(java.lang.String formName, java.lang.String parameters, java.lang.String domainUserId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.createDocumentByDomainUser(formName, parameters, domainUserId, applicationId);
  }
  
  public int createDocumentByDomainUser(java.lang.String formName, java.util.HashMap parameters, java.lang.String domainUserId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.createDocumentByDomainUser(formName, parameters, domainUserId, applicationId);
  }
  
  public int updateDocumentByDomainUser(java.lang.String documentId, java.util.HashMap parameters, java.lang.String domainUserId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.updateDocumentByDomainUser(documentId, parameters, domainUserId, applicationId);
  }
  
  public int updateDocumentByDomainUser(java.lang.String documentId, java.lang.String parameters, java.lang.String domainUserId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault{
    if (documentService == null)
      _initDocumentServiceProxy();
    return documentService.updateDocumentByDomainUser(documentId, parameters, domainUserId, applicationId);
  }
  
  public void main(java.lang.String[] args) throws java.rmi.RemoteException{
    if (documentService == null)
      _initDocumentServiceProxy();
    documentService.main(args);
  }
  
  
}