
package co.gov.colpensiones.schemas._1_0.personas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoFolderDispocision complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoFolderDispocision">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoInformacionFolder" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionFolder" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoFolderDispocision", propOrder = {
    "tipoInformacionFolder"
})
public class TipoFolderDispocision {

    @XmlElement(required = true, nillable = true)
    protected List<TipoInformacionFolder> tipoInformacionFolder;

    /**
     * Gets the value of the tipoInformacionFolder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tipoInformacionFolder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTipoInformacionFolder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoInformacionFolder }
     * 
     * 
     */
    public List<TipoInformacionFolder> getTipoInformacionFolder() {
        if (tipoInformacionFolder == null) {
            tipoInformacionFolder = new ArrayList<TipoInformacionFolder>();
        }
        return this.tipoInformacionFolder;
    }

}
