/**
 * SrvConsultarViabilidad_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.gov.colpensiones.www.beps.contracts._1_0.consultarviabilidad;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Remote;
import java.util.HashSet;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

import org.apache.axis.AxisFault;
import org.apache.axis.EngineConfiguration;
import org.apache.axis.client.Service;
import org.apache.axis.client.Stub;

public class SrvConsultarViabilidad_ServiceLocator extends Service implements
		SrvConsultarViabilidad_Service {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SrvConsultarViabilidad_ServiceLocator() {
	}

	public SrvConsultarViabilidad_ServiceLocator(EngineConfiguration config) {
		super(config);
	}

	public SrvConsultarViabilidad_ServiceLocator(String wsdlLoc, QName sName)
			throws javax.xml.rpc.ServiceException {
		super(wsdlLoc, sName);
	}

	// Use to get a proxy class for SrvConsultarViabilidadImplPort
	private String SrvConsultarViabilidadImplPort_address = "http://835JZ32:8080/COLP.BEPS.Servicios.Bdua/WS_BDUA";

	public String getSrvConsultarViabilidadImplPortAddress() {
		return SrvConsultarViabilidadImplPort_address;
	}

	// The WSDD service name defaults to the port name.
	private String SrvConsultarViabilidadImplPortWSDDServiceName = "ServicioWebViabilidadPort";

	public String getSrvConsultarViabilidadImplPortWSDDServiceName() {
		return SrvConsultarViabilidadImplPortWSDDServiceName;
	}

	public void setSrvConsultarViabilidadImplPortWSDDServiceName(String name) {
		SrvConsultarViabilidadImplPortWSDDServiceName = name;
	}

	public SrvConsultarViabilidad_PortType getSrvConsultarViabilidadImplPort()
			throws ServiceException {
		java.net.URL endpoint;
		try {
			endpoint = new URL(SrvConsultarViabilidadImplPort_address);
		} catch (MalformedURLException e) {
			throw new ServiceException(e);
		}
		return getSrvConsultarViabilidadImplPort(endpoint);
	}

	public SrvConsultarViabilidad_PortType getSrvConsultarViabilidadImplPort(
			URL portAddress) throws ServiceException {
		try {
			SrvConsultarViabilidadSoapBindingStub _stub = new SrvConsultarViabilidadSoapBindingStub(
					portAddress, this);
			_stub.setPortName(getSrvConsultarViabilidadImplPortWSDDServiceName());
			return _stub;
		} catch (AxisFault e) {
			return null;
		}
	}

	public void setSrvConsultarViabilidadImplPortEndpointAddress(String address) {
		SrvConsultarViabilidadImplPort_address = address;
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	public Remote getPort(Class serviceEndpointInterface)
			throws ServiceException {
		try {
			if (SrvConsultarViabilidad_PortType.class
					.isAssignableFrom(serviceEndpointInterface)) {
				SrvConsultarViabilidadSoapBindingStub _stub = new SrvConsultarViabilidadSoapBindingStub(
						new URL(SrvConsultarViabilidadImplPort_address), this);
				_stub.setPortName(getSrvConsultarViabilidadImplPortWSDDServiceName());
				return _stub;
			}
		} catch (Throwable t) {
			throw new ServiceException(t);
		}
		throw new ServiceException(
				"There is no stub implementation for the interface:  "
						+ (serviceEndpointInterface == null ? "null"
								: serviceEndpointInterface.getName()));
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	public Remote getPort(QName portName, Class serviceEndpointInterface)
			throws ServiceException {
		if (portName == null) {
			return getPort(serviceEndpointInterface);
		}
		String inputPortName = portName.getLocalPart();
		if ("ServicioWebViabilidadPort".equals(inputPortName)) {
			return getSrvConsultarViabilidadImplPort();
		} else {
			Remote _stub = getPort(serviceEndpointInterface);
			((Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	public QName getServiceName() {
		return new QName("http://personas._1_0.contracts.bdua.colpensiones.gov.co/", "WS_BDUA");
	}

	private HashSet ports = null;

	public Iterator getPorts() {
		if (ports == null) {
			ports = new HashSet();
			ports.add(new QName("http://personas._1_0.contracts.bdua.colpensiones.gov.co/", "ServicioWebViabilidadPort"));
		}
		return ports.iterator();
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(String portName, String address)
			throws ServiceException {

		if ("ServicioWebViabilidadPort".equals(portName)) {
			setSrvConsultarViabilidadImplPortEndpointAddress(address);
		} else { // Unknown Port Name
			throw new ServiceException("Cannot set Endpoint Address for Unknown Port" + portName);
		}
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(QName portName, String address)
			throws ServiceException {
		setEndpointAddress(portName.getLocalPart(), address);
	}

}
