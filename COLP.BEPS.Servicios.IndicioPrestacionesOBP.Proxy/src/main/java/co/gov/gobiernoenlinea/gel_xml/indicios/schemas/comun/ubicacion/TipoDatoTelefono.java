
package co.gov.gobiernoenlinea.gel_xml.indicios.schemas.comun.ubicacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoDatoTelefono complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoDatoTelefono">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoTelefonoRegistrado" type="{http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/Comun/Ubicacion}tipoTipoTelefono"/>
 *         &lt;element name="numTelefonoContacto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="indicativoPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicativoCiudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoDatoTelefono", propOrder = {
    "tipoTelefonoRegistrado",
    "numTelefonoContacto",
    "indicativoPais",
    "indicativoCiudad",
    "extension"
})
public class TipoDatoTelefono {

    @XmlElement(required = true, nillable = true)
    protected TipoTipoTelefono tipoTelefonoRegistrado;
    @XmlElement(required = true, nillable = true)
    protected String numTelefonoContacto;
    protected String indicativoPais;
    protected String indicativoCiudad;
    protected String extension;

    /**
     * Gets the value of the tipoTelefonoRegistrado property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTipoTelefono }
     *     
     */
    public TipoTipoTelefono getTipoTelefonoRegistrado() {
        return tipoTelefonoRegistrado;
    }

    /**
     * Sets the value of the tipoTelefonoRegistrado property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTipoTelefono }
     *     
     */
    public void setTipoTelefonoRegistrado(TipoTipoTelefono value) {
        this.tipoTelefonoRegistrado = value;
    }

    /**
     * Gets the value of the numTelefonoContacto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumTelefonoContacto() {
        return numTelefonoContacto;
    }

    /**
     * Sets the value of the numTelefonoContacto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumTelefonoContacto(String value) {
        this.numTelefonoContacto = value;
    }

    /**
     * Gets the value of the indicativoPais property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicativoPais() {
        return indicativoPais;
    }

    /**
     * Sets the value of the indicativoPais property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicativoPais(String value) {
        this.indicativoPais = value;
    }

    /**
     * Gets the value of the indicativoCiudad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicativoCiudad() {
        return indicativoCiudad;
    }

    /**
     * Sets the value of the indicativoCiudad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicativoCiudad(String value) {
        this.indicativoCiudad = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

}
