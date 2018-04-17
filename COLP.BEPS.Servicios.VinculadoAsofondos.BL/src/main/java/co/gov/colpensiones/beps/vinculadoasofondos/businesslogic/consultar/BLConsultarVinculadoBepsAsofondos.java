package co.gov.colpensiones.beps.vinculadoasofondos.businesslogic.consultar;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import co.gov.colpensiones.beps.comunes.utilidades.Constantes;
import co.gov.colpensiones.beps.comunes.utilidades.Util;
import co.gov.colpensiones.beps.comunes.utilidades.Validador;
import co.gov.colpensiones.beps.excepciones.DataAccessException;
import co.gov.colpensiones.beps.excepciones.FunctionalException;
import co.gov.colpensiones.beps.log.ConstantesLogger;
import co.gov.colpensiones.beps.log.LoggerBeps;
import co.gov.colpensiones.beps.schemas._1_0.comun.TipoInformacionContexto;
import co.gov.colpensiones.beps.schemas._1_0.comun.TipoInformacionContextoExterno;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoCausalNoViabilidad;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoDocumentoPersonaNatural;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoEstadoSolicitante;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoInformacionBasicaPersonaNatural;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoInformacionCuentaVinculado;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoInformacionGeneralSolicitanteDTO;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoInformacionViabilidad;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoRespuestaInformacionSolicitanteDTO;
import co.gov.colpensiones.beps.schemas._1_0.vinculadoasofondos.TipoInformacionSolicitanteDTO;
import co.gov.colpensiones.beps.vinculadoasofondos.businesslogic.BLVinculadoAsofondos;
import co.gov.colpensiones.beps.vinculadoasofondos.businesslogic.comun.BLConsultarExtendido;
import co.gov.colpensiones.beps.vinculadoasofondos.businesslogic.comun.ConstantesVinculadoAsofondos;
import co.gov.colpensiones.www.bdua.contracts._1_0.personas.ServicioWebViabilidad;
import co.gov.colpensiones.www.bdua.contracts._1_0.personas.ServicioWebViabilidadProxy;
import co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.CausalesNoViabilidadBEPSHolder;
import co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.IdMTramiteHolder;
import co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.InformacionViablidadHolder;
import co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.MCiudadanoBDUAHolder;
import co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.MCiudadanoBepsHolder;
import co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.MCiudadanoRegistraduriaHolder;
import co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.MCiudadanosConsultadosHolder;
import co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.MGestionVinculacionBEPSHolder;
import co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.MInformacionBDUAHolder;
import co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.TipoEstadoRespuestaHolder;

/**
 * <b>Descripción:</b> Clase que contiene la lógica de negocio para la consulta del vinculado Asofondos.<br/>
 * <b>Caso de Uso:</b> GVI-VIN-3-FAB-14-ConsultarViabilidadVinculacionAsofondos.<br/>
 *
 * @author Yesika Ramirez <yeramirez@heinsohn.com.co>
 */
public class BLConsultarVinculadoBepsAsofondos extends BLVinculadoAsofondos{
    
	HashMap<String, Object> payLoad = new HashMap<String, Object>();
	
    /**
     * Método constructor.
     * @param log, log asociado a la funcionalidad.
     */
    public BLConsultarVinculadoBepsAsofondos(LoggerBeps log) {
        super(log);
    }
    
    /**
     *  Método encargado de consultar informacion relacionada a la vinculacion o viabilidad de vinculacion.
     *  @param informacionContexto, 
     *  		información de contexto para el servicio.
     * 	@param identificacion
     *            Objeto TipoDocumentoPersonaNatural con tipo y número de documento del solicitante
     *  @return objeto TipoInformacionSolicitanteDTO con respuesta del servicio 
     * */
    public TipoInformacionSolicitanteDTO consultarViabilidadVinculacion(TipoInformacionContextoExterno informacionContextoExterno, 
    		TipoDocumentoPersonaNatural identificacion){

    	initMetadata(identificacion, informacionContextoExterno);

    	HashMap<String, Object> payLoadTrace = new HashMap<String, Object>();
    	
    	payLoadTrace.put(ConstantesLogger.OBJETO_CONTEXTO_ENTRADA, informacionContextoExterno);
    	payLoadTrace.put(ConstantesLogger.OBJETO_NEGOCIO_ENTRADA, identificacion);
    	tracer.getLogger().trace(payLoadTrace, tracer.getMetadata());

    	//Respuesta del servicio
    	TipoInformacionSolicitanteDTO respuestaServicio = new TipoInformacionSolicitanteDTO();

    	
    	try {
    		/* validar la obligatoridad de los datos de entrada */
    		StringBuffer lstErrores = new StringBuffer();
    		lstErrores.append(this.validarDatosEntradaObligatorio(informacionContextoExterno,identificacion));
    		/* validar existencia errores */
    		if (lstErrores.toString().length() > 0) {
    			respuestaServicio.setEstadoEjecucion(respuestaNegocioServicio(ConstantesVinculadoAsofondos.COD_FORMATO_INVALIDO_OBLIGATORIO_NO_RECIBIDO, lstErrores.toString()));
    			payLoad.put(ConstantesVinculadoAsofondos.MSJ_ERROR_LOG, lstErrores.toString());
    			tracer.getLogger().error(payLoad,tracer.getMetadata());
    		}else{

    			/* validar el formato de los datos de entrada */
    			lstErrores.append(this.validarDatosEntradaFormato(informacionContextoExterno,identificacion));
    			/* validar existencia errores */
    			if(lstErrores.toString().length() > 0) {
    				respuestaServicio.setEstadoEjecucion(respuestaNegocioServicio(ConstantesVinculadoAsofondos.COD_FORMATO_INVALIDO_OBLIGATORIO_NO_RECIBIDO, lstErrores.toString()));
    				payLoad.put(ConstantesVinculadoAsofondos.MSJ_ERROR_LOG, lstErrores.toString());
    				tracer.getLogger().error(payLoad,tracer.getMetadata());
    			}
    			else{

    				// Llamamos al servicio de BDUA para actualización de información.
    				if (this.consumirServicioBdua (identificacion, respuestaServicio)) {
    					/* logica del servicio */
        				BLConsultarExtendido blVinculado = new BLConsultarExtendido(tracer.getLogger());
        				TipoInformacionContexto informacionContexto = new TipoInformacionContexto();
        				informacionContexto.setSistemaOrigen(informacionContextoExterno.getSistemaOrigen());
        				informacionContexto.setUsuarioSistemaExterno(informacionContextoExterno.getUsuarioSistemaExterno());
        				tracer.inicio();
        				TipoRespuestaInformacionSolicitanteDTO respuestaInformacionSolicitanteDTO = blVinculado.consultarViabilidad(identificacion,informacionContexto);
        				tracer.fin(ConstantesVinculadoAsofondos.FIN_TRACER_CONSULTA_VIABILIDAD);    
        				
        				TipoInformacionGeneralSolicitanteDTO informacionGeneralSolicitante = respuestaInformacionSolicitanteDTO.getDetalle();
        				
        				if (informacionGeneralSolicitante!=null){
        					String tipoPersona = informacionGeneralSolicitante.getTipoPersona();

        					switch (tipoPersona){
        					case ConstantesVinculadoAsofondos.COD_TIPO_VI:
        						respuestaServicio = mapearDatosVinculado(informacionGeneralSolicitante);
        						break;
        					case ConstantesVinculadoAsofondos.COD_TIPO_PV:
        						respuestaServicio = mapearDatosPrevinculado(informacionGeneralSolicitante);
        						break;
        					case ConstantesVinculadoAsofondos.COD_TIPO_PP:
        						respuestaServicio = mapearDatosProspecto(informacionGeneralSolicitante);
        						break;	
        					}

        				}else{
        					respuestaServicio = new TipoInformacionSolicitanteDTO();
        					respuestaServicio.setEstadoEjecucion(respuestaNegocioServicio(ConstantesVinculadoAsofondos.COD_ERROR_LOGICA_NEGOCIO, ConstantesVinculadoAsofondos.MSJ_ERROR_NO_EXISTE_PROSPECTO));
        				}
    				}
    			}
    		}
    	}catch (Exception e){
    		generarLogError(new FunctionalException(new HashMap<String,Object>(), tracer.getMetadata(), e));
    		respuestaServicio = new TipoInformacionSolicitanteDTO();
    		respuestaServicio.setEstadoEjecucion(respuestaNegocioServicio(Constantes.COD_ERROR_INTERNO, Constantes.DESC_ERROR_INTERNO));
    	}
    		
    	payLoadTrace.put(ConstantesLogger.OBJETO_NEGOCIO_SALIDA, respuestaServicio);
    	tracer.getLogger().trace(payLoadTrace, tracer.getMetadata());
    	return respuestaServicio;	
    }
    
    /**
     * Metodo que permite consumir el servicio de BDUA
     * 
     * @author	Pablo Andres Perez Melo<br />
     * Email: pamelo@stefanini.com
     * 
     * @param identificacion
     * @param respuestaServicio
     * @return Booleano que hace referencia al estado de la ejecución del servicio (true para exito y false para errores).
     * @throws Exception
     */
    private boolean consumirServicioBdua(TipoDocumentoPersonaNatural identificacion, TipoInformacionSolicitanteDTO respuestaServicio) throws Exception {
        
        try {
        	tracer.inicio("Inicio del cosumo del servicio de BDUA");
        	
        	// Obtenemos la url del servicio web de viabilidad y le concatenamos el fragmento de texto ?wsdl.
        	String endPoint = Util.obtenerUrlServicioWebViabilidad () + Constantes.PARAMETRO_WSDL;

        	// Creamos la instancia del cliente de consumo del servicio.
            ServicioWebViabilidad servicioWebViabilidad = new ServicioWebViabilidadProxy(endPoint);
            
            // Creamos la instancia de la respuesta del servicio.
            TipoEstadoRespuestaHolder tipoEstadoRespuesta = new TipoEstadoRespuestaHolder ();
        	
            // Consumimos el servicio de viabilidad.
			servicioWebViabilidad.viabilidad(ConstantesVinculadoAsofondos.TIPO_AREA_ASOFONDOS, ConstantesVinculadoAsofondos.CADENA_VACIA, true, identificacion.getNumeroDocumento(), ConstantesVinculadoAsofondos.CADENA_VACIA, ConstantesVinculadoAsofondos.CADENA_VACIA, ConstantesVinculadoAsofondos.CADENA_VACIA, identificacion.getTipoDocumento(), ConstantesVinculadoAsofondos.TIPO_TRAMITE_ASOFONDOS, new CausalesNoViabilidadBEPSHolder(), new IdMTramiteHolder(), new InformacionViablidadHolder(), new MCiudadanoBDUAHolder(), new MCiudadanoBepsHolder(), new MCiudadanoRegistraduriaHolder(), new MCiudadanosConsultadosHolder(), new MGestionVinculacionBEPSHolder(), new MInformacionBDUAHolder(), tipoEstadoRespuesta);
			
			// Verificamos si la respuesta del servicio viene marcada como error. 
			if (tipoEstadoRespuesta.value.isError()) {
				// Si la respuesta es error notificamos que tipo de error fue.
				respuestaServicio.setEstadoEjecucion(respuestaNegocioServicio(ConstantesVinculadoAsofondos.COD_FORMATO_INVALIDO_OBLIGATORIO_NO_RECIBIDO, tipoEstadoRespuesta.value.getDescripcion()));
			}
	        
	        tracer.fin("Fin del cosumo del servicio de BDUA");
	        
	        // Retormanos si el consumo fue exitoso o no (true => exitoso o false => error de logica).
	        return !tipoEstadoRespuesta.value.isError();
		} catch (RemoteException e) {
			// Notificamos que hubo un error en el consumo del webservice
			throw new Exception("Error al consumir el servicio de BDUA", e);
		}
	}

	

	/**
     * Metodo encargado de mapear la informacion de viabilidad de un solicitante
     * @param respuestaInformacionSolicitante
     * 		   objeto TipoRespuestaInformacionSolicitanteDTO con la informacion de un solicitante
     * @return objeto TipoInformacionViabilidad con la informacion de viabilidad de un solicitante
     * @throws DataAccessException 
     * */
    private TipoInformacionViabilidad mapearInformacionViabilidad(TipoInformacionGeneralSolicitanteDTO respuestaInformacionSolicitante ) throws DataAccessException{
    	
    	
    	//Set Informacion viabilidad
    	TipoInformacionViabilidad tipoInformacionViabilidad = respuestaInformacionSolicitante.getInformacionViablidad();
    	
		if (tipoInformacionViabilidad.getViabilidad().equals(ConstantesVinculadoAsofondos.COD_NO_VIABLE)){
			tipoInformacionViabilidad.setViabilidad(ConstantesVinculadoAsofondos.VALOR_NO_VIABLE);
		}else if (tipoInformacionViabilidad.getViabilidad().equals(ConstantesVinculadoAsofondos.COD_VIABLE)){
			tipoInformacionViabilidad.setViabilidad(ConstantesVinculadoAsofondos.VALOR_VIABLE);
		}else {
			tipoInformacionViabilidad.setViabilidad("");
		}
		
		List<TipoCausalNoViabilidad> causalesNoViabilidad = (List<TipoCausalNoViabilidad>) tipoInformacionViabilidad.getListaCausalNoViabilidad();
		for (TipoCausalNoViabilidad causal : causalesNoViabilidad){
			String codCausa = parseDatoValido(causal.getCausal()).toString();			
			try {
				causal.setCausal(codCausa.length() > 0 ? daVinculadoAsofondos.consultarDescripcionCausaNoViabilidad(codCausa) :"");
			} catch (Exception e) {
				throw new DataAccessException(payLoad, new HashMap<String, String>(), e);
			}
		}    	    	
    	return tipoInformacionViabilidad;
    }
    
    /**
     * Metodo encargado de consultar la informacion cuenta vinculado
     * @param tipoPersona String con el tipo de persona del solicitante
     * @param respuestaInformacionSolicitante
     * 		   objeto TipoRespuestaInformacionSolicitanteDTO con la informacion de un solicitante
     * @return objeto TipoEstadoSolicitante con la informacion de estado
     * */
    private TipoEstadoSolicitante mapearEstadoSolicitante(TipoInformacionGeneralSolicitanteDTO respuestaInformacionSolicitante, String tipoPersona ) throws DataAccessException{
    	TipoEstadoSolicitante estadoSolicitante = new TipoEstadoSolicitante();
		try {
    	estadoSolicitante.setTipoPersona(tipoPersona);
    	estadoSolicitante.setDetalleEstadoVinculacion(parseDatoValido(respuestaInformacionSolicitante.getEstadoVinculado().getDescripcionDetalleEstado()).toString());
    	estadoSolicitante.setFechaVinculacion(parseDatoValido(respuestaInformacionSolicitante.getInformacionExtendidaSolicitante().getFechaVinculacion()).toString());
    	
    	String idEstado = parseDatoValido(respuestaInformacionSolicitante.getEstadoVinculado().getEstadoVinculado()).toString();	
    	String estado = daVinculadoAsofondos.consultarDescripcionEstado(idEstado);
    	estadoSolicitante.setEstadoVinculacion(estado);
    	
		String codColombiaMayor = parseDatoValido(respuestaInformacionSolicitante.getInformacionExtendidaSolicitante().getColombiaMayor()).toString();
		estadoSolicitante.setColombiaMayor( codColombiaMayor.length()>0 ? daVinculadoAsofondos.consultarDescripcionColombiaMayor(codColombiaMayor) : "");
    	
		}catch (Exception e) {
			throw new DataAccessException(payLoad, new HashMap<String, String>(), e);
		}
    	return estadoSolicitante;
    }
    
    /**
     * Metodo encargado de consultar la informacion cuenta vinculado
     * @param saldoTotal
     * @param subsidio
     * @param equivalenciaConSubs
     * @param equivalenciaSinSuns
     * @return objeto TipoInformacionCuentaVinculado con la informacion cuenta vinculado
     * */
    private TipoInformacionCuentaVinculado mapearInformacionCuentaVinculado(String saldoTotal, String subsidio, String equivalenciaConSubs, String equivalenciaSinSuns){
    	
		TipoInformacionCuentaVinculado informacionCuentaVinculado = new TipoInformacionCuentaVinculado();
    	informacionCuentaVinculado.setSaldoTotalCuenta(saldoTotal);
		informacionCuentaVinculado.setValorSubsidioBEPS(subsidio);
		informacionCuentaVinculado.setEquivalenciaSemanasConSubsidio(equivalenciaConSubs);
		informacionCuentaVinculado.setEquivalenciaSemanasSinSubsidio(equivalenciaSinSuns);	
    	
    	return informacionCuentaVinculado;
    }
    
    /**
     * Metodo encargado de mapear la informacion basica de un solicitante
     * @param respuestaInformacionSolicitante
     * 		   objeto TipoRespuestaInformacionSolicitanteDTO con la informacion de un solicitante
     * @return objeto TipoInformacionBasicaPersonaNatural con la informacion basica de la persona
     * */
    private TipoInformacionBasicaPersonaNatural mapearInformacionBasica(TipoInformacionBasicaPersonaNatural informacionBasicaPersonaNatural ){
    	
    	//Set informacionBasicaPersona Natural
    	TipoInformacionBasicaPersonaNatural tipoInformacionBasicaPersonaNatural = new TipoInformacionBasicaPersonaNatural();
    	tipoInformacionBasicaPersonaNatural.setPrimerApellido(parseDatoValido(informacionBasicaPersonaNatural.getPrimerApellido()).toString());
    	tipoInformacionBasicaPersonaNatural.setSegundoApellido(parseDatoValido(informacionBasicaPersonaNatural.getSegundoApellido()).toString());
    	tipoInformacionBasicaPersonaNatural.setPrimerNombre(parseDatoValido(informacionBasicaPersonaNatural.getPrimerNombre()).toString());
    	tipoInformacionBasicaPersonaNatural.setSegundoNombre(parseDatoValido(informacionBasicaPersonaNatural.getSegundoNombre()).toString());
    	
    	return informacionBasicaPersonaNatural;
    }
   
    /**
     * Metodo encargado de consultar y mapear la informacion de un vinculado
     * @param respuestaInformacionSolicitante
     * 		   objeto TipoRespuestaInformacionSolicitanteDTO con la informacion de un solicitante
     * @return objeto TipoInformacionSolicitanteDTO con la respuesta del servicio
     * @throws Exception 
     * */
    private TipoInformacionSolicitanteDTO mapearDatosVinculado(TipoInformacionGeneralSolicitanteDTO respuestaInformacionSolicitante) throws Exception{
    	//Respuesta del servicio
    	TipoInformacionSolicitanteDTO informacionSolicitanteDTO = new TipoInformacionSolicitanteDTO();


    	//Set identificacion
    	informacionSolicitanteDTO.setDocumentoPersonaNatural(respuestaInformacionSolicitante.getInformacionBasicaSolicitante().getDocumento());

    	//mapear la informacion basica    	 
    	informacionSolicitanteDTO.setInformacionBasicaPersonaNatural(
    			mapearInformacionBasica(respuestaInformacionSolicitante.getInformacionBasicaSolicitante().getNombresApellidos().getValue())
    			);
    	try {
    		//Set estadoSolicitante
    		informacionSolicitanteDTO.setEstadoSolicitante(mapearEstadoSolicitante(respuestaInformacionSolicitante, ConstantesVinculadoAsofondos.VALOR_VINCULADO));


    		//Consulta y agrega los valores a visualizar

    		Map<String, Object> parametros;

    		parametros = consultarParametrosVisibles();
    		DecimalFormat formatoNumero = formatearValores("###############.##"); 

    		String saldoTotal="";
    		String subsidio ="";
    		if (parametros.get(ConstantesVinculadoAsofondos.LLAVE_SALDO_TOTAL_CUENTA).equals(Boolean.TRUE)){
    			String numeroDocumento = informacionSolicitanteDTO.getDocumentoPersonaNatural().getNumeroDocumento();
    			BigDecimal saldo = consultarSaldoTotal(numeroDocumento);
    			saldoTotal = (saldo!=null ? formatoNumero.format(saldo) : "");
    		}

    		if (parametros.get(ConstantesVinculadoAsofondos.LLAVE_VALOR_SUBSIDIO_BEPS).equals(Boolean.TRUE)){
    			BigDecimal valorSubsidioBEPS = respuestaInformacionSolicitante.getInformacionCuentaBeps().getValorSubsidiBeps();
    			subsidio = (valorSubsidioBEPS!=null ? formatoNumero.format(valorSubsidioBEPS) : "");
    		}   		

    		//Set informacionCuentaVinculado 
    		informacionSolicitanteDTO.setInformacionCuentaVinculado(mapearInformacionCuentaVinculado(saldoTotal, subsidio, "", ""));

    		//Set informacion Viabilidad
    		informacionSolicitanteDTO.setInformacionViabilidad(mapearInformacionViabilidad(respuestaInformacionSolicitante));

    		//Set estado Ejecucion
    		informacionSolicitanteDTO.setEstadoEjecucion(respuestaNegocioServicio(ConstantesVinculadoAsofondos.COD_INVOCACION_EXITOSA, ""));

    	}
    	catch (DataAccessException dae) {
    		generarLogError(dae);
    		informacionSolicitanteDTO = new TipoInformacionSolicitanteDTO();
    		informacionSolicitanteDTO.setEstadoEjecucion(respuestaNegocioServicio(ConstantesVinculadoAsofondos.COD_ERROR_INTERNO, ConstantesVinculadoAsofondos.MSJ_ERROR_INTERNO));
    	}
    	
		return informacionSolicitanteDTO;
    }
    
    /**
     * Metodo encargado de consultar y mapear la informacion de un previnculado
     * @param respuestaInformacionSolicitante
     * 		  objeto TipoRespuestaInformacionSolicitanteDTO con la informacion de un solicitante 
     * @return objeto TipoInformacionSolicitanteDTO con la respuesta del servicio
     * @throws DataAccessException 
     * */
    private TipoInformacionSolicitanteDTO mapearDatosPrevinculado(TipoInformacionGeneralSolicitanteDTO respuestaInformacionSolicitante) throws DataAccessException{
    	
    	//Respuesta del servicio
    	TipoInformacionSolicitanteDTO informacionSolicitanteDTO = new TipoInformacionSolicitanteDTO();

    	try {
    		//Set identificacion
    		informacionSolicitanteDTO.setDocumentoPersonaNatural(respuestaInformacionSolicitante.getInformacionBasicaSolicitante().getDocumento());

    		//mapear la informacion basica    	 
    		informacionSolicitanteDTO.setInformacionBasicaPersonaNatural(
    				mapearInformacionBasica(respuestaInformacionSolicitante.getInformacionBasicaSolicitante().getNombresApellidos().getValue())
    				);

    		//Set estadoSolicitante
    		informacionSolicitanteDTO.setEstadoSolicitante(mapearEstadoSolicitante(respuestaInformacionSolicitante, ConstantesVinculadoAsofondos.VALOR_PREVINCULADO));

    		//Set informacion cuenta vinculado
    		informacionSolicitanteDTO.setInformacionCuentaVinculado(mapearInformacionCuentaVinculado("", "", "", ""));

    		//Set informacion Viabilidad
    		informacionSolicitanteDTO.setInformacionViabilidad(mapearInformacionViabilidad(respuestaInformacionSolicitante));

    		//Set estadoEjecucion
    		informacionSolicitanteDTO.setEstadoEjecucion(respuestaNegocioServicio(ConstantesVinculadoAsofondos.COD_INVOCACION_EXITOSA, ""));

    	}
    	catch (DataAccessException dae) {
    		generarLogError(dae);
    		informacionSolicitanteDTO = new TipoInformacionSolicitanteDTO();
    		informacionSolicitanteDTO.setEstadoEjecucion(respuestaNegocioServicio(ConstantesVinculadoAsofondos.COD_ERROR_INTERNO, ConstantesVinculadoAsofondos.MSJ_ERROR_INTERNO));
    	}

		return informacionSolicitanteDTO;
    }
    
    /**
     * Metodo encargado de consultar y mapear la informacion de un prospecto
     * @param respuestaInformacionSolicitante
     * 		   objeto TipoRespuestaInformacionSolicitanteDTO con la informacion de un solicitante 
     * @return objeto TipoInformacionSolicitanteDTO con la respuesta del servicio
     * @throws DataAccessException 
     * */
    private TipoInformacionSolicitanteDTO mapearDatosProspecto(TipoInformacionGeneralSolicitanteDTO respuestaInformacionSolicitante) throws DataAccessException{
    	TipoInformacionSolicitanteDTO informacionSolicitanteDTO = new TipoInformacionSolicitanteDTO();

    	TipoInformacionBasicaPersonaNatural  tipoInformacionBasicaPersonaNatural = respuestaInformacionSolicitante.getInformacionBasicaSolicitante().getNombresApellidos().getValue();
    	String primerNombre = tipoInformacionBasicaPersonaNatural.getPrimerNombre();
    	String primerApellido = tipoInformacionBasicaPersonaNatural.getPrimerApellido();
    	try {
    		if (primerNombre!=null && primerNombre.length()>0 && primerApellido!=null && primerApellido.length()>0){

    			//Set identificacion
    			informacionSolicitanteDTO.setDocumentoPersonaNatural(respuestaInformacionSolicitante.getInformacionBasicaSolicitante().getDocumento());

    			///mapear la informacion basica    	 
    			informacionSolicitanteDTO.setInformacionBasicaPersonaNatural(
    					mapearInformacionBasica(respuestaInformacionSolicitante.getInformacionBasicaSolicitante().getNombresApellidos().getValue())
    					);

    			//Set estadoSolicitante
    			informacionSolicitanteDTO.setEstadoSolicitante(mapearEstadoSolicitante(respuestaInformacionSolicitante, ConstantesVinculadoAsofondos.VALOR_PROSPECTO));

    			//Set informacion cuenta vinculado
    			informacionSolicitanteDTO.setInformacionCuentaVinculado(mapearInformacionCuentaVinculado("", "", "", ""));

    			//Set Informacion viabilidad
    			informacionSolicitanteDTO.setInformacionViabilidad(mapearInformacionViabilidad(respuestaInformacionSolicitante));

    			//Set estado ejecucion
    			informacionSolicitanteDTO.setEstadoEjecucion(respuestaNegocioServicio(ConstantesVinculadoAsofondos.COD_INVOCACION_EXITOSA, ""));

    		}else {
    			informacionSolicitanteDTO.setEstadoEjecucion(respuestaNegocioServicio(ConstantesVinculadoAsofondos.COD_ERROR_INFORMACION_INCOMPLETA, ConstantesVinculadoAsofondos.MSJ_ERROR_NO_EXISTE_INFORMACION));
    			payLoad.put(ConstantesVinculadoAsofondos.MSJ_ERROR_LOG, ConstantesVinculadoAsofondos.MSJ_ERROR_NO_EXISTE_INFORMACION);
    			tracer.getLogger().error(payLoad,tracer.getMetadata());
    		}    	
    	}
    	catch (DataAccessException dae) {
    		generarLogError(dae);
    		informacionSolicitanteDTO = new TipoInformacionSolicitanteDTO();
    		informacionSolicitanteDTO.setEstadoEjecucion(respuestaNegocioServicio(ConstantesVinculadoAsofondos.COD_ERROR_INTERNO, ConstantesVinculadoAsofondos.MSJ_ERROR_INTERNO));
    	}
    	return informacionSolicitanteDTO;
    }
        
    /**
     * Método encargado de invocar el método del DA para consultar los parametros visibles usados en el servicio vinculadoAsofondos
     * @param numero documento del solicitante
     * @throws DataAccessException 
     */
    private BigDecimal consultarSaldoTotal(String numeroDocumento) throws DataAccessException{
    	try{
    		return (BigDecimal) daVinculadoAsofondos.consultarSaldoTotal(numeroDocumento);
    	}
    	catch(Exception e){
    		throw new DataAccessException(new HashMap<String,Object>(), tracer.getMetadata(), e);
    	}
    }
    
    /**
     * Método encargado de realizar las validaciones de formato para los datos de entrada del servicio
     * @param informacionContexto, información de contexto para el servicio.
     * @param documentoPersona, documento de Persona Natural
     * @return String, Cadena que contiene los mensajes de error para las validaciones.
     * @throws Exception 
     */
    private String validarDatosEntradaFormato(TipoInformacionContextoExterno informacionContexto,TipoDocumentoPersonaNatural documentoPersona) throws Exception {
    	 StringBuilder errores = new StringBuilder();
    	 
    	 errores.append(new Validador<TipoDocumentoPersonaNatural>().ValidarDataContract(documentoPersona));
    	 
    	 /* Validacion tipo de documento */
         ArrayList<String> tiposDocumento = Util.getResourcePropertyArray(Constantes._HOMOLOGACION_COMUN_NAME, Constantes.PREFIJO_LLAVES_TIPO_DOCUMENTO);
         if (!tiposDocumento.contains(documentoPersona.getTipoDocumento())) {
             errores.append(Constantes.MSJ_ERROR_DATO_NO_VALIDO.replaceAll(Constantes.PARAMETRO0, "TipoDocumento")
                     + tiposDocumento.toString() + "\n");
         }
    	
		if (informacionContexto.getSistemaOrigen().trim().isEmpty()) {
			errores.append(Constantes.MSJ_ERROR_DATO_ESPACIO.replace(Constantes.PARAMETRO0, "SistemaOrigen"));
		}
		errores.append(new Validador<TipoInformacionContextoExterno>().ValidarDataContract(informacionContexto));
    	return errores.toString();
	}
    
    /**
     * Método encargado de invocar el método del DA para consultar los parametros visibles usados en el servicio vinculadoAsofondos
     * @return Mapa con los parametros visibles
     * @throws DataAccessException 
     */
    private Map<String,Object> consultarParametrosVisibles() throws DataAccessException{
    	try{
    		return  daVinculadoAsofondos.consultarParametrosVisibles();
    	}
    	catch(Exception e){
    		throw new DataAccessException(new HashMap<String,Object>(), tracer.getMetadata(), e);
    	}
    }
       

    /**
     * Método encargado de realizar las validaciones de obligatoridad para los datos de entrada del servicio
     * @param informacionContexto, información de contexto para el servicio.
     * @param documentoPersona, objeto con tipo y numero de documento persona natural
     * @return String, Cadena que contiene los mensajes de error para las validaciones.
     * @throws Exception 
     */
    private String validarDatosEntradaObligatorio(TipoInformacionContextoExterno informacionContexto,TipoDocumentoPersonaNatural documentoPersona) throws Exception {
		
		 StringBuilder errores = new StringBuilder();
    	 
		 if(documentoPersona!=null)
		 {
			 /* valida a infomacion del documento*/
			 if(documentoPersona.getTipoDocumento()==null || documentoPersona.getTipoDocumento().isEmpty())
			 {
				 errores.append(Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, "TipoDocumento"));
			 }
			 if(documentoPersona.getNumeroDocumento()==null || documentoPersona.getNumeroDocumento().isEmpty())
			 {
				 errores.append(Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, "NumeroDocumento"));
			 }
		 }
    	 if(informacionContexto!=null)
    	 {
    		 /* valida el sitema de origen */
    		 if(informacionContexto.getSistemaOrigen()==null || informacionContexto.getSistemaOrigen().isEmpty())
    		 {
    			 errores.append(Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, "SistemaOrigen"));
    		 }
    	 }
    	 
		return errores.toString();
	}
}
