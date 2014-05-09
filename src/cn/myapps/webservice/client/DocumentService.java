/**
 * DocumentService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.myapps.webservice.client;

public interface DocumentService extends java.rmi.Remote {
    public int removeDocument(java.lang.String documentId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public int createDocumentByGuest(java.lang.String formName, java.util.HashMap parameters, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public int createDocumentByGuest(java.lang.String formName, java.lang.String parameters, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public int createDocumentAndStartFlowByDomainUser(java.lang.String formName, java.util.HashMap parameters, java.lang.String domainUserId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public int createDocumentAndStartFlowByDomainUser(java.lang.String formName, java.lang.String parameters, java.lang.String domainUserId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public java.lang.String searchSimpleDocumentByFilterFormat2XML(java.lang.String formName, java.util.HashMap parameters, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public java.lang.String searchSimpleDocumentByFilterFormat2XML(java.lang.String formName, java.lang.String parameters, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public java.lang.String searchDocumentsByFilterFormat2Json(java.lang.String formName, java.util.HashMap parameters, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public java.lang.String searchDocumentsByFilterFormat2Json(java.lang.String formName, java.util.HashMap parameters, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public java.lang.String searchDocumentsByFilterFormat2Json(java.lang.String formName, java.lang.String parameters, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public java.lang.String searchDocumentsByFilterFormat2Json(java.lang.String formName, java.lang.String parameters, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public java.lang.String searchSimpleDocumentByFilterFormat2Json(java.lang.String formName, java.util.HashMap parameters, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public java.lang.String searchSimpleDocumentByFilterFormat2Json(java.lang.String formName, java.lang.String parameters, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public java.lang.Object[] searchDocumentsBySQL(java.lang.String sql, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public java.lang.Object[] searchDocumentsBySQL(java.lang.String sql, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public cn.myapps.webservice.model.SimpleDocument searchDocumentBySQL(java.lang.String sql, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public java.lang.String searchDocumentsBySQLFormat2XML(java.lang.String sql, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public java.lang.String searchDocumentsBySQLFormat2XML(java.lang.String sql, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public java.lang.String searchSimpleDocumentBySQLFormat2XML(java.lang.String sql, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public java.lang.String searchDocumentsBySQLFormat2Json(java.lang.String sql, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public java.lang.String searchDocumentsBySQLFormat2Json(java.lang.String sql, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public java.lang.String searchSimpleDocumentBySQLFormat2Json(java.lang.String sql, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public java.lang.Object[] searchDocumentsByDQL(java.lang.String dql, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public java.lang.Object[] searchDocumentsByDQL(java.lang.String dql, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public cn.myapps.webservice.model.SimpleDocument searchDocumentByDQL(java.lang.String dql, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public java.lang.String searchDocumentsByDQLFormat2XML(java.lang.String dql, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public java.lang.String searchDocumentsByDQLFormat2XML(java.lang.String dql, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public java.lang.String searchSimpleDocumentByDQLFormat2XML(java.lang.String dql, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public java.lang.String searchDocumentsByDQLFormat2Json(java.lang.String dql, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public java.lang.String searchDocumentsByDQLFormat2Json(java.lang.String dql, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public java.lang.String searchSimpleDocumentByDQLFormat2Json(java.lang.String dql, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public cn.myapps.webservice.model.SimpleDocument searchDocumentByFilter(java.lang.String formName, java.util.HashMap parameters, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public cn.myapps.webservice.model.SimpleDocument searchDocumentByFilter(java.lang.String formName, java.lang.String parameters, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public java.lang.String searchDocumentsByFilterFormat2XML(java.lang.String formName, java.lang.String parameters, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public java.lang.String searchDocumentsByFilterFormat2XML(java.lang.String formName, java.util.HashMap parameters, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public java.lang.String searchDocumentsByFilterFormat2XML(java.lang.String formName, java.lang.String parameters, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public java.lang.String searchDocumentsByFilterFormat2XML(java.lang.String formName, java.util.HashMap parameters, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public int removeDocumentByUser(java.lang.String documentId, java.lang.String applicationId, java.lang.String userId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public java.lang.Object[] searchDocumentsByFilter(java.lang.String formName, java.lang.String parameters, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public java.lang.Object[] searchDocumentsByFilter(java.lang.String formName, java.util.HashMap parameters, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public java.lang.Object[] searchDocumentsByFilter(java.lang.String formName, java.util.HashMap parameters, java.lang.String applicationId, java.lang.String domainUserId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public java.lang.Object[] searchDocumentsByFilter(java.lang.String formName, java.lang.String parameters, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public int updateDocumentByGuest(java.lang.String documentId, java.lang.String parameters, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public int updateDocumentByGuest(java.lang.String documentId, java.util.HashMap parameters, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public int createDocumentByDomainUser(java.lang.String formName, java.lang.String parameters, java.lang.String domainUserId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public int createDocumentByDomainUser(java.lang.String formName, java.util.HashMap parameters, java.lang.String domainUserId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public int updateDocumentByDomainUser(java.lang.String documentId, java.util.HashMap parameters, java.lang.String domainUserId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public int updateDocumentByDomainUser(java.lang.String documentId, java.lang.String parameters, java.lang.String domainUserId, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DocumentServiceFault;
    public void main(java.lang.String[] args) throws java.rmi.RemoteException;
}
