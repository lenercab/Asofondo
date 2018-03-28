package co.gov.colpensiones.beps.schemas._1_0.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.beps.comunes.anotaciones.IgnoreNullsValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.NotNullValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.ObjectValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.RegexValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.StringLengthValidator;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoCiudad;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoDepartamento;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoDocumentoPersonaNatural;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoInformacionUbicacionPersona;

/**
 * <p>
 * Java class for tipoInformacionVinculadoSolicitud complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionVinculadoSolicitud">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacion" type="{http://www.colpensiones.gov.co/beps/schemas/1.0/personas}tipoDocumentoPersonaNatural"/>
 *         &lt;element name="departamentoNacimiento" type="{http://www.colpensiones.gov.co/beps/schemas/1.0/personas}tipoDepartamento"/>
 *         &lt;element name="municipioNacimiento" type="{http://www.colpensiones.gov.co/beps/schemas/1.0/personas}tipoCiudad"/>
 *         &lt;element name="codigoAFP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="autorizacionEnvioComunicacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="autorizacionManejoInformacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="autorizaTerminosColombiaMayor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="informacionUbicacion" type="{http://www.colpensiones.gov.co/beps/schemas/1.0/personas}tipoInformacionUbicacionPersona"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionVinculadoSolicitud", propOrder = { "identificacion", "departamentoNacimiento", "municipioNacimiento",
        "codigoAFP", "autorizacionEnvioComunicacion", "autorizacionManejoInformacion", "autorizaTerminosColombiaMayor",
        "informacionUbicacion" })
public class TipoInformacionVinculadoSolicitud {

    @XmlElement(required = true, nillable = true)
    protected TipoDocumentoPersonaNatural identificacion;
    @XmlElement(nillable = true)
    protected TipoDepartamento departamentoNacimiento;
    @XmlElement(nillable = true)
    protected TipoCiudad municipioNacimiento;
    @XmlElement(nillable = true)
    protected String codigoAFP;
    @XmlElement(required = true)
    protected String autorizacionEnvioComunicacion;
    @XmlElement(required = true)
    protected String autorizacionManejoInformacion;
    @XmlElement(required = true, nillable = true)
    protected String autorizaTerminosColombiaMayor;
    @XmlElement(nillable = true)
    protected TipoInformacionUbicacionPersona informacionUbicacion;

    /**
     * Gets the value of the identificacion property.
     * 
     * @return possible object is {@link TipoDocumentoPersonaNatural }
     * 
     */
    @NotNullValidator
    @ObjectValidator
    public TipoDocumentoPersonaNatural getIdentificacion() {
        return identificacion;
    }

    /**
     * Sets the value of the identificacion property.
     * 
     * @param value
     *            allowed object is {@link TipoDocumentoPersonaNatural }
     * 
     */
    public void setIdentificacion(TipoDocumentoPersonaNatural value) {
        this.identificacion = value;
    }

    /**
     * Gets the value of the departamentoNacimiento property.
     * 
     * @return possible object is {@link TipoDepartamento }
     * 
     */
    @IgnoreNullsValidator
    @ObjectValidator
    public TipoDepartamento getDepartamentoNacimiento() {
        return departamentoNacimiento;
    }

    /**
     * Sets the value of the departamentoNacimiento property.
     * 
     * @param value
     *            allowed object is {@link TipoDepartamento }
     * 
     */
    public void setDepartamentoNacimiento(TipoDepartamento value) {
        this.departamentoNacimiento = value;
    }

    /**
     * Gets the value of the municipioNacimiento property.
     * 
     * @return possible object is {@link TipoCiudad }
     * 
     */
    @IgnoreNullsValidator
    @ObjectValidator
    public TipoCiudad getMunicipioNacimiento() {
        return municipioNacimiento;
    }

    /**
     * Sets the value of the municipioNacimiento property.
     * 
     * @param value
     *            allowed object is {@link TipoCiudad }
     * 
     */
    public void setMunicipioNacimiento(TipoCiudad value) {
        this.municipioNacimiento = value;
    }

    /**
     * Gets the value of the codigoAFP property.
     * 
     * @return possible object is {@link String }
     * 
     */
    @IgnoreNullsValidator
    @RegexValidator(pattern ="[0-9]+", message = "{0} no es válido, debe ingresar solo números.")
    @StringLengthValidator(min = 2, max = 2, message = "{0} debe tener una longitud de 2 caracteres.")
    public String getCodigoAFP() {
        return codigoAFP;
    }

    /**
     * Sets the value of the codigoAFP property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setCodigoAFP(String value) {
        this.codigoAFP = value;
    }

    /**
     * Gets the value of the autorizacionEnvioComunicacion property.
     * 
     * @return possible object is {@link String }
     * 
     */
    @NotNullValidator
    @RegexValidator(pattern ="^(S|N)+$", message = "{0} no es válido, debe ingresar alguna de las siguientes opciones: S, N")
    @StringLengthValidator(min = 1, max = 1, message = "{0} debe tener una longitud de 1 caracter")
    public String getAutorizacionEnvioComunicacion() {
        return autorizacionEnvioComunicacion;
    }

    /**
     * Sets the value of the autorizacionEnvioComunicacion property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setAutorizacionEnvioComunicacion(String value) {
        this.autorizacionEnvioComunicacion = value;
    }

    /**
     * Gets the value of the autorizacionManejoInformacion property.
     * 
     * @return possible object is {@link String }
     * 
     */
    @NotNullValidator
    @RegexValidator(pattern ="^(S|N)+$", message = "{0} no es válido, debe ingresar alguna de las siguientes opciones: S, N")
    @StringLengthValidator(min = 1, max = 1, message = "{0} debe tener una longitud de 1 caracter")
    public String getAutorizacionManejoInformacion() {
        return autorizacionManejoInformacion;
    }

    /**
     * Sets the value of the autorizacionManejoInformacion property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setAutorizacionManejoInformacion(String value) {
        this.autorizacionManejoInformacion = value;
    }

    /**
     * Gets the value of the autorizaTerminosColombiaMayor property.
     * 
     * @return possible object is {@link String }
     * 
     */
    @NotNullValidator
    @RegexValidator(pattern ="^(S|N)+$", message = "{0} no es válido, debe ingresar alguna de las siguientes opciones: S, N")
    @StringLengthValidator(min = 1, max = 1, message = "{0} debe tener una longitud de 1 caracter")
    public String getAutorizaTerminosColombiaMayor() {
        return autorizaTerminosColombiaMayor;
    }

    /**
     * Sets the value of the autorizaTerminosColombiaMayor property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setAutorizaTerminosColombiaMayor(String value) {
        this.autorizaTerminosColombiaMayor = value;
    }

    /**
     * Gets the value of the informacionUbicacion property.
     * 
     * @return possible object is {@link TipoInformacionUbicacionPersona }
     * 
     */
    @ObjectValidator
    public TipoInformacionUbicacionPersona getInformacionUbicacion() {
        return informacionUbicacion;
    }

    /**
     * Sets the value of the informacionUbicacion property.
     * 
     * @param value
     *            allowed object is {@link TipoInformacionUbicacionPersona }
     * 
     */
    public void setInformacionUbicacion(TipoInformacionUbicacionPersona value) {
        this.informacionUbicacion = value;
    }

}
