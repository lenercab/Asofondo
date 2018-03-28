
package co.gov.colpensiones.schemas._1_0.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import co.gov.colpensiones.schemas._1_0.comun.TipoEstado;


/**
 * <p>Java class for tipoInformacionConsultaGeneralAfiliado complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionConsultaGeneralAfiliado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionPersonal" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionGeneralPersona"/>
 *         &lt;element name="estaVivo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tienePension" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="estadoAfiliado" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoEstado"/>
 *         &lt;element name="estadoTransladoRegimen" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoEstado"/>
 *         &lt;element name="relacionesLaborales" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoRelacionesLaborales" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionConsultaGeneralAfiliado", propOrder = {
    "informacionPersonal",
    "estaVivo",
    "tienePension",
    "estadoAfiliado",
    "estadoTransladoRegimen",
    "relacionesLaborales"
})
public class TipoInformacionConsultaGeneralAfiliado {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionGeneralPersona informacionPersonal;
    protected Boolean estaVivo;
    protected boolean tienePension;
    @XmlElement(required = true, nillable = true)
    protected TipoEstado estadoAfiliado;
    @XmlElement(required = true, nillable = true)
    protected TipoEstado estadoTransladoRegimen;
    protected TipoRelacionesLaborales relacionesLaborales;

    /**
     * Gets the value of the informacionPersonal property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionGeneralPersona }
     *     
     */
    public TipoInformacionGeneralPersona getInformacionPersonal() {
        return informacionPersonal;
    }

    /**
     * Sets the value of the informacionPersonal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionGeneralPersona }
     *     
     */
    public void setInformacionPersonal(TipoInformacionGeneralPersona value) {
        this.informacionPersonal = value;
    }

    /**
     * Gets the value of the estaVivo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEstaVivo() {
        return estaVivo;
    }

    /**
     * Sets the value of the estaVivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEstaVivo(Boolean value) {
        this.estaVivo = value;
    }

    /**
     * Gets the value of the tienePension property.
     * 
     */
    public boolean isTienePension() {
        return tienePension;
    }

    /**
     * Sets the value of the tienePension property.
     * 
     */
    public void setTienePension(boolean value) {
        this.tienePension = value;
    }

    /**
     * Gets the value of the estadoAfiliado property.
     * 
     * @return
     *     possible object is
     *     {@link TipoEstado }
     *     
     */
    public TipoEstado getEstadoAfiliado() {
        return estadoAfiliado;
    }

    /**
     * Sets the value of the estadoAfiliado property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEstado }
     *     
     */
    public void setEstadoAfiliado(TipoEstado value) {
        this.estadoAfiliado = value;
    }

    /**
     * Gets the value of the estadoTransladoRegimen property.
     * 
     * @return
     *     possible object is
     *     {@link TipoEstado }
     *     
     */
    public TipoEstado getEstadoTransladoRegimen() {
        return estadoTransladoRegimen;
    }

    /**
     * Sets the value of the estadoTransladoRegimen property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEstado }
     *     
     */
    public void setEstadoTransladoRegimen(TipoEstado value) {
        this.estadoTransladoRegimen = value;
    }

    /**
     * Gets the value of the relacionesLaborales property.
     * 
     * @return
     *     possible object is
     *     {@link TipoRelacionesLaborales }
     *     
     */
    public TipoRelacionesLaborales getRelacionesLaborales() {
        return relacionesLaborales;
    }

    /**
     * Sets the value of the relacionesLaborales property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoRelacionesLaborales }
     *     
     */
    public void setRelacionesLaborales(TipoRelacionesLaborales value) {
        this.relacionesLaborales = value;
    }

}
