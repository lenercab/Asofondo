
package co.gov.colpensiones.schemas.indicios.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionGeneralSucursal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionGeneralSucursal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacionAportante" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionPersona"/>
 *         &lt;element name="tipoAportante" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoTipoAportante"/>
 *         &lt;element name="sucursal" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoSucursal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionGeneralSucursal", propOrder = {
    "identificacionAportante",
    "tipoAportante",
    "sucursal"
})
public class TipoInformacionGeneralSucursal {

    @XmlElement(required = true, nillable = true)
    protected TipoIdentificacionPersona identificacionAportante;
    @XmlElement(required = true, nillable = true)
    protected TipoTipoAportante tipoAportante;
    @XmlElement(required = true, nillable = true)
    protected TipoSucursal sucursal;

    /**
     * Gets the value of the identificacionAportante property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificacionPersona }
     *     
     */
    public TipoIdentificacionPersona getIdentificacionAportante() {
        return identificacionAportante;
    }

    /**
     * Sets the value of the identificacionAportante property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificacionPersona }
     *     
     */
    public void setIdentificacionAportante(TipoIdentificacionPersona value) {
        this.identificacionAportante = value;
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

    /**
     * Gets the value of the sucursal property.
     * 
     * @return
     *     possible object is
     *     {@link TipoSucursal }
     *     
     */
    public TipoSucursal getSucursal() {
        return sucursal;
    }

    /**
     * Sets the value of the sucursal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoSucursal }
     *     
     */
    public void setSucursal(TipoSucursal value) {
        this.sucursal = value;
    }

}
