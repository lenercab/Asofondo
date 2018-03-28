
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionPrestaciones complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionPrestaciones">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prestacion" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionPrestacion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionPrestaciones", propOrder = {
    "prestacion"
})
public class TipoInformacionPrestaciones {

    @XmlElement(nillable = true)
    protected List<TipoInformacionPrestacion> prestacion;

    /**
     * Gets the value of the prestacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prestacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrestacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoInformacionPrestacion }
     * 
     * 
     */
    public List<TipoInformacionPrestacion> getPrestacion() {
        if (prestacion == null) {
            prestacion = new ArrayList<TipoInformacionPrestacion>();
        }
        return this.prestacion;
    }

}
