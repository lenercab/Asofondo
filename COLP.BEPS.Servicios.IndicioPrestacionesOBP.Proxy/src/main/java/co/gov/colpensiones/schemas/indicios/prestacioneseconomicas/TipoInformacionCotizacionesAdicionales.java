
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionCotizacionesAdicionales complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionCotizacionesAdicionales">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="relacionNacionalidad" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoRelacionNacionalidad" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionCotizacionesAdicionales", propOrder = {
    "relacionNacionalidad"
})
public class TipoInformacionCotizacionesAdicionales {

    @XmlElement(nillable = true)
    protected List<TipoRelacionNacionalidad> relacionNacionalidad;

    /**
     * Gets the value of the relacionNacionalidad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relacionNacionalidad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelacionNacionalidad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoRelacionNacionalidad }
     * 
     * 
     */
    public List<TipoRelacionNacionalidad> getRelacionNacionalidad() {
        if (relacionNacionalidad == null) {
            relacionNacionalidad = new ArrayList<TipoRelacionNacionalidad>();
        }
        return this.relacionNacionalidad;
    }

}
