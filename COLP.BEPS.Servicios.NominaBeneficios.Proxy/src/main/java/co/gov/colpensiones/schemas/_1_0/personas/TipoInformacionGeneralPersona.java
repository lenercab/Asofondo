
package co.gov.colpensiones.schemas._1_0.personas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionGeneralPersona complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionGeneralPersona">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacion" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionPersona"/>
 *         &lt;element name="informacionBasica" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionBasicaPersonaNatural"/>
 *         &lt;element name="informacionComplementaria" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionComplementariaPersonaNatural"/>
 *         &lt;element name="informacionUbicacionResidencia" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionUbicacionPersona" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionGeneralPersona", propOrder = {
    "identificacion",
    "informacionBasica",
    "informacionComplementaria",
    "informacionUbicacionResidencia"
})
public class TipoInformacionGeneralPersona {

    @XmlElement(required = true, nillable = true)
    protected TipoIdentificacionPersona identificacion;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionBasicaPersonaNatural informacionBasica;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionComplementariaPersonaNatural informacionComplementaria;
    protected TipoInformacionUbicacionPersona informacionUbicacionResidencia;

    /**
     * Gets the value of the identificacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificacionPersona }
     *     
     */
    public TipoIdentificacionPersona getIdentificacion() {
        return identificacion;
    }

    /**
     * Sets the value of the identificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificacionPersona }
     *     
     */
    public void setIdentificacion(TipoIdentificacionPersona value) {
        this.identificacion = value;
    }

    /**
     * Gets the value of the informacionBasica property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionBasicaPersonaNatural }
     *     
     */
    public TipoInformacionBasicaPersonaNatural getInformacionBasica() {
        return informacionBasica;
    }

    /**
     * Sets the value of the informacionBasica property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionBasicaPersonaNatural }
     *     
     */
    public void setInformacionBasica(TipoInformacionBasicaPersonaNatural value) {
        this.informacionBasica = value;
    }

    /**
     * Gets the value of the informacionComplementaria property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionComplementariaPersonaNatural }
     *     
     */
    public TipoInformacionComplementariaPersonaNatural getInformacionComplementaria() {
        return informacionComplementaria;
    }

    /**
     * Sets the value of the informacionComplementaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionComplementariaPersonaNatural }
     *     
     */
    public void setInformacionComplementaria(TipoInformacionComplementariaPersonaNatural value) {
        this.informacionComplementaria = value;
    }

    /**
     * Gets the value of the informacionUbicacionResidencia property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionUbicacionPersona }
     *     
     */
    public TipoInformacionUbicacionPersona getInformacionUbicacionResidencia() {
        return informacionUbicacionResidencia;
    }

    /**
     * Sets the value of the informacionUbicacionResidencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionUbicacionPersona }
     *     
     */
    public void setInformacionUbicacionResidencia(TipoInformacionUbicacionPersona value) {
        this.informacionUbicacionResidencia = value;
    }

}
