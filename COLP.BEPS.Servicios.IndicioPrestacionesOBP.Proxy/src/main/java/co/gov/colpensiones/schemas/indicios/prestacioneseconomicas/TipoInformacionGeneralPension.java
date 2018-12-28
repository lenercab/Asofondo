
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionGeneralPension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionGeneralPension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionBasica" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionBasicaPension"/>
 *         &lt;element name="composicionFamiliar" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoComposicionFamiliar"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionGeneralPension", propOrder = {
    "informacionBasica",
    "composicionFamiliar"
})
public class TipoInformacionGeneralPension {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionBasicaPension informacionBasica;
    @XmlElement(required = true, nillable = true)
    protected TipoComposicionFamiliar composicionFamiliar;

    /**
     * Gets the value of the informacionBasica property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionBasicaPension }
     *     
     */
    public TipoInformacionBasicaPension getInformacionBasica() {
        return informacionBasica;
    }

    /**
     * Sets the value of the informacionBasica property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionBasicaPension }
     *     
     */
    public void setInformacionBasica(TipoInformacionBasicaPension value) {
        this.informacionBasica = value;
    }

    /**
     * Gets the value of the composicionFamiliar property.
     * 
     * @return
     *     possible object is
     *     {@link TipoComposicionFamiliar }
     *     
     */
    public TipoComposicionFamiliar getComposicionFamiliar() {
        return composicionFamiliar;
    }

    /**
     * Sets the value of the composicionFamiliar property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoComposicionFamiliar }
     *     
     */
    public void setComposicionFamiliar(TipoComposicionFamiliar value) {
        this.composicionFamiliar = value;
    }

}
