package co.gov.colpensiones.beps.contracts._1_0.prestacioneseconomicas.impl;

import javax.ejb.Stateless;
import javax.jws.WebService;

import co.gov.colpensiones.beps.beneficios.businesslogic.crear.BLRegistrarSolicitud;
import co.gov.colpensiones.beps.beneficios.businesslogic.crear.BLRegistrarSolicitudHerederos;
import co.gov.colpensiones.beps.comunes.utilidades.ConstantesLoggerServicios;
import co.gov.colpensiones.beps.contracts._1_0.prestacioneseconomicas.SvcBeneficios;
import co.gov.colpensiones.beps.log.LoggerBeps;
import co.gov.colpensiones.beps.schemas._1_0.comun.TipoEstadoEjecucion;
import co.gov.colpensiones.beps.schemas._1_0.comun.TipoInformacionContexto;
import co.gov.colpensiones.beps.schemas._1_0.prestacioneseconomicas.TipoSolicitudDestinacionRecursos;
import co.gov.colpensiones.beps.schemas._1_0.prestacioneseconomicas.TipoSolicitudDevolucionAhorrosHerederos;

/**
 * <b>Descripción:</b> Clase que expone los métodos del servicio de Beneficios.<br/>
 * <b>Caso de Uso:</b> GOI-OTO-1-FAB-15-RegistrarSolicitudDestinacionRecursos<br/>
 *
 * @author csalazar <csalazar@heinsohn.com.co>
 */
@Stateless
@WebService(name = "ContratoSvcBeneficios", endpointInterface = "co.gov.colpensiones.beps.contracts._1_0.prestacioneseconomicas.SvcBeneficios", targetNamespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/prestacioneseconomicas")
public class SvcBeneficiosImpl implements SvcBeneficios {

    /**
     * Método para realizar la operación de registro de solicitud de otorgamiento.
     * @param informacionContexto Información de contexto para el servicio.
     * @param informacionSolicitudDestinacionRecursos información de la solicitud de otorgamiento.
     * @return TipoEstadoEjecucion
     */
	public TipoEstadoEjecucion registrarSolicitud(TipoInformacionContexto informacionContexto,
			TipoSolicitudDestinacionRecursos informacionSolicitudDestinacionRecursos) {

		BLRegistrarSolicitud blRegistrarSolicitud = new BLRegistrarSolicitud(new LoggerBeps(
				ConstantesLoggerServicios.SERVICIO_BENEFICIOS_REGISTRAR_SOLICITUD, informacionContexto.getSistemaOrigen()));
		return blRegistrarSolicitud.registrarSolicitud(informacionContexto, informacionSolicitudDestinacionRecursos);
	}
	
    /**
     * Método para realizar la operación de registro de solicitud de devolución de ahorros a herederos.
     * @param informacionContexto Información de contexto para el servicio.
     * @param informacionSolicitudDevolucionAhorrosHerederos Información de la solicitud de devolucion a herederos.
     * @return TipoEstadoEjecucion
     */    
    public TipoEstadoEjecucion registrarSolicitudHerederos(TipoInformacionContexto informacionContexto,
        TipoSolicitudDevolucionAhorrosHerederos informacionSolicitudDevolucionAhorrosHerederos){
        
        BLRegistrarSolicitudHerederos blRegistrarSolicitudHerederos = new BLRegistrarSolicitudHerederos(new LoggerBeps(
                ConstantesLoggerServicios.SERVICIO_BENEFICIOS_REGISTRAR_SOLICITUD_HEREDEROS, informacionContexto.getSistemaOrigen()));
        return blRegistrarSolicitudHerederos.registrarSolicitud(informacionContexto, informacionSolicitudDevolucionAhorrosHerederos);
    
    }
}