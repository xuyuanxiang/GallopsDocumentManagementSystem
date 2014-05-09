package cn.myapps.webservice.client;

public class DepartmentServiceProxy implements cn.myapps.webservice.client.DepartmentService {
  private String _endpoint = null;
  private cn.myapps.webservice.client.DepartmentService departmentService = null;
  
  public DepartmentServiceProxy() {
    _initDepartmentServiceProxy();
  }
  
  public DepartmentServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initDepartmentServiceProxy();
  }
  
  private void _initDepartmentServiceProxy() {
    try {
      departmentService = (new cn.myapps.webservice.client.DepartmentServiceServiceLocator()).getDepartmentService();
      if (departmentService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)departmentService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)departmentService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (departmentService != null)
      ((javax.xml.rpc.Stub)departmentService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cn.myapps.webservice.client.DepartmentService getDepartmentService() {
    if (departmentService == null)
      _initDepartmentServiceProxy();
    return departmentService;
  }
  
  public cn.myapps.webservice.model.SimpleDepartment getDepartment(java.lang.String pk) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DepartmentServiceFault{
    if (departmentService == null)
      _initDepartmentServiceProxy();
    return departmentService.getDepartment(pk);
  }
  
  public int deleteDepartment(java.lang.String[] pks) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DepartmentServiceFault{
    if (departmentService == null)
      _initDepartmentServiceProxy();
    return departmentService.deleteDepartment(pks);
  }
  
  public int deleteDepartment(java.lang.String pk) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DepartmentServiceFault{
    if (departmentService == null)
      _initDepartmentServiceProxy();
    return departmentService.deleteDepartment(pk);
  }
  
  public java.lang.Object[] getDepartmentsByDomainName(java.lang.String domainName) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DepartmentServiceFault{
    if (departmentService == null)
      _initDepartmentServiceProxy();
    return departmentService.getDepartmentsByDomainName(domainName);
  }
  
  public int createDepartmentFromJson(java.lang.String jsonStr) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DepartmentServiceFault{
    if (departmentService == null)
      _initDepartmentServiceProxy();
    return departmentService.createDepartmentFromJson(jsonStr);
  }
  
  public int upateSuperior(cn.myapps.webservice.model.SimpleDepartment dep, cn.myapps.webservice.model.SimpleDepartment superDep) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DepartmentServiceFault{
    if (departmentService == null)
      _initDepartmentServiceProxy();
    return departmentService.upateSuperior(dep, superDep);
  }
  
  public int createDepartment(java.lang.String id, java.lang.String name, java.lang.String code, java.lang.String superiorName, java.lang.String domainName) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DepartmentServiceFault{
    if (departmentService == null)
      _initDepartmentServiceProxy();
    return departmentService.createDepartment(id, name, code, superiorName, domainName);
  }
  
  public int createDepartment(cn.myapps.webservice.model.SimpleDepartment dep) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DepartmentServiceFault{
    if (departmentService == null)
      _initDepartmentServiceProxy();
    return departmentService.createDepartment(dep);
  }
  
  public int updateDepartment(java.util.HashMap attributes) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DepartmentServiceFault{
    if (departmentService == null)
      _initDepartmentServiceProxy();
    return departmentService.updateDepartment(attributes);
  }
  
  public int updateDepartment(cn.myapps.webservice.model.SimpleDepartment dep) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DepartmentServiceFault{
    if (departmentService == null)
      _initDepartmentServiceProxy();
    return departmentService.updateDepartment(dep);
  }
  
  public int updateDepartmentFromJson(java.lang.String jsonStr) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DepartmentServiceFault{
    if (departmentService == null)
      _initDepartmentServiceProxy();
    return departmentService.updateDepartmentFromJson(jsonStr);
  }
  
  public int createDepartmentFromXML(java.lang.String xmlStr) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DepartmentServiceFault{
    if (departmentService == null)
      _initDepartmentServiceProxy();
    return departmentService.createDepartmentFromXML(xmlStr);
  }
  
  public int updateDepartmentFromXML(java.lang.String xmlStr) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DepartmentServiceFault{
    if (departmentService == null)
      _initDepartmentServiceProxy();
    return departmentService.updateDepartmentFromXML(xmlStr);
  }
  
  public java.lang.String findDepartmentFormat2Json(java.lang.String pk) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DepartmentServiceFault{
    if (departmentService == null)
      _initDepartmentServiceProxy();
    return departmentService.findDepartmentFormat2Json(pk);
  }
  
  public java.lang.String findDepartmentFormat2XML(java.lang.String pk) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DepartmentServiceFault{
    if (departmentService == null)
      _initDepartmentServiceProxy();
    return departmentService.findDepartmentFormat2XML(pk);
  }
  
  public java.lang.String getDepartmentsByDomainNameFormat2Json(java.lang.String domainName) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DepartmentServiceFault{
    if (departmentService == null)
      _initDepartmentServiceProxy();
    return departmentService.getDepartmentsByDomainNameFormat2Json(domainName);
  }
  
  public java.lang.String getDepartmentsByDomainNameFormat2XML(java.lang.String domainName) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DepartmentServiceFault{
    if (departmentService == null)
      _initDepartmentServiceProxy();
    return departmentService.getDepartmentsByDomainNameFormat2XML(domainName);
  }
  
  
}