
package co.gov.colpensiones.schemas._1_0.personas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionExpedientesRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionExpedientesRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoInformacionExpedienteRecord" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionExpedienteRecord" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionExpedientesRecord", propOrder = {
    "tipoInformacionExpedienteRecord"
})
public class TipoInformacionExpedientesRecord {

    @XmlElement(nillable = true)
    protected List<TipoInformacionExpedienteRecord> tipoInformacionExpedienteRecord;

    /**
     * Gets the value of the tipoInformacionExpedienteRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tipoInformacionExpedienteRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTipoInformacionExpedienteRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoInformacionExpedienteRecord }
     * 
     * 
     */
    public List<TipoInformacionExpedienteRecord> getTipoInformacionExpedienteRecord() {
        if (tipoInformacionExpedienteRecord == null) {
            tipoInformacionExpedienteRecord = new ArrayList<TipoInformacionExpedienteRecord>();
        }
        return this.tipoInformacionExpedienteRecord;
    }

}
