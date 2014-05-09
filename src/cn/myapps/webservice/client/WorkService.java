/**
 * WorkService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.myapps.webservice.client;

public interface WorkService extends java.rmi.Remote {
    public java.lang.Object[] getProcessedInfoByUser(java.lang.String userId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault;
    public java.lang.Object[] getProcessedInfoByUser(java.lang.String userId, java.lang.String formName, java.lang.String flowName, java.lang.String applicationId, int currpage, int pagelines) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault;
    public java.lang.String getProcessedInfoByUserFormat2XML(java.lang.String userId, java.lang.String formName, java.lang.String flowName, java.lang.String applicationId, int currpage, int pagelines) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault;
    public java.lang.String getProcessedInfoByUserFormat2XML(java.lang.String userId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault;
    public java.lang.String getProcessedInfoByUserFormat2Json(java.lang.String userId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault;
    public java.lang.String getProcessedInfoByUserFormat2Json(java.lang.String userId, java.lang.String formName, java.lang.String flowName, java.lang.String applicationId, int currpage, int pagelines) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault;
    public cn.myapps.webservice.model.SimpleCirculator getSimpleCirculatorInstance() throws java.rmi.RemoteException;
    public java.lang.Object[] getPendingInfoByUser(java.lang.String userId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault;
    public java.lang.Object[] getPendingInfoByUser(java.lang.String userId, java.lang.String formName, java.lang.String flowName, java.lang.String applicationId, int currpage, int pagelines) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault;
    public java.lang.String getPendingInfoByUserFormat2XML(java.lang.String userId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault;
    public java.lang.String getPendingInfoByUserFormat2XML(java.lang.String userId, java.lang.String formName, java.lang.String flowName, java.lang.String applicationId, int currpage, int pagelines) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault;
    public java.lang.String getPendingInfoByUserFormat2Json(java.lang.String userId, java.lang.String formName, java.lang.String flowName, java.lang.String applicationId, int currpage, int pagelines) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault;
    public java.lang.String getPendingInfoByUserFormat2Json(java.lang.String userId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault;
    public cn.myapps.webservice.model.SimpleWork getSimpleWorkInstance() throws java.rmi.RemoteException;
    public java.lang.Object[] getPendingWorkByUser(java.lang.String userId, java.lang.String formName, java.lang.String flowName, java.lang.String applicationId, int currpage, int pagelines) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault;
    public java.lang.Object[] getPendingWorkByUser(java.lang.String userId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault;
    public java.lang.String getPendingWorkByUserFormat2XML(java.lang.String userId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault;
    public java.lang.String getPendingWorkByUserFormat2XML(java.lang.String userId, java.lang.String formName, java.lang.String flowName, java.lang.String applicationId, int currpage, int pagelines) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault;
    public java.lang.String getPendingWorkByUserFormat2Json(java.lang.String userId, java.lang.String formName, java.lang.String flowName, java.lang.String applicationId, int currpage, int pagelines) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault;
    public java.lang.String getPendingWorkByUserFormat2Json(java.lang.String userId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault;
    public java.lang.Object[] getProcessedWorkByUser(java.lang.String userId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault;
    public java.lang.Object[] getProcessedWorkByUser(java.lang.String userId, java.lang.String formName, java.lang.String flowName, java.lang.String applicationId, int currpage, int pagelines) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault;
    public java.lang.String getProcessedWorkByUserFormat2XML(java.lang.String userId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault;
    public java.lang.String getProcessedWorkByUserFormat2XML(java.lang.String userId, java.lang.String formName, java.lang.String flowName, java.lang.String applicationId, int currpage, int pagelines) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault;
    public java.lang.String getProcessedWorkByUserFormat2Json(java.lang.String userId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault;
    public java.lang.String getProcessedWorkByUserFormat2Json(java.lang.String userId, java.lang.String formName, java.lang.String flowName, java.lang.String applicationId, int currpage, int pagelines) throws java.rmi.RemoteException, cn.myapps.webservice.fault.WorkServiceFault;
}
