
package co.gov.colpensiones.schemas._1_0.personas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoConsolidadosSemanasCotizadas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoConsolidadosSemanasCotizadas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroSemanas01Abril1994" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="numeroSemanas31Julio2005" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="salario30Junio1992" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="totalSemanas" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoConsolidadosSemanasCotizadas", propOrder = {
    "numeroSemanas01Abril1994",
    "numeroSemanas31Julio2005",
    "salario30Junio1992",
    "totalSemanas"
})
public class TipoConsolidadosSemanasCotizadas {

    @XmlElement(required = true)
    protected BigDecimal numeroSemanas01Abril1994;
    @XmlElement(required = true)
    protected BigDecimal numeroSemanas31Julio2005;
    protected long salario30Junio1992;
    @XmlElement(required = true)
    protected BigDecimal totalSemanas;

    /**
     * Gets the value of the numeroSemanas01Abril1994 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumeroSemanas01Abril1994() {
        return numeroSemanas01Abril1994;
    }

    /**
     * Sets the value of the numeroSemanas01Abril1994 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumeroSemanas01Abril1994(BigDecimal value) {
        this.numeroSemanas01Abril1994 = value;
    }

    /**
     * Gets the value of the numeroSemanas31Julio2005 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumeroSemanas31Julio2005() {
        return numeroSemanas31Julio2005;
    }

    /**
     * Sets the value of the numeroSemanas31Julio2005 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumeroSemanas31Julio2005(BigDecimal value) {
        this.numeroSemanas31Julio2005 = value;
    }

    /**
     * Gets the value of the salario30Junio1992 property.
     * 
     */
    public long getSalario30Junio1992() {
        return salario30Junio1992;
    }

    /**
     * Sets the value of the salario30Junio1992 property.
     * 
     */
    public void setSalario30Junio1992(long value) {
        this.salario30Junio1992 = value;
    }

    /**
     * Gets the value of the totalSemanas property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalSemanas() {
        return totalSemanas;
    }

    /**
     * Sets the value of the totalSemanas property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalSemanas(BigDecimal value) {
        this.totalSemanas = value;
    }

}
