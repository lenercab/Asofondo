
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.comun.TipoBanco;
import co.gov.colpensiones.schemas.indicios.comun.TipoSucursalBanco;
import co.gov.colpensiones.schemas.indicios.personas.TipoIdentificacionPersona;


/**
 * <p>Java class for tipoInformacionCausante complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionCausante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacion" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionPersona"/>
 *         &lt;element name="bancoPago" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoBanco"/>
 *         &lt;element name="sucursalBancoPago" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoSucursalBanco"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionCausante", propOrder = {
    "identificacion",
    "bancoPago",
    "sucursalBancoPago"
})
public class TipoInformacionCausante {

    @XmlElement(required = true, nillable = true)
    protected TipoIdentificacionPersona identificacion;
    @XmlElement(required = true, nillable = true)
    protected TipoBanco bancoPago;
    @XmlElement(required = true, nillable = true)
    protected TipoSucursalBanco sucursalBancoPago;

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
     * Gets the value of the bancoPago property.
     * 
     * @return
     *     possible object is
     *     {@link TipoBanco }
     *     
     */
    public TipoBanco getBancoPago() {
        return bancoPago;
    }

    /**
     * Sets the value of the bancoPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoBanco }
     *     
     */
    public void setBancoPago(TipoBanco value) {
        this.bancoPago = value;
    }

    /**
     * Gets the value of the sucursalBancoPago property.
     * 
     * @return
     *     possible object is
     *     {@link TipoSucursalBanco }
     *     
     */
    public TipoSucursalBanco getSucursalBancoPago() {
        return sucursalBancoPago;
    }

    /**
     * Sets the value of the sucursalBancoPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoSucursalBanco }
     *     
     */
    public void setSucursalBancoPago(TipoSucursalBanco value) {
        this.sucursalBancoPago = value;
    }

}
