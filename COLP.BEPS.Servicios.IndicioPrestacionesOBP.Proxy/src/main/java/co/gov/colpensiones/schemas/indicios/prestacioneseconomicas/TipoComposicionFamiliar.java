
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoComposicionFamiliar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoComposicionFamiliar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="miembroFamiliar" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoMiembroFamiliarPension"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoComposicionFamiliar", propOrder = {
    "miembroFamiliar"
})
public class TipoComposicionFamiliar {

    @XmlElement(required = true, nillable = true)
    protected TipoMiembroFamiliarPension miembroFamiliar;

    /**
     * Gets the value of the miembroFamiliar property.
     * 
     * @return
     *     possible object is
     *     {@link TipoMiembroFamiliarPension }
     *     
     */
    public TipoMiembroFamiliarPension getMiembroFamiliar() {
        return miembroFamiliar;
    }

    /**
     * Sets the value of the miembroFamiliar property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoMiembroFamiliarPension }
     *     
     */
    public void setMiembroFamiliar(TipoMiembroFamiliarPension value) {
        this.miembroFamiliar = value;
    }

}
