
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.comun.TipoEstado;
import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionIdentificacionPersonaJuridica;


/**
 * <p>Java class for tipoPrestacionReconocimiento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoPrestacionReconocimiento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="estado" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoEstado"/>
 *         &lt;element name="tipoPrestacion" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoEstado"/>
 *         &lt;element name="resolucionReconocimiento" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoResolucionPrestacion" minOccurs="0"/>
 *         &lt;element name="fechaRadicacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entidadReporta" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionIdentificacionPersonaJuridica"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoPrestacionReconocimiento", propOrder = {
    "estado",
    "tipoPrestacion",
    "resolucionReconocimiento",
    "fechaRadicacion",
    "entidadReporta"
})
public class TipoPrestacionReconocimiento {

    @XmlElement(required = true, nillable = true)
    protected TipoEstado estado;
    @XmlElement(required = true, nillable = true)
    protected TipoEstado tipoPrestacion;
    protected TipoResolucionPrestacion resolucionReconocimiento;
    @XmlElement(required = true, nillable = true)
    protected String fechaRadicacion;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionIdentificacionPersonaJuridica entidadReporta;

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
     * Gets the value of the resolucionReconocimiento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoResolucionPrestacion }
     *     
     */
    public TipoResolucionPrestacion getResolucionReconocimiento() {
        return resolucionReconocimiento;
    }

    /**
     * Sets the value of the resolucionReconocimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoResolucionPrestacion }
     *     
     */
    public void setResolucionReconocimiento(TipoResolucionPrestacion value) {
        this.resolucionReconocimiento = value;
    }

    /**
     * Gets the value of the fechaRadicacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaRadicacion() {
        return fechaRadicacion;
    }

    /**
     * Sets the value of the fechaRadicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaRadicacion(String value) {
        this.fechaRadicacion = value;
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

}
