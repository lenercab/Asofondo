
package co.gov.colpensiones.beps.schemas._1_0.comun;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.beps.comunes.anotaciones.IgnoreEmptyValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.IgnoreNullsValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.NotNullValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.RegexValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.StringLengthValidator;

/**
 * <b>Descripción:</b> Estructura que contiene los datos de contexto de la invocación del servicio web <br/>
 * 
 * <b>Caso de Uso:</b> GVI-VIN-3-FAB-13-RealizarCambioEstadoVinculado <br/>
 * @author Arnold Rios Delgado <arrios@heinsohn.com.co>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionContextoRadicacion", propOrder = {
    "sistemaOrigen",
    "usuarioSistema",
    "numeroRadicacion"
})
@XmlRootElement
public class TipoInformacionContextoRadicacion {

    /** Nombre que identifica el sistema externo o canal que realiza la invocación. */
    @XmlElement    
    protected String sistemaOrigen;
    
    /** Usuario del canal que está realizando el cambio de estado. */
    @XmlElement
    protected String usuarioSistema;
    
    /** Número de radicación del trámite en el canal.*/
    @XmlElement
    protected String numeroRadicacion;
   

    /**
     * Devuelve el valor del atributo sistemaOrigen.
     *
     * @return El valor del atributo sistemaOrigen
     */
    @NotNullValidator
    @StringLengthValidator(min = 1, max = 50, message = "{0} debe tener una longitud de 1 a 50 caracteres")
    @RegexValidator(pattern ="[A-Z0-9]+", message = "{0} no es válido, solo permite letras mayusculas y caracteres numéricos.")
    public String getSistemaOrigen() {
        return sistemaOrigen;
    }

    /**
     * Establece el valor del atributo sistemaOrigen.
     *
     * @param value El valor por establecer para el atributo sistemaOrigen
     */
    public void setSistemaOrigen(String value) {
        this.sistemaOrigen = value;
    }

    /**
     * Devuelve el valor de usuarioSistema
     * @return El valor de usuarioSistema
     */
    @NotNullValidator
    @StringLengthValidator(min=5,max=60, message = "{0} debe tener una longitud de 5 a 60 caracteres")
    public String getUsuarioSistema() {
        return usuarioSistema;
    }

    /**
     * Establece el valor de usuarioSistema
     * @param usuarioSistema El valor por establecer para usuarioSistema
     */
    public void setUsuarioSistema(String usuarioSistema) {
        this.usuarioSistema = usuarioSistema;
    }

    /**
     * Devuelve el valor de numeroRadicacion
     * @return El valor de numeroRadicacion
     */
    @IgnoreNullsValidator
    @IgnoreEmptyValidator
    @StringLengthValidator(min=1,max=50, message = "{0} debe tener una longitud de 1 a 50 caracteres")
    @RegexValidator(pattern ="[_0-9]+", message = "{0} no es válido, solo permite letras mayusculas y caracteres numéricos.")
    public String getNumeroRadicacion() {
        return numeroRadicacion;
    }

    /**
     * Establece el valor de numeroRadicacion
     * @param numeroRadicacion El valor por establecer para numeroRadicacion
     */
    public void setNumeroRadicacion(String numeroRadicacion) {
        this.numeroRadicacion = numeroRadicacion;
    }

    
}