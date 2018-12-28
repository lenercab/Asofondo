package co.gov.colpensiones.beps.jms.mdb.bean;

import java.util.HashMap;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import co.gov.colpensiones.beps.beneficios.businesslogic.actualizar.BLValidacionesAutomaticas;
import co.gov.colpensiones.beps.comunes.utilidades.Constantes;
import co.gov.colpensiones.beps.comunes.utilidades.ConstantesLoggerServicios;
import co.gov.colpensiones.beps.comunes.utilidades.ConstantesMensajeria;
import co.gov.colpensiones.beps.excepciones.LogicalException;
import co.gov.colpensiones.beps.log.LoggerBeps;

/**
 * Message Driven Bean encargado de leer los mensajes de la cola de mensajería, para la ejecución del proceso de validaciones automáticas
 * para las solicitudes de destinación de recursos radicadas en el sistema BEPS.
 * 
 * <b>Caso de Uso:</b> GOI-OTO-1-FAB-19-ValidacionesAutomaticas<br/>
 * 
 * @author Yenny Nustez Arevalo <ynustez@heinsohn.com.co>
 * 
 */
@MessageDriven(activationConfig = {
        @ActivationConfigProperty(propertyName = "maxSession", propertyValue = "10"),
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
        @ActivationConfigProperty(propertyName = "destination", propertyValue = ConstantesMensajeria.COLA_MENSAJERIA_VALIDACIONES_AUTOMATICAS),
        @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Dups-ok-acknowledge") })
public class ValidacionesAutomaticasMDB implements MessageListener {

    /**
     * Método que recibe el evento de llegada de un mensaje a la cola de mensajería
     * 
     * @param mensaje
     *            Mensaje proveniente de la cola de mensajería
     */
    @Override
    public void onMessage(Message mensaje) {
        LoggerBeps log = new LoggerBeps(ConstantesLoggerServicios.SERVICIO_BENEFICIOS_VALIDACIONES_AUTOMATICAS,
                Constantes.PROCESOS_ASINCRONOS_BEPS);
        String idSolicitud = null;
        try {
            if (mensaje instanceof TextMessage) {
                idSolicitud = ((TextMessage) mensaje).getText();

                /* Se ejecuta la lógica de negocio para las validaciones automáticas*/
                log.info("Inicio procesamiento mensajes cola " + ConstantesMensajeria.COLA_MENSAJERIA_VALIDACIONES_AUTOMATICAS
                        + " . Mensaje recibido (idSolicitud) : " + idSolicitud);
                BLValidacionesAutomaticas blValidaciones = new BLValidacionesAutomaticas(log);
                blValidaciones.validarSolicitudDestinacionRecursos(idSolicitud);
            }
        } catch (Exception e) {
            HashMap<String, String> metaData = new HashMap<String, String>();
            metaData.put(ConstantesLoggerServicios.METADATA_IDENTIFICADOR_SOLICITUD, idSolicitud);
            HashMap<String, Object> payLoad = new HashMap<String, Object>();
            payLoad.put(Constantes.TIPO_ERROR, Constantes.PROCESOS_ASINCRONOS_BEPS);
            payLoad.put(Constantes.URL, "/ValidacionesAutomaticasMDB");
            payLoad.put(ConstantesLoggerServicios.MENSAJE_ERROR, Constantes.ERROR + e.getMessage());
            LogicalException error = new LogicalException(payLoad, metaData, e);
            log.error(error);
        }
    }

}
