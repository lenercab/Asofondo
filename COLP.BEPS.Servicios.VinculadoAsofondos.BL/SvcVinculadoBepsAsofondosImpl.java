package co.gov.colpensiones.beps.contracts._1_0.vinculadoasofondos.impl;


import javax.ejb.Stateless;
import javax.jws.WebService;

import co.gov.colpensiones.beps.comunes.utilidades.ConstantesLoggerServicios;
import co.gov.colpensiones.beps.contracts._1_0.vinculadoasofondos.SvcVinculadoBepsAsofondos;
import co.gov.colpensiones.beps.log.LoggerBeps;
import co.gov.colpensiones.beps.schemas._1_0.comun.TipoInformacionContextoExterno;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoDocumentoPersonaNatural;
import co.gov.colpensiones.beps.schemas._1_0.vinculadoasofondos.TipoInformacionSolicitanteDTO;
import co.gov.colpensiones.beps.vinculadoasofondos.businesslogic.consultar.BLConsultarVinculadoBepsAsofondos;



/**
 * <b>Descripción:</b> Clase que implementa las operaciones del servicio de Vinculado Asofondos. <br/>
 * <b>Caso de Uso:</b> GVI-VIN-3-FAB-14-ConsultarViabilidadVinculaciónAsofondos<br/>
 *
 *	@author Yesika Ramirez <yeramirez@heinsohn.com.co>
 */
@Stateless
@WebService(serviceName = "SvcVinculadoBepsAsofondos", endpointInterface = "co.gov.colpensiones.beps.contracts._1_0.vinculadoasofondos.SvcVinculadoBepsAsofondos", targetNamespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/vinculadoasofondos")
public class SvcVinculadoBepsAsofondosImpl implements SvcVinculadoBepsAsofondos {
     
    
    /**
     * Método encargado de  consultar  por tipo y número de documento de un solicitante, de la información registrada en el Sistema de Gestión BEPS, 
     * para determinar si es viable o inviable la vinculación al programa BEPS .
     * <b>Caso de Uso:</b> GVI-VIN-3-FAB-14-ConsultarViabilidadVinculacionAsofondos.<br/>
     * @param informacionContexto,
     * 			Información de contexto enviada al servicio.
     * @param identificacion, 
     * 			objeto TipoDocumentoPersonaNatural con la informaicon del documento de persona
     * @return Objeto TipoInformacionSolicitanteDTO con la información de respuesta del servicio
     */
	@Override
	public TipoInformacionSolicitanteDTO consultar(
			TipoInformacionContextoExterno informacionContextoExterno,
			TipoDocumentoPersonaNatural identificacion) {
			
			BLConsultarVinculadoBepsAsofondos blConsultarVinculadoBepsAsofondos = new BLConsultarVinculadoBepsAsofondos(new LoggerBeps(
	                ConstantesLoggerServicios.SERVICIO_VINCULADO_ASOFONDOS, informacionContextoExterno.getSistemaOrigen()));
			System.out.println("Entrando al metodo");
			return blConsultarVinculadoBepsAsofondos.consultarViabilidadVinculacion(informacionContextoExterno,identificacion);
	}
}