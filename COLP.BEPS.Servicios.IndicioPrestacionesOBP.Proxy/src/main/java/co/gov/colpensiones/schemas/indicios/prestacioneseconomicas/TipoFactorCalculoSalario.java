
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.comun.TipoValor;


/**
 * <p>Java class for tipoFactorCalculoSalario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoFactorCalculoSalario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorPrimaAntiguedad" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoValor" minOccurs="0"/>
 *         &lt;element name="valorRemuneracionDominicalFestivo" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoValor" minOccurs="0"/>
 *         &lt;element name="valorRemuneracionExtras" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoValor" minOccurs="0"/>
 *         &lt;element name="valorRemuneracionBonificacion" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoValor" minOccurs="0"/>
 *         &lt;element name="valorSubtotalMensual" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoValor" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoFactorCalculoSalario", propOrder = {
    "mes",
    "valorPrimaAntiguedad",
    "valorRemuneracionDominicalFestivo",
    "valorRemuneracionExtras",
    "valorRemuneracionBonificacion",
    "valorSubtotalMensual"
})
public class TipoFactorCalculoSalario {

    protected String mes;
    protected TipoValor valorPrimaAntiguedad;
    protected TipoValor valorRemuneracionDominicalFestivo;
    protected TipoValor valorRemuneracionExtras;
    protected TipoValor valorRemuneracionBonificacion;
    protected TipoValor valorSubtotalMensual;

    /**
     * Gets the value of the mes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMes() {
        return mes;
    }

    /**
     * Sets the value of the mes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMes(String value) {
        this.mes = value;
    }

    /**
     * Gets the value of the valorPrimaAntiguedad property.
     * 
     * @return
     *     possible object is
     *     {@link TipoValor }
     *     
     */
    public TipoValor getValorPrimaAntiguedad() {
        return valorPrimaAntiguedad;
    }

    /**
     * Sets the value of the valorPrimaAntiguedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoValor }
     *     
     */
    public void setValorPrimaAntiguedad(TipoValor value) {
        this.valorPrimaAntiguedad = value;
    }

    /**
     * Gets the value of the valorRemuneracionDominicalFestivo property.
     * 
     * @return
     *     possible object is
     *     {@link TipoValor }
     *     
     */
    public TipoValor getValorRemuneracionDominicalFestivo() {
        return valorRemuneracionDominicalFestivo;
    }

    /**
     * Sets the value of the valorRemuneracionDominicalFestivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoValor }
     *     
     */
    public void setValorRemuneracionDominicalFestivo(TipoValor value) {
        this.valorRemuneracionDominicalFestivo = value;
    }

    /**
     * Gets the value of the valorRemuneracionExtras property.
     * 
     * @return
     *     possible object is
     *     {@link TipoValor }
     *     
     */
    public TipoValor getValorRemuneracionExtras() {
        return valorRemuneracionExtras;
    }

    /**
     * Sets the value of the valorRemuneracionExtras property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoValor }
     *     
     */
    public void setValorRemuneracionExtras(TipoValor value) {
        this.valorRemuneracionExtras = value;
    }

    /**
     * Gets the value of the valorRemuneracionBonificacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoValor }
     *     
     */
    public TipoValor getValorRemuneracionBonificacion() {
        return valorRemuneracionBonificacion;
    }

    /**
     * Sets the value of the valorRemuneracionBonificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoValor }
     *     
     */
    public void setValorRemuneracionBonificacion(TipoValor value) {
        this.valorRemuneracionBonificacion = value;
    }

    /**
     * Gets the value of the valorSubtotalMensual property.
     * 
     * @return
     *     possible object is
     *     {@link TipoValor }
     *     
     */
    public TipoValor getValorSubtotalMensual() {
        return valorSubtotalMensual;
    }

    /**
     * Sets the value of the valorSubtotalMensual property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoValor }
     *     
     */
    public void setValorSubtotalMensual(TipoValor value) {
        this.valorSubtotalMensual = value;
    }

}
