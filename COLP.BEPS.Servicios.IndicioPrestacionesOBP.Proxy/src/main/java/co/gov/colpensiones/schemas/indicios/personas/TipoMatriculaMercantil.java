
package co.gov.colpensiones.schemas.indicios.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoMatriculaMercantil complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoMatriculaMercantil">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaRegistro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaVigencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="categoria" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoCategoriaMatricula"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoMatriculaMercantil", propOrder = {
    "numero",
    "fechaRegistro",
    "fechaVigencia",
    "categoria"
})
public class TipoMatriculaMercantil {

    @XmlElement(required = true, nillable = true)
    protected String numero;
    @XmlElement(required = true, nillable = true)
    protected String fechaRegistro;
    @XmlElement(required = true, nillable = true)
    protected String fechaVigencia;
    @XmlElement(required = true, nillable = true)
    protected TipoCategoriaMatricula categoria;

    /**
     * Gets the value of the numero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Gets the value of the fechaRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * Sets the value of the fechaRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaRegistro(String value) {
        this.fechaRegistro = value;
    }

    /**
     * Gets the value of the fechaVigencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaVigencia() {
        return fechaVigencia;
    }

    /**
     * Sets the value of the fechaVigencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaVigencia(String value) {
        this.fechaVigencia = value;
    }

    /**
     * Gets the value of the categoria property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCategoriaMatricula }
     *     
     */
    public TipoCategoriaMatricula getCategoria() {
        return categoria;
    }

    /**
     * Sets the value of the categoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCategoriaMatricula }
     *     
     */
    public void setCategoria(TipoCategoriaMatricula value) {
        this.categoria = value;
    }

}
