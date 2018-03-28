package co.gov.colpensiones.beps.schemas._1_0.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.beps.comunes.anotaciones.DateValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.IgnoreNullsValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.NotNullValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.ObjectValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.RegexValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.StringLengthValidator;
import co.gov.colpensiones.beps.schemas._1_0.comun.TipoDocumentos;

/**
 * <p>
 * Java class for tipoSolicitudDestinacionRecursos complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoSolicitudDestinacionRecursos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoSolicitud" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaRegistro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaConstanciaEjecutoria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trasladoSGPaBEPS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroRadicacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroRadicacionPadre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoCanalRadicacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="usuarioSistemaRadicacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="usuarioAnalista" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="usuarioRevisor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destinacionesRecursos" type="{http://www.colpensiones.gov.co/beps/schemas/1.0/prestacioneseconomicas}tipoDestinacionesRecursos"/>
 *         &lt;element name="documentos" type="{http://www.colpensiones.gov.co/beps/schemas/1.0/comun}tipoDocumentos"/>
 *         &lt;element name="informacionVinculado" type="{http://www.colpensiones.gov.co/beps/schemas/1.0/prestacioneseconomicas}tipoInformacionVinculadoSolicitud"/>
 *         &lt;element name="informacionTercero" type="{http://www.colpensiones.gov.co/beps/schemas/1.0/prestacioneseconomicas}tipoInformacionTercero"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoSolicitudDestinacionRecursos", propOrder = { "tipoSolicitud", "fechaRegistro", "fechaConstanciaEjecutoria",
        "trasladoSGPaBEPS", "numeroRadicacion", "numeroRadicacionPadre", "codigoCanalRadicacion", "usuarioSistemaRadicacion",
        "usuarioAnalista", "usuarioRevisor", "destinacionesRecursos", "documentos", "informacionVinculado", "informacionTercero" })
@XmlRootElement
public class TipoSolicitudDestinacionRecursos {

    @XmlElement(required = true, nillable = true)
    protected String tipoSolicitud;
    @XmlElement(required = true, nillable = true)
    protected String fechaRegistro;
    @XmlElement(nillable = true)
    protected String fechaConstanciaEjecutoria;
    @XmlElement(required = true, nillable = true)
    protected String trasladoSGPaBEPS;
    @XmlElement(required = true, nillable = true)
    protected String numeroRadicacion;
    @XmlElement(nillable = true)
    protected String numeroRadicacionPadre;
    @XmlElement(required = true, nillable = true)
    protected String codigoCanalRadicacion;
    @XmlElement(required = true, nillable = true)
    protected String usuarioSistemaRadicacion;
    @XmlElement(nillable = true)
    protected String usuarioAnalista;
    @XmlElement(nillable = true)
    protected String usuarioRevisor;
    @XmlElement(nillable = true)
    protected TipoDestinacionesRecursos destinacionesRecursos;
    @XmlElement(required = true, nillable = true)
    protected TipoDocumentos documentos;
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionVinculadoSolicitud informacionVinculado;
    @XmlElement(nillable = true)
    protected TipoInformacionTercero informacionTercero;

    /**
     * Gets the value of the tipoSolicitud property.
     * 
     * @return possible object is {@link String }
     * 
     */
    @NotNullValidator
    @StringLengthValidator(min = 2, max = 2, message ="{0} debe de tener una longitud de 2 caracteres.")
    @RegexValidator(pattern="^(01|02)$", message="{0} no es válido, debe ingresar alguna de las siguientes opciones: 01, 02.")
    public String getTipoSolicitud() {
        return tipoSolicitud;
    }

    /**
     * Sets the value of the tipoSolicitud property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTipoSolicitud(String value) {
        this.tipoSolicitud = value;
    }

    /**
     * Gets the value of the fechaRegistro property.
     * 
     * @return possible object is {@link String }
     * 
     */
    @NotNullValidator
    @DateValidator(validarFechaActual = true)
    @StringLengthValidator(min = 8, max = 8, message = "{0} debe tener una longitud de 8 caracteres")
    public String getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * Sets the value of the fechaRegistro property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setFechaRegistro(String value) {
        this.fechaRegistro = value;
    }

    /**
     * Gets the value of the fechaConstanciaEjecutoria property.
     * 
     * @return possible object is {@link String }
     * 
     */
    @IgnoreNullsValidator
    @DateValidator
    @StringLengthValidator(min = 8, max = 8, message = "{0} debe tener una longitud de 8 caracteres")
    public String getFechaConstanciaEjecutoria() {
        return fechaConstanciaEjecutoria;
    }

    /**
     * Sets the value of the fechaConstanciaEjecutoria property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setFechaConstanciaEjecutoria(String value) {
        this.fechaConstanciaEjecutoria = value;
    }

    /**
     * Gets the value of the trasladoSGPaBEPS property.
     * 
     * @return possible object is {@link String }
     * 
     */
    @NotNullValidator
    @RegexValidator(pattern ="^(S|N)+$", message = "{0} no es válido, debe ingresar alguna de las siguientes opciones: S, N")
    @StringLengthValidator(min = 1, max = 1, message = "{0} debe tener una longitud de 1 caracter")
    public String getTrasladoSGPaBEPS() {
        return trasladoSGPaBEPS;
    }

    /**
     * Sets the value of the trasladoSGPaBEPS property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTrasladoSGPaBEPS(String value) {
        this.trasladoSGPaBEPS = value;
    }

    /**
     * Gets the value of the numeroRadicacion property.
     * 
     * @return possible object is {@link String }
     * 
     */
    @NotNullValidator
    @RegexValidator(pattern ="[0-9_]+", message = "{0} no es válido, debe ingresar solo números y un guión bajo.")
    @StringLengthValidator(min = 1, max = 50, message = "{0} debe tener una longitud de mínimo 1 y máximo 50 caracteres.")
    public String getNumeroRadicacion() {
        return numeroRadicacion;
    }

    /**
     * Sets the value of the numeroRadicacion property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setNumeroRadicacion(String value) {
        this.numeroRadicacion = value;
    }

    /**
     * Gets the value of the numeroRadicacionPadre property.
     * 
     * @return possible object is {@link String }
     * 
     */
    @IgnoreNullsValidator
    @RegexValidator(pattern ="[0-9_]+", message = "{0} no es válido, debe ingresar solo números y un guión bajo.")
    @StringLengthValidator(min = 1, max = 50, message = "{0} debe tener una longitud de mínimo 1 y máximo 50 caracteres.")
    public String getNumeroRadicacionPadre() {
        return numeroRadicacionPadre;
    }

    /**
     * Sets the value of the numeroRadicacionPadre property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setNumeroRadicacionPadre(String value) {
        this.numeroRadicacionPadre = value;
    }

    /**
     * Gets the value of the codigoCanalRadicacion property.
     * 
     * @return possible object is {@link String }
     * 
     */
    @NotNullValidator
    @RegexValidator(pattern ="[0-9]+", message = "{0} no es válido, debe ingresar solo números.")
    @StringLengthValidator(min = 2, max = 2, message = "{0} debe tener una longitud de 2 caracteres.")
    public String getCodigoCanalRadicacion() {
        return codigoCanalRadicacion;
    }

    /**
     * Sets the value of the codigoCanalRadicacion property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setCodigoCanalRadicacion(String value) {
        this.codigoCanalRadicacion = value;
    }

    /**
     * Gets the value of the usuarioSistemaRadicacion property.
     * 
     * @return possible object is {@link String }
     * 
     */
    @NotNullValidator
    @StringLengthValidator(min = 5, max = 60, message = "{0} debe tener una longitud de mínimo 5 y máximo 60 caracteres.")
    public String getUsuarioSistemaRadicacion() {
        return usuarioSistemaRadicacion;
    }

    /**
     * Sets the value of the usuarioSistemaRadicacion property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setUsuarioSistemaRadicacion(String value) {
        this.usuarioSistemaRadicacion = value;
    }

    /**
     * Gets the value of the usuarioAnalista property.
     * 
     * @return possible object is {@link String }
     * 
     */
    @IgnoreNullsValidator
    @StringLengthValidator(min = 5, max = 60, message = "{0} debe tener una longitud de mínimo 5 y máximo 60 caracteres.")
    public String getUsuarioAnalista() {
        return usuarioAnalista;
    }

    /**
     * Sets the value of the usuarioAnalista property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setUsuarioAnalista(String value) {
        this.usuarioAnalista = value;
    }

    /**
     * Gets the value of the usuarioRevisor property.
     * 
     * @return possible object is {@link String }
     * 
     */
    @IgnoreNullsValidator
    @StringLengthValidator(min = 5, max = 60, message = "{0} debe tener una longitud de mínimo 5 y máximo 60 caracteres.")
    public String getUsuarioRevisor() {
        return usuarioRevisor;
    }

    /**
     * Sets the value of the usuarioRevisor property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setUsuarioRevisor(String value) {
        this.usuarioRevisor = value;
    }

    /**
     * Gets the value of the destinacionesRecursos property.
     * 
     * @return possible object is {@link TipoDestinacionesRecursos }
     * 
     */
    @ObjectValidator
    public TipoDestinacionesRecursos getDestinacionesRecursos() {
        return destinacionesRecursos;
    }

    /**
     * Sets the value of the destinacionesRecursos property.
     * 
     * @param value
     *            allowed object is {@link TipoDestinacionesRecursos }
     * 
     */
    public void setDestinacionesRecursos(TipoDestinacionesRecursos value) {
        this.destinacionesRecursos = value;
    }

    /**
     * Gets the value of the documentos property.
     * 
     * @return possible object is {@link TipoDocumentos }
     * 
     */
    @ObjectValidator
    public TipoDocumentos getDocumentos() {
        return documentos;
    }

    /**
     * Sets the value of the documentos property.
     * 
     * @param value
     *            allowed object is {@link TipoDocumentos }
     * 
     */
    public void setDocumentos(TipoDocumentos value) {
        this.documentos = value;
    }

    /**
     * Gets the value of the informacionVinculado property.
     * 
     * @return possible object is {@link TipoInformacionVinculadoSolicitud }
     * 
     */
    public TipoInformacionVinculadoSolicitud getInformacionVinculado() {
        return informacionVinculado;
    }

    /**
     * Sets the value of the informacionVinculado property.
     * 
     * @param value
     *            allowed object is {@link TipoInformacionVinculadoSolicitud }
     * 
     */
    public void setInformacionVinculado(TipoInformacionVinculadoSolicitud value) {
        this.informacionVinculado = value;
    }

    /**
     * Gets the value of the informacionTercero property.
     * 
     * @return possible object is {@link TipoInformacionTercero }
     * 
     */
    @IgnoreNullsValidator
    @ObjectValidator
    public TipoInformacionTercero getInformacionTercero() {
        return informacionTercero;
    }

    /**
     * Sets the value of the informacionTercero property.
     * 
     * @param value
     *            allowed object is {@link TipoInformacionTercero }
     * 
     */
    public void setInformacionTercero(TipoInformacionTercero value) {
        this.informacionTercero = value;
    }

}
