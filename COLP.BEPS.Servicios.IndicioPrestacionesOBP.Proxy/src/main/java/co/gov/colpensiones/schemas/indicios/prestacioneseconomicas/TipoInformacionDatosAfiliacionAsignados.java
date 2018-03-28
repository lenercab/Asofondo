
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionDatosAfiliacionAsignados complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionDatosAfiliacionAsignados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consecutivoTipo3" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoConsecutivo"/>
 *         &lt;element name="numeroAfiliacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionDatosAfiliacionAsignados", propOrder = {
    "consecutivoTipo3",
    "numeroAfiliacion"
})
public class TipoInformacionDatosAfiliacionAsignados {

    @XmlElement(required = true, nillable = true)
    protected TipoConsecutivo consecutivoTipo3;
    protected String numeroAfiliacion;

    /**
     * Gets the value of the consecutivoTipo3 property.
     * 
     * @return
     *     possible object is
     *     {@link TipoConsecutivo }
     *     
     */
    public TipoConsecutivo getConsecutivoTipo3() {
        return consecutivoTipo3;
    }

    /**
     * Sets the value of the consecutivoTipo3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoConsecutivo }
     *     
     */
    public void setConsecutivoTipo3(TipoConsecutivo value) {
        this.consecutivoTipo3 = value;
    }

    /**
     * Gets the value of the numeroAfiliacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroAfiliacion() {
        return numeroAfiliacion;
    }

    /**
     * Sets the value of the numeroAfiliacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroAfiliacion(String value) {
        this.numeroAfiliacion = value;
    }

}
