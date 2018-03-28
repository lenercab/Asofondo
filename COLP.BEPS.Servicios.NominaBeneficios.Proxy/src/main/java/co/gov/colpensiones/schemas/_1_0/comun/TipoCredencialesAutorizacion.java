
package co.gov.colpensiones.schemas._1_0.comun;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoCredencialesAutorizacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoCredencialesAutorizacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombreUsuarioNegocio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombreUsuarioSistema" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="claveUsuarioSistema" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoCredencialesAutorizacion", propOrder = {
    "nombreUsuarioNegocio",
    "nombreUsuarioSistema",
    "claveUsuarioSistema"
})
public class TipoCredencialesAutorizacion {

    @XmlElement(required = true)
    protected String nombreUsuarioNegocio;
    @XmlElement(required = true)
    protected String nombreUsuarioSistema;
    @XmlElement(required = true)
    protected String claveUsuarioSistema;

    /**
     * Gets the value of the nombreUsuarioNegocio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreUsuarioNegocio() {
        return nombreUsuarioNegocio;
    }

    /**
     * Sets the value of the nombreUsuarioNegocio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreUsuarioNegocio(String value) {
        this.nombreUsuarioNegocio = value;
    }

    /**
     * Gets the value of the nombreUsuarioSistema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreUsuarioSistema() {
        return nombreUsuarioSistema;
    }

    /**
     * Sets the value of the nombreUsuarioSistema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreUsuarioSistema(String value) {
        this.nombreUsuarioSistema = value;
    }

    /**
     * Gets the value of the claveUsuarioSistema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveUsuarioSistema() {
        return claveUsuarioSistema;
    }

    /**
     * Sets the value of the claveUsuarioSistema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveUsuarioSistema(String value) {
        this.claveUsuarioSistema = value;
    }

}
