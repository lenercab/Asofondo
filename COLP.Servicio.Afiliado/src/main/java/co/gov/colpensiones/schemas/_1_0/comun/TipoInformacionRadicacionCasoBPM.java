
package co.gov.colpensiones.schemas._1_0.comun;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionRadicacionCasoBPM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionRadicacionCasoBPM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombreProcesoNegocio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="informacionRelacionada" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionRadicacionCasoBPM", propOrder = {
    "nombreProcesoNegocio",
    "informacionRelacionada"
})
public class TipoInformacionRadicacionCasoBPM {

    @XmlElement(required = true, nillable = true)
    protected String nombreProcesoNegocio;
    @XmlElement(required = true, nillable = true)
    protected String informacionRelacionada;

    /**
     * Gets the value of the nombreProcesoNegocio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreProcesoNegocio() {
        return nombreProcesoNegocio;
    }

    /**
     * Sets the value of the nombreProcesoNegocio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreProcesoNegocio(String value) {
        this.nombreProcesoNegocio = value;
    }

    /**
     * Gets the value of the informacionRelacionada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformacionRelacionada() {
        return informacionRelacionada;
    }

    /**
     * Sets the value of the informacionRelacionada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformacionRelacionada(String value) {
        this.informacionRelacionada = value;
    }

}
