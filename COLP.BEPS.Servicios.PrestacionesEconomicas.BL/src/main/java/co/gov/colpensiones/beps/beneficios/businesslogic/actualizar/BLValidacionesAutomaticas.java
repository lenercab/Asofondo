package co.gov.colpensiones.beps.beneficios.businesslogic.actualizar;

import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.xml.ws.soap.MTOMFeature;

import co.gov.colpensiones.beps.beneficios.businesslogic.BLBeneficios;
import co.gov.colpensiones.beps.beneficios.businesslogic.DABeneficios;
import co.gov.colpensiones.beps.comunes.enumeraciones.DetalleEstadoVinculadoEnum;
import co.gov.colpensiones.beps.comunes.enumeraciones.TipoConexionBaseDatosEnum;
import co.gov.colpensiones.beps.comunes.utilidades.Constantes;
import co.gov.colpensiones.beps.comunes.utilidades.ConstantesEstados;
import co.gov.colpensiones.beps.comunes.utilidades.ConstantesLoggerServicios;
import co.gov.colpensiones.beps.comunes.utilidades.DatabaseManager;
import co.gov.colpensiones.beps.comunes.utilidades.Util;
import co.gov.colpensiones.beps.dal.utilidades.DataRow;
import co.gov.colpensiones.beps.dal.utilidades.DataTable;
import co.gov.colpensiones.beps.excepciones.DataAccessException;
import co.gov.colpensiones.beps.log.LoggerBeps;
import co.gov.colpensiones.contracts._1_0.pagoprestacioneseconomicas.ContratoSvcNominaBeneficios;
import co.gov.colpensiones.contracts._1_0.pagoprestacioneseconomicas.SvcNominaBeneficios;
import co.gov.colpensiones.contracts.afiliado.personas.ContratoSvcAfiliado;
import co.gov.colpensiones.contracts.afiliado.personas.SvcAfiliado;
import co.gov.colpensiones.contracts.indicios.prestacioneseconomicas.ContratoSvcIndiciosPrestaciones;
import co.gov.colpensiones.contracts.indicios.prestacioneseconomicas.SvcIndiciosPrestaciones;
import co.gov.colpensiones.schemas._1_0.pagoprestacioneseconomicas.TipoCriterioConsultaPensionado;
import co.gov.colpensiones.schemas._1_0.pagoprestacioneseconomicas.TipoInformacionComplementariaPension;
import co.gov.colpensiones.schemas._1_0.pagoprestacioneseconomicas.TipoInformacionConsultaGeneralPensionadoDTO;
import co.gov.colpensiones.schemas._1_0.pagoprestacioneseconomicas.TipoInformacionGeneralPension;
import co.gov.colpensiones.schemas._1_0.pagoprestacioneseconomicas.TipoPensiones;
import co.gov.colpensiones.schemas._1_0.personas.TipoIdentificacionPersona;
import co.gov.colpensiones.schemas._1_0.comun.errores.TipoEstadoEjecucion;
import co.gov.colpensiones.schemas.afiliado.personas.TipoInformacionBasicaIdentificacionPersona;
import co.gov.colpensiones.schemas.afiliado.personas.TipoInformacionBasicaPersonaNatural;

/**
 * Clase encargada de la ejecución de la lógica de negocio para la realización de validaciones automáticas para las solicitudes de
 * destinación de recursos radicadas en el sistema BEPS.
 * 
 * <b>Caso de Uso:</b> GOI-OTO-1-FAB-19-ValidacionesAutomaticas<br/>
 * 
 * @author Yenny Nustez Arevalo <ynustez@heinsohn.com.co>
 * @author Arnold Rios Delgado <arrios@heinsohn.com.co>
 * 
 */
public class BLValidacionesAutomaticas extends BLBeneficios {

    /** Clase de acceso a datos. */
    DABeneficios daBeneficios = null;

    /** Objeto para la persistencia de datos sobre la BD */
    ValidacionAutomaticaDTO validacionDTO;

    /** Mapa donde se almacenan los datos a validar del vinculado que realizo la solicitud */
    Map<String, String> datosValidacionVinculado;

    /**
     * Constructor de la clase.
     * 
     * @param log
     *            log con el que se va a escribir de la BD.
     */
    public BLValidacionesAutomaticas(LoggerBeps log) {
        super(log);
        daBeneficios = new DABeneficios();
        validacionDTO = new ValidacionAutomaticaDTO();
        datosValidacionVinculado = new TreeMap<String, String>();
    }

    /**
     * Método que ejecuta el proceso de validación de la solicitud.
     * 
     * @param idSolicitud
     *            Identificador de la solicitud a la cual se le van a realizar las validaciones
     */
    public void validarSolicitudDestinacionRecursos(String idSolicitud) {

        /* Manejo de Log */
        HashMap<String, Object> payLoadTrace = new HashMap<String, Object>();
        HashMap<String, Object> payLoad = new HashMap<String, Object>();
        HashMap<String, String> metaData = new HashMap<String, String>();
        metaData.put(ConstantesLoggerServicios.METADATA_IDENTIFICADOR_SOLICITUD, idSolicitud);
        payLoad.putAll(metaData);

        try {
            /* registro en el log */
            log.trace(payLoadTrace, metaData);

            /* Se consulta la informacion a validar */
            datosValidacionVinculado = daBeneficios.consultarVinculadoSolicitud(idSolicitud);

            if (datosValidacionVinculado != null && !datosValidacionVinculado.isEmpty()) {

                /* validacion estado fallecido */
                validarEstadoFallecido();

                /* validacion genero - edad */
                validarEdadPorGenero();

                /* validacion tipo destinacion */
                validarTipoDestinacion(idSolicitud);

                /* insertar registro validacion y actualizar etapa solicitud */
                registrarValidacion(idSolicitud);
            } else {
                log.info("No hay informaci\u00f3n del vinculado para la solicitud " + idSolicitud);
            }

        } catch (DataAccessException e) {
            generarLogError(e.getMetaData(), true, e);
        } catch (Exception e1) {
            generarLogError(metaData, false, e1);
        } finally {
            log.trace(payLoadTrace, metaData);
        }
    }

    /**
     * Método encargado de realizar la validación del estado fallecido del vinculado al cual se encuentra asociada la solicitud
     */
    private void validarEstadoFallecido() {

        /* Se valida el estado del vinculado para verificar si es fallecido. */
        String estado = datosValidacionVinculado.get("estadoVinculado");
        String detalleEstado = datosValidacionVinculado.get("detalleEstadoVinculado");

        HashMap<String, String> metaData = new HashMap<String, String>();
        metaData.put(ConstantesLoggerServicios.METADATA_ESTADO_VINCULADO, estado);
        metaData.put(ConstantesLoggerServicios.METADATA_DETALLE_ESTADO_VINCULADO, detalleEstado);
        metaData.put(ConstantesLoggerServicios.METADATA_FECHA_CORTE, datosValidacionVinculado.get("fechaCorte"));
        HashMap<String, Object> payLoad = new HashMap<String, Object>();

        java.sql.Date fechaCorte = null;
        if (estado != null && detalleEstado != null) {
            if ((estado.equals(ConstantesEstados.ESTADO_RETIRADO) || estado.equals(ConstantesEstados.ESTADO_SUSPENDIDO))
                    && (detalleEstado.equals(DetalleEstadoVinculadoEnum.R01.toString()) || detalleEstado
                            .equals(DetalleEstadoVinculadoEnum.S01.toString()))) {
                validacionDTO.setEstadoFallecido(Constantes.SI);

                if (datosValidacionVinculado.get("fechaCorte") != null) {
                    fechaCorte = Util.obtenerFecha(datosValidacionVinculado.get("fechaCorte"), Constantes.FORMATO_FECHA_AAAA_MM_DD);
                }
                validacionDTO.setFechaCorte(fechaCorte);
            } else {
                validacionDTO.setEstadoFallecido(Constantes.NO);
            }
        }

        payLoad.put("Estado Fallecido - validacion Fallecido", validacionDTO.getEstadoFallecido());
        if (fechaCorte != null)
            payLoad.put("Fecha corte - validacion Fallecido", fechaCorte.toString());
        log.info(payLoad, metaData);
    }

    /**
     * Método encargado de realizar la validación de edad de acuerdo al género, del vinculado al cual se encuentra asociada la solicitud
     * 
     * @throws DataAccessException
     */
    private void validarEdadPorGenero() throws DataAccessException {
        String fechaNacimiento = datosValidacionVinculado.get("fechaNacimiento");
        String genero = datosValidacionVinculado.get("genero");

        if (fechaNacimiento != null && genero != null) {

            String edadMaximaMujeres = daBeneficios.consultarParametroOtorgamiento(Constantes.PARAMETRO_EDAD_PENSION_MUJERES);
            String edadMaximaHombres = daBeneficios.consultarParametroOtorgamiento(Constantes.PARAMETRO_EDAD_PENSION_HOMBRES);

            if (edadMaximaMujeres != null && edadMaximaHombres != null) {

                int edadMujeres = Integer.valueOf(edadMaximaMujeres);
                int edadHombres = Integer.valueOf(edadMaximaHombres);

                /* Se calcula la edad del vinculado */
                int edad = Util.calcularEdad(fechaNacimiento, Constantes.FORMATO_FECHA_AAAA_MM_DD);

                /* si el género del vinculado es Femenino la edad no puede ser menor a la edad parametrizada en BD */
                if (Constantes.GENERO_FEMENINO.equals(genero) && edad >= edadMujeres) {
                    validacionDTO.setEdadGenero(Constantes.VALIDACION_EDAD_CORRECTA);

                } else if (Constantes.GENERO_MASCULINO.equals(genero) && edad >= edadHombres) {
                    /* si el género del vinculado es masculino la edad no puede ser menor a la edad parametrizada en BD */
                    validacionDTO.setEdadGenero(Constantes.VALIDACION_EDAD_CORRECTA);

                } else {
                    /* si no cumple la validación, almacena el valor 1 (No válido) */
                    validacionDTO.setEdadGenero(Constantes.VALIDACION_EDAD_INCORRECTA);
                }
            } else {
                HashMap<String, String> metaData = new HashMap<String, String>();
                metaData.put(ConstantesLoggerServicios.METADATA_PARAMETRO, Constantes.PARAMETRO_EDAD_PENSION_MUJERES);
                metaData.put(ConstantesLoggerServicios.METADATA_PARAMETRO, Constantes.PARAMETRO_EDAD_PENSION_HOMBRES);
                throw new DataAccessException(null, metaData, new Exception(Constantes.MSJ_ERROR_PARAMETROS_INEXISTENTES));
            }
        } else {
            /*
             * Si no existe información en alguno de los campos género o fecha de nacimiento el resultado de la validación será 2
             * (Incompleto)
             */
            validacionDTO.setEdadGenero(Constantes.VALIDACION_EDAD_INCOMPLETA);
        }
        validacionDTO.setFechaValidacionEdadGenero(new java.sql.Date(new Date().getTime()));
    }

    /**
     * Método mediante el cual se verifica el tipo de destinación asociado a la solicitud. Si el tipo de destinación corresponde a
     * "Anualidad Vitalicia" se ejecuta el llamado al método que consume el servicio web para consulta de Nómina Pensionados.
     * 
     * @param idSolicitud
     *            Identificador de la solicitud a la cual se le van a realizar las validaciones
     * @throws DataAccessException
     * @throws Exception
     */
    private void validarTipoDestinacion(String idSolicitud) throws DataAccessException, Exception {

        /* Se consultan los tipos de destinacion asociados a la solicitud */
        DataTable dataDestinacion = daBeneficios.consultarDestinacionSolicitud(idSolicitud);

        if (dataDestinacion.getRows().size() > 0) {
            for (DataRow destinacion : dataDestinacion.getRows()) {
                /*
                 * Si el tipo de destinación es Anualidad Vitalicia consulta si el vinculado presenta una Pensión ó una Indemnización en RPM
                 */
                if (Constantes.CODIGO_DESTINACION_ANUALIDAD_VITALICIA.equals(destinacion.getValue("ode_tipo_destinacion").toString())) {
                    consultarNominaBeneficios();
                    consultarPensionRAIS();
                    consultarIndicioPrestaciones();
                    break;
                }
            }
        }
    }

   /**
    * Método para validar la lógica de RAIS
    * @throws DataAccessException
    */
    private void consultarPensionRAIS() throws DataAccessException, Exception {

        HashMap<String, String> metaData = new HashMap<String, String>();
        metaData.put(ConstantesLoggerServicios.METADATA_TIPO_DOCUMENTO, datosValidacionVinculado.get("tipoDocumento"));
        metaData.put(ConstantesLoggerServicios.METADATA_NUM_DOCUMENTO, datosValidacionVinculado.get("numeroDocumento"));
        HashMap<String, Object> payLoad = new HashMap<String, Object>();

        /* Se obtiene la URL del servicio web de Indicio Prestaciones */
        String endPoint = daBeneficios.consultarParametroOtorgamiento(Constantes.NOMBRE_URL_SERVICIO_AFILIADO);

        if (endPoint != null) {
            /* Se instancia y se crea el cliente del servicio web */
            SvcAfiliado servicio = new SvcAfiliado(new URL(endPoint));
            ContratoSvcAfiliado cliente = servicio.getContratoSvcAfiliadoImplPort(new MTOMFeature());
            co.gov.colpensiones.schemas.afiliado.comun.errores.TipoEstadoEjecucion estadoEjecucion = null;
            co.gov.colpensiones.schemas.afiliado.personas.TipoEstadoAfiliacionFondosPrivadosDTO response = null;
            
            try {
                co.gov.colpensiones.schemas.afiliado.personas.TipoIdentificacionPersona identificacionPersona = new co.gov.colpensiones.schemas.afiliado.personas.TipoIdentificacionPersona();
                identificacionPersona.setTipoIdentificacion(datosValidacionVinculado.get("tipoDocumento"));
                identificacionPersona.setNumIdentificacion(datosValidacionVinculado.get("numeroDocumento"));

                TipoInformacionBasicaPersonaNatural infoBasicaPesona=new TipoInformacionBasicaPersonaNatural();
                String primerNombre=datosValidacionVinculado.get("primerNombre");
                String segundoNombre=datosValidacionVinculado.get("segundoNombre");
                if(primerNombre!=null && primerNombre.length()>20){
                    primerNombre=primerNombre.substring(0, 20);
                }
                if(segundoNombre!=null && segundoNombre.length()>20){
                    segundoNombre=segundoNombre.substring(0, 20);
                }
                infoBasicaPesona.setPrimerNombre(primerNombre);
                infoBasicaPesona.setPrimerApellido(datosValidacionVinculado.get("primerApellido"));
                infoBasicaPesona.setSegundoNombre(segundoNombre);
                infoBasicaPesona.setSegundoApellido(datosValidacionVinculado.get("segundoApellido"));
                
                /* se crea el request del servicio */
                TipoInformacionBasicaIdentificacionPersona informacionBasicaAfiliado=new TipoInformacionBasicaIdentificacionPersona();
                informacionBasicaAfiliado.setIdentificacion(identificacionPersona);
                informacionBasicaAfiliado.setInformacionBasica(infoBasicaPesona);
                
                /* Se llama y se recibe la respuesta del servicio Afiliado de Colpensiones */
                response = cliente.validarExistenciaFondosPrivados(informacionBasicaAfiliado);
                estadoEjecucion = response.getEstadoEjecucion();

                payLoad.put("WebService", endPoint);
                payLoad.put("Codigo", estadoEjecucion.getCodigo());
                payLoad.put("Descripcion", estadoEjecucion.getDescripcion());
                
                log.info(payLoad, metaData);

            } catch (Exception e) {
                throw new Exception("Error consumiendo servicio SvcAfiliado. " + e.getMessage());
            }

            if (Constantes.COD_ERROR_INTERNO.equals(estadoEjecucion.getCodigo())) {
                throw new Exception("Error retornado por servicio SvcAfiliado. " + estadoEjecucion.getDescripcion());
            } else if (response.getDetalle() != null) {
                String codigoNovedad = response.getDetalle().getCodigoNovedadRespuesta();
                payLoad.put("novedadRespuesta", codigoNovedad);
                log.info(payLoad, metaData);
                if(codigoNovedad!=null) {
                    /* consulta los estados pensional parametrizados en Sistema de Gestión BEPS */
                    Map<String, String> mapaEstadosPensionalParametrizados = daBeneficios.consultarEstadosPensionalParametrizados();
                    if (mapaEstadosPensionalParametrizados.containsKey(codigoNovedad)) {
                        validacionDTO.setPensionRAIS(mapaEstadosPensionalParametrizados.get(codigoNovedad));
                    }else{
                        payLoad.put("validacionNovedadRespuesta", "El c\u00F3digo novedad recibido del servicio SvcAfiliado no coincide con la param\u00E9trica del sistema gesti\u00F3n Beps");
                        log.info(payLoad, metaData);
                    }
                }         
               
                validacionDTO.setFechaPensionRAIS(new java.sql.Date(new Date().getTime()));
            } else {
                throw new Exception("El retorno del servicio SvcAfiliado no fue fallido pero el detalle de la respuesta fue vac\u00EDo .");
            }

        } else {
            metaData = new HashMap<String, String>();
            metaData.put(ConstantesLoggerServicios.METADATA_PARAMETRO, Constantes.NOMBRE_URL_SERVICIO_AFILIADO);
            throw new DataAccessException(null, metaData, new Exception(Constantes.MSJ_ERROR_PARAMETROS_INEXISTENTES));
        }

    
        
    }

    /**
     * Método mediante el cual se consume el servicio web indicio de pretaciones
     * @throws DataAccessException
     * @throws Exception
     */
    private void consultarIndicioPrestaciones() throws DataAccessException, Exception {
        HashMap<String, String> metaData = new HashMap<String, String>();
        metaData.put(ConstantesLoggerServicios.METADATA_TIPO_DOCUMENTO, datosValidacionVinculado.get("tipoDocumento"));
        metaData.put(ConstantesLoggerServicios.METADATA_NUM_DOCUMENTO, datosValidacionVinculado.get("numeroDocumento"));
        HashMap<String, Object> payLoad = new HashMap<String, Object>();

        /* Se obtiene la URL del servicio web de Indicio Prestaciones */
        String endPoint = daBeneficios.consultarParametroOtorgamiento(Constantes.NOMBRE_URL_SERVICIO_INDICIO_PRESTACION);

        if (endPoint != null) {
            /* Se instancia y se crea el cliente del servicio web */
            SvcIndiciosPrestaciones servicio = new SvcIndiciosPrestaciones(new URL(endPoint));
            ContratoSvcIndiciosPrestaciones cliente = servicio.getContratoSvcIndiciosPrestacionesImplPort(new MTOMFeature());
            
            co.gov.colpensiones.schemas.indicios.comun.errores.TipoEstadoEjecucion estadoEjecucion = null;
            co.gov.colpensiones.schemas.indicios.prestacioneseconomicas.TipoInformacionConsultaGeneralCausanteDTO response = null;
            try {
                /* se crea el request del servicio */
                co.gov.colpensiones.schemas.indicios.personas.TipoIdentificacionPersona identificacionPersona = new co.gov.colpensiones.schemas.indicios.personas.TipoIdentificacionPersona();
                identificacionPersona.setTipoIdentificacion(datosValidacionVinculado.get("tipoDocumento"));
                identificacionPersona.setNumIdentificacion(datosValidacionVinculado.get("numeroDocumento"));

                /* Se llama y se recibe la respuesta del servicio base de datos de la nómina de pensionados de Colpensiones */
                response = cliente.consultarIndiciosPensionales(identificacionPersona);
                estadoEjecucion = response.getEstadoEjecucion();

                payLoad.put("WebService", endPoint);
                payLoad.put("Codigo", estadoEjecucion.getCodigo());
                payLoad.put("Descripcion", estadoEjecucion.getDescripcion());
                log.info(payLoad, metaData);

            } catch (Exception e) {
                throw new Exception("Error consumiendo servicio SvcIndiciosPrestaciones. " + e.getMessage());
            }

            if (Constantes.COD_INVOCACION_EXITOSA_INDICIO_PRESTACION.equals(estadoEjecucion.getCodigo())) {
                List<co.gov.colpensiones.schemas.indicios.prestacioneseconomicas.TipoInformacionPrestacion> prestaciones = response.getDetalle().getInformacionPrestaciones().getPrestacion();
                boolean esPensionado = Boolean.TRUE;
                if (prestaciones.size() > 0) {
                    for (co.gov.colpensiones.schemas.indicios.prestacioneseconomicas.TipoInformacionPrestacion tipoInformacionPrestacion : prestaciones) {
                        String codigoTipoPrestacion = tipoInformacionPrestacion.getTipoPrestacion().getCodigo();

                        if ("".equals(codigoTipoPrestacion) || Constantes.COD_TIPO_PRESTACION_DEVOLUCION_SALDOS.equals(codigoTipoPrestacion)
                                || Constantes.COD_TIPO_PRESTACION_INDEMNIZACION_SUSTITUTIVA.equals(codigoTipoPrestacion) || Constantes.COD_TIPO_PRESTACION_INDEMNIZACION_VEJEZ.equals(codigoTipoPrestacion)
                                || Constantes.COD_TIPO_PRESTACION_INDEMNIZACION_INVALIDEZ.equals(codigoTipoPrestacion)) {
                            esPensionado = Boolean.FALSE;
                        }
                    }

                } else {
                    esPensionado = Boolean.FALSE;
                }
                if (esPensionado) {
                    validacionDTO.setPrestacionOBP("Pensionado");
                }
                validacionDTO.setFechaPrestacionOBP(new java.sql.Date(new Date().getTime()));

            } else if (Constantes.COD_INVOCACION_NO_EXISTE_INFORMACION_INDICIO_PRESTACION.equals(estadoEjecucion.getCodigo())) {
                validacionDTO.setFechaPrestacionOBP(new java.sql.Date(new Date().getTime()));
            } else {
                throw new Exception("Error retornado por servicio SvcIndiciosPrestaciones. " + estadoEjecucion.getDescripcion());
            }

        } else {
            metaData = new HashMap<String, String>();
            metaData.put(ConstantesLoggerServicios.METADATA_PARAMETRO, Constantes.NOMBRE_URL_SERVICIO_INDICIO_PRESTACION);
            throw new DataAccessException(null, metaData, new Exception(Constantes.MSJ_ERROR_PARAMETROS_INEXISTENTES));
        }

    }

    /**
     * Método mediante el cual se consume el servicio web que consulta la base de datos de la nómina de pensionados de Colpensiones.
     * 
     * @throws DataAccessException
     * @throws Exception
     */
    private void consultarNominaBeneficios() throws DataAccessException, Exception {

        HashMap<String, String> metaData = new HashMap<String, String>();
        metaData.put(ConstantesLoggerServicios.METADATA_TIPO_DOCUMENTO, datosValidacionVinculado.get("tipoDocumento"));
        metaData.put(ConstantesLoggerServicios.METADATA_NUM_DOCUMENTO, datosValidacionVinculado.get("numeroDocumento"));
        HashMap<String, Object> payLoad = new HashMap<String, Object>();

        /* Se obtiene la URL del servicio web de Nomina Beneficios */
        String endPoint = daBeneficios.consultarParametroOtorgamiento("url_servicio_nomina_beneficios");

        if (endPoint != null) {
            /* Se instancia y se crea el cliente del servicio web */
            SvcNominaBeneficios servicio = new SvcNominaBeneficios(new URL(endPoint));
            ContratoSvcNominaBeneficios cliente = servicio.getContratoSvcNominaBeneficiosImplPort(new MTOMFeature());

            /* Se llama y se recibe la respuesta del servicio base de datos de la nómina de pensionados de Colpensiones */
            TipoCriterioConsultaPensionado parametrosWS = new TipoCriterioConsultaPensionado();
            TipoIdentificacionPersona idPensionado = new TipoIdentificacionPersona();
            idPensionado.setTipoIdentificacion(datosValidacionVinculado.get("tipoDocumento"));
            idPensionado.setNumIdentificacion(datosValidacionVinculado.get("numeroDocumento"));
            parametrosWS.setDetalle(idPensionado);

            co.gov.colpensiones.schemas._1_0.comun.TipoControlCambios contexto = new co.gov.colpensiones.schemas._1_0.comun.TipoControlCambios();
            contexto.setFuente(Constantes.FUENTE_CONSUMO_WS_NOMINA_BENEFICIOS);
            contexto.setUsuario(Constantes.USUARIO_CONSUMO_WS_NOMINA_BENEFICIOS);
            parametrosWS.setContexto(contexto);

            TipoEstadoEjecucion estadoEjecucion = null;
            TipoInformacionConsultaGeneralPensionadoDTO response = null;
            try {
                response = cliente.consultarInformacionGeneralPensionado(parametrosWS);
                estadoEjecucion = response.getEstadoEjecucion();
                payLoad.put("WebService", endPoint);
                payLoad.put("Codigo", estadoEjecucion.getCodigo());
                payLoad.put("Descripcion", estadoEjecucion.getDescripcion());
                log.info(payLoad, metaData);
            } catch (Exception e) {
                throw new Exception("Error consumiendo servicio SvcNominaBeneficios. " + e.getMessage());
            }

            if (Constantes.COD_INVOCACION_EXITOSA.equals(estadoEjecucion.getCodigo())) {
                TipoPensiones pensiones = response.getDetalle().getPensiones();
                TipoInformacionComplementariaPension infoPension = null;
                
                for (TipoInformacionGeneralPension pension : pensiones.getPension()) {
                    infoPension = pension.getInformacionComplementaria();
                    validacionDTO.setPensionRPM(infoPension.getRiesgo());
                    validacionDTO.setFechaValidacionPension(new java.sql.Date(new Date().getTime()));
                    validacionDTO.setIndemnizadoRPM(infoPension.getEsPagoUnico());
                    validacionDTO.setFechaValidacionIndeminazado(new java.sql.Date(new Date().getTime()));
                }
            } else if (Constantes.COD_ERROR_WS_NB_DATOS_INCOMPLETOS.equals(estadoEjecucion.getCodigo())) {
                /* Pensionado o Beneficiario Inexistente */
                validacionDTO.setPensionRPM(Constantes.VALIDACION_PENSION_RPM_SIN_PENSION);
                validacionDTO.setFechaValidacionPension(new java.sql.Date(new Date().getTime()));
                validacionDTO.setIndemnizadoRPM(Constantes.NO);
                validacionDTO.setFechaValidacionIndeminazado(new java.sql.Date(new Date().getTime()));

            } else if (Constantes.COD_ERROR_WS_NB_REGISTRO_INCONSISTENTE.equals(estadoEjecucion.getCodigo())) {
                /* Ciudadano con registro inconsistente en Nómina. */
                validacionDTO.setPensionRPM(Constantes.VALIDACION_PENSION_RPM_INCONSISTENTE);
                validacionDTO.setFechaValidacionPension(new java.sql.Date(new Date().getTime()));
                validacionDTO.setIndemnizadoRPM(Constantes.NO);
                validacionDTO.setFechaValidacionIndeminazado(new java.sql.Date(new Date().getTime()));

            } else if (Constantes.COD_ERROR_INTERNO.equals(estadoEjecucion.getCodigo())) {
                throw new Exception("Error retornado por servicio SvcNominaBeneficios. " + estadoEjecucion.getDescripcion());
            }
        } else {
            metaData = new HashMap<String, String>();
            metaData.put(ConstantesLoggerServicios.METADATA_PARAMETRO, "url_servicio_nomina_beneficios");
            throw new DataAccessException(null, metaData, new Exception(Constantes.MSJ_ERROR_PARAMETROS_INEXISTENTES));
        }
    }

    /**
     * Método mediante el cual se ingresa a la base de datos el registro correspondiente al resultado de las validaciones realizadas a la
     * solicitud. Adcionalmente se actualiza la etapa de la solicitud, para dejar la marca del proceso de validación.
     * 
     * @param idSolicitud
     *            Identificador de la solicitud a la cual se le van a realizar las validaciones
     * @throws Exception
     */
    private void registrarValidacion(String idSolicitud) throws Exception {

        DatabaseManager database = new DatabaseManager(TipoConexionBaseDatosEnum.SQL_SERVER);

        try {

            daBeneficios.inicializarDatabaseManager(database);

            /* se da inicio a la transaccion */
            database.beginTransaction();

            /* se inserta el registro de validacion */
            daBeneficios.crearRegistroValidacionSolicitud(validacionDTO, idSolicitud);

            /* se actualiza la etapa de la solicitud */
            daBeneficios.actualizarEtapaSolicitud(Constantes.ETAPA_SOLICITUD_VALIDACIONES, idSolicitud);

            /* se hace commit de la transaccion */
            database.commit();

        } catch (DataAccessException e) {
            generarLogError(e.getMetaData(), true, e);
            /* Se realiza Rollback de la transaccion */
            ejecutarRollbackTransaccion(database);
        } catch (Exception e1) {
            String mensajeError = e1.getMessage();
            /* Se realiza Rollback de la transaccion */
            mensajeError += ejecutarRollbackTransaccion(database);
            throw new Exception(mensajeError, e1);
        }
    }

    /**
     * Método para ejecutar manualmente el rollback de una transaccion
     * 
     * @param database
     * @return
     */
    private String ejecutarRollbackTransaccion(DatabaseManager database) {
        try {
            /* Se realiza rollback */
            database.rollBack();
        } catch (Exception e2) {
            return "Error al ejecutar la operación de Rollback : " + e2.getMessage();
        }
        return "";
    }

}
