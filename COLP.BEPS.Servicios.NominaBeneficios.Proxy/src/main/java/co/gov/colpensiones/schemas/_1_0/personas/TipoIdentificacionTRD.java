
package co.gov.colpensiones.schemas._1_0.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoIdentificacionTRD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoIdentificacionTRD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serie" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subserie" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoIdentificacionTRD", propOrder = {
    "serie",
    "subserie"
})
public class TipoIdentificacionTRD {

    @XmlElement(required = true, nillable = true)
    protected String serie;
    @XmlElement(required = true)
    protected String subserie;

    /**
     * Gets the value of the serie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Sets the value of the serie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerie(String value) {
        this.serie = value;
    }

    /**
     * Gets the value of the subserie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubserie() {
        return subserie;
    }

    /**
     * Sets the value of the subserie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubserie(String value) {
        this.subserie = value;
    }

}
