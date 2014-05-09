package cn.myapps.webservice.client;

public class UserServiceProxy implements cn.myapps.webservice.client.UserService {
  private String _endpoint = null;
  private cn.myapps.webservice.client.UserService userService = null;
  
  public UserServiceProxy() {
    _initUserServiceProxy();
  }
  
  public UserServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initUserServiceProxy();
  }
  
  private void _initUserServiceProxy() {
    try {
      userService = (new cn.myapps.webservice.client.UserServiceServiceLocator()).getUserService();
      if (userService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)userService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)userService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (userService != null)
      ((javax.xml.rpc.Stub)userService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cn.myapps.webservice.client.UserService getUserService() {
    if (userService == null)
      _initUserServiceProxy();
    return userService;
  }
  
  public java.lang.Object[] getUsersByRoleId(java.lang.String roleId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault{
    if (userService == null)
      _initUserServiceProxy();
    return userService.getUsersByRoleId(roleId);
  }
  
  public int removeDepartment(java.lang.String userId, java.lang.String depId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault{
    if (userService == null)
      _initUserServiceProxy();
    return userService.removeDepartment(userId, depId);
  }
  
  public cn.myapps.webservice.model.SimpleUser validateUser(java.lang.String domainName, java.lang.String userAccount, java.lang.String userPassword, int userType) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault{
    if (userService == null)
      _initUserServiceProxy();
    return userService.validateUser(domainName, userAccount, userPassword, userType);
  }
  
  public cn.myapps.webservice.model.SimpleUser getUser(java.lang.String pk) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault{
    if (userService == null)
      _initUserServiceProxy();
    return userService.getUser(pk);
  }
  
  public int setDefaultDepartment(java.lang.String userId, java.lang.String depId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault{
    if (userService == null)
      _initUserServiceProxy();
    return userService.setDefaultDepartment(userId, depId);
  }
  
  public cn.myapps.webservice.model.SimpleAdmin getAdmin(java.lang.String id) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault{
    if (userService == null)
      _initUserServiceProxy();
    return userService.getAdmin(id);
  }
  
  public int updateAdmin(cn.myapps.webservice.model.SimpleAdmin admin) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault{
    if (userService == null)
      _initUserServiceProxy();
    return userService.updateAdmin(admin);
  }
  
  public int createAdmin(cn.myapps.webservice.model.SimpleAdmin admin) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault{
    if (userService == null)
      _initUserServiceProxy();
    return userService.createAdmin(admin);
  }
  
  public int changePassword(java.lang.String id, java.lang.String password) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault{
    if (userService == null)
      _initUserServiceProxy();
    return userService.changePassword(id, password);
  }
  
  public int createUserFromJson(java.lang.String jsonStr) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault{
    if (userService == null)
      _initUserServiceProxy();
    return userService.createUserFromJson(jsonStr);
  }
  
  public int createUserFromXML(java.lang.String xmlStr) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault{
    if (userService == null)
      _initUserServiceProxy();
    return userService.createUserFromXML(xmlStr);
  }
  
  public int updateUserFromJson(java.lang.String jsonStr) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault{
    if (userService == null)
      _initUserServiceProxy();
    return userService.updateUserFromJson(jsonStr);
  }
  
  public int updateUserFromXML(java.lang.String xmlStr) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault{
    if (userService == null)
      _initUserServiceProxy();
    return userService.updateUserFromXML(xmlStr);
  }
  
  public java.lang.String findUserFormat2Json(java.lang.String pk) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault{
    if (userService == null)
      _initUserServiceProxy();
    return userService.findUserFormat2Json(pk);
  }
  
  public java.lang.String findUserFormat2XML(java.lang.String pk) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault{
    if (userService == null)
      _initUserServiceProxy();
    return userService.findUserFormat2XML(pk);
  }
  
  public java.lang.Object[] getUsersByDepId(java.lang.String depId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault{
    if (userService == null)
      _initUserServiceProxy();
    return userService.getUsersByDepId(depId);
  }
  
  public int addDepartment(java.lang.String userId, java.lang.String depId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault{
    if (userService == null)
      _initUserServiceProxy();
    return userService.addDepartment(userId, depId);
  }
  
  public int changeAdminPassword(java.lang.String id, java.lang.String password) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault{
    if (userService == null)
      _initUserServiceProxy();
    return userService.changeAdminPassword(id, password);
  }
  
  public int deleteUser(java.lang.String pk) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault{
    if (userService == null)
      _initUserServiceProxy();
    return userService.deleteUser(pk);
  }
  
  public int deleteUser(cn.myapps.webservice.model.SimpleUser user) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault{
    if (userService == null)
      _initUserServiceProxy();
    return userService.deleteUser(user);
  }
  
  public int deleteUser(java.lang.String[] pks) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault{
    if (userService == null)
      _initUserServiceProxy();
    return userService.deleteUser(pks);
  }
  
  public int setRoleSet(java.lang.String userId, java.lang.String[] roles) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault{
    if (userService == null)
      _initUserServiceProxy();
    return userService.setRoleSet(userId, roles);
  }
  
  public int setDepartmentSet(java.lang.String userId, java.lang.String[] deps, java.lang.String defaultDepartmentId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault{
    if (userService == null)
      _initUserServiceProxy();
    return userService.setDepartmentSet(userId, deps, defaultDepartmentId);
  }
  
  public int updateUser(cn.myapps.webservice.model.SimpleUser user) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault{
    if (userService == null)
      _initUserServiceProxy();
    return userService.updateUser(user);
  }
  
  public int updateUser(java.util.HashMap attributes) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault{
    if (userService == null)
      _initUserServiceProxy();
    return userService.updateUser(attributes);
  }
  
  public int deleteAdmin(java.lang.String id) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault{
    if (userService == null)
      _initUserServiceProxy();
    return userService.deleteAdmin(id);
  }
  
  public int addRole(java.lang.String userId, java.lang.String roleId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault{
    if (userService == null)
      _initUserServiceProxy();
    return userService.addRole(userId, roleId);
  }
  
  public int createUser(cn.myapps.webservice.model.SimpleUser user) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault{
    if (userService == null)
      _initUserServiceProxy();
    return userService.createUser(user);
  }
  
  public int createUser(java.lang.String id, java.lang.String name, java.lang.String loginno, java.lang.String loginpwd, java.lang.String email, java.lang.String telephone, java.lang.String domainName, java.lang.String defaultDepartmentName) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault{
    if (userService == null)
      _initUserServiceProxy();
    return userService.createUser(id, name, loginno, loginpwd, email, telephone, domainName, defaultDepartmentName);
  }
  
  public int removeRole(java.lang.String userId, java.lang.String roleId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault{
    if (userService == null)
      _initUserServiceProxy();
    return userService.removeRole(userId, roleId);
  }
  
  public void main(java.lang.String[] args) throws java.rmi.RemoteException{
    if (userService == null)
      _initUserServiceProxy();
    userService.main(args);
  }
  
  
}