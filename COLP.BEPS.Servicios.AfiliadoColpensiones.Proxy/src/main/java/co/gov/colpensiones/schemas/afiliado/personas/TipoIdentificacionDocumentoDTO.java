
package co.gov.colpensiones.schemas.afiliado.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.afiliado.comun.TipoCredencialesAutorizacion;


/**
 * <p>Java class for tipoIdentificacionDocumentoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoIdentificacionDocumentoDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Contexto" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoCredencialesAutorizacion"/>
 *         &lt;element name="Detalle" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionDocumento"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoIdentificacionDocumentoDTO", propOrder = {
    "contexto",
    "detalle"
})
public class TipoIdentificacionDocumentoDTO {

    @XmlElement(name = "Contexto", required = true)
    protected TipoCredencialesAutorizacion contexto;
    @XmlElement(name = "Detalle", required = true)
    protected TipoIdentificacionDocumento detalle;

    /**
     * Gets the value of the contexto property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCredencialesAutorizacion }
     *     
     */
    public TipoCredencialesAutorizacion getContexto() {
        return contexto;
    }

    /**
     * Sets the value of the contexto property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCredencialesAutorizacion }
     *     
     */
    public void setContexto(TipoCredencialesAutorizacion value) {
        this.contexto = value;
    }

    /**
     * Gets the value of the detalle property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificacionDocumento }
     *     
     */
    public TipoIdentificacionDocumento getDetalle() {
        return detalle;
    }

    /**
     * Sets the value of the detalle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificacionDocumento }
     *     
     */
    public void setDetalle(TipoIdentificacionDocumento value) {
        this.detalle = value;
    }

}
