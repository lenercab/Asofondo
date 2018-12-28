
package co.gov.colpensiones.schemas.indicios.personas;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.comun.TipoRangoFecha;


/**
 * <p>Java class for tipoInformacionPeriodoCotizacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionPeriodoCotizacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aportante" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionIdentificacionPersonaJuridica"/>
 *         &lt;element name="fechaCotizacion" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoRangoFecha"/>
 *         &lt;element name="ultimoSalario" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="numeroSemanasCotizadas" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="numeroSemanasLicencias" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="numeroSemanasSimultaneo" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="totalNumeroSemanas" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionPeriodoCotizacion", propOrder = {
    "aportante",
    "fechaCotizacion",
    "ultimoSalario",
    "numeroSemanasCotizadas",
    "numeroSemanasLicencias",
    "numeroSemanasSimultaneo",
    "totalNumeroSemanas"
})
public class TipoInformacionPeriodoCotizacion {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionIdentificacionPersonaJuridica aportante;
    @XmlElement(required = true, nillable = true)
    protected TipoRangoFecha fechaCotizacion;
    protected long ultimoSalario;
    @XmlElement(required = true)
    protected BigDecimal numeroSemanasCotizadas;
    @XmlElement(required = true)
    protected BigDecimal numeroSemanasLicencias;
    @XmlElement(required = true)
    protected BigDecimal numeroSemanasSimultaneo;
    @XmlElement(required = true)
    protected BigDecimal totalNumeroSemanas;

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
     * Gets the value of the fechaCotizacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoRangoFecha }
     *     
     */
    public TipoRangoFecha getFechaCotizacion() {
        return fechaCotizacion;
    }

    /**
     * Sets the value of the fechaCotizacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoRangoFecha }
     *     
     */
    public void setFechaCotizacion(TipoRangoFecha value) {
        this.fechaCotizacion = value;
    }

    /**
     * Gets the value of the ultimoSalario property.
     * 
     */
    public long getUltimoSalario() {
        return ultimoSalario;
    }

    /**
     * Sets the value of the ultimoSalario property.
     * 
     */
    public void setUltimoSalario(long value) {
        this.ultimoSalario = value;
    }

    /**
     * Gets the value of the numeroSemanasCotizadas property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumeroSemanasCotizadas() {
        return numeroSemanasCotizadas;
    }

    /**
     * Sets the value of the numeroSemanasCotizadas property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumeroSemanasCotizadas(BigDecimal value) {
        this.numeroSemanasCotizadas = value;
    }

    /**
     * Gets the value of the numeroSemanasLicencias property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumeroSemanasLicencias() {
        return numeroSemanasLicencias;
    }

    /**
     * Sets the value of the numeroSemanasLicencias property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumeroSemanasLicencias(BigDecimal value) {
        this.numeroSemanasLicencias = value;
    }

    /**
     * Gets the value of the numeroSemanasSimultaneo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumeroSemanasSimultaneo() {
        return numeroSemanasSimultaneo;
    }

    /**
     * Sets the value of the numeroSemanasSimultaneo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumeroSemanasSimultaneo(BigDecimal value) {
        this.numeroSemanasSimultaneo = value;
    }

    /**
     * Gets the value of the totalNumeroSemanas property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalNumeroSemanas() {
        return totalNumeroSemanas;
    }

    /**
     * Sets the value of the totalNumeroSemanas property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalNumeroSemanas(BigDecimal value) {
        this.totalNumeroSemanas = value;
    }

}
