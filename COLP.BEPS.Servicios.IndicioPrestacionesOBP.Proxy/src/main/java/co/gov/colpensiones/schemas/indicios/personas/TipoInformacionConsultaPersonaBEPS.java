
package co.gov.colpensiones.schemas.indicios.personas;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.comun.TipoEstado;


/**
 * <p>Java class for tipoInformacionConsultaPersonaBEPS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionConsultaPersonaBEPS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionPersonal" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionGeneralPersonaBEPS"/>
 *         &lt;element name="estadoVinculacion" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoEstado"/>
 *         &lt;element name="estadoViabilidad" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoEstado"/>
 *         &lt;element name="valorIndemnizacion" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="valorRentaVitalicia" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="informacionSisben" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionConsultaPersonaBEPS.informacionSisbenType" minOccurs="0"/>
 *         &lt;element name="fechaVinculacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionConsultaPersonaBEPS", propOrder = {
    "informacionPersonal",
    "estadoVinculacion",
    "estadoViabilidad",
    "valorIndemnizacion",
    "valorRentaVitalicia",
    "informacionSisben",
    "fechaVinculacion"
})
public class TipoInformacionConsultaPersonaBEPS {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionGeneralPersonaBEPS informacionPersonal;
    @XmlElement(required = true, nillable = true)
    protected TipoEstado estadoVinculacion;
    @XmlElement(required = true, nillable = true)
    protected TipoEstado estadoViabilidad;
    @XmlElement(required = true)
    protected BigDecimal valorIndemnizacion;
    @XmlElement(required = true)
    protected BigDecimal valorRentaVitalicia;
    protected TipoInformacionConsultaPersonaBEPSInformacionSisbenType informacionSisben;
    protected String fechaVinculacion;

    /**
     * Gets the value of the informacionPersonal property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionGeneralPersonaBEPS }
     *     
     */
    public TipoInformacionGeneralPersonaBEPS getInformacionPersonal() {
        return informacionPersonal;
    }

    /**
     * Sets the value of the informacionPersonal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionGeneralPersonaBEPS }
     *     
     */
    public void setInformacionPersonal(TipoInformacionGeneralPersonaBEPS value) {
        this.informacionPersonal = value;
    }

    /**
     * Gets the value of the estadoVinculacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoEstado }
     *     
     */
    public TipoEstado getEstadoVinculacion() {
        return estadoVinculacion;
    }

    /**
     * Sets the value of the estadoVinculacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEstado }
     *     
     */
    public void setEstadoVinculacion(TipoEstado value) {
        this.estadoVinculacion = value;
    }

    /**
     * Gets the value of the estadoViabilidad property.
     * 
     * @return
     *     possible object is
     *     {@link TipoEstado }
     *     
     */
    public TipoEstado getEstadoViabilidad() {
        return estadoViabilidad;
    }

    /**
     * Sets the value of the estadoViabilidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEstado }
     *     
     */
    public void setEstadoViabilidad(TipoEstado value) {
        this.estadoViabilidad = value;
    }

    /**
     * Gets the value of the valorIndemnizacion property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorIndemnizacion() {
        return valorIndemnizacion;
    }

    /**
     * Sets the value of the valorIndemnizacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorIndemnizacion(BigDecimal value) {
        this.valorIndemnizacion = value;
    }

    /**
     * Gets the value of the valorRentaVitalicia property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorRentaVitalicia() {
        return valorRentaVitalicia;
    }

    /**
     * Sets the value of the valorRentaVitalicia property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorRentaVitalicia(BigDecimal value) {
        this.valorRentaVitalicia = value;
    }

    /**
     * Gets the value of the informacionSisben property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionConsultaPersonaBEPSInformacionSisbenType }
     *     
     */
    public TipoInformacionConsultaPersonaBEPSInformacionSisbenType getInformacionSisben() {
        return informacionSisben;
    }

    /**
     * Sets the value of the informacionSisben property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionConsultaPersonaBEPSInformacionSisbenType }
     *     
     */
    public void setInformacionSisben(TipoInformacionConsultaPersonaBEPSInformacionSisbenType value) {
        this.informacionSisben = value;
    }

    /**
     * Gets the value of the fechaVinculacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaVinculacion() {
        return fechaVinculacion;
    }

    /**
     * Sets the value of the fechaVinculacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaVinculacion(String value) {
        this.fechaVinculacion = value;
    }

}
