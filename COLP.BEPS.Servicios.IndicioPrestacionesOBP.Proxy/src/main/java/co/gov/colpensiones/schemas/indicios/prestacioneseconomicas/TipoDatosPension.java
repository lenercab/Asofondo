
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionBasicaPersonaJuridica;


/**
 * <p>Java class for tipoDatosPension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoDatosPension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificadorPension" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoSolicitante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificadorAfiliadoPension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoPension" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoEstadoPension"/>
 *         &lt;element name="formaPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaIngreso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="riesgo" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoRiesgo"/>
 *         &lt;element name="tipoPrestacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="empresa" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionBasicaPersonaJuridica"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoDatosPension", propOrder = {
    "identificadorPension",
    "tipoSolicitante",
    "identificadorAfiliadoPension",
    "estadoPension",
    "formaPago",
    "fechaIngreso",
    "riesgo",
    "tipoPrestacion",
    "empresa"
})
public class TipoDatosPension {

    @XmlElement(required = true, nillable = true)
    protected String identificadorPension;
    protected String tipoSolicitante;
    protected String identificadorAfiliadoPension;
    @XmlElement(required = true, nillable = true)
    protected TipoEstadoPension estadoPension;
    protected String formaPago;
    protected String fechaIngreso;
    @XmlElement(required = true, nillable = true)
    protected TipoRiesgo riesgo;
    @XmlElement(required = true, nillable = true)
    protected String tipoPrestacion;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionBasicaPersonaJuridica empresa;

    /**
     * Gets the value of the identificadorPension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorPension() {
        return identificadorPension;
    }

    /**
     * Sets the value of the identificadorPension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorPension(String value) {
        this.identificadorPension = value;
    }

    /**
     * Gets the value of the tipoSolicitante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoSolicitante() {
        return tipoSolicitante;
    }

    /**
     * Sets the value of the tipoSolicitante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoSolicitante(String value) {
        this.tipoSolicitante = value;
    }

    /**
     * Gets the value of the identificadorAfiliadoPension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorAfiliadoPension() {
        return identificadorAfiliadoPension;
    }

    /**
     * Sets the value of the identificadorAfiliadoPension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorAfiliadoPension(String value) {
        this.identificadorAfiliadoPension = value;
    }

    /**
     * Gets the value of the estadoPension property.
     * 
     * @return
     *     possible object is
     *     {@link TipoEstadoPension }
     *     
     */
    public TipoEstadoPension getEstadoPension() {
        return estadoPension;
    }

    /**
     * Sets the value of the estadoPension property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEstadoPension }
     *     
     */
    public void setEstadoPension(TipoEstadoPension value) {
        this.estadoPension = value;
    }

    /**
     * Gets the value of the formaPago property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaPago() {
        return formaPago;
    }

    /**
     * Sets the value of the formaPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaPago(String value) {
        this.formaPago = value;
    }

    /**
     * Gets the value of the fechaIngreso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * Sets the value of the fechaIngreso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaIngreso(String value) {
        this.fechaIngreso = value;
    }

    /**
     * Gets the value of the riesgo property.
     * 
     * @return
     *     possible object is
     *     {@link TipoRiesgo }
     *     
     */
    public TipoRiesgo getRiesgo() {
        return riesgo;
    }

    /**
     * Sets the value of the riesgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoRiesgo }
     *     
     */
    public void setRiesgo(TipoRiesgo value) {
        this.riesgo = value;
    }

    /**
     * Gets the value of the tipoPrestacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPrestacion() {
        return tipoPrestacion;
    }

    /**
     * Sets the value of the tipoPrestacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPrestacion(String value) {
        this.tipoPrestacion = value;
    }

    /**
     * Gets the value of the empresa property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionBasicaPersonaJuridica }
     *     
     */
    public TipoInformacionBasicaPersonaJuridica getEmpresa() {
        return empresa;
    }

    /**
     * Sets the value of the empresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionBasicaPersonaJuridica }
     *     
     */
    public void setEmpresa(TipoInformacionBasicaPersonaJuridica value) {
        this.empresa = value;
    }

}
