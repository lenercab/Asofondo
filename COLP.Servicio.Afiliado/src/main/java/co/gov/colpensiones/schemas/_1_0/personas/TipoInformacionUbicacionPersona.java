
package co.gov.colpensiones.schemas._1_0.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionUbicacionPersona complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionUbicacionPersona">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pais" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoPais" minOccurs="0"/>
 *         &lt;element name="departamento" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoDepartamento"/>
 *         &lt;element name="ciudad" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoCiudad"/>
 *         &lt;element name="localidad" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoLocalidad" minOccurs="0"/>
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="telefonos" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoTelefonos"/>
 *         &lt;element name="correosElectronicos" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoDireccionesCorreoElectronico" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionUbicacionPersona", propOrder = {
    "pais",
    "departamento",
    "ciudad",
    "localidad",
    "direccion",
    "telefonos",
    "correosElectronicos"
})
public class TipoInformacionUbicacionPersona {

    protected TipoPais pais;
    @XmlElement(required = true, nillable = true)
    protected TipoDepartamento departamento;
    @XmlElement(required = true, nillable = true)
    protected TipoCiudad ciudad;
    protected TipoLocalidad localidad;
    @XmlElement(required = true, nillable = true)
    protected String direccion;
    @XmlElement(required = true, nillable = true)
    protected TipoTelefonos telefonos;
    protected TipoDireccionesCorreoElectronico correosElectronicos;

    /**
     * Gets the value of the pais property.
     * 
     * @return
     *     possible object is
     *     {@link TipoPais }
     *     
     */
    public TipoPais getPais() {
        return pais;
    }

    /**
     * Sets the value of the pais property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPais }
     *     
     */
    public void setPais(TipoPais value) {
        this.pais = value;
    }

    /**
     * Gets the value of the departamento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDepartamento }
     *     
     */
    public TipoDepartamento getDepartamento() {
        return departamento;
    }

    /**
     * Sets the value of the departamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDepartamento }
     *     
     */
    public void setDepartamento(TipoDepartamento value) {
        this.departamento = value;
    }

    /**
     * Gets the value of the ciudad property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCiudad }
     *     
     */
    public TipoCiudad getCiudad() {
        return ciudad;
    }

    /**
     * Sets the value of the ciudad property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCiudad }
     *     
     */
    public void setCiudad(TipoCiudad value) {
        this.ciudad = value;
    }

    /**
     * Gets the value of the localidad property.
     * 
     * @return
     *     possible object is
     *     {@link TipoLocalidad }
     *     
     */
    public TipoLocalidad getLocalidad() {
        return localidad;
    }

    /**
     * Sets the value of the localidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoLocalidad }
     *     
     */
    public void setLocalidad(TipoLocalidad value) {
        this.localidad = value;
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
     * Gets the value of the telefonos property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTelefonos }
     *     
     */
    public TipoTelefonos getTelefonos() {
        return telefonos;
    }

    /**
     * Sets the value of the telefonos property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTelefonos }
     *     
     */
    public void setTelefonos(TipoTelefonos value) {
        this.telefonos = value;
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

}
