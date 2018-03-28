
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionIdentificacionPersonaJuridica;


/**
 * <p>Java class for tipoInformacionFormato2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionFormato2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionBasica" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionCalculosFechaBase"/>
 *         &lt;element name="indicadorPeriodoAsumido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cajaFondo" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionIdentificacionPersonaJuridica" minOccurs="0"/>
 *         &lt;element name="entidadResponsable" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionIdentificacionPersonaJuridica" minOccurs="0"/>
 *         &lt;element name="informacionCalculosBase" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionCalculoBase"/>
 *         &lt;element name="informacionFactoresSalariales" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoFactoresCalculoSalario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionFormato2", propOrder = {
    "informacionBasica",
    "indicadorPeriodoAsumido",
    "cajaFondo",
    "entidadResponsable",
    "informacionCalculosBase",
    "informacionFactoresSalariales"
})
public class TipoInformacionFormato2 {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionCalculosFechaBase informacionBasica;
    protected String indicadorPeriodoAsumido;
    protected TipoInformacionIdentificacionPersonaJuridica cajaFondo;
    protected TipoInformacionIdentificacionPersonaJuridica entidadResponsable;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionCalculoBase informacionCalculosBase;
    protected TipoFactoresCalculoSalario informacionFactoresSalariales;

    /**
     * Gets the value of the informacionBasica property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionCalculosFechaBase }
     *     
     */
    public TipoInformacionCalculosFechaBase getInformacionBasica() {
        return informacionBasica;
    }

    /**
     * Sets the value of the informacionBasica property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionCalculosFechaBase }
     *     
     */
    public void setInformacionBasica(TipoInformacionCalculosFechaBase value) {
        this.informacionBasica = value;
    }

    /**
     * Gets the value of the indicadorPeriodoAsumido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorPeriodoAsumido() {
        return indicadorPeriodoAsumido;
    }

    /**
     * Sets the value of the indicadorPeriodoAsumido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorPeriodoAsumido(String value) {
        this.indicadorPeriodoAsumido = value;
    }

    /**
     * Gets the value of the cajaFondo property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionIdentificacionPersonaJuridica }
     *     
     */
    public TipoInformacionIdentificacionPersonaJuridica getCajaFondo() {
        return cajaFondo;
    }

    /**
     * Sets the value of the cajaFondo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionIdentificacionPersonaJuridica }
     *     
     */
    public void setCajaFondo(TipoInformacionIdentificacionPersonaJuridica value) {
        this.cajaFondo = value;
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
     * Gets the value of the informacionCalculosBase property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionCalculoBase }
     *     
     */
    public TipoInformacionCalculoBase getInformacionCalculosBase() {
        return informacionCalculosBase;
    }

    /**
     * Sets the value of the informacionCalculosBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionCalculoBase }
     *     
     */
    public void setInformacionCalculosBase(TipoInformacionCalculoBase value) {
        this.informacionCalculosBase = value;
    }

    /**
     * Gets the value of the informacionFactoresSalariales property.
     * 
     * @return
     *     possible object is
     *     {@link TipoFactoresCalculoSalario }
     *     
     */
    public TipoFactoresCalculoSalario getInformacionFactoresSalariales() {
        return informacionFactoresSalariales;
    }

    /**
     * Sets the value of the informacionFactoresSalariales property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoFactoresCalculoSalario }
     *     
     */
    public void setInformacionFactoresSalariales(TipoFactoresCalculoSalario value) {
        this.informacionFactoresSalariales = value;
    }

}
