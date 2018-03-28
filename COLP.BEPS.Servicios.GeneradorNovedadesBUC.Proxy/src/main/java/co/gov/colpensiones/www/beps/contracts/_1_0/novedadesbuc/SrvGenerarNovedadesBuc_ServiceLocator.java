/**
 * SrvGenerarNovedadesBuc_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.gov.colpensiones.www.beps.contracts._1_0.novedadesbuc;

public class SrvGenerarNovedadesBuc_ServiceLocator extends org.apache.axis.client.Service implements co.gov.colpensiones.www.beps.contracts._1_0.novedadesbuc.SrvGenerarNovedadesBuc_Service {

    public SrvGenerarNovedadesBuc_ServiceLocator() {
    }


    public SrvGenerarNovedadesBuc_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SrvGenerarNovedadesBuc_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SrvGenerarNovedadesBucImplPort
    private java.lang.String SrvGenerarNovedadesBucImplPort_address = "http://172.16.15.19:8081/COLP.BEPS.ProcesosAutomaticos.GeneradorNovedadesBuc/SrvGenerarNovedadesBuc";

    public java.lang.String getSrvGenerarNovedadesBucImplPortAddress() {
        return SrvGenerarNovedadesBucImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SrvGenerarNovedadesBucImplPortWSDDServiceName = "SrvGenerarNovedadesBucImplPort";

    public java.lang.String getSrvGenerarNovedadesBucImplPortWSDDServiceName() {
        return SrvGenerarNovedadesBucImplPortWSDDServiceName;
    }

    public void setSrvGenerarNovedadesBucImplPortWSDDServiceName(java.lang.String name) {
        SrvGenerarNovedadesBucImplPortWSDDServiceName = name;
    }

    public co.gov.colpensiones.www.beps.contracts._1_0.novedadesbuc.SrvGenerarNovedadesBuc_PortType getSrvGenerarNovedadesBucImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SrvGenerarNovedadesBucImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSrvGenerarNovedadesBucImplPort(endpoint);
    }

    public co.gov.colpensiones.www.beps.contracts._1_0.novedadesbuc.SrvGenerarNovedadesBuc_PortType getSrvGenerarNovedadesBucImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            co.gov.colpensiones.www.beps.contracts._1_0.novedadesbuc.SrvGenerarNovedadesBucSoapBindingStub _stub = new co.gov.colpensiones.www.beps.contracts._1_0.novedadesbuc.SrvGenerarNovedadesBucSoapBindingStub(portAddress, this);
            _stub.setPortName(getSrvGenerarNovedadesBucImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSrvGenerarNovedadesBucImplPortEndpointAddress(java.lang.String address) {
        SrvGenerarNovedadesBucImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (co.gov.colpensiones.www.beps.contracts._1_0.novedadesbuc.SrvGenerarNovedadesBuc_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                co.gov.colpensiones.www.beps.contracts._1_0.novedadesbuc.SrvGenerarNovedadesBucSoapBindingStub _stub = new co.gov.colpensiones.www.beps.contracts._1_0.novedadesbuc.SrvGenerarNovedadesBucSoapBindingStub(new java.net.URL(SrvGenerarNovedadesBucImplPort_address), this);
                _stub.setPortName(getSrvGenerarNovedadesBucImplPortWSDDServiceName());
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
        if ("SrvGenerarNovedadesBucImplPort".equals(inputPortName)) {
            return getSrvGenerarNovedadesBucImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.colpensiones.gov.co/beps/contracts/1.0/novedadesbuc", "SrvGenerarNovedadesBuc");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.colpensiones.gov.co/beps/contracts/1.0/novedadesbuc", "SrvGenerarNovedadesBucImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SrvGenerarNovedadesBucImplPort".equals(portName)) {
            setSrvGenerarNovedadesBucImplPortEndpointAddress(address);
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
