
package co.gov.colpensiones.schemas._1_0.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoValidacionTramite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoValidacionTramite">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionDocumentos" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionGeneralDocumentos"/>
 *         &lt;element name="nombreArchivo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="priorizacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="usuarioRadica" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="usuarioDigitaliza" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoValidacionTramite", propOrder = {
    "informacionDocumentos",
    "nombreArchivo",
    "priorizacion",
    "usuarioRadica",
    "usuarioDigitaliza"
})
public class TipoValidacionTramite {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionGeneralDocumentos informacionDocumentos;
    @XmlElement(required = true, nillable = true)
    protected String nombreArchivo;
    @XmlElement(required = true, nillable = true)
    protected String priorizacion;
    @XmlElement(required = true, nillable = true)
    protected String usuarioRadica;
    @XmlElement(required = true, nillable = true)
    protected String usuarioDigitaliza;

    /**
     * Gets the value of the informacionDocumentos property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionGeneralDocumentos }
     *     
     */
    public TipoInformacionGeneralDocumentos getInformacionDocumentos() {
        return informacionDocumentos;
    }

    /**
     * Sets the value of the informacionDocumentos property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionGeneralDocumentos }
     *     
     */
    public void setInformacionDocumentos(TipoInformacionGeneralDocumentos value) {
        this.informacionDocumentos = value;
    }

    /**
     * Gets the value of the nombreArchivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreArchivo() {
        return nombreArchivo;
    }

    /**
     * Sets the value of the nombreArchivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreArchivo(String value) {
        this.nombreArchivo = value;
    }

    /**
     * Gets the value of the priorizacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorizacion() {
        return priorizacion;
    }

    /**
     * Sets the value of the priorizacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorizacion(String value) {
        this.priorizacion = value;
    }

    /**
     * Gets the value of the usuarioRadica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioRadica() {
        return usuarioRadica;
    }

    /**
     * Sets the value of the usuarioRadica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioRadica(String value) {
        this.usuarioRadica = value;
    }

    /**
     * Gets the value of the usuarioDigitaliza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioDigitaliza() {
        return usuarioDigitaliza;
    }

    /**
     * Sets the value of the usuarioDigitaliza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioDigitaliza(String value) {
        this.usuarioDigitaliza = value;
    }

}
