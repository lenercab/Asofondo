
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoDatosPensiones complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoDatosPensiones">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datosPension" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoDatosPension" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoDatosPensiones", propOrder = {
    "datosPension"
})
public class TipoDatosPensiones {

    @XmlElement(required = true, nillable = true)
    protected List<TipoDatosPension> datosPension;

    /**
     * Gets the value of the datosPension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datosPension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatosPension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoDatosPension }
     * 
     * 
     */
    public List<TipoDatosPension> getDatosPension() {
        if (datosPension == null) {
            datosPension = new ArrayList<TipoDatosPension>();
        }
        return this.datosPension;
    }

}
