
package co.gov.colpensiones.schemas._1_0.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import co.gov.colpensiones.schemas._1_0.comun.tramites.TipoIdentificacionTramite;


/**
 * <p>Java class for tipoInformacionMovimientoDocumento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionMovimientoDocumento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacionTramite" type="{http://www.colpensiones.gov.co/schemas/1.0/comun/tramites}tipoIdentificacionTramite"/>
 *         &lt;element name="identificacionSolicitante" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionPersona"/>
 *         &lt;element name="identificacionDocumento" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionDocumento"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionMovimientoDocumento", propOrder = {
    "identificacionTramite",
    "identificacionSolicitante",
    "identificacionDocumento"
})
public class TipoInformacionMovimientoDocumento {

    @XmlElement(required = true, nillable = true)
    protected TipoIdentificacionTramite identificacionTramite;
    @XmlElement(required = true, nillable = true)
    protected TipoIdentificacionPersona identificacionSolicitante;
    @XmlElement(required = true, nillable = true)
    protected TipoIdentificacionDocumento identificacionDocumento;

    /**
     * Gets the value of the identificacionTramite property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificacionTramite }
     *     
     */
    public TipoIdentificacionTramite getIdentificacionTramite() {
        return identificacionTramite;
    }

    /**
     * Sets the value of the identificacionTramite property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificacionTramite }
     *     
     */
    public void setIdentificacionTramite(TipoIdentificacionTramite value) {
        this.identificacionTramite = value;
    }

    /**
     * Gets the value of the identificacionSolicitante property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificacionPersona }
     *     
     */
    public TipoIdentificacionPersona getIdentificacionSolicitante() {
        return identificacionSolicitante;
    }

    /**
     * Sets the value of the identificacionSolicitante property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificacionPersona }
     *     
     */
    public void setIdentificacionSolicitante(TipoIdentificacionPersona value) {
        this.identificacionSolicitante = value;
    }

    /**
     * Gets the value of the identificacionDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificacionDocumento }
     *     
     */
    public TipoIdentificacionDocumento getIdentificacionDocumento() {
        return identificacionDocumento;
    }

    /**
     * Sets the value of the identificacionDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificacionDocumento }
     *     
     */
    public void setIdentificacionDocumento(TipoIdentificacionDocumento value) {
        this.identificacionDocumento = value;
    }

}
