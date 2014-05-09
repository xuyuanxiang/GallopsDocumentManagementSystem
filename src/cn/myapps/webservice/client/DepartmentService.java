/**
 * DepartmentService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.myapps.webservice.client;

public interface DepartmentService extends java.rmi.Remote {
    public cn.myapps.webservice.model.SimpleDepartment getDepartment(java.lang.String pk) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DepartmentServiceFault;
    public int deleteDepartment(java.lang.String[] pks) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DepartmentServiceFault;
    public int deleteDepartment(java.lang.String pk) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DepartmentServiceFault;
    public java.lang.Object[] getDepartmentsByDomainName(java.lang.String domainName) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DepartmentServiceFault;
    public int createDepartmentFromJson(java.lang.String jsonStr) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DepartmentServiceFault;
    public int upateSuperior(cn.myapps.webservice.model.SimpleDepartment dep, cn.myapps.webservice.model.SimpleDepartment superDep) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DepartmentServiceFault;
    public int createDepartment(java.lang.String id, java.lang.String name, java.lang.String code, java.lang.String superiorName, java.lang.String domainName) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DepartmentServiceFault;
    public int createDepartment(cn.myapps.webservice.model.SimpleDepartment dep) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DepartmentServiceFault;
    public int updateDepartment(java.util.HashMap attributes) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DepartmentServiceFault;
    public int updateDepartment(cn.myapps.webservice.model.SimpleDepartment dep) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DepartmentServiceFault;
    public int updateDepartmentFromJson(java.lang.String jsonStr) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DepartmentServiceFault;
    public int createDepartmentFromXML(java.lang.String xmlStr) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DepartmentServiceFault;
    public int updateDepartmentFromXML(java.lang.String xmlStr) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DepartmentServiceFault;
    public java.lang.String findDepartmentFormat2Json(java.lang.String pk) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DepartmentServiceFault;
    public java.lang.String findDepartmentFormat2XML(java.lang.String pk) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DepartmentServiceFault;
    public java.lang.String getDepartmentsByDomainNameFormat2Json(java.lang.String domainName) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DepartmentServiceFault;
    public java.lang.String getDepartmentsByDomainNameFormat2XML(java.lang.String domainName) throws java.rmi.RemoteException, cn.myapps.webservice.fault.DepartmentServiceFault;
}
