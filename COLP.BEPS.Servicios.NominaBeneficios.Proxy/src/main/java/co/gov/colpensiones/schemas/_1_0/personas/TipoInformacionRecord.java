
package co.gov.colpensiones.schemas._1_0.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacionTRD" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionTRD"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionRecord", propOrder = {
    "identificacionTRD"
})
public class TipoInformacionRecord {

    @XmlElement(required = true, nillable = true)
    protected TipoIdentificacionTRD identificacionTRD;

    /**
     * Gets the value of the identificacionTRD property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificacionTRD }
     *     
     */
    public TipoIdentificacionTRD getIdentificacionTRD() {
        return identificacionTRD;
    }

    /**
     * Sets the value of the identificacionTRD property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificacionTRD }
     *     
     */
    public void setIdentificacionTRD(TipoIdentificacionTRD value) {
        this.identificacionTRD = value;
    }

}
