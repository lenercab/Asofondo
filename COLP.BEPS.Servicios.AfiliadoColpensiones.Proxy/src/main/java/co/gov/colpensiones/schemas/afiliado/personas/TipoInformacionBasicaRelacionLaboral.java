
package co.gov.colpensiones.schemas.afiliado.personas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionBasicaRelacionLaboral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionBasicaRelacionLaboral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoSucursal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="salarioAfiliado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="codigoCIIUOcupacionAfiliado" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="codigoNovedadRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Empleador" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionBasicaRelacionLaboral.EmpleadorType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionBasicaRelacionLaboral", propOrder = {
    "codigoSucursal",
    "salarioAfiliado",
    "codigoCIIUOcupacionAfiliado",
    "codigoNovedadRegistro",
    "empleador"
})
public class TipoInformacionBasicaRelacionLaboral {

    @XmlElement(required = true, nillable = true)
    protected String codigoSucursal;
    protected BigDecimal salarioAfiliado;
    protected long codigoCIIUOcupacionAfiliado;
    protected String codigoNovedadRegistro;
    @XmlElement(name = "Empleador", required = true, nillable = true)
    protected TipoInformacionBasicaRelacionLaboralEmpleadorType empleador;

    /**
     * Gets the value of the codigoSucursal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoSucursal() {
        return codigoSucursal;
    }

    /**
     * Sets the value of the codigoSucursal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoSucursal(String value) {
        this.codigoSucursal = value;
    }

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

    /**
     * Gets the value of the codigoNovedadRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoNovedadRegistro() {
        return codigoNovedadRegistro;
    }

    /**
     * Sets the value of the codigoNovedadRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoNovedadRegistro(String value) {
        this.codigoNovedadRegistro = value;
    }

    /**
     * Gets the value of the empleador property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionBasicaRelacionLaboralEmpleadorType }
     *     
     */
    public TipoInformacionBasicaRelacionLaboralEmpleadorType getEmpleador() {
        return empleador;
    }

    /**
     * Sets the value of the empleador property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionBasicaRelacionLaboralEmpleadorType }
     *     
     */
    public void setEmpleador(TipoInformacionBasicaRelacionLaboralEmpleadorType value) {
        this.empleador = value;
    }

}
