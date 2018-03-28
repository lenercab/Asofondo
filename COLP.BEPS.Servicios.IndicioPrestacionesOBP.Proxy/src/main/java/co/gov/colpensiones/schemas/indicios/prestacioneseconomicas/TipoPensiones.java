
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoPensiones complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoPensiones">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pension" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionGeneralPension"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoPensiones", propOrder = {
    "pension"
})
public class TipoPensiones {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionGeneralPension pension;

    /**
     * Gets the value of the pension property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionGeneralPension }
     *     
     */
    public TipoInformacionGeneralPension getPension() {
        return pension;
    }

    /**
     * Sets the value of the pension property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionGeneralPension }
     *     
     */
    public void setPension(TipoInformacionGeneralPension value) {
        this.pension = value;
    }

}
