package co.gov.colpensiones.beps.contracts._1_0.certificados;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.soap.MTOM;

import co.gov.colpensiones.beps.schemas._1_0.certificados.TipoInformacionCertificado;
import co.gov.colpensiones.beps.schemas._1_0.certificados.TipoInformacionCertificadoNoVinculado;
import co.gov.colpensiones.beps.schemas._1_0.certificados.TipoInformacionContexto;
import co.gov.colpensiones.beps.schemas._1_0.certificados.TipoRespuestaCertificadoDTO;

/**
 * <b>Descripción:</b> Clase que expone las operaciones del servicio de certificados. <br/>
 * <b>Caso de Uso:</b> GVI-VIN-3-FAB-02-GenerarCertificadoVinculado.<br/>
 * <b>Caso de Uso:</b> GVI-VIN-3-FAB-03-GenerarCertificadoVinculadoconSaldo.<br/>
 * <b>Caso de Uso:</b> GVI-VIN-3-FAB-04-GenerarCertificadoVinculadoConMovimientos.<br/>
 * <b>Caso de Uso:</b> GVI-VIN-3-FAB-10-GenerarCertificadoNoVinculado.<br/>
 * <b>Caso de Uso:</b> GVI-VIN-3-FAB-11-GenerarCertificaciónVinculadoOtorgado.<br/>
 *
 * @author Cristian Alexander Salazar Perdomo. <csalazar@heinsohn.com.co>
 */
@WebService(targetNamespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/certificados", name = "SvcCertificados")
@XmlSeeAlso({ObjectFactory.class, co.gov.colpensiones.beps.schemas._1_0.comun.ObjectFactory.class, co.gov.colpensiones.beps.schemas._1_0.certificados.ObjectFactory.class, co.gov.colpensiones.beps.schemas._1_0.personas.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@MTOM(enabled=true,threshold=2048)
public interface SvcCertificados {
    
    /**
     * Método encargado de expedir los certificados de un vinculado.
     * 
     * <b>Caso de Uso:</b> GVI-VIN-3-FAB-02-GenerarCertificadoVinculado.<br/>
     * 
     * @param informacionContexto, Información de contexto enviada al servicio.
     * @param informacionCertificado, Información para la generación del certificado.
     * @return DTO con la información de respuesta del servicio y el certificado.
     */
    @WebResult(name = "tipoRespuestaCertificadoDTO", targetNamespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/certificados", partName = "EstadoEjecucion")
    @WebMethod(operationName = "GenerarCertificacionVinculado", action = "http://www.colpensiones.gov.co/beps/contracts/1.0/certificados/GenerarCertificacionVinculado")
    public TipoRespuestaCertificadoDTO generarCertificacionVinculado(
        @WebParam(partName = "InformacionContexto", name = "InformacionContexto", targetNamespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/certificados", header = true)
        TipoInformacionContexto informacionContexto,
        @WebParam(partName = "InformacionCertificado", name = "tipoInformacionCertificado", targetNamespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/certificados")
        TipoInformacionCertificado informacionCertificado
    );

    /**
     * Método encargado de expedir los certificados con saldo del vinculado.
     * 
     * <b>Caso de Uso:</b> GVI-VIN-3-FAB-03-GenerarCertificadoVinculadoconSaldo.<br/>
     * 
     * @param informacionContexto, Información de contexto enviada al servicio.
     * @param informacionCertificado, Información para la generación del certificado.
     * @return DTO con la información de respuesta del servicio y el certificado.
     */
    @WebResult(name = "tipoRespuestaCertificadoDTO", targetNamespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/certificados", partName = "EstadoEjecucion")
    @WebMethod(operationName = "GenerarCertificadoVinculadoSaldo", action = "http://www.colpensiones.gov.co/beps/contracts/1.0/certificados/GenerarCertificadoVinculadoSaldo")
    public TipoRespuestaCertificadoDTO generarCertificadoVinculadoSaldo(
        @WebParam(partName = "InformacionContexto", name = "InformacionContexto", targetNamespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/certificados", header = true)
        TipoInformacionContexto informacionContexto,
        @WebParam(partName = "InformacionCertificado", name = "tipoInformacionCertificado", targetNamespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/certificados")
        TipoInformacionCertificado informacionCertificado
    );
    
    /**
     * Método encargado de expedir los certificados de un vinculado con saldo y movimientos.
     * 
     * <b>Caso de Uso:</b> GVI-VIN-3-FAB-04-GenerarCertificadoVinculadoConMovimientos.<br/>
     * 
     * @param informacionContexto, Información de contexto enviada al servicio.
     * @param informacionCertificado, Información para la generación del certificado.
     * @return DTO con la información de respuesta del servicio y el certificado.
     */
    @WebResult(name = "tipoRespuestaCertificadoDTO", targetNamespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/certificados", partName = "EstadoEjecucion")
    @WebMethod(operationName = "GenerarCertificadoVinculadoMovimientos", action = "http://www.colpensiones.gov.co/beps/contracts/1.0/certificados/GenerarCertificadoVinculadoMovimientos")
    public TipoRespuestaCertificadoDTO generarCertificadoVinculadoMovimientos(
        @WebParam(partName = "InformacionContexto", name = "InformacionContexto", targetNamespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/certificados", header = true)
        TipoInformacionContexto informacionContexto,
        @WebParam(partName = "InformacionCertificado", name = "tipoInformacionCertificado", targetNamespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/certificados")
        TipoInformacionCertificado informacionCertificado
    );
    
    /**
     * Método encargado de expedir los certificados de un vinculado.
     * 
     * <b>Caso de Uso:</b> GVI-VIN-3-FAB-10-GenerarCertificadoNoVinculado.<br/>
     * 
     * @param informacionContexto, Información de contexto enviada al servicio.
     * @param informacionCertificado, Información para la generación del certificado.
     * @return DTO con la información de respuesta del servicio y el certificado.
     */
    @WebResult(name = "tipoRespuestaCertificadoDTO", targetNamespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/certificados", partName = "EstadoEjecucion")
    @WebMethod(operationName = "GenerarCertificacionNoVinculado", action = "http://www.colpensiones.gov.co/beps/contracts/1.0/certificados/GenerarCertificacionNoVinculado")
    public TipoRespuestaCertificadoDTO generarCertificacionNoVinculado(
        @WebParam(partName = "InformacionContexto", name = "InformacionContexto", targetNamespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/certificados", header = true)
        TipoInformacionContexto informacionContexto,
        @WebParam(partName = "InformacionCertificado", name = "tipoInformacionCertificadoNoVinculado", targetNamespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/certificados")
        TipoInformacionCertificadoNoVinculado tipoInformacionCertificadoNoVinculado
    );
    /**
     * Método encargado de expedir los certificados de un vinculado otorgado.
     * 
     * <b>Caso de Uso:</b> GVI-VIN-3-FAB-11-GenerarCertificaciónVinculadoOtorgado.<br/>
     * 
     * @param informacionContexto, Información de contexto enviada al servicio.
     * @param informacionCertificado, Información para la generación del certificado.
     * @return DTO con la información de respuesta del servicio y el certificado.
     */
    @WebResult(name = "tipoRespuestaCertificadoDTO", targetNamespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/certificados", partName = "EstadoEjecucion")
    @WebMethod(operationName = "GenerarCertificacionVinculadoOtorgado", action = "http://www.colpensiones.gov.co/beps/contracts/1.0/certificados/GenerarCertificacionVinculadoOtorgado")
    public TipoRespuestaCertificadoDTO generarCertificacionVinculadoOtorgado(
        @WebParam(partName = "InformacionContexto", name = "InformacionContexto", targetNamespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/certificados", header = true)
        TipoInformacionContexto informacionContexto,
        @WebParam(partName = "InformacionCertificado", name = "tipoInformacionCertificado", targetNamespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/certificados")
        TipoInformacionCertificado informacionCertificado
    );
}