package co.gov.colpensiones.www.beps.contracts._1_0.consultarviabilidad;

import java.rmi.RemoteException;

import javax.xml.rpc.Stub;

import co.gov.colpensiones.www.beps.schemas._1_0.comun.TipoEstadoEjecucion;

public class SrvConsultarViabilidadProxy implements SrvConsultarViabilidad_PortType {
  private String _endpoint = null;
  private SrvConsultarViabilidad_PortType srvConsultarViabilidad_PortType = null;
  
  public SrvConsultarViabilidadProxy() {
    _initSrvConsultarViabilidadProxy();
  }
  
  public SrvConsultarViabilidadProxy(String endpoint) {
    _endpoint = endpoint;
    _initSrvConsultarViabilidadProxy();
  }
  
  private void _initSrvConsultarViabilidadProxy() {
    try {
      srvConsultarViabilidad_PortType = (new SrvConsultarViabilidad_ServiceLocator()).getSrvConsultarViabilidadImplPort();
      if (srvConsultarViabilidad_PortType != null) {
        if (_endpoint != null)
          ((Stub)srvConsultarViabilidad_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((Stub)srvConsultarViabilidad_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (srvConsultarViabilidad_PortType != null)
      ((Stub)srvConsultarViabilidad_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public SrvConsultarViabilidad_PortType getSrvConsultarViabilidad_PortType() {
    if (srvConsultarViabilidad_PortType == null)
      _initSrvConsultarViabilidadProxy();
    return srvConsultarViabilidad_PortType;
  }
  
  public TipoEstadoEjecucion consultarViabilidad(String nroIdentificacion, String tipoIdentificacion) throws RemoteException{
    if (srvConsultarViabilidad_PortType == null)
      _initSrvConsultarViabilidadProxy();
    return srvConsultarViabilidad_PortType.consultarViabilidad(nroIdentificacion, tipoIdentificacion);
  }
  
  
}