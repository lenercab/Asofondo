
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.personas.TipoIdentificacionPersona;


/**
 * <p>Java class for tipoInformacionGeneralCargueBeneficiario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionGeneralCargueBeneficiario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionBasica" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionBasicaCargueBeneficiario"/>
 *         &lt;element name="informacionAfiliado" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionPersona"/>
 *         &lt;element name="informacionBeneficiarios" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoBeneficiarios"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionGeneralCargueBeneficiario", propOrder = {
    "informacionBasica",
    "informacionAfiliado",
    "informacionBeneficiarios"
})
public class TipoInformacionGeneralCargueBeneficiario {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionBasicaCargueBeneficiario informacionBasica;
    @XmlElement(required = true, nillable = true)
    protected TipoIdentificacionPersona informacionAfiliado;
    @XmlElement(required = true, nillable = true)
    protected TipoBeneficiarios informacionBeneficiarios;

    /**
     * Gets the value of the informacionBasica property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionBasicaCargueBeneficiario }
     *     
     */
    public TipoInformacionBasicaCargueBeneficiario getInformacionBasica() {
        return informacionBasica;
    }

    /**
     * Sets the value of the informacionBasica property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionBasicaCargueBeneficiario }
     *     
     */
    public void setInformacionBasica(TipoInformacionBasicaCargueBeneficiario value) {
        this.informacionBasica = value;
    }

    /**
     * Gets the value of the informacionAfiliado property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificacionPersona }
     *     
     */
    public TipoIdentificacionPersona getInformacionAfiliado() {
        return informacionAfiliado;
    }

    /**
     * Sets the value of the informacionAfiliado property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificacionPersona }
     *     
     */
    public void setInformacionAfiliado(TipoIdentificacionPersona value) {
        this.informacionAfiliado = value;
    }

    /**
     * Gets the value of the informacionBeneficiarios property.
     * 
     * @return
     *     possible object is
     *     {@link TipoBeneficiarios }
     *     
     */
    public TipoBeneficiarios getInformacionBeneficiarios() {
        return informacionBeneficiarios;
    }

    /**
     * Sets the value of the informacionBeneficiarios property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoBeneficiarios }
     *     
     */
    public void setInformacionBeneficiarios(TipoBeneficiarios value) {
        this.informacionBeneficiarios = value;
    }

}
