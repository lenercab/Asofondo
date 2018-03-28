
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.comun.tramites.TipoIdentificacionTramite;


/**
 * <p>Java class for tipoInformacionGeneralControladorCargue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionGeneralControladorCargue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionTramite" type="{http://www.colpensiones.gov.co/schemas/1.0/comun/tramites}tipoIdentificacionTramite"/>
 *         &lt;element name="identificadorCasoTramite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="canal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="informacionRelacionadaTramite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionGeneralControladorCargue", propOrder = {
    "informacionTramite",
    "identificadorCasoTramite",
    "canal",
    "informacionRelacionadaTramite"
})
public class TipoInformacionGeneralControladorCargue {

    @XmlElement(required = true, nillable = true)
    protected TipoIdentificacionTramite informacionTramite;
    @XmlElement(required = true, nillable = true)
    protected String identificadorCasoTramite;
    @XmlElement(required = true, nillable = true)
    protected String canal;
    @XmlElement(required = true, nillable = true)
    protected String informacionRelacionadaTramite;

    /**
     * Gets the value of the informacionTramite property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificacionTramite }
     *     
     */
    public TipoIdentificacionTramite getInformacionTramite() {
        return informacionTramite;
    }

    /**
     * Sets the value of the informacionTramite property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificacionTramite }
     *     
     */
    public void setInformacionTramite(TipoIdentificacionTramite value) {
        this.informacionTramite = value;
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
     * Gets the value of the canal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanal() {
        return canal;
    }

    /**
     * Sets the value of the canal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanal(String value) {
        this.canal = value;
    }

    /**
     * Gets the value of the informacionRelacionadaTramite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformacionRelacionadaTramite() {
        return informacionRelacionadaTramite;
    }

    /**
     * Sets the value of the informacionRelacionadaTramite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformacionRelacionadaTramite(String value) {
        this.informacionRelacionadaTramite = value;
    }

}
