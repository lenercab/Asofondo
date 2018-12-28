
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionGeneralCargueHistoriaLaboral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionGeneralCargueHistoriaLaboral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionTramite" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionTramiteCargueHistoriaLaboral"/>
 *         &lt;element name="informacionAfiliado" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionAfiliadoCargueHistoriaLaboral"/>
 *         &lt;element name="informacionCotizacionesAdicionales" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionCotizacionesAdicionales" minOccurs="0"/>
 *         &lt;element name="informacionNumeroAfiliacionAsignados" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionDatosAfiliacionesAsignados" minOccurs="0"/>
 *         &lt;element name="informacionInconsistenciasCotizacionesAntes1995" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionInconsistenciasCotizacionesAntes1995" minOccurs="0"/>
 *         &lt;element name="informacionActualizacionPeriodosCotizados" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionActualizacionPeriodosCotizados" minOccurs="0"/>
 *         &lt;element name="informacionInconsistenciasCotizacionesDespues1995" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionInconsistenciasCotizacionesDespues1995" minOccurs="0"/>
 *         &lt;element name="informacionPeriodosFaltantes" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionPeriodosFaltantes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionGeneralCargueHistoriaLaboral", propOrder = {
    "informacionTramite",
    "informacionAfiliado",
    "informacionCotizacionesAdicionales",
    "informacionNumeroAfiliacionAsignados",
    "informacionInconsistenciasCotizacionesAntes1995",
    "informacionActualizacionPeriodosCotizados",
    "informacionInconsistenciasCotizacionesDespues1995",
    "informacionPeriodosFaltantes"
})
public class TipoInformacionGeneralCargueHistoriaLaboral {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionTramiteCargueHistoriaLaboral informacionTramite;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionAfiliadoCargueHistoriaLaboral informacionAfiliado;
    protected TipoInformacionCotizacionesAdicionales informacionCotizacionesAdicionales;
    protected TipoInformacionDatosAfiliacionesAsignados informacionNumeroAfiliacionAsignados;
    protected TipoInformacionInconsistenciasCotizacionesAntes1995 informacionInconsistenciasCotizacionesAntes1995;
    protected TipoInformacionActualizacionPeriodosCotizados informacionActualizacionPeriodosCotizados;
    protected TipoInformacionInconsistenciasCotizacionesDespues1995 informacionInconsistenciasCotizacionesDespues1995;
    protected TipoInformacionPeriodosFaltantes informacionPeriodosFaltantes;

    /**
     * Gets the value of the informacionTramite property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionTramiteCargueHistoriaLaboral }
     *     
     */
    public TipoInformacionTramiteCargueHistoriaLaboral getInformacionTramite() {
        return informacionTramite;
    }

    /**
     * Sets the value of the informacionTramite property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionTramiteCargueHistoriaLaboral }
     *     
     */
    public void setInformacionTramite(TipoInformacionTramiteCargueHistoriaLaboral value) {
        this.informacionTramite = value;
    }

    /**
     * Gets the value of the informacionAfiliado property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionAfiliadoCargueHistoriaLaboral }
     *     
     */
    public TipoInformacionAfiliadoCargueHistoriaLaboral getInformacionAfiliado() {
        return informacionAfiliado;
    }

    /**
     * Sets the value of the informacionAfiliado property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionAfiliadoCargueHistoriaLaboral }
     *     
     */
    public void setInformacionAfiliado(TipoInformacionAfiliadoCargueHistoriaLaboral value) {
        this.informacionAfiliado = value;
    }

    /**
     * Gets the value of the informacionCotizacionesAdicionales property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionCotizacionesAdicionales }
     *     
     */
    public TipoInformacionCotizacionesAdicionales getInformacionCotizacionesAdicionales() {
        return informacionCotizacionesAdicionales;
    }

    /**
     * Sets the value of the informacionCotizacionesAdicionales property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionCotizacionesAdicionales }
     *     
     */
    public void setInformacionCotizacionesAdicionales(TipoInformacionCotizacionesAdicionales value) {
        this.informacionCotizacionesAdicionales = value;
    }

    /**
     * Gets the value of the informacionNumeroAfiliacionAsignados property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionDatosAfiliacionesAsignados }
     *     
     */
    public TipoInformacionDatosAfiliacionesAsignados getInformacionNumeroAfiliacionAsignados() {
        return informacionNumeroAfiliacionAsignados;
    }

    /**
     * Sets the value of the informacionNumeroAfiliacionAsignados property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionDatosAfiliacionesAsignados }
     *     
     */
    public void setInformacionNumeroAfiliacionAsignados(TipoInformacionDatosAfiliacionesAsignados value) {
        this.informacionNumeroAfiliacionAsignados = value;
    }

    /**
     * Gets the value of the informacionInconsistenciasCotizacionesAntes1995 property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionInconsistenciasCotizacionesAntes1995 }
     *     
     */
    public TipoInformacionInconsistenciasCotizacionesAntes1995 getInformacionInconsistenciasCotizacionesAntes1995() {
        return informacionInconsistenciasCotizacionesAntes1995;
    }

    /**
     * Sets the value of the informacionInconsistenciasCotizacionesAntes1995 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionInconsistenciasCotizacionesAntes1995 }
     *     
     */
    public void setInformacionInconsistenciasCotizacionesAntes1995(TipoInformacionInconsistenciasCotizacionesAntes1995 value) {
        this.informacionInconsistenciasCotizacionesAntes1995 = value;
    }

    /**
     * Gets the value of the informacionActualizacionPeriodosCotizados property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionActualizacionPeriodosCotizados }
     *     
     */
    public TipoInformacionActualizacionPeriodosCotizados getInformacionActualizacionPeriodosCotizados() {
        return informacionActualizacionPeriodosCotizados;
    }

    /**
     * Sets the value of the informacionActualizacionPeriodosCotizados property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionActualizacionPeriodosCotizados }
     *     
     */
    public void setInformacionActualizacionPeriodosCotizados(TipoInformacionActualizacionPeriodosCotizados value) {
        this.informacionActualizacionPeriodosCotizados = value;
    }

    /**
     * Gets the value of the informacionInconsistenciasCotizacionesDespues1995 property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionInconsistenciasCotizacionesDespues1995 }
     *     
     */
    public TipoInformacionInconsistenciasCotizacionesDespues1995 getInformacionInconsistenciasCotizacionesDespues1995() {
        return informacionInconsistenciasCotizacionesDespues1995;
    }

    /**
     * Sets the value of the informacionInconsistenciasCotizacionesDespues1995 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionInconsistenciasCotizacionesDespues1995 }
     *     
     */
    public void setInformacionInconsistenciasCotizacionesDespues1995(TipoInformacionInconsistenciasCotizacionesDespues1995 value) {
        this.informacionInconsistenciasCotizacionesDespues1995 = value;
    }

    /**
     * Gets the value of the informacionPeriodosFaltantes property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionPeriodosFaltantes }
     *     
     */
    public TipoInformacionPeriodosFaltantes getInformacionPeriodosFaltantes() {
        return informacionPeriodosFaltantes;
    }

    /**
     * Sets the value of the informacionPeriodosFaltantes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionPeriodosFaltantes }
     *     
     */
    public void setInformacionPeriodosFaltantes(TipoInformacionPeriodosFaltantes value) {
        this.informacionPeriodosFaltantes = value;
    }

}
