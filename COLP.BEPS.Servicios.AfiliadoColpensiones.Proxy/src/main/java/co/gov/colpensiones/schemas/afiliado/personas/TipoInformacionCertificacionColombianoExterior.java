
package co.gov.colpensiones.schemas.afiliado.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionCertificacionColombianoExterior complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionCertificacionColombianoExterior">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="esColombianoEnExterior" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="retiradoPrograma" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionCertificacionColombianoExterior", propOrder = {
    "esColombianoEnExterior",
    "retiradoPrograma"
})
public class TipoInformacionCertificacionColombianoExterior {

    protected boolean esColombianoEnExterior;
    protected boolean retiradoPrograma;

    /**
     * Gets the value of the esColombianoEnExterior property.
     * 
     */
    public boolean isEsColombianoEnExterior() {
        return esColombianoEnExterior;
    }

    /**
     * Sets the value of the esColombianoEnExterior property.
     * 
     */
    public void setEsColombianoEnExterior(boolean value) {
        this.esColombianoEnExterior = value;
    }

    /**
     * Gets the value of the retiradoPrograma property.
     * 
     */
    public boolean isRetiradoPrograma() {
        return retiradoPrograma;
    }

    /**
     * Sets the value of the retiradoPrograma property.
     * 
     */
    public void setRetiradoPrograma(boolean value) {
        this.retiradoPrograma = value;
    }

}
