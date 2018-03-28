
package co.gov.colpensiones.schemas.indicios.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionBasicaRelacionLaboral.EmpleadorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionBasicaRelacionLaboral.EmpleadorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacion" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionPersona"/>
 *         &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoAportante" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoTipoAportante"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionBasicaRelacionLaboral.EmpleadorType", propOrder = {
    "identificacion",
    "razonSocial",
    "tipoAportante"
})
public class TipoInformacionBasicaRelacionLaboralEmpleadorType {

    @XmlElement(required = true, nillable = true)
    protected TipoIdentificacionPersona identificacion;
    protected String razonSocial;
    @XmlElement(required = true, nillable = true)
    protected TipoTipoAportante tipoAportante;

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
     * Gets the value of the razonSocial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * Sets the value of the razonSocial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocial(String value) {
        this.razonSocial = value;
    }

    /**
     * Gets the value of the tipoAportante property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTipoAportante }
     *     
     */
    public TipoTipoAportante getTipoAportante() {
        return tipoAportante;
    }

    /**
     * Sets the value of the tipoAportante property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTipoAportante }
     *     
     */
    public void setTipoAportante(TipoTipoAportante value) {
        this.tipoAportante = value;
    }

}
