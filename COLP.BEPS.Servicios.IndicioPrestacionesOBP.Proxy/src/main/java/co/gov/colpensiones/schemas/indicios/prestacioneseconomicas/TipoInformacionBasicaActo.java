
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionExpedienteContent;


/**
 * <p>Java class for tipoInformacionBasicaActo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionBasicaActo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroActo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroRadicadoTramiteReconocimiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroRadicadoTramiteNotificacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identificadorCaso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identificadorDocumento" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionExpedienteContent"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionBasicaActo", propOrder = {
    "numeroActo",
    "numeroRadicadoTramiteReconocimiento",
    "numeroRadicadoTramiteNotificacion",
    "identificadorCaso",
    "identificadorDocumento"
})
public class TipoInformacionBasicaActo {

    @XmlElement(required = true, nillable = true)
    protected String numeroActo;
    @XmlElement(required = true, nillable = true)
    protected String numeroRadicadoTramiteReconocimiento;
    @XmlElement(required = true, nillable = true)
    protected String numeroRadicadoTramiteNotificacion;
    @XmlElement(required = true, nillable = true)
    protected String identificadorCaso;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionExpedienteContent identificadorDocumento;

    /**
     * Gets the value of the numeroActo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroActo() {
        return numeroActo;
    }

    /**
     * Sets the value of the numeroActo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroActo(String value) {
        this.numeroActo = value;
    }

    /**
     * Gets the value of the numeroRadicadoTramiteReconocimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRadicadoTramiteReconocimiento() {
        return numeroRadicadoTramiteReconocimiento;
    }

    /**
     * Sets the value of the numeroRadicadoTramiteReconocimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRadicadoTramiteReconocimiento(String value) {
        this.numeroRadicadoTramiteReconocimiento = value;
    }

    /**
     * Gets the value of the numeroRadicadoTramiteNotificacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRadicadoTramiteNotificacion() {
        return numeroRadicadoTramiteNotificacion;
    }

    /**
     * Sets the value of the numeroRadicadoTramiteNotificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRadicadoTramiteNotificacion(String value) {
        this.numeroRadicadoTramiteNotificacion = value;
    }

    /**
     * Gets the value of the identificadorCaso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorCaso() {
        return identificadorCaso;
    }

    /**
     * Sets the value of the identificadorCaso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorCaso(String value) {
        this.identificadorCaso = value;
    }

    /**
     * Gets the value of the identificadorDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionExpedienteContent }
     *     
     */
    public TipoInformacionExpedienteContent getIdentificadorDocumento() {
        return identificadorDocumento;
    }

    /**
     * Sets the value of the identificadorDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionExpedienteContent }
     *     
     */
    public void setIdentificadorDocumento(TipoInformacionExpedienteContent value) {
        this.identificadorDocumento = value;
    }

}
