
package co.gov.colpensiones.schemas._1_0.personas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoRespuestaValidacionTramite.rechazosDocumentosType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoRespuestaValidacionTramite.rechazosDocumentosType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="causal" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}causal" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoRespuestaValidacionTramite.rechazosDocumentosType", propOrder = {
    "causal"
})
public class TipoRespuestaValidacionTramiteRechazosDocumentosType {

    @XmlElement(nillable = true)
    protected List<Causal> causal;

    /**
     * Gets the value of the causal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the causal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCausal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Causal }
     * 
     * 
     */
    public List<Causal> getCausal() {
        if (causal == null) {
            causal = new ArrayList<Causal>();
        }
        return this.causal;
    }

}
