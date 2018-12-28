
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.comun.TipoRangoFecha;


/**
 * <p>Java class for tipoInformacionDatoErradoPago complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionDatoErradoPago">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consecutivoTipo6" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoConsecutivo"/>
 *         &lt;element name="tipoDatoErrado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="referenciaPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datoErrado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datoCorrecto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="periodoCotizacion" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoRangoFecha" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionDatoErradoPago", propOrder = {
    "consecutivoTipo6",
    "tipoDatoErrado",
    "referenciaPago",
    "datoErrado",
    "datoCorrecto",
    "periodoCotizacion"
})
public class TipoInformacionDatoErradoPago {

    @XmlElement(required = true, nillable = true)
    protected TipoConsecutivo consecutivoTipo6;
    @XmlElement(required = true, nillable = true)
    protected String tipoDatoErrado;
    protected String referenciaPago;
    protected String datoErrado;
    protected String datoCorrecto;
    protected TipoRangoFecha periodoCotizacion;

    /**
     * Gets the value of the consecutivoTipo6 property.
     * 
     * @return
     *     possible object is
     *     {@link TipoConsecutivo }
     *     
     */
    public TipoConsecutivo getConsecutivoTipo6() {
        return consecutivoTipo6;
    }

    /**
     * Sets the value of the consecutivoTipo6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoConsecutivo }
     *     
     */
    public void setConsecutivoTipo6(TipoConsecutivo value) {
        this.consecutivoTipo6 = value;
    }

    /**
     * Gets the value of the tipoDatoErrado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDatoErrado() {
        return tipoDatoErrado;
    }

    /**
     * Sets the value of the tipoDatoErrado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDatoErrado(String value) {
        this.tipoDatoErrado = value;
    }

    /**
     * Gets the value of the referenciaPago property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaPago() {
        return referenciaPago;
    }

    /**
     * Sets the value of the referenciaPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaPago(String value) {
        this.referenciaPago = value;
    }

    /**
     * Gets the value of the datoErrado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoErrado() {
        return datoErrado;
    }

    /**
     * Sets the value of the datoErrado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoErrado(String value) {
        this.datoErrado = value;
    }

    /**
     * Gets the value of the datoCorrecto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoCorrecto() {
        return datoCorrecto;
    }

    /**
     * Sets the value of the datoCorrecto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoCorrecto(String value) {
        this.datoCorrecto = value;
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
