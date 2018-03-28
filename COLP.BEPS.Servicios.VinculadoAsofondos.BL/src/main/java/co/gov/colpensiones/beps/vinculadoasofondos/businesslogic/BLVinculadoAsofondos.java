package co.gov.colpensiones.beps.vinculadoasofondos.businesslogic;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashMap;

import co.gov.colpensiones.beps.comunes.utilidades.Constantes;
import co.gov.colpensiones.beps.comunes.utilidades.ConstantesLoggerServicios;
import co.gov.colpensiones.beps.excepciones.DataAccessException;
import co.gov.colpensiones.beps.excepciones.FunctionalException;
import co.gov.colpensiones.beps.log.LoggerBeps;
import co.gov.colpensiones.beps.log.TimeTracer;
import co.gov.colpensiones.beps.schemas._1_0.comun.TipoEstadoEjecucionServicio;
import co.gov.colpensiones.beps.schemas._1_0.comun.TipoInformacionContextoExterno;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoDocumentoPersonaNatural;

/**
 * <b>Descripción:</b> Clase que contiene lógica el servicio de Vinculado Asofondos.<br/>
 * @author Yesika Ramirez <yeramirez@heinsohn.com.co>
 */
public class BLVinculadoAsofondos {

    /** Clase para el acceso a datos.*/
    protected DAVinculadoAsofondos daVinculadoAsofondos = null;

    /** Atributo para tomar trazas de tiempo durante la ejecución del preproceso.*/
    protected TimeTracer tracer;
        
    /**
     * Método constructor
     * 
     * @param log, log asociado a la funcionalidad
     */
    public BLVinculadoAsofondos(LoggerBeps log) {
        this.tracer = new TimeTracer(log, new HashMap<String,String>());
        daVinculadoAsofondos=new DAVinculadoAsofondos();
    }
    
    /**
     * Método encargado de inicializar la metadata del tracer
     * 
     * @param informacionCertificado Información de negocio de entrada al servicio
     */
    protected void initMetadata(TipoDocumentoPersonaNatural documentoPersona, TipoInformacionContextoExterno informacionContextoExterno){
    	tracer.getMetadata().put(ConstantesLoggerServicios.METADATA_TIPO_DOCUMENTO, documentoPersona.getTipoDocumento());
    	tracer.getMetadata().put(ConstantesLoggerServicios.METADATA_NUM_DOCUMENTO, documentoPersona.getNumeroDocumento());
    	tracer.getMetadata().put(ConstantesLoggerServicios.METADATA_USUARIO_ULTIMO_CAMBIO, informacionContextoExterno.getUsuarioSistemaExterno());
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
    	fe.getPayLoad().put(Constantes.URL, "/COLP.BEPS.Servicios.VinculadoAsofondos/ContratoSvcVinculadoAsofondos");
    	fe.getPayLoad().put(ConstantesLoggerServicios.MENSAJE_ERROR, Constantes.ERROR + fe.getErrorInterno().getMessage());
    	if(fe instanceof DataAccessException){
    		fe.getPayLoad().put(Constantes.ERROR_BD, fe.getErrorInterno().getMessage());
    	}
        tracer.getLogger().error(fe);
    }

    
   /** Método que genera un objeto TipoEstadoEjecucion de acuerdo al código y mensaje ingresados por parámetro.
    * 
    * @param codigo, Código de resultado de ejecución del proceso
    * @param mensaje, Mensaje de resultado de ejecución del proceso
    * @return tipoEstadoEjecucion, objeto que contiene el estado de ejecucion del servicio
    */
   protected TipoEstadoEjecucionServicio respuestaNegocioServicio(String codigo, String mensaje) {
	   TipoEstadoEjecucionServicio tipoEstadoEjecucion = new TipoEstadoEjecucionServicio();
       tipoEstadoEjecucion.setCodigo(codigo);
       tipoEstadoEjecucion.setDescripcion(mensaje);
       return tipoEstadoEjecucion;
   }
   
   /** Método que establece el formato a utilizar.
    * @param patron, patron para dar formato al numero
    * @return DecimalFormat, objeto con el formato establecido
    */
   protected DecimalFormat formatearValores (String patron){
	   DecimalFormat formatoNumero = new DecimalFormat(patron);    		
	   DecimalFormatSymbols dfs = new DecimalFormatSymbols();
	   dfs.setDecimalSeparator('.');
	   formatoNumero.setDecimalFormatSymbols(dfs);
	   formatoNumero.setParseBigDecimal(true);
		return formatoNumero;
   }
   
   /**
    * Método utilitario para parsear los valores nulos y evitar errores
    * @param objeto
    *            objeto recibido de la consulta
    * @return valor valido del objeto
    */
   protected Object parseDatoValido(Object objeto) {
       if (objeto!=null){
       	return objeto;
       }else{
       	return "";
       }
   }
}