
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.personas.TipoIdentificacionPersona;


/**
 * <p>Java class for tipoInformacionGeneralCargueTiemposPublicos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionGeneralCargueTiemposPublicos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroRadicadoTramite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identificadorCasoTramite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identificacionTrabajador" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionPersona"/>
 *         &lt;element name="tiemposPublicos" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoCargueTiemposPublicos"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionGeneralCargueTiemposPublicos", propOrder = {
    "numeroRadicadoTramite",
    "identificadorCasoTramite",
    "identificacionTrabajador",
    "tiemposPublicos"
})
public class TipoInformacionGeneralCargueTiemposPublicos {

    @XmlElement(required = true, nillable = true)
    protected String numeroRadicadoTramite;
    @XmlElement(required = true, nillable = true)
    protected String identificadorCasoTramite;
    @XmlElement(required = true, nillable = true)
    protected TipoIdentificacionPersona identificacionTrabajador;
    @XmlElement(required = true, nillable = true)
    protected TipoCargueTiemposPublicos tiemposPublicos;

    /**
     * Gets the value of the numeroRadicadoTramite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRadicadoTramite() {
        return numeroRadicadoTramite;
    }

    /**
     * Sets the value of the numeroRadicadoTramite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRadicadoTramite(String value) {
        this.numeroRadicadoTramite = value;
    }

    /**
     * Gets the value of the identificadorCasoTramite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorCasoTramite() {
        return identificadorCasoTramite;
    }

    /**
     * Sets the value of the identificadorCasoTramite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorCasoTramite(String value) {
        this.identificadorCasoTramite = value;
    }

    /**
     * Gets the value of the identificacionTrabajador property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificacionPersona }
     *     
     */
    public TipoIdentificacionPersona getIdentificacionTrabajador() {
        return identificacionTrabajador;
    }

    /**
     * Sets the value of the identificacionTrabajador property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificacionPersona }
     *     
     */
    public void setIdentificacionTrabajador(TipoIdentificacionPersona value) {
        this.identificacionTrabajador = value;
    }

    /**
     * Gets the value of the tiemposPublicos property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCargueTiemposPublicos }
     *     
     */
    public TipoCargueTiemposPublicos getTiemposPublicos() {
        return tiemposPublicos;
    }

    /**
     * Sets the value of the tiemposPublicos property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCargueTiemposPublicos }
     *     
     */
    public void setTiemposPublicos(TipoCargueTiemposPublicos value) {
        this.tiemposPublicos = value;
    }

}
