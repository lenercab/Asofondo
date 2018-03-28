
package co.gov.colpensiones.schemas._1_0.personas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoSubseries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoSubseries">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoSubserie" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoSubserie" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoSubseries", propOrder = {
    "tipoSubserie"
})
public class TipoSubseries {

    @XmlElement(required = true, nillable = true)
    protected List<TipoSubserie> tipoSubserie;

    /**
     * Gets the value of the tipoSubserie property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tipoSubserie property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTipoSubserie().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoSubserie }
     * 
     * 
     */
    public List<TipoSubserie> getTipoSubserie() {
        if (tipoSubserie == null) {
            tipoSubserie = new ArrayList<TipoSubserie>();
        }
        return this.tipoSubserie;
    }

}
