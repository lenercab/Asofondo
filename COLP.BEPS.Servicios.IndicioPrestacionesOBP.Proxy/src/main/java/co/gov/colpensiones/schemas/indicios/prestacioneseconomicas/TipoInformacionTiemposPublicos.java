
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionTiemposPublicos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionTiemposPublicos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionTiempoPublico" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoTiempoPublico" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionTiemposPublicos", propOrder = {
    "informacionTiempoPublico"
})
public class TipoInformacionTiemposPublicos {

    @XmlElement(nillable = true)
    protected List<TipoTiempoPublico> informacionTiempoPublico;

    /**
     * Gets the value of the informacionTiempoPublico property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informacionTiempoPublico property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformacionTiempoPublico().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoTiempoPublico }
     * 
     * 
     */
    public List<TipoTiempoPublico> getInformacionTiempoPublico() {
        if (informacionTiempoPublico == null) {
            informacionTiempoPublico = new ArrayList<TipoTiempoPublico>();
        }
        return this.informacionTiempoPublico;
    }

}
