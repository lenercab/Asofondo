
package co.gov.colpensiones.schemas._1_0.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionActualizarMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionActualizarMetadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentos" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoDocumentosGenericos"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionActualizarMetadata", propOrder = {
    "documentos"
})
public class TipoInformacionActualizarMetadata {

    @XmlElement(required = true, nillable = true)
    protected TipoDocumentosGenericos documentos;

    /**
     * Gets the value of the documentos property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumentosGenericos }
     *     
     */
    public TipoDocumentosGenericos getDocumentos() {
        return documentos;
    }

    /**
     * Sets the value of the documentos property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumentosGenericos }
     *     
     */
    public void setDocumentos(TipoDocumentosGenericos value) {
        this.documentos = value;
    }

}
