
package co.gov.colpensiones.schemas.afiliado.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionGeneralAfiliadoHistoriaLaboral.informacionAfiliacionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionGeneralAfiliadoHistoriaLaboral.informacionAfiliacionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fechaIngreso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionGeneralAfiliadoHistoriaLaboral.informacionAfiliacionType", propOrder = {
    "fechaIngreso",
    "estado"
})
public class TipoInformacionGeneralAfiliadoHistoriaLaboralInformacionAfiliacionType {

    @XmlElement(required = true, nillable = true)
    protected String fechaIngreso;
    @XmlElement(required = true, nillable = true)
    protected String estado;

    /**
     * Gets the value of the fechaIngreso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * Sets the value of the fechaIngreso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaIngreso(String value) {
        this.fechaIngreso = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

}
