
package co.gov.colpensiones.schemas._1_0.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoDigitalizadosDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoDigitalizadosDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResultadosEjecucion" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoEstadosEjecucion"/>
 *         &lt;element name="Detalle" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoDigitalizados"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoDigitalizadosDTO", propOrder = {
    "resultadosEjecucion",
    "detalle"
})
public class TipoDigitalizadosDTO {

    @XmlElement(name = "ResultadosEjecucion", required = true)
    protected TipoEstadosEjecucion resultadosEjecucion;
    @XmlElement(name = "Detalle", required = true)
    protected TipoDigitalizados detalle;

    /**
     * Gets the value of the resultadosEjecucion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoEstadosEjecucion }
     *     
     */
    public TipoEstadosEjecucion getResultadosEjecucion() {
        return resultadosEjecucion;
    }

    /**
     * Sets the value of the resultadosEjecucion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEstadosEjecucion }
     *     
     */
    public void setResultadosEjecucion(TipoEstadosEjecucion value) {
        this.resultadosEjecucion = value;
    }

    /**
     * Gets the value of the detalle property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDigitalizados }
     *     
     */
    public TipoDigitalizados getDetalle() {
        return detalle;
    }

    /**
     * Sets the value of the detalle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDigitalizados }
     *     
     */
    public void setDetalle(TipoDigitalizados value) {
        this.detalle = value;
    }

}
