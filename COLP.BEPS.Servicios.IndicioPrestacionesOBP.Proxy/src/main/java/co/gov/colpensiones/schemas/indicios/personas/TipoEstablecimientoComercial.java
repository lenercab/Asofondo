
package co.gov.colpensiones.schemas.indicios.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoEstablecimientoComercial complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoEstablecimientoComercial">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombreComercial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sigla" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nit" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoNIT"/>
 *         &lt;element name="ubicacionComercial" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionUbicacionComercial"/>
 *         &lt;element name="ubicacionFiscal" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionUbicacionFiscal"/>
 *         &lt;element name="estado" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoEstadoComercio"/>
 *         &lt;element name="tipoOrganizacionEconomiaSolidaria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEstablecimientoComercial", propOrder = {
    "razonSocial",
    "nombreComercial",
    "sigla",
    "nit",
    "ubicacionComercial",
    "ubicacionFiscal",
    "estado",
    "tipoOrganizacionEconomiaSolidaria"
})
public class TipoEstablecimientoComercial {

    @XmlElement(required = true, nillable = true)
    protected String razonSocial;
    @XmlElement(required = true, nillable = true)
    protected String nombreComercial;
    @XmlElement(required = true, nillable = true)
    protected String sigla;
    @XmlElement(required = true, nillable = true)
    protected TipoNIT nit;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionUbicacionComercial ubicacionComercial;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionUbicacionFiscal ubicacionFiscal;
    @XmlElement(required = true, nillable = true)
    protected TipoEstadoComercio estado;
    @XmlElement(required = true, nillable = true)
    protected String tipoOrganizacionEconomiaSolidaria;

    /**
     * Gets the value of the razonSocial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * Sets the value of the razonSocial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocial(String value) {
        this.razonSocial = value;
    }

    /**
     * Gets the value of the nombreComercial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreComercial() {
        return nombreComercial;
    }

    /**
     * Sets the value of the nombreComercial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreComercial(String value) {
        this.nombreComercial = value;
    }

    /**
     * Gets the value of the sigla property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * Sets the value of the sigla property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigla(String value) {
        this.sigla = value;
    }

    /**
     * Gets the value of the nit property.
     * 
     * @return
     *     possible object is
     *     {@link TipoNIT }
     *     
     */
    public TipoNIT getNit() {
        return nit;
    }

    /**
     * Sets the value of the nit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoNIT }
     *     
     */
    public void setNit(TipoNIT value) {
        this.nit = value;
    }

    /**
     * Gets the value of the ubicacionComercial property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionUbicacionComercial }
     *     
     */
    public TipoInformacionUbicacionComercial getUbicacionComercial() {
        return ubicacionComercial;
    }

    /**
     * Sets the value of the ubicacionComercial property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionUbicacionComercial }
     *     
     */
    public void setUbicacionComercial(TipoInformacionUbicacionComercial value) {
        this.ubicacionComercial = value;
    }

    /**
     * Gets the value of the ubicacionFiscal property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionUbicacionFiscal }
     *     
     */
    public TipoInformacionUbicacionFiscal getUbicacionFiscal() {
        return ubicacionFiscal;
    }

    /**
     * Sets the value of the ubicacionFiscal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionUbicacionFiscal }
     *     
     */
    public void setUbicacionFiscal(TipoInformacionUbicacionFiscal value) {
        this.ubicacionFiscal = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link TipoEstadoComercio }
     *     
     */
    public TipoEstadoComercio getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEstadoComercio }
     *     
     */
    public void setEstado(TipoEstadoComercio value) {
        this.estado = value;
    }

    /**
     * Gets the value of the tipoOrganizacionEconomiaSolidaria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoOrganizacionEconomiaSolidaria() {
        return tipoOrganizacionEconomiaSolidaria;
    }

    /**
     * Sets the value of the tipoOrganizacionEconomiaSolidaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoOrganizacionEconomiaSolidaria(String value) {
        this.tipoOrganizacionEconomiaSolidaria = value;
    }

}
