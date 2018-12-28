package co.gov.colpensiones.beps.beneficios.businesslogic.crear;

import java.util.ArrayList;
import java.util.HashMap;

import co.gov.colpensiones.beps.beneficios.businesslogic.BLBeneficios;
import co.gov.colpensiones.beps.beneficios.businesslogic.DABeneficios;
import co.gov.colpensiones.beps.comunes.dto.InformacionVinculadoEstadosDTO;
import co.gov.colpensiones.beps.comunes.enumeraciones.DetalleEstadoVinculadoEnum;
import co.gov.colpensiones.beps.comunes.enumeraciones.TipoConexionBaseDatosEnum;
import co.gov.colpensiones.beps.comunes.jms.JMSUtil;
import co.gov.colpensiones.beps.comunes.utilidades.Constantes;
import co.gov.colpensiones.beps.comunes.utilidades.ConstantesEstados;
import co.gov.colpensiones.beps.comunes.utilidades.ConstantesLoggerServicios;
import co.gov.colpensiones.beps.comunes.utilidades.RegexUtil;
import co.gov.colpensiones.beps.comunes.utilidades.ConstantesMensajeria;
import co.gov.colpensiones.beps.comunes.utilidades.DatabaseManager;
import co.gov.colpensiones.beps.comunes.utilidades.Util;
import co.gov.colpensiones.beps.comunes.utilidades.Validador;
import co.gov.colpensiones.beps.excepciones.DataAccessException;
import co.gov.colpensiones.beps.excepciones.LogicalException;
import co.gov.colpensiones.beps.log.ConstantesLogger;
import co.gov.colpensiones.beps.log.LoggerBeps;
import co.gov.colpensiones.beps.schemas._1_0.comun.TipoDocumento;
import co.gov.colpensiones.beps.schemas._1_0.comun.TipoEstadoEjecucion;
import co.gov.colpensiones.beps.schemas._1_0.comun.TipoInformacionContexto;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoCorreoElectronico;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoDatoTelefono;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoInformacionDatosGeneralesVinculado;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoInformacionDireccionPersonaNatural;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoInformacionUbicacionPersona;
import co.gov.colpensiones.beps.schemas._1_0.prestacioneseconomicas.TipoDestinacionRecursos;
import co.gov.colpensiones.beps.schemas._1_0.prestacioneseconomicas.TipoInformacionTercero;
import co.gov.colpensiones.beps.schemas._1_0.prestacioneseconomicas.TipoInformacionVinculadoSolicitud;
import co.gov.colpensiones.beps.schemas._1_0.prestacioneseconomicas.TipoSolicitudDestinacionRecursos;
import co.gov.colpensiones.beps.vinculacion.businesslogic.actualizar.BLActualizarInformacionNoSensible;

/**
 * <b>Descripcion:</b> Clase que contiene la lógina de negocio para el Caso de uso. <br/>
 * <b>Caso de Uso:</b> GOI-OTO-1-FAB-15-RegistrarSolicitudDestinacionRecursos<br/>
 * 
 * @author Cristian Alexander Salazar Perdomo <csalazar@heinsohn.com.co>
 */
public class BLRegistrarSolicitud extends BLBeneficios {

    /** Clase de accedo a datos. */
    DABeneficios daBeneficios = null;

    /** Atributo que indica que el registro de solicitud es para un tipo Primera Vez. */
    private Boolean esPrimeraVez = Boolean.TRUE;

    /** Atributo que almacena el id del vinculado que realiza la solicitud de destinación. */
    private InformacionVinculadoEstadosDTO infoVinculado;

    /**
     * Constructor de la clase.
     * 
     * @param log
     *            log con el que se va a escribir de la BD.
     */
    public BLRegistrarSolicitud(LoggerBeps log) {
        super(log);
        daBeneficios = new DABeneficios();
    }

    /**
     * Métod que permite realizar el registro de una solicitud de destinación de recursos.
     * 
     * @param informacionContexto
     *            Información de contexto para el servicio.
     * @param solicitud
     *            Información con el registro de solicitud.
     * @return <TipoEstadoEjecucion> Respuesta del servicio.
     */
    public TipoEstadoEjecucion registrarSolicitud(TipoInformacionContexto informacionContexto, TipoSolicitudDestinacionRecursos solicitud) {

        TipoEstadoEjecucion response = null;
        StringBuffer lstErrores = new StringBuffer();
        HashMap<String, Object> payLoadTrace = new HashMap<String, Object>();
        HashMap<String, String> metaData = new HashMap<String, String>();
        HashMap<String, Object> payLoad = new HashMap<String, Object>();

        /* Se agregan campos al log. */

        if (solicitud != null) {
            metaData.put(ConstantesLoggerServicios.METADATA_NUM_RADICADO_SOLICITUD, solicitud.getNumeroRadicacion());
        }
        if (solicitud != null && solicitud.getInformacionVinculado() != null) {
            metaData.put(ConstantesLoggerServicios.METADATA_TIPO_DOCUMENTO, solicitud.getInformacionVinculado().getIdentificacion()
                    .getTipoDocumento());
            metaData.put(ConstantesLoggerServicios.METADATA_NUM_DOCUMENTO, solicitud.getInformacionVinculado().getIdentificacion()
                    .getNumeroDocumento());
        }
        
        if (informacionContexto != null) {
            metaData.put(ConstantesLoggerServicios.METADATA_NUM_RADICADO, informacionContexto.getIdCorrelacion());
        }
        
        payLoad.putAll(metaData);

        try {
            /* Registro en el log */
            payLoadTrace.put(ConstantesLogger.OBJETO_CONTEXTO_ENTRADA, informacionContexto);
            payLoadTrace.put(ConstantesLogger.OBJETO_NEGOCIO_ENTRADA, solicitud);
            log.trace(payLoadTrace, metaData);

            /* validación de datos de entrada para la información de contexto. */
            if (informacionContexto == null) {
                lstErrores.append(Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, Constantes.CAMPO_CONTEXTO));
            } else {
                lstErrores.append(new Validador<TipoInformacionContexto>().ValidarDataContract(informacionContexto));
            }

            /* Validación de datos de entrada para la información de solicitud de registro. */
            if (solicitud == null) {
                lstErrores.append(Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0,
                        Constantes.CAMPO_INFO_SOLICITUD_DESTINACION));
            } else {
                lstErrores.append(new Validador<TipoSolicitudDestinacionRecursos>().ValidarDataContract(solicitud));

                if (solicitud.getInformacionVinculado() != null) {
                    /*
                     * Validación adicional para los campos de información de vinculación debido al flujo 7.3. Se realiza la validación en
                     * este punto para que en caso de existir la información de vinculación se valide de una vez.
                     */
                    lstErrores.append(new Validador<TipoInformacionVinculadoSolicitud>().ValidarDataContract(solicitud
                            .getInformacionVinculado()));
                }
                lstErrores.append(this.validarDatosEntrada(informacionContexto, solicitud));
            }

            /* Validación de generación de errores. */
            if (lstErrores.toString().length() != 0) {
                payLoad.put(ConstantesLoggerServicios.MENSAJE_ERROR, lstErrores.toString());
                log.info(payLoad, metaData);
                response = respuestaNegocioServicio(Constantes.COD_FORMATO_INVALIDO_OBLIGATORIO_NO_RECIBIDO, lstErrores.toString());
            } else {

                /* Validación para F.A. 7.3 */
                if (solicitud.getInformacionVinculado() == null) {
                    payLoad.put(ConstantesLoggerServicios.MENSAJE_ERROR, Constantes.MSJ_ERROR_INFO_VINCULADO_OBLIGATORIA);
                    log.info(payLoad, metaData);
                    response = respuestaNegocioServicio(Constantes.COD_02, Constantes.MSJ_ERROR_INFO_VINCULADO_OBLIGATORIA);
                } else {

                    response = validarRelacionesEntreCampos(solicitud);
                    if (response == null) {
                        response = registrarSolicitudDestinacion(informacionContexto, solicitud);
                        if (response == null) {
                            response = respuestaExitosaServicio();
                        }
                    }
                }
            }
        } catch (DataAccessException e2) {
            generarLogError(metaData, true, e2);
            response = respuestaErrorTecnicoServicio();
        } catch (LogicalException e1) {
            generarLogError(metaData, false, e1);
            response = respuestaErrorTecnicoServicio();
        } catch (Exception e) {
            generarLogError(metaData, false, e);
            response = respuestaErrorTecnicoServicio();
        } finally {
            payLoadTrace.put(ConstantesLogger.OBJETO_NEGOCIO_SALIDA, response);
            log.trace(payLoadTrace, metaData);
        }
        return response;
    }

    /**
     * Método que permite realizar la validación de las relaciones entre campos para un registro de solicitud de destinación de recursos.
     * 
     * @param solicitud
     *            Solicitud de destinación a registrar.
     * @return Boolean, <true> si cumple las validaciones, de lo contrario <false>
     * @throws DataAccessException
     */
    private TipoEstadoEjecucion validarRelacionesEntreCampos(TipoSolicitudDestinacionRecursos solicitud) throws DataAccessException {

        TipoEstadoEjecucion error = null;
        infoVinculado = new InformacionVinculadoEstadosDTO();

        /* F.B Paso 4. */
        infoVinculado = daBeneficios.consultarExistenciaVinculado(solicitud.getInformacionVinculado().getIdentificacion());
        infoVinculado.setNumeroRadicado(solicitud.getNumeroRadicacion());

        if (infoVinculado.getIdentificadorVinculado() == null) {
            /* F.A 7.4 Vinculado No Existe */
            error = respuestaNegocioServicio(Constantes.COD_ERROR_VINCULADO_NO_EXISTE, Constantes.MSJ_ERROR_VINCULADO_NO_EXISTE);
            return error;
        }

        /* F.B Paso 5 */
        if (!solicitud.getTipoSolicitud().equals("01")) {

            /* F.A. 7.5 Registro de Reconsideración */

            /* F.A. 7.5 Paso 1 */
            esPrimeraVez = Boolean.FALSE;
            if (solicitud.getNumeroRadicacionPadre() == null) {
                /* F.A. 7.6 Paso 1 */
                error = respuestaNegocioServicio(Constantes.COD_02, Constantes.MSJ_ERROR_NUM_RADICACION_PADRE);
                return error;
            } else {
                /* F.A. 7.5 Paso 2 */
                String pkSolicitudPadre = daBeneficios.consultarNumeroRadicacionPadre(solicitud.getNumeroRadicacionPadre());

                if (pkSolicitudPadre == null) {
                    /* F.A. 7.7 Paso 1 */
                    error = respuestaNegocioServicio(Constantes.COD_ERROR_NUM_RADICACION_PADRE,
                            Constantes.MSJ_ERROR_NUM_RADICACION_PADRE_NO_EXISTE);
                    return error;
                }
            }
            return error;
        }

        /* F.B Paso 6 */
        if (solicitud.getTrasladoSGPaBEPS() != null) {
            Boolean errorDestinacion = Boolean.FALSE;

            if (solicitud.getDestinacionesRecursos() != null && !solicitud.getDestinacionesRecursos().getDestinacion().isEmpty()) {

                for (TipoDestinacionRecursos destinacion : solicitud.getDestinacionesRecursos().getDestinacion()) {
                    if (destinacion.getCodigoTipo() == null) {
                        errorDestinacion = Boolean.TRUE;
                        break;
                    }
                }
            } else if (solicitud.getTrasladoSGPaBEPS().equals(Constantes.NO)) {
                errorDestinacion = Boolean.TRUE;                
            } 

            if (errorDestinacion) {
                /* F.A. 7.8 Error en Destinación de Recursos */
                error = respuestaNegocioServicio(Constantes.COD_ERROR_DESTINACION_RECURSOS, Constantes.MSJ_ERROR_DESTINACION_RECURSOS);
                return error;
            }
        }

        /* F.B Paso 7 */
        if (solicitud.getTrasladoSGPaBEPS() != null && solicitud.getTrasladoSGPaBEPS().equals(Constantes.SI)) {
            if (solicitud.getInformacionVinculado().getCodigoAFP() == null) {
                /* F.A. 7.9 Código AFP es Obligatorio */
                error = respuestaNegocioServicio(Constantes.COD_02, Constantes.MSJ_ERROR_CODIGO_AFP);
                return error;
            }
        }

        /* F.B Paso 8 */
        if (solicitud.getInformacionTercero() != null && solicitud.getInformacionTercero().getTipoTercero().equals("05")) {
            if (solicitud.getInformacionTercero().getNumeroTarjetaProfesional() == null
                    || solicitud.getInformacionTercero().getNumeroTarjetaProfesional().isEmpty()) {
                /* F.A. 7.10 Apoderado sin Tarjeta Profesional */
                error = respuestaNegocioServicio(Constantes.COD_02, Constantes.MSJ_ERROR_NUMERO_TARJETA_P);
                return error;
            }
        }

        /* F.B. Paso 9 */
        if (solicitud.getDestinacionesRecursos() != null && solicitud.getDestinacionesRecursos().getDestinacion().size() == 1) {

            TipoDestinacionRecursos destinacion = solicitud.getDestinacionesRecursos().getDestinacion().get(0);
            if (destinacion.getPorcentaje() != 100) {
                /* 7.11 Valor Errado en Porcentaje de Distribución */
                error = respuestaNegocioServicio(Constantes.COD_ERROR_PORCENTAJE_DISTRIBUCION,
                        Constantes.MSJ_ERROR_PORCENTAJE_DISTRIBUCION_100);
                return error;
            }
        }

        /* F.B Paso 10. */
        if (solicitud.getDestinacionesRecursos() != null && solicitud.getDestinacionesRecursos().getDestinacion().size() > 1) {

            Integer sumatoriaPorcentajes = 0;

            for (TipoDestinacionRecursos destinacion : solicitud.getDestinacionesRecursos().getDestinacion()) {
                if (destinacion.getCodigoTipo() != null && destinacion.getPorcentaje() != null) {
                    sumatoriaPorcentajes += destinacion.getPorcentaje();
                }
            }

            if (sumatoriaPorcentajes != 100) {
                /* 7.11 Valor Errado en Porcentaje de Distribución */
                error = respuestaNegocioServicio(Constantes.COD_ERROR_PORCENTAJE_DISTRIBUCION,
                        Constantes.MSJ_ERROR_PORCENTAJE_DISTRIBUCION_100);
            }
        }

        /* F.B. Paso 11. */
        if (solicitud.getDestinacionesRecursos() != null && !solicitud.getDestinacionesRecursos().getDestinacion().isEmpty()) {

            Boolean esAnualidadVitalicia = Boolean.FALSE;

            for (TipoDestinacionRecursos destinacion : solicitud.getDestinacionesRecursos().getDestinacion()) {

                if (destinacion.getCodigoTipo().equals("02")) {
                    esAnualidadVitalicia = Boolean.TRUE;
                }
            }
            /*
             * Se verifica que la destinación sea de anulidad, se tenga valor en el campo Traslado SGP y el código de afp corresponda al de
             * colpensiones.
             */

            String codigoAfpColpensiones = daBeneficios.consultarCodigoAFP(Constantes.AFP_COLPENSIONES);

            if (codigoAfpColpensiones != null) {

                String codigoAfp = solicitud.getInformacionVinculado().getCodigoAFP();
                if (esAnualidadVitalicia && (solicitud.getTrasladoSGPaBEPS() != null && !solicitud.getTrasladoSGPaBEPS().isEmpty())
                        && (codigoAfp != null && codigoAfp.equals(codigoAfpColpensiones))) {

                    if (solicitud.getFechaConstanciaEjecutoria() == null) {
                        /* 1. 3 Fecha constancia Ejecutoria obligatoria */
                        error = respuestaNegocioServicio(Constantes.COD_02, Constantes.MSJ_ERROR_FECHA_EJECUTORIA);
                        return error;
                    }
                }
            } else {
                throw new DataAccessException(null, new HashMap<String, String>(), new Exception(
                        "No se encuentra el valor configurado para la AFP : " + Constantes.AFP_COLPENSIONES));
            }

        }
        return error;
    }

    /**
     * Método encargado de realizar las validaciones de datos de entrada para la operación de registrar Solicitud.
     * 
     * @param informacionContexto
     *            , datos del contexto
     * @param informacionVinculado
     *            , datos de un vinculado
     * @return la cadena con las validaciones que no se cumplen, nulo o vacio si todas las validaciones se cumplen
     * @throws DataAccessException
     */
    private String validarDatosEntrada(TipoInformacionContexto informacionContexto, TipoSolicitudDestinacionRecursos solicitud)
            throws DataAccessException {

        StringBuilder errores = new StringBuilder();

        /* Se Valida el codigo de tipo de destinación contra la tabla parametrica. */
        if (solicitud.getTipoSolicitud() != null) {

            String codTipoSolicitud = daBeneficios.consultarDatoParametrica(solicitud.getTipoSolicitud(), "PR_ConsultarTipoSolicitud",
                    "pts_pk_codigo");

            if (codTipoSolicitud == null) {
                errores.append(Constantes.MSJ_ERROR_VALOR_INCORRECTO_DOMINIO.replace(Constantes.PARAMETRO0, "codigoTipoSolicitud"));
            }
        }

        /* Se valida el codigo de tipo de destinación contra la tabla parametrica. */
        if (solicitud.getDestinacionesRecursos() != null) {
            for (TipoDestinacionRecursos destinacion : solicitud.getDestinacionesRecursos().getDestinacion()) {

                if (destinacion.getCodigoTipo() != null) {
                    String codTipoDestinacion = daBeneficios.consultarDatoParametrica(destinacion.getCodigoTipo(),
                            "PR_ConsultarTipoDestinacion", "otd_pk_codigo");

                    if (codTipoDestinacion == null) {
                        errores.append(Constantes.MSJ_ERROR_VALOR_INCORRECTO_DOMINIO
                                .replace(Constantes.PARAMETRO0, "codigoTipoDestinacion"));
                    }
                }
            }
        }

        /* Se Valida el código del tipo documental contra la tabla parametrica. */
        if (solicitud.getDocumentos() != null) {
            for (TipoDocumento documento : solicitud.getDocumentos().getDocumento()) {

                String codTipoDocumental = daBeneficios.consultarDatoParametrica(documento.getCodigoTipoDocumental(),
                        "PR_ConsultarTipoDocumental", "ttc_pk_codigo");

                if (codTipoDocumental == null) {
                    errores.append(Constantes.MSJ_ERROR_VALOR_INCORRECTO_DOMINIO.replace(Constantes.PARAMETRO0, "codigoTipoDocumental"));
                }
            }
        }

        /* Se Valida el código del canal de radicación contra la tabla parametrica. */
        if (solicitud.getCodigoCanalRadicacion() != null) {
            String codTipoDocumental = daBeneficios.consultarDatoParametrica(solicitud.getCodigoCanalRadicacion(),
                    "PR_ConsultarCanalRadicacion", "oco_pk_codigo");

            if (codTipoDocumental == null) {
                errores.append(Constantes.MSJ_ERROR_VALOR_INCORRECTO_DOMINIO.replace(Constantes.PARAMETRO0, "codigoCanalRadicacion"));
            }
        }

        /* Se valida el número de radicación para identificar si existe, esté debe de ser único. */
        if (solicitud.getNumeroRadicacion() != null) {

            String numRadicado = daBeneficios.consultarNumeroRadicacionPadre(solicitud.getNumeroRadicacion());

            if (numRadicado != null) {
                errores.append(Constantes.MSJ_ERROR_NUMERO_RADICADO_DUPLICADO);
            }
        }

        errores.append(validarInformacionVinculado(solicitud));
        errores.append(validarInformacionTercero(solicitud.getInformacionTercero()));

        return errores.toString();
    }

    /**
     * Método que permite realizar la validación de la información del vinculado.
     * 
     * @param solicitud
     *            Solicitud con la información del vinculado
     * @throws DataAccessException
     *             Excepción lanzada por alguna consulta a la BD.
     */
    public String validarInformacionVinculado(TipoSolicitudDestinacionRecursos solicitud) throws DataAccessException {

        StringBuilder errores = new StringBuilder();

        TipoInformacionVinculadoSolicitud informacionVinculado = solicitud.getInformacionVinculado();

        if (informacionVinculado != null) {

            if (informacionVinculado.getCodigoAFP() != null) {

                String codTipoDocumental = daBeneficios.consultarDatoParametrica(informacionVinculado.getCodigoAFP(), "PR_ConsultarAfp",
                        "vaf_pk_codigo");

                if (codTipoDocumental == null) {
                    errores.append(Constantes.MSJ_ERROR_VALOR_INCORRECTO_DOMINIO.replace(Constantes.PARAMETRO0, "codigoAFP"));
                }

            }

            /* Se valida la identificación del vinculado */
            if (informacionVinculado.getIdentificacion() == null) {
                errores.append(Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, "IdentificacionVinculado"));
            } else {
                if (informacionVinculado.getIdentificacion().getTipoDocumento() != null) {
                    // Validacion tipo de documento
                    ArrayList<String> tiposDocumento = Util.getResourcePropertyArray(Constantes._HOMOLOGACION_COMUN_NAME,
                            Constantes.PREFIJO_LLAVES_TIPO_DOCUMENTO);
                    if (!tiposDocumento.contains(informacionVinculado.getIdentificacion().getTipoDocumento())) {
                        errores.append(Constantes.MSJ_ERROR_DATO_NO_VALIDO.replaceAll(Constantes.PARAMETRO0, "TipoDocumentoVinculado")
                                + tiposDocumento.toString() + "\n");
                    }
                }
            }

            /* Estos dos campos son obligatorios si el tipo de solicitud es primera vez. */
            if (solicitud.getTipoSolicitud() != null && solicitud.getTipoSolicitud().equals("01")) {

                if (informacionVinculado.getDepartamentoNacimiento() != null) {
                    if (informacionVinculado.getDepartamentoNacimiento().getCodigo() == null) {
                        errores.append(Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, "Código de Departamento Nacimiento"));
                    }
                } else {
                    errores.append(Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, "Departamento Nacimiento"));
                }

                if (informacionVinculado.getMunicipioNacimiento() != null) {
                    if (informacionVinculado.getMunicipioNacimiento().getCodigo() == null) {
                        errores.append(Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, "Código Municipio Nacimiento"));
                    }
                } else {
                    errores.append(Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, "Municipio Nacimiento"));
                }
            }

            // validaciones para la ubicación
            if (informacionVinculado != null && informacionVinculado.getInformacionUbicacion() != null) {

                TipoInformacionUbicacionPersona ubicaciones = informacionVinculado.getInformacionUbicacion();

                // valida obligatoriedad de la lista de direcciones de residencia
                if (ubicaciones.getDirecciones() != null && !ubicaciones.getDirecciones().getDireccion().isEmpty()) {

                    boolean esPrincipal = false;
                    for (TipoInformacionDireccionPersonaNatural infoDir : ubicaciones.getDirecciones().getDireccion()) {

                        /* validar obligatoriedad de identificador */
                        if (infoDir.getIdentificador() == null) {
                            errores.append(Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, "Identificador"));
                        }

                        /* validar obligatoriedad de dirección */
                        if (infoDir.getDireccion() == null) {
                            errores.append(Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, "Direccion"));
                        }

                        /* validar obligatoriedad de departamento */
                        if (infoDir.getDepartamento() == null || infoDir.getDepartamento().getCodigo() == null) {
                            errores.append(Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, "CodigoDepartamento"));
                        }

                        /* validar obligatoriedad de ciudad */
                        if (infoDir.getMunicipio() == null || infoDir.getMunicipio().getCodigo() == null) {
                            errores.append(Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, "CodigoMunicipio"));
                        }

                        if (infoDir.getEsPrincipal() == null) {
                            errores.append(Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, "EsPrincipal"));
                        }

                        if (Constantes.SI.equals(infoDir.getEsPrincipal())) {
                            esPrincipal = true;
                        }
                    }
                    if (!esPrincipal) {
                        errores.append(Constantes.MSJ_LISTA_DIRECCIONES_SIN_ID_PRINCIPAL.replace(Constantes.PARAMETRO0, "EsPrincipal"));

                    }
                }

                /* valida obligatoriedad de la lista de teléfonos */
                if (ubicaciones.getTelefonos() != null && !ubicaciones.getTelefonos().getTelefono().isEmpty()) {
                    boolean esPrincipal = false;

                    for (TipoDatoTelefono tipoDatoTel : ubicaciones.getTelefonos().getTelefono()) {

                        /* validar obligatoriedad de identificador */
                        if (tipoDatoTel.getIdentificador() == null) {
                            errores.append(Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, "Identificador"));
                        }

                        if (tipoDatoTel.getEsPrincipal() == null) {
                            errores.append(Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, "EsPrincipal"));
                        }

                        if (Constantes.SI.equals(tipoDatoTel.getEsPrincipal())) {
                            esPrincipal = true;
                        }
                    }
                    if (!esPrincipal) {
                        errores.append(Constantes.MSJ_LISTA_TELEFONOS_SIN_ID_PRINCIPAL.replace(Constantes.PARAMETRO0, "EsPrincipal"));
                    }
                }

                // validar obligatoriedad de lista de emails
                if (ubicaciones.getCorreosElectronicos() != null && !ubicaciones.getCorreosElectronicos().getCorreoElectronico().isEmpty()) {
                    boolean esPrincipal = false;
                    for (TipoCorreoElectronico tipoCorreoE : informacionVinculado.getInformacionUbicacion().getCorreosElectronicos()
                            .getCorreoElectronico()) {

                        /* validar correo */
                        if (tipoCorreoE.getDireccion() == null) {
                            errores.append(Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, "DireccionCorreo"));
                        }

                        if (tipoCorreoE.getEsPrincipal() == null) {
                            errores.append(Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, "EsPrincipal"));
                        }

                        if (Constantes.SI.equals(tipoCorreoE.getEsPrincipal())) {
                            esPrincipal = true;
                        }
                    }
                    if (!esPrincipal) {
                        errores.append(Constantes.MSJ_LISTA_EMAIL_SIN_ID_PRINCIPAL.replace(Constantes.PARAMETRO0, "EsPrincipal"));
                    }
                }
            }
        }
        return errores.toString();
    }

    /**
     * Método que permite realizar la validación de la información del tercero.
     * 
     * @param tipoInformacionTercero
     *            Información de tercero a validar.
     * @return String errores de validación
     * @throws DataAccessException
     *             Posible excepción generada.
     */
    public String validarInformacionTercero(TipoInformacionTercero tipoInformacionTercero) throws DataAccessException {

        StringBuilder errores = new StringBuilder();

        if (tipoInformacionTercero != null) {

            /* Se valida la identificación del tercero */
            if (tipoInformacionTercero.getIdentificacion() == null) {
                errores.append(Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, "IdentificacionTercero"));
            } else {
                if (tipoInformacionTercero.getIdentificacion().getTipoDocumento() != null) {
                    // Validacion tipo de documento
                    ArrayList<String> tiposDocumento = Util.getResourcePropertyArray(Constantes._HOMOLOGACION_COMUN_NAME,
                            Constantes.PREFIJO_LLAVES_TIPO_DOCUMENTO);
                    if (!tiposDocumento.contains(tipoInformacionTercero.getIdentificacion().getTipoDocumento())) {
                        errores.append(Constantes.MSJ_ERROR_DATO_NO_VALIDO.replaceAll(Constantes.PARAMETRO0, "TipoDocumentoTercero")
                                + tiposDocumento.toString() + "\n");
                    }
                }
            }

            /* Validacion para los campos de Nombres y apellidos */
            if (tipoInformacionTercero.getNombres().getPrimerApellido() == null) {
                errores.append(Constantes.MSJ_DATO_OBLIGATORIO.replaceAll(Constantes.PARAMETRO0, Constantes.CAMPO_PRIMER_APELLIDO));
            } else {

                if (tipoInformacionTercero.getNombres().getPrimerApellido().length() < 1
                        || tipoInformacionTercero.getNombres().getPrimerApellido().length() > 25) {
                    errores.append(Constantes.MSJ_lONGITUD_DATO.replace(Constantes.PARAMETRO0, Constantes.CAMPO_PRIMER_APELLIDO)
                            .replaceAll(Constantes.PARAMETRO1, "1 a 25"));
                }
                if (!RegexUtil.isValid(Constantes.ER_VALIDAR_PRIMER_NOMBRE_APELLIDO, tipoInformacionTercero.getNombres()
                        .getPrimerApellido())) {
                    errores.append(Constantes.MSJ_ERROR_PRIMER_NOMBRE_APELLIDO.replaceAll(Constantes.PARAMETRO0,
                            Constantes.CAMPO_PRIMER_APELLIDO));
                }

            }

            if (tipoInformacionTercero.getNombres().getSegundoApellido() != null
                    && !tipoInformacionTercero.getNombres().getSegundoApellido().isEmpty()) {

                if (tipoInformacionTercero.getNombres().getSegundoApellido().length() > 25) {
                    errores.append(Constantes.MSJ_lONGITUD_DATO.replace(Constantes.PARAMETRO0, Constantes.CAMPO_SEGUNDO_APELLIDO)
                            .replaceAll(Constantes.PARAMETRO1, "0 a 25"));
                }
                if (!RegexUtil.isValid(Constantes.ER_VALIDAR_SEGUNDO_NOMBRE_APELLIDO, tipoInformacionTercero.getNombres()
                        .getSegundoApellido())) {
                    errores.append(Constantes.MSJ_ERROR_SEGUNDO_NOMBRE_APELLIDO.replaceAll(Constantes.PARAMETRO0,
                            Constantes.CAMPO_SEGUNDO_APELLIDO));
                }
            }

            if (tipoInformacionTercero.getNombres().getPrimerNombre() == null) {
                errores.append(Constantes.MSJ_DATO_OBLIGATORIO.replaceAll(Constantes.PARAMETRO0, Constantes.CAMPO_PRIMER_NOMBRE));
            } else {

                if (tipoInformacionTercero.getNombres().getPrimerNombre().length() < 1
                        || tipoInformacionTercero.getNombres().getPrimerNombre().length() > 25) {
                    errores.append(Constantes.MSJ_lONGITUD_DATO.replace(Constantes.PARAMETRO0, Constantes.CAMPO_PRIMER_NOMBRE).replaceAll(
                            Constantes.PARAMETRO1, "1 a 25"));
                }
                if (!RegexUtil.isValid(Constantes.ER_VALIDAR_PRIMER_NOMBRE_APELLIDO, tipoInformacionTercero.getNombres().getPrimerNombre())) {
                    errores.append(Constantes.MSJ_ERROR_PRIMER_NOMBRE_APELLIDO.replaceAll(Constantes.PARAMETRO0,
                            Constantes.CAMPO_PRIMER_NOMBRE));
                }
            }

            if (tipoInformacionTercero.getNombres().getSegundoNombre() != null
                    && !tipoInformacionTercero.getNombres().getSegundoNombre().isEmpty()) {

                if (tipoInformacionTercero.getNombres().getSegundoNombre().length() > 25) {
                    errores.append(Constantes.MSJ_lONGITUD_DATO.replace(Constantes.PARAMETRO0, Constantes.CAMPO_SEGUNDO_NOMBRE).replaceAll(
                            Constantes.PARAMETRO1, "0 a 25"));
                }
                if (!RegexUtil.isValid(Constantes.ER_VALIDAR_SEGUNDO_NOMBRE_APELLIDO, tipoInformacionTercero.getNombres()
                        .getSegundoNombre())) {
                    errores.append(Constantes.MSJ_ERROR_SEGUNDO_NOMBRE_APELLIDO.replaceAll(Constantes.PARAMETRO0,
                            Constantes.CAMPO_SEGUNDO_NOMBRE));
                }
            }

            if (tipoInformacionTercero.getTipoTercero() != null) {
                String codTipoTercero = daBeneficios.consultarDatoParametrica(tipoInformacionTercero.getTipoTercero(),
                        "PR_ConsultarTipoTercero", "ott_pk_codigo");

                if (codTipoTercero == null) {
                    errores.append(Constantes.MSJ_ERROR_VALOR_INCORRECTO_DOMINIO.replace(Constantes.PARAMETRO0, "codigoTipoTercero"));
                }
            }
        }

        return errores.toString();
    }

    /**
     * Metodo que realiza la Solicitud de Destinacion
     * @param informacionContexto the TipoInformacionContexto
     * @param solicitud the SolicitudDestinacion
     * @param esPrimeraVez the Boolean
     * @param idVinculado the identificador de vinculado
     * @throws Exception the e
     */
    private TipoEstadoEjecucion registrarSolicitudDestinacion(TipoInformacionContexto informacionContexto,
            TipoSolicitudDestinacionRecursos solicitud) throws Exception {

        DatabaseManager database = null;
        TipoEstadoEjecucion resultado = null;
        
        try {
            Long idSolicitud;
            database = new DatabaseManager(TipoConexionBaseDatosEnum.SQL_SERVER);
            this.daBeneficios.inicializarDatabaseManager(database);

            /* Se inicia la transaccion */
            database.beginTransaction();

            BLActualizarInformacionNoSensible blActInfoNoSensible = new BLActualizarInformacionNoSensible(log, database.getConn());
            if (this.esPrimeraVez) {
                //Solo se creara el Registro Historico de Cambio de Estado si el detalle de estado del vinculado se encuentra nulo.
                int generarHistorico = Constantes.CERO;
                /* Se actualiza la información general del vinculado y estado del mismo. */
                generarHistorico = this.daBeneficios.actualizarDatosVinculadoPrimeraVez(informacionContexto, solicitud.getInformacionVinculado(),
                        this.infoVinculado.getIdentificadorVinculado());
                
                if(generarHistorico==Constantes.UNO){
                    /* Se genera histórico para el cambio de estado. */
                    this.daBeneficios.crearHistoricoCambioEstado(informacionContexto, this.infoVinculado, ConstantesEstados.ESTADO_ACTIVO,
                            DetalleEstadoVinculadoEnum.A01.toString());
                }
                /* Se construye un objeto de tipo tipo información general para poder invocar el CU de modificación de datos no sensibles. */
                TipoInformacionDatosGeneralesVinculado infoDatosGenerales = new TipoInformacionDatosGeneralesVinculado();

                infoDatosGenerales.setIdentificacion(solicitud.getInformacionVinculado().getIdentificacion());
                infoDatosGenerales.setInformacionUbicacionResidencia(solicitud.getInformacionVinculado().getInformacionUbicacion());

                try {                  
                    
                    /* Se invoca el CU para almacenar la inforamción de ubicación. */
                    TipoEstadoEjecucion resultadoActualizacion = blActInfoNoSensible.actualizarDatosGeneralesVinculadoUbicacion(informacionContexto, infoDatosGenerales,
                            Boolean.FALSE);

                    /* Se valida el resultado de la invocación del CU. */
                    if (resultadoActualizacion != null && !resultadoActualizacion.getCodigo().equals(Constantes.COD_INVOCACION_EXITOSA)) {
                        resultado = new TipoEstadoEjecucion();
                        resultado.setCodigo(Constantes.COD_ERROR_ACTUALIZACION_DATOS_NO_SENSIBLES);
                        resultado.setDescripcion(Constantes.MSJ_ERROR_ACTUALIZACION_DATOS_NO_SENSIBLES + ". " + resultadoActualizacion.getDescripcion());
                        database.rollBack();
                        return resultado;
                    }
                } catch (Exception e) {
                    resultado = new TipoEstadoEjecucion();
                    resultado.setCodigo(Constantes.COD_ERROR_ACTUALIZACION_DATOS_NO_SENSIBLES);
                    resultado.setDescripcion(Constantes.MSJ_ERROR_ACTUALIZACION_DATOS_NO_SENSIBLES);
                    database.rollBack();
                    return resultado;
                }

                /* Se realiza la creación de la solicitud de destinación. */
                idSolicitud = this.daBeneficios.crearSolicitudDestinacion(solicitud, this.infoVinculado.getIdentificadorVinculado(), this.esPrimeraVez);

                this.daBeneficios.registrarDestinaciones(idSolicitud, solicitud.getDestinacionesRecursos());

                this.daBeneficios.registrarDocumentos(idSolicitud, solicitud.getDocumentos());

                if (solicitud.getInformacionTercero() != null) {
                    this.daBeneficios.registrarInformacionTercero(idSolicitud, solicitud.getInformacionTercero());
                }
            } else {

                this.daBeneficios.actualizarDatosVinculadoReconsideracion(informacionContexto, solicitud.getInformacionVinculado(),
                        this.infoVinculado.getIdentificadorVinculado());

                /* Se genera histórico para el cambio de estado. */
                this.daBeneficios.crearHistoricoCambioEstado(informacionContexto, this.infoVinculado, this.infoVinculado.getEstadoVinculado(),
                        DetalleEstadoVinculadoEnum.A01.toString());

                idSolicitud = this.daBeneficios.crearSolicitudDestinacion(solicitud, this.infoVinculado.getIdentificadorVinculado(), this.esPrimeraVez);

                this.daBeneficios.registrarDocumentos(idSolicitud, solicitud.getDocumentos());

                if (solicitud.getInformacionTercero() != null) {
                    this.daBeneficios.registrarInformacionTercero(idSolicitud, solicitud.getInformacionTercero());
                }
            }

            /* Se realiza commit de la transaccion */
            database.commit();

            /* Se ejecuta el proceso de Validaciones Automaticas */
            ejecutarValidacionesAutomaticas(idSolicitud);

        } catch (DataAccessException e) {
            database.rollBack();
            throw e;
        } catch (Exception e) {
            database.rollBack();
            throw e;
        }
        return resultado;
    }

    /**
     * Método que pone el mensaje en la cola de mensajería, para la ejecución del MDB que realiza el proceso de validaciones automáticas.
     * 
     * <b>Caso de Uso:</b> GOI-OTO-1-FAB-19-ValidacionesAutomaticas<br/>
     * 
     * @param idSolicitud
     *            Identificador de la solicitud registrada
     */
    private void ejecutarValidacionesAutomaticas(Long idSolicitud) throws Exception {
        try {
            /* Se pone el mensaje en la cola de mensajeria */
            JMSUtil.sendMessage(idSolicitud.toString(), ConstantesMensajeria.COLA_MENSAJERIA_VALIDACIONES_AUTOMATICAS);

        } catch (Exception e) {
            HashMap<String, String> metaData = new HashMap<String, String>();
            metaData.put(ConstantesLoggerServicios.METADATA_IDENTIFICADOR_SOLICITUD, idSolicitud.toString());
            metaData.put(ConstantesLoggerServicios.METADATA_COLA_MENSAJERIA, ConstantesMensajeria.COLA_MENSAJERIA_VALIDACIONES_AUTOMATICAS);
            generarLogError(metaData, false, e);
        }
    }

}