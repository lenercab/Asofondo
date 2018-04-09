/**
 * SrvConsultarViabilidad_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.gov.colpensiones.www.beps.contracts._1_0.consultarviabilidad;

import java.rmi.Remote;
import java.rmi.RemoteException;

import co.gov.colpensiones.www.beps.schemas._1_0.comun.TipoEstadoEjecucion;

public interface SrvConsultarViabilidad_PortType extends Remote {
    public TipoEstadoEjecucion consultarViabilidad(String nroIdentificacion, String tipoIdentificacion) throws RemoteException;
}
