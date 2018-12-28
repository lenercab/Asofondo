package co.gov.colpensiones.beps.contracts._1_0.personas.impl;

import javax.ejb.Stateless;
import javax.jws.WebService;

import co.gov.colpensiones.beps.comunes.utilidades.ConstantesLoggerServicios;
import co.gov.colpensiones.beps.contracts._1_0.personas.ContratoSvcPrevinculado;
import co.gov.colpensiones.beps.log.LoggerBeps;
import co.gov.colpensiones.beps.previnculacion.businesslogic.consultar.BLCalcularNivelSisben;
import co.gov.colpensiones.beps.previnculacion.businesslogic.crear.BLCrear;
import co.gov.colpensiones.beps.previnculacion.businesslogic.crear.BLRegistrarResultadoEstudio;
import co.gov.colpensiones.beps.schemas._1_0.comun.TipoEstadoEjecucion;
import co.gov.colpensiones.beps.schemas._1_0.comun.TipoInformacionContexto;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoInformacionBasicaSisben;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoInformacionPrevinculado;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoInformacionRespuestaPrevinculacion;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoRespuestaCalculoNivelSisbenDTO;

/**
 * <b>Descripcion:</b> Clase que representa la implementación del servicio de previnculado.<br/>
 * <b>Caso de Uso:</b> GOP-AMB-1-FAB-08-CalcularNivelSisben<br/>
 * <b>Caso de Uso:</b> GVI-VIN-1-FAB-05-CrearPrevinculado<br/>
 * <b>Caso de Uso:</b> GVI-VIN-1-FAB-07-ResultadoPrevinculacion<br/>
 *
 * @author csalazar <csalazar@heinsohn.com.co>
 */
@Stateless
@WebService(name = "ContratoSvcPrevinculado", endpointInterface = "co.gov.colpensiones.beps.contracts._1_0.personas.ContratoSvcPrevinculado", targetNamespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/personas")
public class ContratoSvcPrevinculadoImpl implements ContratoSvcPrevinculado {

    /**
     * Método encargado de realizar el cálculo del nivel SISBEN de acuerdo con el área y puntaje asignados en la normatividad vigente
     * 
     * CU: GOP-AMB-1-FAB-08-CalcularNivelSisben
     * 
     * @param datosCalculo
     *            , datos de entrada
     * @return respuesta del calculo y estado de la ejecución
     */
    public TipoRespuestaCalculoNivelSisbenDTO calcularNivelSisben(TipoInformacionContexto informacionContexto,
            TipoInformacionBasicaSisben datosCalculo) {
        BLCalcularNivelSisben blPrevinculado = new BLCalcularNivelSisben(new LoggerBeps(
                ConstantesLoggerServicios.SERVICIO_PREVINCULADO_CALCULO_NIVEL, informacionContexto.getSistemaOrigen()));
        return blPrevinculado.calcularNivelSisben(informacionContexto,datosCalculo);
    }

    /**
     * Método que ejecuta el proceso de registrar la pre-vinculación de un solicitante al programa BEPS
     * 
     * CU : GVI-VIN-1-FAB-05-CrearPrevinculado
     * 
     * @param informacionPrevinculado
     * @return estado de la ejecución
     */
    public TipoEstadoEjecucion crear(TipoInformacionContexto informacionContexto, TipoInformacionPrevinculado informacionPrevinculado) {
        BLCrear blPrevinculado = new BLCrear(new LoggerBeps(ConstantesLoggerServicios.SERVICIO_PREVINCULADO_CREAR,
                informacionContexto.getSistemaOrigen()));
        return blPrevinculado.crear(informacionContexto, informacionPrevinculado);
    }

    /**
     * Método encargado de resgistrar el estudio de un previnculado
     * 
     * CU: GVI-VIN-1-FAB-07-ResultadoPrevinculacion
     * 
     * @param informacionContexto
     *            , información del contexto
     * @param informacionResultadoPrevinculacion
     *            , información del estudio
     * @return estado de la ejecución
     */
    public TipoEstadoEjecucion registrarResultadoEstudio(TipoInformacionContexto informacionContexto,
            TipoInformacionRespuestaPrevinculacion informacionResultadoPrevinculacion) {
        BLRegistrarResultadoEstudio blRegistrar = new BLRegistrarResultadoEstudio(new LoggerBeps(
                ConstantesLoggerServicios.SERVICIO_PREVINCULADO_REG_RESULTADO_ESTUDIO, informacionContexto.getSistemaOrigen()));
        return blRegistrar.registrarResultadoEstudio(informacionContexto, informacionResultadoPrevinculacion);
    }
}
