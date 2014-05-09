package cn.myapps.webservice.client;

public class WorkFlowProcessServiceProxy implements cn.myapps.webservice.client.WorkFlowProcessService {
  private String _endpoint = null;
  private cn.myapps.webservice.client.WorkFlowProcessService workFlowProcessService = null;
  
  public WorkFlowProcessServiceProxy() {
    _initWorkFlowProcessServiceProxy();
  }
  
  public WorkFlowProcessServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initWorkFlowProcessServiceProxy();
  }
  
  private void _initWorkFlowProcessServiceProxy() {
    try {
      workFlowProcessService = (new cn.myapps.webservice.client.WorkFlowProcessServiceServiceLocator()).getWorkFlowProcessService();
      if (workFlowProcessService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)workFlowProcessService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)workFlowProcessService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (workFlowProcessService != null)
      ((javax.xml.rpc.Stub)workFlowProcessService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cn.myapps.webservice.client.WorkFlowProcessService getWorkFlowProcessService() {
    if (workFlowProcessService == null)
      _initWorkFlowProcessServiceProxy();
    return workFlowProcessService;
  }
  
  public int doRetracement(java.lang.String docId, java.lang.String flowId, java.lang.String userId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkFlowProcessServiceFault{
    if (workFlowProcessService == null)
      _initWorkFlowProcessServiceProxy();
    return workFlowProcessService.doRetracement(docId, flowId, userId, applicationId);
  }
  
  public int doStartFlow(java.lang.String docId, java.lang.String flowId, java.lang.String userId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkFlowProcessServiceFault{
    if (workFlowProcessService == null)
      _initWorkFlowProcessServiceProxy();
    return workFlowProcessService.doStartFlow(docId, flowId, userId, applicationId);
  }
  
  public int doFlow(java.lang.String docId, java.lang.String currNodeId, java.lang.String[] nextNodeIds, java.lang.String userId, java.lang.String attitude, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkFlowProcessServiceFault{
    if (workFlowProcessService == null)
      _initWorkFlowProcessServiceProxy();
    return workFlowProcessService.doFlow(docId, currNodeId, nextNodeIds, userId, attitude, applicationId);
  }
  
  public int doFlow(java.lang.String docId, java.lang.String[] nextNodeIds, java.lang.String userId, java.lang.String attitude, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkFlowProcessServiceFault{
    if (workFlowProcessService == null)
      _initWorkFlowProcessServiceProxy();
    return workFlowProcessService.doFlow(docId, nextNodeIds, userId, attitude, applicationId);
  }
  
  public int doFlowBack(java.lang.String docId, java.lang.String backNodeId, java.lang.String userId, java.lang.String attitude, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkFlowProcessServiceFault{
    if (workFlowProcessService == null)
      _initWorkFlowProcessServiceProxy();
    return workFlowProcessService.doFlowBack(docId, backNodeId, userId, attitude, applicationId);
  }
  
  public int doBatchFlow(java.lang.String[] docIds, java.lang.String[] nextNodeIds, java.lang.String userId, java.lang.String attitude, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkFlowProcessServiceFault{
    if (workFlowProcessService == null)
      _initWorkFlowProcessServiceProxy();
    return workFlowProcessService.doBatchFlow(docIds, nextNodeIds, userId, attitude, applicationId);
  }
  
  
}