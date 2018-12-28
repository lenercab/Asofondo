
package co.gov.colpensiones.beps.schemas._1_0.certificados;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.beps.comunes.anotaciones.StringLengthValidator;


/**
 *
 * <b>Descripción:</b> Clase que representa la estructura de la información de generación de un certificado para no vinculado.<br/>
 * <b>Caso de Uso:</b> GVI-VIN-3-FAB-10-GenerarCertificadoNoVinculado.<br/>
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionCertificadoNoVinculado", propOrder = {
    "nombreCiudadano"
})
public class TipoInformacionCertificadoNoVinculado extends TipoInformacionCertificado{

	/**Corresponde al nombre completo  del vinculado. */
    @XmlElement(required = true)
    protected String nombreCiudadano;

	/**
	 * Devuelve el valor de nombreCiudadano
	 * @return El valor de nombreCiudadano
	 */
    @StringLengthValidator(min = 2, max = 120, message = "{0} debe tener una longitud de 2 a 120 caracteres")
	public String getNombreCiudadano() {
		return nombreCiudadano;
	}

	/**
	 * Establece el valor de nombreCiudadano
	 * @param nombreCiudadano El valor por establecer para nombreCiudadano
	 */
	public void setNombreCiudadano(String nombreCiudadano) {
		this.nombreCiudadano = nombreCiudadano;
	}
    
}