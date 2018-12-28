
package co.gov.colpensiones.schemas._1_0.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionGeneralPersonaBEPS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionGeneralPersonaBEPS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacion" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionPersona"/>
 *         &lt;element name="nombresApellidos" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionBasicaPersonaNatural"/>
 *         &lt;element name="genero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaExpedicionDocumentoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="municipioExpedicionDocumentoIdentificacion" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoCiudad" minOccurs="0"/>
 *         &lt;element name="informacionNacimiento" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionGeneralPersonaBEPS.informacionNacimientoType" minOccurs="0"/>
 *         &lt;element name="informacionResidencia" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionUbicacionPersona" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionGeneralPersonaBEPS", propOrder = {
    "identificacion",
    "nombresApellidos",
    "genero",
    "fechaExpedicionDocumentoIdentificacion",
    "municipioExpedicionDocumentoIdentificacion",
    "informacionNacimiento",
    "informacionResidencia"
})
public class TipoInformacionGeneralPersonaBEPS {

    @XmlElement(required = true, nillable = true)
    protected TipoIdentificacionPersona identificacion;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionBasicaPersonaNatural nombresApellidos;
    @XmlElement(required = true, nillable = true)
    protected String genero;
    protected String fechaExpedicionDocumentoIdentificacion;
    protected TipoCiudad municipioExpedicionDocumentoIdentificacion;
    protected TipoInformacionGeneralPersonaBEPSInformacionNacimientoType informacionNacimiento;
    protected TipoInformacionUbicacionPersona informacionResidencia;

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
     * Gets the value of the genero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Sets the value of the genero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenero(String value) {
        this.genero = value;
    }

    /**
     * Gets the value of the fechaExpedicionDocumentoIdentificacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaExpedicionDocumentoIdentificacion() {
        return fechaExpedicionDocumentoIdentificacion;
    }

    /**
     * Sets the value of the fechaExpedicionDocumentoIdentificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaExpedicionDocumentoIdentificacion(String value) {
        this.fechaExpedicionDocumentoIdentificacion = value;
    }

    /**
     * Gets the value of the municipioExpedicionDocumentoIdentificacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCiudad }
     *     
     */
    public TipoCiudad getMunicipioExpedicionDocumentoIdentificacion() {
        return municipioExpedicionDocumentoIdentificacion;
    }

    /**
     * Sets the value of the municipioExpedicionDocumentoIdentificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCiudad }
     *     
     */
    public void setMunicipioExpedicionDocumentoIdentificacion(TipoCiudad value) {
        this.municipioExpedicionDocumentoIdentificacion = value;
    }

    /**
     * Gets the value of the informacionNacimiento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionGeneralPersonaBEPSInformacionNacimientoType }
     *     
     */
    public TipoInformacionGeneralPersonaBEPSInformacionNacimientoType getInformacionNacimiento() {
        return informacionNacimiento;
    }

    /**
     * Sets the value of the informacionNacimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionGeneralPersonaBEPSInformacionNacimientoType }
     *     
     */
    public void setInformacionNacimiento(TipoInformacionGeneralPersonaBEPSInformacionNacimientoType value) {
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

}
