package co.gov.colpensiones.beps.schemas._1_0.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.beps.comunes.anotaciones.NotNullValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.ObjectValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.OptionalFieldValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.RegexValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.StringLengthValidator;


/**
 * <b>Descripción:</b> Estructura que almacena la información de un heredero o tercero de un vinculado fallecido. <br/>
 * <b>Caso de Uso:</b> PT-INGE-014-GOI-OTO-4-FAB-02-RegistrarSolicitudDevolucionAhorrosHerederos <br/>
 * 
 * @author Ana Arevalo <aarevalo@heinsohn.com.co>
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionHeredero", propOrder = { "identificacion", "nombres", "tipoSolicitante", "numeroTarjetaProfesional",
                "informacionAutorizacion", "esRepresentanteHerederos", "parentesco", "direccion", "barrio", "departamento", 
                "municipio", "telefono1", "telefono2", "correoElectronico" })
public class TipoInformacionHeredero{

    /**Atributo que mantiene la información de identificación.*/
    @XmlElement(required = true, nillable = true)
    protected TipoDocumentoTercero identificacion;
    /**Atributo que mantiene la información de los nombres.*/
    @XmlElement(required = true, nillable = true)
    protected TipoInformacionBasicaTercero nombres; 
    /**Atributo que mantiene el tipo de persona que presenta y/o solicita la de devolución de ahorros a herederos.*/
    @XmlElement(required = true, nillable = true)
    protected String tipoSolicitante;
    /**Atributo que mantiene la información del número de tarjeta profesional del solicitante tercero apoderado.*/
    @XmlElement(nillable = true)
    protected String numeroTarjetaProfesional;
    /**Atributo que indica si el solicitante permite el envío de comunicaciones.*/
    @XmlElement(required = true, nillable = true)
    protected TipoAutorizacion informacionAutorizacion;
    /**Atributo que indica si está en representación de los herederos relacionados en la solicitud de devolución de ahorros a herederos.*/
    @XmlElement(required = true, nillable = true)
    protected String esRepresentanteHerederos;
    /**Atributo que mantiene la información del parentesco que tiene el heredero con el vinculado fallecido.*/
    @XmlElement(required = true, nillable = true)
    protected String parentesco;
    /**Atributo que mantiene la dirección de residencia del heredero.*/
    @XmlElement(nillable = true)
    protected String direccion;
    /**Atributo que mantiene el barrio de residencia del heredero.*/
    @XmlElement(nillable = true)
    protected String barrio;
    /**Atributo que mantiene código DANE del departamento de residencia del heredero.*/
    @XmlElement(nillable = true)
    protected String departamento;
    /**Atributo que mantiene código DANE del municipio de residencia del heredero.*/
    @XmlElement(nillable = true)
    protected String municipio;
    /**Atributo que mantiene el número de teléfono del heredero.*/
    @XmlElement(nillable = true)
    protected String telefono1;
    /**Atributo que mantiene un segundo número de teléfono del heredero.*/
    @XmlElement(nillable = true)
    protected String telefono2;
    /**Atributo que mantiene el correo electrónico del heredero.*/
    @XmlElement(nillable = true)
    protected String correoElectronico;
    
    /**
     * Devuelve el valor del atributo identificacion.
     *
     * @return el valor del atributo identificacion.
     */
    @NotNullValidator
    @ObjectValidator
    public TipoDocumentoTercero getIdentificacion() {
        return identificacion;
    }

    /**
     * Establece el valor del atributo identificacion.
     *
     * @param value el valor por establecer para el atributo identificacion.
     */
    public void setIdentificacion(TipoDocumentoTercero identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * Devuelve el valor del atributo nombres.
     *
     * @return el valor del atributo nombres.
     */
    @NotNullValidator
    @ObjectValidator
    public TipoInformacionBasicaTercero getNombres() {
        return nombres;
    }

    /**
     * Establece el valor del atributo nombres.
     *
     * @param value el valor por establecer para el atributo nombres.
     */
    public void setNombres(TipoInformacionBasicaTercero value) {
        this.nombres = value;
    }

    /**
     * Devuelve el valor del atributo tipoSolicitante.
     *
     * @return el valor del atributo tipoSolicitante.
     */
    @NotNullValidator
    @RegexValidator(pattern ="^(03|04|05|06)$", message="{0} no es válido, debe ingresar alguna de las siguientes opciones: 03, 04, 05, 06.")
    public String getTipoSolicitante() {
        return tipoSolicitante;
    }
    
    /**
     * Establece el valor del atributo tipoSolicitante.
     *
     * @param value el valor por establecer para el atributo tipoSolicitante.
     */
    public void setTipoSolicitante(String value) {
        this.tipoSolicitante = value;
    }    
    
    /**
     * Devuelve el valor del atributo numeroTarjetaProfesional.
     *
     * @return el valor del atributo numeroTarjetaProfesional.
     */
    @OptionalFieldValidator
    @StringLengthValidator(min = 1, max = 20, message = "{0} debe tener una longitud de 1 a 20 caracteres.")
    public String getNumeroTarjetaProfesional() {
        return numeroTarjetaProfesional;
    }

    /**
     * Establece el valor del atributo numeroTarjetaProfesional.
     *
     * @param value el valor por establecer para el atributo numeroTarjetaProfesional.
     */
    public void setNumeroTarjetaProfesional(String value) {
        this.numeroTarjetaProfesional = value;
    }
    
    /**
     * Devuelve el valor del atributo informacionAutorizacion.
     *
     * @return el valor del atributo informacionAutorizacion.
     */
    @NotNullValidator
    @ObjectValidator
    public TipoAutorizacion getInformacionAutorizacion() {
        return informacionAutorizacion;
    }

    /**
     * Establece el valor del atributo informacionAutorizacion.
     *
     * @param value el valor por establecer para el atributo informacionAutorizacion.
     */
    public void setInformacionAutorizacion(TipoAutorizacion value) {
        this.informacionAutorizacion = value;
    }
    
    /**
     * Devuelve el valor del atributo esRepresentanteHerederos.
     *
     * @return el valor del atributo esRepresentanteHerederos.
     */
    @NotNullValidator
    @RegexValidator(pattern ="^(S|N){1}$", message = "{0} no es válido, debe ingresar alguna de las siguientes opciones: S, N")
    @StringLengthValidator(min = 1, max = 1, message = "{0} debe tener una longitud de 1 caracter")
    public String getEsRepresentanteHerederos() {
        return esRepresentanteHerederos;
    }

    /**
     * Establece el valor del atributo esRepresentanteHerederos.
     *
     * @param value el valor por establecer para el atributo esRepresentanteHerederos.
     */
    public void setEsRepresentanteHerederos(String value) {
        this.esRepresentanteHerederos = value;
    }
    
    /**
     * Devuelve el valor del atributo parentesco.
     *
     * @return el valor del atributo parentesco.
     */
    public String getParentesco() {
        return parentesco;
    }

    /**
     * Establece el valor del atributo parentesco.
     *
     * @param value el valor por establecer para el atributo parentesco.
     */
    public void setParentesco(String value) {
        this.parentesco = value;
    }
    
    /**
     * Devuelve el valor del atributo direccion.
     *
     * @return el valor del atributo direccion.
     */
    public String getDireccion() {
        return direccion;
    }
    
    /**
     * Establece el valor del atributo direccion.
     *
     * @param value el valor por establecer para el atributo direccion.
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }   
    
    /**
     * Devuelve el valor del atributo barrio.
     *
     * @return el valor del atributo barrio.
     */
    public String getBarrio() {
        return barrio;
    }
    
    /**
     * Establece el valor del atributo barrio.
     *
     * @param value el valor por establecer para el atributo barrio.
     */
    public void setBarrio(String value) {
        this.barrio = value;
    } 
    
    /**
     * Devuelve el valor del atributo departamento.
     *
     * @return el valor del atributo departamento.
     */
    public String getDepartamento() {
        return departamento;
    }
    
    /**
     * Establece el valor del atributo departamento.
     *
     * @param value el valor por establecer para el atributo departamento.
     */
    public void setDepartamento(String value) {
        this.departamento = value;
    }      
    
    /**
     * Devuelve el valor del atributo municipio.
     *
     * @return el valor del atributo municipio.
     */
    public String getMunicipio() {
        return municipio;
    }
    
    /**
     * Establece el valor del atributo municipio.
     *
     * @param value el valor por establecer para el atributo municipio.
     */
    public void setMunicipio(String value) {
        this.municipio = value;
    }
    
    /**
     * Devuelve el valor del atributo telefono1.
     *
     * @return el valor del atributo telefono1.
     */
    public String getTelefono1() {
        return telefono1;
    }
    
    /**
     * Establece el valor del atributo telefono1.
     *
     * @param value el valor por establecer para el atributo telefono1.
     */
    public void setTelefono1(String value) {
        this.telefono1 = value;
    }
    
    /**
     * Devuelve el valor del atributo telefono2.
     *
     * @return el valor del atributo telefono2.
     */
    @OptionalFieldValidator
    public String getTelefono2() {
        return telefono2;
    }
    
    /**
     * Establece el valor del atributo telefono2.
     *
     * @param value el valor por establecer para el atributo telefono2.
     */
    public void setTelefono2(String value) {
        this.telefono2 = value;
    }
    
    /**
     * Devuelve el valor del atributo correoElectronico.
     *
     * @return el valor del atributo correoElectronico.
     */
    @OptionalFieldValidator
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    
    /**
     * Establece el valor del atributo correoElectronico.
     *
     * @param value el valor por establecer para el atributo correoElectronico.
     */
    public void setCorreoElectronico(String value) {
        this.correoElectronico = value;
    }    
    
    
}