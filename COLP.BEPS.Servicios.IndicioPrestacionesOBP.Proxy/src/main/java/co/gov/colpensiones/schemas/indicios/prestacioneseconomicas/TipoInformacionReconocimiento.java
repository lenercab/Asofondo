
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.comun.TipoValor;


/**
 * <p>Java class for tipoInformacionReconocimiento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionReconocimiento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fechaRadicacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroRadicacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="riesgoRedencionAnticipada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resolucion" type="{http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas}tipoInformacionResolucionPension" minOccurs="0"/>
 *         &lt;element name="tasa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valorPension" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoValor" minOccurs="0"/>
 *         &lt;element name="cantidadMesadas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionReconocimiento", propOrder = {
    "fechaRadicacion",
    "numeroRadicacion",
    "riesgoRedencionAnticipada",
    "resolucion",
    "tasa",
    "valorPension",
    "cantidadMesadas"
})
public class TipoInformacionReconocimiento {

    @XmlElement(required = true, nillable = true)
    protected String fechaRadicacion;
    @XmlElement(required = true, nillable = true)
    protected String numeroRadicacion;
    protected String riesgoRedencionAnticipada;
    protected TipoInformacionResolucionPension resolucion;
    @XmlElement(required = true, nillable = true)
    protected String tasa;
    protected TipoValor valorPension;
    protected String cantidadMesadas;

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
     * Gets the value of the numeroRadicacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRadicacion() {
        return numeroRadicacion;
    }

    /**
     * Sets the value of the numeroRadicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRadicacion(String value) {
        this.numeroRadicacion = value;
    }

    /**
     * Gets the value of the riesgoRedencionAnticipada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiesgoRedencionAnticipada() {
        return riesgoRedencionAnticipada;
    }

    /**
     * Sets the value of the riesgoRedencionAnticipada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiesgoRedencionAnticipada(String value) {
        this.riesgoRedencionAnticipada = value;
    }

    /**
     * Gets the value of the resolucion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionResolucionPension }
     *     
     */
    public TipoInformacionResolucionPension getResolucion() {
        return resolucion;
    }

    /**
     * Sets the value of the resolucion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionResolucionPension }
     *     
     */
    public void setResolucion(TipoInformacionResolucionPension value) {
        this.resolucion = value;
    }

    /**
     * Gets the value of the tasa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTasa() {
        return tasa;
    }

    /**
     * Sets the value of the tasa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTasa(String value) {
        this.tasa = value;
    }

    /**
     * Gets the value of the valorPension property.
     * 
     * @return
     *     possible object is
     *     {@link TipoValor }
     *     
     */
    public TipoValor getValorPension() {
        return valorPension;
    }

    /**
     * Sets the value of the valorPension property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoValor }
     *     
     */
    public void setValorPension(TipoValor value) {
        this.valorPension = value;
    }

    /**
     * Gets the value of the cantidadMesadas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidadMesadas() {
        return cantidadMesadas;
    }

    /**
     * Sets the value of the cantidadMesadas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidadMesadas(String value) {
        this.cantidadMesadas = value;
    }

}
