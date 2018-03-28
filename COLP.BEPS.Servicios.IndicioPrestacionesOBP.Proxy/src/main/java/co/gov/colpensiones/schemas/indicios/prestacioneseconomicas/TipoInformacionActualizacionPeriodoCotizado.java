
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionBasicaPersonaJuridica;


/**
 * <p>Java class for tipoInformacionActualizacionPeriodoCotizado complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionActualizacionPeriodoCotizado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombreFondo" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionBasicaPersonaJuridica"/>
 *         &lt;element name="rangoCotizacion" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionPeriodosCotizacionFondosPrivados" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionActualizacionPeriodoCotizado", propOrder = {
    "nombreFondo",
    "rangoCotizacion"
})
public class TipoInformacionActualizacionPeriodoCotizado {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionBasicaPersonaJuridica nombreFondo;
    protected TipoInformacionPeriodosCotizacionFondosPrivados rangoCotizacion;

    /**
     * Gets the value of the nombreFondo property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionBasicaPersonaJuridica }
     *     
     */
    public TipoInformacionBasicaPersonaJuridica getNombreFondo() {
        return nombreFondo;
    }

    /**
     * Sets the value of the nombreFondo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionBasicaPersonaJuridica }
     *     
     */
    public void setNombreFondo(TipoInformacionBasicaPersonaJuridica value) {
        this.nombreFondo = value;
    }

    /**
     * Gets the value of the rangoCotizacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionPeriodosCotizacionFondosPrivados }
     *     
     */
    public TipoInformacionPeriodosCotizacionFondosPrivados getRangoCotizacion() {
        return rangoCotizacion;
    }

    /**
     * Sets the value of the rangoCotizacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionPeriodosCotizacionFondosPrivados }
     *     
     */
    public void setRangoCotizacion(TipoInformacionPeriodosCotizacionFondosPrivados value) {
        this.rangoCotizacion = value;
    }

}
