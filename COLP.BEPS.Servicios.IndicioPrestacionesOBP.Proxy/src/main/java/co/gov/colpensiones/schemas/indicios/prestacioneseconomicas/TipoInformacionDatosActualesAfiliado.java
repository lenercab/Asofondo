
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.personas.TipoIdentificacionPersona;
import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionBasicaPersonaNatural;
import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionUbicacionPersona;


/**
 * <p>Java class for tipoInformacionDatosActualesAfiliado complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionDatosActualesAfiliado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombresApellidos" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionBasicaPersonaNatural"/>
 *         &lt;element name="apellidoAdicional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificacion" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionPersona"/>
 *         &lt;element name="fechaExpedicionDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ubicacion" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionUbicacionPersona"/>
 *         &lt;element name="autorizacionEnvioNotificaciones" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoNotificacionMediosElectronicos" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionDatosActualesAfiliado", propOrder = {
    "nombresApellidos",
    "apellidoAdicional",
    "identificacion",
    "fechaExpedicionDocumento",
    "ubicacion",
    "autorizacionEnvioNotificaciones"
})
public class TipoInformacionDatosActualesAfiliado {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionBasicaPersonaNatural nombresApellidos;
    protected String apellidoAdicional;
    @XmlElement(required = true, nillable = true)
    protected TipoIdentificacionPersona identificacion;
    protected String fechaExpedicionDocumento;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionUbicacionPersona ubicacion;
    protected TipoNotificacionMediosElectronicos autorizacionEnvioNotificaciones;

    /**
     * Gets the value of the nombresApellidos property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionBasicaPersonaNatural }
     *     
     */
    public TipoInformacionBasicaPersonaNatural getNombresApellidos() {
        return nombresApellidos;
    }

    /**
     * Sets the value of the nombresApellidos property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionBasicaPersonaNatural }
     *     
     */
    public void setNombresApellidos(TipoInformacionBasicaPersonaNatural value) {
        this.nombresApellidos = value;
    }

    /**
     * Gets the value of the apellidoAdicional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoAdicional() {
        return apellidoAdicional;
    }

    /**
     * Sets the value of the apellidoAdicional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoAdicional(String value) {
        this.apellidoAdicional = value;
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
     * Gets the value of the fechaExpedicionDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaExpedicionDocumento() {
        return fechaExpedicionDocumento;
    }

    /**
     * Sets the value of the fechaExpedicionDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaExpedicionDocumento(String value) {
        this.fechaExpedicionDocumento = value;
    }

    /**
     * Gets the value of the ubicacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionUbicacionPersona }
     *     
     */
    public TipoInformacionUbicacionPersona getUbicacion() {
        return ubicacion;
    }

    /**
     * Sets the value of the ubicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionUbicacionPersona }
     *     
     */
    public void setUbicacion(TipoInformacionUbicacionPersona value) {
        this.ubicacion = value;
    }

    /**
     * Gets the value of the autorizacionEnvioNotificaciones property.
     * 
     * @return
     *     possible object is
     *     {@link TipoNotificacionMediosElectronicos }
     *     
     */
    public TipoNotificacionMediosElectronicos getAutorizacionEnvioNotificaciones() {
        return autorizacionEnvioNotificaciones;
    }

    /**
     * Sets the value of the autorizacionEnvioNotificaciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoNotificacionMediosElectronicos }
     *     
     */
    public void setAutorizacionEnvioNotificaciones(TipoNotificacionMediosElectronicos value) {
        this.autorizacionEnvioNotificaciones = value;
    }

}
