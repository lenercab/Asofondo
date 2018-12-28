
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionBasicaPersonaNatural;
import co.gov.colpensiones.schemas.indicios.personas.TipoInformacionComplementariaPersonaNatural;


/**
 * <p>Java class for tipoInformacionGeneralTrabajadorTiemposPublicos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionGeneralTrabajadorTiemposPublicos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionBasicaTrabajador" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionBasicaPersonaNatural"/>
 *         &lt;element name="informacionComplementariaTrabajador" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionComplementariaPersonaNatural" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionGeneralTrabajadorTiemposPublicos", propOrder = {
    "informacionBasicaTrabajador",
    "informacionComplementariaTrabajador"
})
public class TipoInformacionGeneralTrabajadorTiemposPublicos {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionBasicaPersonaNatural informacionBasicaTrabajador;
    protected TipoInformacionComplementariaPersonaNatural informacionComplementariaTrabajador;

    /**
     * Gets the value of the informacionBasicaTrabajador property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionBasicaPersonaNatural }
     *     
     */
    public TipoInformacionBasicaPersonaNatural getInformacionBasicaTrabajador() {
        return informacionBasicaTrabajador;
    }

    /**
     * Sets the value of the informacionBasicaTrabajador property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionBasicaPersonaNatural }
     *     
     */
    public void setInformacionBasicaTrabajador(TipoInformacionBasicaPersonaNatural value) {
        this.informacionBasicaTrabajador = value;
    }

    /**
     * Gets the value of the informacionComplementariaTrabajador property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionComplementariaPersonaNatural }
     *     
     */
    public TipoInformacionComplementariaPersonaNatural getInformacionComplementariaTrabajador() {
        return informacionComplementariaTrabajador;
    }

    /**
     * Sets the value of the informacionComplementariaTrabajador property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionComplementariaPersonaNatural }
     *     
     */
    public void setInformacionComplementariaTrabajador(TipoInformacionComplementariaPersonaNatural value) {
        this.informacionComplementariaTrabajador = value;
    }

}
