/**
 * SrvConsultarViabilidad_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.gov.colpensiones.www.beps.contracts._1_0.consultarviabilidad;

import java.net.URL;

import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;

public interface SrvConsultarViabilidad_Service extends Service {
    public String getSrvConsultarViabilidadImplPortAddress();

    public SrvConsultarViabilidad_PortType getSrvConsultarViabilidadImplPort() throws ServiceException;

    public SrvConsultarViabilidad_PortType getSrvConsultarViabilidadImplPort(URL portAddress) throws ServiceException;
}
