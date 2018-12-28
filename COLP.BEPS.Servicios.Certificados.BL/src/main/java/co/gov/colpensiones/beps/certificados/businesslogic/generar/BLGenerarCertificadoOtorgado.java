package co.gov.colpensiones.beps.certificados.businesslogic.generar;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import co.gov.colpensiones.beps.certificados.businesslogic.BLCertificado;
import co.gov.colpensiones.beps.certificados.businesslogic.comun.TipoCertificado;
import co.gov.colpensiones.beps.comunes.utilidades.Constantes;
import co.gov.colpensiones.beps.comunes.utilidades.ConstantesLoggerServicios;
import co.gov.colpensiones.beps.excepciones.DataAccessException;
import co.gov.colpensiones.beps.excepciones.FunctionalException;
import co.gov.colpensiones.beps.excepciones.LogicalException;
import co.gov.colpensiones.beps.generadorcertificados.constantes.ConstantesGeneracionCertificados;
import co.gov.colpensiones.beps.log.ConstantesLogger;
import co.gov.colpensiones.beps.log.LoggerBeps;
import co.gov.colpensiones.beps.schemas._1_0.certificados.TipoInformacionCertificado;
import co.gov.colpensiones.beps.schemas._1_0.certificados.TipoInformacionContexto;
import co.gov.colpensiones.beps.schemas._1_0.certificados.TipoRespuestaCertificadoDTO;

/**
 * <b>Descripción:</b> Clase que contiene la lógica de negocio para la generación del certificado por otorgamiento.<br/>
 * <b>Caso de Uso:</b> PT-INGE-014-GVI-VIN-3-FAB-11-GenerarCertificaciónVinculadoOtorgado.<br/>
 *
 * @author Arnold Rios Delgado <arrios@heinsohn.com.co>
 */
public class BLGenerarCertificadoOtorgado extends BLCertificado{
    
    /**
     * Método constructor.
     * 
     * @param log, log asociado a la funcionalidad.
     */
    public BLGenerarCertificadoOtorgado(LoggerBeps log) {
        super(log);
    }
    
    /**
     * Método encargado de validar la información de entrada y la generación del certificado por otorgamiento.
     * @param informacionContexto, información de contexto para el servicio.
     * @param informacionCertificado, información para la generación del certificado.
     * @return TipoRespuestaCertificadoDTO respuesta del servicio.
     */
    public TipoRespuestaCertificadoDTO generarCertificadoVinculadoOtorgado(TipoInformacionContexto informacionContexto, 
            TipoInformacionCertificado informacionCertificado){
    	initMetadata(informacionCertificado, informacionContexto);
    	HashMap<String, Object> payLoadTrace = new HashMap<String, Object>();
    	tracer.inicio();
    	
    	payLoadTrace.put(ConstantesLogger.OBJETO_CONTEXTO_ENTRADA, informacionContexto);
        payLoadTrace.put(ConstantesLogger.OBJETO_NEGOCIO_ENTRADA, informacionCertificado);
		tracer.getLogger().trace(payLoadTrace, tracer.getMetadata());
		
    	TipoRespuestaCertificadoDTO respuestaServicio=new TipoRespuestaCertificadoDTO();
    	HashMap<String, Object> payLoad = new HashMap<String, Object>();
    	try {
    		/* validar la obligatoridad de los datos de entrada */
			StringBuffer lstErrores = new StringBuffer();
			lstErrores.append(this.validarDatosEntradaObligatorio(informacionContexto,informacionCertificado));
			/* validar existencia errores */
			if (lstErrores.toString().length() > 0) {
				respuestaServicio.setEstadoEjecucion(respuestaNegocioServicio(Constantes.COD_CAMPOS_OBLIGATORIO_NO_RECIBIDO,lstErrores.toString()));
	            payLoad.put(Constantes.MSJ_ERROR_LOG, lstErrores.toString());
				tracer.getLogger().error(payLoad,tracer.getMetadata());
			}else{
				/* validar el formato de los datos de entrada */
				lstErrores.append(this.validarDatosEntradaFormato(informacionContexto,informacionCertificado));
				/* validar existencia errores */
				if(lstErrores.toString().length() > 0) {
					respuestaServicio.setEstadoEjecucion(respuestaNegocioServicio(Constantes.COD_FORMATO_INVALIDO_OBLIGATORIO_NO_RECIBIDO,lstErrores.toString()));
					payLoad.put(Constantes.MSJ_ERROR_LOG, lstErrores.toString());
					tracer.getLogger().error(payLoad,tracer.getMetadata());
				}
				else{
					/* logica del servicio */
					respuestaServicio = logicaGenerarCertificado(informacionContexto, informacionCertificado);
				}
			}
		} catch (Exception e) {
			generarLogError(new FunctionalException(new HashMap<String,Object>(), tracer.getMetadata(), e));
			respuestaServicio = respuestaErrorTecnicoServicio();
		}
    	tracer.fin(ConstantesGeneracionCertificados.TRACER_CERTIFICADO_OTORGADO);
		payLoadTrace.put(ConstantesLogger.OBJETO_NEGOCIO_SALIDA, respuestaServicio);
		tracer.getMetadata().put(ConstantesLoggerServicios.METADATA_TIEMPO_EJECUCION, String.valueOf(tracer.duracion())); 
		tracer.getLogger().trace(payLoadTrace, tracer.getMetadata());
		return respuestaServicio;
    	
    }
    
    /**
     * Método encargado de realizar la generación del certificado del vinculado otorgado.
     * @param informacionContexto, información de contexto para el servicio.
     * @param informacionCertificado, información para la generación del certificado.
     * @return TipoRespuestaCertificadoDTO respuesta del servicio.
     */
    private TipoRespuestaCertificadoDTO logicaGenerarCertificado(TipoInformacionContexto informacionContexto, 
            TipoInformacionCertificado informacionCertificado){

        Map<String,Object> datos = null;
		Map<String,Object> parametros = null;
		TipoRespuestaCertificadoDTO respuesta = null;
		
    	try{
    		/* Consulta los datos del vinculado en el sistema de gestión Beps*/
    		datos = consultarInformacionVinculadoOtorgado(informacionCertificado.getDocumento());
    		/* valida que exista destinación y que el estado sea diferente a fallecido*/
    		if(!datos.containsKey(ConstantesGeneracionCertificados.DESTINACION) || !datos.containsKey(ConstantesGeneracionCertificados.ESTADO)
    				|| ConstantesGeneracionCertificados.ESTADO_FALLECIDO.equals(datos.get(ConstantesGeneracionCertificados.ESTADO).toString())){
    				respuesta = respuestaNoCumpleCondiciones();
			} else {
				/* Consulta los datos parametricos en el sistema de gestión Beps */
				parametros = consultarParametrosCertificados(informacionCertificado.getInformacionOrigen().getMunicipioSistemaOrigen(),	informacionContexto.getSistemaOrigen());

				/* Organiza los datos consultados del vinculado, los parametricos, y la información recibida por el servicio */
				datos = prepararDatosParametros(TipoCertificado.CERTIFICADO_VINCULADO_OTORGADO, datos,	parametros, informacionCertificado);

				/* Valida si existe una observación parametrizada para el tipo destinacion	 */
				if (ConstantesGeneracionCertificados.SIN_OBSERVACION.equals(datos.get(ConstantesGeneracionCertificados.OBSERVACION))) {
					respuesta = respuestaObservacionNoParametrizada();
				} else {
					File certificado = generarPDF(TipoCertificado.CERTIFICADO_VINCULADO_OTORGADO,datos, parametros);
					respuesta = respuestaExitosaServicio(certificado);
				}
			}
    		
    	}
    	catch(DataAccessException dae){
    		generarLogError(dae);
    		respuesta = respuestaErrorTecnicoServicio();
    	}
    	catch(LogicalException le){
    		generarLogError(le);
    		respuesta = respuestaErrorTecnicoServicio();
    	}
    	catch(FunctionalException fe){
    		generarLogError(fe);
    		respuesta = respuestaDatosFirma();
    	}
    	catch(Exception e){
    		generarLogError(new FunctionalException(new HashMap<String,Object>(), tracer.getMetadata(), e));
    		respuesta = respuestaErrorTecnicoServicio();
    	}
    	return respuesta;
    }

}
