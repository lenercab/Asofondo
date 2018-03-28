
package co.gov.colpensiones.schemas._1_0.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionActualizacionAfiliacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionActualizacionAfiliacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fechaRadicacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="consecutivoFormulario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="informacionGeneralAfiliado" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionGeneralAfiliado"/>
 *         &lt;element name="informacionBeneficiarios" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoBeneficiarios"/>
 *         &lt;element name="informacionRelacionLaboral" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionActualizacionAfiliacion.informacionRelacionLaboralType"/>
 *         &lt;element name="informacionGeneralEmpleador" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionGeneralEmpleador" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionActualizacionAfiliacion", propOrder = {
    "fechaRadicacion",
    "consecutivoFormulario",
    "informacionGeneralAfiliado",
    "informacionBeneficiarios",
    "informacionRelacionLaboral",
    "informacionGeneralEmpleador"
})
public class TipoInformacionActualizacionAfiliacion {

    @XmlElement(required = true, nillable = true)
    protected String fechaRadicacion;
    protected String consecutivoFormulario;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionGeneralAfiliado informacionGeneralAfiliado;
    @XmlElement(required = true, nillable = true)
    protected TipoBeneficiarios informacionBeneficiarios;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionActualizacionAfiliacionInformacionRelacionLaboralType informacionRelacionLaboral;
    protected TipoInformacionGeneralEmpleador informacionGeneralEmpleador;

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
     * Gets the value of the consecutivoFormulario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsecutivoFormulario() {
        return consecutivoFormulario;
    }

    /**
     * Sets the value of the consecutivoFormulario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsecutivoFormulario(String value) {
        this.consecutivoFormulario = value;
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
     * Gets the value of the informacionBeneficiarios property.
     * 
     * @return
     *     possible object is
     *     {@link TipoBeneficiarios }
     *     
     */
    public TipoBeneficiarios getInformacionBeneficiarios() {
        return informacionBeneficiarios;
    }

    /**
     * Sets the value of the informacionBeneficiarios property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoBeneficiarios }
     *     
     */
    public void setInformacionBeneficiarios(TipoBeneficiarios value) {
        this.informacionBeneficiarios = value;
    }

    /**
     * Gets the value of the informacionRelacionLaboral property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionActualizacionAfiliacionInformacionRelacionLaboralType }
     *     
     */
    public TipoInformacionActualizacionAfiliacionInformacionRelacionLaboralType getInformacionRelacionLaboral() {
        return informacionRelacionLaboral;
    }

    /**
     * Sets the value of the informacionRelacionLaboral property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionActualizacionAfiliacionInformacionRelacionLaboralType }
     *     
     */
    public void setInformacionRelacionLaboral(TipoInformacionActualizacionAfiliacionInformacionRelacionLaboralType value) {
        this.informacionRelacionLaboral = value;
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

}
