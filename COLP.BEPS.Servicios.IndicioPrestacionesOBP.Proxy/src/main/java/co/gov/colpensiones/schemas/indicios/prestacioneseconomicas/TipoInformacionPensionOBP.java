
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionBasicaIdentificacionPersona;
import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionIdentificacionPersonaJuridica;


/**
 * <p>Java class for tipoInformacionPensionOBP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionPensionOBP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionSolicitante" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionBasicaIdentificacionPersona"/>
 *         &lt;element name="informacionEntidadPensionante" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionIdentificacionPersonaJuridica"/>
 *         &lt;element name="informacionPrestacion" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoPrestacionReconocimiento"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionPensionOBP", propOrder = {
    "informacionSolicitante",
    "informacionEntidadPensionante",
    "informacionPrestacion"
})
public class TipoInformacionPensionOBP {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionBasicaIdentificacionPersona informacionSolicitante;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionIdentificacionPersonaJuridica informacionEntidadPensionante;
    @XmlElement(required = true, nillable = true)
    protected TipoPrestacionReconocimiento informacionPrestacion;

    /**
     * Gets the value of the informacionSolicitante property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionBasicaIdentificacionPersona }
     *     
     */
    public TipoInformacionBasicaIdentificacionPersona getInformacionSolicitante() {
        return informacionSolicitante;
    }

    /**
     * Sets the value of the informacionSolicitante property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionBasicaIdentificacionPersona }
     *     
     */
    public void setInformacionSolicitante(TipoInformacionBasicaIdentificacionPersona value) {
        this.informacionSolicitante = value;
    }

    /**
     * Gets the value of the informacionEntidadPensionante property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionIdentificacionPersonaJuridica }
     *     
     */
    public TipoInformacionIdentificacionPersonaJuridica getInformacionEntidadPensionante() {
        return informacionEntidadPensionante;
    }

    /**
     * Sets the value of the informacionEntidadPensionante property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionIdentificacionPersonaJuridica }
     *     
     */
    public void setInformacionEntidadPensionante(TipoInformacionIdentificacionPersonaJuridica value) {
        this.informacionEntidadPensionante = value;
    }

    /**
     * Gets the value of the informacionPrestacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoPrestacionReconocimiento }
     *     
     */
    public TipoPrestacionReconocimiento getInformacionPrestacion() {
        return informacionPrestacion;
    }

    /**
     * Sets the value of the informacionPrestacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPrestacionReconocimiento }
     *     
     */
    public void setInformacionPrestacion(TipoPrestacionReconocimiento value) {
        this.informacionPrestacion = value;
    }

}
