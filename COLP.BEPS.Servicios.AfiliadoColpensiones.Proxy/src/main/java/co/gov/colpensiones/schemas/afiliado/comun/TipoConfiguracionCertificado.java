
package co.gov.colpensiones.schemas.afiliado.comun;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoConfiguracionCertificado complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoConfiguracionCertificado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="formato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="informacionComplementaria" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoPropiedadesCertificado"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoConfiguracionCertificado", propOrder = {
    "formato",
    "informacionComplementaria"
})
public class TipoConfiguracionCertificado {

    @XmlElement(required = true, nillable = true)
    protected String formato;
    @XmlElement(required = true, nillable = true)
    protected TipoPropiedadesCertificado informacionComplementaria;

    /**
     * Gets the value of the formato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormato() {
        return formato;
    }

    /**
     * Sets the value of the formato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormato(String value) {
        this.formato = value;
    }

    /**
     * Gets the value of the informacionComplementaria property.
     * 
     * @return
     *     possible object is
     *     {@link TipoPropiedadesCertificado }
     *     
     */
    public TipoPropiedadesCertificado getInformacionComplementaria() {
        return informacionComplementaria;
    }

    /**
     * Sets the value of the informacionComplementaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPropiedadesCertificado }
     *     
     */
    public void setInformacionComplementaria(TipoPropiedadesCertificado value) {
        this.informacionComplementaria = value;
    }

}
