package co.gov.colpensiones.beps.schemas._1_0.prestacioneseconomicas;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.beps.comunes.anotaciones.DateValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.NotNullValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.ObjectValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.OptionalFieldValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.RegexValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.StringLengthValidator;
import co.gov.colpensiones.beps.schemas._1_0.comun.TipoDocumentos;

/**
 * <b>Descripción:</b> Estructura que almacena la información de la solicitud de devolución de ahorros a herederos. <br/>
 * <b>Caso de Uso:</b> PT-INGE-014-GOI-OTO-4-FAB-02-RegistrarSolicitudDevolucionAhorrosHerederos <br/>
 * 
 * @author Ana Arevalo <aarevalo@heinsohn.com.co>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoSolicitudDevolucionAhorrosHerederos", propOrder = { "fechaRegistro", "destinacionRecursos", "documentos",
                "tipoSolicitud", "usuarioRegistroSistema", "numeroRadicacion", "canalRadicacion", "usuarioAnalista",
                "usuarioRevisor", "informacionVinculado", "informacionHerederos", "informacionCuentaBancaria" })
@XmlRootElement
public class TipoSolicitudDevolucionAhorrosHerederos {

    /**Atributo que mantiene la fecha de registro de la solicitud.*/
    @XmlElement(required = true, nillable = true)
    protected String fechaRegistro;
    /**Atributo que mantiene la información del código de la destinación de recursos solicitada.*/
    @XmlElement(required = true, nillable = true)
    protected String destinacionRecursos;
    /** Atributo que contiene uno o más documentos del gestor documental relacionados con este trámite.*/
    @XmlElement(required = true, nillable = true)
    protected TipoDocumentos documentos;
    /**Atributo que mantiene la información del tipo de solicitud presentada por los herederos de un vinculado fallecido.*/
    @XmlElement(required = true, nillable = true)
    protected String tipoSolicitud;
    /**Atributo que mantiene el usuario del canal que realizó el registro de la solicitud al Sistema de Gestión BEPS.*/
    @XmlElement(required = true, nillable = true)
    protected String usuarioRegistroSistema;
    /**Atributo que mantiene el número de radicación del trámite en el canal.*/
    @XmlElement(required = true, nillable = true)
    protected String numeroRadicacion;
    /**Atributo que mantiene el número de canal por el cual se realizó la radicación.*/
    @XmlElement(required = true, nillable = false)
    protected String canalRadicacion;
    /**Atributo que mantiene el usuario asignado que va a realizar el estudio del caso.*/
    @XmlElement
    protected String usuarioAnalista;
    /**Atributo que mantiene el usuario asignado que va a realizar la revisión del estudio del caso.*/
    @XmlElement(nillable = true)
    protected String usuarioRevisor;
    /**Atributo que mantiene la información del vinculado fallecido asociado a la solicitud.*/
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionVinculadoFallecido informacionVinculado;
    /**Atributo que mantiene los datos de uno o más herederos o terceros.*/
    @XmlElement(required = true, nillable = true)
    protected List<TipoInformacionHeredero> informacionHerederos;
    /**Atributo que mantiene la información correspondiente a la cuenta bancaria.*/
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionCuentaBancariaHeredero informacionCuentaBancaria;  

    /**
     * Devuelve el valor del atributo fechaRegistro.
     *
     * @return el valor del atributo fechaRegistro.
     */
    @NotNullValidator
    @DateValidator(validarFechaActual = true)
    @StringLengthValidator(min = 8, max = 8, message = "{0} debe tener una longitud de 8 caracteres")
    public String getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * Establece el valor del atributo fechaRegistro.
     *
     * @param value el valor por establecer para el atributo fechaRegistro.
     */
    public void setFechaRegistro(String value) {
        this.fechaRegistro = value;
    }    
    
    /**
     * Devuelve el valor del atributo destinacionRecursos.
     *
     * @return el valor del atributo destinacionRecursos.
     */
    @NotNullValidator
    @RegexValidator(pattern="^(03)$", message="{0} no es válido, debe ingresar alguna de las siguientes opciones: 03.")
    public String getDestinacionRecursos() {
        return destinacionRecursos;
    }

    /**
     * Establece el valor del atributo destinacionRecursos.
     *
     * @param value el valor por establecer para el atributo destinacionRecursos.
     */
    public void setDestinacionRecursos(String value) {
        this.destinacionRecursos = value;
    }
    
    /**
     * Devuelve el valor del atributo documentos.
     *
     * @return el valor del atributo documentos.
     */
    @NotNullValidator
    @ObjectValidator
    public TipoDocumentos getDocumentos() {
        return documentos;
    }

    /**
     * Establece el valor del atributo documentos.
     *
     * @param value el valor por establecer para el atributo documentos.
     */
    public void setDocumentos(TipoDocumentos value) {
        this.documentos = value;
    }
    
    /**
     * Devuelve el valor del atributo tipoSolicitud.
     *
     * @return el valor del atributo tipoSolicitud.
     */
    @NotNullValidator
    @RegexValidator(pattern="^(03)$", message="{0} no es válido, debe ingresar alguna de las siguientes opciones: 03.")
    public String getTipoSolicitud() {
        return tipoSolicitud;
    }

    /**
     * Establece el valor del atributo tipoSolicitud.
     *
     * @param value el valor por establecer para el atributo tipoSolicitud.
     */
    public void setTipoSolicitud(String value) {
        this.tipoSolicitud = value;
    }
    
    /**
     * Devuelve el valor del atributo usuarioRegistroSistema.
     *
     * @return el valor del atributo usuarioRegistroSistema.
     */
    @NotNullValidator
    @StringLengthValidator(min = 5, max = 50, message = "{0} debe tener una longitud de mínimo 5 y máximo 50 caracteres.")
    public String getUsuarioRegistroSistema() {
        return usuarioRegistroSistema;
    }

    /**
     * Establece el valor del atributo usuarioRegistroSistema.
     *
     * @param value el valor por establecer para el atributo usuarioRegistroSistema.
     */
    public void setUsuarioRegistroSistema(String value) {
        this.usuarioRegistroSistema = value;
    }
    
    /**
     * Devuelve el valor del atributo numeroRadicacion.
     *
     * @return el valor del atributo numeroRadicacion.
     */
    @NotNullValidator
    @RegexValidator(pattern ="[0-9_]+", message = "{0} no es válido, debe ingresar solo números y un guión bajo.")
    @StringLengthValidator(min = 1, max = 50, message = "{0} debe tener una longitud de mínimo 1 y máximo 50 caracteres.")
    public String getNumeroRadicacion() {
        return numeroRadicacion;
    }

    /**
     * Establece el valor del atributo numeroRadicacion.
     *
     * @param value el valor por establecer para el atributo numeroRadicacion.
     */
    public void setNumeroRadicacion(String value) {
        this.numeroRadicacion = value;
    }
    
    /**
     * Devuelve el valor del atributo canalRadicacion.
     *
     * @return el valor del atributo canalRadicacion.
     */
    @NotNullValidator
    public String getCanalRadicacion() {
        return canalRadicacion;
    }

    /**
     * Establece el valor del atributo canalRadicacion.
     *
     * @param value el valor por establecer para el atributo canalRadicacion.
     */
    public void setCanalRadicacion(String value) {
        this.canalRadicacion = value;
    }

    /**
     * Devuelve el valor del atributo usuarioAnalista.
     *
     * @return el valor del atributo usuarioAnalista.
     */
    @OptionalFieldValidator
    @StringLengthValidator(min = 5, max = 50, message = "{0} debe tener una longitud de mínimo 5 y máximo 50 caracteres.")
    public String getUsuarioAnalista() {
        return usuarioAnalista;
    }

    /**
     * Establece el valor del atributo usuarioAnalista.
     *
     * @param value el valor por establecer para el atributo usuarioAnalista.
     */
    public void setUsuarioAnalista(String value) {
        this.usuarioAnalista = value;
    }

    /**
     * Devuelve el valor del atributo usuarioRevisor.
     *
     * @return el valor del atributo usuarioRevisor.
     */
    @OptionalFieldValidator
    @StringLengthValidator(min = 5, max = 50, message = "{0} debe tener una longitud de mínimo 5 y máximo 50 caracteres.")
    public String getUsuarioRevisor() {
        return usuarioRevisor;
    }

    /**
     * Establece el valor del atributo usuarioRevisor.
     *
     * @param value el valor por establecer para el atributo usuarioRevisor.
     */
    public void setUsuarioRevisor(String value) {
        this.usuarioRevisor = value;
    }
    
    /**
     * Devuelve el valor del atributo informacionVinculado.
     *
     * @return el valor del atributo informacionVinculado.
     */
    @NotNullValidator
    @ObjectValidator
    public TipoInformacionVinculadoFallecido getInformacionVinculado() {
        return informacionVinculado;
    }

    /**
     * Establece el valor del atributo informacionVinculado.
     *
     * @param value el valor por establecer para el atributo informacionVinculado.
     */
    public void setInformacionVinculado(TipoInformacionVinculadoFallecido value) {
        this.informacionVinculado = value;
    }
    
    /**
     * Devuelve el valor del atributo documentos.
     *
     * @return el valor del atributo documentos.
     */
    @NotNullValidator
    @ObjectValidator
    public List<TipoInformacionHeredero> getInformacionHerederos() {
        return informacionHerederos;
    }

    /**
     * Establece el valor del atributo documentos.
     *
     * @param value el valor por establecer para el atributo documentos.
     */
    public void setInformacionHerederos(List<TipoInformacionHeredero> value) {
        this.informacionHerederos = value;
    }
    
    /**
     * Devuelve el valor del atributo informacionCuentaBancaria.
     *
     * @return el valor del atributo informacionCuentaBancaria.
     */
    @NotNullValidator
    @ObjectValidator
    public TipoInformacionCuentaBancariaHeredero getInformacionCuentaBancaria() {
        return informacionCuentaBancaria;
    }

    /**
     * Establece el valor del atributo informacionCuentaBancaria.
     *
     * @param value el valor por establecer para el atributo informacionCuentaBancaria.
     */
    public void setInformacionHerederos(TipoInformacionCuentaBancariaHeredero value) {
        this.informacionCuentaBancaria = value;
    }
    
}