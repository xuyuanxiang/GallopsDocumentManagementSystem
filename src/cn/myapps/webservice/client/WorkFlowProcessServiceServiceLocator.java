/**
 * WorkFlowProcessServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.myapps.webservice.client;

public class WorkFlowProcessServiceServiceLocator extends org.apache.axis.client.Service implements cn.myapps.webservice.client.WorkFlowProcessServiceService {

    public WorkFlowProcessServiceServiceLocator() {
    }


    public WorkFlowProcessServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WorkFlowProcessServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WorkFlowProcessService
    private java.lang.String WorkFlowProcessService_address = "http://119.62.122.165/obpm/services/WorkFlowProcessService";

    public java.lang.String getWorkFlowProcessServiceAddress() {
        return WorkFlowProcessService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WorkFlowProcessServiceWSDDServiceName = "WorkFlowProcessService";

    public java.lang.String getWorkFlowProcessServiceWSDDServiceName() {
        return WorkFlowProcessServiceWSDDServiceName;
    }

    public void setWorkFlowProcessServiceWSDDServiceName(java.lang.String name) {
        WorkFlowProcessServiceWSDDServiceName = name;
    }

    public cn.myapps.webservice.client.WorkFlowProcessService getWorkFlowProcessService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WorkFlowProcessService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWorkFlowProcessService(endpoint);
    }

    public cn.myapps.webservice.client.WorkFlowProcessService getWorkFlowProcessService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cn.myapps.webservice.client.WorkFlowProcessServiceSoapBindingStub _stub = new cn.myapps.webservice.client.WorkFlowProcessServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getWorkFlowProcessServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWorkFlowProcessServiceEndpointAddress(java.lang.String address) {
        WorkFlowProcessService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cn.myapps.webservice.client.WorkFlowProcessService.class.isAssignableFrom(serviceEndpointInterface)) {
                cn.myapps.webservice.client.WorkFlowProcessServiceSoapBindingStub _stub = new cn.myapps.webservice.client.WorkFlowProcessServiceSoapBindingStub(new java.net.URL(WorkFlowProcessService_address), this);
                _stub.setPortName(getWorkFlowProcessServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WorkFlowProcessService".equals(inputPortName)) {
            return getWorkFlowProcessService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://client.webservice.myapps.cn", "WorkFlowProcessServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://client.webservice.myapps.cn", "WorkFlowProcessService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WorkFlowProcessService".equals(portName)) {
            setWorkFlowProcessServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
