/**
 * WorkFlowProcessService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.myapps.webservice.client;

public interface WorkFlowProcessService extends java.rmi.Remote {
    public int doRetracement(java.lang.String docId, java.lang.String flowId, java.lang.String userId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkFlowProcessServiceFault;
    public int doStartFlow(java.lang.String docId, java.lang.String flowId, java.lang.String userId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkFlowProcessServiceFault;
    public int doFlow(java.lang.String docId, java.lang.String currNodeId, java.lang.String[] nextNodeIds, java.lang.String userId, java.lang.String attitude, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkFlowProcessServiceFault;
    public int doFlow(java.lang.String docId, java.lang.String[] nextNodeIds, java.lang.String userId, java.lang.String attitude, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkFlowProcessServiceFault;
    public int doFlowBack(java.lang.String docId, java.lang.String backNodeId, java.lang.String userId, java.lang.String attitude, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkFlowProcessServiceFault;
    public int doBatchFlow(java.lang.String[] docIds, java.lang.String[] nextNodeIds, java.lang.String userId, java.lang.String attitude, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkFlowProcessServiceFault;
}
