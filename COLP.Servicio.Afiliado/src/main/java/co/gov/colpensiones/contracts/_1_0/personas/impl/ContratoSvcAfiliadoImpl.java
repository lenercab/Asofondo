package co.gov.colpensiones.contracts._1_0.personas.impl;


import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import co.gov.colpensiones.contracts._1_0.personas.*;
import co.gov.colpensiones.schemas._1_0.comun.errores.TipoEstadoEjecucion;

import javax.jws.WebService;

@WebService(serviceName = "SvcAfiliado", endpointInterface = "co.gov.colpensiones.contracts._1_0.personas.ContratoSvcAfiliado", targetNamespace = "http://www.colpensiones.gov.co/contracts/1.0/personas")
public class ContratoSvcAfiliadoImpl implements ContratoSvcAfiliado {
	public co.gov.colpensiones.schemas._1_0.personas.TipoInformacionCertificacionDTO generarCertificacionAfiliacion(
			co.gov.colpensiones.schemas._1_0.personas.TipoCriteriosCertificacionAfiliacionDTO criteriosCertificacionAfiliacionDTO) {
		return null;
	}

	public co.gov.colpensiones.schemas._1_0.comun.errores.TipoEstadoEjecucion crearRelacionLaboral(
			co.gov.colpensiones.schemas._1_0.personas.TipoInformacionRegistroRelacionLaboralDTO informacionRegistroRelacionLaboralDTO) {
		return null;
	}

	public co.gov.colpensiones.schemas._1_0.personas.TipoEstadoAfiliacionFondosPrivadosDTO validarExistenciaFondosPrivados(
			co.gov.colpensiones.schemas._1_0.personas.TipoInformacionBasicaIdentificacionPersona informacionBasicaAfiliado) {
		return null;
	}

	public co.gov.colpensiones.schemas._1_0.comun.errores.TipoEstadoEjecucion actualizar(
			co.gov.colpensiones.schemas._1_0.personas.TipoInformacionActualizacionAfiliacionDTO informacionActualizacionAfiliacionDTO) {
		return null;
	}

	public co.gov.colpensiones.schemas._1_0.personas.TipoInformacionGeneralPersonaDTO consultarInformacionGeneral(
			co.gov.colpensiones.schemas._1_0.personas.TipoIdentificacionPersona identificacionPersona) {
		return null;
	}

	public co.gov.colpensiones.schemas._1_0.comun.errores.TipoEstadoEjecucion crear(
			co.gov.colpensiones.schemas._1_0.personas.TipoInformacionRegistroInicialAfiliacionDTO informacionRegistroInicialAfiliacionDTO) {
		return null;
	}

	public co.gov.colpensiones.schemas._1_0.comun.errores.TipoEstadoEjecucion actualizarRelacionLaboral(
			co.gov.colpensiones.schemas._1_0.personas.TipoInformacionRegistroRelacionLaboralDTO informacionRegistroRelacionLaboralDTO) {
		TipoEstadoEjecucion response = new TipoEstadoEjecucion();
		response.setCodigo("0");
		response.setDescripcion("");
		return response;
	}
}