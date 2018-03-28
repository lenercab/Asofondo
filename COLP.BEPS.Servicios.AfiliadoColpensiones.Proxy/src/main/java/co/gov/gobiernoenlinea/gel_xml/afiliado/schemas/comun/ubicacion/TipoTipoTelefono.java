
package co.gov.gobiernoenlinea.gel_xml.afiliado.schemas.comun.ubicacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoTipoTelefono complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoTipoTelefono">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codTipoTelefonoRegistrado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nomTipoTelefonoRegistrado" type="{http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/Comun/Ubicacion}enumNomTipoTelefono" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoTipoTelefono", propOrder = {
    "codTipoTelefonoRegistrado",
    "nomTipoTelefonoRegistrado"
})
public class TipoTipoTelefono {

    @XmlElement(required = true, nillable = true)
    protected String codTipoTelefonoRegistrado;
    protected EnumNomTipoTelefono nomTipoTelefonoRegistrado;

    /**
     * Gets the value of the codTipoTelefonoRegistrado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTipoTelefonoRegistrado() {
        return codTipoTelefonoRegistrado;
    }

    /**
     * Sets the value of the codTipoTelefonoRegistrado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTipoTelefonoRegistrado(String value) {
        this.codTipoTelefonoRegistrado = value;
    }

    /**
     * Gets the value of the nomTipoTelefonoRegistrado property.
     * 
     * @return
     *     possible object is
     *     {@link EnumNomTipoTelefono }
     *     
     */
    public EnumNomTipoTelefono getNomTipoTelefonoRegistrado() {
        return nomTipoTelefonoRegistrado;
    }

    /**
     * Sets the value of the nomTipoTelefonoRegistrado property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumNomTipoTelefono }
     *     
     */
    public void setNomTipoTelefonoRegistrado(EnumNomTipoTelefono value) {
        this.nomTipoTelefonoRegistrado = value;
    }

}
