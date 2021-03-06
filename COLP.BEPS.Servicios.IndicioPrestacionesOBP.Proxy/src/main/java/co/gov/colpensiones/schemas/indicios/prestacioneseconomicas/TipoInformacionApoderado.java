
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.personas.TipoIdentificacionPersona;
import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionBasicaPersonaNatural;
import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionUbicacionPersona;


/**
 * <p>Java class for tipoInformacionApoderado complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionApoderado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacion" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionPersona"/>
 *         &lt;element name="informacionPersonal" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionBasicaPersonaNatural"/>
 *         &lt;element name="numeroTarjetaProfesional" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "tipoInformacionApoderado", propOrder = {
    "identificacion",
    "informacionPersonal",
    "numeroTarjetaProfesional",
    "informacionUbicacion",
    "notificacionMediosElectronicos"
})
public class TipoInformacionApoderado {

    @XmlElement(required = true, nillable = true)
    protected TipoIdentificacionPersona identificacion;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionBasicaPersonaNatural informacionPersonal;
    @XmlElement(required = true, nillable = true)
    protected String numeroTarjetaProfesional;
    protected TipoInformacionUbicacionPersona informacionUbicacion;
    protected TipoNotificacionMediosElectronicos notificacionMediosElectronicos;

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
     * Gets the value of the informacionPersonal property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionBasicaPersonaNatural }
     *     
     */
    public TipoInformacionBasicaPersonaNatural getInformacionPersonal() {
        return informacionPersonal;
    }

    /**
     * Sets the value of the informacionPersonal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionBasicaPersonaNatural }
     *     
     */
    public void setInformacionPersonal(TipoInformacionBasicaPersonaNatural value) {
        this.informacionPersonal = value;
    }

    /**
     * Gets the value of the numeroTarjetaProfesional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTarjetaProfesional() {
        return numeroTarjetaProfesional;
    }

    /**
     * Sets the value of the numeroTarjetaProfesional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTarjetaProfesional(String value) {
        this.numeroTarjetaProfesional = value;
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
