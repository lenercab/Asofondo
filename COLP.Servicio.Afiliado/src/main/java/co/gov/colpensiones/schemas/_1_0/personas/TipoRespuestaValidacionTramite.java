
package co.gov.colpensiones.schemas._1_0.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import co.gov.colpensiones.schemas._1_0.comun.tramites.TipoIdentificacionTramite;


/**
 * <p>Java class for tipoRespuestaValidacionTramite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoRespuestaValidacionTramite">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="estadoValidacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaRadicacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="indicadorValidacion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="identificacionTramite" type="{http://www.colpensiones.gov.co/schemas/1.0/comun/tramites}tipoIdentificacionTramite"/>
 *         &lt;element name="rechazosTramite" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoRespuestaValidacionTramite.rechazosTramiteType" minOccurs="0"/>
 *         &lt;element name="rechazosDocumentos" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoRespuestaValidacionTramite.rechazosDocumentosType" minOccurs="0"/>
 *         &lt;element name="documentosFaltantes" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoRespuestaValidacionTramite.documentosFaltantesType" minOccurs="0"/>
 *         &lt;element name="documentosProcesados" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoRespuestaValidacionTramite.documentosProcesadosType"/>
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
@XmlType(name = "tipoRespuestaValidacionTramite", propOrder = {
    "estadoValidacion",
    "fechaRadicacion",
    "indicadorValidacion",
    "identificacionTramite",
    "rechazosTramite",
    "rechazosDocumentos",
    "documentosFaltantes",
    "documentosProcesados",
    "informacionRelacionadaTramite"
})
public class TipoRespuestaValidacionTramite {

    @XmlElement(required = true, nillable = true)
    protected String estadoValidacion;
    @XmlElement(required = true, nillable = true)
    protected String fechaRadicacion;
    protected boolean indicadorValidacion;
    @XmlElement(required = true, nillable = true)
    protected TipoIdentificacionTramite identificacionTramite;
    protected TipoRespuestaValidacionTramiteRechazosTramiteType rechazosTramite;
    protected TipoRespuestaValidacionTramiteRechazosDocumentosType rechazosDocumentos;
    protected TipoRespuestaValidacionTramiteDocumentosFaltantesType documentosFaltantes;
    @XmlElement(required = true, nillable = true)
    protected TipoRespuestaValidacionTramiteDocumentosProcesadosType documentosProcesados;
    @XmlElement(required = true, nillable = true)
    protected String informacionRelacionadaTramite;

    /**
     * Gets the value of the estadoValidacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoValidacion() {
        return estadoValidacion;
    }

    /**
     * Sets the value of the estadoValidacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoValidacion(String value) {
        this.estadoValidacion = value;
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
     * Gets the value of the indicadorValidacion property.
     * 
     */
    public boolean isIndicadorValidacion() {
        return indicadorValidacion;
    }

    /**
     * Sets the value of the indicadorValidacion property.
     * 
     */
    public void setIndicadorValidacion(boolean value) {
        this.indicadorValidacion = value;
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

    /**
     * Gets the value of the rechazosTramite property.
     * 
     * @return
     *     possible object is
     *     {@link TipoRespuestaValidacionTramiteRechazosTramiteType }
     *     
     */
    public TipoRespuestaValidacionTramiteRechazosTramiteType getRechazosTramite() {
        return rechazosTramite;
    }

    /**
     * Sets the value of the rechazosTramite property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoRespuestaValidacionTramiteRechazosTramiteType }
     *     
     */
    public void setRechazosTramite(TipoRespuestaValidacionTramiteRechazosTramiteType value) {
        this.rechazosTramite = value;
    }

    /**
     * Gets the value of the rechazosDocumentos property.
     * 
     * @return
     *     possible object is
     *     {@link TipoRespuestaValidacionTramiteRechazosDocumentosType }
     *     
     */
    public TipoRespuestaValidacionTramiteRechazosDocumentosType getRechazosDocumentos() {
        return rechazosDocumentos;
    }

    /**
     * Sets the value of the rechazosDocumentos property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoRespuestaValidacionTramiteRechazosDocumentosType }
     *     
     */
    public void setRechazosDocumentos(TipoRespuestaValidacionTramiteRechazosDocumentosType value) {
        this.rechazosDocumentos = value;
    }

    /**
     * Gets the value of the documentosFaltantes property.
     * 
     * @return
     *     possible object is
     *     {@link TipoRespuestaValidacionTramiteDocumentosFaltantesType }
     *     
     */
    public TipoRespuestaValidacionTramiteDocumentosFaltantesType getDocumentosFaltantes() {
        return documentosFaltantes;
    }

    /**
     * Sets the value of the documentosFaltantes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoRespuestaValidacionTramiteDocumentosFaltantesType }
     *     
     */
    public void setDocumentosFaltantes(TipoRespuestaValidacionTramiteDocumentosFaltantesType value) {
        this.documentosFaltantes = value;
    }

    /**
     * Gets the value of the documentosProcesados property.
     * 
     * @return
     *     possible object is
     *     {@link TipoRespuestaValidacionTramiteDocumentosProcesadosType }
     *     
     */
    public TipoRespuestaValidacionTramiteDocumentosProcesadosType getDocumentosProcesados() {
        return documentosProcesados;
    }

    /**
     * Sets the value of the documentosProcesados property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoRespuestaValidacionTramiteDocumentosProcesadosType }
     *     
     */
    public void setDocumentosProcesados(TipoRespuestaValidacionTramiteDocumentosProcesadosType value) {
        this.documentosProcesados = value;
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
