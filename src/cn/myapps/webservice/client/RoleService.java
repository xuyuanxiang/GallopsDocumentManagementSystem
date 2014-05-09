/**
 * RoleService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.myapps.webservice.client;

public interface RoleService extends java.rmi.Remote {
    public int addUser(java.lang.String roleId, java.lang.String userId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.RoleServiceFault;
    public int createRoleFromXML(java.lang.String xmlStr) throws java.rmi.RemoteException, cn.myapps.webservice.fault.RoleServiceFault;
    public java.lang.String findRoleFormat2Json(java.lang.String pk) throws java.rmi.RemoteException, cn.myapps.webservice.fault.RoleServiceFault;
    public java.lang.String findRoleFormat2XML(java.lang.String pk) throws java.rmi.RemoteException, cn.myapps.webservice.fault.RoleServiceFault;
    public java.lang.Object[] getRolesByUserId(java.lang.String userId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.RoleServiceFault;
    public int addUsers(java.lang.String roleId, java.lang.String[] userIds) throws java.rmi.RemoteException, cn.myapps.webservice.fault.RoleServiceFault;
    public int setPermissionSet(cn.myapps.webservice.model.SimpleRole role, java.lang.String[] resources) throws java.rmi.RemoteException, cn.myapps.webservice.fault.RoleServiceFault;
    public int deleteRole(java.lang.String[] pks) throws java.rmi.RemoteException, cn.myapps.webservice.fault.RoleServiceFault;
    public int deleteRole(java.lang.String pk) throws java.rmi.RemoteException, cn.myapps.webservice.fault.RoleServiceFault;
    public int createRoleFromJson(java.lang.String jsonStr) throws java.rmi.RemoteException, cn.myapps.webservice.fault.RoleServiceFault;
    public int updateRole(cn.myapps.webservice.model.SimpleRole role) throws java.rmi.RemoteException, cn.myapps.webservice.fault.RoleServiceFault;
    public cn.myapps.webservice.model.SimpleRole getRole(java.lang.String pk) throws java.rmi.RemoteException, cn.myapps.webservice.fault.RoleServiceFault;
    public int createRole(java.lang.String id, java.lang.String name, java.lang.String engname, java.lang.String applicationName) throws java.rmi.RemoteException, cn.myapps.webservice.fault.RoleServiceFault;
    public int createRole(cn.myapps.webservice.model.SimpleRole role) throws java.rmi.RemoteException, cn.myapps.webservice.fault.RoleServiceFault;
    public int removeUser(java.lang.String id, java.lang.String userId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.RoleServiceFault;
}
