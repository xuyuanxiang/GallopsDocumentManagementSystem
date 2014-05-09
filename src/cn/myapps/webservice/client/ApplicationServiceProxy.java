package cn.myapps.webservice.client;

public class ApplicationServiceProxy implements cn.myapps.webservice.client.ApplicationService {
  private String _endpoint = null;
  private cn.myapps.webservice.client.ApplicationService applicationService = null;
  
  public ApplicationServiceProxy() {
    _initApplicationServiceProxy();
  }
  
  public ApplicationServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initApplicationServiceProxy();
  }
  
  private void _initApplicationServiceProxy() {
    try {
      applicationService = (new cn.myapps.webservice.client.ApplicationServiceServiceLocator()).getApplicationService();
      if (applicationService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)applicationService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)applicationService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (applicationService != null)
      ((javax.xml.rpc.Stub)applicationService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cn.myapps.webservice.client.ApplicationService getApplicationService() {
    if (applicationService == null)
      _initApplicationServiceProxy();
    return applicationService;
  }
  
  public java.lang.Object[] searchApplicationsByName(java.lang.String name) throws java.rmi.RemoteException, cn.myapps.webservice.fault.ApplicationServiceFault{
    if (applicationService == null)
      _initApplicationServiceProxy();
    return applicationService.searchApplicationsByName(name);
  }
  
  public java.lang.Object[] searchApplicationsByDomainAdmin(java.lang.String domainAdminId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.ApplicationServiceFault{
    if (applicationService == null)
      _initApplicationServiceProxy();
    return applicationService.searchApplicationsByDomainAdmin(domainAdminId);
  }
  
  public boolean addApplication(java.lang.String userAccount, java.lang.String domainName, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.ApplicationServiceFault{
    if (applicationService == null)
      _initApplicationServiceProxy();
    return applicationService.addApplication(userAccount, domainName, applicationId);
  }
  
  public java.lang.Object[] searchApplicationsByFilter(java.lang.String parameters) throws java.rmi.RemoteException, cn.myapps.webservice.fault.ApplicationServiceFault{
    if (applicationService == null)
      _initApplicationServiceProxy();
    return applicationService.searchApplicationsByFilter(parameters);
  }
  
  public java.lang.Object[] searchApplicationsByFilter(java.util.HashMap parameters) throws java.rmi.RemoteException, cn.myapps.webservice.fault.ApplicationServiceFault{
    if (applicationService == null)
      _initApplicationServiceProxy();
    return applicationService.searchApplicationsByFilter(parameters);
  }
  
  public cn.myapps.webservice.model.SimpleApplication searchApplicationByName(java.lang.String name) throws java.rmi.RemoteException, cn.myapps.webservice.fault.ApplicationServiceFault{
    if (applicationService == null)
      _initApplicationServiceProxy();
    return applicationService.searchApplicationByName(name);
  }
  
  public java.lang.Object[] searchApplicationsByDomain(java.lang.String domainId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.ApplicationServiceFault{
    if (applicationService == null)
      _initApplicationServiceProxy();
    return applicationService.searchApplicationsByDomain(domainId);
  }
  
  public java.lang.Object[] searchApplicationsByDeveloper(java.lang.String developerId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.ApplicationServiceFault{
    if (applicationService == null)
      _initApplicationServiceProxy();
    return applicationService.searchApplicationsByDeveloper(developerId);
  }
  
  public void main(java.lang.String[] args) throws java.rmi.RemoteException, cn.myapps.webservice.fault.ApplicationServiceFault{
    if (applicationService == null)
      _initApplicationServiceProxy();
    applicationService.main(args);
  }
  
  
}