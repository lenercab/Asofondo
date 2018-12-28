package co.gov.colpensiones.beps.contracts._1_0.certificados.impl;


import javax.ejb.Stateless;
import javax.jws.WebService;

import co.gov.colpensiones.beps.certificados.businesslogic.generar.BLGenerarCertificadoNoVinculado;
import co.gov.colpensiones.beps.certificados.businesslogic.generar.BLGenerarCertificadoOtorgado;
import co.gov.colpensiones.beps.certificados.businesslogic.generar.BLGenerarCertificadoVinculado;
import co.gov.colpensiones.beps.certificados.businesslogic.generar.BLGenerarCertificadoVinculadoMovimientos;
import co.gov.colpensiones.beps.certificados.businesslogic.generar.BLGenerarCertificadoVinculadoSaldo;
import co.gov.colpensiones.beps.comunes.utilidades.ConstantesLoggerServicios;
import co.gov.colpensiones.beps.contracts._1_0.certificados.SvcCertificados;
import co.gov.colpensiones.beps.log.LoggerBeps;
import co.gov.colpensiones.beps.schemas._1_0.certificados.TipoInformacionCertificado;
import co.gov.colpensiones.beps.schemas._1_0.certificados.TipoInformacionCertificadoNoVinculado;
import co.gov.colpensiones.beps.schemas._1_0.certificados.TipoInformacionContexto;
import co.gov.colpensiones.beps.schemas._1_0.certificados.TipoRespuestaCertificadoDTO;

/**
 * <b>Descripción:</b> Clase que implementa las operaciones del servicio de certificados. <br/>
 * <b>Caso de Uso:</b> GVI-VIN-3-FAB-02-GenerarCertificadoVinculado.<br/>
 * <b>Caso de Uso:</b> GVI-VIN-3-FAB-03-GenerarCertificadoVinculadoconSaldo.<br/>
 * <b>Caso de Uso:</b> GVI-VIN-3-FAB-04-GenerarCertificadoVinculadoConMovimientos.<br/>
 * <b>Caso de Uso:</b> GVI-VIN-3-FAB-10-GenerarCertificadoNoVinculado.<br/>
 * <b>Caso de Uso:</b> GVI-VIN-3-FAB-11-GenerarCertificaciónVinculadoOtorgado.<br/>
 *
 * @author Cristian Alexander Salazar Perdomo. <csalazar@heinsohn.com.co>
 */
@Stateless
@WebService(serviceName = "ContratoSvcCertificados", endpointInterface = "co.gov.colpensiones.beps.contracts._1_0.certificados.SvcCertificados", targetNamespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/certificados")
public class SvcCertificadosImpl implements SvcCertificados {
     
    /**
     * Método encargado de expedir los certificados de un vinculado.
     * 
     * <b>Caso de Uso:</b> GVI-VIN-3-FAB-02-GenerarCertificadoVinculado.<br/>
     * 
     * @param informacionContexto, Información de contexto enviada al servicio.
     * @param informacionCertificado, Información para la generación del certificado.
     * @return DTO con la información de respuesta del servicio y el certificado.
     */
    public TipoRespuestaCertificadoDTO generarCertificacionVinculado(
           TipoInformacionContexto informacionContexto,
           TipoInformacionCertificado informacionCertificado) {
    	BLGenerarCertificadoVinculado blCertificadoVinculacion=new BLGenerarCertificadoVinculado(new LoggerBeps(
                ConstantesLoggerServicios.SERVICIO_CERTIFICADOS_VINCULACION, informacionContexto.getSistemaOrigen()));
        return blCertificadoVinculacion.generarCertificadoVinculado(informacionContexto, informacionCertificado);
    }

    /**
     * Método encargado de expedir los certificados con saldo del vinculado.
     * 
     * <b>Caso de Uso:</b> GVI-VIN-3-FAB-03-GenerarCertificadoVinculadoconSaldo.<br/>
     * 
     * @param informacionContexto, Información de contexto enviada al servicio.
     * @param informacionCertificado, Información para la generación del certificado.
     * @return DTO con la información de respuesta del servicio y el certificado.
     */
    public TipoRespuestaCertificadoDTO generarCertificadoVinculadoSaldo(
            TipoInformacionContexto informacionContexto,
            TipoInformacionCertificado informacionCertificado) {
    	BLGenerarCertificadoVinculadoSaldo blCertificadoVinculacionSaldo=new BLGenerarCertificadoVinculadoSaldo(new LoggerBeps(
                ConstantesLoggerServicios.SERVICIO_CERTIFICADOS_VINCULACION_SALDOS, informacionContexto.getSistemaOrigen()));
        return blCertificadoVinculacionSaldo.generarCertificadoVinculadoSaldo(informacionContexto, informacionCertificado);
    }
    
    /**
     * Método encargado de expedir los certificados de un vinculado con saldo y movimientos.
     * 
     * <b>Caso de Uso:</b> GVI-VIN-3-FAB-04-GenerarCertificadoVinculadoConMovimientos.<br/>
     * 
     * @param informacionContexto, Información de contexto enviada al servicio.
     * @param informacionCertificado, Información para la generación del certificado.
     * @return DTO con la información de respuesta del servicio y el certificado.
     */
    public TipoRespuestaCertificadoDTO generarCertificadoVinculadoMovimientos(
            TipoInformacionContexto informacionContexto,
            TipoInformacionCertificado informacionCertificado) {
    	BLGenerarCertificadoVinculadoMovimientos blCertificadoVinculacionMovimientos=new BLGenerarCertificadoVinculadoMovimientos(new LoggerBeps(
                ConstantesLoggerServicios.SERVICIO_CERTIFICADOS_VINCULACION_MOVIMIENTOS, informacionContexto.getSistemaOrigen()));
        return blCertificadoVinculacionMovimientos.generarCertificadoVinculadoMovimientos(informacionContexto, informacionCertificado);
    }
    /**
     * Método encargado de expedir los certificados de un vinculado.
     * 
     * <b>Caso de Uso:</b> GVI-VIN-3-FAB-10-GenerarCertificadoNoVinculado.<br/>
     * 
     * @param informacionContexto, Información de contexto enviada al servicio.
     * @param informacionCertificado, Información para la generación del certificado.
     * @return DTO con la información de respuesta del servicio y el certificado.
     */
    public TipoRespuestaCertificadoDTO generarCertificacionNoVinculado(
           TipoInformacionContexto informacionContexto,
           TipoInformacionCertificadoNoVinculado tipoInformacionCertificadoNoVinculado) {
    	BLGenerarCertificadoNoVinculado blCertificadoNoVinculacion=new BLGenerarCertificadoNoVinculado(new LoggerBeps(
                ConstantesLoggerServicios.SERVICIO_CERTIFICADOS_NO_VINCULACION, informacionContexto.getSistemaOrigen()));
        return blCertificadoNoVinculacion.generarCertificadoNoVinculado(informacionContexto, tipoInformacionCertificadoNoVinculado);
    }
    /**
     * Método encargado de expedir los certificados de un vinculado otorgado.
     * 
     * <b>Caso de Uso:</b> GVI-VIN-3-FAB-11-GenerarCertificaciónVinculadoOtorgado.<br/>
     * 
     * @param informacionContexto, Información de contexto enviada al servicio.
     * @param informacionCertificado, Información para la generación del certificado.
     * @return DTO con la información de respuesta del servicio y el certificado.
     */
    public TipoRespuestaCertificadoDTO generarCertificacionVinculadoOtorgado(
           TipoInformacionContexto informacionContexto,
           TipoInformacionCertificado informacionCertificado) {
    	BLGenerarCertificadoOtorgado blCertificadoVinculacionOtorgado=new BLGenerarCertificadoOtorgado(new LoggerBeps(
                ConstantesLoggerServicios.SERVICIO_CERTIFICADOS_VINCULACION_OTORGADO, informacionContexto.getSistemaOrigen()));
        return blCertificadoVinculacionOtorgado.generarCertificadoVinculadoOtorgado(informacionContexto, informacionCertificado);
    }
}