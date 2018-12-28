
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionIdentificacionPersonaJuridica;


/**
 * <p>Java class for tipoInformacionOtraAfiliacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionOtraAfiliacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entidadAfiliacion" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionIdentificacionPersonaJuridica" minOccurs="0"/>
 *         &lt;element name="fechaAfiliacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaPrimeraAfiliacionRAI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaReporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionOtraAfiliacion", propOrder = {
    "entidadAfiliacion",
    "fechaAfiliacion",
    "fechaPrimeraAfiliacionRAI",
    "fechaReporte"
})
public class TipoInformacionOtraAfiliacion {

    protected TipoInformacionIdentificacionPersonaJuridica entidadAfiliacion;
    protected String fechaAfiliacion;
    protected String fechaPrimeraAfiliacionRAI;
    protected String fechaReporte;

    /**
     * Gets the value of the entidadAfiliacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionIdentificacionPersonaJuridica }
     *     
     */
    public TipoInformacionIdentificacionPersonaJuridica getEntidadAfiliacion() {
        return entidadAfiliacion;
    }

    /**
     * Sets the value of the entidadAfiliacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionIdentificacionPersonaJuridica }
     *     
     */
    public void setEntidadAfiliacion(TipoInformacionIdentificacionPersonaJuridica value) {
        this.entidadAfiliacion = value;
    }

    /**
     * Gets the value of the fechaAfiliacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaAfiliacion() {
        return fechaAfiliacion;
    }

    /**
     * Sets the value of the fechaAfiliacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaAfiliacion(String value) {
        this.fechaAfiliacion = value;
    }

    /**
     * Gets the value of the fechaPrimeraAfiliacionRAI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPrimeraAfiliacionRAI() {
        return fechaPrimeraAfiliacionRAI;
    }

    /**
     * Sets the value of the fechaPrimeraAfiliacionRAI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPrimeraAfiliacionRAI(String value) {
        this.fechaPrimeraAfiliacionRAI = value;
    }

    /**
     * Gets the value of the fechaReporte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaReporte() {
        return fechaReporte;
    }

    /**
     * Sets the value of the fechaReporte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaReporte(String value) {
        this.fechaReporte = value;
    }

}
