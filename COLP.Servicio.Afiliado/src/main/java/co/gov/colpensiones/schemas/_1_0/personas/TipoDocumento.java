
package co.gov.colpensiones.schemas._1_0.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoDocumento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoDocumento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoDocumental" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoTipoDocumental"/>
 *         &lt;element name="numFolios" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fechaCreacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contenido" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paginas" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoPaginas"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoDocumento", propOrder = {
    "id",
    "tipoDocumental",
    "numFolios",
    "fechaCreacion",
    "contenido",
    "extension",
    "paginas"
})
public class TipoDocumento {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true, nillable = true)
    protected TipoTipoDocumental tipoDocumental;
    protected int numFolios;
    @XmlElement(required = true)
    protected String fechaCreacion;
    @XmlElement(required = true)
    protected String contenido;
    @XmlElement(required = true)
    protected String extension;
    @XmlElement(required = true)
    protected TipoPaginas paginas;

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
     * Gets the value of the numFolios property.
     * 
     */
    public int getNumFolios() {
        return numFolios;
    }

    /**
     * Sets the value of the numFolios property.
     * 
     */
    public void setNumFolios(int value) {
        this.numFolios = value;
    }

    /**
     * Gets the value of the fechaCreacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Sets the value of the fechaCreacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaCreacion(String value) {
        this.fechaCreacion = value;
    }

    /**
     * Gets the value of the contenido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * Sets the value of the contenido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContenido(String value) {
        this.contenido = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * Gets the value of the paginas property.
     * 
     * @return
     *     possible object is
     *     {@link TipoPaginas }
     *     
     */
    public TipoPaginas getPaginas() {
        return paginas;
    }

    /**
     * Sets the value of the paginas property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPaginas }
     *     
     */
    public void setPaginas(TipoPaginas value) {
        this.paginas = value;
    }

}
