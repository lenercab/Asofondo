
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionInconsistenciasCotizacionesAntes1995 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionInconsistenciasCotizacionesAntes1995">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionInconsistencia" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionInconsistenciaCotizacionAntes1995" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionInconsistenciasCotizacionesAntes1995", propOrder = {
    "informacionInconsistencia"
})
public class TipoInformacionInconsistenciasCotizacionesAntes1995 {

    @XmlElement(nillable = true)
    protected List<TipoInformacionInconsistenciaCotizacionAntes1995> informacionInconsistencia;

    /**
     * Gets the value of the informacionInconsistencia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informacionInconsistencia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformacionInconsistencia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoInformacionInconsistenciaCotizacionAntes1995 }
     * 
     * 
     */
    public List<TipoInformacionInconsistenciaCotizacionAntes1995> getInformacionInconsistencia() {
        if (informacionInconsistencia == null) {
            informacionInconsistencia = new ArrayList<TipoInformacionInconsistenciaCotizacionAntes1995>();
        }
        return this.informacionInconsistencia;
    }

}
