
package co.gov.colpensiones.schemas.afiliado.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionGeneralAfiliado complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionGeneralAfiliado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionPersonal" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionGeneralPersona"/>
 *         &lt;element name="informacionLugarNacimiento" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionGeneralAfiliado.informacionLugarNacimientoType"/>
 *         &lt;element name="autorizacionEnvioNotificaciones" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionGeneralAfiliado", propOrder = {
    "informacionPersonal",
    "informacionLugarNacimiento",
    "autorizacionEnvioNotificaciones"
})
public class TipoInformacionGeneralAfiliado {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionGeneralPersona informacionPersonal;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionGeneralAfiliadoInformacionLugarNacimientoType informacionLugarNacimiento;
    protected Boolean autorizacionEnvioNotificaciones;

    /**
     * Gets the value of the informacionPersonal property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionGeneralPersona }
     *     
     */
    public TipoInformacionGeneralPersona getInformacionPersonal() {
        return informacionPersonal;
    }

    /**
     * Sets the value of the informacionPersonal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionGeneralPersona }
     *     
     */
    public void setInformacionPersonal(TipoInformacionGeneralPersona value) {
        this.informacionPersonal = value;
    }

    /**
     * Gets the value of the informacionLugarNacimiento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionGeneralAfiliadoInformacionLugarNacimientoType }
     *     
     */
    public TipoInformacionGeneralAfiliadoInformacionLugarNacimientoType getInformacionLugarNacimiento() {
        return informacionLugarNacimiento;
    }

    /**
     * Sets the value of the informacionLugarNacimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionGeneralAfiliadoInformacionLugarNacimientoType }
     *     
     */
    public void setInformacionLugarNacimiento(TipoInformacionGeneralAfiliadoInformacionLugarNacimientoType value) {
        this.informacionLugarNacimiento = value;
    }

    /**
     * Gets the value of the autorizacionEnvioNotificaciones property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutorizacionEnvioNotificaciones() {
        return autorizacionEnvioNotificaciones;
    }

    /**
     * Sets the value of the autorizacionEnvioNotificaciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutorizacionEnvioNotificaciones(Boolean value) {
        this.autorizacionEnvioNotificaciones = value;
    }

}
