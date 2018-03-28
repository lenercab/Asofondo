
package co.gov.colpensiones.schemas._1_0.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoIdentificacionTRDDocumento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoIdentificacionTRDDocumento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tramite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subtramite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoIdentificacionTRDDocumento", propOrder = {
    "tramite",
    "subtramite"
})
public class TipoIdentificacionTRDDocumento {

    @XmlElement(required = true, nillable = true)
    protected String tramite;
    @XmlElement(required = true)
    protected String subtramite;

    /**
     * Gets the value of the tramite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTramite() {
        return tramite;
    }

    /**
     * Sets the value of the tramite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTramite(String value) {
        this.tramite = value;
    }

    /**
     * Gets the value of the subtramite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtramite() {
        return subtramite;
    }

    /**
     * Sets the value of the subtramite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtramite(String value) {
        this.subtramite = value;
    }

}
