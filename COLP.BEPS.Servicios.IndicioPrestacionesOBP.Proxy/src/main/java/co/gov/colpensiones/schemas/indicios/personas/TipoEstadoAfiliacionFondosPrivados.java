
package co.gov.colpensiones.schemas.indicios.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoEstadoAfiliacionFondosPrivados complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoEstadoAfiliacionFondosPrivados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indicadorRAIS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="indicadorSISGeneral" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="codigoNovedadRespuesta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEstadoAfiliacionFondosPrivados", propOrder = {
    "indicadorRAIS",
    "indicadorSISGeneral",
    "codigoNovedadRespuesta"
})
public class TipoEstadoAfiliacionFondosPrivados {

    protected boolean indicadorRAIS;
    protected boolean indicadorSISGeneral;
    @XmlElement(required = true, nillable = true)
    protected String codigoNovedadRespuesta;

    /**
     * Gets the value of the indicadorRAIS property.
     * 
     */
    public boolean isIndicadorRAIS() {
        return indicadorRAIS;
    }

    /**
     * Sets the value of the indicadorRAIS property.
     * 
     */
    public void setIndicadorRAIS(boolean value) {
        this.indicadorRAIS = value;
    }

    /**
     * Gets the value of the indicadorSISGeneral property.
     * 
     */
    public boolean isIndicadorSISGeneral() {
        return indicadorSISGeneral;
    }

    /**
     * Sets the value of the indicadorSISGeneral property.
     * 
     */
    public void setIndicadorSISGeneral(boolean value) {
        this.indicadorSISGeneral = value;
    }

    /**
     * Gets the value of the codigoNovedadRespuesta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoNovedadRespuesta() {
        return codigoNovedadRespuesta;
    }

    /**
     * Sets the value of the codigoNovedadRespuesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoNovedadRespuesta(String value) {
        this.codigoNovedadRespuesta = value;
    }

}
