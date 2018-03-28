
package co.gov.colpensiones.schemas._1_0.pagoprestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionComplementariaPension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionComplementariaPension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="riesgo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="esPagoUnico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionComplementariaPension", propOrder = {
    "riesgo",
    "tipoBeneficiario",
    "esPagoUnico"
})
public class TipoInformacionComplementariaPension {

    @XmlElement(required = true, nillable = true)
    protected String riesgo;
    @XmlElement(required = true, nillable = true)
    protected String tipoBeneficiario;
    @XmlElement(required = true, nillable = true)
    protected String esPagoUnico;

    /**
     * Gets the value of the riesgo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiesgo() {
        return riesgo;
    }

    /**
     * Sets the value of the riesgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiesgo(String value) {
        this.riesgo = value;
    }

    /**
     * Gets the value of the tipoBeneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoBeneficiario() {
        return tipoBeneficiario;
    }

    /**
     * Sets the value of the tipoBeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoBeneficiario(String value) {
        this.tipoBeneficiario = value;
    }

    /**
     * Gets the value of the esPagoUnico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsPagoUnico() {
        return esPagoUnico;
    }

    /**
     * Sets the value of the esPagoUnico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsPagoUnico(String value) {
        this.esPagoUnico = value;
    }

}
