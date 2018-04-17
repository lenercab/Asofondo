package co.gov.colpensiones.www.bdua.contracts._1_0.personas;

public class ServicioWebViabilidadProxy implements co.gov.colpensiones.www.bdua.contracts._1_0.personas.ServicioWebViabilidad {
  private String _endpoint = null;
  private co.gov.colpensiones.www.bdua.contracts._1_0.personas.ServicioWebViabilidad servicioWebViabilidad = null;
  
  public ServicioWebViabilidadProxy() throws Exception {
    _initServicioWebViabilidadProxy();
  }
  
  public ServicioWebViabilidadProxy(String endpoint) throws Exception {
    _endpoint = endpoint;
    _initServicioWebViabilidadProxy();
  }
  
  private void _initServicioWebViabilidadProxy() throws Exception {
    try {
      servicioWebViabilidad = (new co.gov.colpensiones.bdua.contracts._1_0.personas.WS_BDUALocator()).getServicioWebViabilidadPort();
      if (servicioWebViabilidad != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)servicioWebViabilidad)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)servicioWebViabilidad)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (servicioWebViabilidad != null)
      ((javax.xml.rpc.Stub)servicioWebViabilidad)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public co.gov.colpensiones.www.bdua.contracts._1_0.personas.ServicioWebViabilidad getServicioWebViabilidad() throws Exception {
    if (servicioWebViabilidad == null)
      _initServicioWebViabilidadProxy();
    return servicioWebViabilidad;
  }
  
  public void viabilidad(java.lang.String area, java.lang.String idCaso, boolean marcaActualizacion, java.lang.String numeroDocumento, java.lang.String primerApellido, java.lang.String primerNombre, java.lang.String subTramite, java.lang.String tipoDocumento, java.lang.String tramite, co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.CausalesNoViabilidadBEPSHolder causalesNoViabilidadBEPS, co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.IdMTramiteHolder idM_Tramite, co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.InformacionViablidadHolder informacionViablidad, co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.MCiudadanoBDUAHolder m_CiudadanoBDUA, co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.MCiudadanoBepsHolder m_CiudadanoBeps, co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.MCiudadanoRegistraduriaHolder m_CiudadanoRegistraduria, co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.MCiudadanosConsultadosHolder m_CiudadanosConsultados, co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.MGestionVinculacionBEPSHolder m_GestionVinculacionBEPS, co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.MInformacionBDUAHolder m_InformacionBDUA, co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.TipoEstadoRespuestaHolder tipoEstadoRespuesta) throws Exception{
    if (servicioWebViabilidad == null)
      _initServicioWebViabilidadProxy();
    servicioWebViabilidad.viabilidad(area, idCaso, marcaActualizacion, numeroDocumento, primerApellido, primerNombre, subTramite, tipoDocumento, tramite, causalesNoViabilidadBEPS, idM_Tramite, informacionViablidad, m_CiudadanoBDUA, m_CiudadanoBeps, m_CiudadanoRegistraduria, m_CiudadanosConsultados, m_GestionVinculacionBEPS, m_InformacionBDUA, tipoEstadoRespuesta);
  }
  
  public void asyncbzg(java.lang.String area, javax.xml.rpc.holders.StringHolder idCaso, boolean marcaActualizacion, java.lang.String numeroDocumento, java.lang.String primerApellido, java.lang.String primerNombre, java.lang.String subTramite, java.lang.String tipoDocumento, java.lang.String tramite, javax.xml.rpc.holders.StringHolder nombreEvento, javax.xml.rpc.holders.StringHolder respuesta) throws Exception{
    if (servicioWebViabilidad == null)
      _initServicioWebViabilidadProxy();
    servicioWebViabilidad.asyncbzg(area, idCaso, marcaActualizacion, numeroDocumento, primerApellido, primerNombre, subTramite, tipoDocumento, tramite, nombreEvento, respuesta);
  }
  
  
}