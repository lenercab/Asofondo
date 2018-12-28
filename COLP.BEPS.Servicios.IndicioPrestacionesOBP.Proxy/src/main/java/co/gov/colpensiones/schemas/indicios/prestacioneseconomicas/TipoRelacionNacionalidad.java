
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.personas.TipoIdentificacionPersona;


/**
 * <p>Java class for tipoRelacionNacionalidad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoRelacionNacionalidad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consecutivoTipo2" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoConsecutivo"/>
 *         &lt;element name="identificacion" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionPersona"/>
 *         &lt;element name="nacionalidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoRelacionNacionalidad", propOrder = {
    "consecutivoTipo2",
    "identificacion",
    "nacionalidad"
})
public class TipoRelacionNacionalidad {

    @XmlElement(required = true, nillable = true)
    protected TipoConsecutivo consecutivoTipo2;
    @XmlElement(required = true, nillable = true)
    protected TipoIdentificacionPersona identificacion;
    @XmlElement(required = true, nillable = true)
    protected String nacionalidad;

    /**
     * Gets the value of the consecutivoTipo2 property.
     * 
     * @return
     *     possible object is
     *     {@link TipoConsecutivo }
     *     
     */
    public TipoConsecutivo getConsecutivoTipo2() {
        return consecutivoTipo2;
    }

    /**
     * Sets the value of the consecutivoTipo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoConsecutivo }
     *     
     */
    public void setConsecutivoTipo2(TipoConsecutivo value) {
        this.consecutivoTipo2 = value;
    }

    /**
     * Gets the value of the identificacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificacionPersona }
     *     
     */
    public TipoIdentificacionPersona getIdentificacion() {
        return identificacion;
    }

    /**
     * Sets the value of the identificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificacionPersona }
     *     
     */
    public void setIdentificacion(TipoIdentificacionPersona value) {
        this.identificacion = value;
    }

    /**
     * Gets the value of the nacionalidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Sets the value of the nacionalidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacionalidad(String value) {
        this.nacionalidad = value;
    }

}
