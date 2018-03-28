
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.comun.TipoRangoFecha;
import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionIdentificacionPersonaJuridica;


/**
 * <p>Java class for tipoInformacionPeriodoAporte complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionPeriodoAporte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rangoFechaAporte" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoRangoFecha"/>
 *         &lt;element name="indicadorDescuentoSeguridad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entidadPago" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionIdentificacionPersonaJuridica"/>
 *         &lt;element name="entidadResponsable" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionIdentificacionPersonaJuridica" minOccurs="0"/>
 *         &lt;element name="informacionCajaFondo" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionIdentificacionPersonaJuridica"/>
 *         &lt;element name="indicadorPeriodoACargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionPeriodoAporte", propOrder = {
    "rangoFechaAporte",
    "indicadorDescuentoSeguridad",
    "entidadPago",
    "entidadResponsable",
    "informacionCajaFondo",
    "indicadorPeriodoACargo"
})
public class TipoInformacionPeriodoAporte {

    @XmlElement(required = true, nillable = true)
    protected TipoRangoFecha rangoFechaAporte;
    protected String indicadorDescuentoSeguridad;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionIdentificacionPersonaJuridica entidadPago;
    protected TipoInformacionIdentificacionPersonaJuridica entidadResponsable;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionIdentificacionPersonaJuridica informacionCajaFondo;
    protected String indicadorPeriodoACargo;

    /**
     * Gets the value of the rangoFechaAporte property.
     * 
     * @return
     *     possible object is
     *     {@link TipoRangoFecha }
     *     
     */
    public TipoRangoFecha getRangoFechaAporte() {
        return rangoFechaAporte;
    }

    /**
     * Sets the value of the rangoFechaAporte property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoRangoFecha }
     *     
     */
    public void setRangoFechaAporte(TipoRangoFecha value) {
        this.rangoFechaAporte = value;
    }

    /**
     * Gets the value of the indicadorDescuentoSeguridad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorDescuentoSeguridad() {
        return indicadorDescuentoSeguridad;
    }

    /**
     * Sets the value of the indicadorDescuentoSeguridad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorDescuentoSeguridad(String value) {
        this.indicadorDescuentoSeguridad = value;
    }

    /**
     * Gets the value of the entidadPago property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionIdentificacionPersonaJuridica }
     *     
     */
    public TipoInformacionIdentificacionPersonaJuridica getEntidadPago() {
        return entidadPago;
    }

    /**
     * Sets the value of the entidadPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionIdentificacionPersonaJuridica }
     *     
     */
    public void setEntidadPago(TipoInformacionIdentificacionPersonaJuridica value) {
        this.entidadPago = value;
    }

    /**
     * Gets the value of the entidadResponsable property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionIdentificacionPersonaJuridica }
     *     
     */
    public TipoInformacionIdentificacionPersonaJuridica getEntidadResponsable() {
        return entidadResponsable;
    }

    /**
     * Sets the value of the entidadResponsable property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionIdentificacionPersonaJuridica }
     *     
     */
    public void setEntidadResponsable(TipoInformacionIdentificacionPersonaJuridica value) {
        this.entidadResponsable = value;
    }

    /**
     * Gets the value of the informacionCajaFondo property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionIdentificacionPersonaJuridica }
     *     
     */
    public TipoInformacionIdentificacionPersonaJuridica getInformacionCajaFondo() {
        return informacionCajaFondo;
    }

    /**
     * Sets the value of the informacionCajaFondo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionIdentificacionPersonaJuridica }
     *     
     */
    public void setInformacionCajaFondo(TipoInformacionIdentificacionPersonaJuridica value) {
        this.informacionCajaFondo = value;
    }

    /**
     * Gets the value of the indicadorPeriodoACargo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorPeriodoACargo() {
        return indicadorPeriodoACargo;
    }

    /**
     * Sets the value of the indicadorPeriodoACargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorPeriodoACargo(String value) {
        this.indicadorPeriodoACargo = value;
    }

}
