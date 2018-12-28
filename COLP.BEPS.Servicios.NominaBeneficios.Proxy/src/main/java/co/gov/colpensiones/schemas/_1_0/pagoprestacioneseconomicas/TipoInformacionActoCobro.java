
package co.gov.colpensiones.schemas._1_0.pagoprestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import co.gov.colpensiones.schemas._1_0.personas.TipoInformacionExpedienteContent;


/**
 * <p>Java class for tipoInformacionActoCobro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionActoCobro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificadorDocumentoNotificacion" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionExpedienteContent"/>
 *         &lt;element name="numeroResolucion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaExpedicion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaInicioPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaFinPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaNotificacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estadoProceso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identificadorDocumentoActoAdministrativo" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionExpedienteContent"/>
 *         &lt;element name="informacionAportante" type="{http://www.colpensiones.gov.co/schemas/1.0/pagoprestacioneseconomicas}tipoInformacionActoCobro.informacionAportanteType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionActoCobro", propOrder = {
    "identificadorDocumentoNotificacion",
    "numeroResolucion",
    "fechaExpedicion",
    "fechaInicioPublicacion",
    "fechaFinPublicacion",
    "fechaNotificacion",
    "estadoProceso",
    "identificadorDocumentoActoAdministrativo",
    "informacionAportante"
})
public class TipoInformacionActoCobro {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionExpedienteContent identificadorDocumentoNotificacion;
    @XmlElement(required = true, nillable = true)
    protected String numeroResolucion;
    @XmlElement(required = true, nillable = true)
    protected String fechaExpedicion;
    @XmlElement(required = true, nillable = true)
    protected String fechaInicioPublicacion;
    @XmlElement(required = true, nillable = true)
    protected String fechaFinPublicacion;
    @XmlElement(required = true, nillable = true)
    protected String fechaNotificacion;
    @XmlElement(required = true, nillable = true)
    protected String estadoProceso;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionExpedienteContent identificadorDocumentoActoAdministrativo;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionActoCobroInformacionAportanteType informacionAportante;

    /**
     * Gets the value of the identificadorDocumentoNotificacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionExpedienteContent }
     *     
     */
    public TipoInformacionExpedienteContent getIdentificadorDocumentoNotificacion() {
        return identificadorDocumentoNotificacion;
    }

    /**
     * Sets the value of the identificadorDocumentoNotificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionExpedienteContent }
     *     
     */
    public void setIdentificadorDocumentoNotificacion(TipoInformacionExpedienteContent value) {
        this.identificadorDocumentoNotificacion = value;
    }

    /**
     * Gets the value of the numeroResolucion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroResolucion() {
        return numeroResolucion;
    }

    /**
     * Sets the value of the numeroResolucion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroResolucion(String value) {
        this.numeroResolucion = value;
    }

    /**
     * Gets the value of the fechaExpedicion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaExpedicion() {
        return fechaExpedicion;
    }

    /**
     * Sets the value of the fechaExpedicion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaExpedicion(String value) {
        this.fechaExpedicion = value;
    }

    /**
     * Gets the value of the fechaInicioPublicacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaInicioPublicacion() {
        return fechaInicioPublicacion;
    }

    /**
     * Sets the value of the fechaInicioPublicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaInicioPublicacion(String value) {
        this.fechaInicioPublicacion = value;
    }

    /**
     * Gets the value of the fechaFinPublicacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaFinPublicacion() {
        return fechaFinPublicacion;
    }

    /**
     * Sets the value of the fechaFinPublicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaFinPublicacion(String value) {
        this.fechaFinPublicacion = value;
    }

    /**
     * Gets the value of the fechaNotificacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNotificacion() {
        return fechaNotificacion;
    }

    /**
     * Sets the value of the fechaNotificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNotificacion(String value) {
        this.fechaNotificacion = value;
    }

    /**
     * Gets the value of the estadoProceso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoProceso() {
        return estadoProceso;
    }

    /**
     * Sets the value of the estadoProceso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoProceso(String value) {
        this.estadoProceso = value;
    }

    /**
     * Gets the value of the identificadorDocumentoActoAdministrativo property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionExpedienteContent }
     *     
     */
    public TipoInformacionExpedienteContent getIdentificadorDocumentoActoAdministrativo() {
        return identificadorDocumentoActoAdministrativo;
    }

    /**
     * Sets the value of the identificadorDocumentoActoAdministrativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionExpedienteContent }
     *     
     */
    public void setIdentificadorDocumentoActoAdministrativo(TipoInformacionExpedienteContent value) {
        this.identificadorDocumentoActoAdministrativo = value;
    }

    /**
     * Gets the value of the informacionAportante property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionActoCobroInformacionAportanteType }
     *     
     */
    public TipoInformacionActoCobroInformacionAportanteType getInformacionAportante() {
        return informacionAportante;
    }

    /**
     * Sets the value of the informacionAportante property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionActoCobroInformacionAportanteType }
     *     
     */
    public void setInformacionAportante(TipoInformacionActoCobroInformacionAportanteType value) {
        this.informacionAportante = value;
    }

}
