
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.comun.TipoRangoFecha;
import co.gov.colpensiones.schemas.indicios.personas.TipoIdentificacionPersona;
import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionBasicaPersonaJuridica;


/**
 * <p>Java class for tipoInformacionPeriodo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionPeriodo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consecutivoTipo7" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoConsecutivo"/>
 *         &lt;element name="tipoCotizante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requerimiento" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionRequerimiento"/>
 *         &lt;element name="identificacionEmpleador" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionPersona" minOccurs="0"/>
 *         &lt;element name="nombreEmpleador" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionBasicaPersonaJuridica" minOccurs="0"/>
 *         &lt;element name="periodoCotizacion" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoRangoFecha"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionPeriodo", propOrder = {
    "consecutivoTipo7",
    "tipoCotizante",
    "requerimiento",
    "identificacionEmpleador",
    "nombreEmpleador",
    "periodoCotizacion"
})
public class TipoInformacionPeriodo {

    @XmlElement(required = true, nillable = true)
    protected TipoConsecutivo consecutivoTipo7;
    @XmlElement(required = true, nillable = true)
    protected String tipoCotizante;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionRequerimiento requerimiento;
    protected TipoIdentificacionPersona identificacionEmpleador;
    protected TipoInformacionBasicaPersonaJuridica nombreEmpleador;
    @XmlElement(required = true, nillable = true)
    protected TipoRangoFecha periodoCotizacion;

    /**
     * Gets the value of the consecutivoTipo7 property.
     * 
     * @return
     *     possible object is
     *     {@link TipoConsecutivo }
     *     
     */
    public TipoConsecutivo getConsecutivoTipo7() {
        return consecutivoTipo7;
    }

    /**
     * Sets the value of the consecutivoTipo7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoConsecutivo }
     *     
     */
    public void setConsecutivoTipo7(TipoConsecutivo value) {
        this.consecutivoTipo7 = value;
    }

    /**
     * Gets the value of the tipoCotizante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCotizante() {
        return tipoCotizante;
    }

    /**
     * Sets the value of the tipoCotizante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCotizante(String value) {
        this.tipoCotizante = value;
    }

    /**
     * Gets the value of the requerimiento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionRequerimiento }
     *     
     */
    public TipoInformacionRequerimiento getRequerimiento() {
        return requerimiento;
    }

    /**
     * Sets the value of the requerimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionRequerimiento }
     *     
     */
    public void setRequerimiento(TipoInformacionRequerimiento value) {
        this.requerimiento = value;
    }

    /**
     * Gets the value of the identificacionEmpleador property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificacionPersona }
     *     
     */
    public TipoIdentificacionPersona getIdentificacionEmpleador() {
        return identificacionEmpleador;
    }

    /**
     * Sets the value of the identificacionEmpleador property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificacionPersona }
     *     
     */
    public void setIdentificacionEmpleador(TipoIdentificacionPersona value) {
        this.identificacionEmpleador = value;
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
     * Gets the value of the periodoCotizacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoRangoFecha }
     *     
     */
    public TipoRangoFecha getPeriodoCotizacion() {
        return periodoCotizacion;
    }

    /**
     * Sets the value of the periodoCotizacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoRangoFecha }
     *     
     */
    public void setPeriodoCotizacion(TipoRangoFecha value) {
        this.periodoCotizacion = value;
    }

}
