
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.comun.TipoRangoFecha;


/**
 * <p>Java class for tipoInformacionPeriodoCotizacionFondosPrivados complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionPeriodoCotizacionFondosPrivados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consecutivoTipo5" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoConsecutivo"/>
 *         &lt;element name="requerimiento" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionRequerimiento"/>
 *         &lt;element name="rangoCotizacion" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoRangoFecha"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionPeriodoCotizacionFondosPrivados", propOrder = {
    "consecutivoTipo5",
    "requerimiento",
    "rangoCotizacion"
})
public class TipoInformacionPeriodoCotizacionFondosPrivados {

    @XmlElement(required = true, nillable = true)
    protected TipoConsecutivo consecutivoTipo5;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionRequerimiento requerimiento;
    @XmlElement(required = true, nillable = true)
    protected TipoRangoFecha rangoCotizacion;

    /**
     * Gets the value of the consecutivoTipo5 property.
     * 
     * @return
     *     possible object is
     *     {@link TipoConsecutivo }
     *     
     */
    public TipoConsecutivo getConsecutivoTipo5() {
        return consecutivoTipo5;
    }

    /**
     * Sets the value of the consecutivoTipo5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoConsecutivo }
     *     
     */
    public void setConsecutivoTipo5(TipoConsecutivo value) {
        this.consecutivoTipo5 = value;
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
     * Gets the value of the rangoCotizacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoRangoFecha }
     *     
     */
    public TipoRangoFecha getRangoCotizacion() {
        return rangoCotizacion;
    }

    /**
     * Sets the value of the rangoCotizacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoRangoFecha }
     *     
     */
    public void setRangoCotizacion(TipoRangoFecha value) {
        this.rangoCotizacion = value;
    }

}
