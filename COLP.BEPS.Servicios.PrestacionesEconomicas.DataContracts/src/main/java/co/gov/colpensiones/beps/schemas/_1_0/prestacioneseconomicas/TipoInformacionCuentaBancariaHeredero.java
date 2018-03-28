package co.gov.colpensiones.beps.schemas._1_0.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.beps.comunes.anotaciones.IgnoreNullsValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.NotNullValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.ObjectValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.OptionalFieldValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.RegexValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.StringLengthValidator;

/**
 * <b>Descripción:</b> Estructura que almacena la información de la cuenta bancaria de un tercero. <br/>
 * <b>Caso de Uso:</b> PT-INGE-014-GOI-OTO-4-FAB-02-RegistrarSolicitudDevolucionAhorrosHerederos <br/>
 * 
 * @author Ana Arevalo <aarevalo@heinsohn.com.co>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionCuentaBancariaHeredero", propOrder = { "entidadFinanciera", "tipoCuenta", "numeroCuenta",
        "titularCuentaEsTercero", "identificacionTitular", "nombreTitular" })
public class TipoInformacionCuentaBancariaHeredero{

    /**Atributo que mantienen el código ACH que identifica la entidad financiera.*/
    @XmlElement(required = true, nillable = true)
    protected String entidadFinanciera;
    /**Atributo que mantiene el tipo de cuenta bancaria.*/
    @XmlElement(required = true, nillable = true)
    protected String tipoCuenta;
    /**Atributo que mantiene el número de cuenta bancaria.*/
    @XmlElement(required = true, nillable = true)
    protected String numeroCuenta ;
    /**Atributo que indica si el titular de la cuenta es el mismo represente de los herederos.*/
    @XmlElement(required = true, nillable = true)
    protected String titularCuentaEsTercero;
    /**Atributo que mantiene el tipo y número de documento del titular de la cuenta bancaria.*/
    @XmlElement(required = true, nillable = true)
    protected TipoDocumentoTercero identificacionTitular;
    /**Atributo que mantiene los nombres y apellidos del titular de la cuenta bancaria.*/
    protected String nombreTitular;
    
    
    /**
     * Devuelve el valor del atributo entidadFinanciera.
     *
     * @return el valor del atributo entidadFinanciera.
     */
    @NotNullValidator
    public String getEntidadFinanciera() {
        return entidadFinanciera;
    }

    /**
     * Establece el valor del atributo entidadFinanciera.
     *
     * @param value el valor por establecer para el atributo entidadFinanciera.
     */
    public void setEntidadFinanciera(String value) {
        this.entidadFinanciera = value;
    }
    
    /**
     * Devuelve el valor del atributo tipoCuenta.
     *
     * @return el valor del atributo tipoCuenta.
     */
    @NotNullValidator
    @StringLengthValidator(min = 1, max = 10, message ="{0} debe de tener una longitud de 1 a 10 caracteres.")
    public String getTipoCuenta() {
        return tipoCuenta;
    }

    /**
     * Establece el valor del atributo tipoCuenta.
     *
     * @param value el valor por establecer para el atributo tipoCuenta.
     */
    public void setTipoCuenta(String value) {
        this.tipoCuenta = value;
    }
    
    /**
     * Devuelve el valor del atributo numeroCuenta.
     *
     * @return el valor del atributo numeroCuenta.
     */
    @NotNullValidator
    @RegexValidator(pattern ="[0-9]+", message = "{0} no es válido, debe ingresar solo números.")
    @StringLengthValidator(min = 1, max = 17, message ="{0} debe de tener una longitud de 1 a 17 caracteres.")
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Establece el valor del atributo numeroCuenta.
     *
     * @param value el valor por establecer para el atributo numeroCuenta.
     */
    public void setNumeroCuenta(String value) {
        this.numeroCuenta = value;
    }   
    
    
    /**
     * Devuelve el valor del atributo titularCuentaEsTercero.
     *
     * @return el valor del atributo titularCuentaEsTercero.
     */
    @NotNullValidator
    @RegexValidator(pattern ="^(S|N){1}$", message = "{0} no es válido, debe ingresar alguna de las siguientes opciones: S, N")
    @StringLengthValidator(min = 1, max = 1, message ="{0} debe de tener una longitud de 1 caracter.")
    public String getTitularCuentaEsTercero() {
        return titularCuentaEsTercero;
    }

    /**
     * Establece el valor del atributo titularCuentaEsTercero.
     *
     * @param value el valor por establecer para el atributo titularCuentaEsTercero.
     */
    public void setTitularCuentaEsTercero(String value) {
        this.titularCuentaEsTercero = value;
    } 
    
    /**
     * Devuelve el valor del atributo identificacionTitular.
     *
     * @return el valor del atributo identificacionTitular.
     */
    public TipoDocumentoTercero getIdentificacion() {
        return identificacionTitular;
    }

    /**
     * Establece el valor del atributo identificacionTitular.
     *
     * @param value el valor por establecer para el atributo identificacionTitular.
     */
    public void setIdentificacion(TipoDocumentoTercero value) {
        this.identificacionTitular = value;
    }

    /**
     * Devuelve el valor del atributo nombreTitular.
     *
     * @return el valor del atributo nombreTitular.
     */
    public String getNombreTitular() {
        return nombreTitular;
    }

    /**
     * Establece el valor del atributo nombreTitular.
     *
     * @param value el valor por establecer para el atributo nombreTitular.
     */
    public void setNombreTitular(String value) {
        this.nombreTitular = value;
    }   

}