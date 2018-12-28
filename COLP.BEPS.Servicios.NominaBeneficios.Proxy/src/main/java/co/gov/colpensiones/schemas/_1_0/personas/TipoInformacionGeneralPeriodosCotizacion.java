
package co.gov.colpensiones.schemas._1_0.personas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionGeneralPeriodosCotizacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionGeneralPeriodosCotizacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totalSemanasCotizadas" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="periodosCotizacion" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionPeriodosCotizacion"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionGeneralPeriodosCotizacion", propOrder = {
    "totalSemanasCotizadas",
    "periodosCotizacion"
})
public class TipoInformacionGeneralPeriodosCotizacion {

    @XmlElement(required = true)
    protected BigDecimal totalSemanasCotizadas;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionPeriodosCotizacion periodosCotizacion;

    /**
     * Gets the value of the totalSemanasCotizadas property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalSemanasCotizadas() {
        return totalSemanasCotizadas;
    }

    /**
     * Sets the value of the totalSemanasCotizadas property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalSemanasCotizadas(BigDecimal value) {
        this.totalSemanasCotizadas = value;
    }

    /**
     * Gets the value of the periodosCotizacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionPeriodosCotizacion }
     *     
     */
    public TipoInformacionPeriodosCotizacion getPeriodosCotizacion() {
        return periodosCotizacion;
    }

    /**
     * Sets the value of the periodosCotizacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionPeriodosCotizacion }
     *     
     */
    public void setPeriodosCotizacion(TipoInformacionPeriodosCotizacion value) {
        this.periodosCotizacion = value;
    }

}
