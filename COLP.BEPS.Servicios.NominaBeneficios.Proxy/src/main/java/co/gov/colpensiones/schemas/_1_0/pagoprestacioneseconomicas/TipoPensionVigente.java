
package co.gov.colpensiones.schemas._1_0.pagoprestacioneseconomicas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import co.gov.colpensiones.schemas._1_0.comun.TipoBanco;


/**
 * <p>Java class for tipoPensionVigente complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoPensionVigente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificadorAfiliacionPension" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombreComision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="seccional" type="{http://www.colpensiones.gov.co/schemas/1.0/pagoprestacioneseconomicas}tipoSeccional"/>
 *         &lt;element name="resolucion" type="{http://www.colpensiones.gov.co/schemas/1.0/pagoprestacioneseconomicas}tipoResolucion"/>
 *         &lt;element name="estadoPension" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entidadFinanciera" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoBanco"/>
 *         &lt;element name="oficina" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoBanco"/>
 *         &lt;element name="codigoZona" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numeroCuenta" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valores" type="{http://www.colpensiones.gov.co/schemas/1.0/pagoprestacioneseconomicas}tipoValoresLiquidacion"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoPensionVigente", propOrder = {
    "identificadorAfiliacionPension",
    "nombreComision",
    "seccional",
    "resolucion",
    "estadoPension",
    "entidadFinanciera",
    "oficina",
    "codigoZona",
    "numeroCuenta",
    "valores"
})
public class TipoPensionVigente {

    @XmlElement(required = true, nillable = true)
    protected String identificadorAfiliacionPension;
    @XmlElement(required = true, nillable = true)
    protected String nombreComision;
    @XmlElement(required = true, nillable = true)
    protected TipoSeccional seccional;
    @XmlElement(required = true, nillable = true)
    protected TipoResolucion resolucion;
    @XmlElement(required = true, nillable = true)
    protected String estadoPension;
    @XmlElement(required = true, nillable = true)
    protected TipoBanco entidadFinanciera;
    @XmlElement(required = true, nillable = true)
    protected TipoBanco oficina;
    protected int codigoZona;
    protected BigDecimal numeroCuenta;
    @XmlElement(required = true)
    protected TipoValoresLiquidacion valores;

    /**
     * Gets the value of the identificadorAfiliacionPension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorAfiliacionPension() {
        return identificadorAfiliacionPension;
    }

    /**
     * Sets the value of the identificadorAfiliacionPension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorAfiliacionPension(String value) {
        this.identificadorAfiliacionPension = value;
    }

    /**
     * Gets the value of the nombreComision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreComision() {
        return nombreComision;
    }

    /**
     * Sets the value of the nombreComision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreComision(String value) {
        this.nombreComision = value;
    }

    /**
     * Gets the value of the seccional property.
     * 
     * @return
     *     possible object is
     *     {@link TipoSeccional }
     *     
     */
    public TipoSeccional getSeccional() {
        return seccional;
    }

    /**
     * Sets the value of the seccional property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoSeccional }
     *     
     */
    public void setSeccional(TipoSeccional value) {
        this.seccional = value;
    }

    /**
     * Gets the value of the resolucion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoResolucion }
     *     
     */
    public TipoResolucion getResolucion() {
        return resolucion;
    }

    /**
     * Sets the value of the resolucion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoResolucion }
     *     
     */
    public void setResolucion(TipoResolucion value) {
        this.resolucion = value;
    }

    /**
     * Gets the value of the estadoPension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoPension() {
        return estadoPension;
    }

    /**
     * Sets the value of the estadoPension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoPension(String value) {
        this.estadoPension = value;
    }

    /**
     * Gets the value of the entidadFinanciera property.
     * 
     * @return
     *     possible object is
     *     {@link TipoBanco }
     *     
     */
    public TipoBanco getEntidadFinanciera() {
        return entidadFinanciera;
    }

    /**
     * Sets the value of the entidadFinanciera property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoBanco }
     *     
     */
    public void setEntidadFinanciera(TipoBanco value) {
        this.entidadFinanciera = value;
    }

    /**
     * Gets the value of the oficina property.
     * 
     * @return
     *     possible object is
     *     {@link TipoBanco }
     *     
     */
    public TipoBanco getOficina() {
        return oficina;
    }

    /**
     * Sets the value of the oficina property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoBanco }
     *     
     */
    public void setOficina(TipoBanco value) {
        this.oficina = value;
    }

    /**
     * Gets the value of the codigoZona property.
     * 
     */
    public int getCodigoZona() {
        return codigoZona;
    }

    /**
     * Sets the value of the codigoZona property.
     * 
     */
    public void setCodigoZona(int value) {
        this.codigoZona = value;
    }

    /**
     * Gets the value of the numeroCuenta property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Sets the value of the numeroCuenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumeroCuenta(BigDecimal value) {
        this.numeroCuenta = value;
    }

    /**
     * Gets the value of the valores property.
     * 
     * @return
     *     possible object is
     *     {@link TipoValoresLiquidacion }
     *     
     */
    public TipoValoresLiquidacion getValores() {
        return valores;
    }

    /**
     * Sets the value of the valores property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoValoresLiquidacion }
     *     
     */
    public void setValores(TipoValoresLiquidacion value) {
        this.valores = value;
    }

}
