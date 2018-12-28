
package co.gov.colpensiones.schemas.afiliado.personas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionActualizacionAfiliacion.informacionRelacionLaboralType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionActualizacionAfiliacion.informacionRelacionLaboralType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="salarioAfiliado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="codigoCIIUOcupacionAfiliado" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionActualizacionAfiliacion.informacionRelacionLaboralType", propOrder = {
    "salarioAfiliado",
    "codigoCIIUOcupacionAfiliado"
})
public class TipoInformacionActualizacionAfiliacionInformacionRelacionLaboralType {

    protected BigDecimal salarioAfiliado;
    protected long codigoCIIUOcupacionAfiliado;

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
     */
    public long getCodigoCIIUOcupacionAfiliado() {
        return codigoCIIUOcupacionAfiliado;
    }

    /**
     * Sets the value of the codigoCIIUOcupacionAfiliado property.
     * 
     */
    public void setCodigoCIIUOcupacionAfiliado(long value) {
        this.codigoCIIUOcupacionAfiliado = value;
    }

}
