
package co.gov.colpensiones.schemas.indicios.comun;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoRespuestaRadicacionCasoBPM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoRespuestaRadicacionCasoBPM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificadorCaso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numRadicacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoRespuestaRadicacionCasoBPM", propOrder = {
    "identificadorCaso",
    "numRadicacion"
})
public class TipoRespuestaRadicacionCasoBPM {

    @XmlElement(required = true, nillable = true)
    protected String identificadorCaso;
    @XmlElement(required = true, nillable = true)
    protected String numRadicacion;

    /**
     * Gets the value of the identificadorCaso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorCaso() {
        return identificadorCaso;
    }

    /**
     * Sets the value of the identificadorCaso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorCaso(String value) {
        this.identificadorCaso = value;
    }

    /**
     * Gets the value of the numRadicacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRadicacion() {
        return numRadicacion;
    }

    /**
     * Sets the value of the numRadicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRadicacion(String value) {
        this.numRadicacion = value;
    }

}
