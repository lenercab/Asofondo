
package co.gov.colpensiones.schemas.indicios.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionDocumentoCertificacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionDocumentoCertificacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionDocumento" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionBasicaDocumento"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionDocumentoCertificacion", propOrder = {
    "informacionDocumento"
})
public class TipoInformacionDocumentoCertificacion {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionBasicaDocumento informacionDocumento;

    /**
     * Gets the value of the informacionDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionBasicaDocumento }
     *     
     */
    public TipoInformacionBasicaDocumento getInformacionDocumento() {
        return informacionDocumento;
    }

    /**
     * Sets the value of the informacionDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionBasicaDocumento }
     *     
     */
    public void setInformacionDocumento(TipoInformacionBasicaDocumento value) {
        this.informacionDocumento = value;
    }

}
