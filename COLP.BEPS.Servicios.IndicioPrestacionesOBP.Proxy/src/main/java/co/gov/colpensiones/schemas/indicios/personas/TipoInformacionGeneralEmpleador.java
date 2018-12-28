
package co.gov.colpensiones.schemas.indicios.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionGeneralEmpleador complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionGeneralEmpleador">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionGeneral" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionBasicaEmpleador"/>
 *         &lt;element name="informacionComplementaria" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionComplementariaEmpleador"/>
 *         &lt;element name="informacionUbicacion" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionUbicacionPersona"/>
 *         &lt;element name="actividadEconomica" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoActividadEconomica"/>
 *         &lt;element name="sucursales" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoSucursales"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionGeneralEmpleador", propOrder = {
    "informacionGeneral",
    "informacionComplementaria",
    "informacionUbicacion",
    "actividadEconomica",
    "sucursales"
})
public class TipoInformacionGeneralEmpleador {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionBasicaEmpleador informacionGeneral;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionComplementariaEmpleador informacionComplementaria;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionUbicacionPersona informacionUbicacion;
    @XmlElement(required = true, nillable = true)
    protected TipoActividadEconomica actividadEconomica;
    @XmlElement(required = true, nillable = true)
    protected TipoSucursales sucursales;

    /**
     * Gets the value of the informacionGeneral property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionBasicaEmpleador }
     *     
     */
    public TipoInformacionBasicaEmpleador getInformacionGeneral() {
        return informacionGeneral;
    }

    /**
     * Sets the value of the informacionGeneral property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionBasicaEmpleador }
     *     
     */
    public void setInformacionGeneral(TipoInformacionBasicaEmpleador value) {
        this.informacionGeneral = value;
    }

    /**
     * Gets the value of the informacionComplementaria property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionComplementariaEmpleador }
     *     
     */
    public TipoInformacionComplementariaEmpleador getInformacionComplementaria() {
        return informacionComplementaria;
    }

    /**
     * Sets the value of the informacionComplementaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionComplementariaEmpleador }
     *     
     */
    public void setInformacionComplementaria(TipoInformacionComplementariaEmpleador value) {
        this.informacionComplementaria = value;
    }

    /**
     * Gets the value of the informacionUbicacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionUbicacionPersona }
     *     
     */
    public TipoInformacionUbicacionPersona getInformacionUbicacion() {
        return informacionUbicacion;
    }

    /**
     * Sets the value of the informacionUbicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionUbicacionPersona }
     *     
     */
    public void setInformacionUbicacion(TipoInformacionUbicacionPersona value) {
        this.informacionUbicacion = value;
    }

    /**
     * Gets the value of the actividadEconomica property.
     * 
     * @return
     *     possible object is
     *     {@link TipoActividadEconomica }
     *     
     */
    public TipoActividadEconomica getActividadEconomica() {
        return actividadEconomica;
    }

    /**
     * Sets the value of the actividadEconomica property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoActividadEconomica }
     *     
     */
    public void setActividadEconomica(TipoActividadEconomica value) {
        this.actividadEconomica = value;
    }

    /**
     * Gets the value of the sucursales property.
     * 
     * @return
     *     possible object is
     *     {@link TipoSucursales }
     *     
     */
    public TipoSucursales getSucursales() {
        return sucursales;
    }

    /**
     * Sets the value of the sucursales property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoSucursales }
     *     
     */
    public void setSucursales(TipoSucursales value) {
        this.sucursales = value;
    }

}
