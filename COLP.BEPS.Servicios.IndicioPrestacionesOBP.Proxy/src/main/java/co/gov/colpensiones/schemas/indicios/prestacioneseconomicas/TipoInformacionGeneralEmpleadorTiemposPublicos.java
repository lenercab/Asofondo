
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionGeneralPersonaJuridica;


/**
 * <p>Java class for tipoInformacionGeneralEmpleadorTiemposPublicos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionGeneralEmpleadorTiemposPublicos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="empleador" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionGeneralPersonaJuridica"/>
 *         &lt;element name="sector" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaInicioSGP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionGeneralEmpleadorTiemposPublicos", propOrder = {
    "empleador",
    "sector",
    "fechaInicioSGP"
})
public class TipoInformacionGeneralEmpleadorTiemposPublicos {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionGeneralPersonaJuridica empleador;
    @XmlElement(required = true, nillable = true)
    protected String sector;
    @XmlElement(required = true, nillable = true)
    protected String fechaInicioSGP;

    /**
     * Gets the value of the empleador property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionGeneralPersonaJuridica }
     *     
     */
    public TipoInformacionGeneralPersonaJuridica getEmpleador() {
        return empleador;
    }

    /**
     * Sets the value of the empleador property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionGeneralPersonaJuridica }
     *     
     */
    public void setEmpleador(TipoInformacionGeneralPersonaJuridica value) {
        this.empleador = value;
    }

    /**
     * Gets the value of the sector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSector() {
        return sector;
    }

    /**
     * Sets the value of the sector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSector(String value) {
        this.sector = value;
    }

    /**
     * Gets the value of the fechaInicioSGP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaInicioSGP() {
        return fechaInicioSGP;
    }

    /**
     * Sets the value of the fechaInicioSGP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaInicioSGP(String value) {
        this.fechaInicioSGP = value;
    }

}
