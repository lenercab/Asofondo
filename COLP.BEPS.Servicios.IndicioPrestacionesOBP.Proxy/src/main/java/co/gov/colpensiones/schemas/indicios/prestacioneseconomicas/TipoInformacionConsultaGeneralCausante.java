
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionBasicaIdentificacionPersona;


/**
 * <p>Java class for tipoInformacionConsultaGeneralCausante complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionConsultaGeneralCausante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionCausante" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionBasicaIdentificacionPersona" minOccurs="0"/>
 *         &lt;element name="informacionOtrasAfiliaciones" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionOtrasAfiliaciones" minOccurs="0"/>
 *         &lt;element name="informacionPrestaciones" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionPrestaciones" minOccurs="0"/>
 *         &lt;element name="informacionIndicioVinculacionesLaborales" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionIndiciosVinculacionesLaborales" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionConsultaGeneralCausante", propOrder = {
    "informacionCausante",
    "informacionOtrasAfiliaciones",
    "informacionPrestaciones",
    "informacionIndicioVinculacionesLaborales"
})
public class TipoInformacionConsultaGeneralCausante {

    protected TipoInformacionBasicaIdentificacionPersona informacionCausante;
    protected TipoInformacionOtrasAfiliaciones informacionOtrasAfiliaciones;
    protected TipoInformacionPrestaciones informacionPrestaciones;
    protected TipoInformacionIndiciosVinculacionesLaborales informacionIndicioVinculacionesLaborales;

    /**
     * Gets the value of the informacionCausante property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionBasicaIdentificacionPersona }
     *     
     */
    public TipoInformacionBasicaIdentificacionPersona getInformacionCausante() {
        return informacionCausante;
    }

    /**
     * Sets the value of the informacionCausante property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionBasicaIdentificacionPersona }
     *     
     */
    public void setInformacionCausante(TipoInformacionBasicaIdentificacionPersona value) {
        this.informacionCausante = value;
    }

    /**
     * Gets the value of the informacionOtrasAfiliaciones property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionOtrasAfiliaciones }
     *     
     */
    public TipoInformacionOtrasAfiliaciones getInformacionOtrasAfiliaciones() {
        return informacionOtrasAfiliaciones;
    }

    /**
     * Sets the value of the informacionOtrasAfiliaciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionOtrasAfiliaciones }
     *     
     */
    public void setInformacionOtrasAfiliaciones(TipoInformacionOtrasAfiliaciones value) {
        this.informacionOtrasAfiliaciones = value;
    }

    /**
     * Gets the value of the informacionPrestaciones property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionPrestaciones }
     *     
     */
    public TipoInformacionPrestaciones getInformacionPrestaciones() {
        return informacionPrestaciones;
    }

    /**
     * Sets the value of the informacionPrestaciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionPrestaciones }
     *     
     */
    public void setInformacionPrestaciones(TipoInformacionPrestaciones value) {
        this.informacionPrestaciones = value;
    }

    /**
     * Gets the value of the informacionIndicioVinculacionesLaborales property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionIndiciosVinculacionesLaborales }
     *     
     */
    public TipoInformacionIndiciosVinculacionesLaborales getInformacionIndicioVinculacionesLaborales() {
        return informacionIndicioVinculacionesLaborales;
    }

    /**
     * Sets the value of the informacionIndicioVinculacionesLaborales property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionIndiciosVinculacionesLaborales }
     *     
     */
    public void setInformacionIndicioVinculacionesLaborales(TipoInformacionIndiciosVinculacionesLaborales value) {
        this.informacionIndicioVinculacionesLaborales = value;
    }

}
