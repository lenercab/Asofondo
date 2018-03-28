
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.personas.TipoIdentificacionPersona;
import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionBasicaPersonaJuridica;
import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionBasicaPersonaNatural;
import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionUbicacionPersona;


/**
 * <p>Java class for tipoInformacionSolicitanteTercero complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionSolicitanteTercero">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoSolicitante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identificacion" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionPersona"/>
 *         &lt;element name="informacionPersonaNatural" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionBasicaPersonaNatural"/>
 *         &lt;element name="informacionPersonaJuridica" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionBasicaPersonaJuridica" minOccurs="0"/>
 *         &lt;element name="informacionUbicacion" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionUbicacionPersona" minOccurs="0"/>
 *         &lt;element name="notificacionMediosElectronicos" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoNotificacionMediosElectronicos" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionSolicitanteTercero", propOrder = {
    "tipoSolicitante",
    "identificacion",
    "informacionPersonaNatural",
    "informacionPersonaJuridica",
    "informacionUbicacion",
    "notificacionMediosElectronicos"
})
public class TipoInformacionSolicitanteTercero {

    @XmlElement(required = true, nillable = true)
    protected String tipoSolicitante;
    @XmlElement(required = true, nillable = true)
    protected TipoIdentificacionPersona identificacion;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionBasicaPersonaNatural informacionPersonaNatural;
    protected TipoInformacionBasicaPersonaJuridica informacionPersonaJuridica;
    protected TipoInformacionUbicacionPersona informacionUbicacion;
    protected TipoNotificacionMediosElectronicos notificacionMediosElectronicos;

    /**
     * Gets the value of the tipoSolicitante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoSolicitante() {
        return tipoSolicitante;
    }

    /**
     * Sets the value of the tipoSolicitante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoSolicitante(String value) {
        this.tipoSolicitante = value;
    }

    /**
     * Gets the value of the identificacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificacionPersona }
     *     
     */
    public TipoIdentificacionPersona getIdentificacion() {
        return identificacion;
    }

    /**
     * Sets the value of the identificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificacionPersona }
     *     
     */
    public void setIdentificacion(TipoIdentificacionPersona value) {
        this.identificacion = value;
    }

    /**
     * Gets the value of the informacionPersonaNatural property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionBasicaPersonaNatural }
     *     
     */
    public TipoInformacionBasicaPersonaNatural getInformacionPersonaNatural() {
        return informacionPersonaNatural;
    }

    /**
     * Sets the value of the informacionPersonaNatural property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionBasicaPersonaNatural }
     *     
     */
    public void setInformacionPersonaNatural(TipoInformacionBasicaPersonaNatural value) {
        this.informacionPersonaNatural = value;
    }

    /**
     * Gets the value of the informacionPersonaJuridica property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionBasicaPersonaJuridica }
     *     
     */
    public TipoInformacionBasicaPersonaJuridica getInformacionPersonaJuridica() {
        return informacionPersonaJuridica;
    }

    /**
     * Sets the value of the informacionPersonaJuridica property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionBasicaPersonaJuridica }
     *     
     */
    public void setInformacionPersonaJuridica(TipoInformacionBasicaPersonaJuridica value) {
        this.informacionPersonaJuridica = value;
    }

    /**
     * Gets the value of the informacionUbicacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionUbicacionPersona }
     *     
     */
    public TipoInformacionUbicacionPersona getInformacionUbicacion() {
        return informacionUbicacion;
    }

    /**
     * Sets the value of the informacionUbicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionUbicacionPersona }
     *     
     */
    public void setInformacionUbicacion(TipoInformacionUbicacionPersona value) {
        this.informacionUbicacion = value;
    }

    /**
     * Gets the value of the notificacionMediosElectronicos property.
     * 
     * @return
     *     possible object is
     *     {@link TipoNotificacionMediosElectronicos }
     *     
     */
    public TipoNotificacionMediosElectronicos getNotificacionMediosElectronicos() {
        return notificacionMediosElectronicos;
    }

    /**
     * Sets the value of the notificacionMediosElectronicos property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoNotificacionMediosElectronicos }
     *     
     */
    public void setNotificacionMediosElectronicos(TipoNotificacionMediosElectronicos value) {
        this.notificacionMediosElectronicos = value;
    }

}
