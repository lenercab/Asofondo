
package co.gov.colpensiones.schemas._1_0.pagoprestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import co.gov.colpensiones.schemas._1_0.personas.TipoIdentificacionPersona;


/**
 * <p>Java class for tipoFiltrosPersona complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoFiltrosPersona">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacion" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionPersona"/>
 *         &lt;element name="periodoInicial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="periodoFinal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoFiltrosPersona", propOrder = {
    "identificacion",
    "periodoInicial",
    "periodoFinal"
})
public class TipoFiltrosPersona {

    @XmlElement(required = true, nillable = true)
    protected TipoIdentificacionPersona identificacion;
    @XmlElement(required = true, nillable = true)
    protected String periodoInicial;
    @XmlElement(required = true, nillable = true)
    protected String periodoFinal;

    /**
     * Gets the value of the identificacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificacionPersona }
     *     
     */
    public TipoIdentificacionPersona getIdentificacion() {
        return identificacion;
    }

    /**
     * Sets the value of the identificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificacionPersona }
     *     
     */
    public void setIdentificacion(TipoIdentificacionPersona value) {
        this.identificacion = value;
    }

    /**
     * Gets the value of the periodoInicial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodoInicial() {
        return periodoInicial;
    }

    /**
     * Sets the value of the periodoInicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodoInicial(String value) {
        this.periodoInicial = value;
    }

    /**
     * Gets the value of the periodoFinal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodoFinal() {
        return periodoFinal;
    }

    /**
     * Sets the value of the periodoFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodoFinal(String value) {
        this.periodoFinal = value;
    }

}
