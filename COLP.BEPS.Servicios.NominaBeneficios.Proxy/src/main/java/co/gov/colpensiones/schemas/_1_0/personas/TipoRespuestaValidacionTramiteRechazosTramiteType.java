
package co.gov.colpensiones.schemas._1_0.personas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import co.gov.colpensiones.schemas._1_0.comun.TipoCausalError;


/**
 * <p>Java class for tipoRespuestaValidacionTramite.rechazosTramiteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoRespuestaValidacionTramite.rechazosTramiteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="causal" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoCausalError" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoRespuestaValidacionTramite.rechazosTramiteType", propOrder = {
    "causal"
})
public class TipoRespuestaValidacionTramiteRechazosTramiteType {

    @XmlElement(nillable = true)
    protected List<TipoCausalError> causal;

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
     * {@link TipoCausalError }
     * 
     * 
     */
    public List<TipoCausalError> getCausal() {
        if (causal == null) {
            causal = new ArrayList<TipoCausalError>();
        }
        return this.causal;
    }

}
