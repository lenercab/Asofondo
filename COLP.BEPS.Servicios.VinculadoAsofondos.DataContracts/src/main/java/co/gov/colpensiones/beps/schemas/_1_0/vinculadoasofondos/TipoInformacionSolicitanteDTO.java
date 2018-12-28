
package co.gov.colpensiones.beps.schemas._1_0.vinculadoasofondos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.colpensiones.beps.comunes.anotaciones.NotNullValidator;
import co.gov.colpensiones.beps.schemas._1_0.comun.TipoEstadoEjecucionServicio;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoDocumentoPersonaNatural;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoEstadoSolicitante;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoInformacionBasicaPersonaNatural;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoInformacionCuentaVinculado;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoInformacionViabilidad;


/**
 * <b>Descripción:</b>Contiene la información de respuesta al generar la consulta de viabilidad de un vinculado al Sistema de Gestión BEPS, desde Asofondos.<br/>
 * @author Yesika Ramirez <yeramirez@heinsohn.com.co>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoInformacionSolicitanteDTO", propOrder = {
    "documentoPersonaNatural","informacionBasicaPersonaNatural","informacionViabilidad","estadoSolicitante",
    "informacionCuentaVinculado","estadoEjecucion"
})

public class TipoInformacionSolicitanteDTO {

	/**Contiene los datos de  tipo y número de documento del solicitante.*/
	@XmlElement(required = true)
	protected TipoDocumentoPersonaNatural documentoPersonaNatural;
	
	/**Contiene los datos de nombres y apellidos del vinculado, previnculado ó prospecto registrado en el Sistema de Gestión BEPS.*/
	@XmlElement(required = true)
	protected TipoInformacionBasicaPersonaNatural informacionBasicaPersonaNatural;
	
	/**Estructura que almacena la información de viabilidad del solicitante*/
	@XmlElement(required = true)
	protected TipoInformacionViabilidad informacionViabilidad;
	
	/**Estructura que almacena la información del estado de un solicitante en el Sistema de Gestión BEPS*/
	@XmlElement(required = true)
	protected TipoEstadoSolicitante estadoSolicitante;
	
	/**Estructura que almacena el resumen de información de la cuenta de un vinculado en el Sistema de Cuentas Individuales*/
	@XmlElement(required = true)
	protected TipoInformacionCuentaVinculado informacionCuentaVinculado;
	
	/**Estado de la ejecucion del servicio*/
	@XmlElement(required = true)
	protected TipoEstadoEjecucionServicio estadoEjecucion;
	
	 /**
     * Devuelve el valor del atributo documentoPersonaNatural.
     *
     * @return El valor del atributo documentoPersonaNatural
     */
	@NotNullValidator
	public TipoDocumentoPersonaNatural getDocumentoPersonaNatural() {
		return documentoPersonaNatural;
	}
	/**
     * Establece el valor del atributo documentoPersonaNatural.
     *
     * @param documentoPersonaNatural, El valor por establecer para el atributo documentoPersonaNatural
     */
	public void setDocumentoPersonaNatural(
			TipoDocumentoPersonaNatural documentoPersonaNatural) {
		this.documentoPersonaNatural = documentoPersonaNatural;
	}
	
	 /**
     * Devuelve el valor del atributo informacionBasicaPersonaNatural.
     *
     * @return El valor del atributo informacionBasicaPersonaNatural
     */
	@NotNullValidator
	public TipoInformacionBasicaPersonaNatural getInformacionBasicaPersonaNatural() {
		return informacionBasicaPersonaNatural;
	}
	
	/**
     * Establece el valor del atributo informacionBasicaPersonaNatural.
     *
     * @param informacionBasicaPersonaNatural, El valor por establecer para el atributo informacionBasicaPersonaNatural
     */
	public void setInformacionBasicaPersonaNatural(
			TipoInformacionBasicaPersonaNatural informacionBasicaPersonaNatural) {
		this.informacionBasicaPersonaNatural = informacionBasicaPersonaNatural;
	}
	
	 /**
     * Devuelve el valor del atributo informacionViabilidad.
     *
     * @return El valor del atributo informacionViabilidad
     */
	@NotNullValidator
	public TipoInformacionViabilidad getInformacionViabilidad() {
		return informacionViabilidad;
	}
	
	/**
     * Establece el valor del atributo informacionViabilidad.
     *
     * @param informacionViabilidad, El valor por establecer para el atributo informacionViabilidad
     */
	public void setInformacionViabilidad(
			TipoInformacionViabilidad informacionViabilidad) {
		this.informacionViabilidad = informacionViabilidad;
	}
	
	 /**
     * Devuelve el valor del atributo estadoSolicitante.
     *
     * @return El valor del atributo estadoSolicitante
     */
	@NotNullValidator
	public TipoEstadoSolicitante getEstadoSolicitante() {
		return estadoSolicitante;
	}
	
	/**
     * Establece el valor del atributo estadoSolicitante.
     *
     * @param estadoSolicitante, El valor por establecer para el atributo estadoSolicitante
     */
	public void setEstadoSolicitante(TipoEstadoSolicitante estadoSolicitante) {
		this.estadoSolicitante = estadoSolicitante;
	}
	
	 /**
     * Devuelve el valor del atributo informacionCuentaVinculado.
     *
     * @return El valor del atributo informacionCuentaVinculado
     */
	@NotNullValidator
	public TipoInformacionCuentaVinculado getInformacionCuentaVinculado() {
		return informacionCuentaVinculado;
	}
	
	/**
     * Establece el valor del atributo informacionCuentaVinculado.
     *
     * @param informacionCuentaVinculado, El valor por establecer para el atributo informacionCuentaVinculado
     */
	public void setInformacionCuentaVinculado(
			TipoInformacionCuentaVinculado informacionCuentaVinculado) {
		this.informacionCuentaVinculado = informacionCuentaVinculado;
	}
	
	/**
     * Devuelve el valor del atributo estadoEjecucion.
     *
     * @return El valor del atributo estadoEjecucion
     */
	@NotNullValidator
	public TipoEstadoEjecucionServicio getEstadoEjecucion() {
		return estadoEjecucion;
	}
	
	/**
     * Establece el valor del atributo estadoEjecucion.
     *
     * @param estadoEjecucion, El valor por establecer para el atributo estadoEjecucion
     */
	public void setEstadoEjecucion(TipoEstadoEjecucionServicio estadoEjecucion) {
		this.estadoEjecucion = estadoEjecucion;
	}
	
}
