
package co.gov.colpensiones.schemas.indicios.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.comun.TipoEntidadOrganizacional;


/**
 * <p>Java class for tipoInformacionBasicaPersonaBEPS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionBasicaPersonaBEPS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacion" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionPersona"/>
 *         &lt;element name="telefonos" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoTelefonos"/>
 *         &lt;element name="correosElectronicos" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoDireccionesCorreoElectronico"/>
 *         &lt;element name="administradoraPensiones" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoEntidadOrganizacional"/>
 *         &lt;element name="indicadorTraslado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionBasicaPersonaBEPS", propOrder = {
    "identificacion",
    "telefonos",
    "correosElectronicos",
    "administradoraPensiones",
    "indicadorTraslado"
})
public class TipoInformacionBasicaPersonaBEPS {

    @XmlElement(required = true, nillable = true)
    protected TipoIdentificacionPersona identificacion;
    @XmlElement(required = true, nillable = true)
    protected TipoTelefonos telefonos;
    @XmlElement(required = true, nillable = true)
    protected TipoDireccionesCorreoElectronico correosElectronicos;
    @XmlElement(required = true, nillable = true)
    protected TipoEntidadOrganizacional administradoraPensiones;
    protected boolean indicadorTraslado;

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

    /**
     * Gets the value of the administradoraPensiones property.
     * 
     * @return
     *     possible object is
     *     {@link TipoEntidadOrganizacional }
     *     
     */
    public TipoEntidadOrganizacional getAdministradoraPensiones() {
        return administradoraPensiones;
    }

    /**
     * Sets the value of the administradoraPensiones property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEntidadOrganizacional }
     *     
     */
    public void setAdministradoraPensiones(TipoEntidadOrganizacional value) {
        this.administradoraPensiones = value;
    }

    /**
     * Gets the value of the indicadorTraslado property.
     * 
     */
    public boolean isIndicadorTraslado() {
        return indicadorTraslado;
    }

    /**
     * Sets the value of the indicadorTraslado property.
     * 
     */
    public void setIndicadorTraslado(boolean value) {
        this.indicadorTraslado = value;
    }

}
