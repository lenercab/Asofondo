
package co.gov.colpensiones.schemas.afiliado.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for causal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="causal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoDocumental" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoTipoDocumental"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "causal", propOrder = {
    "tipoDocumental",
    "descripcion"
})
public class Causal {

    @XmlElement(required = true, nillable = true)
    protected TipoTipoDocumental tipoDocumental;
    @XmlElement(required = true, nillable = true)
    protected String descripcion;

    /**
     * Gets the value of the tipoDocumental property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTipoDocumental }
     *     
     */
    public TipoTipoDocumental getTipoDocumental() {
        return tipoDocumental;
    }

    /**
     * Sets the value of the tipoDocumental property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTipoDocumental }
     *     
     */
    public void setTipoDocumental(TipoTipoDocumental value) {
        this.tipoDocumental = value;
    }

    /**
     * Gets the value of the descripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

}
