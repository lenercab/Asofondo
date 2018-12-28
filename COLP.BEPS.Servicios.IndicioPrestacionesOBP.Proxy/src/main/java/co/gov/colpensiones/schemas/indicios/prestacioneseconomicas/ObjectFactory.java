
package co.gov.colpensiones.schemas.indicios.prestacioneseconomicas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import co.gov.colpensiones.schemas.indicios.comun.TipoRespuestaTarea;
import co.gov.colpensiones.schemas.indicios.comun.errores.TipoEstadoEjecucion;
import co.gov.colpensiones.schemas.indicios.personas.TipoIdentificacionPersona;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.gov.colpensiones.schemas._1_0.prestacioneseconomicas package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TipoInformacionInconsistenciaCotizacionAntes1995_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionInconsistenciaCotizacionAntes1995");
    private final static QName _TipoInformacionActualizacionPeriodoCotizado_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionActualizacionPeriodoCotizado");
    private final static QName _InformacionGeneralReconocimiento_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "InformacionGeneralReconocimiento");
    private final static QName _TipoInformacionCausante_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionCausante");
    private final static QName _TipoInformacionReconocimiento_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionReconocimiento");
    private final static QName _TipoInformacionSolicitanteTercero_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionSolicitanteTercero");
    private final static QName _TipoInformacionPeriodosVinculacion_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionPeriodosVinculacion");
    private final static QName _TipoInformacionDatosAfiliacionesAsignados_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionDatosAfiliacionesAsignados");
    private final static QName _TipoTipoPension_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoTipoPension");
    private final static QName _TipoInformacionConsultaGeneralReconocimiento_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionConsultaGeneralReconocimiento");
    private final static QName _TipoFactorCalculoSalario_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoFactorCalculoSalario");
    private final static QName _TipoInformacionBasicaTramiteReconocimiento_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionBasicaTramiteReconocimiento");
    private final static QName _TipoInformacionSalario_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionSalario");
    private final static QName _TipoInformacionIndiciosVinculacionesLaborales_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionIndiciosVinculacionesLaborales");
    private final static QName _TipoPensiones_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoPensiones");
    private final static QName _TipoInformacionPrestacion_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionPrestacion");
    private final static QName _TipoInformacionBeneficiario_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionBeneficiario");
    private final static QName _TipoTiempoPublico_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoTiempoPublico");
    private final static QName _TipoInformacionConsultaGeneralReconocimientoDTO_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionConsultaGeneralReconocimientoDTO");
    private final static QName _TipoInformacionPrestaciones_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionPrestaciones");
    private final static QName _TipoInformacionGeneralPensionado_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionGeneralPensionado");
    private final static QName _TipoInformacionSolicitudRetiroBEPS_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionSolicitudRetiroBEPS");
    private final static QName _TipoInformacionRequerimiento_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionRequerimiento");
    private final static QName _TipoInformacionCalculoBase_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionCalculoBase");
    private final static QName _TipoInformacionSalarios_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionSalarios");
    private final static QName _TipoCriteriosSimulacionBEPS_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoCriteriosSimulacionBEPS");
    private final static QName _TipoInformacionGeneralActo_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionGeneralActo");
    private final static QName _TipoDetalleCargueTiemposPublicos_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoDetalleCargueTiemposPublicos");
    private final static QName _TipoCargueTiemposPublicos_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoCargueTiemposPublicos");
    private final static QName _TipoInformacionOtrasAfiliaciones_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionOtrasAfiliaciones");
    private final static QName _TipoInformacionPeriodosFaltantes_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionPeriodosFaltantes");
    private final static QName _TipoInformacionInconsistenciasCotizacionesAntes1995_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionInconsistenciasCotizacionesAntes1995");
    private final static QName _TipoInformacionTiemposPublicos_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionTiemposPublicos");
    private final static QName _TipoRelacionNacionalidad_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoRelacionNacionalidad");
    private final static QName _TipoInformacionDatosActualesAfiliado_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionDatosActualesAfiliado");
    private final static QName _TipoInformacionOtraAfiliacion_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionOtraAfiliacion");
    private final static QName _RespuestaTarea_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "RespuestaTarea");
    private final static QName _TipoInformacionResolucionPension_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionResolucionPension");
    private final static QName _TipoInformacionPeriodoVinculacion_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionPeriodoVinculacion");
    private final static QName _TipoInformacionGeneralControladorCargue_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionGeneralControladorCargue");
    private final static QName _TipoBeneficiariosReconocimiento_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoBeneficiariosReconocimiento");
    private final static QName _TipoPeriodoCotizacion_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoPeriodoCotizacion");
    private final static QName _TipoInformacionBasicaCargueReconocimiento_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionBasicaCargueReconocimiento");
    private final static QName _TipoInformacionFormato_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionFormato");
    private final static QName _TipoInformacionPeriodo_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionPeriodo");
    private final static QName _TipoMiembroFamiliarPension_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoMiembroFamiliarPension");
    private final static QName _TipoInformacionGeneralBeneficiarioPension_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionGeneralBeneficiarioPension");
    private final static QName _TipoInformacionApoderado_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionApoderado");
    private final static QName _TipoInformacionIndicioVinculacionLaboral_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionIndicioVinculacionLaboral");
    private final static QName _TipoDatosPension_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoDatosPension");
    private final static QName _TipoInformacionActualizacionPeriodosCotizados_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionActualizacionPeriodosCotizados");
    private final static QName _TipoBeneficiarios_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoBeneficiarios");
    private final static QName _TipoInformacionBasicaCargueBeneficiario_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionBasicaCargueBeneficiario");
    private final static QName _TipoInformacionGeneralReconocimiento_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionGeneralReconocimiento");
    private final static QName _TipoConsecutivo_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoConsecutivo");
    private final static QName _TipoInformacionPensionOBP_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionPensionOBP");
    private final static QName _TipoInformacionGeneralBeneficiarioPensionDTO_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionGeneralBeneficiarioPensionDTO");
    private final static QName _TipoInformacionFuncionarioCertificador_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionFuncionarioCertificador");
    private final static QName _TipoInformacionPeriodosAportes_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionPeriodosAportes");
    private final static QName _TipoInformacionGeneralCargueHistoriaLaboral_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionGeneralCargueHistoriaLaboral");
    private final static QName _TipoInformacionCertificacionTiemposPublicos_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionCertificacionTiemposPublicos");
    private final static QName _TipoComposicionFamiliar_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoComposicionFamiliar");
    private final static QName _TipoInformacionGeneralTrabajadorTiemposPublicos_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionGeneralTrabajadorTiemposPublicos");
    private final static QName _InformacionPensionado_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "InformacionPensionado");
    private final static QName _TipoInformacionConsultaGeneralPensionado_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionConsultaGeneralPensionado");
    private final static QName _TipoInformacionConsultaGeneralReconocimientos_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionConsultaGeneralReconocimientos");
    private final static QName _TipoInformacionGeneralEmpleadorTiemposPublicos_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionGeneralEmpleadorTiemposPublicos");
    private final static QName _TipoInformacionBasicaActo_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionBasicaActo");
    private final static QName _TipoIdentificacionSolicitudRetiroBEPS_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoIdentificacionSolicitudRetiroBEPS");
    private final static QName _TipoInformacionComplementariaFormato1_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionComplementariaFormato1");
    private final static QName _InformacionGeneralCargueBeneficiario_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "InformacionGeneralCargueBeneficiario");
    private final static QName _TipoInformacionRegimenTransicion_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionRegimenTransicion");
    private final static QName _TipoBeneficiario_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoBeneficiario");
    private final static QName _TipoFactoresCalculoSalario_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoFactoresCalculoSalario");
    private final static QName _TipoInformacionConsultaGeneralCausante_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionConsultaGeneralCausante");
    private final static QName _TipoInformacionGeneralPension_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionGeneralPension");
    private final static QName _TipoInformacionCargue_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionCargue");
    private final static QName _TipoInformacionBeneficiarioReconocimiento_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionBeneficiarioReconocimiento");
    private final static QName _TipoInformacionConsultaGeneralCausanteDTO_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionConsultaGeneralCausanteDTO");
    private final static QName _TipoNotificacionMediosElectronicos_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoNotificacionMediosElectronicos");
    private final static QName _InformacionGeneralBeneficiarioPensionDTO_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "InformacionGeneralBeneficiarioPensionDTO");
    private final static QName _TipoDatosPensiones_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoDatosPensiones");
    private final static QName _TipoInformacionCausanteCargue_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionCausanteCargue");
    private final static QName _TipoInformacionPeriodosCotizacionFondosPrivados_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionPeriodosCotizacionFondosPrivados");
    private final static QName _TipoInformacionCausanteReconocimiento_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionCausanteReconocimiento");
    private final static QName _TipoInformacionPeriodoAporte_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionPeriodoAporte");
    private final static QName _TipoInformacionGeneralCargueReconocimiento_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionGeneralCargueReconocimiento");
    private final static QName _TipoInformacionConsultaGeneralBeneficiarioPension_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionConsultaGeneralBeneficiarioPension");
    private final static QName _TipoInformacionPeriodosCotizacion_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionPeriodosCotizacion");
    private final static QName _TipoResultadoSimulacionBEPS_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoResultadoSimulacionBEPS");
    private final static QName _TipoInformacionFormatos_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionFormatos");
    private final static QName _InformacionConsultaGeneralPensionadoDTO_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "InformacionConsultaGeneralPensionadoDTO");
    private final static QName _TipoInformacionTramiteCargueHistoriaLaboral_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionTramiteCargueHistoriaLaboral");
    private final static QName _TipoInformacionDatoErradoPago_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionDatoErradoPago");
    private final static QName _TipoInformacionGeneralCargueTiemposPublicos_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionGeneralCargueTiemposPublicos");
    private final static QName _EstadoEjecucion_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "EstadoEjecucion");
    private final static QName _TipoPrestacionReconocimiento_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoPrestacionReconocimiento");
    private final static QName _TipoInformacionGeneralCargueBeneficiario_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionGeneralCargueBeneficiario");
    private final static QName _TipoResultadoSolicitudRetiroBEPSDTO_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoResultadoSolicitudRetiroBEPSDTO");
    private final static QName _TipoResolucionPrestacion_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoResolucionPrestacion");
    private final static QName _TipoInformacionBasicaCargueTiemposPublicos_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionBasicaCargueTiemposPublicos");
    private final static QName _IdentificacionPersona_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "IdentificacionPersona");
    private final static QName _TipoInformacionResultadoSimulacionBEPSDTO_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionResultadoSimulacionBEPSDTO");
    private final static QName _TipoInformacionFormato2_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionFormato2");
    private final static QName _TipoInformacionFormato1_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionFormato1");
    private final static QName _TipoEstadoPension_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoEstadoPension");
    private final static QName _TipoInformacionFormato3_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionFormato3");
    private final static QName _TipoInformacionDatosAfiliacionAsignados_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionDatosAfiliacionAsignados");
    private final static QName _TipoInformacionBasicaPension_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionBasicaPension");
    private final static QName _TipoInformacionCalculosFechaBase_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionCalculosFechaBase");
    private final static QName _TipoInformacionCotizacionesAdicionales_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionCotizacionesAdicionales");
    private final static QName _TipoRiesgo_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoRiesgo");
    private final static QName _TipoInformacionPeriodoCotizacionFondosPrivados_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionPeriodoCotizacionFondosPrivados");
    private final static QName _TipoInformacionInconsistenciasCotizacionesDespues1995_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionInconsistenciasCotizacionesDespues1995");
    private final static QName _TipoInformacionApoderadoAutorizado_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionApoderadoAutorizado");
    private final static QName _TipoInformacionAfiliadoCargueHistoriaLaboral_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "tipoInformacionAfiliadoCargueHistoriaLaboral");
    private final static QName _TipoInformacionBasicaTramiteReconocimientoEstadoTraslado_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "estadoTraslado");
    private final static QName _TipoInformacionBasicaTramiteReconocimientoProcesamientoAutomatico_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "procesamientoAutomatico");
    private final static QName _TipoInformacionBasicaTramiteReconocimientoCodigoEPS_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", "codigoEPS");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.colpensiones.schemas._1_0.prestacioneseconomicas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoInformacionPensionOBP }
     * 
     */
    public TipoInformacionPensionOBP createTipoInformacionPensionOBP() {
        return new TipoInformacionPensionOBP();
    }

    /**
     * Create an instance of {@link TipoInformacionConsultaGeneralCausanteDTO }
     * 
     */
    public TipoInformacionConsultaGeneralCausanteDTO createTipoInformacionConsultaGeneralCausanteDTO() {
        return new TipoInformacionConsultaGeneralCausanteDTO();
    }

    /**
     * Create an instance of {@link TipoResultadoSimulacionBEPS }
     * 
     */
    public TipoResultadoSimulacionBEPS createTipoResultadoSimulacionBEPS() {
        return new TipoResultadoSimulacionBEPS();
    }

    /**
     * Create an instance of {@link TipoInformacionGeneralPensionado }
     * 
     */
    public TipoInformacionGeneralPensionado createTipoInformacionGeneralPensionado() {
        return new TipoInformacionGeneralPensionado();
    }

    /**
     * Create an instance of {@link TipoInformacionPeriodosCotizacion }
     * 
     */
    public TipoInformacionPeriodosCotizacion createTipoInformacionPeriodosCotizacion() {
        return new TipoInformacionPeriodosCotizacion();
    }

    /**
     * Create an instance of {@link TipoInformacionPrestaciones }
     * 
     */
    public TipoInformacionPrestaciones createTipoInformacionPrestaciones() {
        return new TipoInformacionPrestaciones();
    }

    /**
     * Create an instance of {@link TipoInformacionConsultaGeneralBeneficiarioPension }
     * 
     */
    public TipoInformacionConsultaGeneralBeneficiarioPension createTipoInformacionConsultaGeneralBeneficiarioPension() {
        return new TipoInformacionConsultaGeneralBeneficiarioPension();
    }

    /**
     * Create an instance of {@link TipoCriteriosSimulacionBEPS }
     * 
     */
    public TipoCriteriosSimulacionBEPS createTipoCriteriosSimulacionBEPS() {
        return new TipoCriteriosSimulacionBEPS();
    }

    /**
     * Create an instance of {@link TipoInformacionSalarios }
     * 
     */
    public TipoInformacionSalarios createTipoInformacionSalarios() {
        return new TipoInformacionSalarios();
    }

    /**
     * Create an instance of {@link TipoInformacionTramiteCargueHistoriaLaboral }
     * 
     */
    public TipoInformacionTramiteCargueHistoriaLaboral createTipoInformacionTramiteCargueHistoriaLaboral() {
        return new TipoInformacionTramiteCargueHistoriaLaboral();
    }

    /**
     * Create an instance of {@link TipoInformacionConsultaGeneralPensionadoDTO }
     * 
     */
    public TipoInformacionConsultaGeneralPensionadoDTO createTipoInformacionConsultaGeneralPensionadoDTO() {
        return new TipoInformacionConsultaGeneralPensionadoDTO();
    }

    /**
     * Create an instance of {@link TipoInformacionCalculoBase }
     * 
     */
    public TipoInformacionCalculoBase createTipoInformacionCalculoBase() {
        return new TipoInformacionCalculoBase();
    }

    /**
     * Create an instance of {@link TipoInformacionRequerimiento }
     * 
     */
    public TipoInformacionRequerimiento createTipoInformacionRequerimiento() {
        return new TipoInformacionRequerimiento();
    }

    /**
     * Create an instance of {@link TipoInformacionSolicitudRetiroBEPS }
     * 
     */
    public TipoInformacionSolicitudRetiroBEPS createTipoInformacionSolicitudRetiroBEPS() {
        return new TipoInformacionSolicitudRetiroBEPS();
    }

    /**
     * Create an instance of {@link TipoInformacionFormatos }
     * 
     */
    public TipoInformacionFormatos createTipoInformacionFormatos() {
        return new TipoInformacionFormatos();
    }

    /**
     * Create an instance of {@link TipoInformacionGeneralCargueTiemposPublicos }
     * 
     */
    public TipoInformacionGeneralCargueTiemposPublicos createTipoInformacionGeneralCargueTiemposPublicos() {
        return new TipoInformacionGeneralCargueTiemposPublicos();
    }

    /**
     * Create an instance of {@link TipoInformacionOtrasAfiliaciones }
     * 
     */
    public TipoInformacionOtrasAfiliaciones createTipoInformacionOtrasAfiliaciones() {
        return new TipoInformacionOtrasAfiliaciones();
    }

    /**
     * Create an instance of {@link TipoCargueTiemposPublicos }
     * 
     */
    public TipoCargueTiemposPublicos createTipoCargueTiemposPublicos() {
        return new TipoCargueTiemposPublicos();
    }

    /**
     * Create an instance of {@link TipoDetalleCargueTiemposPublicos }
     * 
     */
    public TipoDetalleCargueTiemposPublicos createTipoDetalleCargueTiemposPublicos() {
        return new TipoDetalleCargueTiemposPublicos();
    }

    /**
     * Create an instance of {@link TipoInformacionDatoErradoPago }
     * 
     */
    public TipoInformacionDatoErradoPago createTipoInformacionDatoErradoPago() {
        return new TipoInformacionDatoErradoPago();
    }

    /**
     * Create an instance of {@link TipoInformacionGeneralActo }
     * 
     */
    public TipoInformacionGeneralActo createTipoInformacionGeneralActo() {
        return new TipoInformacionGeneralActo();
    }

    /**
     * Create an instance of {@link TipoInformacionOtraAfiliacion }
     * 
     */
    public TipoInformacionOtraAfiliacion createTipoInformacionOtraAfiliacion() {
        return new TipoInformacionOtraAfiliacion();
    }

    /**
     * Create an instance of {@link TipoInformacionDatosActualesAfiliado }
     * 
     */
    public TipoInformacionDatosActualesAfiliado createTipoInformacionDatosActualesAfiliado() {
        return new TipoInformacionDatosActualesAfiliado();
    }

    /**
     * Create an instance of {@link TipoRelacionNacionalidad }
     * 
     */
    public TipoRelacionNacionalidad createTipoRelacionNacionalidad() {
        return new TipoRelacionNacionalidad();
    }

    /**
     * Create an instance of {@link TipoInformacionTiemposPublicos }
     * 
     */
    public TipoInformacionTiemposPublicos createTipoInformacionTiemposPublicos() {
        return new TipoInformacionTiemposPublicos();
    }

    /**
     * Create an instance of {@link TipoResultadoSolicitudRetiroBEPSDTO }
     * 
     */
    public TipoResultadoSolicitudRetiroBEPSDTO createTipoResultadoSolicitudRetiroBEPSDTO() {
        return new TipoResultadoSolicitudRetiroBEPSDTO();
    }

    /**
     * Create an instance of {@link TipoInformacionGeneralCargueBeneficiario }
     * 
     */
    public TipoInformacionGeneralCargueBeneficiario createTipoInformacionGeneralCargueBeneficiario() {
        return new TipoInformacionGeneralCargueBeneficiario();
    }

    /**
     * Create an instance of {@link TipoInformacionInconsistenciasCotizacionesAntes1995 }
     * 
     */
    public TipoInformacionInconsistenciasCotizacionesAntes1995 createTipoInformacionInconsistenciasCotizacionesAntes1995() {
        return new TipoInformacionInconsistenciasCotizacionesAntes1995();
    }

    /**
     * Create an instance of {@link TipoPrestacionReconocimiento }
     * 
     */
    public TipoPrestacionReconocimiento createTipoPrestacionReconocimiento() {
        return new TipoPrestacionReconocimiento();
    }

    /**
     * Create an instance of {@link TipoInformacionPeriodosFaltantes }
     * 
     */
    public TipoInformacionPeriodosFaltantes createTipoInformacionPeriodosFaltantes() {
        return new TipoInformacionPeriodosFaltantes();
    }

    /**
     * Create an instance of {@link TipoInformacionBasicaCargueTiemposPublicos }
     * 
     */
    public TipoInformacionBasicaCargueTiemposPublicos createTipoInformacionBasicaCargueTiemposPublicos() {
        return new TipoInformacionBasicaCargueTiemposPublicos();
    }

    /**
     * Create an instance of {@link TipoInformacionResolucionPension }
     * 
     */
    public TipoInformacionResolucionPension createTipoInformacionResolucionPension() {
        return new TipoInformacionResolucionPension();
    }

    /**
     * Create an instance of {@link TipoResolucionPrestacion }
     * 
     */
    public TipoResolucionPrestacion createTipoResolucionPrestacion() {
        return new TipoResolucionPrestacion();
    }

    /**
     * Create an instance of {@link TipoInformacionBasicaPension }
     * 
     */
    public TipoInformacionBasicaPension createTipoInformacionBasicaPension() {
        return new TipoInformacionBasicaPension();
    }

    /**
     * Create an instance of {@link TipoInformacionDatosAfiliacionAsignados }
     * 
     */
    public TipoInformacionDatosAfiliacionAsignados createTipoInformacionDatosAfiliacionAsignados() {
        return new TipoInformacionDatosAfiliacionAsignados();
    }

    /**
     * Create an instance of {@link TipoPeriodoCotizacion }
     * 
     */
    public TipoPeriodoCotizacion createTipoPeriodoCotizacion() {
        return new TipoPeriodoCotizacion();
    }

    /**
     * Create an instance of {@link TipoBeneficiariosReconocimiento }
     * 
     */
    public TipoBeneficiariosReconocimiento createTipoBeneficiariosReconocimiento() {
        return new TipoBeneficiariosReconocimiento();
    }

    /**
     * Create an instance of {@link TipoInformacionGeneralControladorCargue }
     * 
     */
    public TipoInformacionGeneralControladorCargue createTipoInformacionGeneralControladorCargue() {
        return new TipoInformacionGeneralControladorCargue();
    }

    /**
     * Create an instance of {@link TipoInformacionFormato3 }
     * 
     */
    public TipoInformacionFormato3 createTipoInformacionFormato3() {
        return new TipoInformacionFormato3();
    }

    /**
     * Create an instance of {@link TipoInformacionPeriodoVinculacion }
     * 
     */
    public TipoInformacionPeriodoVinculacion createTipoInformacionPeriodoVinculacion() {
        return new TipoInformacionPeriodoVinculacion();
    }

    /**
     * Create an instance of {@link TipoEstadoPension }
     * 
     */
    public TipoEstadoPension createTipoEstadoPension() {
        return new TipoEstadoPension();
    }

    /**
     * Create an instance of {@link TipoInformacionFormato1 }
     * 
     */
    public TipoInformacionFormato1 createTipoInformacionFormato1() {
        return new TipoInformacionFormato1();
    }

    /**
     * Create an instance of {@link TipoInformacionFormato2 }
     * 
     */
    public TipoInformacionFormato2 createTipoInformacionFormato2() {
        return new TipoInformacionFormato2();
    }

    /**
     * Create an instance of {@link TipoInformacionResultadoSimulacionBEPSDTO }
     * 
     */
    public TipoInformacionResultadoSimulacionBEPSDTO createTipoInformacionResultadoSimulacionBEPSDTO() {
        return new TipoInformacionResultadoSimulacionBEPSDTO();
    }

    /**
     * Create an instance of {@link TipoInformacionApoderadoAutorizado }
     * 
     */
    public TipoInformacionApoderadoAutorizado createTipoInformacionApoderadoAutorizado() {
        return new TipoInformacionApoderadoAutorizado();
    }

    /**
     * Create an instance of {@link TipoMiembroFamiliarPension }
     * 
     */
    public TipoMiembroFamiliarPension createTipoMiembroFamiliarPension() {
        return new TipoMiembroFamiliarPension();
    }

    /**
     * Create an instance of {@link TipoInformacionPeriodo }
     * 
     */
    public TipoInformacionPeriodo createTipoInformacionPeriodo() {
        return new TipoInformacionPeriodo();
    }

    /**
     * Create an instance of {@link TipoInformacionInconsistenciasCotizacionesDespues1995 }
     * 
     */
    public TipoInformacionInconsistenciasCotizacionesDespues1995 createTipoInformacionInconsistenciasCotizacionesDespues1995() {
        return new TipoInformacionInconsistenciasCotizacionesDespues1995();
    }

    /**
     * Create an instance of {@link TipoInformacionFormato }
     * 
     */
    public TipoInformacionFormato createTipoInformacionFormato() {
        return new TipoInformacionFormato();
    }

    /**
     * Create an instance of {@link TipoInformacionPeriodoCotizacionFondosPrivados }
     * 
     */
    public TipoInformacionPeriodoCotizacionFondosPrivados createTipoInformacionPeriodoCotizacionFondosPrivados() {
        return new TipoInformacionPeriodoCotizacionFondosPrivados();
    }

    /**
     * Create an instance of {@link TipoInformacionBasicaCargueReconocimiento }
     * 
     */
    public TipoInformacionBasicaCargueReconocimiento createTipoInformacionBasicaCargueReconocimiento() {
        return new TipoInformacionBasicaCargueReconocimiento();
    }

    /**
     * Create an instance of {@link TipoRiesgo }
     * 
     */
    public TipoRiesgo createTipoRiesgo() {
        return new TipoRiesgo();
    }

    /**
     * Create an instance of {@link TipoInformacionCotizacionesAdicionales }
     * 
     */
    public TipoInformacionCotizacionesAdicionales createTipoInformacionCotizacionesAdicionales() {
        return new TipoInformacionCotizacionesAdicionales();
    }

    /**
     * Create an instance of {@link TipoInformacionCalculosFechaBase }
     * 
     */
    public TipoInformacionCalculosFechaBase createTipoInformacionCalculosFechaBase() {
        return new TipoInformacionCalculosFechaBase();
    }

    /**
     * Create an instance of {@link TipoInformacionAfiliadoCargueHistoriaLaboral }
     * 
     */
    public TipoInformacionAfiliadoCargueHistoriaLaboral createTipoInformacionAfiliadoCargueHistoriaLaboral() {
        return new TipoInformacionAfiliadoCargueHistoriaLaboral();
    }

    /**
     * Create an instance of {@link TipoInformacionGeneralBeneficiarioPension }
     * 
     */
    public TipoInformacionGeneralBeneficiarioPension createTipoInformacionGeneralBeneficiarioPension() {
        return new TipoInformacionGeneralBeneficiarioPension();
    }

    /**
     * Create an instance of {@link TipoInformacionReconocimiento }
     * 
     */
    public TipoInformacionReconocimiento createTipoInformacionReconocimiento() {
        return new TipoInformacionReconocimiento();
    }

    /**
     * Create an instance of {@link TipoDatosPension }
     * 
     */
    public TipoDatosPension createTipoDatosPension() {
        return new TipoDatosPension();
    }

    /**
     * Create an instance of {@link TipoInformacionIndicioVinculacionLaboral }
     * 
     */
    public TipoInformacionIndicioVinculacionLaboral createTipoInformacionIndicioVinculacionLaboral() {
        return new TipoInformacionIndicioVinculacionLaboral();
    }

    /**
     * Create an instance of {@link TipoInformacionCausante }
     * 
     */
    public TipoInformacionCausante createTipoInformacionCausante() {
        return new TipoInformacionCausante();
    }

    /**
     * Create an instance of {@link TipoInformacionGeneralReconocimiento }
     * 
     */
    public TipoInformacionGeneralReconocimiento createTipoInformacionGeneralReconocimiento() {
        return new TipoInformacionGeneralReconocimiento();
    }

    /**
     * Create an instance of {@link TipoInformacionActualizacionPeriodoCotizado }
     * 
     */
    public TipoInformacionActualizacionPeriodoCotizado createTipoInformacionActualizacionPeriodoCotizado() {
        return new TipoInformacionActualizacionPeriodoCotizado();
    }

    /**
     * Create an instance of {@link TipoInformacionInconsistenciaCotizacionAntes1995 }
     * 
     */
    public TipoInformacionInconsistenciaCotizacionAntes1995 createTipoInformacionInconsistenciaCotizacionAntes1995() {
        return new TipoInformacionInconsistenciaCotizacionAntes1995();
    }

    /**
     * Create an instance of {@link TipoInformacionApoderado }
     * 
     */
    public TipoInformacionApoderado createTipoInformacionApoderado() {
        return new TipoInformacionApoderado();
    }

    /**
     * Create an instance of {@link TipoInformacionGeneralCargueHistoriaLaboral }
     * 
     */
    public TipoInformacionGeneralCargueHistoriaLaboral createTipoInformacionGeneralCargueHistoriaLaboral() {
        return new TipoInformacionGeneralCargueHistoriaLaboral();
    }

    /**
     * Create an instance of {@link TipoInformacionPeriodosAportes }
     * 
     */
    public TipoInformacionPeriodosAportes createTipoInformacionPeriodosAportes() {
        return new TipoInformacionPeriodosAportes();
    }

    /**
     * Create an instance of {@link TipoInformacionFuncionarioCertificador }
     * 
     */
    public TipoInformacionFuncionarioCertificador createTipoInformacionFuncionarioCertificador() {
        return new TipoInformacionFuncionarioCertificador();
    }

    /**
     * Create an instance of {@link TipoInformacionGeneralBeneficiarioPensionDTO }
     * 
     */
    public TipoInformacionGeneralBeneficiarioPensionDTO createTipoInformacionGeneralBeneficiarioPensionDTO() {
        return new TipoInformacionGeneralBeneficiarioPensionDTO();
    }

    /**
     * Create an instance of {@link TipoConsecutivo }
     * 
     */
    public TipoConsecutivo createTipoConsecutivo() {
        return new TipoConsecutivo();
    }

    /**
     * Create an instance of {@link TipoInformacionBasicaCargueBeneficiario }
     * 
     */
    public TipoInformacionBasicaCargueBeneficiario createTipoInformacionBasicaCargueBeneficiario() {
        return new TipoInformacionBasicaCargueBeneficiario();
    }

    /**
     * Create an instance of {@link TipoBeneficiarios }
     * 
     */
    public TipoBeneficiarios createTipoBeneficiarios() {
        return new TipoBeneficiarios();
    }

    /**
     * Create an instance of {@link TipoInformacionPeriodosVinculacion }
     * 
     */
    public TipoInformacionPeriodosVinculacion createTipoInformacionPeriodosVinculacion() {
        return new TipoInformacionPeriodosVinculacion();
    }

    /**
     * Create an instance of {@link TipoInformacionSolicitanteTercero }
     * 
     */
    public TipoInformacionSolicitanteTercero createTipoInformacionSolicitanteTercero() {
        return new TipoInformacionSolicitanteTercero();
    }

    /**
     * Create an instance of {@link TipoInformacionActualizacionPeriodosCotizados }
     * 
     */
    public TipoInformacionActualizacionPeriodosCotizados createTipoInformacionActualizacionPeriodosCotizados() {
        return new TipoInformacionActualizacionPeriodosCotizados();
    }

    /**
     * Create an instance of {@link TipoFactorCalculoSalario }
     * 
     */
    public TipoFactorCalculoSalario createTipoFactorCalculoSalario() {
        return new TipoFactorCalculoSalario();
    }

    /**
     * Create an instance of {@link TipoInformacionConsultaGeneralPensionado }
     * 
     */
    public TipoInformacionConsultaGeneralPensionado createTipoInformacionConsultaGeneralPensionado() {
        return new TipoInformacionConsultaGeneralPensionado();
    }

    /**
     * Create an instance of {@link TipoInformacionGeneralTrabajadorTiemposPublicos }
     * 
     */
    public TipoInformacionGeneralTrabajadorTiemposPublicos createTipoInformacionGeneralTrabajadorTiemposPublicos() {
        return new TipoInformacionGeneralTrabajadorTiemposPublicos();
    }

    /**
     * Create an instance of {@link TipoInformacionConsultaGeneralReconocimiento }
     * 
     */
    public TipoInformacionConsultaGeneralReconocimiento createTipoInformacionConsultaGeneralReconocimiento() {
        return new TipoInformacionConsultaGeneralReconocimiento();
    }

    /**
     * Create an instance of {@link TipoComposicionFamiliar }
     * 
     */
    public TipoComposicionFamiliar createTipoComposicionFamiliar() {
        return new TipoComposicionFamiliar();
    }

    /**
     * Create an instance of {@link TipoInformacionCertificacionTiemposPublicos }
     * 
     */
    public TipoInformacionCertificacionTiemposPublicos createTipoInformacionCertificacionTiemposPublicos() {
        return new TipoInformacionCertificacionTiemposPublicos();
    }

    /**
     * Create an instance of {@link TipoTipoPension }
     * 
     */
    public TipoTipoPension createTipoTipoPension() {
        return new TipoTipoPension();
    }

    /**
     * Create an instance of {@link TipoInformacionDatosAfiliacionesAsignados }
     * 
     */
    public TipoInformacionDatosAfiliacionesAsignados createTipoInformacionDatosAfiliacionesAsignados() {
        return new TipoInformacionDatosAfiliacionesAsignados();
    }

    /**
     * Create an instance of {@link TipoInformacionBasicaTramiteReconocimiento }
     * 
     */
    public TipoInformacionBasicaTramiteReconocimiento createTipoInformacionBasicaTramiteReconocimiento() {
        return new TipoInformacionBasicaTramiteReconocimiento();
    }

    /**
     * Create an instance of {@link TipoInformacionComplementariaFormato1 }
     * 
     */
    public TipoInformacionComplementariaFormato1 createTipoInformacionComplementariaFormato1() {
        return new TipoInformacionComplementariaFormato1();
    }

    /**
     * Create an instance of {@link TipoIdentificacionSolicitudRetiroBEPS }
     * 
     */
    public TipoIdentificacionSolicitudRetiroBEPS createTipoIdentificacionSolicitudRetiroBEPS() {
        return new TipoIdentificacionSolicitudRetiroBEPS();
    }

    /**
     * Create an instance of {@link TipoInformacionBasicaActo }
     * 
     */
    public TipoInformacionBasicaActo createTipoInformacionBasicaActo() {
        return new TipoInformacionBasicaActo();
    }

    /**
     * Create an instance of {@link TipoInformacionGeneralEmpleadorTiemposPublicos }
     * 
     */
    public TipoInformacionGeneralEmpleadorTiemposPublicos createTipoInformacionGeneralEmpleadorTiemposPublicos() {
        return new TipoInformacionGeneralEmpleadorTiemposPublicos();
    }

    /**
     * Create an instance of {@link TipoInformacionConsultaGeneralReconocimientos }
     * 
     */
    public TipoInformacionConsultaGeneralReconocimientos createTipoInformacionConsultaGeneralReconocimientos() {
        return new TipoInformacionConsultaGeneralReconocimientos();
    }

    /**
     * Create an instance of {@link TipoInformacionCargue }
     * 
     */
    public TipoInformacionCargue createTipoInformacionCargue() {
        return new TipoInformacionCargue();
    }

    /**
     * Create an instance of {@link TipoInformacionGeneralPension }
     * 
     */
    public TipoInformacionGeneralPension createTipoInformacionGeneralPension() {
        return new TipoInformacionGeneralPension();
    }

    /**
     * Create an instance of {@link TipoInformacionConsultaGeneralCausante }
     * 
     */
    public TipoInformacionConsultaGeneralCausante createTipoInformacionConsultaGeneralCausante() {
        return new TipoInformacionConsultaGeneralCausante();
    }

    /**
     * Create an instance of {@link TipoFactoresCalculoSalario }
     * 
     */
    public TipoFactoresCalculoSalario createTipoFactoresCalculoSalario() {
        return new TipoFactoresCalculoSalario();
    }

    /**
     * Create an instance of {@link TipoInformacionSalario }
     * 
     */
    public TipoInformacionSalario createTipoInformacionSalario() {
        return new TipoInformacionSalario();
    }

    /**
     * Create an instance of {@link TipoBeneficiario }
     * 
     */
    public TipoBeneficiario createTipoBeneficiario() {
        return new TipoBeneficiario();
    }

    /**
     * Create an instance of {@link TipoInformacionRegimenTransicion }
     * 
     */
    public TipoInformacionRegimenTransicion createTipoInformacionRegimenTransicion() {
        return new TipoInformacionRegimenTransicion();
    }

    /**
     * Create an instance of {@link TipoNotificacionMediosElectronicos }
     * 
     */
    public TipoNotificacionMediosElectronicos createTipoNotificacionMediosElectronicos() {
        return new TipoNotificacionMediosElectronicos();
    }

    /**
     * Create an instance of {@link TipoInformacionIndiciosVinculacionesLaborales }
     * 
     */
    public TipoInformacionIndiciosVinculacionesLaborales createTipoInformacionIndiciosVinculacionesLaborales() {
        return new TipoInformacionIndiciosVinculacionesLaborales();
    }

    /**
     * Create an instance of {@link TipoInformacionBeneficiarioReconocimiento }
     * 
     */
    public TipoInformacionBeneficiarioReconocimiento createTipoInformacionBeneficiarioReconocimiento() {
        return new TipoInformacionBeneficiarioReconocimiento();
    }

    /**
     * Create an instance of {@link TipoInformacionPeriodosCotizacionFondosPrivados }
     * 
     */
    public TipoInformacionPeriodosCotizacionFondosPrivados createTipoInformacionPeriodosCotizacionFondosPrivados() {
        return new TipoInformacionPeriodosCotizacionFondosPrivados();
    }

    /**
     * Create an instance of {@link TipoPensiones }
     * 
     */
    public TipoPensiones createTipoPensiones() {
        return new TipoPensiones();
    }

    /**
     * Create an instance of {@link TipoInformacionCausanteCargue }
     * 
     */
    public TipoInformacionCausanteCargue createTipoInformacionCausanteCargue() {
        return new TipoInformacionCausanteCargue();
    }

    /**
     * Create an instance of {@link TipoDatosPensiones }
     * 
     */
    public TipoDatosPensiones createTipoDatosPensiones() {
        return new TipoDatosPensiones();
    }

    /**
     * Create an instance of {@link TipoInformacionConsultaGeneralReconocimientoDTO }
     * 
     */
    public TipoInformacionConsultaGeneralReconocimientoDTO createTipoInformacionConsultaGeneralReconocimientoDTO() {
        return new TipoInformacionConsultaGeneralReconocimientoDTO();
    }

    /**
     * Create an instance of {@link TipoInformacionGeneralCargueReconocimiento }
     * 
     */
    public TipoInformacionGeneralCargueReconocimiento createTipoInformacionGeneralCargueReconocimiento() {
        return new TipoInformacionGeneralCargueReconocimiento();
    }

    /**
     * Create an instance of {@link TipoTiempoPublico }
     * 
     */
    public TipoTiempoPublico createTipoTiempoPublico() {
        return new TipoTiempoPublico();
    }

    /**
     * Create an instance of {@link TipoInformacionPeriodoAporte }
     * 
     */
    public TipoInformacionPeriodoAporte createTipoInformacionPeriodoAporte() {
        return new TipoInformacionPeriodoAporte();
    }

    /**
     * Create an instance of {@link TipoInformacionBeneficiario }
     * 
     */
    public TipoInformacionBeneficiario createTipoInformacionBeneficiario() {
        return new TipoInformacionBeneficiario();
    }

    /**
     * Create an instance of {@link TipoInformacionPrestacion }
     * 
     */
    public TipoInformacionPrestacion createTipoInformacionPrestacion() {
        return new TipoInformacionPrestacion();
    }

    /**
     * Create an instance of {@link TipoInformacionCausanteReconocimiento }
     * 
     */
    public TipoInformacionCausanteReconocimiento createTipoInformacionCausanteReconocimiento() {
        return new TipoInformacionCausanteReconocimiento();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionInconsistenciaCotizacionAntes1995 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionInconsistenciaCotizacionAntes1995")
    public JAXBElement<TipoInformacionInconsistenciaCotizacionAntes1995> createTipoInformacionInconsistenciaCotizacionAntes1995(TipoInformacionInconsistenciaCotizacionAntes1995 value) {
        return new JAXBElement<TipoInformacionInconsistenciaCotizacionAntes1995>(_TipoInformacionInconsistenciaCotizacionAntes1995_QNAME, TipoInformacionInconsistenciaCotizacionAntes1995 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionActualizacionPeriodoCotizado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionActualizacionPeriodoCotizado")
    public JAXBElement<TipoInformacionActualizacionPeriodoCotizado> createTipoInformacionActualizacionPeriodoCotizado(TipoInformacionActualizacionPeriodoCotizado value) {
        return new JAXBElement<TipoInformacionActualizacionPeriodoCotizado>(_TipoInformacionActualizacionPeriodoCotizado_QNAME, TipoInformacionActualizacionPeriodoCotizado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionGeneralReconocimiento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "InformacionGeneralReconocimiento")
    public JAXBElement<TipoInformacionGeneralReconocimiento> createInformacionGeneralReconocimiento(TipoInformacionGeneralReconocimiento value) {
        return new JAXBElement<TipoInformacionGeneralReconocimiento>(_InformacionGeneralReconocimiento_QNAME, TipoInformacionGeneralReconocimiento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionCausante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionCausante")
    public JAXBElement<TipoInformacionCausante> createTipoInformacionCausante(TipoInformacionCausante value) {
        return new JAXBElement<TipoInformacionCausante>(_TipoInformacionCausante_QNAME, TipoInformacionCausante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionReconocimiento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionReconocimiento")
    public JAXBElement<TipoInformacionReconocimiento> createTipoInformacionReconocimiento(TipoInformacionReconocimiento value) {
        return new JAXBElement<TipoInformacionReconocimiento>(_TipoInformacionReconocimiento_QNAME, TipoInformacionReconocimiento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionSolicitanteTercero }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionSolicitanteTercero")
    public JAXBElement<TipoInformacionSolicitanteTercero> createTipoInformacionSolicitanteTercero(TipoInformacionSolicitanteTercero value) {
        return new JAXBElement<TipoInformacionSolicitanteTercero>(_TipoInformacionSolicitanteTercero_QNAME, TipoInformacionSolicitanteTercero.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionPeriodosVinculacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionPeriodosVinculacion")
    public JAXBElement<TipoInformacionPeriodosVinculacion> createTipoInformacionPeriodosVinculacion(TipoInformacionPeriodosVinculacion value) {
        return new JAXBElement<TipoInformacionPeriodosVinculacion>(_TipoInformacionPeriodosVinculacion_QNAME, TipoInformacionPeriodosVinculacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionDatosAfiliacionesAsignados }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionDatosAfiliacionesAsignados")
    public JAXBElement<TipoInformacionDatosAfiliacionesAsignados> createTipoInformacionDatosAfiliacionesAsignados(TipoInformacionDatosAfiliacionesAsignados value) {
        return new JAXBElement<TipoInformacionDatosAfiliacionesAsignados>(_TipoInformacionDatosAfiliacionesAsignados_QNAME, TipoInformacionDatosAfiliacionesAsignados.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoTipoPension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoTipoPension")
    public JAXBElement<TipoTipoPension> createTipoTipoPension(TipoTipoPension value) {
        return new JAXBElement<TipoTipoPension>(_TipoTipoPension_QNAME, TipoTipoPension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionConsultaGeneralReconocimiento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionConsultaGeneralReconocimiento")
    public JAXBElement<TipoInformacionConsultaGeneralReconocimiento> createTipoInformacionConsultaGeneralReconocimiento(TipoInformacionConsultaGeneralReconocimiento value) {
        return new JAXBElement<TipoInformacionConsultaGeneralReconocimiento>(_TipoInformacionConsultaGeneralReconocimiento_QNAME, TipoInformacionConsultaGeneralReconocimiento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoFactorCalculoSalario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoFactorCalculoSalario")
    public JAXBElement<TipoFactorCalculoSalario> createTipoFactorCalculoSalario(TipoFactorCalculoSalario value) {
        return new JAXBElement<TipoFactorCalculoSalario>(_TipoFactorCalculoSalario_QNAME, TipoFactorCalculoSalario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionBasicaTramiteReconocimiento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionBasicaTramiteReconocimiento")
    public JAXBElement<TipoInformacionBasicaTramiteReconocimiento> createTipoInformacionBasicaTramiteReconocimiento(TipoInformacionBasicaTramiteReconocimiento value) {
        return new JAXBElement<TipoInformacionBasicaTramiteReconocimiento>(_TipoInformacionBasicaTramiteReconocimiento_QNAME, TipoInformacionBasicaTramiteReconocimiento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionSalario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionSalario")
    public JAXBElement<TipoInformacionSalario> createTipoInformacionSalario(TipoInformacionSalario value) {
        return new JAXBElement<TipoInformacionSalario>(_TipoInformacionSalario_QNAME, TipoInformacionSalario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionIndiciosVinculacionesLaborales }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionIndiciosVinculacionesLaborales")
    public JAXBElement<TipoInformacionIndiciosVinculacionesLaborales> createTipoInformacionIndiciosVinculacionesLaborales(TipoInformacionIndiciosVinculacionesLaborales value) {
        return new JAXBElement<TipoInformacionIndiciosVinculacionesLaborales>(_TipoInformacionIndiciosVinculacionesLaborales_QNAME, TipoInformacionIndiciosVinculacionesLaborales.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoPensiones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoPensiones")
    public JAXBElement<TipoPensiones> createTipoPensiones(TipoPensiones value) {
        return new JAXBElement<TipoPensiones>(_TipoPensiones_QNAME, TipoPensiones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionPrestacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionPrestacion")
    public JAXBElement<TipoInformacionPrestacion> createTipoInformacionPrestacion(TipoInformacionPrestacion value) {
        return new JAXBElement<TipoInformacionPrestacion>(_TipoInformacionPrestacion_QNAME, TipoInformacionPrestacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionBeneficiario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionBeneficiario")
    public JAXBElement<TipoInformacionBeneficiario> createTipoInformacionBeneficiario(TipoInformacionBeneficiario value) {
        return new JAXBElement<TipoInformacionBeneficiario>(_TipoInformacionBeneficiario_QNAME, TipoInformacionBeneficiario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoTiempoPublico }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoTiempoPublico")
    public JAXBElement<TipoTiempoPublico> createTipoTiempoPublico(TipoTiempoPublico value) {
        return new JAXBElement<TipoTiempoPublico>(_TipoTiempoPublico_QNAME, TipoTiempoPublico.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionConsultaGeneralReconocimientoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionConsultaGeneralReconocimientoDTO")
    public JAXBElement<TipoInformacionConsultaGeneralReconocimientoDTO> createTipoInformacionConsultaGeneralReconocimientoDTO(TipoInformacionConsultaGeneralReconocimientoDTO value) {
        return new JAXBElement<TipoInformacionConsultaGeneralReconocimientoDTO>(_TipoInformacionConsultaGeneralReconocimientoDTO_QNAME, TipoInformacionConsultaGeneralReconocimientoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionPrestaciones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionPrestaciones")
    public JAXBElement<TipoInformacionPrestaciones> createTipoInformacionPrestaciones(TipoInformacionPrestaciones value) {
        return new JAXBElement<TipoInformacionPrestaciones>(_TipoInformacionPrestaciones_QNAME, TipoInformacionPrestaciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionGeneralPensionado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionGeneralPensionado")
    public JAXBElement<TipoInformacionGeneralPensionado> createTipoInformacionGeneralPensionado(TipoInformacionGeneralPensionado value) {
        return new JAXBElement<TipoInformacionGeneralPensionado>(_TipoInformacionGeneralPensionado_QNAME, TipoInformacionGeneralPensionado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionSolicitudRetiroBEPS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionSolicitudRetiroBEPS")
    public JAXBElement<TipoInformacionSolicitudRetiroBEPS> createTipoInformacionSolicitudRetiroBEPS(TipoInformacionSolicitudRetiroBEPS value) {
        return new JAXBElement<TipoInformacionSolicitudRetiroBEPS>(_TipoInformacionSolicitudRetiroBEPS_QNAME, TipoInformacionSolicitudRetiroBEPS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionRequerimiento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionRequerimiento")
    public JAXBElement<TipoInformacionRequerimiento> createTipoInformacionRequerimiento(TipoInformacionRequerimiento value) {
        return new JAXBElement<TipoInformacionRequerimiento>(_TipoInformacionRequerimiento_QNAME, TipoInformacionRequerimiento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionCalculoBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionCalculoBase")
    public JAXBElement<TipoInformacionCalculoBase> createTipoInformacionCalculoBase(TipoInformacionCalculoBase value) {
        return new JAXBElement<TipoInformacionCalculoBase>(_TipoInformacionCalculoBase_QNAME, TipoInformacionCalculoBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionSalarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionSalarios")
    public JAXBElement<TipoInformacionSalarios> createTipoInformacionSalarios(TipoInformacionSalarios value) {
        return new JAXBElement<TipoInformacionSalarios>(_TipoInformacionSalarios_QNAME, TipoInformacionSalarios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoCriteriosSimulacionBEPS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoCriteriosSimulacionBEPS")
    public JAXBElement<TipoCriteriosSimulacionBEPS> createTipoCriteriosSimulacionBEPS(TipoCriteriosSimulacionBEPS value) {
        return new JAXBElement<TipoCriteriosSimulacionBEPS>(_TipoCriteriosSimulacionBEPS_QNAME, TipoCriteriosSimulacionBEPS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionGeneralActo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionGeneralActo")
    public JAXBElement<TipoInformacionGeneralActo> createTipoInformacionGeneralActo(TipoInformacionGeneralActo value) {
        return new JAXBElement<TipoInformacionGeneralActo>(_TipoInformacionGeneralActo_QNAME, TipoInformacionGeneralActo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoDetalleCargueTiemposPublicos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoDetalleCargueTiemposPublicos")
    public JAXBElement<TipoDetalleCargueTiemposPublicos> createTipoDetalleCargueTiemposPublicos(TipoDetalleCargueTiemposPublicos value) {
        return new JAXBElement<TipoDetalleCargueTiemposPublicos>(_TipoDetalleCargueTiemposPublicos_QNAME, TipoDetalleCargueTiemposPublicos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoCargueTiemposPublicos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoCargueTiemposPublicos")
    public JAXBElement<TipoCargueTiemposPublicos> createTipoCargueTiemposPublicos(TipoCargueTiemposPublicos value) {
        return new JAXBElement<TipoCargueTiemposPublicos>(_TipoCargueTiemposPublicos_QNAME, TipoCargueTiemposPublicos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionOtrasAfiliaciones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionOtrasAfiliaciones")
    public JAXBElement<TipoInformacionOtrasAfiliaciones> createTipoInformacionOtrasAfiliaciones(TipoInformacionOtrasAfiliaciones value) {
        return new JAXBElement<TipoInformacionOtrasAfiliaciones>(_TipoInformacionOtrasAfiliaciones_QNAME, TipoInformacionOtrasAfiliaciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionPeriodosFaltantes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionPeriodosFaltantes")
    public JAXBElement<TipoInformacionPeriodosFaltantes> createTipoInformacionPeriodosFaltantes(TipoInformacionPeriodosFaltantes value) {
        return new JAXBElement<TipoInformacionPeriodosFaltantes>(_TipoInformacionPeriodosFaltantes_QNAME, TipoInformacionPeriodosFaltantes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionInconsistenciasCotizacionesAntes1995 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionInconsistenciasCotizacionesAntes1995")
    public JAXBElement<TipoInformacionInconsistenciasCotizacionesAntes1995> createTipoInformacionInconsistenciasCotizacionesAntes1995(TipoInformacionInconsistenciasCotizacionesAntes1995 value) {
        return new JAXBElement<TipoInformacionInconsistenciasCotizacionesAntes1995>(_TipoInformacionInconsistenciasCotizacionesAntes1995_QNAME, TipoInformacionInconsistenciasCotizacionesAntes1995 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionTiemposPublicos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionTiemposPublicos")
    public JAXBElement<TipoInformacionTiemposPublicos> createTipoInformacionTiemposPublicos(TipoInformacionTiemposPublicos value) {
        return new JAXBElement<TipoInformacionTiemposPublicos>(_TipoInformacionTiemposPublicos_QNAME, TipoInformacionTiemposPublicos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoRelacionNacionalidad }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoRelacionNacionalidad")
    public JAXBElement<TipoRelacionNacionalidad> createTipoRelacionNacionalidad(TipoRelacionNacionalidad value) {
        return new JAXBElement<TipoRelacionNacionalidad>(_TipoRelacionNacionalidad_QNAME, TipoRelacionNacionalidad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionDatosActualesAfiliado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionDatosActualesAfiliado")
    public JAXBElement<TipoInformacionDatosActualesAfiliado> createTipoInformacionDatosActualesAfiliado(TipoInformacionDatosActualesAfiliado value) {
        return new JAXBElement<TipoInformacionDatosActualesAfiliado>(_TipoInformacionDatosActualesAfiliado_QNAME, TipoInformacionDatosActualesAfiliado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionOtraAfiliacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionOtraAfiliacion")
    public JAXBElement<TipoInformacionOtraAfiliacion> createTipoInformacionOtraAfiliacion(TipoInformacionOtraAfiliacion value) {
        return new JAXBElement<TipoInformacionOtraAfiliacion>(_TipoInformacionOtraAfiliacion_QNAME, TipoInformacionOtraAfiliacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoRespuestaTarea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "RespuestaTarea")
    public JAXBElement<TipoRespuestaTarea> createRespuestaTarea(TipoRespuestaTarea value) {
        return new JAXBElement<TipoRespuestaTarea>(_RespuestaTarea_QNAME, TipoRespuestaTarea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionResolucionPension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionResolucionPension")
    public JAXBElement<TipoInformacionResolucionPension> createTipoInformacionResolucionPension(TipoInformacionResolucionPension value) {
        return new JAXBElement<TipoInformacionResolucionPension>(_TipoInformacionResolucionPension_QNAME, TipoInformacionResolucionPension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionPeriodoVinculacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionPeriodoVinculacion")
    public JAXBElement<TipoInformacionPeriodoVinculacion> createTipoInformacionPeriodoVinculacion(TipoInformacionPeriodoVinculacion value) {
        return new JAXBElement<TipoInformacionPeriodoVinculacion>(_TipoInformacionPeriodoVinculacion_QNAME, TipoInformacionPeriodoVinculacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionGeneralControladorCargue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionGeneralControladorCargue")
    public JAXBElement<TipoInformacionGeneralControladorCargue> createTipoInformacionGeneralControladorCargue(TipoInformacionGeneralControladorCargue value) {
        return new JAXBElement<TipoInformacionGeneralControladorCargue>(_TipoInformacionGeneralControladorCargue_QNAME, TipoInformacionGeneralControladorCargue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoBeneficiariosReconocimiento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoBeneficiariosReconocimiento")
    public JAXBElement<TipoBeneficiariosReconocimiento> createTipoBeneficiariosReconocimiento(TipoBeneficiariosReconocimiento value) {
        return new JAXBElement<TipoBeneficiariosReconocimiento>(_TipoBeneficiariosReconocimiento_QNAME, TipoBeneficiariosReconocimiento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoPeriodoCotizacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoPeriodoCotizacion")
    public JAXBElement<TipoPeriodoCotizacion> createTipoPeriodoCotizacion(TipoPeriodoCotizacion value) {
        return new JAXBElement<TipoPeriodoCotizacion>(_TipoPeriodoCotizacion_QNAME, TipoPeriodoCotizacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionBasicaCargueReconocimiento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionBasicaCargueReconocimiento")
    public JAXBElement<TipoInformacionBasicaCargueReconocimiento> createTipoInformacionBasicaCargueReconocimiento(TipoInformacionBasicaCargueReconocimiento value) {
        return new JAXBElement<TipoInformacionBasicaCargueReconocimiento>(_TipoInformacionBasicaCargueReconocimiento_QNAME, TipoInformacionBasicaCargueReconocimiento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionFormato }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionFormato")
    public JAXBElement<TipoInformacionFormato> createTipoInformacionFormato(TipoInformacionFormato value) {
        return new JAXBElement<TipoInformacionFormato>(_TipoInformacionFormato_QNAME, TipoInformacionFormato.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionPeriodo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionPeriodo")
    public JAXBElement<TipoInformacionPeriodo> createTipoInformacionPeriodo(TipoInformacionPeriodo value) {
        return new JAXBElement<TipoInformacionPeriodo>(_TipoInformacionPeriodo_QNAME, TipoInformacionPeriodo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoMiembroFamiliarPension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoMiembroFamiliarPension")
    public JAXBElement<TipoMiembroFamiliarPension> createTipoMiembroFamiliarPension(TipoMiembroFamiliarPension value) {
        return new JAXBElement<TipoMiembroFamiliarPension>(_TipoMiembroFamiliarPension_QNAME, TipoMiembroFamiliarPension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionGeneralBeneficiarioPension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionGeneralBeneficiarioPension")
    public JAXBElement<TipoInformacionGeneralBeneficiarioPension> createTipoInformacionGeneralBeneficiarioPension(TipoInformacionGeneralBeneficiarioPension value) {
        return new JAXBElement<TipoInformacionGeneralBeneficiarioPension>(_TipoInformacionGeneralBeneficiarioPension_QNAME, TipoInformacionGeneralBeneficiarioPension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionApoderado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionApoderado")
    public JAXBElement<TipoInformacionApoderado> createTipoInformacionApoderado(TipoInformacionApoderado value) {
        return new JAXBElement<TipoInformacionApoderado>(_TipoInformacionApoderado_QNAME, TipoInformacionApoderado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionIndicioVinculacionLaboral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionIndicioVinculacionLaboral")
    public JAXBElement<TipoInformacionIndicioVinculacionLaboral> createTipoInformacionIndicioVinculacionLaboral(TipoInformacionIndicioVinculacionLaboral value) {
        return new JAXBElement<TipoInformacionIndicioVinculacionLaboral>(_TipoInformacionIndicioVinculacionLaboral_QNAME, TipoInformacionIndicioVinculacionLaboral.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoDatosPension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoDatosPension")
    public JAXBElement<TipoDatosPension> createTipoDatosPension(TipoDatosPension value) {
        return new JAXBElement<TipoDatosPension>(_TipoDatosPension_QNAME, TipoDatosPension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionActualizacionPeriodosCotizados }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionActualizacionPeriodosCotizados")
    public JAXBElement<TipoInformacionActualizacionPeriodosCotizados> createTipoInformacionActualizacionPeriodosCotizados(TipoInformacionActualizacionPeriodosCotizados value) {
        return new JAXBElement<TipoInformacionActualizacionPeriodosCotizados>(_TipoInformacionActualizacionPeriodosCotizados_QNAME, TipoInformacionActualizacionPeriodosCotizados.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoBeneficiarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoBeneficiarios")
    public JAXBElement<TipoBeneficiarios> createTipoBeneficiarios(TipoBeneficiarios value) {
        return new JAXBElement<TipoBeneficiarios>(_TipoBeneficiarios_QNAME, TipoBeneficiarios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionBasicaCargueBeneficiario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionBasicaCargueBeneficiario")
    public JAXBElement<TipoInformacionBasicaCargueBeneficiario> createTipoInformacionBasicaCargueBeneficiario(TipoInformacionBasicaCargueBeneficiario value) {
        return new JAXBElement<TipoInformacionBasicaCargueBeneficiario>(_TipoInformacionBasicaCargueBeneficiario_QNAME, TipoInformacionBasicaCargueBeneficiario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionGeneralReconocimiento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionGeneralReconocimiento")
    public JAXBElement<TipoInformacionGeneralReconocimiento> createTipoInformacionGeneralReconocimiento(TipoInformacionGeneralReconocimiento value) {
        return new JAXBElement<TipoInformacionGeneralReconocimiento>(_TipoInformacionGeneralReconocimiento_QNAME, TipoInformacionGeneralReconocimiento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoConsecutivo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoConsecutivo")
    public JAXBElement<TipoConsecutivo> createTipoConsecutivo(TipoConsecutivo value) {
        return new JAXBElement<TipoConsecutivo>(_TipoConsecutivo_QNAME, TipoConsecutivo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionPensionOBP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionPensionOBP")
    public JAXBElement<TipoInformacionPensionOBP> createTipoInformacionPensionOBP(TipoInformacionPensionOBP value) {
        return new JAXBElement<TipoInformacionPensionOBP>(_TipoInformacionPensionOBP_QNAME, TipoInformacionPensionOBP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionGeneralBeneficiarioPensionDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionGeneralBeneficiarioPensionDTO")
    public JAXBElement<TipoInformacionGeneralBeneficiarioPensionDTO> createTipoInformacionGeneralBeneficiarioPensionDTO(TipoInformacionGeneralBeneficiarioPensionDTO value) {
        return new JAXBElement<TipoInformacionGeneralBeneficiarioPensionDTO>(_TipoInformacionGeneralBeneficiarioPensionDTO_QNAME, TipoInformacionGeneralBeneficiarioPensionDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionFuncionarioCertificador }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionFuncionarioCertificador")
    public JAXBElement<TipoInformacionFuncionarioCertificador> createTipoInformacionFuncionarioCertificador(TipoInformacionFuncionarioCertificador value) {
        return new JAXBElement<TipoInformacionFuncionarioCertificador>(_TipoInformacionFuncionarioCertificador_QNAME, TipoInformacionFuncionarioCertificador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionPeriodosAportes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionPeriodosAportes")
    public JAXBElement<TipoInformacionPeriodosAportes> createTipoInformacionPeriodosAportes(TipoInformacionPeriodosAportes value) {
        return new JAXBElement<TipoInformacionPeriodosAportes>(_TipoInformacionPeriodosAportes_QNAME, TipoInformacionPeriodosAportes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionGeneralCargueHistoriaLaboral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionGeneralCargueHistoriaLaboral")
    public JAXBElement<TipoInformacionGeneralCargueHistoriaLaboral> createTipoInformacionGeneralCargueHistoriaLaboral(TipoInformacionGeneralCargueHistoriaLaboral value) {
        return new JAXBElement<TipoInformacionGeneralCargueHistoriaLaboral>(_TipoInformacionGeneralCargueHistoriaLaboral_QNAME, TipoInformacionGeneralCargueHistoriaLaboral.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionCertificacionTiemposPublicos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionCertificacionTiemposPublicos")
    public JAXBElement<TipoInformacionCertificacionTiemposPublicos> createTipoInformacionCertificacionTiemposPublicos(TipoInformacionCertificacionTiemposPublicos value) {
        return new JAXBElement<TipoInformacionCertificacionTiemposPublicos>(_TipoInformacionCertificacionTiemposPublicos_QNAME, TipoInformacionCertificacionTiemposPublicos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoComposicionFamiliar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoComposicionFamiliar")
    public JAXBElement<TipoComposicionFamiliar> createTipoComposicionFamiliar(TipoComposicionFamiliar value) {
        return new JAXBElement<TipoComposicionFamiliar>(_TipoComposicionFamiliar_QNAME, TipoComposicionFamiliar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionGeneralTrabajadorTiemposPublicos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionGeneralTrabajadorTiemposPublicos")
    public JAXBElement<TipoInformacionGeneralTrabajadorTiemposPublicos> createTipoInformacionGeneralTrabajadorTiemposPublicos(TipoInformacionGeneralTrabajadorTiemposPublicos value) {
        return new JAXBElement<TipoInformacionGeneralTrabajadorTiemposPublicos>(_TipoInformacionGeneralTrabajadorTiemposPublicos_QNAME, TipoInformacionGeneralTrabajadorTiemposPublicos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionConsultaGeneralPensionadoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "InformacionPensionado")
    public JAXBElement<TipoInformacionConsultaGeneralPensionadoDTO> createInformacionPensionado(TipoInformacionConsultaGeneralPensionadoDTO value) {
        return new JAXBElement<TipoInformacionConsultaGeneralPensionadoDTO>(_InformacionPensionado_QNAME, TipoInformacionConsultaGeneralPensionadoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionConsultaGeneralPensionado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionConsultaGeneralPensionado")
    public JAXBElement<TipoInformacionConsultaGeneralPensionado> createTipoInformacionConsultaGeneralPensionado(TipoInformacionConsultaGeneralPensionado value) {
        return new JAXBElement<TipoInformacionConsultaGeneralPensionado>(_TipoInformacionConsultaGeneralPensionado_QNAME, TipoInformacionConsultaGeneralPensionado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionConsultaGeneralReconocimientos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionConsultaGeneralReconocimientos")
    public JAXBElement<TipoInformacionConsultaGeneralReconocimientos> createTipoInformacionConsultaGeneralReconocimientos(TipoInformacionConsultaGeneralReconocimientos value) {
        return new JAXBElement<TipoInformacionConsultaGeneralReconocimientos>(_TipoInformacionConsultaGeneralReconocimientos_QNAME, TipoInformacionConsultaGeneralReconocimientos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionGeneralEmpleadorTiemposPublicos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionGeneralEmpleadorTiemposPublicos")
    public JAXBElement<TipoInformacionGeneralEmpleadorTiemposPublicos> createTipoInformacionGeneralEmpleadorTiemposPublicos(TipoInformacionGeneralEmpleadorTiemposPublicos value) {
        return new JAXBElement<TipoInformacionGeneralEmpleadorTiemposPublicos>(_TipoInformacionGeneralEmpleadorTiemposPublicos_QNAME, TipoInformacionGeneralEmpleadorTiemposPublicos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionBasicaActo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionBasicaActo")
    public JAXBElement<TipoInformacionBasicaActo> createTipoInformacionBasicaActo(TipoInformacionBasicaActo value) {
        return new JAXBElement<TipoInformacionBasicaActo>(_TipoInformacionBasicaActo_QNAME, TipoInformacionBasicaActo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoIdentificacionSolicitudRetiroBEPS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoIdentificacionSolicitudRetiroBEPS")
    public JAXBElement<TipoIdentificacionSolicitudRetiroBEPS> createTipoIdentificacionSolicitudRetiroBEPS(TipoIdentificacionSolicitudRetiroBEPS value) {
        return new JAXBElement<TipoIdentificacionSolicitudRetiroBEPS>(_TipoIdentificacionSolicitudRetiroBEPS_QNAME, TipoIdentificacionSolicitudRetiroBEPS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionComplementariaFormato1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionComplementariaFormato1")
    public JAXBElement<TipoInformacionComplementariaFormato1> createTipoInformacionComplementariaFormato1(TipoInformacionComplementariaFormato1 value) {
        return new JAXBElement<TipoInformacionComplementariaFormato1>(_TipoInformacionComplementariaFormato1_QNAME, TipoInformacionComplementariaFormato1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionGeneralCargueBeneficiario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "InformacionGeneralCargueBeneficiario")
    public JAXBElement<TipoInformacionGeneralCargueBeneficiario> createInformacionGeneralCargueBeneficiario(TipoInformacionGeneralCargueBeneficiario value) {
        return new JAXBElement<TipoInformacionGeneralCargueBeneficiario>(_InformacionGeneralCargueBeneficiario_QNAME, TipoInformacionGeneralCargueBeneficiario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionRegimenTransicion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionRegimenTransicion")
    public JAXBElement<TipoInformacionRegimenTransicion> createTipoInformacionRegimenTransicion(TipoInformacionRegimenTransicion value) {
        return new JAXBElement<TipoInformacionRegimenTransicion>(_TipoInformacionRegimenTransicion_QNAME, TipoInformacionRegimenTransicion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoBeneficiario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoBeneficiario")
    public JAXBElement<TipoBeneficiario> createTipoBeneficiario(TipoBeneficiario value) {
        return new JAXBElement<TipoBeneficiario>(_TipoBeneficiario_QNAME, TipoBeneficiario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoFactoresCalculoSalario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoFactoresCalculoSalario")
    public JAXBElement<TipoFactoresCalculoSalario> createTipoFactoresCalculoSalario(TipoFactoresCalculoSalario value) {
        return new JAXBElement<TipoFactoresCalculoSalario>(_TipoFactoresCalculoSalario_QNAME, TipoFactoresCalculoSalario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionConsultaGeneralCausante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionConsultaGeneralCausante")
    public JAXBElement<TipoInformacionConsultaGeneralCausante> createTipoInformacionConsultaGeneralCausante(TipoInformacionConsultaGeneralCausante value) {
        return new JAXBElement<TipoInformacionConsultaGeneralCausante>(_TipoInformacionConsultaGeneralCausante_QNAME, TipoInformacionConsultaGeneralCausante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionGeneralPension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionGeneralPension")
    public JAXBElement<TipoInformacionGeneralPension> createTipoInformacionGeneralPension(TipoInformacionGeneralPension value) {
        return new JAXBElement<TipoInformacionGeneralPension>(_TipoInformacionGeneralPension_QNAME, TipoInformacionGeneralPension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionCargue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionCargue")
    public JAXBElement<TipoInformacionCargue> createTipoInformacionCargue(TipoInformacionCargue value) {
        return new JAXBElement<TipoInformacionCargue>(_TipoInformacionCargue_QNAME, TipoInformacionCargue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionBeneficiarioReconocimiento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionBeneficiarioReconocimiento")
    public JAXBElement<TipoInformacionBeneficiarioReconocimiento> createTipoInformacionBeneficiarioReconocimiento(TipoInformacionBeneficiarioReconocimiento value) {
        return new JAXBElement<TipoInformacionBeneficiarioReconocimiento>(_TipoInformacionBeneficiarioReconocimiento_QNAME, TipoInformacionBeneficiarioReconocimiento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionConsultaGeneralCausanteDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionConsultaGeneralCausanteDTO")
    public JAXBElement<TipoInformacionConsultaGeneralCausanteDTO> createTipoInformacionConsultaGeneralCausanteDTO(TipoInformacionConsultaGeneralCausanteDTO value) {
        return new JAXBElement<TipoInformacionConsultaGeneralCausanteDTO>(_TipoInformacionConsultaGeneralCausanteDTO_QNAME, TipoInformacionConsultaGeneralCausanteDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoNotificacionMediosElectronicos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoNotificacionMediosElectronicos")
    public JAXBElement<TipoNotificacionMediosElectronicos> createTipoNotificacionMediosElectronicos(TipoNotificacionMediosElectronicos value) {
        return new JAXBElement<TipoNotificacionMediosElectronicos>(_TipoNotificacionMediosElectronicos_QNAME, TipoNotificacionMediosElectronicos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionGeneralBeneficiarioPensionDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "InformacionGeneralBeneficiarioPensionDTO")
    public JAXBElement<TipoInformacionGeneralBeneficiarioPensionDTO> createInformacionGeneralBeneficiarioPensionDTO(TipoInformacionGeneralBeneficiarioPensionDTO value) {
        return new JAXBElement<TipoInformacionGeneralBeneficiarioPensionDTO>(_InformacionGeneralBeneficiarioPensionDTO_QNAME, TipoInformacionGeneralBeneficiarioPensionDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoDatosPensiones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoDatosPensiones")
    public JAXBElement<TipoDatosPensiones> createTipoDatosPensiones(TipoDatosPensiones value) {
        return new JAXBElement<TipoDatosPensiones>(_TipoDatosPensiones_QNAME, TipoDatosPensiones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionCausanteCargue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionCausanteCargue")
    public JAXBElement<TipoInformacionCausanteCargue> createTipoInformacionCausanteCargue(TipoInformacionCausanteCargue value) {
        return new JAXBElement<TipoInformacionCausanteCargue>(_TipoInformacionCausanteCargue_QNAME, TipoInformacionCausanteCargue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionPeriodosCotizacionFondosPrivados }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionPeriodosCotizacionFondosPrivados")
    public JAXBElement<TipoInformacionPeriodosCotizacionFondosPrivados> createTipoInformacionPeriodosCotizacionFondosPrivados(TipoInformacionPeriodosCotizacionFondosPrivados value) {
        return new JAXBElement<TipoInformacionPeriodosCotizacionFondosPrivados>(_TipoInformacionPeriodosCotizacionFondosPrivados_QNAME, TipoInformacionPeriodosCotizacionFondosPrivados.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionCausanteReconocimiento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionCausanteReconocimiento")
    public JAXBElement<TipoInformacionCausanteReconocimiento> createTipoInformacionCausanteReconocimiento(TipoInformacionCausanteReconocimiento value) {
        return new JAXBElement<TipoInformacionCausanteReconocimiento>(_TipoInformacionCausanteReconocimiento_QNAME, TipoInformacionCausanteReconocimiento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionPeriodoAporte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionPeriodoAporte")
    public JAXBElement<TipoInformacionPeriodoAporte> createTipoInformacionPeriodoAporte(TipoInformacionPeriodoAporte value) {
        return new JAXBElement<TipoInformacionPeriodoAporte>(_TipoInformacionPeriodoAporte_QNAME, TipoInformacionPeriodoAporte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionGeneralCargueReconocimiento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionGeneralCargueReconocimiento")
    public JAXBElement<TipoInformacionGeneralCargueReconocimiento> createTipoInformacionGeneralCargueReconocimiento(TipoInformacionGeneralCargueReconocimiento value) {
        return new JAXBElement<TipoInformacionGeneralCargueReconocimiento>(_TipoInformacionGeneralCargueReconocimiento_QNAME, TipoInformacionGeneralCargueReconocimiento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionConsultaGeneralBeneficiarioPension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionConsultaGeneralBeneficiarioPension")
    public JAXBElement<TipoInformacionConsultaGeneralBeneficiarioPension> createTipoInformacionConsultaGeneralBeneficiarioPension(TipoInformacionConsultaGeneralBeneficiarioPension value) {
        return new JAXBElement<TipoInformacionConsultaGeneralBeneficiarioPension>(_TipoInformacionConsultaGeneralBeneficiarioPension_QNAME, TipoInformacionConsultaGeneralBeneficiarioPension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionPeriodosCotizacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionPeriodosCotizacion")
    public JAXBElement<TipoInformacionPeriodosCotizacion> createTipoInformacionPeriodosCotizacion(TipoInformacionPeriodosCotizacion value) {
        return new JAXBElement<TipoInformacionPeriodosCotizacion>(_TipoInformacionPeriodosCotizacion_QNAME, TipoInformacionPeriodosCotizacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoResultadoSimulacionBEPS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoResultadoSimulacionBEPS")
    public JAXBElement<TipoResultadoSimulacionBEPS> createTipoResultadoSimulacionBEPS(TipoResultadoSimulacionBEPS value) {
        return new JAXBElement<TipoResultadoSimulacionBEPS>(_TipoResultadoSimulacionBEPS_QNAME, TipoResultadoSimulacionBEPS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionFormatos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionFormatos")
    public JAXBElement<TipoInformacionFormatos> createTipoInformacionFormatos(TipoInformacionFormatos value) {
        return new JAXBElement<TipoInformacionFormatos>(_TipoInformacionFormatos_QNAME, TipoInformacionFormatos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionConsultaGeneralPensionadoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "InformacionConsultaGeneralPensionadoDTO")
    public JAXBElement<TipoInformacionConsultaGeneralPensionadoDTO> createInformacionConsultaGeneralPensionadoDTO(TipoInformacionConsultaGeneralPensionadoDTO value) {
        return new JAXBElement<TipoInformacionConsultaGeneralPensionadoDTO>(_InformacionConsultaGeneralPensionadoDTO_QNAME, TipoInformacionConsultaGeneralPensionadoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionTramiteCargueHistoriaLaboral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionTramiteCargueHistoriaLaboral")
    public JAXBElement<TipoInformacionTramiteCargueHistoriaLaboral> createTipoInformacionTramiteCargueHistoriaLaboral(TipoInformacionTramiteCargueHistoriaLaboral value) {
        return new JAXBElement<TipoInformacionTramiteCargueHistoriaLaboral>(_TipoInformacionTramiteCargueHistoriaLaboral_QNAME, TipoInformacionTramiteCargueHistoriaLaboral.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionDatoErradoPago }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionDatoErradoPago")
    public JAXBElement<TipoInformacionDatoErradoPago> createTipoInformacionDatoErradoPago(TipoInformacionDatoErradoPago value) {
        return new JAXBElement<TipoInformacionDatoErradoPago>(_TipoInformacionDatoErradoPago_QNAME, TipoInformacionDatoErradoPago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionGeneralCargueTiemposPublicos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionGeneralCargueTiemposPublicos")
    public JAXBElement<TipoInformacionGeneralCargueTiemposPublicos> createTipoInformacionGeneralCargueTiemposPublicos(TipoInformacionGeneralCargueTiemposPublicos value) {
        return new JAXBElement<TipoInformacionGeneralCargueTiemposPublicos>(_TipoInformacionGeneralCargueTiemposPublicos_QNAME, TipoInformacionGeneralCargueTiemposPublicos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEstadoEjecucion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "EstadoEjecucion")
    public JAXBElement<TipoEstadoEjecucion> createEstadoEjecucion(TipoEstadoEjecucion value) {
        return new JAXBElement<TipoEstadoEjecucion>(_EstadoEjecucion_QNAME, TipoEstadoEjecucion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoPrestacionReconocimiento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoPrestacionReconocimiento")
    public JAXBElement<TipoPrestacionReconocimiento> createTipoPrestacionReconocimiento(TipoPrestacionReconocimiento value) {
        return new JAXBElement<TipoPrestacionReconocimiento>(_TipoPrestacionReconocimiento_QNAME, TipoPrestacionReconocimiento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionGeneralCargueBeneficiario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionGeneralCargueBeneficiario")
    public JAXBElement<TipoInformacionGeneralCargueBeneficiario> createTipoInformacionGeneralCargueBeneficiario(TipoInformacionGeneralCargueBeneficiario value) {
        return new JAXBElement<TipoInformacionGeneralCargueBeneficiario>(_TipoInformacionGeneralCargueBeneficiario_QNAME, TipoInformacionGeneralCargueBeneficiario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoResultadoSolicitudRetiroBEPSDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoResultadoSolicitudRetiroBEPSDTO")
    public JAXBElement<TipoResultadoSolicitudRetiroBEPSDTO> createTipoResultadoSolicitudRetiroBEPSDTO(TipoResultadoSolicitudRetiroBEPSDTO value) {
        return new JAXBElement<TipoResultadoSolicitudRetiroBEPSDTO>(_TipoResultadoSolicitudRetiroBEPSDTO_QNAME, TipoResultadoSolicitudRetiroBEPSDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoResolucionPrestacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoResolucionPrestacion")
    public JAXBElement<TipoResolucionPrestacion> createTipoResolucionPrestacion(TipoResolucionPrestacion value) {
        return new JAXBElement<TipoResolucionPrestacion>(_TipoResolucionPrestacion_QNAME, TipoResolucionPrestacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionBasicaCargueTiemposPublicos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionBasicaCargueTiemposPublicos")
    public JAXBElement<TipoInformacionBasicaCargueTiemposPublicos> createTipoInformacionBasicaCargueTiemposPublicos(TipoInformacionBasicaCargueTiemposPublicos value) {
        return new JAXBElement<TipoInformacionBasicaCargueTiemposPublicos>(_TipoInformacionBasicaCargueTiemposPublicos_QNAME, TipoInformacionBasicaCargueTiemposPublicos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoIdentificacionPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "IdentificacionPersona")
    public JAXBElement<TipoIdentificacionPersona> createIdentificacionPersona(TipoIdentificacionPersona value) {
        return new JAXBElement<TipoIdentificacionPersona>(_IdentificacionPersona_QNAME, TipoIdentificacionPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionResultadoSimulacionBEPSDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionResultadoSimulacionBEPSDTO")
    public JAXBElement<TipoInformacionResultadoSimulacionBEPSDTO> createTipoInformacionResultadoSimulacionBEPSDTO(TipoInformacionResultadoSimulacionBEPSDTO value) {
        return new JAXBElement<TipoInformacionResultadoSimulacionBEPSDTO>(_TipoInformacionResultadoSimulacionBEPSDTO_QNAME, TipoInformacionResultadoSimulacionBEPSDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionFormato2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionFormato2")
    public JAXBElement<TipoInformacionFormato2> createTipoInformacionFormato2(TipoInformacionFormato2 value) {
        return new JAXBElement<TipoInformacionFormato2>(_TipoInformacionFormato2_QNAME, TipoInformacionFormato2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionFormato1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionFormato1")
    public JAXBElement<TipoInformacionFormato1> createTipoInformacionFormato1(TipoInformacionFormato1 value) {
        return new JAXBElement<TipoInformacionFormato1>(_TipoInformacionFormato1_QNAME, TipoInformacionFormato1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEstadoPension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoEstadoPension")
    public JAXBElement<TipoEstadoPension> createTipoEstadoPension(TipoEstadoPension value) {
        return new JAXBElement<TipoEstadoPension>(_TipoEstadoPension_QNAME, TipoEstadoPension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionFormato3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionFormato3")
    public JAXBElement<TipoInformacionFormato3> createTipoInformacionFormato3(TipoInformacionFormato3 value) {
        return new JAXBElement<TipoInformacionFormato3>(_TipoInformacionFormato3_QNAME, TipoInformacionFormato3 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionDatosAfiliacionAsignados }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionDatosAfiliacionAsignados")
    public JAXBElement<TipoInformacionDatosAfiliacionAsignados> createTipoInformacionDatosAfiliacionAsignados(TipoInformacionDatosAfiliacionAsignados value) {
        return new JAXBElement<TipoInformacionDatosAfiliacionAsignados>(_TipoInformacionDatosAfiliacionAsignados_QNAME, TipoInformacionDatosAfiliacionAsignados.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionBasicaPension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionBasicaPension")
    public JAXBElement<TipoInformacionBasicaPension> createTipoInformacionBasicaPension(TipoInformacionBasicaPension value) {
        return new JAXBElement<TipoInformacionBasicaPension>(_TipoInformacionBasicaPension_QNAME, TipoInformacionBasicaPension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionCalculosFechaBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionCalculosFechaBase")
    public JAXBElement<TipoInformacionCalculosFechaBase> createTipoInformacionCalculosFechaBase(TipoInformacionCalculosFechaBase value) {
        return new JAXBElement<TipoInformacionCalculosFechaBase>(_TipoInformacionCalculosFechaBase_QNAME, TipoInformacionCalculosFechaBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionCotizacionesAdicionales }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionCotizacionesAdicionales")
    public JAXBElement<TipoInformacionCotizacionesAdicionales> createTipoInformacionCotizacionesAdicionales(TipoInformacionCotizacionesAdicionales value) {
        return new JAXBElement<TipoInformacionCotizacionesAdicionales>(_TipoInformacionCotizacionesAdicionales_QNAME, TipoInformacionCotizacionesAdicionales.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoRiesgo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoRiesgo")
    public JAXBElement<TipoRiesgo> createTipoRiesgo(TipoRiesgo value) {
        return new JAXBElement<TipoRiesgo>(_TipoRiesgo_QNAME, TipoRiesgo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionPeriodoCotizacionFondosPrivados }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionPeriodoCotizacionFondosPrivados")
    public JAXBElement<TipoInformacionPeriodoCotizacionFondosPrivados> createTipoInformacionPeriodoCotizacionFondosPrivados(TipoInformacionPeriodoCotizacionFondosPrivados value) {
        return new JAXBElement<TipoInformacionPeriodoCotizacionFondosPrivados>(_TipoInformacionPeriodoCotizacionFondosPrivados_QNAME, TipoInformacionPeriodoCotizacionFondosPrivados.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionInconsistenciasCotizacionesDespues1995 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionInconsistenciasCotizacionesDespues1995")
    public JAXBElement<TipoInformacionInconsistenciasCotizacionesDespues1995> createTipoInformacionInconsistenciasCotizacionesDespues1995(TipoInformacionInconsistenciasCotizacionesDespues1995 value) {
        return new JAXBElement<TipoInformacionInconsistenciasCotizacionesDespues1995>(_TipoInformacionInconsistenciasCotizacionesDespues1995_QNAME, TipoInformacionInconsistenciasCotizacionesDespues1995 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionApoderadoAutorizado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionApoderadoAutorizado")
    public JAXBElement<TipoInformacionApoderadoAutorizado> createTipoInformacionApoderadoAutorizado(TipoInformacionApoderadoAutorizado value) {
        return new JAXBElement<TipoInformacionApoderadoAutorizado>(_TipoInformacionApoderadoAutorizado_QNAME, TipoInformacionApoderadoAutorizado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionAfiliadoCargueHistoriaLaboral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "tipoInformacionAfiliadoCargueHistoriaLaboral")
    public JAXBElement<TipoInformacionAfiliadoCargueHistoriaLaboral> createTipoInformacionAfiliadoCargueHistoriaLaboral(TipoInformacionAfiliadoCargueHistoriaLaboral value) {
        return new JAXBElement<TipoInformacionAfiliadoCargueHistoriaLaboral>(_TipoInformacionAfiliadoCargueHistoriaLaboral_QNAME, TipoInformacionAfiliadoCargueHistoriaLaboral.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "estadoTraslado", scope = TipoInformacionBasicaTramiteReconocimiento.class)
    public JAXBElement<String> createTipoInformacionBasicaTramiteReconocimientoEstadoTraslado(String value) {
        return new JAXBElement<String>(_TipoInformacionBasicaTramiteReconocimientoEstadoTraslado_QNAME, String.class, TipoInformacionBasicaTramiteReconocimiento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "procesamientoAutomatico", scope = TipoInformacionBasicaTramiteReconocimiento.class)
    public JAXBElement<String> createTipoInformacionBasicaTramiteReconocimientoProcesamientoAutomatico(String value) {
        return new JAXBElement<String>(_TipoInformacionBasicaTramiteReconocimientoProcesamientoAutomatico_QNAME, String.class, TipoInformacionBasicaTramiteReconocimiento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/prestacioneseconomicas", name = "codigoEPS", scope = TipoInformacionBasicaTramiteReconocimiento.class)
    public JAXBElement<String> createTipoInformacionBasicaTramiteReconocimientoCodigoEPS(String value) {
        return new JAXBElement<String>(_TipoInformacionBasicaTramiteReconocimientoCodigoEPS_QNAME, String.class, TipoInformacionBasicaTramiteReconocimiento.class, value);
    }

}
