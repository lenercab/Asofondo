
package co.gov.colpensiones.schemas.afiliado.personas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoTrasladosAfiliacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoTrasladosAfiliacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="traslado" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoTrasladoAfiliacion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoTrasladosAfiliacion", propOrder = {
    "traslado"
})
public class TipoTrasladosAfiliacion {

    @XmlElement(nillable = true)
    protected List<TipoTrasladoAfiliacion> traslado;

    /**
     * Gets the value of the traslado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the traslado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTraslado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoTrasladoAfiliacion }
     * 
     * 
     */
    public List<TipoTrasladoAfiliacion> getTraslado() {
        if (traslado == null) {
            traslado = new ArrayList<TipoTrasladoAfiliacion>();
        }
        return this.traslado;
    }

}
