
package co.gov.colpensiones.schemas.indicios.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoDocumentoTRD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoDocumentoTRD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contenido" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="propiedades" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoPropiedades"/>
 *         &lt;element name="tipoPaginasMTOM" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoPaginasMTOM"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoDocumentoTRD", propOrder = {
    "id",
    "contenido",
    "propiedades",
    "tipoPaginasMTOM"
})
public class TipoDocumentoTRD {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected byte[] contenido;
    @XmlElement(required = true, nillable = true)
    protected TipoPropiedades propiedades;
    @XmlElement(required = true)
    protected TipoPaginasMTOM tipoPaginasMTOM;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the contenido property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getContenido() {
        return contenido;
    }

    /**
     * Sets the value of the contenido property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setContenido(byte[] value) {
        this.contenido = value;
    }

    /**
     * Gets the value of the propiedades property.
     * 
     * @return
     *     possible object is
     *     {@link TipoPropiedades }
     *     
     */
    public TipoPropiedades getPropiedades() {
        return propiedades;
    }

    /**
     * Sets the value of the propiedades property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPropiedades }
     *     
     */
    public void setPropiedades(TipoPropiedades value) {
        this.propiedades = value;
    }

    /**
     * Gets the value of the tipoPaginasMTOM property.
     * 
     * @return
     *     possible object is
     *     {@link TipoPaginasMTOM }
     *     
     */
    public TipoPaginasMTOM getTipoPaginasMTOM() {
        return tipoPaginasMTOM;
    }

    /**
     * Sets the value of the tipoPaginasMTOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPaginasMTOM }
     *     
     */
    public void setTipoPaginasMTOM(TipoPaginasMTOM value) {
        this.tipoPaginasMTOM = value;
    }

}
