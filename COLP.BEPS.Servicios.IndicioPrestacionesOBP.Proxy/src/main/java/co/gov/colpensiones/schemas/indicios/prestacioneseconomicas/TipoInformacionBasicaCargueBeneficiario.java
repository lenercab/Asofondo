
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionBasicaCargueBeneficiario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionBasicaCargueBeneficiario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroRadicadoTramite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identificadorCasoTramite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoFormulario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoNovedad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroFormulario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionBasicaCargueBeneficiario", propOrder = {
    "numeroRadicadoTramite",
    "identificadorCasoTramite",
    "tipoFormulario",
    "tipoNovedad",
    "numeroFormulario"
})
public class TipoInformacionBasicaCargueBeneficiario {

    @XmlElement(required = true, nillable = true)
    protected String numeroRadicadoTramite;
    @XmlElement(required = true, nillable = true)
    protected String identificadorCasoTramite;
    protected String tipoFormulario;
    protected String tipoNovedad;
    @XmlElement(required = true, nillable = true)
    protected String numeroFormulario;

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
     * Gets the value of the tipoFormulario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoFormulario() {
        return tipoFormulario;
    }

    /**
     * Sets the value of the tipoFormulario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoFormulario(String value) {
        this.tipoFormulario = value;
    }

    /**
     * Gets the value of the tipoNovedad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoNovedad() {
        return tipoNovedad;
    }

    /**
     * Sets the value of the tipoNovedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoNovedad(String value) {
        this.tipoNovedad = value;
    }

    /**
     * Gets the value of the numeroFormulario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroFormulario() {
        return numeroFormulario;
    }

    /**
     * Sets the value of the numeroFormulario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroFormulario(String value) {
        this.numeroFormulario = value;
    }

}
