
package co.gov.colpensiones.schemas._1_0.pagoprestacioneseconomicas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoIndemnizacionPension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoIndemnizacionPension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seccional" type="{http://www.colpensiones.gov.co/schemas/1.0/pagoprestacioneseconomicas}tipoSeccional"/>
 *         &lt;element name="resolucion" type="{http://www.colpensiones.gov.co/schemas/1.0/pagoprestacioneseconomicas}tipoResolucion"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="descripcionPension" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="periodoPago" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoIndemnizacionPension", propOrder = {
    "seccional",
    "resolucion",
    "valor",
    "descripcionPension",
    "periodoPago"
})
public class TipoIndemnizacionPension {

    @XmlElement(required = true, nillable = true)
    protected TipoSeccional seccional;
    @XmlElement(required = true, nillable = true)
    protected TipoResolucion resolucion;
    @XmlElement(required = true)
    protected BigDecimal valor;
    @XmlElement(required = true, nillable = true)
    protected String descripcionPension;
    @XmlElement(required = true, nillable = true)
    protected String periodoPago;

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
     * Gets the value of the descripcionPension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionPension() {
        return descripcionPension;
    }

    /**
     * Sets the value of the descripcionPension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionPension(String value) {
        this.descripcionPension = value;
    }

    /**
     * Gets the value of the periodoPago property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodoPago() {
        return periodoPago;
    }

    /**
     * Sets the value of the periodoPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodoPago(String value) {
        this.periodoPago = value;
    }

}
