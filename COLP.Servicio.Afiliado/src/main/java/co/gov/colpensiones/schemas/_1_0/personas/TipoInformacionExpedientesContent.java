
package co.gov.colpensiones.schemas._1_0.personas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionExpedientesContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionExpedientesContent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="razonCierre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoInformacionExpedienteContent" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionExpedienteContent" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionExpedientesContent", propOrder = {
    "razonCierre",
    "tipoInformacionExpedienteContent"
})
public class TipoInformacionExpedientesContent {

    @XmlElement(required = true)
    protected String razonCierre;
    @XmlElement(required = true, nillable = true)
    protected List<TipoInformacionExpedienteContent> tipoInformacionExpedienteContent;

    /**
     * Gets the value of the razonCierre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonCierre() {
        return razonCierre;
    }

    /**
     * Sets the value of the razonCierre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonCierre(String value) {
        this.razonCierre = value;
    }

    /**
     * Gets the value of the tipoInformacionExpedienteContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tipoInformacionExpedienteContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTipoInformacionExpedienteContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoInformacionExpedienteContent }
     * 
     * 
     */
    public List<TipoInformacionExpedienteContent> getTipoInformacionExpedienteContent() {
        if (tipoInformacionExpedienteContent == null) {
            tipoInformacionExpedienteContent = new ArrayList<TipoInformacionExpedienteContent>();
        }
        return this.tipoInformacionExpedienteContent;
    }

}
