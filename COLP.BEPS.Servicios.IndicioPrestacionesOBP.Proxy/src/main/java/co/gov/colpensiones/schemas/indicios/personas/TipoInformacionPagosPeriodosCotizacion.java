
package co.gov.colpensiones.schemas.indicios.personas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionPagosPeriodosCotizacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionPagosPeriodosCotizacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pago" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionPagoPeriodoCotizacion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionPagosPeriodosCotizacion", propOrder = {
    "pago"
})
public class TipoInformacionPagosPeriodosCotizacion {

    @XmlElement(nillable = true)
    protected List<TipoInformacionPagoPeriodoCotizacion> pago;

    /**
     * Gets the value of the pago property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pago property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPago().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoInformacionPagoPeriodoCotizacion }
     * 
     * 
     */
    public List<TipoInformacionPagoPeriodoCotizacion> getPago() {
        if (pago == null) {
            pago = new ArrayList<TipoInformacionPagoPeriodoCotizacion>();
        }
        return this.pago;
    }

}
