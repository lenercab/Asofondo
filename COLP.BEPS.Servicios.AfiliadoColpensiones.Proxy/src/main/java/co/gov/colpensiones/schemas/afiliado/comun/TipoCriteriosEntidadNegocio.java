
package co.gov.colpensiones.schemas.afiliado.comun;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoCriteriosEntidadNegocio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoCriteriosEntidadNegocio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombreEntidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="informacionEstructuraSalida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoCriteriosEntidadNegocio", propOrder = {
    "nombreEntidad",
    "informacionEstructuraSalida"
})
public class TipoCriteriosEntidadNegocio {

    @XmlElement(required = true, nillable = true)
    protected String nombreEntidad;
    @XmlElement(required = true, nillable = true)
    protected String informacionEstructuraSalida;

    /**
     * Gets the value of the nombreEntidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEntidad() {
        return nombreEntidad;
    }

    /**
     * Sets the value of the nombreEntidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEntidad(String value) {
        this.nombreEntidad = value;
    }

    /**
     * Gets the value of the informacionEstructuraSalida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformacionEstructuraSalida() {
        return informacionEstructuraSalida;
    }

    /**
     * Sets the value of the informacionEstructuraSalida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformacionEstructuraSalida(String value) {
        this.informacionEstructuraSalida = value;
    }

}
