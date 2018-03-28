
package co.gov.colpensiones.schemas._1_0.pagoprestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import co.gov.colpensiones.schemas._1_0.personas.TipoInformacionBasicaPersonaNatural;


/**
 * <p>Java class for tipoInformacionAportesSalud complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionAportesSalud">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionPersonal" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionBasicaPersonaNatural"/>
 *         &lt;element name="fechaVinculacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pensionesAportesSalud" type="{http://www.colpensiones.gov.co/schemas/1.0/pagoprestacioneseconomicas}tipoPensionesAportesSalud"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionAportesSalud", propOrder = {
    "informacionPersonal",
    "fechaVinculacion",
    "pensionesAportesSalud"
})
public class TipoInformacionAportesSalud {

    @XmlElement(required = true, nillable = true)
    protected TipoInformacionBasicaPersonaNatural informacionPersonal;
    @XmlElement(required = true, nillable = true)
    protected String fechaVinculacion;
    @XmlElement(required = true, nillable = true)
    protected TipoPensionesAportesSalud pensionesAportesSalud;

    /**
     * Gets the value of the informacionPersonal property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionBasicaPersonaNatural }
     *     
     */
    public TipoInformacionBasicaPersonaNatural getInformacionPersonal() {
        return informacionPersonal;
    }

    /**
     * Sets the value of the informacionPersonal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionBasicaPersonaNatural }
     *     
     */
    public void setInformacionPersonal(TipoInformacionBasicaPersonaNatural value) {
        this.informacionPersonal = value;
    }

    /**
     * Gets the value of the fechaVinculacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaVinculacion() {
        return fechaVinculacion;
    }

    /**
     * Sets the value of the fechaVinculacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaVinculacion(String value) {
        this.fechaVinculacion = value;
    }

    /**
     * Gets the value of the pensionesAportesSalud property.
     * 
     * @return
     *     possible object is
     *     {@link TipoPensionesAportesSalud }
     *     
     */
    public TipoPensionesAportesSalud getPensionesAportesSalud() {
        return pensionesAportesSalud;
    }

    /**
     * Sets the value of the pensionesAportesSalud property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPensionesAportesSalud }
     *     
     */
    public void setPensionesAportesSalud(TipoPensionesAportesSalud value) {
        this.pensionesAportesSalud = value;
    }

}
