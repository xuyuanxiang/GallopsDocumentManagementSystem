package cn.myapps.webservice.client;

public class DomainServiceProxy implements cn.myapps.webservice.client.DomainService {
  private String _endpoint = null;
  private cn.myapps.webservice.client.DomainService domainService = null;
  
  public DomainServiceProxy() {
    _initDomainServiceProxy();
  }
  
  public DomainServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initDomainServiceProxy();
  }
  
  private void _initDomainServiceProxy() {
    try {
      domainService = (new cn.myapps.webservice.client.DomainServiceServiceLocator()).getDomainService();
      if (domainService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)domainService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)domainService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (domainService != null)
      ((javax.xml.rpc.Stub)domainService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cn.myapps.webservice.client.DomainService getDomainService() {
    if (domainService == null)
      _initDomainServiceProxy();
    return domainService;
  }
  
  public cn.myapps.webservice.model.SimpleDomain searchDomainByName(java.lang.String name) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DomainServiceFault{
    if (domainService == null)
      _initDomainServiceProxy();
    return domainService.searchDomainByName(name);
  }
  
  public java.lang.Object[] searchDomainsByDomainAdmin(java.lang.String domainAdminId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DomainServiceFault{
    if (domainService == null)
      _initDomainServiceProxy();
    return domainService.searchDomainsByDomainAdmin(domainAdminId);
  }
  
  
}