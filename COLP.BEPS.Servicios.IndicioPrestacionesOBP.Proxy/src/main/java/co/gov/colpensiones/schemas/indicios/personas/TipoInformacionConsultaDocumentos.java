
package co.gov.colpensiones.schemas.indicios.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.comun.tramites.TipoIdentificacionTramite;


/**
 * <p>Java class for tipoInformacionConsultaDocumentos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionConsultaDocumentos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacionTramite" type="{http://www.colpensiones.gov.co/schemas/1.0/comun/tramites}tipoIdentificacionTramite"/>
 *         &lt;element name="identificacionSolicitante" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionPersona"/>
 *         &lt;element name="filtrosDocumento" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoFiltrosDocumento"/>
 *         &lt;element name="incluirContenido" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionConsultaDocumentos", propOrder = {
    "identificacionTramite",
    "identificacionSolicitante",
    "filtrosDocumento",
    "incluirContenido"
})
public class TipoInformacionConsultaDocumentos {

    @XmlElement(required = true, nillable = true)
    protected TipoIdentificacionTramite identificacionTramite;
    @XmlElement(required = true, nillable = true)
    protected TipoIdentificacionPersona identificacionSolicitante;
    @XmlElement(required = true, nillable = true)
    protected TipoFiltrosDocumento filtrosDocumento;
    protected boolean incluirContenido;

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
     * Gets the value of the filtrosDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoFiltrosDocumento }
     *     
     */
    public TipoFiltrosDocumento getFiltrosDocumento() {
        return filtrosDocumento;
    }

    /**
     * Sets the value of the filtrosDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoFiltrosDocumento }
     *     
     */
    public void setFiltrosDocumento(TipoFiltrosDocumento value) {
        this.filtrosDocumento = value;
    }

    /**
     * Gets the value of the incluirContenido property.
     * 
     */
    public boolean isIncluirContenido() {
        return incluirContenido;
    }

    /**
     * Sets the value of the incluirContenido property.
     * 
     */
    public void setIncluirContenido(boolean value) {
        this.incluirContenido = value;
    }

}
