
package co.gov.colpensiones.schemas.afiliado.comun;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoCriteriosConsultaPersonalizadaBPM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoCriteriosConsultaPersonalizadaBPM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filtroConsulta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoCriteriosConsultaPersonalizadaBPM", propOrder = {
    "filtroConsulta"
})
public class TipoCriteriosConsultaPersonalizadaBPM {

    @XmlElement(required = true, nillable = true)
    protected String filtroConsulta;

    /**
     * Gets the value of the filtroConsulta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiltroConsulta() {
        return filtroConsulta;
    }

    /**
     * Sets the value of the filtroConsulta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiltroConsulta(String value) {
        this.filtroConsulta = value;
    }

}
