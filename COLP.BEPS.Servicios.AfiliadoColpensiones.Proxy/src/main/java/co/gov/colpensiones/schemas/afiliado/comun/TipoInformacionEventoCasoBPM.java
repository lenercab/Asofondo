
package co.gov.colpensiones.schemas.afiliado.comun;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionEventoCasoBPM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionEventoCasoBPM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroRadicadoCaso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombreEvento" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "tipoInformacionEventoCasoBPM", propOrder = {
    "numeroRadicadoCaso",
    "nombreEvento",
    "informacionRelacionada"
})
public class TipoInformacionEventoCasoBPM {

    @XmlElement(required = true, nillable = true)
    protected String numeroRadicadoCaso;
    @XmlElement(required = true, nillable = true)
    protected String nombreEvento;
    @XmlElement(required = true, nillable = true)
    protected String informacionRelacionada;

    /**
     * Gets the value of the numeroRadicadoCaso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRadicadoCaso() {
        return numeroRadicadoCaso;
    }

    /**
     * Sets the value of the numeroRadicadoCaso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRadicadoCaso(String value) {
        this.numeroRadicadoCaso = value;
    }

    /**
     * Gets the value of the nombreEvento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEvento() {
        return nombreEvento;
    }

    /**
     * Sets the value of the nombreEvento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEvento(String value) {
        this.nombreEvento = value;
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
