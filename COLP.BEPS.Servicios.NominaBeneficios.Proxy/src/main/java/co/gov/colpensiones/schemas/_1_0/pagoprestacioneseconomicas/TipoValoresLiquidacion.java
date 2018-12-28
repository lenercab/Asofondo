
package co.gov.colpensiones.schemas._1_0.pagoprestacioneseconomicas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoValoresLiquidacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoValoresLiquidacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totalDevengados" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="totalDeducidos" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="netoGirado" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="devengados" type="{http://www.colpensiones.gov.co/schemas/1.0/pagoprestacioneseconomicas}tipoValoresLiquidacion.devengadosType" minOccurs="0"/>
 *         &lt;element name="deducidos" type="{http://www.colpensiones.gov.co/schemas/1.0/pagoprestacioneseconomicas}tipoValoresLiquidacion.deducidosType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoValoresLiquidacion", propOrder = {
    "totalDevengados",
    "totalDeducidos",
    "netoGirado",
    "devengados",
    "deducidos"
})
public class TipoValoresLiquidacion {

    @XmlElement(required = true)
    protected BigDecimal totalDevengados;
    @XmlElement(required = true)
    protected BigDecimal totalDeducidos;
    @XmlElement(required = true)
    protected BigDecimal netoGirado;
    protected TipoValoresLiquidacionDevengadosType devengados;
    protected TipoValoresLiquidacionDeducidosType deducidos;

    /**
     * Gets the value of the totalDevengados property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalDevengados() {
        return totalDevengados;
    }

    /**
     * Sets the value of the totalDevengados property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalDevengados(BigDecimal value) {
        this.totalDevengados = value;
    }

    /**
     * Gets the value of the totalDeducidos property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalDeducidos() {
        return totalDeducidos;
    }

    /**
     * Sets the value of the totalDeducidos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalDeducidos(BigDecimal value) {
        this.totalDeducidos = value;
    }

    /**
     * Gets the value of the netoGirado property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetoGirado() {
        return netoGirado;
    }

    /**
     * Sets the value of the netoGirado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetoGirado(BigDecimal value) {
        this.netoGirado = value;
    }

    /**
     * Gets the value of the devengados property.
     * 
     * @return
     *     possible object is
     *     {@link TipoValoresLiquidacionDevengadosType }
     *     
     */
    public TipoValoresLiquidacionDevengadosType getDevengados() {
        return devengados;
    }

    /**
     * Sets the value of the devengados property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoValoresLiquidacionDevengadosType }
     *     
     */
    public void setDevengados(TipoValoresLiquidacionDevengadosType value) {
        this.devengados = value;
    }

    /**
     * Gets the value of the deducidos property.
     * 
     * @return
     *     possible object is
     *     {@link TipoValoresLiquidacionDeducidosType }
     *     
     */
    public TipoValoresLiquidacionDeducidosType getDeducidos() {
        return deducidos;
    }

    /**
     * Sets the value of the deducidos property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoValoresLiquidacionDeducidosType }
     *     
     */
    public void setDeducidos(TipoValoresLiquidacionDeducidosType value) {
        this.deducidos = value;
    }

}
