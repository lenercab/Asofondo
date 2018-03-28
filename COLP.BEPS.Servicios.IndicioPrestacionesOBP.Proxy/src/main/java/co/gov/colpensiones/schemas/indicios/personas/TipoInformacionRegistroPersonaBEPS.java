
package co.gov.colpensiones.schemas.indicios.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.comun.TipoEstado;


/**
 * <p>Java class for tipoInformacionRegistroPersonaBEPS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionRegistroPersonaBEPS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionGeneral" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionConsultaPersonaBEPS"/>
 *         &lt;element name="indicadorCambioPuntaje" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="indicadorCambioArea" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="indicadorCambioFechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="destinacionFondos" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoEstado"/>
 *         &lt;element name="indicadorOtorgamiento" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="indicadorAutorizacionEnvioNotificaciones" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="usuarioVinculacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="informacionBeneficiario" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionRegistroPersonaBEPS.informacionBeneficiarioType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionRegistroPersonaBEPS", propOrder = {
    "informacionGeneral",
    "indicadorCambioPuntaje",
    "indicadorCambioArea",
    "indicadorCambioFechaNacimiento",
    "destinacionFondos",
    "indicadorOtorgamiento",
    "indicadorAutorizacionEnvioNotificaciones",
    "usuarioVinculacion",
    "informacionBeneficiario"
})
public class TipoInformacionRegistroPersonaBEPS {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionConsultaPersonaBEPS informacionGeneral;
    protected boolean indicadorCambioPuntaje;
    protected boolean indicadorCambioArea;
    protected boolean indicadorCambioFechaNacimiento;
    @XmlElement(required = true, nillable = true)
    protected TipoEstado destinacionFondos;
    protected boolean indicadorOtorgamiento;
    protected boolean indicadorAutorizacionEnvioNotificaciones;
    @XmlElement(required = true, nillable = true)
    protected String usuarioVinculacion;
    protected TipoInformacionRegistroPersonaBEPSInformacionBeneficiarioType informacionBeneficiario;

    /**
     * Gets the value of the informacionGeneral property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionConsultaPersonaBEPS }
     *     
     */
    public TipoInformacionConsultaPersonaBEPS getInformacionGeneral() {
        return informacionGeneral;
    }

    /**
     * Sets the value of the informacionGeneral property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionConsultaPersonaBEPS }
     *     
     */
    public void setInformacionGeneral(TipoInformacionConsultaPersonaBEPS value) {
        this.informacionGeneral = value;
    }

    /**
     * Gets the value of the indicadorCambioPuntaje property.
     * 
     */
    public boolean isIndicadorCambioPuntaje() {
        return indicadorCambioPuntaje;
    }

    /**
     * Sets the value of the indicadorCambioPuntaje property.
     * 
     */
    public void setIndicadorCambioPuntaje(boolean value) {
        this.indicadorCambioPuntaje = value;
    }

    /**
     * Gets the value of the indicadorCambioArea property.
     * 
     */
    public boolean isIndicadorCambioArea() {
        return indicadorCambioArea;
    }

    /**
     * Sets the value of the indicadorCambioArea property.
     * 
     */
    public void setIndicadorCambioArea(boolean value) {
        this.indicadorCambioArea = value;
    }

    /**
     * Gets the value of the indicadorCambioFechaNacimiento property.
     * 
     */
    public boolean isIndicadorCambioFechaNacimiento() {
        return indicadorCambioFechaNacimiento;
    }

    /**
     * Sets the value of the indicadorCambioFechaNacimiento property.
     * 
     */
    public void setIndicadorCambioFechaNacimiento(boolean value) {
        this.indicadorCambioFechaNacimiento = value;
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
     * Gets the value of the informacionBeneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionRegistroPersonaBEPSInformacionBeneficiarioType }
     *     
     */
    public TipoInformacionRegistroPersonaBEPSInformacionBeneficiarioType getInformacionBeneficiario() {
        return informacionBeneficiario;
    }

    /**
     * Sets the value of the informacionBeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionRegistroPersonaBEPSInformacionBeneficiarioType }
     *     
     */
    public void setInformacionBeneficiario(TipoInformacionRegistroPersonaBEPSInformacionBeneficiarioType value) {
        this.informacionBeneficiario = value;
    }

}
