
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoCargueTiemposPublicos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoCargueTiemposPublicos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tiempoPublico" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoDetalleCargueTiemposPublicos" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoCargueTiemposPublicos", propOrder = {
    "tiempoPublico"
})
public class TipoCargueTiemposPublicos {

    @XmlElement(nillable = true)
    protected List<TipoDetalleCargueTiemposPublicos> tiempoPublico;

    /**
     * Gets the value of the tiempoPublico property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tiempoPublico property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTiempoPublico().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoDetalleCargueTiemposPublicos }
     * 
     * 
     */
    public List<TipoDetalleCargueTiemposPublicos> getTiempoPublico() {
        if (tiempoPublico == null) {
            tiempoPublico = new ArrayList<TipoDetalleCargueTiemposPublicos>();
        }
        return this.tiempoPublico;
    }

}
