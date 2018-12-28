package co.gov.colpensiones.beps.schemas._1_0.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.beps.comunes.anotaciones.IgnoreNullsValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.NotNullValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.ObjectValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.StringLengthValidator;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoAutorizacion;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoDocumentoPersonaNatural;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoInformacionBasicaPersonaNatural;

/**
 * <p>
 * Java class for tipoInformacionTercero complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionTercero">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacion" type="{http://www.colpensiones.gov.co/beps/schemas/1.0/personas}tipoDocumentoPersonaNatural"/>
 *         &lt;element name="nombres" type="{http://www.colpensiones.gov.co/beps/schemas/1.0/personas}tipoInformacionBasicaPersonaNatural"/>
 *         &lt;element name="tipoTercero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroTarjetaProfesional" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="informacionAutorizacion" type="{http://www.colpensiones.gov.co/beps/schemas/1.0/personas}tipoAutorizacion"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionTercero", propOrder = { "identificacion", "nombres", "tipoTercero", "numeroTarjetaProfesional",
        "informacionAutorizacion" })
public class TipoInformacionTercero {

    @XmlElement(required = true)
    protected TipoDocumentoPersonaNatural identificacion;
    @XmlElement(required = true)
    protected TipoInformacionBasicaPersonaNatural nombres;
    @XmlElement(required = true)
    protected String tipoTercero;
    @XmlElement(nillable = true)
    protected String numeroTarjetaProfesional;
    @XmlElement(required = true)
    protected TipoAutorizacion informacionAutorizacion;

    /**
     * Gets the value of the identificacion property.
     * 
     * @return possible object is {@link TipoDocumentoPersonaNatural }
     * 
     */
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
     * Gets the value of the nombres property.
     * 
     * @return possible object is {@link TipoInformacionBasicaPersonaNatural }
     * 
     */
    @NotNullValidator
    public TipoInformacionBasicaPersonaNatural getNombres() {
        return nombres;
    }

    /**
     * Sets the value of the nombres property.
     * 
     * @param value
     *            allowed object is {@link TipoInformacionBasicaPersonaNatural }
     * 
     */
    public void setNombres(TipoInformacionBasicaPersonaNatural value) {
        this.nombres = value;
    }

    /**
     * Gets the value of the tipoTercero property.
     * 
     * @return possible object is {@link String }
     * 
     */
    @NotNullValidator
    @StringLengthValidator(min = 2, max = 2, message = "{0} debe tener una longitud de 2 caracteres.")
    public String getTipoTercero() {
        return tipoTercero;
    }

    /**
     * Sets the value of the tipoTercero property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTipoTercero(String value) {
        this.tipoTercero = value;
    }

    /**
     * Gets the value of the numeroTarjetaProfesional property.
     * 
     * @return possible object is {@link String }
     * 
     */
    @IgnoreNullsValidator
    @StringLengthValidator(min = 1, max = 20, message = "{0} debe tener una longitud de 20 caracteres.")
    public String getNumeroTarjetaProfesional() {
        return numeroTarjetaProfesional;
    }

    /**
     * Sets the value of the numeroTarjetaProfesional property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setNumeroTarjetaProfesional(String value) {
        this.numeroTarjetaProfesional = value;
    }

    /**
     * Gets the value of the informacionAutorizacion property.
     * 
     * @return possible object is {@link TipoAutorizacion }
     * 
     */
    @ObjectValidator
    public TipoAutorizacion getInformacionAutorizacion() {
        return informacionAutorizacion;
    }

    /**
     * Sets the value of the informacionAutorizacion property.
     * 
     * @param value
     *            allowed object is {@link TipoAutorizacion }
     * 
     */
    public void setInformacionAutorizacion(TipoAutorizacion value) {
        this.informacionAutorizacion = value;
    }

}
