
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionBasicaIdentificacionPersona;


/**
 * <p>Java class for tipoInformacionGeneralActo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionGeneralActo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InformacionBasicaCiudadano" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionBasicaIdentificacionPersona"/>
 *         &lt;element name="InformacionBasicaActo" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionBasicaActo"/>
 *         &lt;element name="fechaInicialPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaFinalPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionGeneralActo", propOrder = {
    "informacionBasicaCiudadano",
    "informacionBasicaActo",
    "fechaInicialPublicacion",
    "fechaFinalPublicacion"
})
public class TipoInformacionGeneralActo {

    @XmlElement(name = "InformacionBasicaCiudadano", required = true, nillable = true)
    protected TipoInformacionBasicaIdentificacionPersona informacionBasicaCiudadano;
    @XmlElement(name = "InformacionBasicaActo", required = true, nillable = true)
    protected TipoInformacionBasicaActo informacionBasicaActo;
    @XmlElement(required = true, nillable = true)
    protected String fechaInicialPublicacion;
    @XmlElement(required = true, nillable = true)
    protected String fechaFinalPublicacion;

    /**
     * Gets the value of the informacionBasicaCiudadano property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionBasicaIdentificacionPersona }
     *     
     */
    public TipoInformacionBasicaIdentificacionPersona getInformacionBasicaCiudadano() {
        return informacionBasicaCiudadano;
    }

    /**
     * Sets the value of the informacionBasicaCiudadano property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionBasicaIdentificacionPersona }
     *     
     */
    public void setInformacionBasicaCiudadano(TipoInformacionBasicaIdentificacionPersona value) {
        this.informacionBasicaCiudadano = value;
    }

    /**
     * Gets the value of the informacionBasicaActo property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionBasicaActo }
     *     
     */
    public TipoInformacionBasicaActo getInformacionBasicaActo() {
        return informacionBasicaActo;
    }

    /**
     * Sets the value of the informacionBasicaActo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionBasicaActo }
     *     
     */
    public void setInformacionBasicaActo(TipoInformacionBasicaActo value) {
        this.informacionBasicaActo = value;
    }

    /**
     * Gets the value of the fechaInicialPublicacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaInicialPublicacion() {
        return fechaInicialPublicacion;
    }

    /**
     * Sets the value of the fechaInicialPublicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaInicialPublicacion(String value) {
        this.fechaInicialPublicacion = value;
    }

    /**
     * Gets the value of the fechaFinalPublicacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaFinalPublicacion() {
        return fechaFinalPublicacion;
    }

    /**
     * Sets the value of the fechaFinalPublicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaFinalPublicacion(String value) {
        this.fechaFinalPublicacion = value;
    }

}
