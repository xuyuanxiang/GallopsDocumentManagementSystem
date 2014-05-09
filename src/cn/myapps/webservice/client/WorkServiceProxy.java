package cn.myapps.webservice.client;

public class WorkServiceProxy implements cn.myapps.webservice.client.WorkService {
  private String _endpoint = null;
  private cn.myapps.webservice.client.WorkService workService = null;
  
  public WorkServiceProxy() {
    _initWorkServiceProxy();
  }
  
  public WorkServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initWorkServiceProxy();
  }
  
  private void _initWorkServiceProxy() {
    try {
      workService = (new cn.myapps.webservice.client.WorkServiceServiceLocator()).getWorkService();
      if (workService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)workService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)workService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (workService != null)
      ((javax.xml.rpc.Stub)workService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cn.myapps.webservice.client.WorkService getWorkService() {
    if (workService == null)
      _initWorkServiceProxy();
    return workService;
  }
  
  public java.lang.Object[] getProcessedInfoByUser(java.lang.String userId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault{
    if (workService == null)
      _initWorkServiceProxy();
    return workService.getProcessedInfoByUser(userId, applicationId);
  }
  
  public java.lang.Object[] getProcessedInfoByUser(java.lang.String userId, java.lang.String formName, java.lang.String flowName, java.lang.String applicationId, int currpage, int pagelines) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault{
    if (workService == null)
      _initWorkServiceProxy();
    return workService.getProcessedInfoByUser(userId, formName, flowName, applicationId, currpage, pagelines);
  }
  
  public java.lang.String getProcessedInfoByUserFormat2XML(java.lang.String userId, java.lang.String formName, java.lang.String flowName, java.lang.String applicationId, int currpage, int pagelines) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault{
    if (workService == null)
      _initWorkServiceProxy();
    return workService.getProcessedInfoByUserFormat2XML(userId, formName, flowName, applicationId, currpage, pagelines);
  }
  
  public java.lang.String getProcessedInfoByUserFormat2XML(java.lang.String userId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault{
    if (workService == null)
      _initWorkServiceProxy();
    return workService.getProcessedInfoByUserFormat2XML(userId, applicationId);
  }
  
  public java.lang.String getProcessedInfoByUserFormat2Json(java.lang.String userId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault{
    if (workService == null)
      _initWorkServiceProxy();
    return workService.getProcessedInfoByUserFormat2Json(userId, applicationId);
  }
  
  public java.lang.String getProcessedInfoByUserFormat2Json(java.lang.String userId, java.lang.String formName, java.lang.String flowName, java.lang.String applicationId, int currpage, int pagelines) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault{
    if (workService == null)
      _initWorkServiceProxy();
    return workService.getProcessedInfoByUserFormat2Json(userId, formName, flowName, applicationId, currpage, pagelines);
  }
  
  public cn.myapps.webservice.model.SimpleCirculator getSimpleCirculatorInstance() throws java.rmi.RemoteException{
    if (workService == null)
      _initWorkServiceProxy();
    return workService.getSimpleCirculatorInstance();
  }
  
  public java.lang.Object[] getPendingInfoByUser(java.lang.String userId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault{
    if (workService == null)
      _initWorkServiceProxy();
    return workService.getPendingInfoByUser(userId, applicationId);
  }
  
  public java.lang.Object[] getPendingInfoByUser(java.lang.String userId, java.lang.String formName, java.lang.String flowName, java.lang.String applicationId, int currpage, int pagelines) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault{
    if (workService == null)
      _initWorkServiceProxy();
    return workService.getPendingInfoByUser(userId, formName, flowName, applicationId, currpage, pagelines);
  }
  
  public java.lang.String getPendingInfoByUserFormat2XML(java.lang.String userId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault{
    if (workService == null)
      _initWorkServiceProxy();
    return workService.getPendingInfoByUserFormat2XML(userId, applicationId);
  }
  
  public java.lang.String getPendingInfoByUserFormat2XML(java.lang.String userId, java.lang.String formName, java.lang.String flowName, java.lang.String applicationId, int currpage, int pagelines) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault{
    if (workService == null)
      _initWorkServiceProxy();
    return workService.getPendingInfoByUserFormat2XML(userId, formName, flowName, applicationId, currpage, pagelines);
  }
  
  public java.lang.String getPendingInfoByUserFormat2Json(java.lang.String userId, java.lang.String formName, java.lang.String flowName, java.lang.String applicationId, int currpage, int pagelines) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault{
    if (workService == null)
      _initWorkServiceProxy();
    return workService.getPendingInfoByUserFormat2Json(userId, formName, flowName, applicationId, currpage, pagelines);
  }
  
  public java.lang.String getPendingInfoByUserFormat2Json(java.lang.String userId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault{
    if (workService == null)
      _initWorkServiceProxy();
    return workService.getPendingInfoByUserFormat2Json(userId, applicationId);
  }
  
  public cn.myapps.webservice.model.SimpleWork getSimpleWorkInstance() throws java.rmi.RemoteException{
    if (workService == null)
      _initWorkServiceProxy();
    return workService.getSimpleWorkInstance();
  }
  
  public java.lang.Object[] getPendingWorkByUser(java.lang.String userId, java.lang.String formName, java.lang.String flowName, java.lang.String applicationId, int currpage, int pagelines) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault{
    if (workService == null)
      _initWorkServiceProxy();
    return workService.getPendingWorkByUser(userId, formName, flowName, applicationId, currpage, pagelines);
  }
  
  public java.lang.Object[] getPendingWorkByUser(java.lang.String userId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault{
    if (workService == null)
      _initWorkServiceProxy();
    return workService.getPendingWorkByUser(userId, applicationId);
  }
  
  public java.lang.String getPendingWorkByUserFormat2XML(java.lang.String userId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault{
    if (workService == null)
      _initWorkServiceProxy();
    return workService.getPendingWorkByUserFormat2XML(userId, applicationId);
  }
  
  public java.lang.String getPendingWorkByUserFormat2XML(java.lang.String userId, java.lang.String formName, java.lang.String flowName, java.lang.String applicationId, int currpage, int pagelines) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault{
    if (workService == null)
      _initWorkServiceProxy();
    return workService.getPendingWorkByUserFormat2XML(userId, formName, flowName, applicationId, currpage, pagelines);
  }
  
  public java.lang.String getPendingWorkByUserFormat2Json(java.lang.String userId, java.lang.String formName, java.lang.String flowName, java.lang.String applicationId, int currpage, int pagelines) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault{
    if (workService == null)
      _initWorkServiceProxy();
    return workService.getPendingWorkByUserFormat2Json(userId, formName, flowName, applicationId, currpage, pagelines);
  }
  
  public java.lang.String getPendingWorkByUserFormat2Json(java.lang.String userId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault{
    if (workService == null)
      _initWorkServiceProxy();
    return workService.getPendingWorkByUserFormat2Json(userId, applicationId);
  }
  
  public java.lang.Object[] getProcessedWorkByUser(java.lang.String userId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault{
    if (workService == null)
      _initWorkServiceProxy();
    return workService.getProcessedWorkByUser(userId, applicationId);
  }
  
  public java.lang.Object[] getProcessedWorkByUser(java.lang.String userId, java.lang.String formName, java.lang.String flowName, java.lang.String applicationId, int currpage, int pagelines) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault{
    if (workService == null)
      _initWorkServiceProxy();
    return workService.getProcessedWorkByUser(userId, formName, flowName, applicationId, currpage, pagelines);
  }
  
  public java.lang.String getProcessedWorkByUserFormat2XML(java.lang.String userId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault{
    if (workService == null)
      _initWorkServiceProxy();
    return workService.getProcessedWorkByUserFormat2XML(userId, applicationId);
  }
  
  public java.lang.String getProcessedWorkByUserFormat2XML(java.lang.String userId, java.lang.String formName, java.lang.String flowName, java.lang.String applicationId, int currpage, int pagelines) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault{
    if (workService == null)
      _initWorkServiceProxy();
    return workService.getProcessedWorkByUserFormat2XML(userId, formName, flowName, applicationId, currpage, pagelines);
  }
  
  public java.lang.String getProcessedWorkByUserFormat2Json(java.lang.String userId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault{
    if (workService == null)
      _initWorkServiceProxy();
    return workService.getProcessedWorkByUserFormat2Json(userId, applicationId);
  }
  
  public java.lang.String getProcessedWorkByUserFormat2Json(java.lang.String userId, java.lang.String formName, java.lang.String flowName, java.lang.String applicationId, int currpage, int pagelines) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault{
    if (workService == null)
      _initWorkServiceProxy();
    return workService.getProcessedWorkByUserFormat2Json(userId, formName, flowName, applicationId, currpage, pagelines);
  }
  
  
}