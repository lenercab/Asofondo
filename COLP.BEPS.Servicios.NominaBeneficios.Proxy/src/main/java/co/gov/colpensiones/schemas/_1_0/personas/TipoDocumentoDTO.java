
package co.gov.colpensiones.schemas._1_0.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import co.gov.colpensiones.schemas._1_0.comun.errores.TipoEstadoEjecucion;


/**
 * <p>Java class for tipoDocumentoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoDocumentoDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EstadoEjecucion" type="{http://www.colpensiones.gov.co/schemas/1.0/comun/errores}tipoEstadoEjecucion"/>
 *         &lt;element name="Detalle" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoDocumento"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoDocumentoDTO", propOrder = {
    "estadoEjecucion",
    "detalle"
})
public class TipoDocumentoDTO {

    @XmlElement(name = "EstadoEjecucion", required = true)
    protected TipoEstadoEjecucion estadoEjecucion;
    @XmlElement(name = "Detalle", required = true)
    protected TipoDocumento detalle;

    /**
     * Gets the value of the estadoEjecucion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoEstadoEjecucion }
     *     
     */
    public TipoEstadoEjecucion getEstadoEjecucion() {
        return estadoEjecucion;
    }

    /**
     * Sets the value of the estadoEjecucion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEstadoEjecucion }
     *     
     */
    public void setEstadoEjecucion(TipoEstadoEjecucion value) {
        this.estadoEjecucion = value;
    }

    /**
     * Gets the value of the detalle property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumento }
     *     
     */
    public TipoDocumento getDetalle() {
        return detalle;
    }

    /**
     * Sets the value of the detalle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumento }
     *     
     */
    public void setDetalle(TipoDocumento value) {
        this.detalle = value;
    }

}
