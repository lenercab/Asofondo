
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoResultadoSimulacionBEPS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoResultadoSimulacionBEPS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valorAhorrado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valorTraslado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valorRenta" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valorSubsidio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valorDevolucion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valorRendimientos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoResultadoSimulacionBEPS", propOrder = {
    "valorAhorrado",
    "valorTraslado",
    "valorRenta",
    "valorSubsidio",
    "valorDevolucion",
    "valorRendimientos"
})
public class TipoResultadoSimulacionBEPS {

    protected BigDecimal valorAhorrado;
    protected BigDecimal valorTraslado;
    protected BigDecimal valorRenta;
    protected BigDecimal valorSubsidio;
    protected BigDecimal valorDevolucion;
    protected BigDecimal valorRendimientos;

    /**
     * Gets the value of the valorAhorrado property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorAhorrado() {
        return valorAhorrado;
    }

    /**
     * Sets the value of the valorAhorrado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorAhorrado(BigDecimal value) {
        this.valorAhorrado = value;
    }

    /**
     * Gets the value of the valorTraslado property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTraslado() {
        return valorTraslado;
    }

    /**
     * Sets the value of the valorTraslado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTraslado(BigDecimal value) {
        this.valorTraslado = value;
    }

    /**
     * Gets the value of the valorRenta property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorRenta() {
        return valorRenta;
    }

    /**
     * Sets the value of the valorRenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorRenta(BigDecimal value) {
        this.valorRenta = value;
    }

    /**
     * Gets the value of the valorSubsidio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorSubsidio() {
        return valorSubsidio;
    }

    /**
     * Sets the value of the valorSubsidio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorSubsidio(BigDecimal value) {
        this.valorSubsidio = value;
    }

    /**
     * Gets the value of the valorDevolucion property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorDevolucion() {
        return valorDevolucion;
    }

    /**
     * Sets the value of the valorDevolucion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorDevolucion(BigDecimal value) {
        this.valorDevolucion = value;
    }

    /**
     * Gets the value of the valorRendimientos property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorRendimientos() {
        return valorRendimientos;
    }

    /**
     * Sets the value of the valorRendimientos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorRendimientos(BigDecimal value) {
        this.valorRendimientos = value;
    }

}
