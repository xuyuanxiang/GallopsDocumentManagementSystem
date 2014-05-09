/**
 * FlowHistoryService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.myapps.webservice.client;

public interface FlowHistoryService extends java.rmi.Remote {
    public java.lang.String toDiagramHtml(int cellCount) throws java.rmi.RemoteException, cn.myapps.webservice.fault.FlowHistoryServiceFault;
    public java.lang.String getFlowHistroyFormat2Html(java.lang.String docId, java.lang.String flowStateId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.FlowHistoryServiceFault;
    public cn.myapps.webservice.model.SimpleFlowHistory getFlowHistroy(java.lang.String docId, java.lang.String flowStateId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.FlowHistoryServiceFault;
    public java.lang.String getFlowHistroyDiagram(java.lang.String docId, java.lang.String flowStateId, java.lang.String applicationId, int cellCount) throws java.rmi.RemoteException, cn.myapps.webservice.fault.FlowHistoryServiceFault;
    public java.lang.String getFlowHistroyFormat2XML(java.lang.String docId, java.lang.String flowStateId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.FlowHistoryServiceFault;
    public java.lang.String getFlowHistroyFormat2Json(java.lang.String docId, java.lang.String flowStateId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.FlowHistoryServiceFault;
    public cn.myapps.webservice.model.SimpleActorHIS getSimpleActorHISInstance() throws java.rmi.RemoteException;
    public cn.myapps.webservice.model.SimpleRelationHIS getSimpleRelationHISInstance() throws java.rmi.RemoteException;
    public void main(java.lang.String[] args) throws java.rmi.RemoteException;
}
