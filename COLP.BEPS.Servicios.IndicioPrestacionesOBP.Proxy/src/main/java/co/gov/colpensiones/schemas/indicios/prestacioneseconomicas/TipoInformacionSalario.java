
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.comun.TipoValor;


/**
 * <p>Java class for tipoInformacionSalario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionSalario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="factorSalarial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valorMonto" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoValor"/>
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorTotalMes" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoValor" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionSalario", propOrder = {
    "anio",
    "mes",
    "factorSalarial",
    "valorMonto",
    "observaciones",
    "valorTotalMes"
})
public class TipoInformacionSalario {

    protected Integer anio;
    protected Integer mes;
    @XmlElement(required = true, nillable = true)
    protected String factorSalarial;
    @XmlElement(required = true, nillable = true)
    protected TipoValor valorMonto;
    protected String observaciones;
    protected TipoValor valorTotalMes;

    /**
     * Gets the value of the anio property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnio() {
        return anio;
    }

    /**
     * Sets the value of the anio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnio(Integer value) {
        this.anio = value;
    }

    /**
     * Gets the value of the mes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMes() {
        return mes;
    }

    /**
     * Sets the value of the mes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMes(Integer value) {
        this.mes = value;
    }

    /**
     * Gets the value of the factorSalarial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactorSalarial() {
        return factorSalarial;
    }

    /**
     * Sets the value of the factorSalarial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactorSalarial(String value) {
        this.factorSalarial = value;
    }

    /**
     * Gets the value of the valorMonto property.
     * 
     * @return
     *     possible object is
     *     {@link TipoValor }
     *     
     */
    public TipoValor getValorMonto() {
        return valorMonto;
    }

    /**
     * Sets the value of the valorMonto property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoValor }
     *     
     */
    public void setValorMonto(TipoValor value) {
        this.valorMonto = value;
    }

    /**
     * Gets the value of the observaciones property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Sets the value of the observaciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservaciones(String value) {
        this.observaciones = value;
    }

    /**
     * Gets the value of the valorTotalMes property.
     * 
     * @return
     *     possible object is
     *     {@link TipoValor }
     *     
     */
    public TipoValor getValorTotalMes() {
        return valorTotalMes;
    }

    /**
     * Sets the value of the valorTotalMes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoValor }
     *     
     */
    public void setValorTotalMes(TipoValor value) {
        this.valorTotalMes = value;
    }

}
