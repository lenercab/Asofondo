
package co.gov.colpensiones.schemas.indicios.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for documento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="documento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificadorDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoDocumental" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoTipoDocumental"/>
 *         &lt;element name="paginas" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}documento.paginasType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documento", propOrder = {
    "identificadorDocumento",
    "tipoDocumental",
    "paginas"
})
public class Documento {

    @XmlElement(required = true, nillable = true)
    protected String identificadorDocumento;
    @XmlElement(required = true, nillable = true)
    protected TipoTipoDocumental tipoDocumental;
    @XmlElement(required = true, nillable = true)
    protected DocumentoPaginasType paginas;

    /**
     * Gets the value of the identificadorDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorDocumento() {
        return identificadorDocumento;
    }

    /**
     * Sets the value of the identificadorDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorDocumento(String value) {
        this.identificadorDocumento = value;
    }

    /**
     * Gets the value of the tipoDocumental property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTipoDocumental }
     *     
     */
    public TipoTipoDocumental getTipoDocumental() {
        return tipoDocumental;
    }

    /**
     * Sets the value of the tipoDocumental property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTipoDocumental }
     *     
     */
    public void setTipoDocumental(TipoTipoDocumental value) {
        this.tipoDocumental = value;
    }

    /**
     * Gets the value of the paginas property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoPaginasType }
     *     
     */
    public DocumentoPaginasType getPaginas() {
        return paginas;
    }

    /**
     * Sets the value of the paginas property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoPaginasType }
     *     
     */
    public void setPaginas(DocumentoPaginasType value) {
        this.paginas = value;
    }

}
