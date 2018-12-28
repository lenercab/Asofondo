
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionCargue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionCargue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoCargue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InformacionRelacionadaTramite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionCargue", propOrder = {
    "tipoCargue",
    "informacionRelacionadaTramite"
})
public class TipoInformacionCargue {

    @XmlElement(required = true, nillable = true)
    protected String tipoCargue;
    @XmlElement(name = "InformacionRelacionadaTramite", required = true, nillable = true)
    protected String informacionRelacionadaTramite;

    /**
     * Gets the value of the tipoCargue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCargue() {
        return tipoCargue;
    }

    /**
     * Sets the value of the tipoCargue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCargue(String value) {
        this.tipoCargue = value;
    }

    /**
     * Gets the value of the informacionRelacionadaTramite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformacionRelacionadaTramite() {
        return informacionRelacionadaTramite;
    }

    /**
     * Sets the value of the informacionRelacionadaTramite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformacionRelacionadaTramite(String value) {
        this.informacionRelacionadaTramite = value;
    }

}
