
package co.gov.colpensiones.beps.schemas._1_0.certificados;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.beps.schemas._1_0.comun.TipoEstadoEjecucion;


/**
 * <b>Descripción:</b> Clase que representa contiene la estructura del dato de salida para el estado de ejecución de una operación de servicio web
 * y el archivo certificado en byte.<br/>
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoRespuestaCertificadoDTO", propOrder = {
    "archivoCertificado",
    "estadoEjecucion"
})
public class TipoRespuestaCertificadoDTO {

	/**Contenido del archivo en formato byte (stream), */
    @XmlElement(required = true, nillable = true)
    protected byte[] archivoCertificado;
    /** estructura del dato de salida para el estado de ejecución de una operación de servicio web*/
    @XmlElement(required = true)
    protected TipoEstadoEjecucion estadoEjecucion;

    /**
     * Devuelve el valor de archivoCertificado.
     * @return El valor de archivoCertificado
     */
    public byte[] getArchivoCertificado() {
        return archivoCertificado;
    }

    /**
     * Establece el valor de archivoCertificado.
     * @param value El valor por establecer para archivoCertificado
     */
    public void setArchivoCertificado(byte[] value) {
        this.archivoCertificado = value;
    }

    /**
     * Devuelve el valor de estadoEjecucion.
     * @return El valor de estadoEjecucion
     */
    public TipoEstadoEjecucion getEstadoEjecucion() {
        return estadoEjecucion;
    }

    /**
     * Establece el valor de estadoEjecucion.
     * @param value El valor por establecer para estadoEjecucion
     */
    public void setEstadoEjecucion(TipoEstadoEjecucion value) {
        this.estadoEjecucion = value;
    }

}
