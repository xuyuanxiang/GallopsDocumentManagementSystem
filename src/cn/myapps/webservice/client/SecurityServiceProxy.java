package cn.myapps.webservice.client;

public class SecurityServiceProxy implements cn.myapps.webservice.client.SecurityService {
  private String _endpoint = null;
  private cn.myapps.webservice.client.SecurityService securityService = null;
  
  public SecurityServiceProxy() {
    _initSecurityServiceProxy();
  }
  
  public SecurityServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initSecurityServiceProxy();
  }
  
  private void _initSecurityServiceProxy() {
    try {
      securityService = (new cn.myapps.webservice.client.SecurityServiceServiceLocator()).getSecurityService();
      if (securityService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)securityService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)securityService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (securityService != null)
      ((javax.xml.rpc.Stub)securityService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cn.myapps.webservice.client.SecurityService getSecurityService() {
    if (securityService == null)
      _initSecurityServiceProxy();
    return securityService;
  }
  
  public cn.myapps.webservice.model.SimpleUser validateUser(java.lang.String domainName, java.lang.String userAccount, java.lang.String userPassword, int userType) throws java.rmi.RemoteException, cn.myapps.webservice.fault.SecurityServiceFault{
    if (securityService == null)
      _initSecurityServiceProxy();
    return securityService.validateUser(domainName, userAccount, userPassword, userType);
  }
  
  public int doChangePassword(java.lang.String domainName, java.lang.String userAccount, java.lang.String oldPassword, java.lang.String newPassword) throws java.rmi.RemoteException, cn.myapps.webservice.fault.SecurityServiceFault{
    if (securityService == null)
      _initSecurityServiceProxy();
    return securityService.doChangePassword(domainName, userAccount, oldPassword, newPassword);
  }
  
  public int activateUser(java.lang.String adminAccount, java.lang.String adminPw, java.lang.String userId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.SecurityServiceFault{
    if (securityService == null)
      _initSecurityServiceProxy();
    return securityService.activateUser(adminAccount, adminPw, userId);
  }
  
  public int inactiveUser(java.lang.String adminAccount, java.lang.String adminPw, java.lang.String userId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.SecurityServiceFault{
    if (securityService == null)
      _initSecurityServiceProxy();
    return securityService.inactiveUser(adminAccount, adminPw, userId);
  }
  
  
}