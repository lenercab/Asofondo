
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionFormato3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionFormato3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroHoja" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalHojas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="consecutivo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="salarios" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionSalarios"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionFormato3", propOrder = {
    "numeroHoja",
    "totalHojas",
    "consecutivo",
    "salarios"
})
public class TipoInformacionFormato3 {

    protected Integer numeroHoja;
    protected Integer totalHojas;
    protected Integer consecutivo;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionSalarios salarios;

    /**
     * Gets the value of the numeroHoja property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroHoja() {
        return numeroHoja;
    }

    /**
     * Sets the value of the numeroHoja property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroHoja(Integer value) {
        this.numeroHoja = value;
    }

    /**
     * Gets the value of the totalHojas property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalHojas() {
        return totalHojas;
    }

    /**
     * Sets the value of the totalHojas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalHojas(Integer value) {
        this.totalHojas = value;
    }

    /**
     * Gets the value of the consecutivo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsecutivo() {
        return consecutivo;
    }

    /**
     * Sets the value of the consecutivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsecutivo(Integer value) {
        this.consecutivo = value;
    }

    /**
     * Gets the value of the salarios property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionSalarios }
     *     
     */
    public TipoInformacionSalarios getSalarios() {
        return salarios;
    }

    /**
     * Sets the value of the salarios property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionSalarios }
     *     
     */
    public void setSalarios(TipoInformacionSalarios value) {
        this.salarios = value;
    }

}
