
package co.gov.colpensiones.schemas.afiliado.personas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoConsultaContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoConsultaContent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consultaContent" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoResultadoConsultaContent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoConsultaContent", propOrder = {
    "consultaContent"
})
public class TipoConsultaContent {

    @XmlElement(nillable = true)
    protected List<TipoResultadoConsultaContent> consultaContent;

    /**
     * Gets the value of the consultaContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consultaContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsultaContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoResultadoConsultaContent }
     * 
     * 
     */
    public List<TipoResultadoConsultaContent> getConsultaContent() {
        if (consultaContent == null) {
            consultaContent = new ArrayList<TipoResultadoConsultaContent>();
        }
        return this.consultaContent;
    }

}
