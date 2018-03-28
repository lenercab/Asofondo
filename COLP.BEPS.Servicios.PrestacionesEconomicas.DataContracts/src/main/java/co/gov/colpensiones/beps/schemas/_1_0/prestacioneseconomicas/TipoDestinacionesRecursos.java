package co.gov.colpensiones.beps.schemas._1_0.prestacioneseconomicas;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.beps.comunes.anotaciones.ObjectValidator;

/**
 * <p>
 * Java class for tipoDestinacionesRecursos complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoDestinacionesRecursos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="destinacion" type="{http://www.colpensiones.gov.co/beps/schemas/1.0/prestacioneseconomicas}tipoDestinacionRecursos" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoDestinacionesRecursos", propOrder = { "destinacion" })
public class TipoDestinacionesRecursos {

    @XmlElement(nillable = true)
    protected List<TipoDestinacionRecursos> destinacion;

    /**
     * Gets the value of the destinacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list
     * will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the destinacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getDestinacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link TipoDestinacionRecursos }
     * 
     * 
     */
    @ObjectValidator
    public List<TipoDestinacionRecursos> getDestinacion() {
        if (destinacion == null) {
            destinacion = new ArrayList<TipoDestinacionRecursos>();
        }
        return this.destinacion;
    }

}
