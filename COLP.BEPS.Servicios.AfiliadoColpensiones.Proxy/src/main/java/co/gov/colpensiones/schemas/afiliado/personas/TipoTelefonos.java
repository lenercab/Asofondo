
package co.gov.colpensiones.schemas.afiliado.personas;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.gobiernoenlinea.gel_xml.afiliado.schemas.comun.ubicacion.TipoDatoTelefono;


/**
 * <p>Java class for tipoTelefonos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoTelefonos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="telefono" type="{http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/Comun/Ubicacion}tipoDatoTelefono" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoTelefonos", propOrder = {
    "telefono"
})
public class TipoTelefonos {

    @XmlElement(required = true, nillable = true)
    protected List<TipoDatoTelefono> telefono;

    /**
     * Gets the value of the telefono property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telefono property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelefono().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoDatoTelefono }
     * 
     * 
     */
    public List<TipoDatoTelefono> getTelefono() {
        if (telefono == null) {
            telefono = new ArrayList<TipoDatoTelefono>();
        }
        return this.telefono;
    }

}
