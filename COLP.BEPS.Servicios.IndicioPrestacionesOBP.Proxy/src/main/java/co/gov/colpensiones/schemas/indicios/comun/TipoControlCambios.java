
package co.gov.colpensiones.schemas.indicios.comun;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoControlCambios complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoControlCambios">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fuente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoControlCambios", propOrder = {
    "usuario",
    "fuente"
})
public class TipoControlCambios {

    @XmlElement(required = true, nillable = true)
    protected String usuario;
    @XmlElement(required = true, nillable = true)
    protected String fuente;

    /**
     * Gets the value of the usuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Sets the value of the usuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Gets the value of the fuente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuente() {
        return fuente;
    }

    /**
     * Sets the value of the fuente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuente(String value) {
        this.fuente = value;
    }

}
