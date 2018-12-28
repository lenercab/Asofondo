
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoIdentificacionSolicitudRetiroBEPS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoIdentificacionSolicitudRetiroBEPS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroSolicitudRetiro" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoIdentificacionSolicitudRetiroBEPS", propOrder = {
    "numeroSolicitudRetiro"
})
public class TipoIdentificacionSolicitudRetiroBEPS {

    protected long numeroSolicitudRetiro;

    /**
     * Gets the value of the numeroSolicitudRetiro property.
     * 
     */
    public long getNumeroSolicitudRetiro() {
        return numeroSolicitudRetiro;
    }

    /**
     * Sets the value of the numeroSolicitudRetiro property.
     * 
     */
    public void setNumeroSolicitudRetiro(long value) {
        this.numeroSolicitudRetiro = value;
    }

}
