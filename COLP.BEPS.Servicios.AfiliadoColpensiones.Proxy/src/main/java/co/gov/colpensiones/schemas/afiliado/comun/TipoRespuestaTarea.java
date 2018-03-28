
package co.gov.colpensiones.schemas.afiliado.comun;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.afiliado.comun.errores.TipoEstadoEjecucion;


/**
 * <p>Java class for tipoRespuestaTarea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoRespuestaTarea">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Detalle" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoIdentificacionTarea"/>
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
@XmlType(name = "tipoRespuestaTarea", propOrder = {
    "detalle",
    "estadoEjecucion"
})
public class TipoRespuestaTarea {

    @XmlElement(name = "Detalle", required = true, nillable = true)
    protected TipoIdentificacionTarea detalle;
    @XmlElement(name = "EstadoEjecucion", required = true, nillable = true)
    protected TipoEstadoEjecucion estadoEjecucion;

    /**
     * Gets the value of the detalle property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificacionTarea }
     *     
     */
    public TipoIdentificacionTarea getDetalle() {
        return detalle;
    }

    /**
     * Sets the value of the detalle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificacionTarea }
     *     
     */
    public void setDetalle(TipoIdentificacionTarea value) {
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
