/**
 * WS_BDUALocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.gov.colpensiones.bdua.contracts._1_0.personas;

import co.gov.colpensiones.beps.comunes.utilidades.Util;

public class WS_BDUALocator extends org.apache.axis.client.Service implements co.gov.colpensiones.bdua.contracts._1_0.personas.WS_BDUA {

	public WS_BDUALocator() throws Exception {
    	ServicioWebViabilidadPort_address = Util.obtenerUrlServicioWebViabilidad();
    }

    public WS_BDUALocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WS_BDUALocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ServicioWebViabilidadPort
    private java.lang.String ServicioWebViabilidadPort_address = "http://835JZ32:8080/COLP.BEPS.Servicios.Bdua/WS_BDUA/ServicioWebViabilidad";

    public java.lang.String getServicioWebViabilidadPortAddress() {
        return ServicioWebViabilidadPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ServicioWebViabilidadPortWSDDServiceName = "ServicioWebViabilidadPort";

    public java.lang.String getServicioWebViabilidadPortWSDDServiceName() {
        return ServicioWebViabilidadPortWSDDServiceName;
    }

    public void setServicioWebViabilidadPortWSDDServiceName(java.lang.String name) {
        ServicioWebViabilidadPortWSDDServiceName = name;
    }

    public co.gov.colpensiones.www.bdua.contracts._1_0.personas.ServicioWebViabilidad getServicioWebViabilidadPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ServicioWebViabilidadPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getServicioWebViabilidadPort(endpoint);
    }

    public co.gov.colpensiones.www.bdua.contracts._1_0.personas.ServicioWebViabilidad getServicioWebViabilidadPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            co.gov.colpensiones.bdua.contracts._1_0.personas.WS_BDUASoapBindingStub _stub = new co.gov.colpensiones.bdua.contracts._1_0.personas.WS_BDUASoapBindingStub(portAddress, this);
            _stub.setPortName(getServicioWebViabilidadPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setServicioWebViabilidadPortEndpointAddress(java.lang.String address) {
        ServicioWebViabilidadPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (co.gov.colpensiones.www.bdua.contracts._1_0.personas.ServicioWebViabilidad.class.isAssignableFrom(serviceEndpointInterface)) {
                co.gov.colpensiones.bdua.contracts._1_0.personas.WS_BDUASoapBindingStub _stub = new co.gov.colpensiones.bdua.contracts._1_0.personas.WS_BDUASoapBindingStub(new java.net.URL(ServicioWebViabilidadPort_address), this);
                _stub.setPortName(getServicioWebViabilidadPortWSDDServiceName());
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
        if ("ServicioWebViabilidadPort".equals(inputPortName)) {
            return getServicioWebViabilidadPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://personas._1_0.contracts.bdua.colpensiones.gov.co/", "WS_BDUA");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://personas._1_0.contracts.bdua.colpensiones.gov.co/", "ServicioWebViabilidadPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ServicioWebViabilidadPort".equals(portName)) {
            setServicioWebViabilidadPortEndpointAddress(address);
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
