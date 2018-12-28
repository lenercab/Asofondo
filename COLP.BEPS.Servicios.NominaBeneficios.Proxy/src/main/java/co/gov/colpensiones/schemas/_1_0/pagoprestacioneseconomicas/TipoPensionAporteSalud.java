
package co.gov.colpensiones.schemas._1_0.pagoprestacioneseconomicas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoPensionAporteSalud complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoPensionAporteSalud">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificadorAfiliacionPension" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombreRiesgo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resolucion" type="{http://www.colpensiones.gov.co/schemas/1.0/pagoprestacioneseconomicas}tipoResolucion"/>
 *         &lt;element name="valorPension" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="aportes" type="{http://www.colpensiones.gov.co/schemas/1.0/pagoprestacioneseconomicas}tipoAportesSalud"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoPensionAporteSalud", propOrder = {
    "identificadorAfiliacionPension",
    "nombreRiesgo",
    "resolucion",
    "valorPension",
    "aportes"
})
public class TipoPensionAporteSalud {

    @XmlElement(required = true, nillable = true)
    protected String identificadorAfiliacionPension;
    @XmlElement(required = true, nillable = true)
    protected String nombreRiesgo;
    @XmlElement(required = true, nillable = true)
    protected TipoResolucion resolucion;
    @XmlElement(required = true)
    protected BigDecimal valorPension;
    @XmlElement(required = true, nillable = true)
    protected TipoAportesSalud aportes;

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
     * Gets the value of the nombreRiesgo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreRiesgo() {
        return nombreRiesgo;
    }

    /**
     * Sets the value of the nombreRiesgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreRiesgo(String value) {
        this.nombreRiesgo = value;
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
     * Gets the value of the valorPension property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorPension() {
        return valorPension;
    }

    /**
     * Sets the value of the valorPension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorPension(BigDecimal value) {
        this.valorPension = value;
    }

    /**
     * Gets the value of the aportes property.
     * 
     * @return
     *     possible object is
     *     {@link TipoAportesSalud }
     *     
     */
    public TipoAportesSalud getAportes() {
        return aportes;
    }

    /**
     * Sets the value of the aportes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoAportesSalud }
     *     
     */
    public void setAportes(TipoAportesSalud value) {
        this.aportes = value;
    }

}
