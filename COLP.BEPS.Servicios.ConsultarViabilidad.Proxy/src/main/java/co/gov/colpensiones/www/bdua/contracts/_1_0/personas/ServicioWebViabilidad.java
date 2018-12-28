/**
 * ServicioWebViabilidad.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.gov.colpensiones.www.bdua.contracts._1_0.personas;

public interface ServicioWebViabilidad extends java.rmi.Remote {
    public co.gov.colpensiones.www.bdua.contracts._1_0.personas.M_GestionVinculacionBEPS viabilidad(java.lang.String idCaso, java.lang.String tipoDocumento, java.lang.String numeroDocumento, java.lang.String primerNombre, java.lang.String primerApellido, boolean marcaActualizacion, java.lang.String area, java.lang.String tramite, java.lang.String subTramite) throws java.rmi.RemoteException, Exception;
    public void asyncbzg(javax.xml.rpc.holders.StringHolder idCaso, java.lang.String tipoDocumento, java.lang.String numeroDocumento, java.lang.String primerNombre, java.lang.String primerApellido, boolean marcaActualizacion, java.lang.String area, java.lang.String tramite, java.lang.String subTramite, javax.xml.rpc.holders.StringHolder nombreEvento, javax.xml.rpc.holders.StringHolder respuesta, co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.TipoEstadoRespuestaHolder tipoEstadoRespuesta) throws java.rmi.RemoteException, Exception;
}
