
package co.gov.colpensiones.schemas._1_0.personas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionRegistroInicialAfiliacion.informacionRelacionLaboralType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionRegistroInicialAfiliacion.informacionRelacionLaboralType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="salarioAfiliado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="codigoCIIUOcupacionAfiliado" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionRegistroInicialAfiliacion.informacionRelacionLaboralType", propOrder = {
    "salarioAfiliado",
    "codigoCIIUOcupacionAfiliado"
})
public class TipoInformacionRegistroInicialAfiliacionInformacionRelacionLaboralType {

    protected BigDecimal salarioAfiliado;
    protected Long codigoCIIUOcupacionAfiliado;

    /**
     * Gets the value of the salarioAfiliado property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalarioAfiliado() {
        return salarioAfiliado;
    }

    /**
     * Sets the value of the salarioAfiliado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalarioAfiliado(BigDecimal value) {
        this.salarioAfiliado = value;
    }

    /**
     * Gets the value of the codigoCIIUOcupacionAfiliado property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoCIIUOcupacionAfiliado() {
        return codigoCIIUOcupacionAfiliado;
    }

    /**
     * Sets the value of the codigoCIIUOcupacionAfiliado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoCIIUOcupacionAfiliado(Long value) {
        this.codigoCIIUOcupacionAfiliado = value;
    }

}
