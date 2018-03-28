
package co.gov.colpensiones.schemas._1_0.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionExpedienteRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionExpedienteRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="propiedades" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoPropiedades"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionExpedienteRecord", propOrder = {
    "id",
    "propiedades"
})
public class TipoInformacionExpedienteRecord {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected TipoPropiedades propiedades;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the propiedades property.
     * 
     * @return
     *     possible object is
     *     {@link TipoPropiedades }
     *     
     */
    public TipoPropiedades getPropiedades() {
        return propiedades;
    }

    /**
     * Sets the value of the propiedades property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPropiedades }
     *     
     */
    public void setPropiedades(TipoPropiedades value) {
        this.propiedades = value;
    }

}
