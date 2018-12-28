
package co.gov.colpensiones.schemas._1_0.pagoprestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import co.gov.colpensiones.schemas._1_0.personas.TipoInformacionBasicaPersonaNatural;


/**
 * <p>Java class for tipoInformacionExistenciaPension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionExistenciaPension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="esPensionadoPeriodo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="esPensionado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="primerPeriodoCertificado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="informacionPersonal" type="{http://www.colpensiones.gov.co/schemas/1.0/personas}tipoInformacionBasicaPersonaNatural"/>
 *         &lt;element name="indemnizaciones" type="{http://www.colpensiones.gov.co/schemas/1.0/pagoprestacioneseconomicas}tipoIndemnizaciones"/>
 *         &lt;element name="pensionesRetiradas" type="{http://www.colpensiones.gov.co/schemas/1.0/pagoprestacioneseconomicas}tipoPensionesRetiradas"/>
 *         &lt;element name="pensionesVigentes" type="{http://www.colpensiones.gov.co/schemas/1.0/pagoprestacioneseconomicas}tipoPensionesVigentes"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionExistenciaPension", propOrder = {
    "esPensionadoPeriodo",
    "esPensionado",
    "primerPeriodoCertificado",
    "informacionPersonal",
    "indemnizaciones",
    "pensionesRetiradas",
    "pensionesVigentes"
})
public class TipoInformacionExistenciaPension {

    protected boolean esPensionadoPeriodo;
    protected boolean esPensionado;
    @XmlElement(required = true, nillable = true)
    protected String primerPeriodoCertificado;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionBasicaPersonaNatural informacionPersonal;
    @XmlElement(required = true, nillable = true)
    protected TipoIndemnizaciones indemnizaciones;
    @XmlElement(required = true, nillable = true)
    protected TipoPensionesRetiradas pensionesRetiradas;
    @XmlElement(required = true, nillable = true)
    protected TipoPensionesVigentes pensionesVigentes;

    /**
     * Gets the value of the esPensionadoPeriodo property.
     * 
     */
    public boolean isEsPensionadoPeriodo() {
        return esPensionadoPeriodo;
    }

    /**
     * Sets the value of the esPensionadoPeriodo property.
     * 
     */
    public void setEsPensionadoPeriodo(boolean value) {
        this.esPensionadoPeriodo = value;
    }

    /**
     * Gets the value of the esPensionado property.
     * 
     */
    public boolean isEsPensionado() {
        return esPensionado;
    }

    /**
     * Sets the value of the esPensionado property.
     * 
     */
    public void setEsPensionado(boolean value) {
        this.esPensionado = value;
    }

    /**
     * Gets the value of the primerPeriodoCertificado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerPeriodoCertificado() {
        return primerPeriodoCertificado;
    }

    /**
     * Sets the value of the primerPeriodoCertificado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerPeriodoCertificado(String value) {
        this.primerPeriodoCertificado = value;
    }

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
     * Gets the value of the indemnizaciones property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIndemnizaciones }
     *     
     */
    public TipoIndemnizaciones getIndemnizaciones() {
        return indemnizaciones;
    }

    /**
     * Sets the value of the indemnizaciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIndemnizaciones }
     *     
     */
    public void setIndemnizaciones(TipoIndemnizaciones value) {
        this.indemnizaciones = value;
    }

    /**
     * Gets the value of the pensionesRetiradas property.
     * 
     * @return
     *     possible object is
     *     {@link TipoPensionesRetiradas }
     *     
     */
    public TipoPensionesRetiradas getPensionesRetiradas() {
        return pensionesRetiradas;
    }

    /**
     * Sets the value of the pensionesRetiradas property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPensionesRetiradas }
     *     
     */
    public void setPensionesRetiradas(TipoPensionesRetiradas value) {
        this.pensionesRetiradas = value;
    }

    /**
     * Gets the value of the pensionesVigentes property.
     * 
     * @return
     *     possible object is
     *     {@link TipoPensionesVigentes }
     *     
     */
    public TipoPensionesVigentes getPensionesVigentes() {
        return pensionesVigentes;
    }

    /**
     * Sets the value of the pensionesVigentes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPensionesVigentes }
     *     
     */
    public void setPensionesVigentes(TipoPensionesVigentes value) {
        this.pensionesVigentes = value;
    }

}
