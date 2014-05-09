/**
 * WorkServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.myapps.webservice.client;

public class WorkServiceServiceLocator extends org.apache.axis.client.Service implements cn.myapps.webservice.client.WorkServiceService {

    public WorkServiceServiceLocator() {
    }


    public WorkServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WorkServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WorkService
    private java.lang.String WorkService_address = "http://119.62.122.165/obpm/services/WorkService";

    public java.lang.String getWorkServiceAddress() {
        return WorkService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WorkServiceWSDDServiceName = "WorkService";

    public java.lang.String getWorkServiceWSDDServiceName() {
        return WorkServiceWSDDServiceName;
    }

    public void setWorkServiceWSDDServiceName(java.lang.String name) {
        WorkServiceWSDDServiceName = name;
    }

    public cn.myapps.webservice.client.WorkService getWorkService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WorkService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWorkService(endpoint);
    }

    public cn.myapps.webservice.client.WorkService getWorkService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cn.myapps.webservice.client.WorkServiceSoapBindingStub _stub = new cn.myapps.webservice.client.WorkServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getWorkServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWorkServiceEndpointAddress(java.lang.String address) {
        WorkService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cn.myapps.webservice.client.WorkService.class.isAssignableFrom(serviceEndpointInterface)) {
                cn.myapps.webservice.client.WorkServiceSoapBindingStub _stub = new cn.myapps.webservice.client.WorkServiceSoapBindingStub(new java.net.URL(WorkService_address), this);
                _stub.setPortName(getWorkServiceWSDDServiceName());
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
        if ("WorkService".equals(inputPortName)) {
            return getWorkService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://client.webservice.myapps.cn", "WorkServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://client.webservice.myapps.cn", "WorkService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WorkService".equals(portName)) {
            setWorkServiceEndpointAddress(address);
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
