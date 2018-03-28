
package co.gov.colpensiones.schemas._1_0.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoRegistroHistoricoNovedad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoRegistroHistoricoNovedad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="estadoHistorico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoNovedad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoRegistroHistoricoNovedad", propOrder = {
    "estadoHistorico",
    "codigoNovedad"
})
public class TipoRegistroHistoricoNovedad {

    protected String estadoHistorico;
    protected String codigoNovedad;

    /**
     * Gets the value of the estadoHistorico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoHistorico() {
        return estadoHistorico;
    }

    /**
     * Sets the value of the estadoHistorico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoHistorico(String value) {
        this.estadoHistorico = value;
    }

    /**
     * Gets the value of the codigoNovedad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoNovedad() {
        return codigoNovedad;
    }

    /**
     * Sets the value of the codigoNovedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoNovedad(String value) {
        this.codigoNovedad = value;
    }

}
