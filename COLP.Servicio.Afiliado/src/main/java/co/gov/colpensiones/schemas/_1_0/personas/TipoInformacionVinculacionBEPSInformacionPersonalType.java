
package co.gov.colpensiones.schemas._1_0.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionVinculacionBEPS.informacionPersonalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionVinculacionBEPS.informacionPersonalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacion" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionPersona"/>
 *         &lt;element name="fechaExpedicionDocumentoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="municipioExpedicionDocumentoIdentificacion" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoCiudad" minOccurs="0"/>
 *         &lt;element name="nombresApellidos" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionBasicaPersonaNatural" minOccurs="0"/>
 *         &lt;element name="genero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionVinculacionBEPS.informacionPersonalType", propOrder = {
    "identificacion",
    "fechaExpedicionDocumentoIdentificacion",
    "municipioExpedicionDocumentoIdentificacion",
    "nombresApellidos",
    "genero"
})
public class TipoInformacionVinculacionBEPSInformacionPersonalType {

    @XmlElement(required = true, nillable = true)
    protected TipoIdentificacionPersona identificacion;
    protected String fechaExpedicionDocumentoIdentificacion;
    protected TipoCiudad municipioExpedicionDocumentoIdentificacion;
    protected TipoInformacionBasicaPersonaNatural nombresApellidos;
    protected String genero;

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

}
