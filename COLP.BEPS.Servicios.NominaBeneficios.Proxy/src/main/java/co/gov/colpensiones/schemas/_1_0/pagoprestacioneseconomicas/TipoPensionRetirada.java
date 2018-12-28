
package co.gov.colpensiones.schemas._1_0.pagoprestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoPensionRetirada complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoPensionRetirada">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificadorAfiliacionPension" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoSolicitante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="periodoRetiro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descripcionPension" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoPensionRetirada", propOrder = {
    "identificadorAfiliacionPension",
    "tipoSolicitante",
    "periodoRetiro",
    "descripcionPension"
})
public class TipoPensionRetirada {

    @XmlElement(required = true, nillable = true)
    protected String identificadorAfiliacionPension;
    @XmlElement(required = true, nillable = true)
    protected String tipoSolicitante;
    @XmlElement(required = true, nillable = true)
    protected String periodoRetiro;
    @XmlElement(required = true, nillable = true)
    protected String descripcionPension;

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
     * Gets the value of the tipoSolicitante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoSolicitante() {
        return tipoSolicitante;
    }

    /**
     * Sets the value of the tipoSolicitante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoSolicitante(String value) {
        this.tipoSolicitante = value;
    }

    /**
     * Gets the value of the periodoRetiro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodoRetiro() {
        return periodoRetiro;
    }

    /**
     * Sets the value of the periodoRetiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodoRetiro(String value) {
        this.periodoRetiro = value;
    }

    /**
     * Gets the value of the descripcionPension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionPension() {
        return descripcionPension;
    }

    /**
     * Sets the value of the descripcionPension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionPension(String value) {
        this.descripcionPension = value;
    }

}
