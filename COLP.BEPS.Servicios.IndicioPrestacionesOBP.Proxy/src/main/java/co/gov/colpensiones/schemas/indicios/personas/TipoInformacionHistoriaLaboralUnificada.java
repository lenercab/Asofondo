
package co.gov.colpensiones.schemas.indicios.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionHistoriaLaboralUnificada complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionHistoriaLaboralUnificada">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionAfiliado" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionGeneralAfiliadoHistoriaLaboral"/>
 *         &lt;element name="informacionPeriodosCotizados" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionGeneralPeriodosCotizacion"/>
 *         &lt;element name="informacionPagos" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionPagosPeriodosCotizacion"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionHistoriaLaboralUnificada", propOrder = {
    "informacionAfiliado",
    "informacionPeriodosCotizados",
    "informacionPagos"
})
public class TipoInformacionHistoriaLaboralUnificada {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionGeneralAfiliadoHistoriaLaboral informacionAfiliado;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionGeneralPeriodosCotizacion informacionPeriodosCotizados;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionPagosPeriodosCotizacion informacionPagos;

    /**
     * Gets the value of the informacionAfiliado property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionGeneralAfiliadoHistoriaLaboral }
     *     
     */
    public TipoInformacionGeneralAfiliadoHistoriaLaboral getInformacionAfiliado() {
        return informacionAfiliado;
    }

    /**
     * Sets the value of the informacionAfiliado property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionGeneralAfiliadoHistoriaLaboral }
     *     
     */
    public void setInformacionAfiliado(TipoInformacionGeneralAfiliadoHistoriaLaboral value) {
        this.informacionAfiliado = value;
    }

    /**
     * Gets the value of the informacionPeriodosCotizados property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionGeneralPeriodosCotizacion }
     *     
     */
    public TipoInformacionGeneralPeriodosCotizacion getInformacionPeriodosCotizados() {
        return informacionPeriodosCotizados;
    }

    /**
     * Sets the value of the informacionPeriodosCotizados property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionGeneralPeriodosCotizacion }
     *     
     */
    public void setInformacionPeriodosCotizados(TipoInformacionGeneralPeriodosCotizacion value) {
        this.informacionPeriodosCotizados = value;
    }

    /**
     * Gets the value of the informacionPagos property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionPagosPeriodosCotizacion }
     *     
     */
    public TipoInformacionPagosPeriodosCotizacion getInformacionPagos() {
        return informacionPagos;
    }

    /**
     * Sets the value of the informacionPagos property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionPagosPeriodosCotizacion }
     *     
     */
    public void setInformacionPagos(TipoInformacionPagosPeriodosCotizacion value) {
        this.informacionPagos = value;
    }

}
