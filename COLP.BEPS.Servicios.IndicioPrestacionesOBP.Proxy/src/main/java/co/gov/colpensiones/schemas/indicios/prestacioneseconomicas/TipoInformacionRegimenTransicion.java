
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionRegimenTransicion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionRegimenTransicion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoRegimen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descripcionRegimen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoRegimenTipoPension" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombreRegimenTipoPension" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionRegimenTransicion", propOrder = {
    "codigoRegimen",
    "descripcionRegimen",
    "codigoRegimenTipoPension",
    "nombreRegimenTipoPension"
})
public class TipoInformacionRegimenTransicion {

    @XmlElement(required = true, nillable = true)
    protected String codigoRegimen;
    @XmlElement(required = true, nillable = true)
    protected String descripcionRegimen;
    @XmlElement(required = true, nillable = true)
    protected String codigoRegimenTipoPension;
    @XmlElement(required = true, nillable = true)
    protected String nombreRegimenTipoPension;

    /**
     * Gets the value of the codigoRegimen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRegimen() {
        return codigoRegimen;
    }

    /**
     * Sets the value of the codigoRegimen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRegimen(String value) {
        this.codigoRegimen = value;
    }

    /**
     * Gets the value of the descripcionRegimen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionRegimen() {
        return descripcionRegimen;
    }

    /**
     * Sets the value of the descripcionRegimen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionRegimen(String value) {
        this.descripcionRegimen = value;
    }

    /**
     * Gets the value of the codigoRegimenTipoPension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRegimenTipoPension() {
        return codigoRegimenTipoPension;
    }

    /**
     * Sets the value of the codigoRegimenTipoPension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRegimenTipoPension(String value) {
        this.codigoRegimenTipoPension = value;
    }

    /**
     * Gets the value of the nombreRegimenTipoPension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreRegimenTipoPension() {
        return nombreRegimenTipoPension;
    }

    /**
     * Sets the value of the nombreRegimenTipoPension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreRegimenTipoPension(String value) {
        this.nombreRegimenTipoPension = value;
    }

}
