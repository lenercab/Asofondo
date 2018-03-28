
package co.gov.colpensiones.schemas._1_0.pagoprestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import co.gov.colpensiones.schemas._1_0.comun.TipoControlCambios;
import co.gov.colpensiones.schemas._1_0.personas.TipoIdentificacionPersona;


/**
 * <p>Java class for tipoCriterioConsultaPensionado complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoCriterioConsultaPensionado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Contexto" type="{http://www.colpensiones.gov.co/schemas/1.0/comun}tipoControlCambios"/>
 *         &lt;element name="Detalle" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionPersona"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoCriterioConsultaPensionado", propOrder = {
    "contexto",
    "detalle"
})
public class TipoCriterioConsultaPensionado {

    @XmlElement(name = "Contexto", required = true, nillable = true)
    protected TipoControlCambios contexto;
    @XmlElement(name = "Detalle", required = true, nillable = true)
    protected TipoIdentificacionPersona detalle;

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
     *     {@link TipoIdentificacionPersona }
     *     
     */
    public TipoIdentificacionPersona getDetalle() {
        return detalle;
    }

    /**
     * Sets the value of the detalle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificacionPersona }
     *     
     */
    public void setDetalle(TipoIdentificacionPersona value) {
        this.detalle = value;
    }

}
