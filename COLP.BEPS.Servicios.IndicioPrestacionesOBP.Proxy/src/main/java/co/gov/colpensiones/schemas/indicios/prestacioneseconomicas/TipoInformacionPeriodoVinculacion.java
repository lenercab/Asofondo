
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.comun.TipoRangoFecha;
import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionBasicaPersonaJuridica;


/**
 * <p>Java class for tipoInformacionPeriodoVinculacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionPeriodoVinculacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoNovedad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rangoFechaVinculacion" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoRangoFecha"/>
 *         &lt;element name="cantidadDiasLicencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaVinculacion" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoRangoFecha"/>
 *         &lt;element name="nombreEmpleador" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionBasicaPersonaJuridica"/>
 *         &lt;element name="cargoTrabajador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaInterrupcion" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoRangoFecha" minOccurs="0"/>
 *         &lt;element name="totalDiasInterrupcion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionPeriodoVinculacion", propOrder = {
    "tipoNovedad",
    "rangoFechaVinculacion",
    "cantidadDiasLicencia",
    "fechaVinculacion",
    "nombreEmpleador",
    "cargoTrabajador",
    "fechaInterrupcion",
    "totalDiasInterrupcion"
})
public class TipoInformacionPeriodoVinculacion {

    @XmlElement(required = true, nillable = true)
    protected String tipoNovedad;
    @XmlElement(required = true, nillable = true)
    protected TipoRangoFecha rangoFechaVinculacion;
    protected String cantidadDiasLicencia;
    @XmlElement(required = true, nillable = true)
    protected TipoRangoFecha fechaVinculacion;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionBasicaPersonaJuridica nombreEmpleador;
    @XmlElement(required = true, nillable = true)
    protected String cargoTrabajador;
    protected TipoRangoFecha fechaInterrupcion;
    protected Integer totalDiasInterrupcion;

    /**
     * Gets the value of the tipoNovedad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoNovedad() {
        return tipoNovedad;
    }

    /**
     * Sets the value of the tipoNovedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoNovedad(String value) {
        this.tipoNovedad = value;
    }

    /**
     * Gets the value of the rangoFechaVinculacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoRangoFecha }
     *     
     */
    public TipoRangoFecha getRangoFechaVinculacion() {
        return rangoFechaVinculacion;
    }

    /**
     * Sets the value of the rangoFechaVinculacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoRangoFecha }
     *     
     */
    public void setRangoFechaVinculacion(TipoRangoFecha value) {
        this.rangoFechaVinculacion = value;
    }

    /**
     * Gets the value of the cantidadDiasLicencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidadDiasLicencia() {
        return cantidadDiasLicencia;
    }

    /**
     * Sets the value of the cantidadDiasLicencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidadDiasLicencia(String value) {
        this.cantidadDiasLicencia = value;
    }

    /**
     * Gets the value of the fechaVinculacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoRangoFecha }
     *     
     */
    public TipoRangoFecha getFechaVinculacion() {
        return fechaVinculacion;
    }

    /**
     * Sets the value of the fechaVinculacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoRangoFecha }
     *     
     */
    public void setFechaVinculacion(TipoRangoFecha value) {
        this.fechaVinculacion = value;
    }

    /**
     * Gets the value of the nombreEmpleador property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionBasicaPersonaJuridica }
     *     
     */
    public TipoInformacionBasicaPersonaJuridica getNombreEmpleador() {
        return nombreEmpleador;
    }

    /**
     * Sets the value of the nombreEmpleador property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionBasicaPersonaJuridica }
     *     
     */
    public void setNombreEmpleador(TipoInformacionBasicaPersonaJuridica value) {
        this.nombreEmpleador = value;
    }

    /**
     * Gets the value of the cargoTrabajador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoTrabajador() {
        return cargoTrabajador;
    }

    /**
     * Sets the value of the cargoTrabajador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoTrabajador(String value) {
        this.cargoTrabajador = value;
    }

    /**
     * Gets the value of the fechaInterrupcion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoRangoFecha }
     *     
     */
    public TipoRangoFecha getFechaInterrupcion() {
        return fechaInterrupcion;
    }

    /**
     * Sets the value of the fechaInterrupcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoRangoFecha }
     *     
     */
    public void setFechaInterrupcion(TipoRangoFecha value) {
        this.fechaInterrupcion = value;
    }

    /**
     * Gets the value of the totalDiasInterrupcion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalDiasInterrupcion() {
        return totalDiasInterrupcion;
    }

    /**
     * Sets the value of the totalDiasInterrupcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalDiasInterrupcion(Integer value) {
        this.totalDiasInterrupcion = value;
    }

}
