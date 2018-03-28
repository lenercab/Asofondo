
package co.gov.colpensiones.schemas._1_0.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoRegistroMercantil complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoRegistroMercantil">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionEstablecimiento" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoEstablecimientoComercial"/>
 *         &lt;element name="camaraComercio" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoCamaraComercio"/>
 *         &lt;element name="matriculaMercantil" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoMatriculaMercantil"/>
 *         &lt;element name="actividadEcononima" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoActividadEconomica"/>
 *         &lt;element name="organizacionJuridica" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoOrganizacionJuridica"/>
 *         &lt;element name="estadisticosEstablecimientos" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoEstadisticosEstablecimientos"/>
 *         &lt;element name="porcentajesAportes" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoPorcentajesAportes"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoRegistroMercantil", propOrder = {
    "informacionEstablecimiento",
    "camaraComercio",
    "matriculaMercantil",
    "actividadEcononima",
    "organizacionJuridica",
    "estadisticosEstablecimientos",
    "porcentajesAportes"
})
public class TipoRegistroMercantil {

    @XmlElement(required = true, nillable = true)
    protected TipoEstablecimientoComercial informacionEstablecimiento;
    @XmlElement(required = true, nillable = true)
    protected TipoCamaraComercio camaraComercio;
    @XmlElement(required = true, nillable = true)
    protected TipoMatriculaMercantil matriculaMercantil;
    @XmlElement(required = true, nillable = true)
    protected TipoActividadEconomica actividadEcononima;
    @XmlElement(required = true, nillable = true)
    protected TipoOrganizacionJuridica organizacionJuridica;
    @XmlElement(required = true, nillable = true)
    protected TipoEstadisticosEstablecimientos estadisticosEstablecimientos;
    @XmlElement(required = true, nillable = true)
    protected TipoPorcentajesAportes porcentajesAportes;

    /**
     * Gets the value of the informacionEstablecimiento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoEstablecimientoComercial }
     *     
     */
    public TipoEstablecimientoComercial getInformacionEstablecimiento() {
        return informacionEstablecimiento;
    }

    /**
     * Sets the value of the informacionEstablecimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEstablecimientoComercial }
     *     
     */
    public void setInformacionEstablecimiento(TipoEstablecimientoComercial value) {
        this.informacionEstablecimiento = value;
    }

    /**
     * Gets the value of the camaraComercio property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCamaraComercio }
     *     
     */
    public TipoCamaraComercio getCamaraComercio() {
        return camaraComercio;
    }

    /**
     * Sets the value of the camaraComercio property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCamaraComercio }
     *     
     */
    public void setCamaraComercio(TipoCamaraComercio value) {
        this.camaraComercio = value;
    }

    /**
     * Gets the value of the matriculaMercantil property.
     * 
     * @return
     *     possible object is
     *     {@link TipoMatriculaMercantil }
     *     
     */
    public TipoMatriculaMercantil getMatriculaMercantil() {
        return matriculaMercantil;
    }

    /**
     * Sets the value of the matriculaMercantil property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoMatriculaMercantil }
     *     
     */
    public void setMatriculaMercantil(TipoMatriculaMercantil value) {
        this.matriculaMercantil = value;
    }

    /**
     * Gets the value of the actividadEcononima property.
     * 
     * @return
     *     possible object is
     *     {@link TipoActividadEconomica }
     *     
     */
    public TipoActividadEconomica getActividadEcononima() {
        return actividadEcononima;
    }

    /**
     * Sets the value of the actividadEcononima property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoActividadEconomica }
     *     
     */
    public void setActividadEcononima(TipoActividadEconomica value) {
        this.actividadEcononima = value;
    }

    /**
     * Gets the value of the organizacionJuridica property.
     * 
     * @return
     *     possible object is
     *     {@link TipoOrganizacionJuridica }
     *     
     */
    public TipoOrganizacionJuridica getOrganizacionJuridica() {
        return organizacionJuridica;
    }

    /**
     * Sets the value of the organizacionJuridica property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoOrganizacionJuridica }
     *     
     */
    public void setOrganizacionJuridica(TipoOrganizacionJuridica value) {
        this.organizacionJuridica = value;
    }

    /**
     * Gets the value of the estadisticosEstablecimientos property.
     * 
     * @return
     *     possible object is
     *     {@link TipoEstadisticosEstablecimientos }
     *     
     */
    public TipoEstadisticosEstablecimientos getEstadisticosEstablecimientos() {
        return estadisticosEstablecimientos;
    }

    /**
     * Sets the value of the estadisticosEstablecimientos property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEstadisticosEstablecimientos }
     *     
     */
    public void setEstadisticosEstablecimientos(TipoEstadisticosEstablecimientos value) {
        this.estadisticosEstablecimientos = value;
    }

    /**
     * Gets the value of the porcentajesAportes property.
     * 
     * @return
     *     possible object is
     *     {@link TipoPorcentajesAportes }
     *     
     */
    public TipoPorcentajesAportes getPorcentajesAportes() {
        return porcentajesAportes;
    }

    /**
     * Sets the value of the porcentajesAportes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPorcentajesAportes }
     *     
     */
    public void setPorcentajesAportes(TipoPorcentajesAportes value) {
        this.porcentajesAportes = value;
    }

}
