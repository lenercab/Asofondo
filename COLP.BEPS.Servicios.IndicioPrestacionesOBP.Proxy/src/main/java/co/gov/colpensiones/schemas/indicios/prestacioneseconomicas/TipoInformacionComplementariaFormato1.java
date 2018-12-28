
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionIdentificacionPersonaJuridica;


/**
 * <p>Java class for tipoInformacionComplementariaFormato1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionComplementariaFormato1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indicadorTrabajadorMigrante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalSemanasLaboradas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="indicadorIndemnizacionRecibida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorIndemnizacionTramite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorPensionAsignada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorPensionTramite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoPension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resolucion" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionResolucionPension" minOccurs="0"/>
 *         &lt;element name="indicadorIndicioPensionado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entidadPension" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionIdentificacionPersonaJuridica" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionComplementariaFormato1", propOrder = {
    "indicadorTrabajadorMigrante",
    "totalSemanasLaboradas",
    "indicadorIndemnizacionRecibida",
    "indicadorIndemnizacionTramite",
    "indicadorPensionAsignada",
    "indicadorPensionTramite",
    "tipoPension",
    "resolucion",
    "indicadorIndicioPensionado",
    "entidadPension"
})
public class TipoInformacionComplementariaFormato1 {

    protected String indicadorTrabajadorMigrante;
    protected Integer totalSemanasLaboradas;
    protected String indicadorIndemnizacionRecibida;
    protected String indicadorIndemnizacionTramite;
    protected String indicadorPensionAsignada;
    protected String indicadorPensionTramite;
    protected String tipoPension;
    protected TipoInformacionResolucionPension resolucion;
    protected String indicadorIndicioPensionado;
    protected TipoInformacionIdentificacionPersonaJuridica entidadPension;

    /**
     * Gets the value of the indicadorTrabajadorMigrante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorTrabajadorMigrante() {
        return indicadorTrabajadorMigrante;
    }

    /**
     * Sets the value of the indicadorTrabajadorMigrante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorTrabajadorMigrante(String value) {
        this.indicadorTrabajadorMigrante = value;
    }

    /**
     * Gets the value of the totalSemanasLaboradas property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalSemanasLaboradas() {
        return totalSemanasLaboradas;
    }

    /**
     * Sets the value of the totalSemanasLaboradas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalSemanasLaboradas(Integer value) {
        this.totalSemanasLaboradas = value;
    }

    /**
     * Gets the value of the indicadorIndemnizacionRecibida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorIndemnizacionRecibida() {
        return indicadorIndemnizacionRecibida;
    }

    /**
     * Sets the value of the indicadorIndemnizacionRecibida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorIndemnizacionRecibida(String value) {
        this.indicadorIndemnizacionRecibida = value;
    }

    /**
     * Gets the value of the indicadorIndemnizacionTramite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorIndemnizacionTramite() {
        return indicadorIndemnizacionTramite;
    }

    /**
     * Sets the value of the indicadorIndemnizacionTramite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorIndemnizacionTramite(String value) {
        this.indicadorIndemnizacionTramite = value;
    }

    /**
     * Gets the value of the indicadorPensionAsignada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorPensionAsignada() {
        return indicadorPensionAsignada;
    }

    /**
     * Sets the value of the indicadorPensionAsignada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorPensionAsignada(String value) {
        this.indicadorPensionAsignada = value;
    }

    /**
     * Gets the value of the indicadorPensionTramite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorPensionTramite() {
        return indicadorPensionTramite;
    }

    /**
     * Sets the value of the indicadorPensionTramite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorPensionTramite(String value) {
        this.indicadorPensionTramite = value;
    }

    /**
     * Gets the value of the tipoPension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPension() {
        return tipoPension;
    }

    /**
     * Sets the value of the tipoPension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPension(String value) {
        this.tipoPension = value;
    }

    /**
     * Gets the value of the resolucion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionResolucionPension }
     *     
     */
    public TipoInformacionResolucionPension getResolucion() {
        return resolucion;
    }

    /**
     * Sets the value of the resolucion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionResolucionPension }
     *     
     */
    public void setResolucion(TipoInformacionResolucionPension value) {
        this.resolucion = value;
    }

    /**
     * Gets the value of the indicadorIndicioPensionado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorIndicioPensionado() {
        return indicadorIndicioPensionado;
    }

    /**
     * Sets the value of the indicadorIndicioPensionado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorIndicioPensionado(String value) {
        this.indicadorIndicioPensionado = value;
    }

    /**
     * Gets the value of the entidadPension property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionIdentificacionPersonaJuridica }
     *     
     */
    public TipoInformacionIdentificacionPersonaJuridica getEntidadPension() {
        return entidadPension;
    }

    /**
     * Sets the value of the entidadPension property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionIdentificacionPersonaJuridica }
     *     
     */
    public void setEntidadPension(TipoInformacionIdentificacionPersonaJuridica value) {
        this.entidadPension = value;
    }

}
