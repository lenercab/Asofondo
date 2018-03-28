
package co.gov.colpensiones.schemas._1_0.pagoprestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import co.gov.colpensiones.schemas._1_0.personas.TipoInformacionBasicaPersonaNatural;


/**
 * <p>Java class for tipoFiltrosCertificadoPension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoFiltrosCertificadoPension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoCertificado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="generarValores" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="periodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datosPersona" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionBasicaPersonaNatural"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoFiltrosCertificadoPension", propOrder = {
    "tipoCertificado",
    "generarValores",
    "periodo",
    "datosPersona"
})
public class TipoFiltrosCertificadoPension {

    @XmlElement(required = true, nillable = true)
    protected String tipoCertificado;
    protected Boolean generarValores;
    protected String periodo;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionBasicaPersonaNatural datosPersona;

    /**
     * Gets the value of the tipoCertificado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCertificado() {
        return tipoCertificado;
    }

    /**
     * Sets the value of the tipoCertificado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCertificado(String value) {
        this.tipoCertificado = value;
    }

    /**
     * Gets the value of the generarValores property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGenerarValores() {
        return generarValores;
    }

    /**
     * Sets the value of the generarValores property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGenerarValores(Boolean value) {
        this.generarValores = value;
    }

    /**
     * Gets the value of the periodo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodo() {
        return periodo;
    }

    /**
     * Sets the value of the periodo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodo(String value) {
        this.periodo = value;
    }

    /**
     * Gets the value of the datosPersona property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionBasicaPersonaNatural }
     *     
     */
    public TipoInformacionBasicaPersonaNatural getDatosPersona() {
        return datosPersona;
    }

    /**
     * Sets the value of the datosPersona property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionBasicaPersonaNatural }
     *     
     */
    public void setDatosPersona(TipoInformacionBasicaPersonaNatural value) {
        this.datosPersona = value;
    }

}
