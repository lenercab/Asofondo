
package co.gov.colpensiones.schemas._1_0.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoSubserie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoSubserie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "tipoSubserie", propOrder = {
    "subserie"
})
public class TipoSubserie {

    @XmlElement(required = true)
    protected String subserie;

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
