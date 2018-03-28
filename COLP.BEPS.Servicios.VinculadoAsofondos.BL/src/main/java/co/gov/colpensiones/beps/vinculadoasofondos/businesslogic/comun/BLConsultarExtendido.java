package co.gov.colpensiones.beps.vinculadoasofondos.businesslogic.comun;

import co.gov.colpensiones.beps.log.LoggerBeps;
import co.gov.colpensiones.beps.schemas._1_0.comun.TipoInformacionContexto;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoDocumentoPersonaNatural;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoRespuestaInformacionSolicitanteDTO;
import co.gov.colpensiones.beps.vinculacion.businesslogic.consultar.BLConsultar;

/**
 * <b>Descripción:</b> Clase que hereda de BLConsultar para acceder al metodo consultarViabilidad.<br/>
 * <b>Caso de Uso:</b> GVI-VIN-3-FAB-14-ConsultarViabilidadVinculacionAsofondos.<br/>
 *
 * @author Yesika Ramirez <yeramirez@heinsohn.com.co>
 */
public class BLConsultarExtendido extends BLConsultar{
	
	/**
	 * Constructor de la clase
	 * @param log, Objeto LoggerBeps para almacenar el log asociado con la funcionalidad
	 * */
	public BLConsultarExtendido(LoggerBeps log) {
		super(log);
	}
	
		
	/**
	 * Método que sobreescribe el metodo de la clase padre
	 * para acceder a la funcionalidad que se encarga de la ejecución de la lógica de negocio para la
	 * consulta de viabilidad de vinculación. Ejecuta un procedimiento
	 * almacenado que extrae la información del vinculado, previnculado ó
	 * prospecto en caso de que se encuentre información asociada al
	 * solicitante.
	 * 
	 * @param identificacion
	 *            Información del solicitante
	 * @param informacionContexto
	 * 			  Información del contexto de la invocación
	 * @return objeto de tipo TipoRespuestaInformacionSolicitanteDTO que
	 *         contiene toda la información consultada para el solicitante
	 */
	@Override
	public TipoRespuestaInformacionSolicitanteDTO consultarViabilidad(
			TipoDocumentoPersonaNatural identificacion,
			TipoInformacionContexto informacionContexto) throws Exception {
		return super.consultarViabilidad(identificacion, informacionContexto);
	}
}
