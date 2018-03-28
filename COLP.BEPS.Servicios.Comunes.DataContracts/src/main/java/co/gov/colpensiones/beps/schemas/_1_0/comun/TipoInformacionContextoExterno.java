
package co.gov.colpensiones.beps.schemas._1_0.comun;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.beps.comunes.anotaciones.IgnoreEmptyValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.NotNullValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.RegexValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.StringLengthValidator;

/**
 * <b>Descripción:</b> Estructura que contiene los datos de contexto de la invocacion del servicio web <br/>
 * @author Yesika Ramirez <yeramirez@heinsohn.com.co>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionContextoExternos", propOrder = {
    "sistemaOrigen",
    "usuarioSistemaExterno"
})
@XmlRootElement
public class TipoInformacionContextoExterno {

    /** Nombre que identifica el sistema externo que realiza la invocación. */
    @XmlElement    
    protected String sistemaOrigen;
    
    /** Nombre del usuario de la aplicación que consume el servicio. */
    @XmlElement
    protected String usuarioSistemaExterno;
   

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
     * Devuelve el valor del atributo usuarioSistemaExterno.
     *
     * @return El valor del atributo usuarioSistemaExterno
     */
    
    @StringLengthValidator(min=0,max=100, message = "{0} debe tener una longitud max de 100 caracteres")
    public String getUsuarioSistemaExterno() {
        return usuarioSistemaExterno;
    }

    /**
     * Establece el valor del atributo usuarioSistemaExterno.
     *
     * @param value El valor por establecer para el atributo usuarioSistemaExterno
     */
    public void setUsuarioSistemaExterno(String value) {
        this.usuarioSistemaExterno = value;
    }

}