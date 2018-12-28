
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoDetalleCargueTiemposPublicos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoDetalleCargueTiemposPublicos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="formatosTiemposPublicos" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionFormatos"/>
 *         &lt;element name="informacionBasica" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionBasicaCargueTiemposPublicos"/>
 *         &lt;element name="informacionCertificacion" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionCertificacionTiemposPublicos"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoDetalleCargueTiemposPublicos", propOrder = {
    "formatosTiemposPublicos",
    "informacionBasica",
    "informacionCertificacion"
})
public class TipoDetalleCargueTiemposPublicos {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionFormatos formatosTiemposPublicos;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionBasicaCargueTiemposPublicos informacionBasica;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionCertificacionTiemposPublicos informacionCertificacion;

    /**
     * Gets the value of the formatosTiemposPublicos property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionFormatos }
     *     
     */
    public TipoInformacionFormatos getFormatosTiemposPublicos() {
        return formatosTiemposPublicos;
    }

    /**
     * Sets the value of the formatosTiemposPublicos property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionFormatos }
     *     
     */
    public void setFormatosTiemposPublicos(TipoInformacionFormatos value) {
        this.formatosTiemposPublicos = value;
    }

    /**
     * Gets the value of the informacionBasica property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionBasicaCargueTiemposPublicos }
     *     
     */
    public TipoInformacionBasicaCargueTiemposPublicos getInformacionBasica() {
        return informacionBasica;
    }

    /**
     * Sets the value of the informacionBasica property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionBasicaCargueTiemposPublicos }
     *     
     */
    public void setInformacionBasica(TipoInformacionBasicaCargueTiemposPublicos value) {
        this.informacionBasica = value;
    }

    /**
     * Gets the value of the informacionCertificacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionCertificacionTiemposPublicos }
     *     
     */
    public TipoInformacionCertificacionTiemposPublicos getInformacionCertificacion() {
        return informacionCertificacion;
    }

    /**
     * Sets the value of the informacionCertificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionCertificacionTiemposPublicos }
     *     
     */
    public void setInformacionCertificacion(TipoInformacionCertificacionTiemposPublicos value) {
        this.informacionCertificacion = value;
    }

}
