
package co.gov.colpensiones.schemas._1_0.pagoprestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import co.gov.colpensiones.schemas._1_0.personas.TipoIdentificacionPersona;
import co.gov.colpensiones.schemas._1_0.personas.TipoInformacionBasicaPersonaNatural;


/**
 * <p>Java class for tipoMiembroFamiliarPension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoMiembroFamiliarPension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacion" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoIdentificacionPersona"/>
 *         &lt;element name="informacionBasica" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionBasicaPersonaNatural"/>
 *         &lt;element name="identificadorAfiliacionPension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.colpensiones.gov.co/schemas/1.0/pagoprestacioneseconomicas}tipoEstadoPension"/>
 *         &lt;element name="tipoPension" type="{http://www.colpensiones.gov.co/schemas/1.0/pagoprestacioneseconomicas}tipoTipoPension"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoMiembroFamiliarPension", propOrder = {
    "identificacion",
    "informacionBasica",
    "identificadorAfiliacionPension",
    "estado",
    "tipoPension"
})
public class TipoMiembroFamiliarPension {

    @XmlElement(required = true, nillable = true)
    protected TipoIdentificacionPersona identificacion;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionBasicaPersonaNatural informacionBasica;
    protected String identificadorAfiliacionPension;
    @XmlElement(required = true, nillable = true)
    protected TipoEstadoPension estado;
    @XmlElement(required = true, nillable = true)
    protected TipoTipoPension tipoPension;

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
     * Gets the value of the identificadorAfiliacionPension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorAfiliacionPension() {
        return identificadorAfiliacionPension;
    }

    /**
     * Sets the value of the identificadorAfiliacionPension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorAfiliacionPension(String value) {
        this.identificadorAfiliacionPension = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link TipoEstadoPension }
     *     
     */
    public TipoEstadoPension getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEstadoPension }
     *     
     */
    public void setEstado(TipoEstadoPension value) {
        this.estado = value;
    }

    /**
     * Gets the value of the tipoPension property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTipoPension }
     *     
     */
    public TipoTipoPension getTipoPension() {
        return tipoPension;
    }

    /**
     * Sets the value of the tipoPension property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTipoPension }
     *     
     */
    public void setTipoPension(TipoTipoPension value) {
        this.tipoPension = value;
    }

}
