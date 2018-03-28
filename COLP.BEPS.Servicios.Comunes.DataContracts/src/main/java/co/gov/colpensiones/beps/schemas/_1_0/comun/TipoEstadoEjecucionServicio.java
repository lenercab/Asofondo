package co.gov.colpensiones.beps.schemas._1_0.comun;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.beps.comunes.anotaciones.NotNullValidator;
import co.gov.colpensiones.beps.comunes.anotaciones.StringLengthValidator;

/**
 * <b>Descripción:</b> Estructura del dato de salida para el estado de ejecución de una operación del servicio web..<br/>
 * @author Yesika Ramirez <yeramirez@heinsohn.com.co>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEstadoEjecucionServicio", propOrder = {
    "codigo",
    "descripcion"
})
public class TipoEstadoEjecucionServicio {
	
	/**
	 * Estructura que almacena el resumen de información de la cuenta de un vinculado en el Sistema de Cuentas Individuales
	 * */
	@XmlElement
	protected String codigo;
	
	/**
	 * Posibles mensajes de respuesta devueltos por la operación invocada.
	 * */
	@XmlElement
	protected String descripcion;
	
	 /**
     * Devuelve el valor del atributo codigo.
     *
     * @return El valor del atributo codigo
     */
	@StringLengthValidator(min=1, max = 2, message = "{0} debe tener una longitud de min 1 y max 2 caracteres")
	@NotNullValidator
	public String getCodigo() {
		return codigo;
	}
	
	/**
     * Establece el valor del atributo codigo.
     *
     * @param codigo El valor por establecer para el atributo codigo
     */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	 /**
     * Devuelve el valor del atributo descripcion.
     *
     * @return El valor del atributo descripcion
     */
	@StringLengthValidator(min=0, max = 500, message = "{0} debe tener una longitud de min 0 y max 500 caracteres")
	public String getDescripcion() {
		return descripcion;
	}
	
	/**
     * Establece el valor del atributo descripcion.
     *
     * @param descripcion El valor por establecer para el atributo descripcion
     */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}	
}
