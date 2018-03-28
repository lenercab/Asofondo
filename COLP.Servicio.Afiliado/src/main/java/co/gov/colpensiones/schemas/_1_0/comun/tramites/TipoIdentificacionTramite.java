
package co.gov.colpensiones.schemas._1_0.comun.tramites;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoIdentificacionTramite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoIdentificacionTramite">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoTipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoSubTipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "tipoIdentificacionTramite", propOrder = {
    "codigoTipo",
    "codigoSubTipo",
    "numRadicacion"
})
public class TipoIdentificacionTramite {

    @XmlElement(required = true, nillable = true)
    protected String codigoTipo;
    @XmlElement(required = true, nillable = true)
    protected String codigoSubTipo;
    @XmlElement(required = true, nillable = true)
    protected String numRadicacion;

    /**
     * Gets the value of the codigoTipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTipo() {
        return codigoTipo;
    }

    /**
     * Sets the value of the codigoTipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTipo(String value) {
        this.codigoTipo = value;
    }

    /**
     * Gets the value of the codigoSubTipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoSubTipo() {
        return codigoSubTipo;
    }

    /**
     * Sets the value of the codigoSubTipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoSubTipo(String value) {
        this.codigoSubTipo = value;
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
