package co.gov.colpensiones.beps.contracts._1_0.vinculadoasofondos;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import co.gov.colpensiones.beps.schemas._1_0.comun.TipoInformacionContextoExterno;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoDocumentoPersonaNatural;
import co.gov.colpensiones.beps.schemas._1_0.vinculadoasofondos.TipoInformacionSolicitanteDTO;


/**
 * <b>Descripción:</b>Clase que expone las operaciones del servicio de Vinculado Asofondos <br/>
 * <b>Caso de Uso:</b>GVI-VIN-3-FAB-14-ConsultarViabilidadVinculacionAsofondos<br/>
 *
 *
 * @author Yesika Ramirez <yeramirez@heinsohn.com.co>
 */
@WebService(targetNamespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/vinculadoasofondos", name = "SvcVinculadoBepsAsofondos")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)

public interface SvcVinculadoBepsAsofondos {    
     
    /**
     * Esta operación permite realizar la consulta  por tipo y número de documento de un solicitante, de la información registrada en el Sistema de Gestión BEPS, para determinar si es viable o inviable la vinculación al programa BEPS
     * <b>Caso de Uso:</b>PT-INGE-014-GVI-VIN-3-FAB-14-ConsultarViabilidadVinculaciónAsofondos<br/>
     * @param informacionContexto, 
     * 			Estructura con los datos de contexto de la invocación.
     * @param identificacion, 
     * 			Datos de identificación del solicitante
     * @return DTO con el resultado de la ejecucion	
     */
    @WebResult(name = "informacionSolicitante", targetNamespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/vinculadoasofondos", partName = "EstadoEjecucion")
    @WebMethod(operationName = "Consultar", action = "http://www.colpensiones.gov.co/beps/contracts/1.0/vinculadoasofondos/Consultar")
    public TipoInformacionSolicitanteDTO consultar(
        @WebParam(partName = "InformacionContexto", name = "InformacionContexto", targetNamespace = "http://www.colpensiones.gov.co/beps/schemas/1.0/comun", header = true)
        TipoInformacionContextoExterno informacionContextoExterno,
        @WebParam(partName = "Identificacion", name = "Identificacion", targetNamespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/personas")
        TipoDocumentoPersonaNatural documentoPersonaNatural
    );
}