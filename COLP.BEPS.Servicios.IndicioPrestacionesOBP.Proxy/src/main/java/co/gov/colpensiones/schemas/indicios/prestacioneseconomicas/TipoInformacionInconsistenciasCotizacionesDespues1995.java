
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionInconsistenciasCotizacionesDespues1995 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionInconsistenciasCotizacionesDespues1995">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inconsistencia" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionDatoErradoPago" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionInconsistenciasCotizacionesDespues1995", propOrder = {
    "inconsistencia"
})
public class TipoInformacionInconsistenciasCotizacionesDespues1995 {

    @XmlElement(nillable = true)
    protected List<TipoInformacionDatoErradoPago> inconsistencia;

    /**
     * Gets the value of the inconsistencia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inconsistencia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInconsistencia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoInformacionDatoErradoPago }
     * 
     * 
     */
    public List<TipoInformacionDatoErradoPago> getInconsistencia() {
        if (inconsistencia == null) {
            inconsistencia = new ArrayList<TipoInformacionDatoErradoPago>();
        }
        return this.inconsistencia;
    }

}
