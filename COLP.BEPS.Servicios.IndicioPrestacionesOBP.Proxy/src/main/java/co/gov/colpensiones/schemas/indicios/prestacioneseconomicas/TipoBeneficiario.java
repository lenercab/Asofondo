
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.personas.TipoIdentificacionPersona;


/**
 * <p>Java class for tipoBeneficiario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoBeneficiario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionBeneficiario" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionBeneficiario"/>
 *         &lt;element name="identificacionApoderado" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionPersona" minOccurs="0"/>
 *         &lt;element name="identificacionSolicitanteTercero" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionPersona" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoBeneficiario", propOrder = {
    "informacionBeneficiario",
    "identificacionApoderado",
    "identificacionSolicitanteTercero"
})
public class TipoBeneficiario {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionBeneficiario informacionBeneficiario;
    protected TipoIdentificacionPersona identificacionApoderado;
    protected TipoIdentificacionPersona identificacionSolicitanteTercero;

    /**
     * Gets the value of the informacionBeneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionBeneficiario }
     *     
     */
    public TipoInformacionBeneficiario getInformacionBeneficiario() {
        return informacionBeneficiario;
    }

    /**
     * Sets the value of the informacionBeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionBeneficiario }
     *     
     */
    public void setInformacionBeneficiario(TipoInformacionBeneficiario value) {
        this.informacionBeneficiario = value;
    }

    /**
     * Gets the value of the identificacionApoderado property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificacionPersona }
     *     
     */
    public TipoIdentificacionPersona getIdentificacionApoderado() {
        return identificacionApoderado;
    }

    /**
     * Sets the value of the identificacionApoderado property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificacionPersona }
     *     
     */
    public void setIdentificacionApoderado(TipoIdentificacionPersona value) {
        this.identificacionApoderado = value;
    }

    /**
     * Gets the value of the identificacionSolicitanteTercero property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificacionPersona }
     *     
     */
    public TipoIdentificacionPersona getIdentificacionSolicitanteTercero() {
        return identificacionSolicitanteTercero;
    }

    /**
     * Sets the value of the identificacionSolicitanteTercero property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificacionPersona }
     *     
     */
    public void setIdentificacionSolicitanteTercero(TipoIdentificacionPersona value) {
        this.identificacionSolicitanteTercero = value;
    }

}
