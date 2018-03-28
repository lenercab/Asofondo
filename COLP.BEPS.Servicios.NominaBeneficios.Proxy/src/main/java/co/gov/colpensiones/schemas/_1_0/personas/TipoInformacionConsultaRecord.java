
package co.gov.colpensiones.schemas._1_0.personas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionConsultaRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionConsultaRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoInformacionRecord" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionRecord" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionConsultaRecord", propOrder = {
    "tipoInformacionRecord"
})
public class TipoInformacionConsultaRecord {

    @XmlElement(required = true, nillable = true)
    protected List<TipoInformacionRecord> tipoInformacionRecord;

    /**
     * Gets the value of the tipoInformacionRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tipoInformacionRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTipoInformacionRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoInformacionRecord }
     * 
     * 
     */
    public List<TipoInformacionRecord> getTipoInformacionRecord() {
        if (tipoInformacionRecord == null) {
            tipoInformacionRecord = new ArrayList<TipoInformacionRecord>();
        }
        return this.tipoInformacionRecord;
    }

}
