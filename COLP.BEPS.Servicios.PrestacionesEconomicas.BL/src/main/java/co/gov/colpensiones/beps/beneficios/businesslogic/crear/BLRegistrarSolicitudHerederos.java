package co.gov.colpensiones.beps.beneficios.businesslogic.crear;

import java.util.HashMap;

import co.gov.colpensiones.beps.beneficios.businesslogic.BLBeneficios;
import co.gov.colpensiones.beps.beneficios.businesslogic.DABeneficios;
import co.gov.colpensiones.beps.comunes.dto.InformacionVinculadoEstadosDTO;
import co.gov.colpensiones.beps.comunes.enumeraciones.TipoConexionBaseDatosEnum;
import co.gov.colpensiones.beps.comunes.utilidades.Constantes;
import co.gov.colpensiones.beps.comunes.utilidades.ConstantesLoggerServicios;
import co.gov.colpensiones.beps.comunes.utilidades.DatabaseManager;
import co.gov.colpensiones.beps.comunes.utilidades.RegexUtil;
import co.gov.colpensiones.beps.comunes.utilidades.Validador;
import co.gov.colpensiones.beps.excepciones.DataAccessException;
import co.gov.colpensiones.beps.excepciones.LogicalException;
import co.gov.colpensiones.beps.log.ConstantesLogger;
import co.gov.colpensiones.beps.log.LoggerBeps;
import co.gov.colpensiones.beps.schemas._1_0.comun.TipoDocumento;
import co.gov.colpensiones.beps.schemas._1_0.comun.TipoEstadoEjecucion;
import co.gov.colpensiones.beps.schemas._1_0.comun.TipoInformacionContexto;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoDocumentoPersonaNatural;
import co.gov.colpensiones.beps.schemas._1_0.prestacioneseconomicas.TipoDestinacionRecursos;
import co.gov.colpensiones.beps.schemas._1_0.prestacioneseconomicas.TipoDestinacionesRecursos;
import co.gov.colpensiones.beps.schemas._1_0.prestacioneseconomicas.TipoDocumentoTercero;
import co.gov.colpensiones.beps.schemas._1_0.prestacioneseconomicas.TipoInformacionHeredero;
import co.gov.colpensiones.beps.schemas._1_0.prestacioneseconomicas.TipoSolicitudDevolucionAhorrosHerederos;

/**
 * <b>Descripcion:</b> Clase que contiene la lógica para el registro de solicitudes de devolución de ahorros a herederos. <br/>
 * <b>Caso de Uso:</b> PT-INGE-014-GOI-OTO-4-FAB-02-RegistrarSolicitudDevoluciónAhorrosHerederos.<br/>
 * 
 * @author Ana Jimena Arévalo Bernal <aarevalo@heinsohn.com.co>
 */
public class BLRegistrarSolicitudHerederos extends BLBeneficios {

    /** Clase de acceso a datos. */
    DABeneficios daBeneficios = null;

    /**
     * Constructor de la clase.
     * 
     * @param log
     *            log con el que se va a escribir en la BD.
     */
    public BLRegistrarSolicitudHerederos(LoggerBeps log) {
        super(log);
        daBeneficios = new DABeneficios();
    }

    /**
     * Método que permite realizar el registro de una solicitud de devolución de ahorros a herederos.
     * 
     * <b>Caso de Uso:</b> PT-INGE-014-GOI-OTO-4-FAB-02-RegistrarSolicitudDevoluciónAhorrosHerederos.
     * 
     * @param informacionContexto
     *            información de contexto para el servicio.
     * @param solicitud
     *            información de la solicitud de devolución de ahorros a herederos.
     * @return <TipoEstadoEjecucion> respuesta del servicio.
     */
    public TipoEstadoEjecucion registrarSolicitud(TipoInformacionContexto informacionContexto, TipoSolicitudDevolucionAhorrosHerederos solicitud) {

        TipoEstadoEjecucion response = null;
        StringBuffer lstErrores = new StringBuffer();
        StringBuffer lstErroresObligatoriedad = new StringBuffer();
        HashMap<String, Object> payLoadTrace = new HashMap<String, Object>();
        HashMap<String, String> metaData = new HashMap<String, String>();
        HashMap<String, Object> payLoad = new HashMap<String, Object>();

        /* Se agregan campos al log. */
        if (   solicitud != null) {
            metaData.put(ConstantesLoggerServicios.METADATA_NUM_RADICACION_HEREDEROS, solicitud.getNumeroRadicacion());
        }
        if (   solicitud != null 
            && solicitud.getInformacionVinculado() != null 
            && solicitud.getInformacionVinculado().getIdentificacion() != null) {
            metaData.put(ConstantesLoggerServicios.METADATA_TIPO_DOCUMENTO_HEREDEROS, solicitud.getInformacionVinculado().getIdentificacion()
                    .getTipoDocumento());
            metaData.put(ConstantesLoggerServicios.METADATA_NUM_DOCUMENTO_HEREDEROS, solicitud.getInformacionVinculado().getIdentificacion()
                    .getNumeroDocumento());
        }
        if (informacionContexto != null) {
            metaData.put(ConstantesLoggerServicios.METADATA_ID_CORRELACION_HEREDEROS, informacionContexto.getIdCorrelacion());
            metaData.put(ConstantesLoggerServicios.USUARIO_SISTEMA_EXTERNO_HEREDEROS, informacionContexto.getUsuarioSistemaExterno());
        }
        
        try {
            /* Registro en el log */
            payLoadTrace.put(ConstantesLogger.OBJETO_CONTEXTO_ENTRADA, informacionContexto);
            payLoadTrace.put(ConstantesLogger.OBJETO_NEGOCIO_ENTRADA, solicitud);
            log.trace(payLoadTrace, metaData);

            /* Validación de datos de entrada para la información de contexto. */
            if (informacionContexto == null) {
                lstErrores.append(Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, Constantes.CAMPO_CONTEXTO));
            } else {
                lstErrores.append(new Validador<TipoInformacionContexto>().ValidarDataContract(informacionContexto));
            }

            /* Validación de datos de entrada para la información de solicitud de registro. */
            if (solicitud == null) {
                lstErrores.append(Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0,
                        Constantes.CAMPO_INFO_SOLICITUD_DEVOLUCION_AHORROS_HEREDEROS));
            } else {
                /* FB 1: 1. Recibe los datos de entrada definidos en la Tabla 1 "Datos de Entrada Registrar 
                 * Solicitud de Devolución de Ahorros a Herederos" y valida la obligatoriedad de cada uno de 
                 * ellos, si no se cumple esta regla para los campos definidos continúa
                 */ 
                
                /* Se realizan validaciones de obligatoriedad y formato estipuladas en los data contracts */
                lstErrores.append(new Validador<TipoSolicitudDevolucionAhorrosHerederos>().ValidarDataContract(solicitud));
                /* Se validan datos en blanco como obligatorios */ 
                lstErrores.append(validarDatosEnBlanco(solicitud));
                /* Se realizan validaciones de obligatoriedad adicionales */ 
                lstErrores.append(validarObligatoriedadDocumentos(solicitud));
                lstErrores.append(validarObligatoriedadParentescoHeredero(solicitud));
                lstErrores.append(validarObligatoriedadDireccionResidenciaHeredero(solicitud));
                lstErrores.append(validarObligatoriedadDepartamentoResidenciaHeredero(solicitud));
                lstErrores.append(validarObligatoriedadMunicipioResidenciaHeredero(solicitud));
                lstErrores.append(validarObligatoriedadTelefonoHeredero(solicitud));
                
            }

            /* Se construye el mensaje de error que contiene únicamente los errores de obligatoriedad */
            lstErroresObligatoriedad = construirMensajeErroresObligatoriedad(lstErrores);
            
            if (lstErroresObligatoriedad.toString().length() != 0) {
                /* FA: Campos Obligatorios No Recibidos. */
                payLoad.put(ConstantesLoggerServicios.MENSAJE_ERROR, lstErroresObligatoriedad.toString());
                log.info(payLoad, metaData);
                response = respuestaNegocioServicio(Constantes.COD_CAMPOS_OBLIGATORIOS_NO_RECIBIDOS, lstErroresObligatoriedad.toString());
            } else {
                /* FB 2: Valida si los valores recibidos cumplen con la definición de los datos de 
                 * entrada como son: Tipo, Máscara, Longitud y Restricciones, si no se cumplen estas 
                 * reglas continúa con el flujo Alterno "Formato de Campo No Válido" de lo contrario 
                 * continúa en el siguiente paso de este flujo.
                 */
                
                /* Se valida que el número de radicación de la solitud no exista en el Sistema de Gestión BEPS. */
                lstErrores.append(validarNumeroRadicacion(solicitud));
                
                /* Se valida que valida que el formato de los campos que vienen en la lista de herederos,
                 * pero que aplican únicamente a herederos y no a terceros como curador, apoderado o tercero 
                 * autorizado.                 
                 */
                lstErrores.append(validarFormatoCamposHerederos(solicitud));
                
                /* Se valida que valida que el formato de los campos que que contienen la información del 
                 * titular de la cuenta bancaria.
                 */
                lstErrores.append(validarFormatoCamposCuentaBancaria(solicitud));
                
                /* Se valida que en el campo esRepresentanteHerederos de la lista de herederos 
                 * siempre exista un registro con valor S.                 
                 */
                lstErrores.append(validarRepresentanteHerederos(solicitud));
                
                /* Se valida que los identificadores de los documentos cumplan con la estructura GUID. */
                lstErrores.append(validarIdentificadorDocumentos(solicitud));
                
                /*Validación de códigos recibidos contra tablas paramétricas. */
                lstErrores.append(validarDominioDatos(solicitud));
                
                if ((lstErrores.toString().trim()).length() != 0) {
                    /* FA: Formato de Campo No Válido. */
                    payLoad.put(ConstantesLoggerServicios.MENSAJE_ERROR, lstErrores.toString());
                    log.info(payLoad, metaData);
                    response = respuestaNegocioServicio(Constantes.COD_CAMPOS_FORMATO_INVALIDO, lstErrores.toString());
                }else{
                    /* FB 3:  Valida que la "Lista datos heredero o tercero" recibida contenga un máximo de 99 
                     * registros. De ser así, continúa con el siguiente paso de este flujo, en caso de que se 
                     * reciban más de 99 registros continúa con el flujo alterno "Cantidad de registros supera 
                     * el número máximo permitido".
                     */
                    if (solicitud.getInformacionHerederos().size() > Constantes.TAMANO_MAXIMO_LISTA_HEREDEROS){
                        /* FA: Cantidad de registros supera el número máximo permitido. */
                        lstErrores.append(Constantes.MSJ_LISTA_HEREDEROS_EXCEDE_TAMANO_MAXIMO);
                        payLoad.put(ConstantesLoggerServicios.MENSAJE_ERROR, lstErrores.toString());
                        log.info(payLoad, metaData);
                        response = respuestaNegocioServicio(Constantes.COD_LISTA_HEREDEROS_EXCEDE_TAMANO_MAXIMO, lstErrores.toString());
                    }else{
                        /* FB 4: Valida si en la "Lista datos heredero o tercero" existen registros con "Tipo de 
                         * Solicitante" igual a "06". De ser así continua con el siguiente paso, en caso contrario 
                         * continúa con el flujo alterno: "No se registraron Herederos".
                         */
                        lstErrores.append(validarExistenciaHerederos(solicitud));
                        
                        if ((lstErrores.toString().trim()).length() != 0) {
                            /* FA: No se registraron Herederos. */
                            payLoad.put(ConstantesLoggerServicios.MENSAJE_ERROR, lstErrores.toString());
                            log.info(payLoad, metaData);
                            response = respuestaNegocioServicio(Constantes.COD_NO_SE_REGISTRARON_HEREDEROS, lstErrores.toString());
                        }else{
                            /* FB 5: Verifica si en la solicitud de devolución de ahorros a herederos no contiene registro 
                             * con "Tipo de Solicitante" igual a "03" o "04" o "05", si la validación se cumple continua con 
                             * el paso 7 del presente flujo básico, en caso contrario valida si contiene un solo registro con  
                             * "Tipo de Solicitante" igual a "03" o "04" o "05" si la validación se cumple continua con el 
                             * siguiente paso, en caso contrario continúa con el flujo alterno: "Existe más de un Tercero Autorizado".
                             */
                            int cantidadTercerosAutorizados = contarTercerosAutorizados(solicitud);
                            
                            if (cantidadTercerosAutorizados == 0 || cantidadTercerosAutorizados == 1){
                                if (cantidadTercerosAutorizados == 1){
                                    /* FB 6: Valida si el "Tipo de Solicitante" es "05: Apoderado", de ser así, el campo Número 
                                     * de Tarjeta Profesional es obligatorio y debe contener información, si la validación se 
                                     * cumple, continúa con el siguiente paso. En caso contrario, si no se cumple, continúa en 
                                     * el flujo alterno: "Apoderado sin Tarjeta Profesional"
                                     */
                                    lstErrores.append(validarTarjetaProfesionalApoderado(solicitud));
                                }
                                
                                if ((lstErrores.toString().trim()).length() != 0) {
                                    /* FA: Apoderado sin Tarjeta Profesional. */
                                    payLoad.put(ConstantesLoggerServicios.MENSAJE_ERROR, lstErrores.toString());
                                    log.info(payLoad, metaData);
                                    response = respuestaNegocioServicio(Constantes.COD_APODERADO_SIN_TARJETA_PROFESIONAL, lstErrores.toString());
                                }else{
                                    /* FB 7: Valida que el número y tipo de documento del vinculado recibidos corresponda a un
                                     * vinculado que se encuentre como fallecido en el Sistema de Gestión BEPS, si la consulta 
                                     * no retorna resultados, continúa con el flujo Alterno "Vinculado No Existe como Fallecido" 
                                     * de lo contrario continúa en el siguiente paso de este flujo.
                                     */
                                    lstErrores.append(validarVinculadoFallecido(solicitud));
                                    
                                    if ((lstErrores.toString().trim()).length() != 0) {
                                        /* FA: Vinculado No Existe como Fallecido. */
                                        payLoad.put(ConstantesLoggerServicios.MENSAJE_ERROR, lstErrores.toString());
                                        log.info(payLoad, metaData);
                                        response = respuestaNegocioServicio(Constantes.COD_VINCULADO_NO_FALLECIDO, lstErrores.toString());
                                    }else{
                                        /* FB 8: Valida en el Sistema de Gestión BEPS que el vinculado fallecido NO tenga una solicitud 
                                         * por devolución de ahorros a herederos aprobada por el Gerente o que se encuentre en Gestión 
                                         * del Gerente, si la validación se cumple continúa con el siguiente paso, en caso contrario, 
                                         * continúa en el flujo alterno: "Existe Solicitud de Devolución de Ahorros a Herederos"
                                         */
                                        lstErrores.append(validarExistenciaSolicitudDevolucionAhorrosHeredero(solicitud));
                                        
                                        if ((lstErrores.toString().trim()).length() != 0) {
                                            /* FA: Existe Solicitud de Devolución de Ahorros a Herederos. */
                                            payLoad.put(ConstantesLoggerServicios.MENSAJE_ERROR, lstErrores.toString());
                                            log.info(payLoad, metaData);
                                            response = respuestaNegocioServicio(Constantes.COD_EXISTE_SOLICITUD_DEVOLUCION_HEREDEROS, lstErrores.toString());
                                        }else{
                                            /* Antes de registrar la solicitud, se recorre la lista de herederos, y para los registros con "Tipo de Solicitante" 
                                             * diferente a 06: Heredero, se elimina la información que no debe ser tenida en cuenta y que no debe ser almacenada 
                                             * en el Sistema de gestín BEPS*/ 
                                            eliminarInformacionNoHeredero(solicitud);
                                            
                                            /* FB 9: Registra la solicitud de devolución de ahorros a herederos recibida, la relaciona con 
                                             * el vinculado fallecido y le asigna la fecha de registro en el sistema. Para cada uno de los
                                             * registros contenidos en la "Lista datos heredero o tercero", registra los campos relacionados
                                             * en la "Tabla 12 - Datos de Salida que se registran para la solicitud de devolución de ahorros 
                                             * a herederos". La solicitud queda en etapa de "Revisión". 
                                             */
                                            response = registrarSolicitudDevolucionAhorrosHerederos(solicitud);
                                        }
                                    }
                                }
                            }else if(cantidadTercerosAutorizados > 1){
                                /* FA: Existe más de un Tercero Autorizado. */
                                lstErrores.append(Constantes.MSJ_EXISTE_MAS_DE_UN_TERCERO_AUTORIZADO);
                                payLoad.put(ConstantesLoggerServicios.MENSAJE_ERROR, lstErrores.toString());
                                log.info(payLoad, metaData);
                                response = respuestaNegocioServicio(Constantes.COD_EXISTE_MAS_DE_UN_TERCERO_AUTORIZADO, lstErrores.toString());
                            }
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
     * Método encargado de construir el mensaje que se muestra cuando no se reciben campos obligatorios.
     * 
     * @param errores
     *            mensaje con los errores registrandos hasta el momento (tanto de obligatoriedad como de formato).
     * @return StringBuffer 
     *            cadena con las validaciones de obligatoriedad que no se cumplen.
     */
    private StringBuffer construirMensajeErroresObligatoriedad(StringBuffer errores){
        StringBuffer erroresObligatoriedad = new StringBuffer();
        
        String[] lines = errores.toString().split("\\n");
        for(String mensaje: lines){
            if (mensaje.contains("obligatorio")){
                if(erroresObligatoriedad.length() > 0){
                    erroresObligatoriedad.append("\n");
                }   
                erroresObligatoriedad.append(mensaje);
            }
        }
        return erroresObligatoriedad;
    }
    
    /**
     * Método encargado de realizar las validaciones de datos de entrada para la operación de registrar 
     * solicitud de devolución de ahorros a herederos.
     * 
     * <b>Caso de Uso:</b> PT-INGE-014-GOI-OTO-4-FAB-02-RegistrarSolicitudDevoluciónAhorrosHerederos.
     * 
     * @param solicitud
     *              información de la solicitud de devolución de ahorros a herederos.
     * @return String 
     *              cadena con las validaciones que no se cumplen, vacío si todas las validaciones se cumplen.
     * @throws DataAccessException
     */
    private String validarDominioDatos(TipoSolicitudDevolucionAhorrosHerederos solicitud)
            throws DataAccessException {
        StringBuilder errores = new StringBuilder();

        /* Se Valida el código del Tipo Documental contra la tabla parametrica parametricas.tran_tipo_codigo_documental. */
        if (solicitud.getDocumentos() != null) {
            for (TipoDocumento documento : solicitud.getDocumentos().getDocumento()) {

                String codTipoDocumental = daBeneficios.consultarDatoParametrica(documento.getCodigoTipoDocumental(),
                        "PR_ConsultarTipoDocumental", "ttc_pk_codigo");

                if (codTipoDocumental == null) {
                    errores.append(Constantes.MSJ_ERROR_VALOR_INCORRECTO_DOMINIO.replace(Constantes.PARAMETRO0, Constantes.CAMPO_CODIGO_TIPO_DOCUMENTAL));
                }
            }
        }
        
        /* Se valida el código del Canal Radicación Solicitud contra la tabla parametrica otor_canal_otorgamiento. */
        if (solicitud.getTipoSolicitud() != null && solicitud.getCanalRadicacion() != null) {
            String codCanalRadicacion = daBeneficios.consultarDatoParametrica(solicitud.getCanalRadicacion(), "PR_ConsultarCanalRadicacion",
                    "oco_pk_codigo");

            if (codCanalRadicacion == null) {
                errores.append(Constantes.MSJ_ERROR_VALOR_INCORRECTO_DOMINIO.replace(Constantes.PARAMETRO0, Constantes.CAMPO_CANAL_RADICACION));
            }
        }
        
        /* Se valida el código del Tipo Documento del vinculado fallecido contra la tabla parametrica vinc_tipo_identificacion. */
        if (solicitud.getTipoSolicitud() != null) {

            String codTipoSolicitud = daBeneficios.consultarDatoParametrica(solicitud.getInformacionVinculado().getIdentificacion().getTipoDocumento(), "PR_ConsultarTipoDocumento", "vti_cod_beps");

            if (codTipoSolicitud == null) {
                errores.append(Constantes.MSJ_ERROR_VALOR_INCORRECTO_DOMINIO.replace(Constantes.PARAMETRO0, Constantes.CAMPO_TIPO_DOCUMENTO_VINCULADO_FALLECIDO));
            }
        }
        
        /* Se valida el código del Tipo Documento de cada uno de los herederos contra la tabla parametrica vinc_tipo_identificacion. */
        if (solicitud.getInformacionHerederos() != null){
            for(TipoInformacionHeredero informacionHeredero : solicitud.getInformacionHerederos()){
                String codTipoDocumento = daBeneficios.consultarDatoParametrica(informacionHeredero.getIdentificacion().getTipoDocumento(), "PR_ConsultarTipoDocumento", "vti_cod_beps");
    
                if (codTipoDocumento == null) {
                    errores.append(Constantes.MSJ_ERROR_VALOR_INCORRECTO_DOMINIO.replace(Constantes.PARAMETRO0, Constantes.CAMPO_TIPO_DOCUMENTO_HEREDERO));
                }
            }
        }
        
        /* Se valida el código del parentesco de cada uno de los herederos contra la tabla parametrica vinc_tipo_identificacion. */
        if (solicitud.getInformacionHerederos() != null){
            for(TipoInformacionHeredero informacionHeredero : solicitud.getInformacionHerederos()){
                if (   informacionHeredero.getParentesco() != null
                    && informacionHeredero.getTipoSolicitante().equals(Constantes.COD_TIPO_SOLICITANTE_HEREDERO)){
                    String codParentesco = daBeneficios.consultarDatoParametrica(informacionHeredero.getParentesco(), "PR_ConsultarParentesco", "opa_pk_codigo");
        
                    if (codParentesco == null) {
                        errores.append(Constantes.MSJ_ERROR_VALOR_INCORRECTO_DOMINIO.replace(Constantes.PARAMETRO0, Constantes.CAMPO_PARENTESCO_HEREDERO));
                    }
                }
            }
        }
        
        /* Se valida el código del Departamento de Residencia de cada uno de los herederos contra la tabla parametrica vinc_departamento. */
        if (solicitud.getInformacionHerederos() != null){
            for(TipoInformacionHeredero informacionHeredero : solicitud.getInformacionHerederos()){
                if (   informacionHeredero.getDepartamento() != null
                    && informacionHeredero.getTipoSolicitante().equals(Constantes.COD_TIPO_SOLICITANTE_HEREDERO)){
                    String codDepartamento = daBeneficios.consultarDatoParametrica(informacionHeredero.getDepartamento(), "PR_ConsultarDepartamento", "vde_codigo_dane_depto");
        
                    if (codDepartamento == null) {
                        errores.append(Constantes.MSJ_ERROR_VALOR_INCORRECTO_DOMINIO.replace(Constantes.PARAMETRO0, Constantes.CAMPO_DEPARTAMENTO_HEREDERO));
                    }
                }
            }
        }
        
        /* Se valida el código del Municipio de Residencia de cada uno de los herederos contra la tabla parametrica vinc_municipio. */
        if (solicitud.getInformacionHerederos() != null){
            for(TipoInformacionHeredero informacionHeredero : solicitud.getInformacionHerederos()){
                if (   informacionHeredero.getMunicipio() != null
                    && informacionHeredero.getTipoSolicitante().equals(Constantes.COD_TIPO_SOLICITANTE_HEREDERO)){
                    String codMunicipio = daBeneficios.consultarDatoParametrica(informacionHeredero.getMunicipio(), "PR_ConsultarMunicipio", "vmu_codigo_dane_municipio");
        
                    if (codMunicipio == null) {
                        errores.append(Constantes.MSJ_ERROR_VALOR_INCORRECTO_DOMINIO.replace(Constantes.PARAMETRO0, Constantes.CAMPO_MUNICIPIO_HEREDERO));
                    }
                }
            }
        }
        
        /* Se valida el código de la Entidad Financiera contra la tabla parametrica otor_entidad_financiera. */
        if (solicitud.getTipoSolicitud() != null) {
            String codEntidadFinanciera = daBeneficios.consultarDatoParametrica(solicitud.getInformacionCuentaBancaria().getEntidadFinanciera(), "PR_ConsultarEntidadFinanciera", "oef_pk_codigo");

            if (codEntidadFinanciera == null) {
                errores.append(Constantes.MSJ_ERROR_VALOR_INCORRECTO_DOMINIO.replace(Constantes.PARAMETRO0, Constantes.CAMPO_ENTIDAD_FINANCIERA));
            }
        }
        
        /* Se valida el código del Tipo Cuenta contra la tabla parametrica otor_tipo_cuenta_bancaria. */
        if (solicitud.getTipoSolicitud() != null) {
            String codTipoCuenta = daBeneficios.consultarCodigoTipoCuenta(solicitud.getInformacionCuentaBancaria().getTipoCuenta());

            if (codTipoCuenta == null) {
                errores.append(Constantes.MSJ_ERROR_VALOR_INCORRECTO_DOMINIO.replace(Constantes.PARAMETRO0, Constantes.CAMPO_TIPO_CUENTA));
            }
        }
        
        /* Se valida el código del Tipo Documento del titular de la cuenta bancaria contra la tabla parametrica vinc_tipo_identificacion. */
        if (solicitud.getTipoSolicitud() != null) {
            if (   solicitud.getInformacionCuentaBancaria() != null 
                && solicitud.getInformacionCuentaBancaria().getTitularCuentaEsTercero() != null
                && solicitud.getInformacionCuentaBancaria().getTitularCuentaEsTercero().equals(Constantes.NO)
                && solicitud.getInformacionCuentaBancaria().getIdentificacion() != null
                && solicitud.getInformacionCuentaBancaria().getIdentificacion().getTipoDocumento() != null
                && solicitud.getInformacionCuentaBancaria().getIdentificacion().getTipoDocumento().length() > 0){
                String codTipoDocumento = daBeneficios.consultarDatoParametrica(solicitud.getInformacionCuentaBancaria().getIdentificacion().getTipoDocumento(), "PR_ConsultarTipoDocumento", "vti_cod_beps");
                
                if (codTipoDocumento == null) {
                    errores.append(Constantes.MSJ_ERROR_VALOR_INCORRECTO_DOMINIO.replace(Constantes.PARAMETRO0, Constantes.CAMPO_TIPO_DOCUMENTO_TITULAR_CUENTA));
                }
            }
        }

        return errores.toString();
    }
    
    /**
     * Método para registrar en el Sistema de Gestión BEPS, los datos de una solicitud de devolución de ahorros a herederos.
     * 
     * <b>Caso de Uso:</b> PT-INGE-014-GOI-OTO-4-FAB-02-RegistrarSolicitudDevoluciónAhorrosHerederos.
     * 
     * @param solicitud
     *              información de la solicitud de devolución de ahorros a herederos.
     * @return <TipoEstadoEjecucion>           
     *              resulatado del proceso de registro de la solicitud de devolución de ahorros a herederos.
     * @throws Exception
     */
    private TipoEstadoEjecucion registrarSolicitudDevolucionAhorrosHerederos(TipoSolicitudDevolucionAhorrosHerederos solicitud) throws Exception {
        DatabaseManager database = null;
        TipoEstadoEjecucion resultado = null;
        Long idSolicitud;
        
        try {
            database = new DatabaseManager(TipoConexionBaseDatosEnum.SQL_SERVER);
            daBeneficios.inicializarDatabaseManager(database);

            /* Se inicia la transaccion */
            database.beginTransaction();
            
            /* Se consulta el id del vinculado*/
            TipoDocumentoPersonaNatural documentoVinculado = new TipoDocumentoPersonaNatural();
            documentoVinculado.setTipoDocumento(solicitud.getInformacionVinculado().getIdentificacion().getTipoDocumento());
            documentoVinculado.setNumeroDocumento(solicitud.getInformacionVinculado().getIdentificacion().getNumeroDocumento());
            
            InformacionVinculadoEstadosDTO informacionVinculado = daBeneficios.consultarExistenciaVinculado(documentoVinculado);
            Long idVinculado = informacionVinculado.getIdentificadorVinculado();
            
            /* Se realiza la creación de la solicitud de devolución de ahorros a herederos. */
            idSolicitud = daBeneficios.crearSolicitudDevolucionAhorrosHerederos(idVinculado, solicitud, Constantes.ESTADO_CREADO, Constantes.ETAPA_REVISION, Constantes.CERO);
            
            /* Se registran los documentos. */
            daBeneficios.registrarDocumentos(idSolicitud, solicitud.getDocumentos());

            /* Se registran los terceros/herederos. */
            if (solicitud.getInformacionHerederos() != null) {
                for (TipoInformacionHeredero informacionHeredero : solicitud.getInformacionHerederos()){
                    daBeneficios.registrarInformacionHeredero(idSolicitud, informacionHeredero);
                }
            }
            
            /* Se registra la información de la cuenta bancaria. */
            String codTipoCuenta = daBeneficios.consultarCodigoTipoCuenta(solicitud.getInformacionCuentaBancaria().getTipoCuenta());
            
            /* Si el titular de la cuenta bancaria es tercero, se toman los datos del representante de los herederos */
            if(solicitud.getInformacionCuentaBancaria().getTitularCuentaEsTercero().equals(Constantes.SI)){
                String tipoDocumentoRepresentanteHerederos = "";
                String numeroDocumentoRepresentanteHerederos = "";
                String nombreRepresentanteHerederos = "";
                for (TipoInformacionHeredero informacionHeredero : solicitud.getInformacionHerederos()){
                    if (informacionHeredero.getEsRepresentanteHerederos().equals(Constantes.SI)) {
                        tipoDocumentoRepresentanteHerederos = informacionHeredero.getIdentificacion().getTipoDocumento();
                        numeroDocumentoRepresentanteHerederos = informacionHeredero.getIdentificacion().getNumeroDocumento();
                        nombreRepresentanteHerederos = informacionHeredero.getNombres().getPrimerNombre() + " " + informacionHeredero.getNombres().getPrimerApellido();
                        if (nombreRepresentanteHerederos.length() > 50){
                            nombreRepresentanteHerederos = nombreRepresentanteHerederos.substring(0, 49);
                        }
                    }
                }
                TipoDocumentoTercero documento = new TipoDocumentoTercero();
                documento.setTipoDocumento(tipoDocumentoRepresentanteHerederos);
                documento.setNumeroDocumento(numeroDocumentoRepresentanteHerederos);
                solicitud.getInformacionCuentaBancaria().setIdentificacion(documento);
                solicitud.getInformacionCuentaBancaria().setNombreTitular(nombreRepresentanteHerederos);               
            }
            daBeneficios.registrarCuentaBancaria(idSolicitud, codTipoCuenta, solicitud);
            
            /* Se registra la destinación. */
            TipoDestinacionesRecursos destinacionesRecursos = new TipoDestinacionesRecursos();
            TipoDestinacionRecursos destinacionRecursos = new TipoDestinacionRecursos();
            destinacionRecursos.setCodigoTipo(solicitud.getDestinacionRecursos());
            destinacionRecursos.setPorcentaje(Constantes.PORCENTAJE_DESTINACION_RECURSOS_100);
            destinacionesRecursos.getDestinacion().add(destinacionRecursos);
            daBeneficios.registrarDestinaciones(idSolicitud, destinacionesRecursos);
            
            /* Se actualiza la fecha de defunción y del Registro Civil de Defunción del vinculado fallecido */
            daBeneficios.actualizarDatosVinculadoFallecido(solicitud);
            
            /* Se realiza commit de la transaccion */
            database.commit();
            
            resultado = respuestaExitosaServicio();
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
     * Método que valida que los datos solicitados como obligatorios no vengan en blanco.
     * 
     * <b>Caso de Uso:</b> PT-INGE-014-GOI-OTO-4-FAB-02-RegistrarSolicitudDevoluciónAhorrosHerederos.
     * 
     * @param solicitud
     *            información de la solicitud de devolución de ahorros a herederos.
     * @return String
     *            resultado de la validación. Vacío si aprueba la validación.
     */
    private String validarDatosEnBlanco(TipoSolicitudDevolucionAhorrosHerederos solicitud) throws Exception {
        String resultadoValidacion = "";
        
        if(solicitud != null){
            
            if(solicitud.getFechaRegistro() != null && solicitud.getFechaRegistro().length() == 0){
                if(resultadoValidacion.length() > 0){
                    resultadoValidacion = resultadoValidacion + "\n";
                }
                resultadoValidacion = resultadoValidacion + Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, Constantes.CAMPO_FECHA_REGISTRO);
            }
            
            if(solicitud.getDestinacionRecursos() != null && solicitud.getDestinacionRecursos().length() == 0){
                if(resultadoValidacion.length() > 0){
                    resultadoValidacion = resultadoValidacion + "\n";
                }
                resultadoValidacion = resultadoValidacion + Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, Constantes.CAMPO_DESTINACION_RECURSOS);
            }
            
            if(solicitud.getTipoSolicitud() != null && solicitud.getTipoSolicitud().length() == 0){
                if(resultadoValidacion.length() > 0){
                    resultadoValidacion = resultadoValidacion + "\n";
                }
                resultadoValidacion = resultadoValidacion + Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, Constantes.CAMPO_TIPO_SOLICITUD);
            }
            
            if(solicitud.getUsuarioRegistroSistema() != null && solicitud.getUsuarioRegistroSistema().length() == 0){
                if(resultadoValidacion.length() > 0){
                    resultadoValidacion = resultadoValidacion + "\n";
                }
                resultadoValidacion = resultadoValidacion + Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, Constantes.CAMPO_USUARIO_REGISTRO);
            }
            
            if(solicitud.getNumeroRadicacion() != null && solicitud.getNumeroRadicacion().length() == 0){
                if(resultadoValidacion.length() > 0){
                    resultadoValidacion = resultadoValidacion + "\n";
                }
                resultadoValidacion = resultadoValidacion + Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, Constantes.CAMPO_NUMERO_RADICACION);
            }
            
            if(solicitud.getCanalRadicacion() != null && solicitud.getCanalRadicacion().length() == 0){
                if(resultadoValidacion.length() > 0){
                    resultadoValidacion = resultadoValidacion + "\n";
                }
                resultadoValidacion = resultadoValidacion + Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, Constantes.CAMPO_CANAL_RADICACION);
            }
            
            if(solicitud.getInformacionVinculado() != null){
                if(   solicitud.getInformacionVinculado().getIdentificacion() != null
                   && (   solicitud.getInformacionVinculado().getIdentificacion().getTipoDocumento() == null
                       || solicitud.getInformacionVinculado().getIdentificacion().getTipoDocumento().length() == 0)){
                    if(resultadoValidacion.length() > 0){
                        resultadoValidacion = resultadoValidacion + "\n";
                    }
                    resultadoValidacion = resultadoValidacion + Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, Constantes.CAMPO_TIPO_DOCUMENTO_VINCULADO_FALLECIDO);
                }
            
                if(   solicitud.getInformacionVinculado().getIdentificacion() != null 
                   && (   solicitud.getInformacionVinculado().getIdentificacion().getNumeroDocumento() == null
                       || solicitud.getInformacionVinculado().getIdentificacion().getNumeroDocumento().length() == 0)){
                    if(resultadoValidacion.length() > 0){
                        resultadoValidacion = resultadoValidacion + "\n";
                    }
                    resultadoValidacion = resultadoValidacion + Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, Constantes.CAMPO_NUMERO_DOCUMENTO_VINCULADO_FALLECIDO);
                }
            
                if(   solicitud.getInformacionVinculado().getRegistroCivilDefuncion() != null
                   && solicitud.getInformacionVinculado().getRegistroCivilDefuncion().length() == 0){
                    if(resultadoValidacion.length() > 0){
                        resultadoValidacion = resultadoValidacion + "\n";
                    }
                    resultadoValidacion = resultadoValidacion + Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, Constantes.CAMPO_REGISTRO_CIVIL_DEFUNCION);
                }   

               if(   solicitud.getInformacionVinculado().getFechaDefuncion() != null
                  && solicitud.getInformacionVinculado().getFechaDefuncion().length() == 0){
                   if(resultadoValidacion.length() > 0){
                       resultadoValidacion = resultadoValidacion + "\n";
                   }
                   resultadoValidacion = resultadoValidacion + Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, Constantes.CAMPO_FECHA_DEFUNCION);
               } 
            }
            
            if(solicitud.getInformacionHerederos() != null){
                for (TipoInformacionHeredero informacionHeredero : solicitud.getInformacionHerederos()){
                    
                    if(   informacionHeredero.getIdentificacion() != null 
                       && (   informacionHeredero.getIdentificacion().getTipoDocumento() == null
                           || informacionHeredero.getIdentificacion().getTipoDocumento().length() == 0)){
                        if(resultadoValidacion.length() > 0){
                            resultadoValidacion = resultadoValidacion + "\n";
                        }
                        resultadoValidacion = resultadoValidacion + Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0,
                                Constantes.CAMPO_TIPO_DOCUMENTO_HEREDERO);
                    }
                    
                    if(   informacionHeredero.getIdentificacion() != null 
                       && (   informacionHeredero.getIdentificacion().getNumeroDocumento() == null
                           || informacionHeredero.getIdentificacion().getNumeroDocumento().length() == 0)){
                        if(resultadoValidacion.length() > 0){
                            resultadoValidacion = resultadoValidacion + "\n";
                        }
                        resultadoValidacion = resultadoValidacion + Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0,
                                Constantes.CAMPO_NUMERO_DOCUMENTO_HEREDERO);
                    }
                    
                    if(informacionHeredero.getNombres() != null){
                        if (   informacionHeredero.getNombres().getPrimerApellido() != null 
                            && informacionHeredero.getNombres().getPrimerApellido().length() == 0){
                            if(resultadoValidacion.length() > 0){
                                resultadoValidacion = resultadoValidacion + "\n";
                            }
                            resultadoValidacion = resultadoValidacion + Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0,
                                    Constantes.CAMPO_PRIMER_APELLIDO_HEREDERO) + "\n";                        
                        }
                        
                        if (   informacionHeredero.getNombres().getPrimerNombre() != null 
                                && informacionHeredero.getNombres().getPrimerNombre().length() == 0){
                                if(resultadoValidacion.length() > 0){
                                    resultadoValidacion = resultadoValidacion + "\n";
                                }
                                resultadoValidacion = resultadoValidacion + Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0,
                                        Constantes.CAMPO_PRIMER_NOMBRE_HEREDERO) + "\n";                        
                        }
                    }                    
                    
                    if(   informacionHeredero.getTipoSolicitante() != null
                       && informacionHeredero.getTipoSolicitante().length() == 0){
                        if(resultadoValidacion.length() > 0){
                            resultadoValidacion = resultadoValidacion + "\n";
                        }
                        resultadoValidacion = resultadoValidacion + Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0,
                                 Constantes.CAMPO_TIPO_SOLICITANTE_HEREDERO);
                    }
                    
                    if(   informacionHeredero.getInformacionAutorizacion() != null
                       && informacionHeredero.getInformacionAutorizacion().getAutorizacionEnvioComunicacion() != null
                       && informacionHeredero.getInformacionAutorizacion().getAutorizacionEnvioComunicacion().length() == 0){
                        if(resultadoValidacion.length() > 0){
                            resultadoValidacion = resultadoValidacion + "\n";
                        }
                        resultadoValidacion = resultadoValidacion + Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0,
                                Constantes.CAMPO_AUTORIZA_ENVIO_COMUNICACION_HEREDERO);
                    }
                    
                    if(   informacionHeredero.getInformacionAutorizacion() != null
                       && informacionHeredero.getInformacionAutorizacion().getAutorizacionManejoInformacion() != null
                       && informacionHeredero.getInformacionAutorizacion().getAutorizacionManejoInformacion().length() == 0){
                        if(resultadoValidacion.length() > 0){
                            resultadoValidacion = resultadoValidacion + "\n";
                        }
                        resultadoValidacion = resultadoValidacion + Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0,
                                     Constantes.CAMPO_AUTORIZA_MANEJO_INFORMACIONN_HEREDERO);
                    }
                    
                    if(   informacionHeredero.getEsRepresentanteHerederos() != null
                       && informacionHeredero.getEsRepresentanteHerederos().length() == 0){
                        if(resultadoValidacion.length() > 0){
                            resultadoValidacion = resultadoValidacion + "\n";
                        }
                        resultadoValidacion = resultadoValidacion + Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0,
                                    Constantes.CAMPO_ES_REPRESENTANTE_HEREDEROS);
                    }

                }
            }
            
            if(solicitud.getInformacionCuentaBancaria() != null){
            
                if(   solicitud.getInformacionCuentaBancaria().getEntidadFinanciera() != null
                   && solicitud.getInformacionCuentaBancaria().getEntidadFinanciera().length() == 0){
                    if(resultadoValidacion.length() > 0){
                        resultadoValidacion = resultadoValidacion + "\n";
                    }
                    resultadoValidacion = resultadoValidacion + Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, Constantes.CAMPO_ENTIDAD_FINANCIERA);
                }
                
                if(   solicitud.getInformacionCuentaBancaria().getTipoCuenta() != null
                   && solicitud.getInformacionCuentaBancaria().getTipoCuenta().length() == 0){
                    if(resultadoValidacion.length() > 0){
                        resultadoValidacion = resultadoValidacion + "\n";
                    }
                    resultadoValidacion = resultadoValidacion + Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, Constantes.CAMPO_TIPO_CUENTA);
                }
                
                if(   solicitud.getInformacionCuentaBancaria().getNumeroCuenta() != null
                   && solicitud.getInformacionCuentaBancaria().getNumeroCuenta().length() == 0){
                    if(resultadoValidacion.length() > 0){
                        resultadoValidacion = resultadoValidacion + "\n";
                    }
                    resultadoValidacion = resultadoValidacion + Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, Constantes.CAMPO_NUMERO_CUENTA);
                }            
                
                if(   solicitud.getInformacionCuentaBancaria().getTitularCuentaEsTercero() != null
                   && solicitud.getInformacionCuentaBancaria().getTitularCuentaEsTercero().length() == 0){
                    if(resultadoValidacion.length() > 0){
                        resultadoValidacion = resultadoValidacion + "\n";
                    }
                    resultadoValidacion = resultadoValidacion + Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, Constantes.CAMPO_TITULA_CUENTA_ES_TERCERO);
                }
                
                if(solicitud.getInformacionCuentaBancaria().getTitularCuentaEsTercero() != null &&
                        solicitud.getInformacionCuentaBancaria().getTitularCuentaEsTercero().equals(Constantes.NO)){
                    if(   solicitud.getInformacionCuentaBancaria().getIdentificacion() == null 
                            || solicitud.getInformacionCuentaBancaria().getIdentificacion().getTipoDocumento() == null
                            || solicitud.getInformacionCuentaBancaria().getIdentificacion().getTipoDocumento().length() == 0){
                        if(resultadoValidacion.length() > 0){
                            resultadoValidacion = resultadoValidacion + "\n";
                        }   
                        resultadoValidacion = resultadoValidacion + Constantes.MSJ_TIPO_DOCUMENTO_TITULAR_CUENTA_OBLIGATORIO;    
                    }
                }
                     
                if(solicitud.getInformacionCuentaBancaria().getTitularCuentaEsTercero() != null &&
                        solicitud.getInformacionCuentaBancaria().getTitularCuentaEsTercero().equals(Constantes.NO)){
                    if(   solicitud.getInformacionCuentaBancaria().getIdentificacion() == null 
                            || solicitud.getInformacionCuentaBancaria().getIdentificacion().getNumeroDocumento() == null
                            || solicitud.getInformacionCuentaBancaria().getIdentificacion().getNumeroDocumento().length() == 0){
                        if(resultadoValidacion.length() > 0){
                            resultadoValidacion = resultadoValidacion + "\n";
                        }   
                        resultadoValidacion = resultadoValidacion + Constantes.MSJ_NUMERO_DOCUMENTO_TITULAR_CUENTA_OBLIGATORIO;    
                    }
                }                

                if(   solicitud.getInformacionCuentaBancaria().getTitularCuentaEsTercero() != null
                   && solicitud.getInformacionCuentaBancaria().getTitularCuentaEsTercero().equals(Constantes.NO)){
                    if(   solicitud.getInformacionCuentaBancaria().getNombreTitular() == null
                            || solicitud.getInformacionCuentaBancaria().getNombreTitular().length() == 0){
                        if(resultadoValidacion.length() > 0){
                            resultadoValidacion = resultadoValidacion + "\n";
                        }   
                        resultadoValidacion = resultadoValidacion + Constantes.MSJ_NOMBRE_TITULAR_CUENTA_OBLIGATORIO;    
                    }
                }  
                
            }
            
        }
        return resultadoValidacion;
    }     
    
    
    /**
     * Método que valida la obligatoriedad de los documentos relacionados con la solicitud.
     * Debe haber al menos un documento.
     * 
     * <b>Caso de Uso:</b> PT-INGE-014-GOI-OTO-4-FAB-02-RegistrarSolicitudDevoluciónAhorrosHerederos.
     * 
     * @param solicitud
     *            información de la solicitud de devolución de ahorros a herederos.
     * @return String
     *            resultado de la validación. Vacío si aprueba la validación.
     */
    private String validarObligatoriedadDocumentos(TipoSolicitudDevolucionAhorrosHerederos solicitud) throws Exception {
        String resultadoValidacion = "";
        
        if(solicitud != null){
            if(   solicitud.getDocumentos() == null
               || solicitud.getDocumentos().getDocumento() == null
               || solicitud.getDocumentos().getDocumento().size() == 0){
                if(resultadoValidacion.length() > 0){
                    resultadoValidacion = resultadoValidacion + "\n";
                }
                resultadoValidacion = resultadoValidacion + Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, Constantes.CAMPO_DOCUMENTO);
            }
            
            if(   solicitud.getDocumentos() != null && solicitud.getDocumentos().getDocumento() != null){
                for (TipoDocumento documento: solicitud.getDocumentos().getDocumento()){
                    
                    if (documento.getId() != null && documento.getId().length() == 0){
                         if(resultadoValidacion.length() > 0){
                             resultadoValidacion = resultadoValidacion + "\n";
                         }
                         resultadoValidacion = resultadoValidacion + Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, Constantes.CAMPO_ID_DOCUMENTO);
                    }
                    
                    if (documento.getCodigoTipoDocumental() != null && documento.getCodigoTipoDocumental().length() == 0){
                        if(resultadoValidacion.length() > 0){
                            resultadoValidacion = resultadoValidacion + "\n";
                        }
                        resultadoValidacion = resultadoValidacion + Constantes.MSJ_DATO_OBLIGATORIO.replace(Constantes.PARAMETRO0, Constantes.CAMPO_CODIGO_TIPO_DOCUMENTAL);
                   }
                }
            }
        }
        return resultadoValidacion;
    }     
 
    /**
     * Método que valida la obligatoriedad del campo Parentesco, para cada uno de los registros contenidos en la lista de herederos.
     * Este campo es obligatorio si el "Tipo de Solicitante" es 06: Heredero.
     * 
     * <b>Caso de Uso:</b> PT-INGE-014-GOI-OTO-4-FAB-02-RegistrarSolicitudDevoluciónAhorrosHerederos.
     * 
     * @param solicitud
     *            información de la solicitud de devolución de ahorros a herederos.
     * @return String
     *            resultado de la validación. Vacío si aprueba la validación.
     */
    private String validarObligatoriedadParentescoHeredero(TipoSolicitudDevolucionAhorrosHerederos solicitud) throws Exception {
        String resultadoValidacion = "";
        
        if(solicitud != null && solicitud.getInformacionHerederos() != null){
            for (TipoInformacionHeredero informacionHeredero : solicitud.getInformacionHerederos()){
                if(   informacionHeredero.getTipoSolicitante() != null
                   && informacionHeredero.getTipoSolicitante().equals(Constantes.COD_TIPO_SOLICITANTE_HEREDERO)){
                    if(informacionHeredero.getParentesco() == null || informacionHeredero.getParentesco().length() == 0){
                        if(resultadoValidacion.length() > 0){
                            resultadoValidacion = resultadoValidacion + "\n";
                        }   
                        resultadoValidacion = resultadoValidacion + Constantes.MSJ_PARENTESCO_HEREDERO_OBLIGATORIO;
                    }
                }
            }
        }
        return resultadoValidacion;
    }     
               
    /**
     * Método que valida la obligatoriedad del campo Número de Tarjeta Profesional, para cada uno de los registros contenidos en la lista de herederos.
     * Este campo es obligatorio si el "Tipo de Solicitante" es 05: Apoderado.
     * 
     * <b>Caso de Uso:</b> PT-INGE-014-GOI-OTO-4-FAB-02-RegistrarSolicitudDevoluciónAhorrosHerederos.
     * 
     * @param solicitud
     *            información de la solicitud de devolución de ahorros a herederos.
     * @return String
     *            resultado de la validación. Vacío si aprueba la validación.
     */
    private String validarTarjetaProfesionalApoderado(TipoSolicitudDevolucionAhorrosHerederos solicitud) throws Exception {
        String resultadoValidacion = "";
        
        if(solicitud != null && solicitud.getInformacionHerederos() != null){
            for (TipoInformacionHeredero informacionHeredero : solicitud.getInformacionHerederos()){
                if(   informacionHeredero.getTipoSolicitante() != null
                   && informacionHeredero.getTipoSolicitante().equals(Constantes.COD_TIPO_SOLICITANTE_APODERADO) 
                   && (   informacionHeredero.getNumeroTarjetaProfesional() == null
                       || informacionHeredero.getNumeroTarjetaProfesional().length() == 0)){
                    if(resultadoValidacion.length() > 0){
                        resultadoValidacion = resultadoValidacion + "\n";
                    }   
                    resultadoValidacion = resultadoValidacion + Constantes.MSJ_APODERADO_SIN_TARJETA_PROFESIONAL;   
                }
            }
        }
        return resultadoValidacion;
    }

    /**
     * Método que valida la obligatoriedad del campo Dirección Residencia Heredero, para cada uno de los registros contenidos en la lista de herederos.
     * Este campo es obligatorio si el "Tipo de Solicitante" es 06: Heredero.
     * 
     * <b>Caso de Uso:</b> PT-INGE-014-GOI-OTO-4-FAB-02-RegistrarSolicitudDevoluciónAhorrosHerederos.
     * 
     * @param solicitud
     *            información de la solicitud de devolución de ahorros a herederos.
     * @return String
     *            resultado de la validación.
     */
    private String validarObligatoriedadDireccionResidenciaHeredero(TipoSolicitudDevolucionAhorrosHerederos solicitud) throws Exception {
        String resultadoValidacion = "";
        
        if(solicitud != null && solicitud.getInformacionHerederos() != null){
            for (TipoInformacionHeredero informacionHeredero : solicitud.getInformacionHerederos()){
                if(   informacionHeredero.getTipoSolicitante() != null
                   && informacionHeredero.getTipoSolicitante().equals(Constantes.COD_TIPO_SOLICITANTE_HEREDERO) 
                   && (   informacionHeredero.getDireccion() == null
                       || informacionHeredero.getDireccion().length() == 0)){
                    if(resultadoValidacion.length() > 0){
                        resultadoValidacion = resultadoValidacion + "\n";
                    }   
                    resultadoValidacion = resultadoValidacion + Constantes.MSJ_DIRECCION_RESIDENCIA_HEREDERO_OBLIGATORIO;   
                }
            }
        }
        return resultadoValidacion;
    }    
    
    /**
     * Método que valida la obligatoriedad del campo Departamento Residencia Heredero, para cada uno de los registros contenidos en la lista de herederos.
     * Este campo es obligatorio si el "Tipo de Solicitante" es 06: Heredero.
     * 
     * <b>Caso de Uso:</b> PT-INGE-014-GOI-OTO-4-FAB-02-RegistrarSolicitudDevoluciónAhorrosHerederos <br/>
     * 
     * @param solicitud
     *            información de la solicitud de devolución de ahorros a herederos.
     * @return String
     *            resultado de la validación. Vacío si aprueba la validación.
     */
    private String validarObligatoriedadDepartamentoResidenciaHeredero(TipoSolicitudDevolucionAhorrosHerederos solicitud) throws Exception {
        String resultadoValidacion = "";
        
        if(solicitud != null && solicitud.getInformacionHerederos() != null){
            for (TipoInformacionHeredero informacionHeredero : solicitud.getInformacionHerederos()){
                if(   informacionHeredero.getTipoSolicitante() != null
                   && informacionHeredero.getTipoSolicitante().equals(Constantes.COD_TIPO_SOLICITANTE_HEREDERO)){
                    if(   informacionHeredero.getDepartamento() == null
                       || informacionHeredero.getDepartamento().length() == 0){
                        if(resultadoValidacion.length() > 0){
                            resultadoValidacion = resultadoValidacion + "\n";
                        }   
                        resultadoValidacion = resultadoValidacion + Constantes.MSJ_DEPARTAMENTO_RESIDENCIA_HEREDERO_OBLIGATORIO;
                    }
                }
            }
        }
        return resultadoValidacion;
    }    
    
    /**
     * Método que valida la obligatoriedad del campo Municipio Residencia Heredero, para cada uno de los registros contenidos en la lista de herederos.
     * Este campo es obligatorio si el "Tipo de Solicitante" es 06: Heredero.
     * 
     * <b>Caso de Uso:</b> PT-INGE-014-GOI-OTO-4-FAB-02-RegistrarSolicitudDevoluciónAhorrosHerederos.
     * 
     * @param solicitud
     *            información de la solicitud de devolución de ahorros a herederos.
     * @return String
     *            resultado de la validación. Vacío si aprueba la validación.
     */
    private String validarObligatoriedadMunicipioResidenciaHeredero(TipoSolicitudDevolucionAhorrosHerederos solicitud) throws Exception {
        String resultadoValidacion = "";
        
        if(solicitud != null && solicitud.getInformacionHerederos() != null){
            for (TipoInformacionHeredero informacionHeredero : solicitud.getInformacionHerederos()){
                if(   informacionHeredero.getTipoSolicitante() != null
                   && informacionHeredero.getTipoSolicitante().equals(Constantes.COD_TIPO_SOLICITANTE_HEREDERO)){
                    if(   informacionHeredero.getMunicipio() == null
                       || informacionHeredero.getMunicipio().length() == 0){
                        if(resultadoValidacion.length() > 0){
                            resultadoValidacion = resultadoValidacion + "\n";
                        }   
                        resultadoValidacion = resultadoValidacion + Constantes.MSJ_MUNICIPIO_RESIDENCIA_HEREDERO_OBLIGATORIO;
                    }
                }
            }
        }
        return resultadoValidacion;
    } 
    
    /**
     * Método que valida la obligatoriedad del campo telefono1 del heredero, para cada uno de los registros contenidos en la lista de herederos.
     * Este campo es obligatorio si el "Tipo de Solicitante" es 06: Heredero.
     * 
     * <b>Caso de Uso:</b> PT-INGE-014-GOI-OTO-4-FAB-02-RegistrarSolicitudDevoluciónAhorrosHerederos.
     * 
     * @param solicitud
     *            información de la solicitud de devolución de ahorros a herederos.
     * @return String
     *            resultado de la validación. Vacío si aprueba la validación.
     */
    private String validarObligatoriedadTelefonoHeredero(TipoSolicitudDevolucionAhorrosHerederos solicitud) throws Exception {
        String resultadoValidacion = "";
        
        if(solicitud != null && solicitud.getInformacionHerederos() != null){
            for (TipoInformacionHeredero informacionHeredero : solicitud.getInformacionHerederos()){
                if(   informacionHeredero.getTipoSolicitante() != null 
                   && informacionHeredero.getTipoSolicitante().equals(Constantes.COD_TIPO_SOLICITANTE_HEREDERO) 
                   && (   informacionHeredero.getTelefono1() == null 
                       || informacionHeredero.getTelefono1().length() == 0)){
                    if(resultadoValidacion.length() > 0){
                        resultadoValidacion = resultadoValidacion + "\n";
                    }   
                    resultadoValidacion = resultadoValidacion + Constantes.MSJ_TELEFONO1_HEREDERO_OBLIGATORIO;   
                }
            }
        }
        return resultadoValidacion;
    } 
    
    /**
     * Método que para cada registro contenido en la lista de herederos, elimina la información que no aplica 
     * si el "Tipo de Solicitante" es diferentes a 06: Heredero.
     * Esta información se elimina dado que no debe ser validada ni almacenada en el Sistema de Gestión BEPS. 
     * 
     * <b>Caso de Uso:</b> PT-INGE-014-GOI-OTO-4-FAB-02-RegistrarSolicitudDevoluciónAhorrosHerederos.
     * 
     * @param solicitud
     *            información de la solicitud de devolución de ahorros a herederos.
     */
    private void eliminarInformacionNoHeredero(TipoSolicitudDevolucionAhorrosHerederos solicitud) throws Exception {
        
        if(solicitud != null && solicitud.getInformacionHerederos() != null){
            for (TipoInformacionHeredero informacionHeredero : solicitud.getInformacionHerederos()){
                if(informacionHeredero.getTipoSolicitante() != null){
                    if(!informacionHeredero.getTipoSolicitante().equals(Constantes.COD_TIPO_SOLICITANTE_HEREDERO)){
                        informacionHeredero.setParentesco(null);
                        informacionHeredero.setDireccion(null);
                        informacionHeredero.setBarrio(null);
                        informacionHeredero.setDepartamento(null);
                        informacionHeredero.setMunicipio(null);
                        informacionHeredero.setTelefono1(null);
                        informacionHeredero.setTelefono2(null);
                        informacionHeredero.setCorreoElectronico(null);
                    }
                }
            }
        }
    } 
        
    /**
     * Método que valida el formato de los campos que vienen en la lista de herederos,
     * pero que aplican únicamente a herederos y no a terceros como curador, apoderado o tercero 
     * autorizado. 
     * 
     * <b>Caso de Uso:</b> PT-INGE-014-GOI-OTO-4-FAB-02-RegistrarSolicitudDevoluciónAhorrosHerederos.
     * 
     * @param solicitud
     *            información de la solicitud de devolución de ahorros a herederos.
     * @return String
     *            resultado de la validación. Vacío si aprueba la validación.
     */
    private String validarFormatoCamposHerederos(TipoSolicitudDevolucionAhorrosHerederos solicitud) throws Exception {
        String resultadoValidacion = "";
        
        if(solicitud != null && solicitud.getInformacionHerederos() != null){
            for (TipoInformacionHeredero informacionHeredero : solicitud.getInformacionHerederos()){
                
                if (   informacionHeredero.getTipoSolicitante() != null
                    && informacionHeredero.getTipoSolicitante().equals(Constantes.COD_TIPO_SOLICITANTE_HEREDERO)){

                    if(informacionHeredero.getParentesco() != null){
                        if(informacionHeredero.getParentesco().length() != 2){ 
                            if(resultadoValidacion.length() > 0){
                                resultadoValidacion = resultadoValidacion + "\n";
                            } 
                            resultadoValidacion = resultadoValidacion + Constantes.MSJ_PARENTESCO_LONGITUD_INVALIDA;
                        }
                    }
                    
                    if(informacionHeredero.getDireccion() != null){
                        if(   informacionHeredero.getDireccion().length() < 1
                           || informacionHeredero.getDireccion().length() > 60){ 
                            if(resultadoValidacion.length() > 0){
                                resultadoValidacion = resultadoValidacion + "\n";
                            } 
                            resultadoValidacion = resultadoValidacion + Constantes.MSJ_DIRECCION_LONGITUD_INVALIDA;
                        }
                    }

                    if(informacionHeredero.getBarrio() != null){
                        if(informacionHeredero.getBarrio().length() > 30){ 
                            if(resultadoValidacion.length() > 0){
                                resultadoValidacion = resultadoValidacion + "\n";
                            } 
                            resultadoValidacion = resultadoValidacion + Constantes.MSJ_BARRIO_LONGITUD_INVALIDA;
                        }
                    }
                    
                    if(informacionHeredero.getDepartamento() != null){
                        if (!RegexUtil.isValid(Constantes.ER_NUMERICO, informacionHeredero.getDepartamento())) {
                            if(resultadoValidacion.length() > 0){
                                resultadoValidacion = resultadoValidacion + "\n";
                            } 
                            resultadoValidacion = resultadoValidacion + Constantes.MSJ_DEPARTAMENTO_FORMATO_INVALIDO;
                            
                        }
                        
                        if(informacionHeredero.getDepartamento().length() != 2){ 
                            if(resultadoValidacion.length() > 0){
                                resultadoValidacion = resultadoValidacion + "\n";
                            } 
                            resultadoValidacion = resultadoValidacion + Constantes.MSJ_DEPARTAMENTO_LONGITUD_INVALIDA;
                        }
                    }
                    
                    if(informacionHeredero.getMunicipio() != null){
                        if (!RegexUtil.isValid(Constantes.ER_NUMERICO, informacionHeredero.getMunicipio())) {
                            if(resultadoValidacion.length() > 0){
                                resultadoValidacion = resultadoValidacion + "\n";
                            } 
                            resultadoValidacion = resultadoValidacion + Constantes.MSJ_MUNICIPIO_FORMATO_INVALIDO;
                            
                        }
                        
                        if(informacionHeredero.getMunicipio().length() != 5){ 
                            if(resultadoValidacion.length() > 0){
                                resultadoValidacion = resultadoValidacion + "\n";
                            } 
                            resultadoValidacion = resultadoValidacion + Constantes.MSJ_MUNICIPIO_LONGITUD_INVALIDA;
                        }
                    }
                    
                    if(informacionHeredero.getTelefono1() != null){
                        if(   informacionHeredero.getTelefono1().length() < 5
                           || informacionHeredero.getTelefono1().length() > 20){ 
                            if(resultadoValidacion.length() > 0){
                                resultadoValidacion = resultadoValidacion + "\n";
                            } 
                            resultadoValidacion = resultadoValidacion + Constantes.MSJ_TELEFONO1_LONGITUD_INVALIDA;
                        }
                    } 
                    
                    if(   informacionHeredero.getTelefono2() != null
                       && informacionHeredero.getTelefono2().length() > 0){
                        if(   informacionHeredero.getTelefono2().length() < 5
                           || informacionHeredero.getTelefono2().length() > 20){ 
                            if(resultadoValidacion.length() > 0){
                                resultadoValidacion = resultadoValidacion + "\n";
                            } 
                            resultadoValidacion = resultadoValidacion + Constantes.MSJ_TELEFONO2_LONGITUD_INVALIDA;
                        }
                    }  
                    
                    if(   informacionHeredero.getCorreoElectronico() != null
                       && informacionHeredero.getCorreoElectronico().length() > 0){
                        if (!RegexUtil.isValid("[0-9a-zA-Z][0-9a-zA-Z]*(([_|.|$|\\-|+|&|*|?|^|{|}|])*[0-9a-zA-Z]*)*[@][0-9a-zA-Z]*[[_|.|$|\\-|+|&|*|?|^|{|}|]w]*[0-9a-zA-Z]+[.]([a-zA-Z]{2,3}|[a-zA-Z]{2,3}[.][a-zA-Z]{2,3}|[a-zA-Z]{2,3}[.][a-zA-Z]{2,3}[.][a-zA-Z]{2,3})$", 
                                    informacionHeredero.getCorreoElectronico())) {
                            if(resultadoValidacion.length() > 0){
                                resultadoValidacion = resultadoValidacion + "\n";
                            } 
                            resultadoValidacion = resultadoValidacion + Constantes.MSJ_CORREO_ELECTRONICO_FORMATO_INVALIDO;
                            
                        }
                        
                        if(   informacionHeredero.getCorreoElectronico().length() < 5
                           || informacionHeredero.getCorreoElectronico().length() > 255){ 
                            if(resultadoValidacion.length() > 0){
                                resultadoValidacion = resultadoValidacion + "\n";
                            } 
                            resultadoValidacion = resultadoValidacion + Constantes.MSJ_CORREO_ELECTRONICO_LONGITUD_INVALIDA;
                        }
                    } 
                }
            }
        }
        
        if(resultadoValidacion.length() > 0)
            resultadoValidacion = resultadoValidacion + "\n";
        
        return resultadoValidacion;
    }   
    
    
    /**
     * Método que valida el formato de los campos que contienen la información del titular de la cuenta bancaria.
     * 
     * <b>Caso de Uso:</b> PT-INGE-014-GOI-OTO-4-FAB-02-RegistrarSolicitudDevoluciónAhorrosHerederos.
     * 
     * @param solicitud
     *            información de la solicitud de devolución de ahorros a herederos.
     * @return String
     *            resultado de la validación. Vacío si aprueba la validación.
     */
    private String validarFormatoCamposCuentaBancaria(TipoSolicitudDevolucionAhorrosHerederos solicitud) throws Exception {
        String resultadoValidacion = "";
        
        if(solicitud != null && solicitud.getInformacionCuentaBancaria() != null){

            if (   solicitud.getInformacionCuentaBancaria().getTitularCuentaEsTercero() != null
                && solicitud.getInformacionCuentaBancaria().getTitularCuentaEsTercero().equals(Constantes.NO)){

                if(   solicitud.getInformacionCuentaBancaria().getIdentificacion() != null
                   && solicitud.getInformacionCuentaBancaria().getIdentificacion().getTipoDocumento() != null
                   && solicitud.getInformacionCuentaBancaria().getIdentificacion().getTipoDocumento().length() > 0){

                    if (!RegexUtil.isValid(Constantes.ER_ALFABETICO_MAYUSCULA, solicitud.getInformacionCuentaBancaria().getIdentificacion().getTipoDocumento())) {
                        if(resultadoValidacion.length() > 0){
                            resultadoValidacion = resultadoValidacion + "\n";
                        } 
                        resultadoValidacion = resultadoValidacion + Constantes.MSJ_TIPO_DOCUMENTO_TITULAR_CUENTA_FORMATO_INVALIDO;

                    }
                    
                    if(solicitud.getInformacionCuentaBancaria().getIdentificacion().getTipoDocumento().length() != 2){ 
                        if(resultadoValidacion.length() > 0){
                            resultadoValidacion = resultadoValidacion + "\n";
                        } 
                        resultadoValidacion = resultadoValidacion + Constantes.MSJ_TIPO_DOCUMENTO_TITULAR_CUENTA_LONGITUD_INVALIDA;
                    }
                }
                
                if(   solicitud.getInformacionCuentaBancaria().getIdentificacion() != null
                   && solicitud.getInformacionCuentaBancaria().getIdentificacion().getNumeroDocumento() != null
                   && solicitud.getInformacionCuentaBancaria().getIdentificacion().getNumeroDocumento().length() > 0){
                
                    if (!RegexUtil.isValid(Constantes.ER_NUMERICO_SIN_CEROS_IZQUIERDA, solicitud.getInformacionCuentaBancaria().getIdentificacion().getNumeroDocumento())) {
                        if(resultadoValidacion.length() > 0){
                            resultadoValidacion = resultadoValidacion + "\n";
                        } 
                        resultadoValidacion = resultadoValidacion + Constantes.MSJ_TIPO_NUMERO_TITULAR_CUENTA_FORMATO_INVALIDO;

                    }

                    if(   solicitud.getInformacionCuentaBancaria().getIdentificacion().getNumeroDocumento().length() < 2
                       || solicitud.getInformacionCuentaBancaria().getIdentificacion().getNumeroDocumento().length() > 11){ 
                        if(resultadoValidacion.length() > 0){
                            resultadoValidacion = resultadoValidacion + "\n";
                        } 
                        resultadoValidacion = resultadoValidacion + Constantes.MSJ_NUMERO_DOCUMENTO_TITULAR_CUENTA_LONGITUD_INVALIDA;
                    }
                }

                if(   solicitud.getInformacionCuentaBancaria().getNombreTitular() != null
                   && solicitud.getInformacionCuentaBancaria().getNombreTitular().length() > 0){
                    
                    if (!RegexUtil.isValid(Constantes.ER_ALFABETICO_SIN_CARACTERES_ESPECIALES, solicitud.getInformacionCuentaBancaria().getNombreTitular())) {
                        if(resultadoValidacion.length() > 0){
                            resultadoValidacion = resultadoValidacion + "\n";
                        } 
                        resultadoValidacion = resultadoValidacion + Constantes.MSJ_NOMBRE_TITULAR_CUENTA_FORMATO_INVALIDO;

                    }

                    if(   solicitud.getInformacionCuentaBancaria().getNombreTitular().length() < 1
                       || solicitud.getInformacionCuentaBancaria().getNombreTitular().length() > 50
                            ){ 
                        if(resultadoValidacion.length() > 0){
                            resultadoValidacion = resultadoValidacion + "\n";
                        } 
                        resultadoValidacion = resultadoValidacion + Constantes.MSJ_NOMBRE_TITULAR_CUENTA_LONGITUD_INVALIDA;
                    }
                }
                
            }
        }
        
        if (resultadoValidacion.length() > 0)
            resultadoValidacion = resultadoValidacion + "\n";
            
        return resultadoValidacion;
    }       
    
    /**
     * Método que valida que, en la lista de herederos siempre exista un registro con valor "S",
     * en el campo "Es representante de Herederos".
     * 
     * <b>Caso de Uso:</b> PT-INGE-014-GOI-OTO-4-FAB-02-RegistrarSolicitudDevoluciónAhorrosHerederos.
     * 
     * @param solicitud
     *            información de la solicitud de devolución de ahorros a herederos.
     * @return String
     *            resultado de la validación. Vacío si aprueba la validación.
     */
    private String validarRepresentanteHerederos(TipoSolicitudDevolucionAhorrosHerederos solicitud) throws Exception {
        String resultadoValidacion = "";
        int contadorRepresentanteHerederos = 0;
        
        if(solicitud != null && solicitud.getInformacionHerederos() != null){
            for (TipoInformacionHeredero informacionHerdero : solicitud.getInformacionHerederos()){
                if(informacionHerdero.getEsRepresentanteHerederos().equals(Constantes.SI)){
                    contadorRepresentanteHerederos ++;
                }
            }
        }
        
        if (contadorRepresentanteHerederos != 1){
            resultadoValidacion = Constantes.MSJ_CANTIDAD_REPRESENTANTE_HEREDEROS + "\n";
        }
        
        return resultadoValidacion;
    }  
    
    /**
     * Método que valida que el número de radicación sea único. 
     * 
     * <b>Caso de Uso:</b> PT-INGE-014-GOI-OTO-4-FAB-02-RegistrarSolicitudDevoluciónAhorrosHerederos.
     * 
     * @param solicitud
     *            información de la solicitud de devolución de ahorros a herederos.
     * @return String
     *            resultado de la validación. Vacío si aprueba la validación.
     */
    private String validarNumeroRadicacion(TipoSolicitudDevolucionAhorrosHerederos solicitud) throws Exception {
        String resultadoValidacion = "";
        String numeroRadicacion = null;
        
        if(solicitud != null && solicitud.getNumeroRadicacion() != null){
            numeroRadicacion = daBeneficios.consultarNumeroRadicacion(solicitud.getNumeroRadicacion());
        }
        
        if (numeroRadicacion != null){
            resultadoValidacion = Constantes.MSJ_NUMERO_RADICACION_NO_UNICO + "\n";
        }
        
        return resultadoValidacion;
    }    
    
    /**
     * Método que valida que los identificadores de los documentos cumplan con la estructura GUID.
     * 
     * <b>Caso de Uso:</b> PT-INGE-014-GOI-OTO-4-FAB-02-RegistrarSolicitudDevoluciónAhorrosHerederos.
     * 
     * @param solicitud
     *            información de la solicitud de devolución de ahorros a herederos.
     * @return String
     *            resultado de la validación. Vacío si aprueba la validación.   
     *      
     */
    private String validarIdentificadorDocumentos(TipoSolicitudDevolucionAhorrosHerederos solicitud) throws Exception {
        String resultadoValidacion = "";
        
        for (TipoDocumento documento : solicitud.getDocumentos().getDocumento()){
            if (!RegexUtil.isValid(Constantes.ER_IDENTIFICADOR_DOCUMENTOS_GUID, documento.getId())) {
                resultadoValidacion = resultadoValidacion + Constantes.MSJ_DOCUMENTO_ID_NO_GUID + "\n";
            }   
        }
        return resultadoValidacion;
    }     
    
    /**
     * Método que valida que en la lista de herederos/terceros existan registros con Tipo de Solicitante igual a 
     * 06: Heredero.
     * 
     * <b>Caso de Uso:</b> PT-INGE-014-GOI-OTO-4-FAB-02-RegistrarSolicitudDevoluciónAhorrosHerederos.
     * 
     * @param solicitud
     *            información de la solicitud de devolución de ahorros a herederos.
     * @return String
     *            resultado de la validación. Vacío si aprueba la validación.
     */
    private String validarExistenciaHerederos(TipoSolicitudDevolucionAhorrosHerederos solicitud) throws Exception {
        String resultadoValidacion = "";
        int contadorHerederos = 0;
        
        if(solicitud != null && solicitud.getInformacionHerederos() != null){
            for (TipoInformacionHeredero informacionHerdero : solicitud.getInformacionHerederos()){
                if(informacionHerdero.getTipoSolicitante().equals(Constantes.COD_TIPO_SOLICITANTE_HEREDERO)){
                    contadorHerederos ++;
                }
            }
        }
        
        if (contadorHerederos <= 0){
            resultadoValidacion = Constantes.MSJ_NO_SE_REGISTRARON_HEREDEROS;
        }
        
        return resultadoValidacion;
    } 

    /**
     * Método que cuenta la cantidad de terceros autorizados recibidos en la lista de herederos. 
     * 
     * <b>Caso de Uso:</b> PT-INGE-014-GOI-OTO-4-FAB-02-RegistrarSolicitudDevoluciónAhorrosHerederos.
     * 
     * @param int
     *          cantidad de terceros autorizados encontrados dentro del listado de herederos.
     */
    private int contarTercerosAutorizados(TipoSolicitudDevolucionAhorrosHerederos solicitud) throws Exception {
        int cantidadtercerosAutorizados = 0;
        
        if(solicitud != null && solicitud.getInformacionHerederos() != null){
            for (TipoInformacionHeredero informacionHerdero : solicitud.getInformacionHerederos()){
                if(informacionHerdero.getTipoSolicitante().equals(Constantes.COD_TIPO_SOLICITANTE_TERCERO_AUTORIZADO) ||
                   informacionHerdero.getTipoSolicitante().equals(Constantes.COD_TIPO_SOLICITANTE_CURADOR) ||
                   informacionHerdero.getTipoSolicitante().equals(Constantes.COD_TIPO_SOLICITANTE_APODERADO) ){
                    cantidadtercerosAutorizados ++;
                }
            }
        }
        return cantidadtercerosAutorizados;
    } 
    
    /**
     * Método que valida si el vinculado recibido en la solicitud está fallecido. 
     * 
     * <b>Caso de Uso:</b> PT-INGE-014-GOI-OTO-4-FAB-02-RegistrarSolicitudDevoluciónAhorrosHerederos.
     * 
     * @param solicitud
     *            información de la solicitud de devolución de ahorros a herederos.
     * @return String
     *            resultado de la validación. Vacío si aprueba la validación.
     */
    private String validarVinculadoFallecido(TipoSolicitudDevolucionAhorrosHerederos solicitud) throws Exception {
        String resultadoValidacion = "";
        Long idVinculadoFallecido = null;
        
        TipoDocumentoPersonaNatural documentoVinculado = new TipoDocumentoPersonaNatural();
        documentoVinculado.setTipoDocumento(solicitud.getInformacionVinculado().getIdentificacion().getTipoDocumento());
        documentoVinculado.setNumeroDocumento(solicitud.getInformacionVinculado().getIdentificacion().getNumeroDocumento());
        
        InformacionVinculadoEstadosDTO informacionVinculado  = daBeneficios.consultarExistenciaVinculado(documentoVinculado);

        if (informacionVinculado != null 
            && informacionVinculado.getEstadoVinculado() != null
            && informacionVinculado.getDetalleEstadoVinculado() != null){
            if( ( informacionVinculado.getEstadoVinculado().equals(Constantes.COD_ESTADO_VINCULADO_SUSPENDIDO) &&
                  informacionVinculado.getDetalleEstadoVinculado().equals(Constantes.COD_DETALLE_ESTADO_VINCULADO_SUSPENDIDO)) ||
                ( informacionVinculado.getEstadoVinculado().equals(Constantes.COD_ESTADO_VINCULADO_RETIRADO) &&
                  informacionVinculado.getDetalleEstadoVinculado().equals(Constantes.COD_DETALLE_ESTADO_VINCULADO_RETIRADO))){
                
                idVinculadoFallecido = informacionVinculado.getIdentificadorVinculado();
            }
        }
        
        if (idVinculadoFallecido == null) {
            resultadoValidacion = Constantes.MSJ_VINCULADO_NO_FALLECIDO;
        }
        return resultadoValidacion;
    } 
    
    
    /**
     * Método que valida si en el Sistema de Gestión BEPS, el vinculado fallecido tiene una solicitud por 
     * devolución de ahorros a herederos aprobada por el gerente o en gestión del gerente 
     * 
     * <b>Caso de Uso:</b> PT-INGE-014-GOI-OTO-4-FAB-02-RegistrarSolicitudDevoluciónAhorrosHerederos.
     * 
     * @param solicitud
     *            información de la solicitud de devolución de ahorros a herederos.
     * @return String
     *            resultado de la validación. Vacío si aprueba la validación.  
     */
    private String validarExistenciaSolicitudDevolucionAhorrosHeredero(TipoSolicitudDevolucionAhorrosHerederos solicitud) throws Exception {
        String resultadoValidacion = "";
        String idSolicitudDevolucionAhorrosHeredero = null;
        
        TipoDocumentoPersonaNatural documentoVinculado = new TipoDocumentoPersonaNatural();
        documentoVinculado.setTipoDocumento(solicitud.getInformacionVinculado().getIdentificacion().getTipoDocumento());
        documentoVinculado.setNumeroDocumento(solicitud.getInformacionVinculado().getIdentificacion().getNumeroDocumento());
        
        InformacionVinculadoEstadosDTO informacionVinculado = daBeneficios.consultarExistenciaVinculado(documentoVinculado);
        
        if (informacionVinculado != null){
            idSolicitudDevolucionAhorrosHeredero = daBeneficios.consultarSolicitudDevolucionAhorrosHerederos(informacionVinculado.getIdentificadorVinculado());
        }

        if (idSolicitudDevolucionAhorrosHeredero != null) {
            resultadoValidacion = Constantes.MSJ_EXISTE_SOLICITUD_DEVOLUCION_HEREDEROS;
        }
        return resultadoValidacion;
    } 

}