
package co.gov.colpensiones.schemas._1_0.personas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoBeneficiarios complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoBeneficiarios">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beneficiario" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionGeneralBeneficiario" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoBeneficiarios", propOrder = {
    "beneficiario"
})
public class TipoBeneficiarios {

    @XmlElement(required = true, nillable = true)
    protected List<TipoInformacionGeneralBeneficiario> beneficiario;

    /**
     * Gets the value of the beneficiario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beneficiario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeneficiario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoInformacionGeneralBeneficiario }
     * 
     * 
     */
    public List<TipoInformacionGeneralBeneficiario> getBeneficiario() {
        if (beneficiario == null) {
            beneficiario = new ArrayList<TipoInformacionGeneralBeneficiario>();
        }
        return this.beneficiario;
    }

}
