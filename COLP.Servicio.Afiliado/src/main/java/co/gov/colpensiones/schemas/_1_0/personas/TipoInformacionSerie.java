
package co.gov.colpensiones.schemas._1_0.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionSerie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionSerie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serie" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subseries" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoSubseries"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionSerie", propOrder = {
    "serie",
    "subseries"
})
public class TipoInformacionSerie {

    @XmlElement(required = true)
    protected String serie;
    @XmlElement(required = true)
    protected TipoSubseries subseries;

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
     * Gets the value of the subseries property.
     * 
     * @return
     *     possible object is
     *     {@link TipoSubseries }
     *     
     */
    public TipoSubseries getSubseries() {
        return subseries;
    }

    /**
     * Sets the value of the subseries property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoSubseries }
     *     
     */
    public void setSubseries(TipoSubseries value) {
        this.subseries = value;
    }

}
