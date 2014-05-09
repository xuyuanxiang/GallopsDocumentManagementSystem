package cn.myapps.webservice.client;

public class RoleServiceProxy implements cn.myapps.webservice.client.RoleService {
  private String _endpoint = null;
  private cn.myapps.webservice.client.RoleService roleService = null;
  
  public RoleServiceProxy() {
    _initRoleServiceProxy();
  }
  
  public RoleServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initRoleServiceProxy();
  }
  
  private void _initRoleServiceProxy() {
    try {
      roleService = (new cn.myapps.webservice.client.RoleServiceServiceLocator()).getRoleService();
      if (roleService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)roleService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)roleService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (roleService != null)
      ((javax.xml.rpc.Stub)roleService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cn.myapps.webservice.client.RoleService getRoleService() {
    if (roleService == null)
      _initRoleServiceProxy();
    return roleService;
  }
  
  public int addUser(java.lang.String roleId, java.lang.String userId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.RoleServiceFault{
    if (roleService == null)
      _initRoleServiceProxy();
    return roleService.addUser(roleId, userId);
  }
  
  public int createRoleFromXML(java.lang.String xmlStr) throws java.rmi.RemoteException, cn.myapps.webservice.fault.RoleServiceFault{
    if (roleService == null)
      _initRoleServiceProxy();
    return roleService.createRoleFromXML(xmlStr);
  }
  
  public java.lang.String findRoleFormat2Json(java.lang.String pk) throws java.rmi.RemoteException, cn.myapps.webservice.fault.RoleServiceFault{
    if (roleService == null)
      _initRoleServiceProxy();
    return roleService.findRoleFormat2Json(pk);
  }
  
  public java.lang.String findRoleFormat2XML(java.lang.String pk) throws java.rmi.RemoteException, cn.myapps.webservice.fault.RoleServiceFault{
    if (roleService == null)
      _initRoleServiceProxy();
    return roleService.findRoleFormat2XML(pk);
  }
  
  public java.lang.Object[] getRolesByUserId(java.lang.String userId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.RoleServiceFault{
    if (roleService == null)
      _initRoleServiceProxy();
    return roleService.getRolesByUserId(userId);
  }
  
  public int addUsers(java.lang.String roleId, java.lang.String[] userIds) throws java.rmi.RemoteException, cn.myapps.webservice.fault.RoleServiceFault{
    if (roleService == null)
      _initRoleServiceProxy();
    return roleService.addUsers(roleId, userIds);
  }
  
  public int setPermissionSet(cn.myapps.webservice.model.SimpleRole role, java.lang.String[] resources) throws java.rmi.RemoteException, cn.myapps.webservice.fault.RoleServiceFault{
    if (roleService == null)
      _initRoleServiceProxy();
    return roleService.setPermissionSet(role, resources);
  }
  
  public int deleteRole(java.lang.String[] pks) throws java.rmi.RemoteException, cn.myapps.webservice.fault.RoleServiceFault{
    if (roleService == null)
      _initRoleServiceProxy();
    return roleService.deleteRole(pks);
  }
  
  public int deleteRole(java.lang.String pk) throws java.rmi.RemoteException, cn.myapps.webservice.fault.RoleServiceFault{
    if (roleService == null)
      _initRoleServiceProxy();
    return roleService.deleteRole(pk);
  }
  
  public int createRoleFromJson(java.lang.String jsonStr) throws java.rmi.RemoteException, cn.myapps.webservice.fault.RoleServiceFault{
    if (roleService == null)
      _initRoleServiceProxy();
    return roleService.createRoleFromJson(jsonStr);
  }
  
  public int updateRole(cn.myapps.webservice.model.SimpleRole role) throws java.rmi.RemoteException, cn.myapps.webservice.fault.RoleServiceFault{
    if (roleService == null)
      _initRoleServiceProxy();
    return roleService.updateRole(role);
  }
  
  public cn.myapps.webservice.model.SimpleRole getRole(java.lang.String pk) throws java.rmi.RemoteException, cn.myapps.webservice.fault.RoleServiceFault{
    if (roleService == null)
      _initRoleServiceProxy();
    return roleService.getRole(pk);
  }
  
  public int createRole(java.lang.String id, java.lang.String name, java.lang.String engname, java.lang.String applicationName) throws java.rmi.RemoteException, cn.myapps.webservice.fault.RoleServiceFault{
    if (roleService == null)
      _initRoleServiceProxy();
    return roleService.createRole(id, name, engname, applicationName);
  }
  
  public int createRole(cn.myapps.webservice.model.SimpleRole role) throws java.rmi.RemoteException, cn.myapps.webservice.fault.RoleServiceFault{
    if (roleService == null)
      _initRoleServiceProxy();
    return roleService.createRole(role);
  }
  
  public int removeUser(java.lang.String id, java.lang.String userId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.RoleServiceFault{
    if (roleService == null)
      _initRoleServiceProxy();
    return roleService.removeUser(id, userId);
  }
  
  
}