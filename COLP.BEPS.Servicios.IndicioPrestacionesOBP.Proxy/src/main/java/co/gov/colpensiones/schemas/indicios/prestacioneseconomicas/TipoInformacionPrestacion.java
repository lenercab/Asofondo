
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.comun.TipoEstado;
import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionIdentificacionPersonaJuridica;


/**
 * <p>Java class for tipoInformacionPrestacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionPrestacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionEntidadPensionante" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionIdentificacionPersonaJuridica" minOccurs="0"/>
 *         &lt;element name="fechaReconocimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoPrestacion" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoEstado" minOccurs="0"/>
 *         &lt;element name="identificadorPensionado" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoEstado" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoEstado" minOccurs="0"/>
 *         &lt;element name="entidadReporta" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionIdentificacionPersonaJuridica" minOccurs="0"/>
 *         &lt;element name="fechaReporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoSeguro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionPrestacion", propOrder = {
    "informacionEntidadPensionante",
    "fechaReconocimiento",
    "tipoPrestacion",
    "identificadorPensionado",
    "estado",
    "entidadReporta",
    "fechaReporte",
    "tipoSeguro"
})
public class TipoInformacionPrestacion {

    protected TipoInformacionIdentificacionPersonaJuridica informacionEntidadPensionante;
    protected String fechaReconocimiento;
    protected TipoEstado tipoPrestacion;
    protected TipoEstado identificadorPensionado;
    protected TipoEstado estado;
    protected TipoInformacionIdentificacionPersonaJuridica entidadReporta;
    protected String fechaReporte;
    protected String tipoSeguro;

    /**
     * Gets the value of the informacionEntidadPensionante property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionIdentificacionPersonaJuridica }
     *     
     */
    public TipoInformacionIdentificacionPersonaJuridica getInformacionEntidadPensionante() {
        return informacionEntidadPensionante;
    }

    /**
     * Sets the value of the informacionEntidadPensionante property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionIdentificacionPersonaJuridica }
     *     
     */
    public void setInformacionEntidadPensionante(TipoInformacionIdentificacionPersonaJuridica value) {
        this.informacionEntidadPensionante = value;
    }

    /**
     * Gets the value of the fechaReconocimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaReconocimiento() {
        return fechaReconocimiento;
    }

    /**
     * Sets the value of the fechaReconocimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaReconocimiento(String value) {
        this.fechaReconocimiento = value;
    }

    /**
     * Gets the value of the tipoPrestacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoEstado }
     *     
     */
    public TipoEstado getTipoPrestacion() {
        return tipoPrestacion;
    }

    /**
     * Sets the value of the tipoPrestacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEstado }
     *     
     */
    public void setTipoPrestacion(TipoEstado value) {
        this.tipoPrestacion = value;
    }

    /**
     * Gets the value of the identificadorPensionado property.
     * 
     * @return
     *     possible object is
     *     {@link TipoEstado }
     *     
     */
    public TipoEstado getIdentificadorPensionado() {
        return identificadorPensionado;
    }

    /**
     * Sets the value of the identificadorPensionado property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEstado }
     *     
     */
    public void setIdentificadorPensionado(TipoEstado value) {
        this.identificadorPensionado = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link TipoEstado }
     *     
     */
    public TipoEstado getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEstado }
     *     
     */
    public void setEstado(TipoEstado value) {
        this.estado = value;
    }

    /**
     * Gets the value of the entidadReporta property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionIdentificacionPersonaJuridica }
     *     
     */
    public TipoInformacionIdentificacionPersonaJuridica getEntidadReporta() {
        return entidadReporta;
    }

    /**
     * Sets the value of the entidadReporta property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionIdentificacionPersonaJuridica }
     *     
     */
    public void setEntidadReporta(TipoInformacionIdentificacionPersonaJuridica value) {
        this.entidadReporta = value;
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

    /**
     * Gets the value of the tipoSeguro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoSeguro() {
        return tipoSeguro;
    }

    /**
     * Sets the value of the tipoSeguro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoSeguro(String value) {
        this.tipoSeguro = value;
    }

}
