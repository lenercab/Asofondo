
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.personas.TipoIdentificacionPersona;
import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionBasicaPersonaNatural;
import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionUbicacionPersona;


/**
 * <p>Java class for tipoInformacionBeneficiario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionBeneficiario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacion" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionPersona"/>
 *         &lt;element name="informacionPersonaNatural" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionBasicaPersonaNatural"/>
 *         &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nacionalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentesco" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "tipoInformacionBeneficiario", propOrder = {
    "identificacion",
    "informacionPersonaNatural",
    "fechaNacimiento",
    "nacionalidad",
    "parentesco",
    "informacionUbicacion",
    "notificacionMediosElectronicos"
})
public class TipoInformacionBeneficiario {

    @XmlElement(required = true, nillable = true)
    protected TipoIdentificacionPersona identificacion;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionBasicaPersonaNatural informacionPersonaNatural;
    @XmlElement(required = true, nillable = true)
    protected String fechaNacimiento;
    protected String nacionalidad;
    @XmlElement(required = true, nillable = true)
    protected String parentesco;
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
     * Gets the value of the fechaNacimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Sets the value of the fechaNacimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacimiento(String value) {
        this.fechaNacimiento = value;
    }

    /**
     * Gets the value of the nacionalidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Sets the value of the nacionalidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacionalidad(String value) {
        this.nacionalidad = value;
    }

    /**
     * Gets the value of the parentesco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentesco() {
        return parentesco;
    }

    /**
     * Sets the value of the parentesco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentesco(String value) {
        this.parentesco = value;
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
