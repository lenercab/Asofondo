
package co.gov.colpensiones.schemas.indicios.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.comun.TipoEntidadOrganizacional;


/**
 * <p>Java class for tipoTrasladoAfiliacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoTrasladoAfiliacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fechaTraslado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descripcionNovedad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="informacionMultivinculacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="administradoraFondoPensiones" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoEntidadOrganizacional"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoTrasladoAfiliacion", propOrder = {
    "fechaTraslado",
    "descripcionNovedad",
    "informacionMultivinculacion",
    "administradoraFondoPensiones"
})
public class TipoTrasladoAfiliacion {

    @XmlElement(required = true, nillable = true)
    protected String fechaTraslado;
    @XmlElement(required = true, nillable = true)
    protected String descripcionNovedad;
    @XmlElement(required = true, nillable = true)
    protected String informacionMultivinculacion;
    @XmlElement(required = true, nillable = true)
    protected TipoEntidadOrganizacional administradoraFondoPensiones;

    /**
     * Gets the value of the fechaTraslado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaTraslado() {
        return fechaTraslado;
    }

    /**
     * Sets the value of the fechaTraslado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaTraslado(String value) {
        this.fechaTraslado = value;
    }

    /**
     * Gets the value of the descripcionNovedad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionNovedad() {
        return descripcionNovedad;
    }

    /**
     * Sets the value of the descripcionNovedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionNovedad(String value) {
        this.descripcionNovedad = value;
    }

    /**
     * Gets the value of the informacionMultivinculacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformacionMultivinculacion() {
        return informacionMultivinculacion;
    }

    /**
     * Sets the value of the informacionMultivinculacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformacionMultivinculacion(String value) {
        this.informacionMultivinculacion = value;
    }

    /**
     * Gets the value of the administradoraFondoPensiones property.
     * 
     * @return
     *     possible object is
     *     {@link TipoEntidadOrganizacional }
     *     
     */
    public TipoEntidadOrganizacional getAdministradoraFondoPensiones() {
        return administradoraFondoPensiones;
    }

    /**
     * Sets the value of the administradoraFondoPensiones property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEntidadOrganizacional }
     *     
     */
    public void setAdministradoraFondoPensiones(TipoEntidadOrganizacional value) {
        this.administradoraFondoPensiones = value;
    }

}
