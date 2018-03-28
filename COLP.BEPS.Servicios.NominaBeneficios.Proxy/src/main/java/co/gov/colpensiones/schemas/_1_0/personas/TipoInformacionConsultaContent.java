
package co.gov.colpensiones.schemas._1_0.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionConsultaContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionConsultaContent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacionTRD" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionTRD"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaInicial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaFinal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionConsultaContent", propOrder = {
    "identificacionTRD",
    "estado",
    "fechaInicial",
    "fechaFinal"
})
public class TipoInformacionConsultaContent {

    @XmlElement(required = true, nillable = true)
    protected TipoIdentificacionTRD identificacionTRD;
    @XmlElement(required = true, nillable = true)
    protected String estado;
    @XmlElement(required = true)
    protected String fechaInicial;
    @XmlElement(required = true)
    protected String fechaFinal;

    /**
     * Gets the value of the identificacionTRD property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificacionTRD }
     *     
     */
    public TipoIdentificacionTRD getIdentificacionTRD() {
        return identificacionTRD;
    }

    /**
     * Sets the value of the identificacionTRD property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificacionTRD }
     *     
     */
    public void setIdentificacionTRD(TipoIdentificacionTRD value) {
        this.identificacionTRD = value;
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

    /**
     * Gets the value of the fechaInicial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaInicial() {
        return fechaInicial;
    }

    /**
     * Sets the value of the fechaInicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaInicial(String value) {
        this.fechaInicial = value;
    }

    /**
     * Gets the value of the fechaFinal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaFinal() {
        return fechaFinal;
    }

    /**
     * Sets the value of the fechaFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaFinal(String value) {
        this.fechaFinal = value;
    }

}
