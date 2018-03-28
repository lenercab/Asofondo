
package co.gov.colpensiones.beps.schemas._1_0.certificados;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.beps.comunes.anotaciones.NotNullValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.RegexValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.StringLengthValidator;

/**
 * <b>Descripción:</b> Clase que representa la estructura de la información de origen para el certificado.<br/>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionOrigen", propOrder = {
		"municipioSistemaOrigen"
})


public class TipoInformacionOrigen {

	/** Atributo para el Código DANE que corresponde al municipio desde donde se realiza  la invocación de generación del servicio.*/
    @XmlElement(required = true, nillable = true)
    protected String municipioSistemaOrigen;

    /**
     * Devuelve el valor de MunicipioSistemaOrigen.
     *
     * @return El valor de MunicipioSistemaOrigen
     */
    @NotNullValidator
    @StringLengthValidator(min = 5, max = 5, message = "{0} debe tener una longitud de 5 a 5 caracteres")
    @RegexValidator(pattern ="[0-9]*", message = "{0} no es válido, solo se permiten numeros")
    public String getMunicipioSistemaOrigen() {
        return municipioSistemaOrigen;
    }

    /**
     * Establece el valor de MunicipioSistemaOrigen.
     *
     * @param value El valor por establecer para MunicipioSistemaOrigen
     */
    public void setMunicipioSistemaOrigen(String value) {
        this.municipioSistemaOrigen = value;
    }
}