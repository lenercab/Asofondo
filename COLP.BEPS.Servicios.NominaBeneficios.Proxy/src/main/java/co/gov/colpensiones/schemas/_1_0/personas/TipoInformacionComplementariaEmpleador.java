
package co.gov.colpensiones.schemas._1_0.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionComplementariaEmpleador complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionComplementariaEmpleador">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="naturaleza" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoVinculacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaVinculacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoAportante" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoTipoAportante" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionComplementariaEmpleador", propOrder = {
    "estado",
    "naturaleza",
    "tipoVinculacion",
    "fechaVinculacion",
    "tipoAportante"
})
public class TipoInformacionComplementariaEmpleador {

    @XmlElement(required = true, nillable = true)
    protected String estado;
    @XmlElement(required = true, nillable = true)
    protected String naturaleza;
    @XmlElement(required = true, nillable = true)
    protected String tipoVinculacion;
    @XmlElement(required = true, nillable = true)
    protected String fechaVinculacion;
    protected TipoTipoAportante tipoAportante;

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

    /**
     * Gets the value of the naturaleza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaturaleza() {
        return naturaleza;
    }

    /**
     * Sets the value of the naturaleza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaturaleza(String value) {
        this.naturaleza = value;
    }

    /**
     * Gets the value of the tipoVinculacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoVinculacion() {
        return tipoVinculacion;
    }

    /**
     * Sets the value of the tipoVinculacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoVinculacion(String value) {
        this.tipoVinculacion = value;
    }

    /**
     * Gets the value of the fechaVinculacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaVinculacion() {
        return fechaVinculacion;
    }

    /**
     * Sets the value of the fechaVinculacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaVinculacion(String value) {
        this.fechaVinculacion = value;
    }

    /**
     * Gets the value of the tipoAportante property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTipoAportante }
     *     
     */
    public TipoTipoAportante getTipoAportante() {
        return tipoAportante;
    }

    /**
     * Sets the value of the tipoAportante property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTipoAportante }
     *     
     */
    public void setTipoAportante(TipoTipoAportante value) {
        this.tipoAportante = value;
    }

}
