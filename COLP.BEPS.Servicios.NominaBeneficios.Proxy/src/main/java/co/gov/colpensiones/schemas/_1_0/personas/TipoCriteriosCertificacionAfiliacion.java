
package co.gov.colpensiones.schemas._1_0.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import co.gov.colpensiones.schemas._1_0.comun.TipoConfiguracionCertificado;
import co.gov.colpensiones.schemas._1_0.comun.tramites.TipoIdentificacionTramite;


/**
 * <p>Java class for tipoCriteriosCertificacionAfiliacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoCriteriosCertificacionAfiliacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacionSolicitante" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionPersona"/>
 *         &lt;element name="configuracionCertificado" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoConfiguracionCertificado"/>
 *         &lt;element name="guardarGestorDocumental" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="identificacionTramite" type="{http://www.colpensiones.gov.co/schemas/1.0/comun/tramites}tipoIdentificacionTramite"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoCriteriosCertificacionAfiliacion", propOrder = {
    "identificacionSolicitante",
    "configuracionCertificado",
    "guardarGestorDocumental",
    "identificacionTramite"
})
public class TipoCriteriosCertificacionAfiliacion {

    @XmlElement(required = true, nillable = true)
    protected TipoIdentificacionPersona identificacionSolicitante;
    @XmlElement(required = true, nillable = true)
    protected TipoConfiguracionCertificado configuracionCertificado;
    protected boolean guardarGestorDocumental;
    @XmlElement(required = true, nillable = true)
    protected TipoIdentificacionTramite identificacionTramite;

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
     * Gets the value of the configuracionCertificado property.
     * 
     * @return
     *     possible object is
     *     {@link TipoConfiguracionCertificado }
     *     
     */
    public TipoConfiguracionCertificado getConfiguracionCertificado() {
        return configuracionCertificado;
    }

    /**
     * Sets the value of the configuracionCertificado property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoConfiguracionCertificado }
     *     
     */
    public void setConfiguracionCertificado(TipoConfiguracionCertificado value) {
        this.configuracionCertificado = value;
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

}
