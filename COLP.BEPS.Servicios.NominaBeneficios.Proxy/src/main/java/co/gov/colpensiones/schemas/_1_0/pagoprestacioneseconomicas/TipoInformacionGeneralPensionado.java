
package co.gov.colpensiones.schemas._1_0.pagoprestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import co.gov.colpensiones.schemas._1_0.personas.TipoInformacionBasicaPersonaNatural;
import co.gov.colpensiones.schemas._1_0.personas.TipoInformacionComplementariaPersonaNatural;
import co.gov.colpensiones.schemas._1_0.personas.TipoInformacionUbicacionPersona;


/**
 * <p>Java class for tipoInformacionGeneralPensionado complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionGeneralPensionado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionBasica" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionBasicaPersonaNatural" minOccurs="0"/>
 *         &lt;element name="informacionComplementaria" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionComplementariaPersonaNatural"/>
 *         &lt;element name="ubicacion" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionUbicacionPersona"/>
 *         &lt;element name="estaVivo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionGeneralPensionado", propOrder = {
    "informacionBasica",
    "informacionComplementaria",
    "ubicacion",
    "estaVivo"
})
public class TipoInformacionGeneralPensionado {

    protected TipoInformacionBasicaPersonaNatural informacionBasica;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionComplementariaPersonaNatural informacionComplementaria;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionUbicacionPersona ubicacion;
    @XmlElement(required = true, nillable = true)
    protected String estaVivo;

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
     * Gets the value of the ubicacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionUbicacionPersona }
     *     
     */
    public TipoInformacionUbicacionPersona getUbicacion() {
        return ubicacion;
    }

    /**
     * Sets the value of the ubicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionUbicacionPersona }
     *     
     */
    public void setUbicacion(TipoInformacionUbicacionPersona value) {
        this.ubicacion = value;
    }

    /**
     * Gets the value of the estaVivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstaVivo() {
        return estaVivo;
    }

    /**
     * Sets the value of the estaVivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstaVivo(String value) {
        this.estaVivo = value;
    }

}
