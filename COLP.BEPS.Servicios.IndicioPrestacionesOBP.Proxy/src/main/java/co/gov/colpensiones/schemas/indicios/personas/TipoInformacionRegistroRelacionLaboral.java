
package co.gov.colpensiones.schemas.indicios.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionRegistroRelacionLaboral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionRegistroRelacionLaboral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="relacionLaboral" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionBasicaRelacionLaboral"/>
 *         &lt;element name="identificacionAfiliado" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionPersona"/>
 *         &lt;element name="fechaRadicacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoVinculacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionRegistroRelacionLaboral", propOrder = {
    "relacionLaboral",
    "identificacionAfiliado",
    "fechaRadicacion",
    "tipoVinculacion"
})
public class TipoInformacionRegistroRelacionLaboral {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionBasicaRelacionLaboral relacionLaboral;
    @XmlElement(required = true, nillable = true)
    protected TipoIdentificacionPersona identificacionAfiliado;
    @XmlElement(required = true, nillable = true)
    protected String fechaRadicacion;
    @XmlElement(required = true, nillable = true)
    protected String tipoVinculacion;

    /**
     * Gets the value of the relacionLaboral property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionBasicaRelacionLaboral }
     *     
     */
    public TipoInformacionBasicaRelacionLaboral getRelacionLaboral() {
        return relacionLaboral;
    }

    /**
     * Sets the value of the relacionLaboral property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionBasicaRelacionLaboral }
     *     
     */
    public void setRelacionLaboral(TipoInformacionBasicaRelacionLaboral value) {
        this.relacionLaboral = value;
    }

    /**
     * Gets the value of the identificacionAfiliado property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificacionPersona }
     *     
     */
    public TipoIdentificacionPersona getIdentificacionAfiliado() {
        return identificacionAfiliado;
    }

    /**
     * Sets the value of the identificacionAfiliado property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificacionPersona }
     *     
     */
    public void setIdentificacionAfiliado(TipoIdentificacionPersona value) {
        this.identificacionAfiliado = value;
    }

    /**
     * Gets the value of the fechaRadicacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaRadicacion() {
        return fechaRadicacion;
    }

    /**
     * Sets the value of the fechaRadicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaRadicacion(String value) {
        this.fechaRadicacion = value;
    }

    /**
     * Gets the value of the tipoVinculacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoVinculacion() {
        return tipoVinculacion;
    }

    /**
     * Sets the value of the tipoVinculacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoVinculacion(String value) {
        this.tipoVinculacion = value;
    }

}
