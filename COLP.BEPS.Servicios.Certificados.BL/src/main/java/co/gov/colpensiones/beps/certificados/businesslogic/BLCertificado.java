package co.gov.colpensiones.beps.certificados.businesslogic;

import java.io.File;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import co.gov.colpensiones.beps.certificados.businesslogic.comun.TipoCertificado;
import co.gov.colpensiones.beps.comunes.utilidades.Constantes;
import co.gov.colpensiones.beps.comunes.utilidades.ConstantesLoggerServicios;
import co.gov.colpensiones.beps.comunes.utilidades.Util;
import co.gov.colpensiones.beps.comunes.utilidades.Validador;
import co.gov.colpensiones.beps.excepciones.DataAccessException;
import co.gov.colpensiones.beps.excepciones.FunctionalException;
import co.gov.colpensiones.beps.excepciones.LogicalException;
import co.gov.colpensiones.beps.generadorcertificados.GeneradorCertificados;
import co.gov.colpensiones.beps.generadorcertificados.constantes.ConstantesGeneracionCertificados;
import co.gov.colpensiones.beps.log.LoggerBeps;
import co.gov.colpensiones.beps.log.TimeTracer;
import co.gov.colpensiones.beps.schemas._1_0.certificados.TipoInformacionCertificado;
import co.gov.colpensiones.beps.schemas._1_0.certificados.TipoInformacionContexto;
import co.gov.colpensiones.beps.schemas._1_0.certificados.TipoInformacionDestinatario;
import co.gov.colpensiones.beps.schemas._1_0.certificados.TipoInformacionFuncionario;
import co.gov.colpensiones.beps.schemas._1_0.certificados.TipoInformacionOrigen;
import co.gov.colpensiones.beps.schemas._1_0.certificados.TipoRespuestaCertificadoDTO;
import co.gov.colpensiones.beps.schemas._1_0.comun.TipoEstadoEjecucion;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoDocumentoPersonaNatural;

/**
 * <b>Descripción:</b> Clase que contiene lógica común para el servicio de certificados.<br/>
 *
 * @author Cristian Alexander Salazar Perdomo <csalazar@heinsohn.com.co>
 */
public class BLCertificado {

    /** Clase para el acceso a datos.*/
    protected DACertificado daCertificado = null;

    /** Atributo para tomar trazas de tiempo durante la ejecución del preproceso.*/
    protected TimeTracer tracer;
        
    /**
     * Método constructor
     * 
     * @param log, log asociado a la funcionalidad
     */
    public BLCertificado(LoggerBeps log) {
        this.tracer = new TimeTracer(log, new HashMap<String,String>());
        daCertificado=new DACertificado();
    }
    
    /**
     * Método encargado de inicializar la metadata del tracer
     * 
     * @param informacionCertificado Información de negocio de entrada al servicio
     */
    protected void initMetadata(TipoInformacionCertificado informacionCertificado, TipoInformacionContexto informacionContexto){
    	tracer.getMetadata().put(ConstantesLoggerServicios.METADATA_TIPO_DOCUMENTO, informacionCertificado.getDocumento().getTipoDocumento());
    	tracer.getMetadata().put(ConstantesLoggerServicios.METADATA_NUM_DOCUMENTO, informacionCertificado.getDocumento().getNumeroDocumento());
    	tracer.getMetadata().put(ConstantesLoggerServicios.METADATA_USUARIO_ULTIMO_CAMBIO, informacionContexto.getUsuarioSistemaExterno());
    }    
    
    /**
     * Método encargado de invocar el método del DA para consultar la información del vinculado para el servicio vinculado
     * @param vinculado, contiene tipo y numero documento
     */
    public Map<String,Object> consultarInformacionVinculado(TipoDocumentoPersonaNatural vinculado) throws DataAccessException{
    	try{
    		return daCertificado.consultarInformacionVinculado(vinculado);
    	}
    	catch(Exception e){
    		throw new DataAccessException(new HashMap<String,Object>(), tracer.getMetadata(), e);
    	}
    }
    /**
     * Método encargado de invocar el método del DA para consultar la información del vinculado otorgado para el servicio vinculado
     * @param vinculado, contiene tipo y numero documento
     */
    public Map<String,Object> consultarInformacionVinculadoOtorgado(TipoDocumentoPersonaNatural vinculado) throws DataAccessException{
    	try{
    		return daCertificado.consultarInformacionVinculadoOtorgado(vinculado);
    	}
    	catch(Exception e){
    		throw new DataAccessException(new HashMap<String,Object>(), tracer.getMetadata(), e);
    	}
    }
    
    /**
     * Método encargado de invocar el método del DA para consultar la información del vinculado para el servicio no vinculado
     * @param vinculado, contiene tipo y numero documento
     */
    public Map<String,Object> consultarInformacionNoVinculado(TipoDocumentoPersonaNatural noVinculado) throws FunctionalException,DataAccessException{
    	try{
    		return daCertificado.consultarInformacionNoVinculado(noVinculado);
    	}
    	catch(Exception e){
    		if (e instanceof FunctionalException) {
				throw (FunctionalException) e;
			}
    		else{
    		throw new DataAccessException(new HashMap<String,Object>(), tracer.getMetadata(), e);
    		}
    	}
    }
    /**
     * Método que permite consultar los parámetros de base de datos para la generación de los certificados.
     * @param sistemaOrigen,  Sistema origen desde el que se genera el certificado
     * @return HashMap con los parámetros para la generación del certificado <String,String> Nombre-Valor
     */
    public Map<String,Object> consultarParametrosCertificados(String codigoMunicipio,String sistemaOrigen) throws DataAccessException{
    	try{
    		return daCertificado.consultarParametrosCertificados(codigoMunicipio,sistemaOrigen);
    	}
     	catch(Exception e){
    		throw new DataAccessException(new HashMap<String,Object>(), tracer.getMetadata(), e);
    	}
    }

    /**
     * Método encargado de invocar el método para generar el pdf de la clase GeneradorCertificados.
     * @param vinculado, contiene tipo y numero documento
     */
    public File generarPDF(String tipoCertificado,
			Map<String, Object> datos,
			Map<String, Object> parametros) throws LogicalException{
    	try{
    		GeneradorCertificados generadorCertificados = new GeneradorCertificados();
    		return generadorCertificados.generarCertificado(tipoCertificado, datos, parametros, tracer);
    	}
     	catch(Exception e){
    		throw new LogicalException(new HashMap<String,Object>(), tracer.getMetadata(), e);
    	}
    }
    
    /**
     * Método que genera la traza de log de error del servicio.
     * 
     * @param metaData, datos del servicio
     * @param dataError, true si corresponde a un error de acceso a datos. False en caso contrario.
     * @param e, Excepción generada
     */
    protected void generarLogError(FunctionalException fe) {
    	fe.getPayLoad().put(Constantes.TIPO_ERROR, Constantes.SERVICIO_WEB);
    	fe.getPayLoad().put(Constantes.URL, "/COLP.BEPS.Servicios.Certificado/ContratoSvcCertificado");
    	fe.getPayLoad().put(ConstantesLoggerServicios.MENSAJE_ERROR, Constantes.ERROR + fe.getErrorInterno().getMessage());
    	if(fe instanceof DataAccessException){
    		fe.getPayLoad().put(Constantes.ERROR_BD, fe.getErrorInterno().getMessage());
    	}
        tracer.getLogger().error(fe);
    }

    /**
     * Método que retorna un objeto mapeando las constantes de código de error y respuesta fallida de un servicio.
     * 
     * @return tipoEstadoEjecucion, objeto que contiene la respuesta fallida del servicio
     */
    protected TipoRespuestaCertificadoDTO respuestaDatosFirma() {
    	TipoRespuestaCertificadoDTO respuestaServicio = new TipoRespuestaCertificadoDTO();
    	respuestaServicio.setEstadoEjecucion(respuestaNegocioServicio(Constantes.COD_ERROR_LOGICA_NEGOCIO, Constantes.MSJ_DATOS_FIRMA_NO_EXISTEN));
        return respuestaServicio;
    }
    
    /**
     * Método que retorna un objeto mapeando las constantes de código de error y respuesta fallida de un servicio.
     * 
     * @return tipoEstadoEjecucion, objeto que contiene la respuesta fallida del servicio
     */
    protected TipoRespuestaCertificadoDTO respuestaDocumentoEncontradoVinculado() {
    	TipoRespuestaCertificadoDTO respuestaServicio = new TipoRespuestaCertificadoDTO();
    	respuestaServicio.setEstadoEjecucion(respuestaNegocioServicio(Constantes.COD_ERROR_DOCUMENTO_ENCONTRADO_VINCULADO, Constantes.MSJ_DOCUMENTO_ECONTRADO_VINCULADO));
        return respuestaServicio;
    }
    
    /**
     * Método que retorna un objeto mapeando las constantes de código de error y respuesta fallida de un servicio.
     * 
     * @return tipoEstadoEjecucion, objeto que contiene la respuesta fallida del servicio
     */
    protected TipoRespuestaCertificadoDTO respuestaErrorTecnicoServicio() {
    	TipoRespuestaCertificadoDTO respuestaServicio = new TipoRespuestaCertificadoDTO();
    	respuestaServicio.setEstadoEjecucion(respuestaNegocioServicio(Constantes.COD_ERROR_INTERNO, Constantes.DESC_ERROR_INTERNO));
        return respuestaServicio;
    }
    
    /**
     * Método que retorna un objeto mapeando las constantes de código de error y respuesta del servicio.
     * codigo y mensaje de error para cuando vinculado está fallecido o no tiene solicitud de destinación 
     * @return tipoEstadoEjecucion, objeto que contiene la respuesta fallida del servicio
     */
    protected TipoRespuestaCertificadoDTO respuestaNoCumpleCondiciones() {
    	TipoRespuestaCertificadoDTO respuestaServicio = new TipoRespuestaCertificadoDTO();
    	respuestaServicio.setEstadoEjecucion(respuestaNegocioServicio(Constantes.COD_ERROR_NO_CUMPLE_CONDICIONES, Constantes.MSJ_ERROR_NO_CUMPLE_CONDICIONES));
        return respuestaServicio;
    }

    /**
     * Método que retorna un objeto mapeando las constantes de código de error y respuesta del servicio.
     * codigo y mensaje de error para cuando no se encuentra parametrizada una observación para el tipo de destinación
     * @return tipoEstadoEjecucion, objeto que contiene la respuesta fallida del servicio
     */
    protected TipoRespuestaCertificadoDTO respuestaObservacionNoParametrizada() {
    	TipoRespuestaCertificadoDTO respuestaServicio = new TipoRespuestaCertificadoDTO();
    	respuestaServicio.setEstadoEjecucion(respuestaNegocioServicio(Constantes.COD_ERROR_NO_PARAMETRIZADO_OBSERVACION, Constantes.MSJ_ERROR_NO_PARAMETRIZADO_OBSERVACION));
        return respuestaServicio;
    }
    /**
     * Método que retorna un objeto mapeando las constantes de código y respuesta exitosa de un servicio.
     * 
     * @return tipoEstadoEjecucion, objeto que contiene la respuesta exitosa del servicio
     * @throws Exception 
     */
    protected TipoRespuestaCertificadoDTO respuestaExitosaServicio(File certificado) throws Exception{
    	TipoRespuestaCertificadoDTO respuestaServicio = new TipoRespuestaCertificadoDTO();
    	respuestaServicio.setEstadoEjecucion(respuestaNegocioServicio(Constantes.COD_INVOCACION_EXITOSA, Constantes.DESC_INVOCACION_EXITOSA));
    	/* convierte el archivo en bits para poder ser retornado en la respuesta del servicio*/
    	FileInputStream fileStream = new FileInputStream(certificado);
    	byte contenidoCertificado[] = new byte[(int)certificado.length()]; 
    	fileStream.read(contenidoCertificado);
    	respuestaServicio.setArchivoCertificado(contenidoCertificado);
    	try
    	{
    		/* cierra el FileInputStream para poder eliminar el pdf*/
    		fileStream.close();
    		certificado.delete();
    	} catch (Exception e) {
    	
    		tracer.getLogger().error(e);
    	}
        return respuestaServicio;
    }

    /**
     * Método que retorna un objeto mapeando las constantes de código y respuesta exitosa de un servicio.
     * 
     * @return tipoEstadoEjecucion, objeto que contiene la respuesta exitosa del servicio
     */
    protected TipoRespuestaCertificadoDTO respuestaErrorInvocacionPlenitud() {
    	TipoRespuestaCertificadoDTO respuestaServicio = new TipoRespuestaCertificadoDTO();
    	respuestaServicio.setEstadoEjecucion(respuestaNegocioServicio(Constantes.COD_ERROR_VINCULADO_INVOCAR_PLENITUD, Constantes.DESC_ERROR_INVOCAR_PLENITUD));
        return respuestaServicio;
    }

    /**
     * Método que genera un objeto TipoEstadoEjecucion de acuerdo al código y mensaje ingresados por parámetro.
     * 
     * @param codigo, Código de resultado de ejecución del proceso
     * @param mensaje, Mensaje de resultado de ejecución del proceso
     * @return tipoEstadoEjecucion, objeto que contiene la respuesta del servicio
     */
    protected TipoEstadoEjecucion respuestaNegocioServicio(String codigo, String mensaje) {
        TipoEstadoEjecucion tipoEstadoEjecucion = new TipoEstadoEjecucion();
        tipoEstadoEjecucion.setId(tracer.getLogger().getIdTransaccion());
        tipoEstadoEjecucion.setCodigo(codigo);
        tipoEstadoEjecucion.setDescripcion(mensaje);
        return tipoEstadoEjecucion;
    }

    /**
     * Método encargado de realizar las validaciones de obligatoridad para los datos de entrada del servicio
     * @param informacionContexto, información de contexto para el servicio.
     * @param informacionCertificado, información para la generación del certificado
     * @return String, Cadena que contiene los mensajes de error para las validaciones.
     * @throws Exception 
     */
    protected String validarDatosEntradaObligatorio(TipoInformacionContexto informacionContexto,TipoInformacionCertificado informacionCertificado) throws Exception {
		
		 StringBuilder errores = new StringBuilder();
    	 
    	 if(informacionCertificado!=null)
    	 {
    		 if(informacionCertificado.getDocumento()!=null)
    		 {
    			 /* valida a infomacion del documento*/
	    		 if(informacionCertificado.getDocumento().getTipoDocumento()==null || informacionCertificado.getDocumento().getTipoDocumento().isEmpty())
	    		 {
	    			 errores.append(Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, "TipoDocumento"));
	    		 }
	    		 if(informacionCertificado.getDocumento().getNumeroDocumento()==null || informacionCertificado.getDocumento().getNumeroDocumento().isEmpty())
	    		 {
	    			 errores.append(Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, "NumeroDocumento"));
	    		 }
    		 }
    		 if(informacionCertificado.getInformacionDestinatario()!=null)
    		 {
    			 /* valida la informacion del destinatario*/
    			if(informacionCertificado.getInformacionDestinatario().getIndicadorDestinatario()==null || informacionCertificado.getInformacionDestinatario().getIndicadorDestinatario().isEmpty()) 
    			{
    				errores.append(Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, "IndicadorDestinatario"));
    			}else if(Constantes.SI.equals(informacionCertificado.getInformacionDestinatario().getIndicadorDestinatario()))
    			{
    				if(informacionCertificado.getInformacionDestinatario().getNombreDestinatario()==null || informacionCertificado.getInformacionDestinatario().getNombreDestinatario().isEmpty()) 
    				{
    					errores.append(Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, "NombreDestinatario"));
    				}
    			}
    		 }
    		 
    	 }
    	 if(informacionContexto!=null)
    	 {
    		 /* valida el sitema de origen */
    		 if(informacionContexto.getSistemaOrigen()==null || informacionContexto.getSistemaOrigen().isEmpty())
    		 {
    			 errores.append(Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, "SistemaOrigen"));
    		 }else{
    			 if(Constantes.NOMBRE_BIZAGI.equals(informacionContexto.getSistemaOrigen()))
        		 {
        			 /* valida la informacion de la ciudad*/
        			 if(informacionCertificado.getInformacionOrigen()!=null)
        			 {
        				 if(informacionCertificado.getInformacionOrigen().getMunicipioSistemaOrigen() ==null || informacionCertificado.getInformacionOrigen().getMunicipioSistemaOrigen().isEmpty())
        				 {
        					errores.append(Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, "MunicipioSistemaOrigen"));
        				 }
        			 }
        			 /* valida la informacion del funcionario */
        			 if(informacionCertificado.getInformacionFuncionario()!=null)
        			 {
        				 if(informacionCertificado.getInformacionFuncionario().getNombreFuncionario()==null || informacionCertificado.getInformacionFuncionario().getNombreFuncionario().isEmpty())
        				 {
        					 errores.append(Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, "NombreFuncionario"));
        				 }
        				 if(informacionCertificado.getInformacionFuncionario().getCargoFuncionario()==null || informacionCertificado.getInformacionFuncionario().getCargoFuncionario().isEmpty())
        				 {
        					 errores.append(Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, "CargoFuncionario"));
        				 }
        			 }
        		 } 
    		 }
    	 }
    	 
		return errores.toString();
	}

	  /**
     * Método encargado de realizar las validaciones de formato para los datos de entrada del servicio
     * @param informacionContexto, información de contexto para el servicio.
     * @param informacionCertificado, información para la generación del certificado
     * @return String, Cadena que contiene los mensajes de error para las validaciones.
     * @throws Exception 
     */
    protected String validarDatosEntradaFormato(TipoInformacionContexto informacionContexto,TipoInformacionCertificado informacionCertificado) throws Exception {
    	 StringBuilder errores = new StringBuilder();
    	 
    	 /* Validacion tipo de documento */
         ArrayList<String> tiposDocumento = Util.getResourcePropertyArray(Constantes._HOMOLOGACION_COMUN_NAME, Constantes.PREFIJO_LLAVES_TIPO_DOCUMENTO);
         if (!tiposDocumento.contains(informacionCertificado.getDocumento().getTipoDocumento())) {
             errores.append(Constantes.MSJ_ERROR_DATO_NO_VALIDO.replaceAll(Constantes.PARAMETRO0, "TipoDocumento")
                     + tiposDocumento.toString() + "\n");
         }
         
         /* validadcion de numero de documento */
    	 errores.append(new Validador<TipoDocumentoPersonaNatural>().ValidarDataContract(informacionCertificado.getDocumento()));
    	 
    	 /* validacion de indicador destinatario*/
    	 if (!Constantes.NO.equals(informacionCertificado.getInformacionDestinatario().getIndicadorDestinatario())) {
         	if(Constantes.SI.equals(informacionCertificado.getInformacionDestinatario().getIndicadorDestinatario())) {
         		errores.append(new Validador<TipoInformacionDestinatario>().ValidarDataContract(informacionCertificado.getInformacionDestinatario()));
         		if(informacionCertificado.getInformacionDestinatario().getNombreDestinatario().trim().isEmpty())
         		{
         			errores.append(Constantes.MSJ_ERROR_DATO_ESPACIO.replace(Constantes.PARAMETRO0, "NombreDestinatario"));
         		}
         	} else {
        		 errores.append(Constantes.MSJ_ERROR_DATO_NO_VALIDO.replace(Constantes.PARAMETRO0, "IndicadorDestinatario")+Constantes.SI+", "+Constantes.NO+ "\n");
         	}
         }
    	 
    	 /* validacion sistema de origen */ 
    	 if(Constantes.NOMBRE_BIZAGI.equals(informacionContexto.getSistemaOrigen()))
		 {
    		errores.append(new Validador<TipoInformacionFuncionario>().ValidarDataContract(informacionCertificado.getInformacionFuncionario()));
         	errores.append(new Validador<TipoInformacionOrigen>().ValidarDataContract(informacionCertificado.getInformacionOrigen()));
         	if(informacionCertificado.getInformacionFuncionario().getNombreFuncionario().trim().isEmpty())
     		{
     			errores.append(Constantes.MSJ_ERROR_DATO_ESPACIO.replace(Constantes.PARAMETRO0, "NombreFuncionario"));
     		}
         	if(informacionCertificado.getInformacionFuncionario().getCargoFuncionario().trim().isEmpty())
     		{
     			errores.append(Constantes.MSJ_ERROR_DATO_ESPACIO.replace(Constantes.PARAMETRO0, "CargoFuncionario"));
     		}
		 }
		if (informacionContexto.getSistemaOrigen().trim().isEmpty()) {
			errores.append(Constantes.MSJ_ERROR_DATO_ESPACIO.replace(Constantes.PARAMETRO0, "SistemaOrigen"));
		}
		errores.append(new Validador<TipoInformacionContexto>().ValidarDataContract(informacionContexto));
    	return errores.toString();
	}
    
    /**
     * Metodo encargado de agregar informacion a los datos desde los parametros
     * @param certificadoVinculado , tipo de certificado a validar
	 * @param datos, un mapa de datos del proceso de certificados
	 * @param parametros, un mapa de parametros del proceso de certificado
	 * @param informacionCertificado, informacion del certificado
	 * @return datos, un mapa con la informacion nueva agregada
	 * @throws FunctionalException, si no se encuentra parametrizado el cargo o nombre o firma del responsable 
	 */
	protected Map<String, Object> prepararDatosParametros(String certificadoVinculado, Map<String, Object> datos, Map<String, Object> parametros, TipoInformacionCertificado informacionCertificado) throws FunctionalException {
		// destinatario 
    	if(Constantes.SI.equals(informacionCertificado.getInformacionDestinatario().getIndicadorDestinatario()))
    	{
    		datos.put(ConstantesGeneracionCertificados.NOMBRE_DESTINATARIO, informacionCertificado.getInformacionDestinatario().getNombreDestinatario().toUpperCase());
    	}
    	// básico validar la llegada Nombre Funcionario y Cargo Funcionario
	    	if(informacionCertificado.getInformacionFuncionario().getCargoFuncionario()!=null && !informacionCertificado.getInformacionFuncionario().getCargoFuncionario().isEmpty()
	    		&& informacionCertificado.getInformacionFuncionario().getNombreFuncionario()!=null && !informacionCertificado.getInformacionFuncionario().getNombreFuncionario().isEmpty()) 
	    	{
	    		parametros.put(ConstantesGeneracionCertificados.NOMBRE_FUNCIONARIO, informacionCertificado.getInformacionFuncionario().getNombreFuncionario());
	    		parametros.put(ConstantesGeneracionCertificados.CARGO_FUNCIONARIO, informacionCertificado.getInformacionFuncionario().getCargoFuncionario());
	    		parametros.put(ConstantesGeneracionCertificados.URL_IMAGEN_FIRMA, "");
	    		
	    	}
	    	//validar flujo alterno Datos de firma no existen
	    	if(parametros.containsKey(ConstantesGeneracionCertificados.NOMBRE_FUNCIONARIO) && parametros.containsKey(ConstantesGeneracionCertificados.CARGO_FUNCIONARIO) && parametros.containsKey(ConstantesGeneracionCertificados.URL_IMAGEN_FIRMA)){
	    		datos.put(ConstantesGeneracionCertificados.NOMBRE_FUNCIONARIO, parametros.get(ConstantesGeneracionCertificados.NOMBRE_FUNCIONARIO).toString().toUpperCase());
	    		datos.put(ConstantesGeneracionCertificados.CARGO_FUNCIONARIO, parametros.get(ConstantesGeneracionCertificados.CARGO_FUNCIONARIO).toString().toUpperCase());
	    	}
	    	else{
	    		throw new FunctionalException(new HashMap<String,Object>(), new HashMap<String,String>(), new Exception(Constantes.MSJ_DATOS_FIRMA_NO_EXISTEN));
	    	}
	    	
	    	if(parametros.containsKey(ConstantesGeneracionCertificados.NOMBRE_MUNICIPIO)){
		    	datos.put(ConstantesGeneracionCertificados.NOMBRE_MUNICIPIO, parametros.get(ConstantesGeneracionCertificados.NOMBRE_MUNICIPIO));
			}
		    datos.put(ConstantesGeneracionCertificados. FECHA_SISTEMA, new Date());
	    	
		//validar datos de la nota
		String key="";
		if(TipoCertificado.CERTIFICADO_VINCULADO.equals(certificadoVinculado))
		{
			key=ConstantesGeneracionCertificados.NOTA+"_"+TipoCertificado.CERTIFICADO_VINCULADO;
			datos.put(ConstantesGeneracionCertificados.NOTA, parametros.containsKey(key)? parametros.get(key):"");
		}else if(TipoCertificado.CERTIFICADO_SALDOS.equals(certificadoVinculado))
		{
			key=ConstantesGeneracionCertificados.NOTA+"_"+TipoCertificado.CERTIFICADO_SALDOS;
			datos.put(ConstantesGeneracionCertificados.NOTA, parametros.containsKey(key)? parametros.get(key):"");
		}else if(TipoCertificado.CERTIFICADO_SALDOS_MOVIMIENTOS.equals(certificadoVinculado))
		{
			key=ConstantesGeneracionCertificados.NOTA+"_"+TipoCertificado.CERTIFICADO_SALDOS_MOVIMIENTOS;
			datos.put(ConstantesGeneracionCertificados.NOTA, parametros.containsKey(key)? parametros.get(key):"");
		}else if(TipoCertificado.CERTIFICADO_NO_VINCULADO.equals(certificadoVinculado))
		{
			key=ConstantesGeneracionCertificados.NOTA+"_"+TipoCertificado.CERTIFICADO_NO_VINCULADO;
			datos.put(ConstantesGeneracionCertificados.NOTA, parametros.containsKey(key)? parametros.get(key):"");
		}else if(TipoCertificado.CERTIFICADO_VINCULADO_OTORGADO.equals(certificadoVinculado)){
			key=ConstantesGeneracionCertificados.NOTA+"_"+TipoCertificado.CERTIFICADO_VINCULADO_OTORGADO;
			datos.put(ConstantesGeneracionCertificados.NOTA, parametros.containsKey(key)? parametros.get(key):"");
			//Validar datos de la observación
			String destinacion=datos.get(ConstantesGeneracionCertificados.DESTINACION).toString();
			StringBuffer valorDestinacion=new StringBuffer(ConstantesGeneracionCertificados.OBSERVACION+"_");
			String keyDestinacion=null;
			if(ConstantesGeneracionCertificados.ANUALIDAD_VITALICIA.equals(destinacion)){
				valorDestinacion.append(ConstantesGeneracionCertificados.ANUALIDAD_VITALICIA);
				keyDestinacion=valorDestinacion.toString();
				datos.put(ConstantesGeneracionCertificados.OBSERVACION, parametros.containsKey(keyDestinacion)? parametros.get(keyDestinacion):ConstantesGeneracionCertificados.SIN_OBSERVACION);
				
			}else if(ConstantesGeneracionCertificados.DEVOLUCION_AHORROS.equals(destinacion)){
				valorDestinacion.append(ConstantesGeneracionCertificados.DEVOLUCION_AHORROS);
				keyDestinacion=valorDestinacion.toString();
				datos.put(ConstantesGeneracionCertificados.OBSERVACION, parametros.containsKey(keyDestinacion)? parametros.get(keyDestinacion):ConstantesGeneracionCertificados.SIN_OBSERVACION);
				
			}else if(ConstantesGeneracionCertificados.DOBLE_DESTINACION.equals(destinacion)){
				valorDestinacion.append(ConstantesGeneracionCertificados.DOBLE_DESTINACION);
				keyDestinacion=valorDestinacion.toString();
				datos.put(ConstantesGeneracionCertificados.OBSERVACION, parametros.containsKey(keyDestinacion)? parametros.get(keyDestinacion):ConstantesGeneracionCertificados.SIN_OBSERVACION);
				
			}
		}
		
		//Validación de rutas de las imágenes para el certificado
	    if(parametros.containsKey(ConstantesGeneracionCertificados.URL_IMAGEN_FIRMA)){
	    	datos.put(ConstantesGeneracionCertificados.URL_IMAGEN_FIRMA, parametros.get(ConstantesGeneracionCertificados.URL_IMAGEN_FIRMA));
		}
	    if(parametros.containsKey(ConstantesGeneracionCertificados.URL_IMAGEN_LOGO_COLPENSIONES)){
	    	datos.put(ConstantesGeneracionCertificados.URL_IMAGEN_LOGO_COLPENSIONES, parametros.get(ConstantesGeneracionCertificados.URL_IMAGEN_LOGO_COLPENSIONES));
		}
	    if(parametros.containsKey(ConstantesGeneracionCertificados.URL_IMAGEN_LOGO_BEPS)){
	    	datos.put(ConstantesGeneracionCertificados.URL_IMAGEN_LOGO_BEPS, parametros.get(ConstantesGeneracionCertificados.URL_IMAGEN_LOGO_BEPS));
		}
	    if(parametros.containsKey(ConstantesGeneracionCertificados.SELLOLATERAL)){
	    	datos.put(ConstantesGeneracionCertificados.SELLOLATERAL, parametros.get(ConstantesGeneracionCertificados.SELLOLATERAL));
		}
		return datos;
	}
	
	/**
	 * Metodo para formatear un Bigdecimal a $ #.###.###.###.###,##
	 * @param valor, valor a formatear
	 * @return, valor formateado
	 */
	protected String formatearValorMascaraPesos(BigDecimal valor) {
		// formateo del valor
    	DecimalFormat decimalFormat = new DecimalFormat("$#,##0.00");
   	 	String saldoFormateado=decimalFormat.format(valor);
		return saldoFormateado;
	}
}