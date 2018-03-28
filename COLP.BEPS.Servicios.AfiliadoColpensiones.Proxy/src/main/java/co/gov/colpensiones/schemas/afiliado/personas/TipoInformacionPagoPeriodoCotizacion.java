
package co.gov.colpensiones.schemas.afiliado.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionPagoPeriodoCotizacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionPagoPeriodoCotizacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aportante" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionIdentificacionPersonaJuridica"/>
 *         &lt;element name="indicadorRelacionAportante" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="periodo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fechaPago" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroReferenciaPago" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valorIBCReportado" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="valorCotizacionPagada" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="valorCotizacionMora" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tipoNovedad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroDiasReportados" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="numeroDiasCotizados" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="observacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionPagoPeriodoCotizacion", propOrder = {
    "aportante",
    "indicadorRelacionAportante",
    "periodo",
    "fechaPago",
    "numeroReferenciaPago",
    "valorIBCReportado",
    "valorCotizacionPagada",
    "valorCotizacionMora",
    "tipoNovedad",
    "numeroDiasReportados",
    "numeroDiasCotizados",
    "observacion"
})
public class TipoInformacionPagoPeriodoCotizacion {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionIdentificacionPersonaJuridica aportante;
    protected boolean indicadorRelacionAportante;
    protected long periodo;
    @XmlElement(required = true, nillable = true)
    protected String fechaPago;
    @XmlElement(required = true, nillable = true)
    protected String numeroReferenciaPago;
    protected long valorIBCReportado;
    protected long valorCotizacionPagada;
    protected long valorCotizacionMora;
    @XmlElement(required = true, nillable = true)
    protected String tipoNovedad;
    protected long numeroDiasReportados;
    protected long numeroDiasCotizados;
    @XmlElement(required = true, nillable = true)
    protected String observacion;

    /**
     * Gets the value of the aportante property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionIdentificacionPersonaJuridica }
     *     
     */
    public TipoInformacionIdentificacionPersonaJuridica getAportante() {
        return aportante;
    }

    /**
     * Sets the value of the aportante property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionIdentificacionPersonaJuridica }
     *     
     */
    public void setAportante(TipoInformacionIdentificacionPersonaJuridica value) {
        this.aportante = value;
    }

    /**
     * Gets the value of the indicadorRelacionAportante property.
     * 
     */
    public boolean isIndicadorRelacionAportante() {
        return indicadorRelacionAportante;
    }

    /**
     * Sets the value of the indicadorRelacionAportante property.
     * 
     */
    public void setIndicadorRelacionAportante(boolean value) {
        this.indicadorRelacionAportante = value;
    }

    /**
     * Gets the value of the periodo property.
     * 
     */
    public long getPeriodo() {
        return periodo;
    }

    /**
     * Sets the value of the periodo property.
     * 
     */
    public void setPeriodo(long value) {
        this.periodo = value;
    }

    /**
     * Gets the value of the fechaPago property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPago() {
        return fechaPago;
    }

    /**
     * Sets the value of the fechaPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPago(String value) {
        this.fechaPago = value;
    }

    /**
     * Gets the value of the numeroReferenciaPago property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroReferenciaPago() {
        return numeroReferenciaPago;
    }

    /**
     * Sets the value of the numeroReferenciaPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroReferenciaPago(String value) {
        this.numeroReferenciaPago = value;
    }

    /**
     * Gets the value of the valorIBCReportado property.
     * 
     */
    public long getValorIBCReportado() {
        return valorIBCReportado;
    }

    /**
     * Sets the value of the valorIBCReportado property.
     * 
     */
    public void setValorIBCReportado(long value) {
        this.valorIBCReportado = value;
    }

    /**
     * Gets the value of the valorCotizacionPagada property.
     * 
     */
    public long getValorCotizacionPagada() {
        return valorCotizacionPagada;
    }

    /**
     * Sets the value of the valorCotizacionPagada property.
     * 
     */
    public void setValorCotizacionPagada(long value) {
        this.valorCotizacionPagada = value;
    }

    /**
     * Gets the value of the valorCotizacionMora property.
     * 
     */
    public long getValorCotizacionMora() {
        return valorCotizacionMora;
    }

    /**
     * Sets the value of the valorCotizacionMora property.
     * 
     */
    public void setValorCotizacionMora(long value) {
        this.valorCotizacionMora = value;
    }

    /**
     * Gets the value of the tipoNovedad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoNovedad() {
        return tipoNovedad;
    }

    /**
     * Sets the value of the tipoNovedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoNovedad(String value) {
        this.tipoNovedad = value;
    }

    /**
     * Gets the value of the numeroDiasReportados property.
     * 
     */
    public long getNumeroDiasReportados() {
        return numeroDiasReportados;
    }

    /**
     * Sets the value of the numeroDiasReportados property.
     * 
     */
    public void setNumeroDiasReportados(long value) {
        this.numeroDiasReportados = value;
    }

    /**
     * Gets the value of the numeroDiasCotizados property.
     * 
     */
    public long getNumeroDiasCotizados() {
        return numeroDiasCotizados;
    }

    /**
     * Sets the value of the numeroDiasCotizados property.
     * 
     */
    public void setNumeroDiasCotizados(long value) {
        this.numeroDiasCotizados = value;
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

}
