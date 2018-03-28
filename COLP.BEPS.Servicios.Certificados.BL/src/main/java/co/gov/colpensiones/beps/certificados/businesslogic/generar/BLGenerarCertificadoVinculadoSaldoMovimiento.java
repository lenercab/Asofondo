package co.gov.colpensiones.beps.certificados.businesslogic.generar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import co.gov.colpensiones.beps.certificados.businesslogic.BLCertificado;
import co.gov.colpensiones.beps.certificados.businesslogic.comun.TipoCertificado;
import co.gov.colpensiones.beps.comunes.utilidades.Constantes;
import co.gov.colpensiones.beps.dal.utilidades.DataStoredProcedure;
import co.gov.colpensiones.beps.dal.utilidades.DbParameter;
import co.gov.colpensiones.beps.excepciones.DataAccessException;
import co.gov.colpensiones.beps.excepciones.LogicalException;
import co.gov.colpensiones.beps.log.LoggerBeps;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoConsultaMovimientosSaldo;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoDocumentoPersonaNatural;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoFiltrosConsulta;
import co.gov.colpensiones.beps.vinculacion.businesslogic.DAVinculado;
import co.gov.colpensiones.beps.vinculacion.businesslogic.consultar.BLConsultarSaldosMovimientos;

/**
 * <b>Descripción:</b> Clase que contiene la lógica de negocio para la generación del certificado para un vinculado con Saldo.<br/>
 * <b>Caso de Uso:</b> GVI-VIN-3-FAB-03-GenerarCertificadoVinculadoconSaldo.<br/>
 *
 * @author Cristian Alexander Salazar Perdomo <csalazar@heinsohn.com.co>
 */
public class BLGenerarCertificadoVinculadoSaldoMovimiento extends BLCertificado{

	/** Variable para el manejo de log de la funcionalidad */
	private LoggerBeps log;
    /**
     * Método constructor
     * 
     * @param log, log asociado a la funcionalidad
     */
	public BLGenerarCertificadoVinculadoSaldoMovimiento(LoggerBeps log) {
		super(log);
		this.log=log;
		
	}
    
    /**
     * Método que permite realizar el procesamiento de la información consultada en plenitud para saldos y movimientos.
     * @param filtrosConsulta, contiene los filtros para la consulta
     * @throws DataAccessException, error a no enoctrar los datos
     */
    public TipoConsultaMovimientosSaldo consultarInformacionCuentaIndividual(TipoFiltrosConsulta filtrosConsulta) throws LogicalException, DataAccessException {
    	
    	DAVinculado daVinculado=new DAVinculado();
    	DataStoredProcedure resultado=daVinculado.consultarInformacionCuentaIndividual(filtrosConsulta);
    	TipoConsultaMovimientosSaldo detalle=null;
    	
    	/*Verificación de resultado de invocación a plenitud*/
        if (resultado.getParametrosSalida() != null && resultado.getParametrosSalida().size() > 0) {
            
            DbParameter parametroSalidaCodigo = resultado.getParametrosSalida().get(21);
            DbParameter parametroSalidaMensaje = resultado.getParametrosSalida().get(22);
            
            if (Constantes.COD_ERROR_CONSULTA_SALDOS_.contains(parametroSalidaCodigo.getParameterValue().toString())) {
                String mensajeError = ("Error en la ejecución del SP COLPROE070.SP_Consulta_Saldos_Tipo_Aporte. Código"
                        + parametroSalidaCodigo.getParameterValue()  +" Mensaje:" + parametroSalidaMensaje.getParameterValue());
                throw new DataAccessException(new HashMap<String,Object>(), new HashMap<String,String>(), new Exception(mensajeError));
            }
            else{
                try {
                	/* procesa la informacion de la cuenta*/
                	detalle = procesarInformacionCuenta(resultado, filtrosConsulta);
        		} catch (LogicalException e) {
        			throw e;
        		}
            }
        }
        else
        {
        	throw new DataAccessException(new HashMap<String,Object>(), new HashMap<String,String>(), new Exception(Constantes.RESPUESTA_FALLIDA_INVOCACION_PLENITUD));
        }
        return detalle;
    }
    
    /**
     * Método que permite realizar el procesamiento de la información consultada en plenitud para saldos y movimientos.
     * @param resultado Datos obtenidos como resultado de consultar en plenitud la información de cuenta.
     * @param filtrosConsulta Filtros utilizados en la consulta a plenitud.
     * @return <TipoConsultaMovimientosSaldo> Contiene la información de cuenta, saldos y movimientos.
     * @throws LogicalException Excepción generada al procesar la información.
     */
    private TipoConsultaMovimientosSaldo procesarInformacionCuenta(DataStoredProcedure resultado, TipoFiltrosConsulta filtrosConsulta) throws LogicalException {
    	BLConsultarSaldosMovimientos blConsultarSaldosMovimientos=new BLConsultarSaldosMovimientos(log);
    	
    	TipoConsultaMovimientosSaldo tipoConsultaMovimientosSaldo=blConsultarSaldosMovimientos.procesarInformacionCuenta(resultado, filtrosConsulta);
    	
        return tipoConsultaMovimientosSaldo;   
    }
    
    /**
	 * Método para crear la TipoFiltrosConsulta, para consultas los saldos y movimientos
	 * @param tipoDocumentoPersonaNatural, contiene la información de tipo y numero 
	 * documento del afiliado 
	 * @param certificadoSaldos, contiene el valor para identificar si es saldo o movimiento
	 * @return filtrosConsulta, filtro para realizar la consulta de cuentas y movimiento
	 */
	protected TipoFiltrosConsulta crearTipoFiltroConsulta(
			TipoDocumentoPersonaNatural tipoDocumentoPersonaNatural, String certificadoSaldoMovimiento) {
		TipoFiltrosConsulta filtrosConsulta=new TipoFiltrosConsulta();
    	/** Fechas utilizadas en el filtro de consulta. */
    	Date fechaInicial = new Date(), fechaFinal = new Date();
    	DateFormat df = new SimpleDateFormat("yyyyMMdd");
    	
    	if(TipoCertificado.CERTIFICADO_SALDOS_MOVIMIENTOS.equals(certificadoSaldoMovimiento))
    	{
    		Calendar fechaAnteriorMes = Calendar.getInstance();
    		fechaAnteriorMes.add(Calendar.MONTH, -3);
    		fechaInicial=fechaAnteriorMes.getTime();
    	}
    
    	filtrosConsulta.setIdentificacion(tipoDocumentoPersonaNatural);
        filtrosConsulta.setFechaInicial(df.format(fechaInicial));
        filtrosConsulta.setFechaFinal(df.format(fechaFinal));
		return filtrosConsulta;
	}
}
