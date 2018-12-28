package co.gov.colpensiones.beps.schemas._1_0.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.beps.comunes.anotaciones.DateValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.NotNullValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.ObjectValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.RegexValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.StringLengthValidator;

/**
 * <b>Descripción:</b> Estructura que almacena la información del vinculado fallecido. <br/>
 * <b>Caso de Uso:</b> PT-INGE-014-GOI-OTO-4-FAB-02-RegistrarSolicitudDevolucionAhorrosHerederos <br/>
 * 
 * @author Ana Arevalo <aarevalo@heinsohn.com.co>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionVinculadoFallecido", propOrder = { "identificacion", "registroCivilDefuncion", "fechaDefuncion" })
public class TipoInformacionVinculadoFallecido {

    /**Atributo que mantiene la información de identificación.*/
    @XmlElement(required = true, nillable = true)
    protected TipoDocumentoTercero identificacion;
    /**Atributo que mantiene la información del indicativo Serial del Registro Civil de Defunción.*/
    @XmlElement(required = true, nillable = true)
    protected String registroCivilDefuncion;
    /**Atributo que mantiene la fecha de defunción del vinculado fallecido.*/
    @XmlElement(required = true, nillable = true)
    protected String fechaDefuncion;

    /**
     * Devuelve el valor del atributo identificacion.
     *
     * @return El valor del atributo identificacion
     */
    @NotNullValidator
    @ObjectValidator
    public TipoDocumentoTercero getIdentificacion() {
        return identificacion;
    }

    /**
     * Establece el valor del atributo identificacion.
     *
     * @param value El valor por establecer para el atributo identificacion
     */
    public void setIdentificacion(TipoDocumentoTercero value) {
        this.identificacion = value;
    }
    
    /**
     * Devuelve el valor del atributo registroCivilDefuncion.
     *
     * @return El valor del atributo registroCivilDefuncion
     */
    @NotNullValidator
    @RegexValidator(pattern = "^[^a-záéíóúäëïöü]+$", message = "{0} no es válido, debe ingresar los caracteres alfabéticos en mayúscula")   
    @StringLengthValidator(min = 10, max = 10, message = "{0} debe tener una longitud de 10 caracteres")
    public String getRegistroCivilDefuncion() {
        return registroCivilDefuncion;
    }

    /**
     * Establece el valor del atributo registroCivilDefuncion.
     *
     * @param value El valor por establecer para el atributo registroCivilDefuncion
     */
    public void setRegistroCivilDefuncion(String value) {
        this.registroCivilDefuncion = value;
    } 
    
    /**
     * Devuelve el valor del atributo fechaDefuncion.
     *
     * @return El valor del atributo fechaDefuncion
     */
    @NotNullValidator
    @DateValidator(validarFechaActual = true)
    @StringLengthValidator(min = 8, max = 8, message = "{0} debe tener una longitud de 8 caracteres")
    public String getFechaDefuncion() {
        return fechaDefuncion;
    }

    /**
     * Establece el valor del atributo fechaDefuncion.
     *
     * @param value El valor por establecer para el atributo fechaDefuncion
     */
    public void setFechaDefuncion(String value) {
        this.fechaDefuncion = value;
    } 

}