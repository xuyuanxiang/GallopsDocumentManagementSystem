/**
 * UserService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.myapps.webservice.client;

public interface UserService extends java.rmi.Remote {
    public java.lang.Object[] getUsersByRoleId(java.lang.String roleId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault;
    public int removeDepartment(java.lang.String userId, java.lang.String depId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault;
    public cn.myapps.webservice.model.SimpleUser validateUser(java.lang.String domainName, java.lang.String userAccount, java.lang.String userPassword, int userType) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault;
    public cn.myapps.webservice.model.SimpleUser getUser(java.lang.String pk) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault;
    public int setDefaultDepartment(java.lang.String userId, java.lang.String depId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault;
    public cn.myapps.webservice.model.SimpleAdmin getAdmin(java.lang.String id) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault;
    public int updateAdmin(cn.myapps.webservice.model.SimpleAdmin admin) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault;
    public int createAdmin(cn.myapps.webservice.model.SimpleAdmin admin) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault;
    public int changePassword(java.lang.String id, java.lang.String password) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault;
    public int createUserFromJson(java.lang.String jsonStr) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault;
    public int createUserFromXML(java.lang.String xmlStr) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault;
    public int updateUserFromJson(java.lang.String jsonStr) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault;
    public int updateUserFromXML(java.lang.String xmlStr) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault;
    public java.lang.String findUserFormat2Json(java.lang.String pk) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault;
    public java.lang.String findUserFormat2XML(java.lang.String pk) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault;
    public java.lang.Object[] getUsersByDepId(java.lang.String depId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault;
    public int addDepartment(java.lang.String userId, java.lang.String depId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault;
    public int changeAdminPassword(java.lang.String id, java.lang.String password) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault;
    public int deleteUser(java.lang.String pk) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault;
    public int deleteUser(cn.myapps.webservice.model.SimpleUser user) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault;
    public int deleteUser(java.lang.String[] pks) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault;
    public int setRoleSet(java.lang.String userId, java.lang.String[] roles) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault;
    public int setDepartmentSet(java.lang.String userId, java.lang.String[] deps, java.lang.String defaultDepartmentId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault;
    public int updateUser(cn.myapps.webservice.model.SimpleUser user) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault;
    public int updateUser(java.util.HashMap attributes) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault;
    public int deleteAdmin(java.lang.String id) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault;
    public int addRole(java.lang.String userId, java.lang.String roleId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault;
    public int createUser(cn.myapps.webservice.model.SimpleUser user) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault;
    public int createUser(java.lang.String id, java.lang.String name, java.lang.String loginno, java.lang.String loginpwd, java.lang.String email, java.lang.String telephone, java.lang.String domainName, java.lang.String defaultDepartmentName) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault;
    public int removeRole(java.lang.String userId, java.lang.String roleId) throws java.rmi.RemoteException, cn.myapps.webservice.fault.UserServiceFault;
    public void main(java.lang.String[] args) throws java.rmi.RemoteException;
}
