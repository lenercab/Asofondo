
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionCertificacionTiemposPublicos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionCertificacionTiemposPublicos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="formato1" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionFormato1"/>
 *         &lt;element name="formato2" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionFormato2"/>
 *         &lt;element name="formato3" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionFormato3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionCertificacionTiemposPublicos", propOrder = {
    "formato1",
    "formato2",
    "formato3"
})
public class TipoInformacionCertificacionTiemposPublicos {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionFormato1 formato1;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionFormato2 formato2;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionFormato3 formato3;

    /**
     * Gets the value of the formato1 property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionFormato1 }
     *     
     */
    public TipoInformacionFormato1 getFormato1() {
        return formato1;
    }

    /**
     * Sets the value of the formato1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionFormato1 }
     *     
     */
    public void setFormato1(TipoInformacionFormato1 value) {
        this.formato1 = value;
    }

    /**
     * Gets the value of the formato2 property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionFormato2 }
     *     
     */
    public TipoInformacionFormato2 getFormato2() {
        return formato2;
    }

    /**
     * Sets the value of the formato2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionFormato2 }
     *     
     */
    public void setFormato2(TipoInformacionFormato2 value) {
        this.formato2 = value;
    }

    /**
     * Gets the value of the formato3 property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionFormato3 }
     *     
     */
    public TipoInformacionFormato3 getFormato3() {
        return formato3;
    }

    /**
     * Sets the value of the formato3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionFormato3 }
     *     
     */
    public void setFormato3(TipoInformacionFormato3 value) {
        this.formato3 = value;
    }

}
