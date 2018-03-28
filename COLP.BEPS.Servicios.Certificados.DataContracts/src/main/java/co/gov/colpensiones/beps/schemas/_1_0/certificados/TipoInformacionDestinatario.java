
package co.gov.colpensiones.beps.schemas._1_0.certificados;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.beps.comunes.anotaciones.StringLengthValidator;

/**
 * <b>Descripción:</b> Clase que representa la estructura de la información del destinatario del certificado.<br/>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionDestinatario", propOrder = {
    "indicadorDestinatario",
    "nombreDestinatario"
})
public class TipoInformacionDestinatario {

    /** Atributo para indicar si la certificación debe contener el nombre del destinatario o no.*/
    @XmlElement(required = true)
    protected String indicadorDestinatario;
    /** Atributo que Corresponde al nombre del destinatario a quién va dirigida la certificación.*/
    @XmlElement(required = true, nillable = true)
    protected String nombreDestinatario;

    /**
     * Devuelve el valor de IndicadorDestinatario.
     *
     * @return El valor de IndicadorDestinatario
     */
    public String getIndicadorDestinatario() {
        return indicadorDestinatario;
    }

    /**
     * Establece el valor de IndicadorDestinatario.
     *
     * @param value El valor por establecer para IndicadorDestinatario
     */
    public void setIndicadorDestinatario(String value) {
        this.indicadorDestinatario = value;
    }

    /**
     * Devuelve el valor de NombreDestinatario.
     *
     * @return El valor de NombreDestinatario
     */
    @StringLengthValidator(min = 2, max = 120, message = "{0} debe tener una longitud de 2 a 120 caracteres")
    public String getNombreDestinatario() {
        return nombreDestinatario;
    }

    /**
     * Establece el valor de NombreDestinatario.
     *
     * @param value El valor por establecer para NombreDestinatario
     */
    public void setNombreDestinatario(String value) {
        this.nombreDestinatario = value;
    }
}