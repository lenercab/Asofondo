
package co.gov.colpensiones.schemas.afiliado.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionIdentificacionPersonaJuridica complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionIdentificacionPersonaJuridica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nit" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoNIT"/>
 *         &lt;element name="nombre" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionBasicaPersonaJuridica"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionIdentificacionPersonaJuridica", propOrder = {
    "nit",
    "nombre"
})
public class TipoInformacionIdentificacionPersonaJuridica {

    @XmlElement(required = true, nillable = true)
    protected TipoNIT nit;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionBasicaPersonaJuridica nombre;

    /**
     * Gets the value of the nit property.
     * 
     * @return
     *     possible object is
     *     {@link TipoNIT }
     *     
     */
    public TipoNIT getNit() {
        return nit;
    }

    /**
     * Sets the value of the nit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoNIT }
     *     
     */
    public void setNit(TipoNIT value) {
        this.nit = value;
    }

    /**
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionBasicaPersonaJuridica }
     *     
     */
    public TipoInformacionBasicaPersonaJuridica getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionBasicaPersonaJuridica }
     *     
     */
    public void setNombre(TipoInformacionBasicaPersonaJuridica value) {
        this.nombre = value;
    }

}
