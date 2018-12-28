
package co.gov.colpensiones.schemas._1_0.pagoprestacioneseconomicas;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="pension" type="{http://www.colpensiones.gov.co/schemas/1.0/pagoprestacioneseconomicas}tipoInformacionGeneralPension" maxOccurs="unbounded" minOccurs="0"/>
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

    @XmlElement(nillable = true)
    protected List<TipoInformacionGeneralPension> pension;

    /**
     * Gets the value of the pension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoInformacionGeneralPension }
     * 
     * 
     */
    public List<TipoInformacionGeneralPension> getPension() {
        if (pension == null) {
            pension = new ArrayList<TipoInformacionGeneralPension>();
        }
        return this.pension;
    }

}
