
package co.gov.colpensiones.schemas._1_0.comun;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoCriteriosConsultaProcesoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoCriteriosConsultaProcesoDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Criterios" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoPropiedadesCertificado"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoCriteriosConsultaProcesoDTO", propOrder = {
    "criterios"
})
public class TipoCriteriosConsultaProcesoDTO {

    @XmlElement(name = "Criterios", required = true, nillable = true)
    protected TipoPropiedadesCertificado criterios;

    /**
     * Gets the value of the criterios property.
     * 
     * @return
     *     possible object is
     *     {@link TipoPropiedadesCertificado }
     *     
     */
    public TipoPropiedadesCertificado getCriterios() {
        return criterios;
    }

    /**
     * Sets the value of the criterios property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPropiedadesCertificado }
     *     
     */
    public void setCriterios(TipoPropiedadesCertificado value) {
        this.criterios = value;
    }

}
