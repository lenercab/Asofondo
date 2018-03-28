
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.personas.TipoIdentificacionPersona;


/**
 * <p>Java class for tipoCriteriosSimulacionBEPS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoCriteriosSimulacionBEPS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentificacionPersona" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionPersona"/>
 *         &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="genero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoDestinoRecursos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valorAhorrado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valorTraslado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoCriteriosSimulacionBEPS", propOrder = {
    "identificacionPersona",
    "fechaNacimiento",
    "genero",
    "codigoDestinoRecursos",
    "valorAhorrado",
    "valorTraslado"
})
public class TipoCriteriosSimulacionBEPS {

    @XmlElement(name = "IdentificacionPersona", required = true, nillable = true)
    protected TipoIdentificacionPersona identificacionPersona;
    @XmlElement(required = true, nillable = true)
    protected String fechaNacimiento;
    @XmlElement(required = true, nillable = true)
    protected String genero;
    @XmlElement(required = true, nillable = true)
    protected String codigoDestinoRecursos;
    protected BigDecimal valorAhorrado;
    protected BigDecimal valorTraslado;

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

    /**
     * Gets the value of the fechaNacimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Sets the value of the fechaNacimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacimiento(String value) {
        this.fechaNacimiento = value;
    }

    /**
     * Gets the value of the genero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Sets the value of the genero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenero(String value) {
        this.genero = value;
    }

    /**
     * Gets the value of the codigoDestinoRecursos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDestinoRecursos() {
        return codigoDestinoRecursos;
    }

    /**
     * Sets the value of the codigoDestinoRecursos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDestinoRecursos(String value) {
        this.codigoDestinoRecursos = value;
    }

    /**
     * Gets the value of the valorAhorrado property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorAhorrado() {
        return valorAhorrado;
    }

    /**
     * Sets the value of the valorAhorrado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorAhorrado(BigDecimal value) {
        this.valorAhorrado = value;
    }

    /**
     * Gets the value of the valorTraslado property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTraslado() {
        return valorTraslado;
    }

    /**
     * Sets the value of the valorTraslado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTraslado(BigDecimal value) {
        this.valorTraslado = value;
    }

}
