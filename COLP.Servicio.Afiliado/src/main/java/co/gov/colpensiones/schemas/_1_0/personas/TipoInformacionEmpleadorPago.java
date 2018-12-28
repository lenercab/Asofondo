
package co.gov.colpensiones.schemas._1_0.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionEmpleadorPago complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionEmpleadorPago">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionGeneralEmpleador" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionGeneralEmpleador"/>
 *         &lt;element name="informacionUbicacionEmpleador" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionUbicacionPersona"/>
 *         &lt;element name="informacionGeneralPago" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionReferenciaPago"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionEmpleadorPago", propOrder = {
    "informacionGeneralEmpleador",
    "informacionUbicacionEmpleador",
    "informacionGeneralPago"
})
public class TipoInformacionEmpleadorPago {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionGeneralEmpleador informacionGeneralEmpleador;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionUbicacionPersona informacionUbicacionEmpleador;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionReferenciaPago informacionGeneralPago;

    /**
     * Gets the value of the informacionGeneralEmpleador property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionGeneralEmpleador }
     *     
     */
    public TipoInformacionGeneralEmpleador getInformacionGeneralEmpleador() {
        return informacionGeneralEmpleador;
    }

    /**
     * Sets the value of the informacionGeneralEmpleador property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionGeneralEmpleador }
     *     
     */
    public void setInformacionGeneralEmpleador(TipoInformacionGeneralEmpleador value) {
        this.informacionGeneralEmpleador = value;
    }

    /**
     * Gets the value of the informacionUbicacionEmpleador property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionUbicacionPersona }
     *     
     */
    public TipoInformacionUbicacionPersona getInformacionUbicacionEmpleador() {
        return informacionUbicacionEmpleador;
    }

    /**
     * Sets the value of the informacionUbicacionEmpleador property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionUbicacionPersona }
     *     
     */
    public void setInformacionUbicacionEmpleador(TipoInformacionUbicacionPersona value) {
        this.informacionUbicacionEmpleador = value;
    }

    /**
     * Gets the value of the informacionGeneralPago property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionReferenciaPago }
     *     
     */
    public TipoInformacionReferenciaPago getInformacionGeneralPago() {
        return informacionGeneralPago;
    }

    /**
     * Sets the value of the informacionGeneralPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionReferenciaPago }
     *     
     */
    public void setInformacionGeneralPago(TipoInformacionReferenciaPago value) {
        this.informacionGeneralPago = value;
    }

}
