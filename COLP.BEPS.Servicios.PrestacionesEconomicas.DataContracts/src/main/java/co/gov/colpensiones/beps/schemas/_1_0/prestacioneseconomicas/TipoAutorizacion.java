
package co.gov.colpensiones.beps.schemas._1_0.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.beps.comunes.anotaciones.NotNullValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.RegexValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.StringLengthValidator;


/**
 * <b>Descripción:</b> Clase que representa la estructura de datos de entrada referente a la
 * autorización de envío de comunicación y manejo de información.<br/>
 * <b>Caso de Uso:</b> PT-INGE-014-GOI-OTO-4-FAB-02-RegistrarSolicitudDevolucionAhorrosHerederos <br/>
 * 
 * @author Ana Arevalo <aarevalo@heinsohn.com.co> 

 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoAutorizacion", propOrder = {
    "autorizacionEnvioComunicacion",
    "autorizacionManejoInformacion"
})
public class TipoAutorizacion {

    /** Indica la autorización para el envío de comunicación.*/
    @XmlElement
    protected String autorizacionEnvioComunicacion;
    /** Indica la autorización para el manejo de comunicación.*/
    @XmlElement
    protected String autorizacionManejoInformacion;

    /**
     * Devuelve el valor del atributo autorizacionEnvioComunicacion.
     *
     * @return El valor del atributo autorizacionEnvioComunicacion
     */
    @NotNullValidator
    @RegexValidator(pattern ="^(S|N){1}$", message = "{0} no es válido, debe ingresar alguna de las siguientes opciones: S, N")
    @StringLengthValidator(min = 1, max = 1, message = "{0} debe tener una longitud de 1 caracter")    
    public String getAutorizacionEnvioComunicacion() {
        return autorizacionEnvioComunicacion;
    }

    /**
     * Establece el valor del atributo autorizacionEnvioComunicacion.
     *
     * @param value El valor por establecer para el atributo autorizacionEnvioComunicacion
     */
    public void setAutorizacionEnvioComunicacion(String value) {
        this.autorizacionEnvioComunicacion = value;
    }

    /**
     * Devuelve el valor del atributo autorizacionManejoInformacion.
     *
     * @return El valor del atributo autorizacionManejoInformacion
     */
    @NotNullValidator
    @RegexValidator(pattern ="^(S|N){1}$", message = "{0} no es válido, debe ingresar alguna de las siguientes opciones: S, N")
    @StringLengthValidator(min = 1, max = 1, message = "{0} debe tener una longitud de 1 caracter")        
    public String getAutorizacionManejoInformacion() {
        return autorizacionManejoInformacion;
    }

    /**
     * Establece el valor del atributo autorizacionManejoInformacion.
     *
     * @param value El valor por establecer para el atributo autorizacionManejoInformacion
     */
    public void setAutorizacionManejoInformacion(String value) {
        this.autorizacionManejoInformacion = value;
    }
}