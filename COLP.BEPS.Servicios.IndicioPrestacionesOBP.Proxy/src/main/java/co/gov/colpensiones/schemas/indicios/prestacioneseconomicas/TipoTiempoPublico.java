
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionGeneralPersonaJuridica;
import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionIdentificacionPersonaJuridica;


/**
 * <p>Java class for tipoTiempoPublico complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoTiempoPublico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="empleador" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionIdentificacionPersonaJuridica"/>
 *         &lt;element name="entidadCertificadora" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionGeneralPersonaJuridica"/>
 *         &lt;element name="informacionVinculacion" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionPeriodosVinculacion"/>
 *         &lt;element name="informacionAportes" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionPeriodosAportes"/>
 *         &lt;element name="informacionCalculosBase" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionCalculoBase"/>
 *         &lt;element name="informacionFactorSalario" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoFactoresCalculoSalario" minOccurs="0"/>
 *         &lt;element name="informacionFormatos" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionFormatos"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoTiempoPublico", propOrder = {
    "empleador",
    "entidadCertificadora",
    "informacionVinculacion",
    "informacionAportes",
    "informacionCalculosBase",
    "informacionFactorSalario",
    "informacionFormatos"
})
public class TipoTiempoPublico {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionIdentificacionPersonaJuridica empleador;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionGeneralPersonaJuridica entidadCertificadora;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionPeriodosVinculacion informacionVinculacion;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionPeriodosAportes informacionAportes;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionCalculoBase informacionCalculosBase;
    protected TipoFactoresCalculoSalario informacionFactorSalario;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionFormatos informacionFormatos;

    /**
     * Gets the value of the empleador property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionIdentificacionPersonaJuridica }
     *     
     */
    public TipoInformacionIdentificacionPersonaJuridica getEmpleador() {
        return empleador;
    }

    /**
     * Sets the value of the empleador property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionIdentificacionPersonaJuridica }
     *     
     */
    public void setEmpleador(TipoInformacionIdentificacionPersonaJuridica value) {
        this.empleador = value;
    }

    /**
     * Gets the value of the entidadCertificadora property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionGeneralPersonaJuridica }
     *     
     */
    public TipoInformacionGeneralPersonaJuridica getEntidadCertificadora() {
        return entidadCertificadora;
    }

    /**
     * Sets the value of the entidadCertificadora property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionGeneralPersonaJuridica }
     *     
     */
    public void setEntidadCertificadora(TipoInformacionGeneralPersonaJuridica value) {
        this.entidadCertificadora = value;
    }

    /**
     * Gets the value of the informacionVinculacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionPeriodosVinculacion }
     *     
     */
    public TipoInformacionPeriodosVinculacion getInformacionVinculacion() {
        return informacionVinculacion;
    }

    /**
     * Sets the value of the informacionVinculacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionPeriodosVinculacion }
     *     
     */
    public void setInformacionVinculacion(TipoInformacionPeriodosVinculacion value) {
        this.informacionVinculacion = value;
    }

    /**
     * Gets the value of the informacionAportes property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionPeriodosAportes }
     *     
     */
    public TipoInformacionPeriodosAportes getInformacionAportes() {
        return informacionAportes;
    }

    /**
     * Sets the value of the informacionAportes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionPeriodosAportes }
     *     
     */
    public void setInformacionAportes(TipoInformacionPeriodosAportes value) {
        this.informacionAportes = value;
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
     * Gets the value of the informacionFactorSalario property.
     * 
     * @return
     *     possible object is
     *     {@link TipoFactoresCalculoSalario }
     *     
     */
    public TipoFactoresCalculoSalario getInformacionFactorSalario() {
        return informacionFactorSalario;
    }

    /**
     * Sets the value of the informacionFactorSalario property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoFactoresCalculoSalario }
     *     
     */
    public void setInformacionFactorSalario(TipoFactoresCalculoSalario value) {
        this.informacionFactorSalario = value;
    }

    /**
     * Gets the value of the informacionFormatos property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionFormatos }
     *     
     */
    public TipoInformacionFormatos getInformacionFormatos() {
        return informacionFormatos;
    }

    /**
     * Sets the value of the informacionFormatos property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionFormatos }
     *     
     */
    public void setInformacionFormatos(TipoInformacionFormatos value) {
        this.informacionFormatos = value;
    }

}
