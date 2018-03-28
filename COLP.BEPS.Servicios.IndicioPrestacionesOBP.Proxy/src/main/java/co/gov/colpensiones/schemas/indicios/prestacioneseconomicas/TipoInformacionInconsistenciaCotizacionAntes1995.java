
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionBasicaPersonaJuridica;
import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionUbicacionPersona;
import co.gov.colpensiones.schemas.indicios.personas.TipoNIT;


/**
 * <p>Java class for tipoInformacionInconsistenciaCotizacionAntes1995 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionInconsistenciaCotizacionAntes1995">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombreEmpresa" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionBasicaPersonaJuridica"/>
 *         &lt;element name="numeroPatronal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombrePropietario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nit" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoNIT" minOccurs="0"/>
 *         &lt;element name="ubicacion" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionUbicacionPersona" minOccurs="0"/>
 *         &lt;element name="periodosCotizacion" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionPeriodosCotizacion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionInconsistenciaCotizacionAntes1995", propOrder = {
    "nombreEmpresa",
    "numeroPatronal",
    "nombrePropietario",
    "nit",
    "ubicacion",
    "periodosCotizacion"
})
public class TipoInformacionInconsistenciaCotizacionAntes1995 {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionBasicaPersonaJuridica nombreEmpresa;
    protected String numeroPatronal;
    protected String nombrePropietario;
    protected TipoNIT nit;
    protected TipoInformacionUbicacionPersona ubicacion;
    protected TipoInformacionPeriodosCotizacion periodosCotizacion;

    /**
     * Gets the value of the nombreEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionBasicaPersonaJuridica }
     *     
     */
    public TipoInformacionBasicaPersonaJuridica getNombreEmpresa() {
        return nombreEmpresa;
    }

    /**
     * Sets the value of the nombreEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionBasicaPersonaJuridica }
     *     
     */
    public void setNombreEmpresa(TipoInformacionBasicaPersonaJuridica value) {
        this.nombreEmpresa = value;
    }

    /**
     * Gets the value of the numeroPatronal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroPatronal() {
        return numeroPatronal;
    }

    /**
     * Sets the value of the numeroPatronal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroPatronal(String value) {
        this.numeroPatronal = value;
    }

    /**
     * Gets the value of the nombrePropietario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePropietario() {
        return nombrePropietario;
    }

    /**
     * Sets the value of the nombrePropietario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePropietario(String value) {
        this.nombrePropietario = value;
    }

    /**
     * Gets the value of the nit property.
     * 
     * @return
     *     possible object is
     *     {@link TipoNIT }
     *     
     */
    public TipoNIT getNit() {
        return nit;
    }

    /**
     * Sets the value of the nit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoNIT }
     *     
     */
    public void setNit(TipoNIT value) {
        this.nit = value;
    }

    /**
     * Gets the value of the ubicacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionUbicacionPersona }
     *     
     */
    public TipoInformacionUbicacionPersona getUbicacion() {
        return ubicacion;
    }

    /**
     * Sets the value of the ubicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionUbicacionPersona }
     *     
     */
    public void setUbicacion(TipoInformacionUbicacionPersona value) {
        this.ubicacion = value;
    }

    /**
     * Gets the value of the periodosCotizacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionPeriodosCotizacion }
     *     
     */
    public TipoInformacionPeriodosCotizacion getPeriodosCotizacion() {
        return periodosCotizacion;
    }

    /**
     * Sets the value of the periodosCotizacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionPeriodosCotizacion }
     *     
     */
    public void setPeriodosCotizacion(TipoInformacionPeriodosCotizacion value) {
        this.periodosCotizacion = value;
    }

}
