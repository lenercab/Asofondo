
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionBasicaIdentificacionPersona;
import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionGeneralPersonaJuridica;


/**
 * <p>Java class for tipoInformacionBasicaCargueTiemposPublicos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionBasicaCargueTiemposPublicos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionTrabajadorPrincipal" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionGeneralTrabajadorTiemposPublicos"/>
 *         &lt;element name="informacionTrabajadorSustituto" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionBasicaIdentificacionPersona" minOccurs="0"/>
 *         &lt;element name="estadoCertificacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entidadCertificadora" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionGeneralPersonaJuridica"/>
 *         &lt;element name="informacionEmpleador" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionGeneralEmpleadorTiemposPublicos"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionBasicaCargueTiemposPublicos", propOrder = {
    "informacionTrabajadorPrincipal",
    "informacionTrabajadorSustituto",
    "estadoCertificacion",
    "entidadCertificadora",
    "informacionEmpleador"
})
public class TipoInformacionBasicaCargueTiemposPublicos {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionGeneralTrabajadorTiemposPublicos informacionTrabajadorPrincipal;
    protected TipoInformacionBasicaIdentificacionPersona informacionTrabajadorSustituto;
    @XmlElement(required = true, nillable = true)
    protected String estadoCertificacion;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionGeneralPersonaJuridica entidadCertificadora;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionGeneralEmpleadorTiemposPublicos informacionEmpleador;

    /**
     * Gets the value of the informacionTrabajadorPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionGeneralTrabajadorTiemposPublicos }
     *     
     */
    public TipoInformacionGeneralTrabajadorTiemposPublicos getInformacionTrabajadorPrincipal() {
        return informacionTrabajadorPrincipal;
    }

    /**
     * Sets the value of the informacionTrabajadorPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionGeneralTrabajadorTiemposPublicos }
     *     
     */
    public void setInformacionTrabajadorPrincipal(TipoInformacionGeneralTrabajadorTiemposPublicos value) {
        this.informacionTrabajadorPrincipal = value;
    }

    /**
     * Gets the value of the informacionTrabajadorSustituto property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionBasicaIdentificacionPersona }
     *     
     */
    public TipoInformacionBasicaIdentificacionPersona getInformacionTrabajadorSustituto() {
        return informacionTrabajadorSustituto;
    }

    /**
     * Sets the value of the informacionTrabajadorSustituto property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionBasicaIdentificacionPersona }
     *     
     */
    public void setInformacionTrabajadorSustituto(TipoInformacionBasicaIdentificacionPersona value) {
        this.informacionTrabajadorSustituto = value;
    }

    /**
     * Gets the value of the estadoCertificacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoCertificacion() {
        return estadoCertificacion;
    }

    /**
     * Sets the value of the estadoCertificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoCertificacion(String value) {
        this.estadoCertificacion = value;
    }

    /**
     * Gets the value of the entidadCertificadora property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionGeneralPersonaJuridica }
     *     
     */
    public TipoInformacionGeneralPersonaJuridica getEntidadCertificadora() {
        return entidadCertificadora;
    }

    /**
     * Sets the value of the entidadCertificadora property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionGeneralPersonaJuridica }
     *     
     */
    public void setEntidadCertificadora(TipoInformacionGeneralPersonaJuridica value) {
        this.entidadCertificadora = value;
    }

    /**
     * Gets the value of the informacionEmpleador property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionGeneralEmpleadorTiemposPublicos }
     *     
     */
    public TipoInformacionGeneralEmpleadorTiemposPublicos getInformacionEmpleador() {
        return informacionEmpleador;
    }

    /**
     * Sets the value of the informacionEmpleador property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionGeneralEmpleadorTiemposPublicos }
     *     
     */
    public void setInformacionEmpleador(TipoInformacionGeneralEmpleadorTiemposPublicos value) {
        this.informacionEmpleador = value;
    }

}
