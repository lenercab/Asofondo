
package co.gov.colpensiones.schemas._1_0.pagoprestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import co.gov.colpensiones.schemas._1_0.comun.TipoControlCambios;


/**
 * <p>Java class for tipoCriteriosExistenciaPensionDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoCriteriosExistenciaPensionDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Contexto" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoControlCambios"/>
 *         &lt;element name="Detalle" type="{http://www.colpensiones.gov.co/schemas/1.0/pagoprestacioneseconomicas}tipoCriteriosExistenciaPension"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoCriteriosExistenciaPensionDTO", propOrder = {
    "contexto",
    "detalle"
})
public class TipoCriteriosExistenciaPensionDTO {

    @XmlElement(name = "Contexto", required = true, nillable = true)
    protected TipoControlCambios contexto;
    @XmlElement(name = "Detalle", required = true, nillable = true)
    protected TipoCriteriosExistenciaPension detalle;

    /**
     * Gets the value of the contexto property.
     * 
     * @return
     *     possible object is
     *     {@link TipoControlCambios }
     *     
     */
    public TipoControlCambios getContexto() {
        return contexto;
    }

    /**
     * Sets the value of the contexto property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoControlCambios }
     *     
     */
    public void setContexto(TipoControlCambios value) {
        this.contexto = value;
    }

    /**
     * Gets the value of the detalle property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCriteriosExistenciaPension }
     *     
     */
    public TipoCriteriosExistenciaPension getDetalle() {
        return detalle;
    }

    /**
     * Sets the value of the detalle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCriteriosExistenciaPension }
     *     
     */
    public void setDetalle(TipoCriteriosExistenciaPension value) {
        this.detalle = value;
    }

}
