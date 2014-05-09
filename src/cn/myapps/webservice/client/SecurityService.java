/**
 * SecurityService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.myapps.webservice.client;

public interface SecurityService extends java.rmi.Remote {
    public cn.myapps.webservice.model.SimpleUser validateUser(java.lang.String domainName, java.lang.String userAccount, java.lang.String userPassword, int userType) throws java.rmi.RemoteException, cn.myapps.webservice.fault.SecurityServiceFault;
    public int doChangePassword(java.lang.String domainName, java.lang.String userAccount, java.lang.String oldPassword, java.lang.String newPassword) throws java.rmi.RemoteException, cn.myapps.webservice.fault.SecurityServiceFault;
    public int activateUser(java.lang.String adminAccount, java.lang.String adminPw, java.lang.String userId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.SecurityServiceFault;
    public int inactiveUser(java.lang.String adminAccount, java.lang.String adminPw, java.lang.String userId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.SecurityServiceFault;
}
