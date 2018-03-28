
package co.gov.colpensiones.schemas.indicios.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoCriteriosConsolidadosSemanasCotizadas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoCriteriosConsolidadosSemanasCotizadas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numRadicado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdentificacionPersona" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionPersona"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoCriteriosConsolidadosSemanasCotizadas", propOrder = {
    "numRadicado",
    "identificacionPersona"
})
public class TipoCriteriosConsolidadosSemanasCotizadas {

    @XmlElement(required = true)
    protected String numRadicado;
    @XmlElement(name = "IdentificacionPersona", required = true)
    protected TipoIdentificacionPersona identificacionPersona;

    /**
     * Gets the value of the numRadicado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRadicado() {
        return numRadicado;
    }

    /**
     * Sets the value of the numRadicado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRadicado(String value) {
        this.numRadicado = value;
    }

    /**
     * Gets the value of the identificacionPersona property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificacionPersona }
     *     
     */
    public TipoIdentificacionPersona getIdentificacionPersona() {
        return identificacionPersona;
    }

    /**
     * Sets the value of the identificacionPersona property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificacionPersona }
     *     
     */
    public void setIdentificacionPersona(TipoIdentificacionPersona value) {
        this.identificacionPersona = value;
    }

}
