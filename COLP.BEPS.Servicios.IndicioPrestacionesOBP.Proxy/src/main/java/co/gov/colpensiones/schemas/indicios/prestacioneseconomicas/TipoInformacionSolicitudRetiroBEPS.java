
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.comun.TipoEntidadOrganizacional;
import co.gov.colpensiones.schemas.indicios.personas.TipoCiudad;
import co.gov.colpensiones.schemas.indicios.personas.TipoIdentificacionPersona;


/**
 * <p>Java class for tipoInformacionSolicitudRetiroBEPS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionSolicitudRetiroBEPS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentificacionPersona" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionPersona"/>
 *         &lt;element name="codigoDestinoRecursos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="canalOtorgamiento" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoEntidadOrganizacional"/>
 *         &lt;element name="municipioOtorgamiento" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoCiudad"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionSolicitudRetiroBEPS", propOrder = {
    "identificacionPersona",
    "codigoDestinoRecursos",
    "canalOtorgamiento",
    "municipioOtorgamiento"
})
public class TipoInformacionSolicitudRetiroBEPS {

    @XmlElement(name = "IdentificacionPersona", required = true, nillable = true)
    protected TipoIdentificacionPersona identificacionPersona;
    @XmlElement(required = true, nillable = true)
    protected String codigoDestinoRecursos;
    @XmlElement(required = true, nillable = true)
    protected TipoEntidadOrganizacional canalOtorgamiento;
    @XmlElement(required = true, nillable = true)
    protected TipoCiudad municipioOtorgamiento;

    /**
     * Gets the value of the identificacionPersona property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificacionPersona }
     *     
     */
    public TipoIdentificacionPersona getIdentificacionPersona() {
        return identificacionPersona;
    }

    /**
     * Sets the value of the identificacionPersona property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificacionPersona }
     *     
     */
    public void setIdentificacionPersona(TipoIdentificacionPersona value) {
        this.identificacionPersona = value;
    }

    /**
     * Gets the value of the codigoDestinoRecursos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDestinoRecursos() {
        return codigoDestinoRecursos;
    }

    /**
     * Sets the value of the codigoDestinoRecursos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDestinoRecursos(String value) {
        this.codigoDestinoRecursos = value;
    }

    /**
     * Gets the value of the canalOtorgamiento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoEntidadOrganizacional }
     *     
     */
    public TipoEntidadOrganizacional getCanalOtorgamiento() {
        return canalOtorgamiento;
    }

    /**
     * Sets the value of the canalOtorgamiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEntidadOrganizacional }
     *     
     */
    public void setCanalOtorgamiento(TipoEntidadOrganizacional value) {
        this.canalOtorgamiento = value;
    }

    /**
     * Gets the value of the municipioOtorgamiento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCiudad }
     *     
     */
    public TipoCiudad getMunicipioOtorgamiento() {
        return municipioOtorgamiento;
    }

    /**
     * Sets the value of the municipioOtorgamiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCiudad }
     *     
     */
    public void setMunicipioOtorgamiento(TipoCiudad value) {
        this.municipioOtorgamiento = value;
    }

}
