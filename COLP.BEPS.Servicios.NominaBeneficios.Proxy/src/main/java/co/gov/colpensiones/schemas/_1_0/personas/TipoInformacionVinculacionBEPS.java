
package co.gov.colpensiones.schemas._1_0.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import co.gov.colpensiones.schemas._1_0.comun.TipoEstado;


/**
 * <p>Java class for tipoInformacionVinculacionBEPS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionVinculacionBEPS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionPersonal" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionVinculacionBEPS.informacionPersonalType" minOccurs="0"/>
 *         &lt;element name="informacionNacimiento" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionVinculacionBEPS.informacionNacimientoType"/>
 *         &lt;element name="informacionResidencia" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionUbicacionPersona" minOccurs="0"/>
 *         &lt;element name="informacionSisben" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionVinculacionBEPS.informacionSisbenType"/>
 *         &lt;element name="informacionBeneficiario" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionVinculacionBEPS.informacionBeneficiarioType" minOccurs="0"/>
 *         &lt;element name="estadoVinculacion" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoEstado"/>
 *         &lt;element name="usuarioVinculacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroRadicacionVinculacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destinacionFondos" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoEstado"/>
 *         &lt;element name="indicadorOtorgamiento" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="indicadorAutorizacionEnvioNotificaciones" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionVinculacionBEPS", propOrder = {
    "informacionPersonal",
    "informacionNacimiento",
    "informacionResidencia",
    "informacionSisben",
    "informacionBeneficiario",
    "estadoVinculacion",
    "usuarioVinculacion",
    "numeroRadicacionVinculacion",
    "destinacionFondos",
    "indicadorOtorgamiento",
    "indicadorAutorizacionEnvioNotificaciones"
})
public class TipoInformacionVinculacionBEPS {

    protected TipoInformacionVinculacionBEPSInformacionPersonalType informacionPersonal;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionVinculacionBEPSInformacionNacimientoType informacionNacimiento;
    protected TipoInformacionUbicacionPersona informacionResidencia;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionVinculacionBEPSInformacionSisbenType informacionSisben;
    protected TipoInformacionVinculacionBEPSInformacionBeneficiarioType informacionBeneficiario;
    @XmlElement(required = true, nillable = true)
    protected TipoEstado estadoVinculacion;
    @XmlElement(required = true, nillable = true)
    protected String usuarioVinculacion;
    @XmlElement(required = true, nillable = true)
    protected String numeroRadicacionVinculacion;
    @XmlElement(required = true, nillable = true)
    protected TipoEstado destinacionFondos;
    protected boolean indicadorOtorgamiento;
    protected boolean indicadorAutorizacionEnvioNotificaciones;

    /**
     * Gets the value of the informacionPersonal property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionVinculacionBEPSInformacionPersonalType }
     *     
     */
    public TipoInformacionVinculacionBEPSInformacionPersonalType getInformacionPersonal() {
        return informacionPersonal;
    }

    /**
     * Sets the value of the informacionPersonal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionVinculacionBEPSInformacionPersonalType }
     *     
     */
    public void setInformacionPersonal(TipoInformacionVinculacionBEPSInformacionPersonalType value) {
        this.informacionPersonal = value;
    }

    /**
     * Gets the value of the informacionNacimiento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionVinculacionBEPSInformacionNacimientoType }
     *     
     */
    public TipoInformacionVinculacionBEPSInformacionNacimientoType getInformacionNacimiento() {
        return informacionNacimiento;
    }

    /**
     * Sets the value of the informacionNacimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionVinculacionBEPSInformacionNacimientoType }
     *     
     */
    public void setInformacionNacimiento(TipoInformacionVinculacionBEPSInformacionNacimientoType value) {
        this.informacionNacimiento = value;
    }

    /**
     * Gets the value of the informacionResidencia property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionUbicacionPersona }
     *     
     */
    public TipoInformacionUbicacionPersona getInformacionResidencia() {
        return informacionResidencia;
    }

    /**
     * Sets the value of the informacionResidencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionUbicacionPersona }
     *     
     */
    public void setInformacionResidencia(TipoInformacionUbicacionPersona value) {
        this.informacionResidencia = value;
    }

    /**
     * Gets the value of the informacionSisben property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionVinculacionBEPSInformacionSisbenType }
     *     
     */
    public TipoInformacionVinculacionBEPSInformacionSisbenType getInformacionSisben() {
        return informacionSisben;
    }

    /**
     * Sets the value of the informacionSisben property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionVinculacionBEPSInformacionSisbenType }
     *     
     */
    public void setInformacionSisben(TipoInformacionVinculacionBEPSInformacionSisbenType value) {
        this.informacionSisben = value;
    }

    /**
     * Gets the value of the informacionBeneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionVinculacionBEPSInformacionBeneficiarioType }
     *     
     */
    public TipoInformacionVinculacionBEPSInformacionBeneficiarioType getInformacionBeneficiario() {
        return informacionBeneficiario;
    }

    /**
     * Sets the value of the informacionBeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionVinculacionBEPSInformacionBeneficiarioType }
     *     
     */
    public void setInformacionBeneficiario(TipoInformacionVinculacionBEPSInformacionBeneficiarioType value) {
        this.informacionBeneficiario = value;
    }

    /**
     * Gets the value of the estadoVinculacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoEstado }
     *     
     */
    public TipoEstado getEstadoVinculacion() {
        return estadoVinculacion;
    }

    /**
     * Sets the value of the estadoVinculacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEstado }
     *     
     */
    public void setEstadoVinculacion(TipoEstado value) {
        this.estadoVinculacion = value;
    }

    /**
     * Gets the value of the usuarioVinculacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioVinculacion() {
        return usuarioVinculacion;
    }

    /**
     * Sets the value of the usuarioVinculacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioVinculacion(String value) {
        this.usuarioVinculacion = value;
    }

    /**
     * Gets the value of the numeroRadicacionVinculacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRadicacionVinculacion() {
        return numeroRadicacionVinculacion;
    }

    /**
     * Sets the value of the numeroRadicacionVinculacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRadicacionVinculacion(String value) {
        this.numeroRadicacionVinculacion = value;
    }

    /**
     * Gets the value of the destinacionFondos property.
     * 
     * @return
     *     possible object is
     *     {@link TipoEstado }
     *     
     */
    public TipoEstado getDestinacionFondos() {
        return destinacionFondos;
    }

    /**
     * Sets the value of the destinacionFondos property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEstado }
     *     
     */
    public void setDestinacionFondos(TipoEstado value) {
        this.destinacionFondos = value;
    }

    /**
     * Gets the value of the indicadorOtorgamiento property.
     * 
     */
    public boolean isIndicadorOtorgamiento() {
        return indicadorOtorgamiento;
    }

    /**
     * Sets the value of the indicadorOtorgamiento property.
     * 
     */
    public void setIndicadorOtorgamiento(boolean value) {
        this.indicadorOtorgamiento = value;
    }

    /**
     * Gets the value of the indicadorAutorizacionEnvioNotificaciones property.
     * 
     */
    public boolean isIndicadorAutorizacionEnvioNotificaciones() {
        return indicadorAutorizacionEnvioNotificaciones;
    }

    /**
     * Sets the value of the indicadorAutorizacionEnvioNotificaciones property.
     * 
     */
    public void setIndicadorAutorizacionEnvioNotificaciones(boolean value) {
        this.indicadorAutorizacionEnvioNotificaciones = value;
    }

}
