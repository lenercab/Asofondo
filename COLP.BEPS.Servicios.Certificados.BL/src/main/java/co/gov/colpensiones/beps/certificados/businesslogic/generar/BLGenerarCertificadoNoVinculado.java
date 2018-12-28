package co.gov.colpensiones.beps.certificados.businesslogic.generar;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import co.gov.colpensiones.beps.certificados.businesslogic.BLCertificado;
import co.gov.colpensiones.beps.certificados.businesslogic.comun.TipoCertificado;
import co.gov.colpensiones.beps.comunes.utilidades.Constantes;
import co.gov.colpensiones.beps.comunes.utilidades.ConstantesLoggerServicios;
import co.gov.colpensiones.beps.comunes.utilidades.Validador;
import co.gov.colpensiones.beps.excepciones.DataAccessException;
import co.gov.colpensiones.beps.excepciones.FunctionalException;
import co.gov.colpensiones.beps.excepciones.LogicalException;
import co.gov.colpensiones.beps.generadorcertificados.constantes.ConstantesGeneracionCertificados;
import co.gov.colpensiones.beps.log.ConstantesLogger;
import co.gov.colpensiones.beps.log.LoggerBeps;
import co.gov.colpensiones.beps.schemas._1_0.certificados.TipoInformacionCertificadoNoVinculado;
import co.gov.colpensiones.beps.schemas._1_0.certificados.TipoInformacionContexto;
import co.gov.colpensiones.beps.schemas._1_0.certificados.TipoRespuestaCertificadoDTO;

/**
 * <b>Descripción:</b> Clase que contiene la lógica de negocio para la generación del certificado para No vinculado.<br/>
 * <b>Caso de Uso:</b> GVI-VIN-3-FAB-10-GenerarCertificadoNoVinculado.<br/>
 *
 * @author Cristian Alexander Salazar Perdomo <csalazar@heinsohn.com.co>
 */
public class BLGenerarCertificadoNoVinculado extends BLCertificado{
    
    /**
     * Método constructor.
     * 
     * @param log, log asociado a la funcionalidad.
     */
    public BLGenerarCertificadoNoVinculado(LoggerBeps log) {
        super(log);
    }
    
    /**
     * Método encargado de validar la información de entrada y la generación del certificado del vinculado.
     * @param informacionContexto, información de contexto para el servicio.
     * @param informacionCertificado, información para la generación del certificado.
     * @return TipoRespuestaCertificadoDTO respuesta del servicio.
     */
    public TipoRespuestaCertificadoDTO generarCertificadoNoVinculado(TipoInformacionContexto informacionContexto, 
    		TipoInformacionCertificadoNoVinculado tipoInformacionCertificadoNoVinculado){
    	initMetadata(tipoInformacionCertificadoNoVinculado, informacionContexto);
    	HashMap<String, Object> payLoadTrace = new HashMap<String, Object>();
    	tracer.inicio();
    	
    	payLoadTrace.put(ConstantesLogger.OBJETO_CONTEXTO_ENTRADA, informacionContexto);
        payLoadTrace.put(ConstantesLogger.OBJETO_NEGOCIO_ENTRADA, tipoInformacionCertificadoNoVinculado);
		tracer.getLogger().trace(payLoadTrace, tracer.getMetadata());
		
    	TipoRespuestaCertificadoDTO respuestaServicio=new TipoRespuestaCertificadoDTO();
    	HashMap<String, Object> payLoad = new HashMap<String, Object>();
    	try {
    		/* validar la obligatoridad de los datos de entrada */
			StringBuffer lstErrores = new StringBuffer();
			lstErrores.append(this.validarDatosEntradaObligatorioNoVinculado(informacionContexto,tipoInformacionCertificadoNoVinculado));
			/* validar existencia errores */
			if (lstErrores.toString().length() > 0) {
				respuestaServicio.setEstadoEjecucion(respuestaNegocioServicio(Constantes.COD_CAMPOS_OBLIGATORIO_NO_RECIBIDO,lstErrores.toString()));
	            payLoad.put(Constantes.MSJ_ERROR_LOG, lstErrores.toString());
				tracer.getLogger().error(payLoad,tracer.getMetadata());
			}else{
				/* validar el formato de los datos de entrada */
				lstErrores.append(this.validarDatosEntradaFormatoNoVinculado(informacionContexto,tipoInformacionCertificadoNoVinculado));
				/* validar existencia errores */
				if(lstErrores.toString().length() > 0) {
					respuestaServicio.setEstadoEjecucion(respuestaNegocioServicio(Constantes.COD_FORMATO_INVALIDO_OBLIGATORIO_NO_RECIBIDO,lstErrores.toString()));
					payLoad.put(Constantes.MSJ_ERROR_LOG, lstErrores.toString());
					tracer.getLogger().error(payLoad,tracer.getMetadata());
				}
				else{
					/* logica del servicio */
					respuestaServicio = logicaGenerarCertificado(informacionContexto, tipoInformacionCertificadoNoVinculado);
				}
			}
		} catch (Exception e) {
			generarLogError(new FunctionalException(new HashMap<String,Object>(), tracer.getMetadata(), e));
			respuestaServicio = respuestaErrorTecnicoServicio();
		}
    	tracer.fin(ConstantesGeneracionCertificados.TRACER_CERTIFICADO_NO_VINCULADO);
		payLoadTrace.put(ConstantesLogger.OBJETO_NEGOCIO_SALIDA, respuestaServicio);
		tracer.getMetadata().put(ConstantesLoggerServicios.METADATA_TIEMPO_EJECUCION, String.valueOf(tracer.duracion())); 
		tracer.getLogger().trace(payLoadTrace, tracer.getMetadata());
		
		return respuestaServicio;
    	
    }
   
	/**
     * Método encargado de realizar la generación del certificado del vinculado.
     * @param informacionContexto, información de contexto para el servicio.
     * @param informacionCertificado, información para la generación del certificado.
     * @return TipoRespuestaCertificadoDTO respuesta del servicio.
     */
    private TipoRespuestaCertificadoDTO logicaGenerarCertificado(TipoInformacionContexto informacionContexto, 
    		TipoInformacionCertificadoNoVinculado informacionCertificado){
        Map<String,Object> datos = null;
  		Map<String,Object> parametros = null;
  		TipoRespuestaCertificadoDTO respuesta = null;
  		String nombreCiudadano="";
  		
      	try{
      		/* Consulta los datos del vinculado en el sistema de gestión Beps*/
      		datos = consultarInformacionNoVinculado(informacionCertificado.getDocumento());
      		if(!datos.containsKey(ConstantesGeneracionCertificados.NOMBRE_VINCULADO))
      		{
      			datos.put(ConstantesGeneracionCertificados.NOMBRE_VINCULADO, informacionCertificado.getNombreCiudadano());
      			datos.put(ConstantesGeneracionCertificados.VINCULADO_NUMERO_DOCUMENTO, informacionCertificado.getDocumento().getNumeroDocumento());
      		}
      		/* modifica el nombre del ciudadano para que sea todo en mayuscula*/
      		nombreCiudadano=datos.get(ConstantesGeneracionCertificados.NOMBRE_VINCULADO).toString().toUpperCase();
      		datos.remove(ConstantesGeneracionCertificados.NOMBRE_VINCULADO);
      		datos.put(ConstantesGeneracionCertificados.NOMBRE_VINCULADO, nombreCiudadano);
      		
      		/* Consulta los datos parametricos en el sistema de gestión Beps*/
      		parametros = consultarParametrosCertificados(informacionCertificado.getInformacionOrigen().getMunicipioSistemaOrigen(),informacionContexto.getSistemaOrigen());
      		/* Organiza los datos consultados del vinculado, los parametricos, y la información recibida por el servicio */
      		datos=prepararDatosParametros(TipoCertificado.CERTIFICADO_NO_VINCULADO,datos,parametros,informacionCertificado);
      		
      		File certificado = generarPDF(TipoCertificado.CERTIFICADO_NO_VINCULADO, datos, parametros);
      		respuesta=respuestaExitosaServicio(certificado);
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
      		/* valida el tipo de exepcion funcional*/
      		generarLogError(fe);
      		if(Constantes.MSJ_DOCUMENTO_ECONTRADO_VINCULADO.equals(fe.getErrorInterno().getMessage())){      			
      			respuesta = respuestaDocumentoEncontradoVinculado();
      		}else{
      			/*cuando no existe la firma*/
      			respuesta = respuestaDatosFirma();
      		}
      	}
      	catch(Exception e){
      		generarLogError(new FunctionalException(new HashMap<String,Object>(), tracer.getMetadata(), e));
      		respuesta = respuestaErrorTecnicoServicio();
      	}
      	return respuesta;
      }
    
    /**
     * Valida la informacion de no vinculado para el formato de los campos obligatorios
     * @param informacionContexto, información de contexto para el servicio.
     * @param tipoInformacionCertificadoNoVinculado, información para la generación del certificado.
	 * @return lstErrores, errores de validacion.
	 */
	private String validarDatosEntradaFormatoNoVinculado(TipoInformacionContexto informacionContexto,
			TipoInformacionCertificadoNoVinculado tipoInformacionCertificadoNoVinculado) throws Exception {
		StringBuffer lstErrores = new StringBuffer();
		
		/* validadcion de numero de documento */
		lstErrores.append(new Validador<TipoInformacionCertificadoNoVinculado>().ValidarDataContract(tipoInformacionCertificadoNoVinculado));
		if (tipoInformacionCertificadoNoVinculado.getNombreCiudadano().trim().isEmpty()) {
			lstErrores.append(Constantes.MSJ_ERROR_DATO_ESPACIO.replace(Constantes.PARAMETRO0, "NombreCiudadano"));
		}
		lstErrores.append(this.validarDatosEntradaFormato(informacionContexto,tipoInformacionCertificadoNoVinculado));
		return lstErrores.toString();
	}

	/**
     * Valida la informacion de no vinculado para los campos obligatorios
     * @param informacionContexto, información de contexto para el servicio.
     * @param tipoInformacionCertificadoNoVinculado, información para la generación del certificado.
	 * @return lstErrores, errores de validacion.
	 */
	private String validarDatosEntradaObligatorioNoVinculado(TipoInformacionContexto informacionContexto,
			TipoInformacionCertificadoNoVinculado tipoInformacionCertificadoNoVinculado) throws Exception {
		StringBuffer lstErrores = new StringBuffer();
		if(tipoInformacionCertificadoNoVinculado!=null){
			/* valida a nombre ciudadano*/
			if(tipoInformacionCertificadoNoVinculado.getNombreCiudadano()==null || tipoInformacionCertificadoNoVinculado.getNombreCiudadano().isEmpty()){
				lstErrores.append(Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, "NombreCiudadano"));
			}
		}
		lstErrores.append(this.validarDatosEntradaObligatorio(informacionContexto,tipoInformacionCertificadoNoVinculado));
		
		return lstErrores.toString();
	}

}

