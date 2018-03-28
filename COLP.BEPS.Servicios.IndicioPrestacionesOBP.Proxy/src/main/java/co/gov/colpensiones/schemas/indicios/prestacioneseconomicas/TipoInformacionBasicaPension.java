
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionBasicaPersonaJuridica;


/**
 * <p>Java class for tipoInformacionBasicaPension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionBasicaPension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificadorAfiliacionPension" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estado" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoEstadoPension"/>
 *         &lt;element name="empresa" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionBasicaPersonaJuridica"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionBasicaPension", propOrder = {
    "identificadorAfiliacionPension",
    "estado",
    "empresa"
})
public class TipoInformacionBasicaPension {

    @XmlElement(required = true, nillable = true)
    protected String identificadorAfiliacionPension;
    @XmlElement(required = true, nillable = true)
    protected TipoEstadoPension estado;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionBasicaPersonaJuridica empresa;

    /**
     * Gets the value of the identificadorAfiliacionPension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorAfiliacionPension() {
        return identificadorAfiliacionPension;
    }

    /**
     * Sets the value of the identificadorAfiliacionPension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorAfiliacionPension(String value) {
        this.identificadorAfiliacionPension = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link TipoEstadoPension }
     *     
     */
    public TipoEstadoPension getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEstadoPension }
     *     
     */
    public void setEstado(TipoEstadoPension value) {
        this.estado = value;
    }

    /**
     * Gets the value of the empresa property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionBasicaPersonaJuridica }
     *     
     */
    public TipoInformacionBasicaPersonaJuridica getEmpresa() {
        return empresa;
    }

    /**
     * Sets the value of the empresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionBasicaPersonaJuridica }
     *     
     */
    public void setEmpresa(TipoInformacionBasicaPersonaJuridica value) {
        this.empresa = value;
    }

}
