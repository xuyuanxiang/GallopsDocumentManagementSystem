package cn.myapps.webservice.client;

public class FlowHistoryServiceProxy implements cn.myapps.webservice.client.FlowHistoryService {
  private String _endpoint = null;
  private cn.myapps.webservice.client.FlowHistoryService flowHistoryService = null;
  
  public FlowHistoryServiceProxy() {
    _initFlowHistoryServiceProxy();
  }
  
  public FlowHistoryServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initFlowHistoryServiceProxy();
  }
  
  private void _initFlowHistoryServiceProxy() {
    try {
      flowHistoryService = (new cn.myapps.webservice.client.FlowHistoryServiceServiceLocator()).getFlowHistoryService();
      if (flowHistoryService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)flowHistoryService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)flowHistoryService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (flowHistoryService != null)
      ((javax.xml.rpc.Stub)flowHistoryService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cn.myapps.webservice.client.FlowHistoryService getFlowHistoryService() {
    if (flowHistoryService == null)
      _initFlowHistoryServiceProxy();
    return flowHistoryService;
  }
  
  public java.lang.String toDiagramHtml(int cellCount) throws java.rmi.RemoteException, cn.myapps.webservice.fault.FlowHistoryServiceFault{
    if (flowHistoryService == null)
      _initFlowHistoryServiceProxy();
    return flowHistoryService.toDiagramHtml(cellCount);
  }
  
  public java.lang.String getFlowHistroyFormat2Html(java.lang.String docId, java.lang.String flowStateId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.FlowHistoryServiceFault{
    if (flowHistoryService == null)
      _initFlowHistoryServiceProxy();
    return flowHistoryService.getFlowHistroyFormat2Html(docId, flowStateId, applicationId);
  }
  
  public cn.myapps.webservice.model.SimpleFlowHistory getFlowHistroy(java.lang.String docId, java.lang.String flowStateId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.FlowHistoryServiceFault{
    if (flowHistoryService == null)
      _initFlowHistoryServiceProxy();
    return flowHistoryService.getFlowHistroy(docId, flowStateId, applicationId);
  }
  
  public java.lang.String getFlowHistroyDiagram(java.lang.String docId, java.lang.String flowStateId, java.lang.String applicationId, int cellCount) throws java.rmi.RemoteException, cn.myapps.webservice.fault.FlowHistoryServiceFault{
    if (flowHistoryService == null)
      _initFlowHistoryServiceProxy();
    return flowHistoryService.getFlowHistroyDiagram(docId, flowStateId, applicationId, cellCount);
  }
  
  public java.lang.String getFlowHistroyFormat2XML(java.lang.String docId, java.lang.String flowStateId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.FlowHistoryServiceFault{
    if (flowHistoryService == null)
      _initFlowHistoryServiceProxy();
    return flowHistoryService.getFlowHistroyFormat2XML(docId, flowStateId, applicationId);
  }
  
  public java.lang.String getFlowHistroyFormat2Json(java.lang.String docId, java.lang.String flowStateId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.FlowHistoryServiceFault{
    if (flowHistoryService == null)
      _initFlowHistoryServiceProxy();
    return flowHistoryService.getFlowHistroyFormat2Json(docId, flowStateId, applicationId);
  }
  
  public cn.myapps.webservice.model.SimpleActorHIS getSimpleActorHISInstance() throws java.rmi.RemoteException{
    if (flowHistoryService == null)
      _initFlowHistoryServiceProxy();
    return flowHistoryService.getSimpleActorHISInstance();
  }
  
  public cn.myapps.webservice.model.SimpleRelationHIS getSimpleRelationHISInstance() throws java.rmi.RemoteException{
    if (flowHistoryService == null)
      _initFlowHistoryServiceProxy();
    return flowHistoryService.getSimpleRelationHISInstance();
  }
  
  public void main(java.lang.String[] args) throws java.rmi.RemoteException{
    if (flowHistoryService == null)
      _initFlowHistoryServiceProxy();
    flowHistoryService.main(args);
  }
  
  
}