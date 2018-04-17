/**
 * ServicioWebViabilidad.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.gov.colpensiones.www.bdua.contracts._1_0.personas;

public interface ServicioWebViabilidad extends java.rmi.Remote {
    public void viabilidad(java.lang.String area, java.lang.String idCaso, boolean marcaActualizacion, java.lang.String numeroDocumento, java.lang.String primerApellido, java.lang.String primerNombre, java.lang.String subTramite, java.lang.String tipoDocumento, java.lang.String tramite, co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.CausalesNoViabilidadBEPSHolder causalesNoViabilidadBEPS, co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.IdMTramiteHolder idM_Tramite, co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.InformacionViablidadHolder informacionViablidad, co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.MCiudadanoBDUAHolder m_CiudadanoBDUA, co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.MCiudadanoBepsHolder m_CiudadanoBeps, co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.MCiudadanoRegistraduriaHolder m_CiudadanoRegistraduria, co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.MCiudadanosConsultadosHolder m_CiudadanosConsultados, co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.MGestionVinculacionBEPSHolder m_GestionVinculacionBEPS, co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.MInformacionBDUAHolder m_InformacionBDUA, co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.TipoEstadoRespuestaHolder tipoEstadoRespuesta) throws java.rmi.RemoteException, Exception;
    public void asyncbzg(java.lang.String area, javax.xml.rpc.holders.StringHolder idCaso, boolean marcaActualizacion, java.lang.String numeroDocumento, java.lang.String primerApellido, java.lang.String primerNombre, java.lang.String subTramite, java.lang.String tipoDocumento, java.lang.String tramite, javax.xml.rpc.holders.StringHolder nombreEvento, javax.xml.rpc.holders.StringHolder respuesta) throws java.rmi.RemoteException, Exception;
}
