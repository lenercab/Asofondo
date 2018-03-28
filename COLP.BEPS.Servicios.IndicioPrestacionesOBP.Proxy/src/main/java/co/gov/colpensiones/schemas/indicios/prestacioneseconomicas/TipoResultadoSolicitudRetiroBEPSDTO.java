
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.comun.errores.TipoEstadoEjecucion;


/**
 * <p>Java class for tipoResultadoSolicitudRetiroBEPSDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoResultadoSolicitudRetiroBEPSDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Detalle" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoIdentificacionSolicitudRetiroBEPS"/>
 *         &lt;element name="EstadoEjecucion" type="{http://www.colpensiones.gov.co/schemas/1.0/comun/errores}tipoEstadoEjecucion"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoResultadoSolicitudRetiroBEPSDTO", propOrder = {
    "detalle",
    "estadoEjecucion"
})
public class TipoResultadoSolicitudRetiroBEPSDTO {

    @XmlElement(name = "Detalle", required = true, nillable = true)
    protected TipoIdentificacionSolicitudRetiroBEPS detalle;
    @XmlElement(name = "EstadoEjecucion", required = true, nillable = true)
    protected TipoEstadoEjecucion estadoEjecucion;

    /**
     * Gets the value of the detalle property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificacionSolicitudRetiroBEPS }
     *     
     */
    public TipoIdentificacionSolicitudRetiroBEPS getDetalle() {
        return detalle;
    }

    /**
     * Sets the value of the detalle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificacionSolicitudRetiroBEPS }
     *     
     */
    public void setDetalle(TipoIdentificacionSolicitudRetiroBEPS value) {
        this.detalle = value;
    }

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

}