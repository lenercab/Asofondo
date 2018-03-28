
package co.gov.colpensiones.schemas._1_0.pagoprestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoPensionDevengadosDeducidos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoPensionDevengadosDeducidos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificadorAfiliacionPension" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descripcionPension" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "tipoPensionDevengadosDeducidos", propOrder = {
    "identificadorAfiliacionPension",
    "descripcionPension",
    "valores"
})
public class TipoPensionDevengadosDeducidos {

    @XmlElement(required = true, nillable = true)
    protected String identificadorAfiliacionPension;
    @XmlElement(required = true, nillable = true)
    protected String descripcionPension;
    @XmlElement(required = true, nillable = true)
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
