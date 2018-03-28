
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionBasicaCargueReconocimiento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionBasicaCargueReconocimiento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroRadicadoTramite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identificadorCasoTramite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoOficinaRadicacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaRadicacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="horaRadicacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoRiesgo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="detalleRiesgo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiemposPublicosColpensiones" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="indicadorTiemposPublicos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorTiemposPrivados" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaSolicitud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoLiquidacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoInstancia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorRegimenEspecial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionBasicaCargueReconocimiento", propOrder = {
    "numeroRadicadoTramite",
    "identificadorCasoTramite",
    "codigoOficinaRadicacion",
    "fechaRadicacion",
    "horaRadicacion",
    "tipoRiesgo",
    "detalleRiesgo",
    "tiemposPublicosColpensiones",
    "indicadorTiemposPublicos",
    "indicadorTiemposPrivados",
    "fechaSolicitud",
    "tipoLiquidacion",
    "tipoInstancia",
    "indicadorRegimenEspecial"
})
public class TipoInformacionBasicaCargueReconocimiento {

    @XmlElement(required = true, nillable = true)
    protected String numeroRadicadoTramite;
    @XmlElement(required = true, nillable = true)
    protected String identificadorCasoTramite;
    @XmlElement(required = true, nillable = true)
    protected String codigoOficinaRadicacion;
    @XmlElement(required = true, nillable = true)
    protected String fechaRadicacion;
    @XmlElement(required = true, nillable = true)
    protected String horaRadicacion;
    @XmlElement(required = true, nillable = true)
    protected String tipoRiesgo;
    protected String detalleRiesgo;
    @XmlElement(required = true, nillable = true)
    protected String tiemposPublicosColpensiones;
    protected String indicadorTiemposPublicos;
    protected String indicadorTiemposPrivados;
    protected String fechaSolicitud;
    @XmlElement(required = true, nillable = true)
    protected String tipoLiquidacion;
    protected String tipoInstancia;
    protected String indicadorRegimenEspecial;

    /**
     * Gets the value of the numeroRadicadoTramite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRadicadoTramite() {
        return numeroRadicadoTramite;
    }

    /**
     * Sets the value of the numeroRadicadoTramite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRadicadoTramite(String value) {
        this.numeroRadicadoTramite = value;
    }

    /**
     * Gets the value of the identificadorCasoTramite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorCasoTramite() {
        return identificadorCasoTramite;
    }

    /**
     * Sets the value of the identificadorCasoTramite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorCasoTramite(String value) {
        this.identificadorCasoTramite = value;
    }

    /**
     * Gets the value of the codigoOficinaRadicacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoOficinaRadicacion() {
        return codigoOficinaRadicacion;
    }

    /**
     * Sets the value of the codigoOficinaRadicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoOficinaRadicacion(String value) {
        this.codigoOficinaRadicacion = value;
    }

    /**
     * Gets the value of the fechaRadicacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaRadicacion() {
        return fechaRadicacion;
    }

    /**
     * Sets the value of the fechaRadicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaRadicacion(String value) {
        this.fechaRadicacion = value;
    }

    /**
     * Gets the value of the horaRadicacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraRadicacion() {
        return horaRadicacion;
    }

    /**
     * Sets the value of the horaRadicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraRadicacion(String value) {
        this.horaRadicacion = value;
    }

    /**
     * Gets the value of the tipoRiesgo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRiesgo() {
        return tipoRiesgo;
    }

    /**
     * Sets the value of the tipoRiesgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRiesgo(String value) {
        this.tipoRiesgo = value;
    }

    /**
     * Gets the value of the detalleRiesgo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetalleRiesgo() {
        return detalleRiesgo;
    }

    /**
     * Sets the value of the detalleRiesgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetalleRiesgo(String value) {
        this.detalleRiesgo = value;
    }

    /**
     * Gets the value of the tiemposPublicosColpensiones property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiemposPublicosColpensiones() {
        return tiemposPublicosColpensiones;
    }

    /**
     * Sets the value of the tiemposPublicosColpensiones property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiemposPublicosColpensiones(String value) {
        this.tiemposPublicosColpensiones = value;
    }

    /**
     * Gets the value of the indicadorTiemposPublicos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorTiemposPublicos() {
        return indicadorTiemposPublicos;
    }

    /**
     * Sets the value of the indicadorTiemposPublicos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorTiemposPublicos(String value) {
        this.indicadorTiemposPublicos = value;
    }

    /**
     * Gets the value of the indicadorTiemposPrivados property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorTiemposPrivados() {
        return indicadorTiemposPrivados;
    }

    /**
     * Sets the value of the indicadorTiemposPrivados property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorTiemposPrivados(String value) {
        this.indicadorTiemposPrivados = value;
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
     * Gets the value of the tipoInstancia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoInstancia() {
        return tipoInstancia;
    }

    /**
     * Sets the value of the tipoInstancia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoInstancia(String value) {
        this.tipoInstancia = value;
    }

    /**
     * Gets the value of the indicadorRegimenEspecial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorRegimenEspecial() {
        return indicadorRegimenEspecial;
    }

    /**
     * Sets the value of the indicadorRegimenEspecial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorRegimenEspecial(String value) {
        this.indicadorRegimenEspecial = value;
    }

}
