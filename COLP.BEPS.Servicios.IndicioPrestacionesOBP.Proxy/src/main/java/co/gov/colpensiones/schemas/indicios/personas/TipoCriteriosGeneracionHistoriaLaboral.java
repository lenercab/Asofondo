
package co.gov.colpensiones.schemas.indicios.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.comun.tramites.TipoIdentificacionTramite;


/**
 * <p>Java class for tipoCriteriosGeneracionHistoriaLaboral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoCriteriosGeneracionHistoriaLaboral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacionTramite" type="{http://www.colpensiones.gov.co/schemas/1.0/comun/tramites}tipoIdentificacionTramite" minOccurs="0"/>
 *         &lt;element name="identificacionSolicitante" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionPersona"/>
 *         &lt;element name="guardarGestorDocumental" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoCriteriosGeneracionHistoriaLaboral", propOrder = {
    "identificacionTramite",
    "identificacionSolicitante",
    "guardarGestorDocumental"
})
public class TipoCriteriosGeneracionHistoriaLaboral {

    protected TipoIdentificacionTramite identificacionTramite;
    @XmlElement(required = true, nillable = true)
    protected TipoIdentificacionPersona identificacionSolicitante;
    protected boolean guardarGestorDocumental;

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
     * Gets the value of the guardarGestorDocumental property.
     * 
     */
    public boolean isGuardarGestorDocumental() {
        return guardarGestorDocumental;
    }

    /**
     * Sets the value of the guardarGestorDocumental property.
     * 
     */
    public void setGuardarGestorDocumental(boolean value) {
        this.guardarGestorDocumental = value;
    }

}
