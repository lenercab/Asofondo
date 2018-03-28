package co.gov.colpensiones.www.beps.contracts._1_0.novedadesbuc;

public class SrvGenerarNovedadesBucProxy implements co.gov.colpensiones.www.beps.contracts._1_0.novedadesbuc.SrvGenerarNovedadesBuc_PortType {
  private String _endpoint = null;
  private co.gov.colpensiones.www.beps.contracts._1_0.novedadesbuc.SrvGenerarNovedadesBuc_PortType srvGenerarNovedadesBuc_PortType = null;
  
  public SrvGenerarNovedadesBucProxy() {
    _initSrvGenerarNovedadesBucProxy();
  }
  
  public SrvGenerarNovedadesBucProxy(String endpoint) {
    _endpoint = endpoint;
    _initSrvGenerarNovedadesBucProxy();
  }
  
  private void _initSrvGenerarNovedadesBucProxy() {
    try {
      srvGenerarNovedadesBuc_PortType = (new co.gov.colpensiones.www.beps.contracts._1_0.novedadesbuc.SrvGenerarNovedadesBuc_ServiceLocator()).getSrvGenerarNovedadesBucImplPort();
      if (srvGenerarNovedadesBuc_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)srvGenerarNovedadesBuc_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)srvGenerarNovedadesBuc_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (srvGenerarNovedadesBuc_PortType != null)
      ((javax.xml.rpc.Stub)srvGenerarNovedadesBuc_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public co.gov.colpensiones.www.beps.contracts._1_0.novedadesbuc.SrvGenerarNovedadesBuc_PortType getSrvGenerarNovedadesBuc_PortType() {
    if (srvGenerarNovedadesBuc_PortType == null)
      _initSrvGenerarNovedadesBucProxy();
    return srvGenerarNovedadesBuc_PortType;
  }
  
  public co.gov.colpensiones.www.beps.schemas._1_0.comun.TipoEstadoEjecucion generarNovedad(long idBitacoraNovedad) throws java.rmi.RemoteException{
    if (srvGenerarNovedadesBuc_PortType == null)
      _initSrvGenerarNovedadesBucProxy();
    return srvGenerarNovedadesBuc_PortType.generarNovedad(idBitacoraNovedad);
  }
  
  
}