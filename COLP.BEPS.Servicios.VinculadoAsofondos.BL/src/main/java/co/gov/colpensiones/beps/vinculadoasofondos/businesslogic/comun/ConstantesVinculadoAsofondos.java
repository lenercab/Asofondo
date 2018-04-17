package co.gov.colpensiones.beps.vinculadoasofondos.businesslogic.comun;
/**
 * 
 * <b>Descripcion:</b> Clase que contiene las constantes utilizadas en el servicio <br/>
 * <b>Caso de Uso:</b> GVI-VIN-3-FAB-14-ConsultarViabilidadVinculacionAsofondos.<br/>
 *
 * @author Yesika Marlen Ramirez Cardenas. <yeramirez@heinsohn.com.co>
 */
public class ConstantesVinculadoAsofondos {
	
	
	//Parametros que indican de tipo de persona 
	/**Indentificador del tipo persona vinculado*/
	public static final String VALOR_VINCULADO="Vinculado";
	
	/**Indentificador del tipo persona previnculado*/
	public static final String VALOR_PREVINCULADO="Previnculado";
	
	/**Indentificador del tipo persona vinculado*/
	public static final String VALOR_PROSPECTO="Prospecto";

	
	//Constantes con el codigo del tipo de persona recibidos por la consulta
	/**Indentificador del tipo persona vinculado*/
	public static final String COD_TIPO_VI="1";
	
	/**Indentificador del tipo persona previnculado*/
	public static final String COD_TIPO_PV="2";
	
	/**Indentificador del tipo persona vinculado*/
	public static final String COD_TIPO_PP="0";
	
	//Parametros que indican respuesta de viabilidad
	/**Parametro que indica que un prospecto si es viable*/
	public static final String VALOR_VIABLE = "Viable";
	/**Parametro que indica que un prospecto no es viable*/
	public static final String VALOR_NO_VIABLE = "No Viable";
	
	//Constantes con el codigo de viabilidad recibido por la consulta
	/**Codigo que indica viabilidad*/
	public static final String COD_VIABLE="0";
	/**Codigo que indica no viabilidad*/
	public static final String COD_NO_VIABLE="1";
		
	
	//LLaves del mapa de parametros de visualizacion
	/**Llave para el parametro saldo_total_cuenta_individual*/
	public static final String LLAVE_SALDO_TOTAL_CUENTA = "saldo_total_cuenta_individual";
	
	/**Llave para el parametro saldo_total_cuenta_individual*/
	public static final String LLAVE_VALOR_SUBSIDIO_BEPS = "valor_subsidio_BEPS";
	
	/**Llave para el parametro saldo_total_cuenta_individual*/
	public static final String LLAVE_EQUIVALENCIA_SEMANAS_CON_SUBS = "equivalencia_semanas_con_subisidio";
	
	/**Llave para el parametro saldo_total_cuenta_individual*/
	public static final String LLAVE_EQUIVALENCIA_SEMANAS_SIN_SUBS = "equivalencia_semanas_sin_subisidio";

	//Mensajes de error
	/**Constante con mensaje de error para cuando no existe el solicitante como prospecto*/
	public static final String MSJ_ERROR_NO_EXISTE_PROSPECTO="Solicitante no existe como prospecto.";
	
	/**Constante con mensaje de error para cuando la información es incompleta*/
	public static final String MSJ_ERROR_NO_EXISTE_INFORMACION="No existe información.";
	
	 /** mensaje para enviar al log cuando existe error */
    public static final String MSJ_ERROR_LOG = "MensajesError";
    
    /** Descripción que se retorna cuando se tiene un error de código 03 error inesperado en la ejecución del servicio */
    public static final String MSJ_ERROR_INTERNO = "Error interno durante la ejecución del servicio";
    
   
	//Codigos de error
	 /** codigo de error para cuando la informacion no es completa*/
	public static final String COD_ERROR_INFORMACION_INCOMPLETA = "05";
	 /** Código para el formato inválido */
    public static final String COD_FORMATO_INVALIDO_OBLIGATORIO_NO_RECIBIDO = "01";
    /** Código que se retorna cuando ocurre un error de lógica de negocio en la ejecución del servicio */
    public static final String COD_ERROR_LOGICA_NEGOCIO = "04";
    /** Código que se retorna cuando ocurre un error inesperado en la ejecución del servicio */
    public static final String COD_ERROR_INTERNO = "03";
        
    //Codigos de exito 
    /** Código para la invocacion exitosa */
    public static final String COD_INVOCACION_EXITOSA = "0";
	
	/** Mensaje para el tracer fin para la consulta viabilidad cinculacion*/
	public static final String FIN_TRACER_VIABILIDAD_VINCULACION = "Fin ejecución del servicio Vinculado Asofondos";
	
	/** Mensaje para el tracer fin para la consulta viabilidad cinculacion*/
	public static final String FIN_TRACER_CONSULTA_VIABILIDAD = "Fin ejecución de consulta viabilidad";
    
    public static final String TIPO_AREA_ASOFONDOS = "1";
    public static final String TIPO_TRAMITE_ASOFONDOS = "1";
    public static final String URL_SERVICIO_BDUA = "url_servicio_bdua";
    

    public static final String CADENA_VACIA = "";
}
