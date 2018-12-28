
package co.gov.colpensiones.beps.schemas._1_0.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.beps.comunes.anotaciones.IgnoreNullsValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.OptionalFieldValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.RegexValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.StringLengthValidator;

/**
 * <b>Descripción:</b> Contiene los datos de tipo y número de documento para terceros <br/>
 * <b>Caso de Uso:</b> PT-INGE-014-GOI-OTO-4-FAB-02-RegistrarSolicitudDevolucionAhorrosHerederos <br/>
 * 
 * @author Ana Arevalo <aarevalo@heinsohn.com.co>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoDocumentoTercero", propOrder = {"tipoDocumento", "numeroDocumento" })
public class TipoDocumentoTercero {

    /** Tipo de identificación de solicitante. */
    @XmlElement(nillable = true)
    protected String tipoDocumento;
    
    /** Número de identificación del solicitante.*/
    @XmlElement(nillable = true)
    protected String numeroDocumento;

    /**
     * Devuelve el valor del atributo tipoDocumento.
     *
     * @return el valor del atributo tipoDocumento.
     */
    @OptionalFieldValidator
    @RegexValidator(pattern = "^[A-ZÁÉÍÓÚÄËÏÖÜ]+$", message = "{0} no es válido, debe ingresar los caracteres alfabéticos en mayúscula")
    @StringLengthValidator(min = 2, max = 2, message = "{0} debe tener una longitud de 2 caracteres")
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Establece el valor del atributo tipoDocumento.
     *
     * @param value el valor por establecer para el atributo tipoDocumento.
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
    }

    /**
     * Devuelve el valor del atributo numeroDocumento.
     *
     * @return el valor del atributo numeroDocumento.
     */
    @OptionalFieldValidator
    @RegexValidator(pattern ="^[^0*][0-9]*$", message = "{0} no es válido, debe ingresar un valor numérico sin ceros a la izquierda")
    @StringLengthValidator(min = 2, max = 11, message = "{0} debe tener una longitud de mínimo 2 y máximo 11 caracteres")
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Establece el valor del atributo numeroDocumento.
     *
     * @param value el valor por establecer para el atributo numeroDocumento.
     */
    public void setNumeroDocumento(String value) {
        this.numeroDocumento = value;
    }
}