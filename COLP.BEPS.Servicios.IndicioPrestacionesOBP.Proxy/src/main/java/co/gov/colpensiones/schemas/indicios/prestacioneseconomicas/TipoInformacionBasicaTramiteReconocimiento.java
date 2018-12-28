
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.personas.TipoCiudad;


/**
 * <p>Java class for tipoInformacionBasicaTramiteReconocimiento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionBasicaTramiteReconocimiento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificadorTramite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identificadorCaso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaSolicitud" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="usuarioSustanciador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="usuarioRevisor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accionTramite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoPrestacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="instancia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoLiquidacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tiemposPublicos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tiemposPrivados" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="observacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prioridad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreAccionRespuesta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ciudadPagoCausante" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoCiudad"/>
 *         &lt;element name="procesamientoAutomatico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoEPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoTraslado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionBasicaTramiteReconocimiento", propOrder = {
    "identificadorTramite",
    "identificadorCaso",
    "fechaSolicitud",
    "usuarioSustanciador",
    "usuarioRevisor",
    "accionTramite",
    "tipoPrestacion",
    "instancia",
    "tipoLiquidacion",
    "tiemposPublicos",
    "tiemposPrivados",
    "observacion",
    "prioridad",
    "nombreAccionRespuesta",
    "ciudadPagoCausante",
    "procesamientoAutomatico",
    "codigoEPS",
    "estadoTraslado"
})
public class TipoInformacionBasicaTramiteReconocimiento {

    @XmlElement(required = true, nillable = true)
    protected String identificadorTramite;
    @XmlElement(required = true, nillable = true)
    protected String identificadorCaso;
    @XmlElement(required = true, nillable = true)
    protected String fechaSolicitud;
    @XmlElement(required = true, nillable = true)
    protected String usuarioSustanciador;
    @XmlElement(required = true, nillable = true)
    protected String usuarioRevisor;
    @XmlElement(required = true, nillable = true)
    protected String accionTramite;
    @XmlElement(required = true, nillable = true)
    protected String tipoPrestacion;
    @XmlElement(required = true, nillable = true)
    protected String instancia;
    @XmlElement(required = true, nillable = true)
    protected String tipoLiquidacion;
    protected boolean tiemposPublicos;
    protected boolean tiemposPrivados;
    @XmlElement(required = true, nillable = true)
    protected String observacion;
    protected String prioridad;
    @XmlElement(required = true, nillable = true)
    protected String nombreAccionRespuesta;
    @XmlElement(required = true, nillable = true)
    protected TipoCiudad ciudadPagoCausante;
    @XmlElementRef(name = "procesamientoAutomatico", namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> procesamientoAutomatico;
    @XmlElementRef(name = "codigoEPS", namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoEPS;
    @XmlElementRef(name = "estadoTraslado", namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estadoTraslado;

    /**
     * Gets the value of the identificadorTramite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorTramite() {
        return identificadorTramite;
    }

    /**
     * Sets the value of the identificadorTramite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorTramite(String value) {
        this.identificadorTramite = value;
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
     * Gets the value of the fechaSolicitud property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaSolicitud() {
        return fechaSolicitud;
    }

    /**
     * Sets the value of the fechaSolicitud property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaSolicitud(String value) {
        this.fechaSolicitud = value;
    }

    /**
     * Gets the value of the usuarioSustanciador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioSustanciador() {
        return usuarioSustanciador;
    }

    /**
     * Sets the value of the usuarioSustanciador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioSustanciador(String value) {
        this.usuarioSustanciador = value;
    }

    /**
     * Gets the value of the usuarioRevisor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioRevisor() {
        return usuarioRevisor;
    }

    /**
     * Sets the value of the usuarioRevisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioRevisor(String value) {
        this.usuarioRevisor = value;
    }

    /**
     * Gets the value of the accionTramite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccionTramite() {
        return accionTramite;
    }

    /**
     * Sets the value of the accionTramite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccionTramite(String value) {
        this.accionTramite = value;
    }

    /**
     * Gets the value of the tipoPrestacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPrestacion() {
        return tipoPrestacion;
    }

    /**
     * Sets the value of the tipoPrestacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPrestacion(String value) {
        this.tipoPrestacion = value;
    }

    /**
     * Gets the value of the instancia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstancia() {
        return instancia;
    }

    /**
     * Sets the value of the instancia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstancia(String value) {
        this.instancia = value;
    }

    /**
     * Gets the value of the tipoLiquidacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoLiquidacion() {
        return tipoLiquidacion;
    }

    /**
     * Sets the value of the tipoLiquidacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoLiquidacion(String value) {
        this.tipoLiquidacion = value;
    }

    /**
     * Gets the value of the tiemposPublicos property.
     * 
     */
    public boolean isTiemposPublicos() {
        return tiemposPublicos;
    }

    /**
     * Sets the value of the tiemposPublicos property.
     * 
     */
    public void setTiemposPublicos(boolean value) {
        this.tiemposPublicos = value;
    }

    /**
     * Gets the value of the tiemposPrivados property.
     * 
     */
    public boolean isTiemposPrivados() {
        return tiemposPrivados;
    }

    /**
     * Sets the value of the tiemposPrivados property.
     * 
     */
    public void setTiemposPrivados(boolean value) {
        this.tiemposPrivados = value;
    }

    /**
     * Gets the value of the observacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacion() {
        return observacion;
    }

    /**
     * Sets the value of the observacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacion(String value) {
        this.observacion = value;
    }

    /**
     * Gets the value of the prioridad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrioridad() {
        return prioridad;
    }

    /**
     * Sets the value of the prioridad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrioridad(String value) {
        this.prioridad = value;
    }

    /**
     * Gets the value of the nombreAccionRespuesta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAccionRespuesta() {
        return nombreAccionRespuesta;
    }

    /**
     * Sets the value of the nombreAccionRespuesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAccionRespuesta(String value) {
        this.nombreAccionRespuesta = value;
    }

    /**
     * Gets the value of the ciudadPagoCausante property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCiudad }
     *     
     */
    public TipoCiudad getCiudadPagoCausante() {
        return ciudadPagoCausante;
    }

    /**
     * Sets the value of the ciudadPagoCausante property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCiudad }
     *     
     */
    public void setCiudadPagoCausante(TipoCiudad value) {
        this.ciudadPagoCausante = value;
    }

    /**
     * Gets the value of the procesamientoAutomatico property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProcesamientoAutomatico() {
        return procesamientoAutomatico;
    }

    /**
     * Sets the value of the procesamientoAutomatico property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProcesamientoAutomatico(JAXBElement<String> value) {
        this.procesamientoAutomatico = value;
    }

    /**
     * Gets the value of the codigoEPS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoEPS() {
        return codigoEPS;
    }

    /**
     * Sets the value of the codigoEPS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoEPS(JAXBElement<String> value) {
        this.codigoEPS = value;
    }

    /**
     * Gets the value of the estadoTraslado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstadoTraslado() {
        return estadoTraslado;
    }

    /**
     * Sets the value of the estadoTraslado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstadoTraslado(JAXBElement<String> value) {
        this.estadoTraslado = value;
    }

}
