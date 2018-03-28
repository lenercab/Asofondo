
package co.gov.colpensiones.schemas.indicios.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionRegistroInicialAfiliacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionRegistroInicialAfiliacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fechaRadicacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="informacionGeneralAfiliado" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionGeneralAfiliado"/>
 *         &lt;element name="informacionRelacionLaboral" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionRegistroInicialAfiliacion.informacionRelacionLaboralType"/>
 *         &lt;element name="informacionHistoricoNovedades" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoRegistroHistoricoNovedad" minOccurs="0"/>
 *         &lt;element name="informacionGeneralEmpleador" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionGeneralEmpleador" minOccurs="0"/>
 *         &lt;element name="promotor" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionRegistroInicialAfiliacion.promotorType"/>
 *         &lt;element name="informacionUbicacionVinculacion" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionRegistroInicialAfiliacion.informacionUbicacionVinculacionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionRegistroInicialAfiliacion", propOrder = {
    "fechaRadicacion",
    "informacionGeneralAfiliado",
    "informacionRelacionLaboral",
    "informacionHistoricoNovedades",
    "informacionGeneralEmpleador",
    "promotor",
    "informacionUbicacionVinculacion"
})
public class TipoInformacionRegistroInicialAfiliacion {

    @XmlElement(required = true, nillable = true)
    protected String fechaRadicacion;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionGeneralAfiliado informacionGeneralAfiliado;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionRegistroInicialAfiliacionInformacionRelacionLaboralType informacionRelacionLaboral;
    protected TipoRegistroHistoricoNovedad informacionHistoricoNovedades;
    protected TipoInformacionGeneralEmpleador informacionGeneralEmpleador;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionRegistroInicialAfiliacionPromotorType promotor;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionRegistroInicialAfiliacionInformacionUbicacionVinculacionType informacionUbicacionVinculacion;

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
     * Gets the value of the informacionGeneralAfiliado property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionGeneralAfiliado }
     *     
     */
    public TipoInformacionGeneralAfiliado getInformacionGeneralAfiliado() {
        return informacionGeneralAfiliado;
    }

    /**
     * Sets the value of the informacionGeneralAfiliado property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionGeneralAfiliado }
     *     
     */
    public void setInformacionGeneralAfiliado(TipoInformacionGeneralAfiliado value) {
        this.informacionGeneralAfiliado = value;
    }

    /**
     * Gets the value of the informacionRelacionLaboral property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionRegistroInicialAfiliacionInformacionRelacionLaboralType }
     *     
     */
    public TipoInformacionRegistroInicialAfiliacionInformacionRelacionLaboralType getInformacionRelacionLaboral() {
        return informacionRelacionLaboral;
    }

    /**
     * Sets the value of the informacionRelacionLaboral property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionRegistroInicialAfiliacionInformacionRelacionLaboralType }
     *     
     */
    public void setInformacionRelacionLaboral(TipoInformacionRegistroInicialAfiliacionInformacionRelacionLaboralType value) {
        this.informacionRelacionLaboral = value;
    }

    /**
     * Gets the value of the informacionHistoricoNovedades property.
     * 
     * @return
     *     possible object is
     *     {@link TipoRegistroHistoricoNovedad }
     *     
     */
    public TipoRegistroHistoricoNovedad getInformacionHistoricoNovedades() {
        return informacionHistoricoNovedades;
    }

    /**
     * Sets the value of the informacionHistoricoNovedades property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoRegistroHistoricoNovedad }
     *     
     */
    public void setInformacionHistoricoNovedades(TipoRegistroHistoricoNovedad value) {
        this.informacionHistoricoNovedades = value;
    }

    /**
     * Gets the value of the informacionGeneralEmpleador property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionGeneralEmpleador }
     *     
     */
    public TipoInformacionGeneralEmpleador getInformacionGeneralEmpleador() {
        return informacionGeneralEmpleador;
    }

    /**
     * Sets the value of the informacionGeneralEmpleador property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionGeneralEmpleador }
     *     
     */
    public void setInformacionGeneralEmpleador(TipoInformacionGeneralEmpleador value) {
        this.informacionGeneralEmpleador = value;
    }

    /**
     * Gets the value of the promotor property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionRegistroInicialAfiliacionPromotorType }
     *     
     */
    public TipoInformacionRegistroInicialAfiliacionPromotorType getPromotor() {
        return promotor;
    }

    /**
     * Sets the value of the promotor property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionRegistroInicialAfiliacionPromotorType }
     *     
     */
    public void setPromotor(TipoInformacionRegistroInicialAfiliacionPromotorType value) {
        this.promotor = value;
    }

    /**
     * Gets the value of the informacionUbicacionVinculacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionRegistroInicialAfiliacionInformacionUbicacionVinculacionType }
     *     
     */
    public TipoInformacionRegistroInicialAfiliacionInformacionUbicacionVinculacionType getInformacionUbicacionVinculacion() {
        return informacionUbicacionVinculacion;
    }

    /**
     * Sets the value of the informacionUbicacionVinculacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionRegistroInicialAfiliacionInformacionUbicacionVinculacionType }
     *     
     */
    public void setInformacionUbicacionVinculacion(TipoInformacionRegistroInicialAfiliacionInformacionUbicacionVinculacionType value) {
        this.informacionUbicacionVinculacion = value;
    }

}
