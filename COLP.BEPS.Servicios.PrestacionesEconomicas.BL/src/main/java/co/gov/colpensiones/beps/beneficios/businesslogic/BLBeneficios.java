package co.gov.colpensiones.beps.beneficios.businesslogic;

import java.util.HashMap;

import co.gov.colpensiones.beps.comunes.utilidades.Constantes;
import co.gov.colpensiones.beps.comunes.utilidades.ConstantesLoggerServicios;
import co.gov.colpensiones.beps.excepciones.DataAccessException;
import co.gov.colpensiones.beps.excepciones.LogicalException;
import co.gov.colpensiones.beps.log.LoggerBeps;
import co.gov.colpensiones.beps.schemas._1_0.comun.TipoEstadoEjecucion;

/**
 * <b>Descripcion:</b> Clase que <br/>
 * <b>Caso de Uso:</b> BEPS - <br/>
 *
 * @author csalazar <csalazar@heinsohn.com.co>
 */
public class BLBeneficios {
    
    /** Variable para el manejo de log de la funcionalidad.  */
    protected LoggerBeps log = null;

    /**
     * Constructor de la clase.
     * 
     * @param log log con el que se va a escribir de la BD
     */
    public BLBeneficios(LoggerBeps log) {
        this.log = log;
    }
    
    /**
     * Método que genera la traza de log de error del servicio
     * 
     * @param metaData datos del servicio
     * @param dataError true si corresponde a un error de acceso a datos. False en caso contrario.
     * @param e Excepción generada
     */
    protected void generarLogError(HashMap<String, String> metaData, boolean dataError, Exception e) {

        // registro en el log
        HashMap<String, Object> payLoad = new HashMap<String, Object>();

        if (dataError) {
        	String mensajeError = ((DataAccessException) e).getErrorInterno().getMessage();
            payLoad.put(Constantes.ERROR_BD, mensajeError);
            payLoad.put(Constantes.TIPO_ERROR, Constantes.SERVICIO_WEB);
            payLoad.put(Constantes.URL, "/COLP.BEPS.Servicios.Beneficios/ContratoSvcBeneficios");
            payLoad.put(ConstantesLoggerServicios.MENSAJE_ERROR, Constantes.ERROR + mensajeError);
            DataAccessException error = new DataAccessException(payLoad, metaData, e);
            log.error(error);
        } else {
            payLoad.put(Constantes.TIPO_ERROR, Constantes.SERVICIO_WEB);
            payLoad.put(Constantes.URL, "/COLP.BEPS.Servicios.Beneficios/ContratoSvcBeneficios");
            payLoad.put(ConstantesLoggerServicios.MENSAJE_ERROR, Constantes.ERROR + e.getMessage());
            LogicalException error = new LogicalException(payLoad, metaData, e);
            log.error(error);
        }
    }

    /**
     * Método que retorna un objeto mapeando las constantes de código de error y respuesta fallida de un servicio.
     * 
     * @return tipoEstadoEjecucion, objeto que contiene la respuesta fallida del servicio
     */
    protected TipoEstadoEjecucion respuestaErrorTecnicoServicio() {
        TipoEstadoEjecucion tipoEstadoEjecucion = new TipoEstadoEjecucion();
        tipoEstadoEjecucion.setId(log.getIdTransaccion());
        tipoEstadoEjecucion.setCodigo(Constantes.COD_ERROR_INTERNO);
        tipoEstadoEjecucion.setDescripcion(Constantes.DESC_ERROR_INTERNO);
        return tipoEstadoEjecucion;
    }

    /**
     * Método que retorna un objeto mapeando las constantes de código y respuesta exitosa de un servicio.
     * 
     * @return tipoEstadoEjecucion, objeto que contiene la respuesta exitosa del servicio
     */
    protected TipoEstadoEjecucion respuestaExitosaServicio() {
        TipoEstadoEjecucion tipoEstadoEjecucion = new TipoEstadoEjecucion();
        tipoEstadoEjecucion.setId(log.getIdTransaccion());
        tipoEstadoEjecucion.setCodigo(Constantes.COD_INVOCACION_EXITOSA);
        tipoEstadoEjecucion.setDescripcion(Constantes.DESC_INVOCACION_EXITOSA);
        return tipoEstadoEjecucion;
    }
    
    /**
     * Método que genera un objeto TipoEstadoEjecucion de acuerdo al código y 
     * mensaje ingresados por parámetro.
     * 
     * @param codigo Código de Respuesta para el servicio.
     * @param mensaje Mensaje de respuesta para el servicio.
     * @return <TipoEstadoEjecucion> Objeto para dar respuesta a la invocación del servicio.
     */
    protected TipoEstadoEjecucion respuestaNegocioServicio(String codigo, String mensaje) {
        TipoEstadoEjecucion tipoEstadoEjecucion = new TipoEstadoEjecucion();
        tipoEstadoEjecucion.setId(log.getIdTransaccion());
        tipoEstadoEjecucion.setCodigo(codigo);
        tipoEstadoEjecucion.setDescripcion(mensaje);
        return tipoEstadoEjecucion;
    }
    
    /**
     * Método que obtiene el valor para un campo de tipo BIT.
     * @param valor String a convertir, se recibe 'SI' o 'NO'
     * @return Entero con los posibles valores 1 o 0.
     */
    protected int obtenerDatoBit(String valor){
        return Constantes.SI.equals(valor) ? 1 : 0;
    }

}
