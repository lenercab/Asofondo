
package co.gov.colpensiones.schemas._1_0.pagoprestacioneseconomicas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoValorLiquidacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoValorLiquidacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombreConcepto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="nombreEntidadBeneficiaria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoValorLiquidacion", propOrder = {
    "nombreConcepto",
    "valor",
    "nombreEntidadBeneficiaria"
})
public class TipoValorLiquidacion {

    @XmlElement(required = true, nillable = true)
    protected String nombreConcepto;
    @XmlElement(required = true)
    protected BigDecimal valor;
    @XmlElement(required = true, nillable = true)
    protected String nombreEntidadBeneficiaria;

    /**
     * Gets the value of the nombreConcepto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreConcepto() {
        return nombreConcepto;
    }

    /**
     * Sets the value of the nombreConcepto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreConcepto(String value) {
        this.nombreConcepto = value;
    }

    /**
     * Gets the value of the valor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValor() {
        return valor;
    }

    /**
     * Sets the value of the valor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValor(BigDecimal value) {
        this.valor = value;
    }

    /**
     * Gets the value of the nombreEntidadBeneficiaria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEntidadBeneficiaria() {
        return nombreEntidadBeneficiaria;
    }

    /**
     * Sets the value of the nombreEntidadBeneficiaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEntidadBeneficiaria(String value) {
        this.nombreEntidadBeneficiaria = value;
    }

}
