
package co.gov.colpensiones.schemas._1_0.pagoprestacioneseconomicas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionGeneralAporte complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionGeneralAporte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="periodo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombreEPS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valorCotizacion" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="estado" type="{http://www.colpensiones.gov.co/schemas/1.0/pagoprestacioneseconomicas}tipoEstadoPension"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionGeneralAporte", propOrder = {
    "periodo",
    "nombreEPS",
    "valorCotizacion",
    "estado"
})
public class TipoInformacionGeneralAporte {

    @XmlElement(required = true, nillable = true)
    protected String periodo;
    @XmlElement(required = true, nillable = true)
    protected String nombreEPS;
    @XmlElement(required = true)
    protected BigDecimal valorCotizacion;
    @XmlElement(required = true, nillable = true)
    protected TipoEstadoPension estado;

    /**
     * Gets the value of the periodo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodo() {
        return periodo;
    }

    /**
     * Sets the value of the periodo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodo(String value) {
        this.periodo = value;
    }

    /**
     * Gets the value of the nombreEPS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEPS() {
        return nombreEPS;
    }

    /**
     * Sets the value of the nombreEPS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEPS(String value) {
        this.nombreEPS = value;
    }

    /**
     * Gets the value of the valorCotizacion property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorCotizacion() {
        return valorCotizacion;
    }

    /**
     * Sets the value of the valorCotizacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorCotizacion(BigDecimal value) {
        this.valorCotizacion = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link TipoEstadoPension }
     *     
     */
    public TipoEstadoPension getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEstadoPension }
     *     
     */
    public void setEstado(TipoEstadoPension value) {
        this.estado = value;
    }

}
