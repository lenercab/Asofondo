
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionIndiciosVinculacionesLaborales complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionIndiciosVinculacionesLaborales">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indicioVinculacionLaboral" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionIndicioVinculacionLaboral" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionIndiciosVinculacionesLaborales", propOrder = {
    "indicioVinculacionLaboral"
})
public class TipoInformacionIndiciosVinculacionesLaborales {

    @XmlElement(nillable = true)
    protected List<TipoInformacionIndicioVinculacionLaboral> indicioVinculacionLaboral;

    /**
     * Gets the value of the indicioVinculacionLaboral property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indicioVinculacionLaboral property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndicioVinculacionLaboral().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoInformacionIndicioVinculacionLaboral }
     * 
     * 
     */
    public List<TipoInformacionIndicioVinculacionLaboral> getIndicioVinculacionLaboral() {
        if (indicioVinculacionLaboral == null) {
            indicioVinculacionLaboral = new ArrayList<TipoInformacionIndicioVinculacionLaboral>();
        }
        return this.indicioVinculacionLaboral;
    }

}
