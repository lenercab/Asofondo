
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionTramiteCargueHistoriaLaboral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionTramiteCargueHistoriaLaboral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroRadicadoTramite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identificadorCasoTramite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaRadicacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="horaRadicacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionTramiteCargueHistoriaLaboral", propOrder = {
    "numeroRadicadoTramite",
    "identificadorCasoTramite",
    "fechaRadicacion",
    "horaRadicacion"
})
public class TipoInformacionTramiteCargueHistoriaLaboral {

    @XmlElement(required = true, nillable = true)
    protected String numeroRadicadoTramite;
    @XmlElement(required = true, nillable = true)
    protected String identificadorCasoTramite;
    @XmlElement(required = true, nillable = true)
    protected String fechaRadicacion;
    @XmlElement(required = true, nillable = true)
    protected String horaRadicacion;

    /**
     * Gets the value of the numeroRadicadoTramite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRadicadoTramite() {
        return numeroRadicadoTramite;
    }

    /**
     * Sets the value of the numeroRadicadoTramite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRadicadoTramite(String value) {
        this.numeroRadicadoTramite = value;
    }

    /**
     * Gets the value of the identificadorCasoTramite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorCasoTramite() {
        return identificadorCasoTramite;
    }

    /**
     * Sets the value of the identificadorCasoTramite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorCasoTramite(String value) {
        this.identificadorCasoTramite = value;
    }

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
     * Gets the value of the horaRadicacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraRadicacion() {
        return horaRadicacion;
    }

    /**
     * Sets the value of the horaRadicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraRadicacion(String value) {
        this.horaRadicacion = value;
    }

}
