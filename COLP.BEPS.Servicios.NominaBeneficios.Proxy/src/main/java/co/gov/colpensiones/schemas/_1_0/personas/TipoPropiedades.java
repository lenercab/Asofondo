
package co.gov.colpensiones.schemas._1_0.personas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoPropiedades complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoPropiedades">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="propiedad" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoPropiedad" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoPropiedades", propOrder = {
    "propiedad"
})
public class TipoPropiedades {

    @XmlElement(nillable = true)
    protected List<TipoPropiedad> propiedad;

    /**
     * Gets the value of the propiedad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propiedad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropiedad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoPropiedad }
     * 
     * 
     */
    public List<TipoPropiedad> getPropiedad() {
        if (propiedad == null) {
            propiedad = new ArrayList<TipoPropiedad>();
        }
        return this.propiedad;
    }

}
