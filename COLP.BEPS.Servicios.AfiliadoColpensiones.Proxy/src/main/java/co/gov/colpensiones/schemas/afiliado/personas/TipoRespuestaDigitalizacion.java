
package co.gov.colpensiones.schemas.afiliado.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoRespuestaDigitalizacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoRespuestaDigitalizacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numRadicacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombreUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentos" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoDocumentos"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoRespuestaDigitalizacion", propOrder = {
    "numRadicacion",
    "nombreUsuario",
    "documentos"
})
public class TipoRespuestaDigitalizacion {

    @XmlElement(required = true, nillable = true)
    protected String numRadicacion;
    protected String nombreUsuario;
    @XmlElement(required = true, nillable = true)
    protected TipoDocumentos documentos;

    /**
     * Gets the value of the numRadicacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRadicacion() {
        return numRadicacion;
    }

    /**
     * Sets the value of the numRadicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRadicacion(String value) {
        this.numRadicacion = value;
    }

    /**
     * Gets the value of the nombreUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Sets the value of the nombreUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreUsuario(String value) {
        this.nombreUsuario = value;
    }

    /**
     * Gets the value of the documentos property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumentos }
     *     
     */
    public TipoDocumentos getDocumentos() {
        return documentos;
    }

    /**
     * Sets the value of the documentos property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumentos }
     *     
     */
    public void setDocumentos(TipoDocumentos value) {
        this.documentos = value;
    }

}
