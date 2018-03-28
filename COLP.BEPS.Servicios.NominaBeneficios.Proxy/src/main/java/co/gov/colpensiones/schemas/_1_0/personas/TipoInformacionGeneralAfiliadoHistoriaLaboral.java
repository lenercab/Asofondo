
package co.gov.colpensiones.schemas._1_0.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionGeneralAfiliadoHistoriaLaboral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionGeneralAfiliadoHistoriaLaboral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacion" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionPersona"/>
 *         &lt;element name="nombreCompleto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sectorTerritorialResidencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="correosElectronicos" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoDireccionesCorreoElectronico" minOccurs="0"/>
 *         &lt;element name="informacionAfiliacion" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionGeneralAfiliadoHistoriaLaboral.informacionAfiliacionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionGeneralAfiliadoHistoriaLaboral", propOrder = {
    "identificacion",
    "nombreCompleto",
    "fechaNacimiento",
    "direccion",
    "sectorTerritorialResidencia",
    "correosElectronicos",
    "informacionAfiliacion"
})
public class TipoInformacionGeneralAfiliadoHistoriaLaboral {

    @XmlElement(required = true, nillable = true)
    protected TipoIdentificacionPersona identificacion;
    @XmlElement(required = true, nillable = true)
    protected String nombreCompleto;
    @XmlElement(required = true, nillable = true)
    protected String fechaNacimiento;
    @XmlElement(required = true, nillable = true)
    protected String direccion;
    @XmlElement(required = true, nillable = true)
    protected String sectorTerritorialResidencia;
    protected TipoDireccionesCorreoElectronico correosElectronicos;
    protected TipoInformacionGeneralAfiliadoHistoriaLaboralInformacionAfiliacionType informacionAfiliacion;

    /**
     * Gets the value of the identificacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificacionPersona }
     *     
     */
    public TipoIdentificacionPersona getIdentificacion() {
        return identificacion;
    }

    /**
     * Sets the value of the identificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificacionPersona }
     *     
     */
    public void setIdentificacion(TipoIdentificacionPersona value) {
        this.identificacion = value;
    }

    /**
     * Gets the value of the nombreCompleto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * Sets the value of the nombreCompleto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCompleto(String value) {
        this.nombreCompleto = value;
    }

    /**
     * Gets the value of the fechaNacimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Sets the value of the fechaNacimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacimiento(String value) {
        this.fechaNacimiento = value;
    }

    /**
     * Gets the value of the direccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Sets the value of the direccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Gets the value of the sectorTerritorialResidencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectorTerritorialResidencia() {
        return sectorTerritorialResidencia;
    }

    /**
     * Sets the value of the sectorTerritorialResidencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectorTerritorialResidencia(String value) {
        this.sectorTerritorialResidencia = value;
    }

    /**
     * Gets the value of the correosElectronicos property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDireccionesCorreoElectronico }
     *     
     */
    public TipoDireccionesCorreoElectronico getCorreosElectronicos() {
        return correosElectronicos;
    }

    /**
     * Sets the value of the correosElectronicos property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDireccionesCorreoElectronico }
     *     
     */
    public void setCorreosElectronicos(TipoDireccionesCorreoElectronico value) {
        this.correosElectronicos = value;
    }

    /**
     * Gets the value of the informacionAfiliacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionGeneralAfiliadoHistoriaLaboralInformacionAfiliacionType }
     *     
     */
    public TipoInformacionGeneralAfiliadoHistoriaLaboralInformacionAfiliacionType getInformacionAfiliacion() {
        return informacionAfiliacion;
    }

    /**
     * Sets the value of the informacionAfiliacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionGeneralAfiliadoHistoriaLaboralInformacionAfiliacionType }
     *     
     */
    public void setInformacionAfiliacion(TipoInformacionGeneralAfiliadoHistoriaLaboralInformacionAfiliacionType value) {
        this.informacionAfiliacion = value;
    }

}
