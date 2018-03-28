package co.gov.colpensiones.beps.schemas._1_0.prestacioneseconomicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.beps.comunes.anotaciones.IgnoreNullsValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.NotNullValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.OptionalFieldValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.RegexValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.StringLengthValidator;


/**
 * <b>Descripción:</b> Contiene los nombres del tercero. <br/>
 * <b>Caso de Uso:</b> PT-INGE-014-GOI-OTO-4-FAB-02-RegistrarSolicitudDevoluciónAhorrosHerederos. <br/>
 * 
 * @author Ana Arévalo <aarevalo@heinsohn.com.co>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionBasicaTercero", propOrder = {"primerApellido", "segundoApellido", "primerNombre", "segundoNombre" })
public class TipoInformacionBasicaTercero {

    /** Primer apellido del tercero.*/
    @XmlElement(required = true, nillable = true)
	protected String primerApellido;
	
    /** Segundo apellido del tercero.*/
    @XmlElement(nillable = true)
	protected String segundoApellido;
	
    /** Primer nombre del tercero.*/
    @XmlElement(required = true, nillable = true)
	protected String primerNombre;
	
    /** Segundo nombre del tercero.*/
    @XmlElement(nillable = true)
	protected String segundoNombre;

	/**
	 * Devuelve el valor del atributo primerApellido.
	 *
	 * @return el valor del atributo primerApellido.
	 */
    @NotNullValidator
	@StringLengthValidator(min = 1, max = 30, message = "{0} debe tener una longitud de mínimo 1 y máximo 30 caracteres")
	@RegexValidator(pattern = "^[a-zA-ZñÑáéíóúÁÉÍÓÚäÄëËïÏöÖüÜ]+[a-zA-ZñÑáéíóúÁÉÍÓÚäÄëËïÏöÖüÜ\\s]*$", message = "{0} no es válido, debe ingresar un valor alfabético sin caracteres especiales. No puede contener solo espacios en blanco")
	public String getPrimerApellido() {
		return primerApellido;
	}

	/**
	 * Establece el valor del atributo primerApellido.
	 *
	 * @param value el valor por establecer para el atributo primerApellido.
	 */
	public void setPrimerApellido(String value) {
		this.primerApellido = value;
	}

	/**
	 * Devuelve el valor del atributo segundoApellido.
	 *
	 * @return el valor del atributo segundoApellido.
	 */
	@OptionalFieldValidator 
	@StringLengthValidator(min = 0, max = 30, message = "{0} debe tener una longitud de máximo 30 caracteres")
	@RegexValidator(pattern = "^[a-zA-ZñÑáéíóúÁÉÍÓÚäÄëËïÏöÖüÜ\\s]*$", message = "{0} no es válido, debe ingresar un valor alfabético sin caracteres especiales")
	public String getSegundoApellido() {
		return segundoApellido;
	}

	/**
	 * Establece el valor del atributo segundoApellido.
	 *
	 * @param value el valor por establecer para el atributo segundoApellido.
	 */
	public void setSegundoApellido(String value) {
		this.segundoApellido = value;
	}

	/**
	 * Devuelve el valor del atributo primerNombre.
	 *
	 * @return el valor del atributo primerNombre.
	 */
	@NotNullValidator
	@StringLengthValidator(min = 1, max = 30, message = "{0} debe tener una longitud de mínimo 1 y máximo 30 caracteres")
	@RegexValidator(pattern = "^[a-zA-ZñÑáéíóúÁÉÍÓÚäÄëËïÏöÖüÜ]+[a-zA-ZñÑáéíóúÁÉÍÓÚäÄëËïÏöÖüÜ\\s]*$", message = "{0} no es válido, debe ingresar un valor alfabético sin caracteres especiales. No puede contener solo espacios en blanco")
	public String getPrimerNombre() {
		return primerNombre;
	}

	/**
	 * Establece el valor del atributo primerNombre.
	 *
	 * @param value el valor por establecer para el atributo primerNombre.
	 */
	public void setPrimerNombre(String value) {
		this.primerNombre = value;
	}

	/**
	 * Devuelve el valor del atributo segundoNombre.
	 *
	 * @return el valor del atributo segundoNombre.
	 */
	@OptionalFieldValidator 
	@StringLengthValidator(min = 0, max = 30, message = "{0} debe tener una longitud de máximo 30 caracteres")
	@RegexValidator(pattern = "^[a-zA-ZñÑáéíóúÁÉÍÓÚäÄëËïÏöÖüÜ\\s]*$", message = "{0} no es válido, debe ingresar un valor alfabético sin caracteres especiales")
	public String getSegundoNombre() {
		return segundoNombre;
	}

	/**
	 * Establece el valor del atributo segundoNombre.
	 *
	 * @param value el valor por establecer para el atributo segundoNombre.
	 */
	public void setSegundoNombre(String value) {
		this.segundoNombre = value;
	}
}