/**
 * ApplicationService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.myapps.webservice.client;

public interface ApplicationService extends java.rmi.Remote {
    public java.lang.Object[] searchApplicationsByName(java.lang.String name) throws java.rmi.RemoteException, cn.myapps.webservice.fault.ApplicationServiceFault;
    public java.lang.Object[] searchApplicationsByDomainAdmin(java.lang.String domainAdminId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.ApplicationServiceFault;
    public boolean addApplication(java.lang.String userAccount, java.lang.String domainName, java.lang.String applicationId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.ApplicationServiceFault;
    public java.lang.Object[] searchApplicationsByFilter(java.lang.String parameters) throws java.rmi.RemoteException, cn.myapps.webservice.fault.ApplicationServiceFault;
    public java.lang.Object[] searchApplicationsByFilter(java.util.HashMap parameters) throws java.rmi.RemoteException, cn.myapps.webservice.fault.ApplicationServiceFault;
    public cn.myapps.webservice.model.SimpleApplication searchApplicationByName(java.lang.String name) throws java.rmi.RemoteException, cn.myapps.webservice.fault.ApplicationServiceFault;
    public java.lang.Object[] searchApplicationsByDomain(java.lang.String domainId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.ApplicationServiceFault;
    public java.lang.Object[] searchApplicationsByDeveloper(java.lang.String developerId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.ApplicationServiceFault;
    public void main(java.lang.String[] args) throws java.rmi.RemoteException, cn.myapps.webservice.fault.ApplicationServiceFault;
}
