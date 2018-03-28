package co.gov.colpensiones.beps.contracts._1_0.prestacioneseconomicas;

import javax.ejb.Local;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * <b>Descripción:</b> Clase que expone los métodos del servicio de Beneficios.<br/>
 * <b>Caso de Uso:</b> GOI-OTO-1-FAB-15-RegistrarSolicitudDestinacionRecursos<br/>
 * 
 */
@Local
@WebService(targetNamespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/prestacioneseconomicas", name = "ContratoSvcBeneficios")
@XmlSeeAlso({ObjectFactory.class, co.gov.colpensiones.beps.schemas._1_0.comun.ObjectFactory.class, co.gov.colpensiones.beps.schemas._1_0.personas.ObjectFactory.class, co.gov.colpensiones.beps.schemas._1_0.prestacioneseconomicas.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SvcBeneficios {

    /**
     * Método para realizar la operación de registro de solicitud de otorgamiento.
     * @param informacionContexto Información de contexto para el servicio.
     * @param informacionSolicitudDestinacionRecursos información de la solicitud de otorgamiento.
     * @return TipoEstadoEjecucion
     */
    @WebResult(name = "tipoEstadoEjecucion", targetNamespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/prestacioneseconomicas", partName = "EstadoEjecucion")
    @WebMethod(operationName = "RegistrarSolicitud", action = "http://www.colpensiones.gov.co/beps/contracts/1.0/prestacioneseconomicas/RegistrarSolicitud")
    public co.gov.colpensiones.beps.schemas._1_0.comun.TipoEstadoEjecucion registrarSolicitud(
        @WebParam(partName = "InformacionContexto", name = "InformacionContexto", targetNamespace = "http://www.colpensiones.gov.co/beps/schemas/1.0/comun", header=true)
        co.gov.colpensiones.beps.schemas._1_0.comun.TipoInformacionContexto informacionContexto,
        @WebParam(partName = "InformacionSolicitudDestinacionRecursos", name = "informacionSolicitudDestinacionRecursos", targetNamespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/prestacioneseconomicas")
        co.gov.colpensiones.beps.schemas._1_0.prestacioneseconomicas.TipoSolicitudDestinacionRecursos informacionSolicitudDestinacionRecursos
    );
    
    /**
     * Método para realizar la operación de registro de una solicitud de devolución de ahorros a herederos.
     * @param informacionContexto Información de contexto para el servicio.
     * @param informacionSolicitudDevolucionAhorrosHerederos Información de la solicitud de devolucion a herederos.
     * @return TipoEstadoEjecucion
     */    
    @WebResult(name = "tipoEstadoEjecucion", targetNamespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/prestacioneseconomicas", partName = "EstadoEjecucion")
    @WebMethod(operationName = "RegistrarSolicitudHerederos", action = "http://www.colpensiones.gov.co/beps/contracts/1.0/prestacioneseconomicas/RegistrarSolicitudHerederos")
    public co.gov.colpensiones.beps.schemas._1_0.comun.TipoEstadoEjecucion registrarSolicitudHerederos(
        @WebParam(partName = "InformacionContexto", name = "InformacionContexto", targetNamespace = "http://www.colpensiones.gov.co/beps/schemas/1.0/comun", header=true)
        co.gov.colpensiones.beps.schemas._1_0.comun.TipoInformacionContexto informacionContexto,
        @WebParam(partName = "InformacionSolicitudDevolucionAhorrosHerederos", name = "informacionSolicitudDevolucionAhorrosHerederos", targetNamespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/prestacioneseconomicas")
        co.gov.colpensiones.beps.schemas._1_0.prestacioneseconomicas.TipoSolicitudDevolucionAhorrosHerederos informacionSolicitudDevolucionAhorrosHerederos
    );
}
