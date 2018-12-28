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
  
  public co.gov.colpensiones.www.bdua.contracts._1_0.personas.M_GestionVinculacionBEPS viabilidad(java.lang.String idCaso, java.lang.String tipoDocumento, java.lang.String numeroDocumento, java.lang.String primerNombre, java.lang.String primerApellido, boolean marcaActualizacion, java.lang.String area, java.lang.String tramite, java.lang.String subTramite) throws Exception{
    if (servicioWebViabilidad == null)
      _initServicioWebViabilidadProxy();
    return servicioWebViabilidad.viabilidad(idCaso, tipoDocumento, numeroDocumento, primerNombre, primerApellido, marcaActualizacion, area, tramite, subTramite);
  }
  
  public void asyncbzg(javax.xml.rpc.holders.StringHolder idCaso, java.lang.String tipoDocumento, java.lang.String numeroDocumento, java.lang.String primerNombre, java.lang.String primerApellido, boolean marcaActualizacion, java.lang.String area, java.lang.String tramite, java.lang.String subTramite, javax.xml.rpc.holders.StringHolder nombreEvento, javax.xml.rpc.holders.StringHolder respuesta, co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.TipoEstadoRespuestaHolder tipoEstadoRespuesta) throws Exception{
    if (servicioWebViabilidad == null)
      _initServicioWebViabilidadProxy();
    servicioWebViabilidad.asyncbzg(idCaso, tipoDocumento, numeroDocumento, primerNombre, primerApellido, marcaActualizacion, area, tramite, subTramite, nombreEvento, respuesta, tipoEstadoRespuesta);
  }
  
  
}