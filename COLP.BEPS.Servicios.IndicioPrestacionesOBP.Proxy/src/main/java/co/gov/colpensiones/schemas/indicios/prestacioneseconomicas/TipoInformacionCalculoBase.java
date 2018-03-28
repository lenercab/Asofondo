
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.comun.TipoValor;


/**
 * <p>Java class for tipoInformacionCalculoBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionCalculoBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fechaBase" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="indicadorAporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorVinculacionAntFechaBase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalMesesVinculacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subTotalMensual" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoValor" minOccurs="0"/>
 *         &lt;element name="promedioSubTotal" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoValor" minOccurs="0"/>
 *         &lt;element name="asignacionBasicaMensual" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoValor"/>
 *         &lt;element name="valorRepresentacion" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoValor" minOccurs="0"/>
 *         &lt;element name="valorPrimaTecnica" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoValor" minOccurs="0"/>
 *         &lt;element name="valorTotalAdicionales" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoValor" minOccurs="0"/>
 *         &lt;element name="valorSalarioBase" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoValor"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionCalculoBase", propOrder = {
    "fechaBase",
    "indicadorAporte",
    "indicadorVinculacionAntFechaBase",
    "totalMesesVinculacion",
    "subTotalMensual",
    "promedioSubTotal",
    "asignacionBasicaMensual",
    "valorRepresentacion",
    "valorPrimaTecnica",
    "valorTotalAdicionales",
    "valorSalarioBase"
})
public class TipoInformacionCalculoBase {

    @XmlElement(required = true, nillable = true)
    protected String fechaBase;
    protected String indicadorAporte;
    protected String indicadorVinculacionAntFechaBase;
    protected String totalMesesVinculacion;
    protected TipoValor subTotalMensual;
    protected TipoValor promedioSubTotal;
    @XmlElement(required = true, nillable = true)
    protected TipoValor asignacionBasicaMensual;
    protected TipoValor valorRepresentacion;
    protected TipoValor valorPrimaTecnica;
    protected TipoValor valorTotalAdicionales;
    @XmlElement(required = true, nillable = true)
    protected TipoValor valorSalarioBase;

    /**
     * Gets the value of the fechaBase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaBase() {
        return fechaBase;
    }

    /**
     * Sets the value of the fechaBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaBase(String value) {
        this.fechaBase = value;
    }

    /**
     * Gets the value of the indicadorAporte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorAporte() {
        return indicadorAporte;
    }

    /**
     * Sets the value of the indicadorAporte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorAporte(String value) {
        this.indicadorAporte = value;
    }

    /**
     * Gets the value of the indicadorVinculacionAntFechaBase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorVinculacionAntFechaBase() {
        return indicadorVinculacionAntFechaBase;
    }

    /**
     * Sets the value of the indicadorVinculacionAntFechaBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorVinculacionAntFechaBase(String value) {
        this.indicadorVinculacionAntFechaBase = value;
    }

    /**
     * Gets the value of the totalMesesVinculacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalMesesVinculacion() {
        return totalMesesVinculacion;
    }

    /**
     * Sets the value of the totalMesesVinculacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalMesesVinculacion(String value) {
        this.totalMesesVinculacion = value;
    }

    /**
     * Gets the value of the subTotalMensual property.
     * 
     * @return
     *     possible object is
     *     {@link TipoValor }
     *     
     */
    public TipoValor getSubTotalMensual() {
        return subTotalMensual;
    }

    /**
     * Sets the value of the subTotalMensual property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoValor }
     *     
     */
    public void setSubTotalMensual(TipoValor value) {
        this.subTotalMensual = value;
    }

    /**
     * Gets the value of the promedioSubTotal property.
     * 
     * @return
     *     possible object is
     *     {@link TipoValor }
     *     
     */
    public TipoValor getPromedioSubTotal() {
        return promedioSubTotal;
    }

    /**
     * Sets the value of the promedioSubTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoValor }
     *     
     */
    public void setPromedioSubTotal(TipoValor value) {
        this.promedioSubTotal = value;
    }

    /**
     * Gets the value of the asignacionBasicaMensual property.
     * 
     * @return
     *     possible object is
     *     {@link TipoValor }
     *     
     */
    public TipoValor getAsignacionBasicaMensual() {
        return asignacionBasicaMensual;
    }

    /**
     * Sets the value of the asignacionBasicaMensual property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoValor }
     *     
     */
    public void setAsignacionBasicaMensual(TipoValor value) {
        this.asignacionBasicaMensual = value;
    }

    /**
     * Gets the value of the valorRepresentacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoValor }
     *     
     */
    public TipoValor getValorRepresentacion() {
        return valorRepresentacion;
    }

    /**
     * Sets the value of the valorRepresentacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoValor }
     *     
     */
    public void setValorRepresentacion(TipoValor value) {
        this.valorRepresentacion = value;
    }

    /**
     * Gets the value of the valorPrimaTecnica property.
     * 
     * @return
     *     possible object is
     *     {@link TipoValor }
     *     
     */
    public TipoValor getValorPrimaTecnica() {
        return valorPrimaTecnica;
    }

    /**
     * Sets the value of the valorPrimaTecnica property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoValor }
     *     
     */
    public void setValorPrimaTecnica(TipoValor value) {
        this.valorPrimaTecnica = value;
    }

    /**
     * Gets the value of the valorTotalAdicionales property.
     * 
     * @return
     *     possible object is
     *     {@link TipoValor }
     *     
     */
    public TipoValor getValorTotalAdicionales() {
        return valorTotalAdicionales;
    }

    /**
     * Sets the value of the valorTotalAdicionales property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoValor }
     *     
     */
    public void setValorTotalAdicionales(TipoValor value) {
        this.valorTotalAdicionales = value;
    }

    /**
     * Gets the value of the valorSalarioBase property.
     * 
     * @return
     *     possible object is
     *     {@link TipoValor }
     *     
     */
    public TipoValor getValorSalarioBase() {
        return valorSalarioBase;
    }

    /**
     * Sets the value of the valorSalarioBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoValor }
     *     
     */
    public void setValorSalarioBase(TipoValor value) {
        this.valorSalarioBase = value;
    }

}
