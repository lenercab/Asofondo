
package co.gov.colpensiones.schemas._1_0.pagoprestacioneseconomicas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoAportesSalud complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoAportesSalud">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aporte" type="{http://www.colpensiones.gov.co/schemas/1.0/pagoprestacioneseconomicas}tipoInformacionGeneralAporte" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoAportesSalud", propOrder = {
    "aporte"
})
public class TipoAportesSalud {

    @XmlElement(nillable = true)
    protected List<TipoInformacionGeneralAporte> aporte;

    /**
     * Gets the value of the aporte property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aporte property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAporte().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoInformacionGeneralAporte }
     * 
     * 
     */
    public List<TipoInformacionGeneralAporte> getAporte() {
        if (aporte == null) {
            aporte = new ArrayList<TipoInformacionGeneralAporte>();
        }
        return this.aporte;
    }

}
