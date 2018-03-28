
package co.gov.colpensiones.schemas._1_0.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoResultadoDispocision complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoResultadoDispocision">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResultadosEjecucion" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoEstadosEjecucion"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoResultadoDispocision", propOrder = {
    "resultadosEjecucion"
})
public class TipoResultadoDispocision {

    @XmlElement(name = "ResultadosEjecucion", required = true)
    protected TipoEstadosEjecucion resultadosEjecucion;

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

}
