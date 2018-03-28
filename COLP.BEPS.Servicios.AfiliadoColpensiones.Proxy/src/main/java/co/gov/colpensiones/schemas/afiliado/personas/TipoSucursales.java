
package co.gov.colpensiones.schemas.afiliado.personas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoSucursales complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoSucursales">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sucursal" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoSucursal" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoSucursales", propOrder = {
    "sucursal"
})
public class TipoSucursales {

    @XmlElement(nillable = true)
    protected List<TipoSucursal> sucursal;

    /**
     * Gets the value of the sucursal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sucursal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSucursal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoSucursal }
     * 
     * 
     */
    public List<TipoSucursal> getSucursal() {
        if (sucursal == null) {
            sucursal = new ArrayList<TipoSucursal>();
        }
        return this.sucursal;
    }

}
