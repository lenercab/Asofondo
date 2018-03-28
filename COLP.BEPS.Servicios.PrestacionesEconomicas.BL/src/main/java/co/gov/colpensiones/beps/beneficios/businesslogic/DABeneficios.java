package co.gov.colpensiones.beps.beneficios.businesslogic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import co.gov.colpensiones.beps.beneficios.businesslogic.actualizar.ValidacionAutomaticaDTO;
import co.gov.colpensiones.beps.comunes.dto.InformacionVinculadoEstadosDTO;
import co.gov.colpensiones.beps.comunes.enumeraciones.DetalleEstadoVinculadoEnum;
import co.gov.colpensiones.beps.comunes.enumeraciones.TipoConexionBaseDatosEnum;
import co.gov.colpensiones.beps.comunes.utilidades.Constantes;
import co.gov.colpensiones.beps.comunes.utilidades.ConstantesEstados;
import co.gov.colpensiones.beps.comunes.utilidades.ConstantesLoggerServicios;
import co.gov.colpensiones.beps.comunes.utilidades.DatabaseManager;
import co.gov.colpensiones.beps.comunes.utilidades.Util;
import co.gov.colpensiones.beps.dal.utilidades.CommandType;
import co.gov.colpensiones.beps.dal.utilidades.DataRow;
import co.gov.colpensiones.beps.dal.utilidades.DataStoredProcedure;
import co.gov.colpensiones.beps.dal.utilidades.DataTable;
import co.gov.colpensiones.beps.dal.utilidades.DbCommand;
import co.gov.colpensiones.beps.dal.utilidades.DbParameter;
import co.gov.colpensiones.beps.dal.utilidades.DbType;
import co.gov.colpensiones.beps.excepciones.DataAccessException;
import co.gov.colpensiones.beps.schemas._1_0.comun.TipoDocumento;
import co.gov.colpensiones.beps.schemas._1_0.comun.TipoDocumentos;
import co.gov.colpensiones.beps.schemas._1_0.comun.TipoInformacionContexto;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoDocumentoPersonaNatural;
import co.gov.colpensiones.beps.schemas._1_0.prestacioneseconomicas.TipoDestinacionRecursos;
import co.gov.colpensiones.beps.schemas._1_0.prestacioneseconomicas.TipoDestinacionesRecursos;
import co.gov.colpensiones.beps.schemas._1_0.prestacioneseconomicas.TipoInformacionHeredero;
import co.gov.colpensiones.beps.schemas._1_0.prestacioneseconomicas.TipoInformacionTercero;
import co.gov.colpensiones.beps.schemas._1_0.prestacioneseconomicas.TipoInformacionVinculadoSolicitud;
import co.gov.colpensiones.beps.schemas._1_0.prestacioneseconomicas.TipoSolicitudDestinacionRecursos;
import co.gov.colpensiones.beps.schemas._1_0.prestacioneseconomicas.TipoSolicitudDevolucionAhorrosHerederos;

/**
 * <b>Descripcion:</b> Clase encargada de realizar las operaciones relacionadas con BD. <br/>
 * <b>Caso de Uso:</b> BEPS - <br/>
 * 
 * @author Cristian Alexander Salazar Perdomo <csalazar@heinsohn.com.co>
 * @author Arnold Rios Delgado <arrios@heinsohn.com.co>
 */
public class DABeneficios {

    /** Atributo que mantiene la instancia de DatabaseManager a utilizar durante la transacción. */
    private DatabaseManager database;

    /** Constante para el nombre de la consulta consultar vinculado. */
    private static final String PR_CONSULTAR_VINCULADO = "PR_ConsultarVinculado";
    
    /** Constante para el caracter @ */
    private static final String CARACTER_ARROBA = "@";

    /**
     * Constructor de la clase.
     */
    public DABeneficios() {
    }

    /**
     * Método que asigna un database Manager específico a la variable global. Utilizado para el manejo de la transacciones en múltiples
     * procesos de inserción o actualización.
     * 
     * @param dbManager
     */
    public void inicializarDatabaseManager(DatabaseManager dbManager) {
        this.database = dbManager;
    }

    /**
     * Método que permite realizar consultas sobre una tabla paramétrica.
     * 
     * @param codigo
     *            Código a consultar en la BD.
     * @param consulta
     *            Contiene el nombre de la consulta a realizar.
     * @param campo
     *            Referencia al campo en la BD que se utilizará en la consulta.
     * @return String Cadena que contiene el código consultado en caso de existir, de lo contrario es null.
     * @throws DataAccessException
     */
    public String consultarDatoParametrica(String codigo, String consulta, String campo) throws DataAccessException {
        String pkVinculado = null;
        DbCommand command = null;

        try {
            DatabaseManager database = new DatabaseManager(TipoConexionBaseDatosEnum.SQL_SERVER);
            command = database.GetXmlCommand(consulta);
            command.setCommandType(CommandType.Text);
            database.AddInXmlParameter(command, CARACTER_ARROBA + campo, codigo);

            DataTable data = database.ExecuteDataTableCommandText(command);
            if (data.getRows().size() > 0) {
                pkVinculado = data.getRows().get(0).getValue(campo).toString();
            }

        } catch (Exception e) {
            HashMap<String, String> metaData = new HashMap<String, String>();
            metaData.put(ConstantesLoggerServicios.METADATA_CODIGO_CONSULTA, codigo);
            metaData.put(ConstantesLoggerServicios.METADATA_CONSULTA, consulta);
            throw new DataAccessException(null, metaData, e);
        }
        return pkVinculado;
    }

    /**
     * Método que permite realizar consulta del código de AFP de acuerdo a su descripción.
     * 
     * @param descripcionAFP
     *            Descripción de la AFP de la cual se consulta el código.
     * @return String Cadena que contiene el código consultado en caso de existir, de lo contrario es null.
     * @throws DataAccessException
     */
    public String consultarCodigoAFP(String descripcionAFP) throws DataAccessException {
        String codigoAfp = null;
        DbCommand command = null;

        try {
            DatabaseManager database = new DatabaseManager(TipoConexionBaseDatosEnum.SQL_SERVER);
            command = database.GetXmlCommand("PR_ConsultaCodigoAfp");
            command.setCommandType(CommandType.Text);
            database.AddInXmlParameter(command, "@vaf_nombre_afp", descripcionAFP);

            DataTable data = database.ExecuteDataTableCommandText(command);
            if (data.getRows().size() > 0) {
                codigoAfp = data.getRows().get(0).getValue("vaf_pk_codigo").toString();
            }

        } catch (Exception e) {
            HashMap<String, String> metaData = new HashMap<String, String>();
            metaData.put(ConstantesLoggerServicios.METADATA_CONSULTA, "PR_ActualizarEtapaSolicitud");
            metaData.put(ConstantesLoggerServicios.METADATA_NOMBRE_AFP, descripcionAFP);
            throw new DataAccessException(null, metaData, e);
        }
        return codigoAfp;
    }

    /**
     * Método para consulta de existencia de un vinculado.
     * 
     * @param informacionVinculado
     *            Información de identificación del vinculado
     * @return Long identificador del vinculado en BD.
     */
    public InformacionVinculadoEstadosDTO consultarExistenciaVinculado(TipoDocumentoPersonaNatural informacionVinculado)
            throws DataAccessException {
        DbCommand command = null;

        InformacionVinculadoEstadosDTO infoVinculado = new InformacionVinculadoEstadosDTO();

        try {
            DatabaseManager database = new DatabaseManager(TipoConexionBaseDatosEnum.SQL_SERVER);
            command = database.GetXmlCommand(PR_CONSULTAR_VINCULADO);
            command.setCommandType(CommandType.Text);
            database.AddInXmlParameter(command, Constantes.VINC_PERSONA_VPE_TIPO_DOCUMENTO, informacionVinculado.getTipoDocumento());
            database.AddInXmlParameter(command, "@vpe_numero_documento", informacionVinculado.getNumeroDocumento());

            DataTable data = database.ExecuteDataTableCommandText(command);
            if (data.getRows().size() > 0) {
                infoVinculado.setIdentificadorVinculado((Long) data.getRows().get(0).getValue("vpe_pk_id"));
                infoVinculado.setEstadoVinculado((String) data.getRows().get(0).getValue("vvi_estado_vinculado"));
                infoVinculado.setDetalleEstadoVinculado((String) data.getRows().get(0).getValue("vvi_detalle_estado_vinculado"));
            }

        } catch (Exception e) {
            HashMap<String, String> metaData = new HashMap<String, String>();
            metaData.put(ConstantesLoggerServicios.METADATA_TIPO_DOCUMENTO, informacionVinculado.getTipoDocumento());
            metaData.put(ConstantesLoggerServicios.METADATA_NUM_DOCUMENTO, informacionVinculado.getNumeroDocumento());
            throw new DataAccessException(null, metaData, e);
        }
        return infoVinculado;
    }

    /**
     * Método para consultar el número de radicado padre de una solicitud.
     * 
     * @param numeroRadicacionPadre
     *            String con el número de radicación
     * @throws DataAccessException
     *             Posible excepción al realizar la consulta.
     */
    public String consultarNumeroRadicacionPadre(String numeroRadicacionPadre) throws DataAccessException {
        String pkSolicitudPadre = null;
        DbCommand command = null;

        try {
            DatabaseManager database = new DatabaseManager(TipoConexionBaseDatosEnum.SQL_SERVER);
            command = database.GetXmlCommand("PR_ConsultarNumRadicacionPadre");
            command.setCommandType(CommandType.Text);
            database.AddInXmlParameter(command, "@osd_numero_radicado_padre", numeroRadicacionPadre);

            DataTable data = database.ExecuteDataTableCommandText(command);
            if (data.getRows().size() > 0) {
                pkSolicitudPadre = data.getRows().get(0).getValue("osd_pk_id").toString();
            }

        } catch (Exception e) {
            HashMap<String, String> metaData = new HashMap<String, String>();
            metaData.put(ConstantesLoggerServicios.METADATA_NUM_RADICADO_PADRE, numeroRadicacionPadre);
            throw new DataAccessException(null, metaData, e);
        }
        return pkSolicitudPadre;
    }

    /**
     * Método que permite realizar el llamado al procedimiento almacenado que crea la solicitud de destinación.
     * 
     * @param solicitud
     *            Información de la solicitud de destinación de recursos.
     * @param idVinculado
     *            ID del vinculado que realiza la solicitud.
     * @param esPrimeraVez
     *            Indica si la solicitud se crea por primera vez.
     * @throws DataAccessException
     *             Excepción al crear la solicitud.
     */
    public Long crearSolicitudDestinacion(TipoSolicitudDestinacionRecursos solicitud, Long idVinculado, Boolean esPrimeraVez)
            throws DataAccessException {

        Long idSolicitud = null;
        try {

            DbCommand command = null;

            command = database.GetXmlCommand("StoredProcedure_crearSolicitudDestinacion");
            command.setCommandType(CommandType.StoredProcedure);

            /* parametros que ingresan al SP */
            database.AddInXmlParameter(command, "@idVinculado", idVinculado);
            database.AddInXmlParameter(command, "@fechaRegistroFirma", Util.obtenerFechaString(solicitud.getFechaRegistro()));
            database.AddInXmlParameter(command, "@fechaConstanciaEjecutora",
                    Util.obtenerFechaString(solicitud.getFechaConstanciaEjecutoria()));
            database.AddInXmlParameter(command, "@fechaRegistro", new java.sql.Timestamp(new Date().getTime()));
            database.AddInXmlParameter(command, "@trasladoSGPBEPS", Constantes.SI.equals(solicitud.getTrasladoSGPaBEPS()) ? 1 : 0);
            database.AddInXmlParameter(command, "@tipoSolicitud", solicitud.getTipoSolicitud());
            database.AddInXmlParameter(command, "@usuarioRegistroSistema", solicitud.getUsuarioSistemaRadicacion());
            database.AddInXmlParameter(command, "@numeroRadicacion", solicitud.getNumeroRadicacion());
            database.AddInXmlParameter(command, "@numeroRadicacionPadre", solicitud.getNumeroRadicacionPadre());
            database.AddInXmlParameter(command, "@canalRadicacionSolicitud", solicitud.getCodigoCanalRadicacion());
            database.AddInXmlParameter(command, "@usuarioAnalista", solicitud.getUsuarioAnalista());
            database.AddInXmlParameter(command, "@usuarioRevisor", solicitud.getUsuarioRevisor());
            database.AddInXmlParameter(command, "@esPrimeraVez", esPrimeraVez ? 1 : 0);

            /* parámetros que salen del SP */
            database.AddOutParameter(command, "@idSolicitud", DbType.BIGINT, 8);

            DataStoredProcedure data = database.executeListResultSet(command);

            List<DbParameter> lista = data.getParametrosSalida();

            idSolicitud = (Long) lista.get(0).getParameterValue();

        } catch (Exception e) {
            HashMap<String, String> metaData = new HashMap<String, String>();
            metaData.put(ConstantesLoggerServicios.METADATA_NUM_RADICADO, solicitud.getNumeroRadicacion());
            metaData.put(ConstantesLoggerServicios.METADATA_TIPO_DOCUMENTO, solicitud.getInformacionVinculado().getIdentificacion()
                    .getTipoDocumento());
            metaData.put(ConstantesLoggerServicios.METADATA_NUM_DOCUMENTO, solicitud.getInformacionVinculado().getIdentificacion()
                    .getTipoDocumento());
            throw new DataAccessException(null, metaData, e);
        }

        return idSolicitud;
    }

    /**
     * Método que permite actualizar la información del vinculado que realiza la solicitud por primera vez.
     * 
     * @param idVinculado
     *            id del vinculado que realiza la solicitud.
     * @param informacionContexto
     *            INformación del contexto para la ejecución del ws.
     * @param informacionVinculado
     *            información del vinculado.
     * @throws DataAccessException
     *             Excepción generada al realizar la actualización.
     */
    public int actualizarDatosVinculadoPrimeraVez(TipoInformacionContexto informacionContexto,
            TipoInformacionVinculadoSolicitud infoVinculado, Long idVinculado) throws DataAccessException {

        DbCommand commandPersona = null;
        DbCommand commandVinculado = null;
        DataStoredProcedure data = null;

        try {

            commandPersona = database.GetXmlCommand(Constantes.PR_ACTUALIZAR_VINCULADO_PERSONA);
            commandPersona.setCommandType(CommandType.Text);
            database.AddInXmlParameter(commandPersona, Constantes.VINC_PERSONA_VPE_DEPARTAMENTO_NACIMIENTO, infoVinculado.getDepartamentoNacimiento().getCodigo());
            database.AddInXmlParameter(commandPersona, Constantes.VINC_PERSONA_VPE_MUNICIPIO_NACIMIENTO, infoVinculado.getMunicipioNacimiento().getCodigo());
            database.AddInXmlParameter(commandPersona, Constantes.VINC_PERSONA_VPE_USUARIO_ULTIMO_CAMBIO, informacionContexto.getUsuarioSistemaExterno());
            database.AddInXmlParameter(commandPersona, Constantes.VINC_PERSONA_VPE_NUMERO_RADICADO, informacionContexto.getIdCorrelacion());
            database.AddInXmlParameter(commandPersona, Constantes.VINC_PERSONA_VPE_CANAL_SISTEMA, informacionContexto.getSistemaOrigen());
            database.AddInXmlParameter(commandPersona, Constantes.VINC_PERSONA_VPE_TIPO_DOCUMENTO, infoVinculado.getIdentificacion().getTipoDocumento());
            database.AddInXmlParameter(commandPersona, Constantes.VINC_PERSONA_VPE_NUMERO_DOCUMENTO, infoVinculado.getIdentificacion().getNumeroDocumento());

            database.executeNonQuery(commandPersona);

            commandVinculado = database.GetXmlCommand(Constantes.SP_OTORGAMIENTO_ACTUALIZA_DATOS_VINCULADO_INICIAL);
            commandVinculado.setCommandType(CommandType.StoredProcedure);

            database.AddInXmlParameter(commandVinculado, Constantes.VINC_VINCULADO_VVI_AUTORIZACION_MANEJO_INFO,
                    Constantes.SI.equals(infoVinculado.getAutorizacionManejoInformacion()) ? 1 : 0);
            database.AddInXmlParameter(commandVinculado, Constantes.VINC_VINCULADO_VVI_AUTORIZACION_ENVIO_INFO,
                    Constantes.SI.equals(infoVinculado.getAutorizacionEnvioComunicacion()) ? 1 : 0);
            database.AddInXmlParameter(commandVinculado, Constantes.VINC_VINCULADO_VVI_AUTORIZA_COLOMBIA_MAYOR,
                    Constantes.SI.equals(infoVinculado.getAutorizaTerminosColombiaMayor()) ? 1 : 0);
            database.AddInXmlParameter(commandVinculado, Constantes.VINC_VINCULADO_VVI_AFP, infoVinculado.getCodigoAFP());
            database.AddInXmlParameter(commandVinculado, Constantes.VINC_VINCULADO_VVI_USUARIO_ULTIMO_CAMBIO, informacionContexto.getUsuarioSistemaExterno());
            database.AddInXmlParameter(commandVinculado, Constantes.VINC_VINCULADO_VVI_NUMERO_RADICADO, informacionContexto.getIdCorrelacion());
            database.AddInXmlParameter(commandVinculado, Constantes.VINC_VINCULADO_VVI_CANAL_SISTEMA, informacionContexto.getSistemaOrigen());
            database.AddInXmlParameter(commandVinculado, Constantes.VINC_VINCULADO_VVI_ESTADO_VINCULADO, ConstantesEstados.ESTADO_ACTIVO);
            database.AddInXmlParameter(commandVinculado, Constantes.VINC_VINCULADO_VVI_DETALLE_ESTADO_VINCULADO, DetalleEstadoVinculadoEnum.A01.toString());
            database.AddInXmlParameter(commandVinculado, Constantes.VINC_VINCULADO_VVI_PK_ID, idVinculado);
            database.AddOutParameter(commandVinculado, Constantes.INDICADOR_RETORNO, DbType.INTEGER, Constantes.UNO);
            data = database.executeGenericStoredProcedure(commandVinculado);

            return Integer.parseInt(data.getParametrosSalida().get(Constantes.CERO).getParameterValue().toString());

        } catch (Exception e) {
            HashMap<String, String> metaData = new HashMap<String, String>();
            metaData.put(ConstantesLoggerServicios.METADATA_TIPO_DOCUMENTO, infoVinculado.getIdentificacion().getTipoDocumento());
            metaData.put(ConstantesLoggerServicios.METADATA_NUM_DOCUMENTO, infoVinculado.getIdentificacion().getNumeroDocumento());
            throw new DataAccessException(null, metaData, e);
        }
    }

    /**
     * Método que permite actualizar la información del vinculado que realiza la solicitud por reconsideración.
     * 
     * @param informacionContexto
     *            INformación del contexto para la ejecución del ws.
     * @param informacionVinculado
     *            información del vinculado.
     * @param idVinculado
     *            id del vinculado que realiza la solicitud.
     * @throws DataAccessException
     *             Excepción generada al realizar la actualización.
     */
    public void actualizarDatosVinculadoReconsideracion(TipoInformacionContexto informacionContexto,
            TipoInformacionVinculadoSolicitud infoVinculado, Long idVinculado) throws DataAccessException {

        DbCommand commandVinculado = null;

        try {
            commandVinculado = database.GetXmlCommand("PR_ActualizarDatosVinculadoReconsideracion");
            commandVinculado.setCommandType(CommandType.Text);

            database.AddInXmlParameter(commandVinculado, "@vvi_autorizacion_manejo_info",
                    Util.convertirStringBit(infoVinculado.getAutorizacionManejoInformacion()));
            database.AddInXmlParameter(commandVinculado, "@vvi_autorizacion_envio_info",
                    Util.convertirStringBit(infoVinculado.getAutorizacionEnvioComunicacion()));
            database.AddInXmlParameter(commandVinculado, "@vvi_usuario_ultimo_cambio", informacionContexto.getUsuarioSistemaExterno());
            database.AddInXmlParameter(commandVinculado, "@vvi_numero_radicado", informacionContexto.getIdCorrelacion());
            database.AddInXmlParameter(commandVinculado, "@vvi_canal_sistema", informacionContexto.getSistemaOrigen());
            database.AddInXmlParameter(commandVinculado, "@detalleEstadoVinculado", DetalleEstadoVinculadoEnum.A01.toString());
            database.AddInXmlParameter(commandVinculado, "@vvi_pk_id", idVinculado);

            database.executeNonQuery(commandVinculado);

        } catch (Exception e) {
            HashMap<String, String> metaData = new HashMap<String, String>();
            metaData.put(ConstantesLoggerServicios.METADATA_TIPO_DOCUMENTO, infoVinculado.getIdentificacion().getTipoDocumento());
            metaData.put(ConstantesLoggerServicios.METADATA_NUM_DOCUMENTO, infoVinculado.getIdentificacion().getNumeroDocumento());
            throw new DataAccessException(null, metaData, e);
        }
    }

    /**
     * Método que permite realizar el registro de las destinaciones.
     * 
     * @param idSolicitud
     *            Id de la solicitud registrada.
     * @param destinacionesRecursos
     *            Destinaciones para los recursos.
     * @throws DataAccessException
     *             Excepción generada al almacenar la información.
     */
    public void registrarDestinaciones(Long idSolicitud, TipoDestinacionesRecursos destinacionesRecursos) throws DataAccessException {

        DbCommand command = null;

        try {
            command = database.GetXmlCommand("PR_RegistrarDestinaciones");
            command.setCommandType(CommandType.Text);

            for (TipoDestinacionRecursos destinacion : destinacionesRecursos.getDestinacion()) {

                database.AddInXmlParameter(command, "@codTipo", destinacion.getCodigoTipo());
                database.AddInXmlParameter(command, "@porcentaje", destinacion.getPorcentaje());
                database.AddInXmlParameter(command, "@idSolicitud", idSolicitud);

            }
            database.executeBach(command, 3);

        } catch (Exception e) {
            HashMap<String, String> metaData = new HashMap<String, String>();
            metaData.put(ConstantesLoggerServicios.METADATA_IDENTIFICADOR_SOLICITUD, idSolicitud.toString());
            throw new DataAccessException(null, metaData, e);
        }

    }

    /**
     * Método que permite almacenar los documentos asociados a la solicitud.
     * 
     * @param idSolicitud
     *            Id de la solicitud registrada.
     * @param documentos
     *            Documentos asociados a la solicitud.
     * @throws DataAccessException
     *             Excepción generada al almacenar la información.
     */
    public void registrarDocumentos(Long idSolicitud, TipoDocumentos documentos) throws DataAccessException {

        DbCommand commandTransDoc = null;

        DatabaseManager database2 = new DatabaseManager(database.getConn());

        DbCommand commandDocSol = null;

        try {
            commandTransDoc = database.GetXmlCommand("PR_RegistrarDocumentos");
            commandTransDoc.setCommandType(CommandType.Text);

            commandDocSol = database2.GetXmlCommand("PR_RegistrarDocumentosSolicitud");
            commandDocSol.setCommandType(CommandType.Text);

            for (TipoDocumento documento : documentos.getDocumento()) {

                database.AddInXmlParameter(commandTransDoc, "@idGestor", documento.getId());
                database.AddInXmlParameter(commandTransDoc, "@codTipoDoc", documento.getCodigoTipoDocumental());

                List<Object> ids = (ArrayList<Object>) database.executeInsertQuery(commandTransDoc, 1);

                commandTransDoc.clearParameter();

                Object[] id = (Object[]) ids.get(0);

                Long idDocumento = ((BigDecimal) id[0]).longValue();

                database2.AddInXmlParameter(commandDocSol, "@idSolicitud", idSolicitud);
                database2.AddInXmlParameter(commandDocSol, "@idDocumento", idDocumento);
            }
            database2.executeBach(commandDocSol, 2);

        } catch (Exception e) {
            HashMap<String, String> metaData = new HashMap<String, String>();
            metaData.put(ConstantesLoggerServicios.METADATA_IDENTIFICADOR_SOLICITUD, idSolicitud.toString());
            throw new DataAccessException(null, metaData, e);
        }
    }

    /**
     * Método que permite registrar la información del tercero asociado a la solicitud.
     * 
     * @param idSolicitud
     *            Id de solicitud registrada
     * @param informacionTercero
     *            Información del tercero
     * @throws DataAccessException
     *             Excepción generada al almacenar la información.
     */
    public void registrarInformacionTercero(Long idSolicitud, TipoInformacionTercero informacionTercero) throws DataAccessException {

        DbCommand command = null;

        try {
            command = database.GetXmlCommand("PR_RegistrarInfoTercero");
            command.setCommandType(CommandType.Text);

            database.AddInXmlParameter(command, "@tipoDocumento", informacionTercero.getIdentificacion().getTipoDocumento());
            database.AddInXmlParameter(command, "@numeroDocumento", informacionTercero.getIdentificacion().getNumeroDocumento());
            database.AddInXmlParameter(command, "@primerNombre", informacionTercero.getNombres().getPrimerNombre());
            database.AddInXmlParameter(command, "@segundoNombre", informacionTercero.getNombres().getSegundoNombre());
            database.AddInXmlParameter(command, "@primerApellido", informacionTercero.getNombres().getPrimerApellido());
            database.AddInXmlParameter(command, "@segundoApellido", informacionTercero.getNombres().getSegundoApellido());
            database.AddInXmlParameter(command, "@tipoTercero", informacionTercero.getTipoTercero());
            database.AddInXmlParameter(command, "@numTarjetaProfesional", informacionTercero.getNumeroTarjetaProfesional());
            database.AddInXmlParameter(command, "@autoEnvioInfo",
                    Constantes.SI.equals(informacionTercero.getInformacionAutorizacion().getAutorizacionEnvioComunicacion()) ? 1 : 0);
            database.AddInXmlParameter(command, "@autoUsoInfo",
                    Constantes.SI.equals(informacionTercero.getInformacionAutorizacion().getAutorizacionManejoInformacion()) ? 1 : 0);
            database.AddInXmlParameter(command, "@idSolicitud", idSolicitud);

            database.executeInsertQuery(command, 1);

        } catch (Exception e) {
            HashMap<String, String> metaData = new HashMap<String, String>();
            metaData.put(ConstantesLoggerServicios.METADATA_IDENTIFICADOR_SOLICITUD, idSolicitud.toString());
            throw new DataAccessException(null, metaData, e);
        }
    }

    /**
     * Método para consultar el valor asignado a un parámetro específico, correspondiente a los parámetros generales de Otorgamiento.
     * 
     * @param nombreParametro
     * @return valor correspondiente al parámetro ingresado
     * @throws DataAccessException
     */
    public String consultarParametroOtorgamiento(String nombreParametro) throws DataAccessException {
        DbCommand command = null;
        String valorParametro = null;
        try {
            database = new DatabaseManager(TipoConexionBaseDatosEnum.SQL_SERVER);
            command = database.GetXmlCommand("PR_ConsultarParametroOtorgamiento");
            command.setCommandType(CommandType.Text);
            database.AddInXmlParameter(command, "@nombreParametro", nombreParametro);

            /* Se ejecuta el query de consulta */
            DataTable data = database.ExecuteDataTable(command);
            if (data != null && data.getRows().size() > 0) {
                valorParametro = data.getRows().get(0).getValue("opg_valor").toString();
            }

        } catch (Exception e) {
            HashMap<String, String> metaData = new HashMap<String, String>();
            metaData.put(ConstantesLoggerServicios.METADATA_CONSULTA, "PR_ConsultarParametroOtorgamiento");
            metaData.put(ConstantesLoggerServicios.METADATA_PARAMETRO, nombreParametro);
            throw new DataAccessException(null, metaData, e);
        }
        return valorParametro;
    }

    /**
     * Método que consulta la información a validar para un vinculado que radicó una solicitud de destinación de recursos.
     * 
     * @param idSolicitud
     *            Identificador de la solicitud
     * @return datosValidacionVinculado Mapa con la información a validar del vinculado
     * @throws DataAccessException
     */
    public Map<String, String> consultarVinculadoSolicitud(String idSolicitud) throws DataAccessException {
        Map<String, String> datosValidacionVinculado = new TreeMap<String, String>();
        DbCommand command = null;

        try {
            DatabaseManager database = new DatabaseManager(TipoConexionBaseDatosEnum.SQL_SERVER);
            command = database.GetXmlCommand("PR_ConsultarVinculadoSolicitud");
            command.setCommandType(CommandType.Text);
            database.AddInXmlParameter(command, "@idSolicitud", idSolicitud);

            DataTable data = database.ExecuteDataTableCommandText(command);

            /* Se mapea la información del vinculado asociado a la solicitud */
            if (data.getRows().size() > 0) {
                datosValidacionVinculado.put("tipoDocumento", Util.dataObjectToString(data, 0, "vpe_tipo_documento"));
                datosValidacionVinculado.put("numeroDocumento", Util.dataObjectToString(data, 0, "vpe_numero_documento"));
                datosValidacionVinculado.put("fechaCorte", Util.dataObjectToString(data, 0, "vvi_fecha_corte_actualizacion"));
                datosValidacionVinculado.put("fechaNacimiento", Util.dataObjectToString(data, 0, "vpe_fecha_nacimiento"));
                datosValidacionVinculado.put("genero", Util.dataObjectToString(data, 0, "vpe_sexo"));
                datosValidacionVinculado.put("estadoVinculado", Util.dataObjectToString(data, 0, "vvi_estado_vinculado"));
                datosValidacionVinculado.put("detalleEstadoVinculado", Util.dataObjectToString(data, 0, "vvi_detalle_estado_vinculado"));
                datosValidacionVinculado.put("primerApellido", Util.dataObjectToString(data, 0, "vpe_primer_apellido"));
                datosValidacionVinculado.put("segundoApellido", Util.dataObjectToString(data, 0, "vpe_segundo_apellido"));
                datosValidacionVinculado.put("primerNombre", Util.dataObjectToString(data, 0, "vpe_primer_nombre"));
                datosValidacionVinculado.put("segundoNombre", Util.dataObjectToString(data, 0, "vpe_segundo_nombre"));
            }

        } catch (Exception e) {
            HashMap<String, String> metaData = new HashMap<String, String>();
            metaData.put(ConstantesLoggerServicios.METADATA_CONSULTA, "PR_ConsultarVinculadoSolicitud");
            metaData.put(ConstantesLoggerServicios.METADATA_IDENTIFICADOR_SOLICITUD, idSolicitud);
            throw new DataAccessException(null, metaData, e);
        }
        return datosValidacionVinculado;
    }

    /**
     * Método que consulta el listado de destinaciones asociadas a una solicitud.
     * 
     * @param idSolicitud
     * @return
     * @throws DataAccessException
     */
    public DataTable consultarDestinacionSolicitud(String idSolicitud) throws DataAccessException {
        DataTable data = new DataTable();
        DbCommand command = null;

        try {
            DatabaseManager database = new DatabaseManager(TipoConexionBaseDatosEnum.SQL_SERVER);
            command = database.GetXmlCommand("PR_ConsultarDestinacionSolicitud");
            command.setCommandType(CommandType.Text);
            database.AddInXmlParameter(command, "@idSolicitud", idSolicitud);
            data = database.ExecuteDataTableCommandText(command);

        } catch (Exception e) {
            HashMap<String, String> metaData = new HashMap<String, String>();
            metaData.put(ConstantesLoggerServicios.METADATA_CONSULTA, "PR_ConsultarDestinacionSolicitud");
            metaData.put(ConstantesLoggerServicios.METADATA_IDENTIFICADOR_SOLICITUD, idSolicitud);
            throw new DataAccessException(null, metaData, e);
        }
        return data;
    }

    /**
     * Método que inserta un registro asociado al proceso de validaciones automáticas de una solicitud.
     * 
     * @param validacion
     *            DTO que contiene la información del registro a ingresar
     * @param idSolicitud
     * @throws DataAccessException
     */
    public void crearRegistroValidacionSolicitud(ValidacionAutomaticaDTO validacion, String idSolicitud) throws DataAccessException {
        DbCommand command = null;
        try {
            command = database.GetXmlCommand("PR_RegistrarValidacionSolicitud");
            command.setCommandType(CommandType.Text);
            database.AddInXmlParameter(command, "@idSolicitud", idSolicitud);
            database.AddInXmlParameter(command, "@estadoFallecido", validacion.getEstadoFallecido());
            database.AddInXmlParameter(command, "@fechaCorte", validacion.getFechaCorte());
            database.AddInXmlParameter(command, "@edadGenero", validacion.getEdadGenero());
            database.AddInXmlParameter(command, "@fechaEdadGenero", validacion.getFechaValidacionEdadGenero());
            database.AddInXmlParameter(command, "@validacionPension", validacion.getPensionRPM());
            database.AddInXmlParameter(command, "@fechaValidacionPension", validacion.getFechaValidacionPension());
            database.AddInXmlParameter(command, "@validacionIndemnizado", validacion.getIndemnizadoRPM());
            database.AddInXmlParameter(command, "@fechaValidacionIndemnizado", validacion.getFechaValidacionIndeminazado());
            /*datos para RAIS*/
            database.AddInXmlParameter(command, "@pensionRAIS", validacion.getPensionRAIS());
            database.AddInXmlParameter(command, "@fechaRAIS", validacion.getFechaPensionRAIS());
            /*datos para OBP*/
            database.AddInXmlParameter(command, "@prestacionOBP", validacion.getPrestacionOBP());
            database.AddInXmlParameter(command, "@fechaPrestacionOBP", validacion.getFechaPrestacionOBP());
            
            /* Se ejecuta el query de inserción */
            database.executeInsertQuery(command, 1);

        } catch (Exception e) {
            HashMap<String, String> metaData = new HashMap<String, String>();
            metaData.put(ConstantesLoggerServicios.METADATA_IDENTIFICADOR_SOLICITUD, idSolicitud);
            throw new DataAccessException(null, metaData, e);
        }
    }

    /**
     * Método mediante el cual se actualiza la etapa de una solicitud.
     * 
     * @param etapaSolicitud
     * @param idSolicitud
     * @return
     * @throws DataAccessException
     */
    public DataTable actualizarEtapaSolicitud(String etapaSolicitud, String idSolicitud) throws DataAccessException {
        DataTable data = new DataTable();
        DbCommand command = null;

        try {
            command = database.GetXmlCommand("PR_ActualizarEtapaSolicitud");
            command.setCommandType(CommandType.Text);
            database.AddInXmlParameter(command, "@etapaSolicitud", etapaSolicitud);
            database.AddInXmlParameter(command, "@idSolicitud", idSolicitud);

            /* Se ejecuta el query de actualización */
            database.executeInsertQuery(command, 1);

        } catch (Exception e) {
            HashMap<String, String> metaData = new HashMap<String, String>();
            metaData.put(ConstantesLoggerServicios.METADATA_CONSULTA, "PR_ActualizarEtapaSolicitud");
            metaData.put(ConstantesLoggerServicios.METADATA_ETAPA_SOLICITUD, etapaSolicitud);
            metaData.put(ConstantesLoggerServicios.METADATA_IDENTIFICADOR_SOLICITUD, idSolicitud);
            throw new DataAccessException(null, metaData, e);
        }
        return data;
    }

    /**
     * Método que permite realizar la creación del histórico por actualización del estado del vinculado.
     * 
     * @param informacionContexto
     *            Información de invocación del servicio.
     * @param infoVinculado
     *            Contiene el id del vinculado con la información del estado actual.
     * @param estadoNuevo
     *            Contiene el estado nuevo con el que queda el vinculado.
     * @param detalleEstadoNuevo
     *            Contiene el detalle de estado nuevo con el que queda el vinculado.
     * @throws DataAccessException
     *             Excepción generada por BD.
     */
    public void crearHistoricoCambioEstado(TipoInformacionContexto informacionContexto, InformacionVinculadoEstadosDTO infoVinculado,
            String estadoNuevo, String detalleEstadoNuevo) throws DataAccessException {

        DbCommand commandHistorico = null;

        try {
            commandHistorico = database.GetXmlCommand("PR_CrearHistoricoEstadoVinculado");
            commandHistorico.setCommandType(CommandType.Text);
            database.AddInXmlParameter(commandHistorico, "@idVinculado", infoVinculado.getIdentificadorVinculado());
            database.AddInXmlParameter(commandHistorico, "@estadoAnterior", infoVinculado.getEstadoVinculado());
            database.AddInXmlParameter(commandHistorico, "@detalleEstadoAnterior", infoVinculado.getDetalleEstadoVinculado());
            database.AddInXmlParameter(commandHistorico, "@estadoNuevo", estadoNuevo);
            database.AddInXmlParameter(commandHistorico, "@detalleEstadoNuevo", detalleEstadoNuevo);
            database.AddInXmlParameter(commandHistorico, "@origenCambio",
                    ConstantesEstados.ORIGEN_CAMBIO_ESTADO_REGISTRAR_SOLICITUD_OTORGAMIENTO);
            database.AddInXmlParameter(commandHistorico, "@referenciaCambio", infoVinculado.getNumeroRadicado());

            database.executeNonQuery(commandHistorico);
        } catch (Exception e) {
            HashMap<String, String> metaData = new HashMap<String, String>();
            metaData.put(ConstantesLoggerServicios.METADATA_IDENTIFICADOR_VINCULADO, infoVinculado.getIdentificadorVinculado().toString());
            throw new DataAccessException(null, metaData, e);
        }
    }
    
    
    /**
     * Método que permite consultar si para vinculado fallecido, existe una solicitud por devolución 
     * de ahorros a herederos aprobada por el gerente o en gestión del gerente
     * 
     * @param idVinculado
     *            Id del vinculado asociado a la solicitud.
     * @return String 
     *            Cadena que contiene id del la solicitud de devolución de ahorros a herederos. Null si no la encuentra.
     * @throws DataAccessException
     */
    public String consultarSolicitudDevolucionAhorrosHerederos(Long idVinculado) throws DataAccessException {
        DataTable data = new DataTable();
        DbCommand command = null;
        String idSolicitudDevolucionAhorrosHeredero = null;

        try {
            DatabaseManager database = new DatabaseManager(TipoConexionBaseDatosEnum.SQL_SERVER);
            command = database.GetXmlCommand("PR_ConsultarSolicitudDevolucionAhorrosHeredero");
            command.setCommandType(CommandType.Text);
            database.AddInXmlParameter(command, "@osd_id_vinculado", idVinculado);
            data = database.ExecuteDataTableCommandText(command);
            
            if (data.getRows().size() > 0) {
                idSolicitudDevolucionAhorrosHeredero = data.getRows().get(0).getValue("osd_pk_id").toString();
            }

        } catch (Exception e) {
            HashMap<String, String> metaData = new HashMap<String, String>();
            metaData.put(ConstantesLoggerServicios.METADATA_CONSULTA, "PR_ConsultarSolicitudDevolucionAhorrosHeredero");
            metaData.put(ConstantesLoggerServicios.METADATA_IDENTIFICADOR_VINCULADO, idVinculado.toString());
            throw new DataAccessException(null, metaData, e);
        }
        return idSolicitudDevolucionAhorrosHeredero;
    }
    
    
    /**
     * Método que permite realizar el llamado al procedimiento almacenado 
     * que crea la solicitud de devolución de ahorros a herederos.
     * 
     * @param idVinculado
     *            id del vinculado asociado a la solicitud.
     * @param solicitud
     *            información de la solicitud de devolución de ahorros a herederos.
     * @param String
     *            estado con el cual se va a registrar la solicitud.
     * @param String
     *            etapa con la cual se va a registrar la solicitud.
     * @param int
     *            indica si la solicitud de traslado fue radicada en Plenitud.
     * @return Long
     *            id de la solicitud de devolución de ahorros a herederos creada.
     * @throws DataAccessException
     *            excepción al crear la solicitud.
     */
    public Long crearSolicitudDevolucionAhorrosHerederos(Long idVinculado, TipoSolicitudDevolucionAhorrosHerederos solicitud, String estadoSolicitud, String etapaSolicitud, int solicitudPlenitud)
            throws DataAccessException {

        Long idSolicitud = null;
        try {

            DbCommand command = null;

            command = database.GetXmlCommand("StoredProcedure_crearSolicitudDevolucionAhorrosHerederos");
            command.setCommandType(CommandType.StoredProcedure);

            /* parametros que ingresan al SP */
            database.AddInXmlParameter(command, "@idVinculado", idVinculado);
            database.AddInXmlParameter(command, "@fechaRegistroFirma", Util.obtenerFechaString(solicitud.getFechaRegistro()));
            database.AddInXmlParameter(command, "@fechaRegistro", new java.sql.Timestamp(new Date().getTime()));
            database.AddInXmlParameter(command, "@tipoSolicitud", solicitud.getTipoSolicitud());
            database.AddInXmlParameter(command, "@usuarioRegistroSistema", solicitud.getUsuarioRegistroSistema());
            database.AddInXmlParameter(command, "@numeroRadicacion", solicitud.getNumeroRadicacion());
            database.AddInXmlParameter(command, "@canalRadicacionSolicitud", solicitud.getCanalRadicacion());
            database.AddInXmlParameter(command, "@usuarioAnalista", solicitud.getUsuarioAnalista());
            database.AddInXmlParameter(command, "@usuarioRevisor", solicitud.getUsuarioRevisor());
            database.AddInXmlParameter(command, "@estadoSolicitud", estadoSolicitud);
            database.AddInXmlParameter(command, "@etapaSolicitud", etapaSolicitud);
            database.AddInXmlParameter(command, "@solicitudPlenitud", solicitudPlenitud);

            /* parámetros que salen del SP */
            database.AddOutParameter(command, "@idSolicitud", DbType.BIGINT, 8);

            DataStoredProcedure data = database.executeListResultSet(command);

            List<DbParameter> lista = data.getParametrosSalida();

            idSolicitud = (Long) lista.get(0).getParameterValue();

        } catch (Exception e) {
            HashMap<String, String> metaData = new HashMap<String, String>();
            metaData.put(ConstantesLoggerServicios.METADATA_NUM_RADICADO, solicitud.getNumeroRadicacion());
            metaData.put(ConstantesLoggerServicios.METADATA_TIPO_DOCUMENTO, solicitud.getInformacionVinculado().getIdentificacion()
                    .getTipoDocumento());
            metaData.put(ConstantesLoggerServicios.METADATA_NUM_DOCUMENTO, solicitud.getInformacionVinculado().getIdentificacion()
                    .getTipoDocumento());
            throw new DataAccessException(null, metaData, e);
        }

        return idSolicitud;
    }
    
    /**
     * Método que permite registrar la información de un tercero/heredero asociado a 
     * una solicitud de devolución de ahorros a herederos.
     * 
     * @param idSolicitud
     *            id de solicitud registrada.
     * @param informacionHeredero
     *            información del heredero.
     * @throws DataAccessException
     *             excepción generada al almacenar la información.
     */
    public void registrarInformacionHeredero(Long idSolicitud, TipoInformacionHeredero informacionHeredero) throws DataAccessException {

        try {

            DbCommand command = null;

            command = database.GetXmlCommand("StoredProcedure_crearHerederoSolicitudDevolucionAhorros");
            command.setCommandType(CommandType.StoredProcedure);

            database.AddInXmlParameter(command, "@tipoDocumento", informacionHeredero.getIdentificacion().getTipoDocumento());
            database.AddInXmlParameter(command, "@numeroDocumento", informacionHeredero.getIdentificacion().getNumeroDocumento());
            database.AddInXmlParameter(command, "@primerNombre", informacionHeredero.getNombres().getPrimerNombre());
            database.AddInXmlParameter(command, "@segundoNombre", informacionHeredero.getNombres().getSegundoNombre());
            database.AddInXmlParameter(command, "@primerApellido", informacionHeredero.getNombres().getPrimerApellido());
            database.AddInXmlParameter(command, "@segundoApellido", informacionHeredero.getNombres().getSegundoApellido());
            database.AddInXmlParameter(command, "@tipoTercero", informacionHeredero.getTipoSolicitante());
            database.AddInXmlParameter(command, "@numTarjetaProfesional", informacionHeredero.getNumeroTarjetaProfesional());
            database.AddInXmlParameter(command, "@autoEnvioInfo",
                    Constantes.SI.equals(informacionHeredero.getInformacionAutorizacion().getAutorizacionEnvioComunicacion()) ? 1 : 0);
            database.AddInXmlParameter(command, "@autoUsoInfo",
                    Constantes.SI.equals(informacionHeredero.getInformacionAutorizacion().getAutorizacionManejoInformacion()) ? 1 : 0);
            database.AddInXmlParameter(command, "@idSolicitud", idSolicitud);
            database.AddInXmlParameter(command, "@esRepresentanteHerederos",
                    Constantes.SI.equals(informacionHeredero.getEsRepresentanteHerederos()) ? 1 : 0);
            database.AddInXmlParameter(command, "@parentesco", informacionHeredero.getParentesco());
            database.AddInXmlParameter(command, "@direccionResidencia", informacionHeredero.getDireccion());
            database.AddInXmlParameter(command, "@barrioResidencia", informacionHeredero.getBarrio());
            database.AddInXmlParameter(command, "@departamentoResidencia", (informacionHeredero.getDepartamento() != null ? informacionHeredero.getDepartamento() : null));
            database.AddInXmlParameter(command, "@municipioResidencia", (informacionHeredero.getMunicipio() != null ? informacionHeredero.getMunicipio() : null));
            database.AddInXmlParameter(command, "@telefono1", informacionHeredero.getTelefono1());
            database.AddInXmlParameter(command, "@telefono2", informacionHeredero.getTelefono2());
            database.AddInXmlParameter(command, "@correoElectronico", informacionHeredero.getCorreoElectronico());
            
            database.executeListResultSet(command);

        } catch (Exception e) {
            HashMap<String, String> metaData = new HashMap<String, String>();
            metaData.put(ConstantesLoggerServicios.METADATA_IDENTIFICADOR_SOLICITUD, idSolicitud.toString());
            metaData.put(ConstantesLoggerServicios.METADATA_TIPO_DOCUMENTO, informacionHeredero.getIdentificacion().getTipoDocumento());
            metaData.put(ConstantesLoggerServicios.METADATA_NUM_DOCUMENTO, informacionHeredero.getIdentificacion().getTipoDocumento());
            throw new DataAccessException(null, metaData, e);
        }

    }
    
    /**
     * Método que permite registrar la información de la cuenta bancaria asociada a una 
     * solicitud de devolución de ahorros a herederos.
     * 
     * @param idSolicitud
     *            id de la solicitud de devolución de ahorros a herederos.
     * @param codigoTipoCuenta
     *            código del tipo de cuenta bancaria.
     * @param solicitud
     *            información de la solicitud de devolución de ahorros a herederos.
     * @throws DataAccessException
     *            excepción generada al almacenar la información.
     */
    public void registrarCuentaBancaria(Long idSolicitud, String codigoTipoCuenta, TipoSolicitudDevolucionAhorrosHerederos solicitud) throws DataAccessException {
        DbCommand command = null;
        try {
            command = database.GetXmlCommand("PR_RegistrarCuentaBancaria");
            command.setCommandType(CommandType.Text);
            database.AddInXmlParameter(command, "@codigoEntidadFinanciera", solicitud.getInformacionCuentaBancaria().getEntidadFinanciera());
            database.AddInXmlParameter(command, "@tipoCuenta", codigoTipoCuenta);
            database.AddInXmlParameter(command, "@numeroCuenta", solicitud.getInformacionCuentaBancaria().getNumeroCuenta());
            database.AddInXmlParameter(command, "@numeroIdentificacion", solicitud.getInformacionCuentaBancaria().getIdentificacion().getNumeroDocumento());
            database.AddInXmlParameter(command, "@tipoIdentificacion", solicitud.getInformacionCuentaBancaria().getIdentificacion().getTipoDocumento());
            database.AddInXmlParameter(command, "@nombreTercero", solicitud.getInformacionCuentaBancaria().getNombreTitular());
            database.AddInXmlParameter(command, "@idSolicitud", idSolicitud);

            /* Se ejecuta el query de inserción */
            database.executeInsertQuery(command, 1);

        } catch (Exception e) {
            HashMap<String, String> metaData = new HashMap<String, String>();
            metaData.put(ConstantesLoggerServicios.METADATA_IDENTIFICADOR_SOLICITUD, idSolicitud.toString());
            metaData.put(ConstantesLoggerServicios.METADATA_NUMERO_CUENTA, solicitud.getInformacionCuentaBancaria().getNumeroCuenta());
            throw new DataAccessException(null, metaData, e);
        }

    }  
    
    /**
     * Método para consultar el código de un tipo de cuenta dado su nombre.
     * 
     * @param nombreTipoCuenta
     *            nombre del tipo de cuenta.
     * @return String
     *            código del tipo de cuenta. Null si no lo encuentra.
     * @throws DataAccessException
     *            excepción generada al realizar la consulta.
     */
    public String consultarCodigoTipoCuenta(String nombreTipoCuenta) throws DataAccessException {
        String codigoTipoCuenta = null;
        DbCommand command = null;

        try {
            DatabaseManager database = new DatabaseManager(TipoConexionBaseDatosEnum.SQL_SERVER);
            command = database.GetXmlCommand("PR_ConsultarCodigoTipoCuenta");
            command.setCommandType(CommandType.Text);
            database.AddInXmlParameter(command, "@otc_nombre", nombreTipoCuenta);

            DataTable data = database.ExecuteDataTableCommandText(command);
            
            if (data.getRows().size() > 0) {
                codigoTipoCuenta = data.getRows().get(0).getValue("otc_pk_codigo").toString();
            }

        } catch (Exception e) {
            HashMap<String, String> metaData = new HashMap<String, String>();
            metaData.put(ConstantesLoggerServicios.METADATA_NOMBRE_TIPO_CUENTA, nombreTipoCuenta);
            throw new DataAccessException(null, metaData, e);
        }
        return codigoTipoCuenta;
    }
    
    /**
     * Método para actualizar la fecha de defunción y el registro civil de defunción de un vinculado fallecido.
     * 
     * @param solicitud
     *            información de la solicitud de devolución de ahorros a herederos.
     * @throws DataAccessException
     *            excepción generada al realizar la consulta.
     */
    public void actualizarDatosVinculadoFallecido(TipoSolicitudDevolucionAhorrosHerederos solicitud) throws DataAccessException {
        DbCommand command = null;

        try {
            DatabaseManager database = new DatabaseManager(TipoConexionBaseDatosEnum.SQL_SERVER);
            command = database.GetXmlCommand("PR_ActualizarDatosVinculadoFallecido");
            command.setCommandType(CommandType.Text);
            database.AddInXmlParameter(command, "@fechaDefuncion", Util.obtenerFechaString(solicitud.getInformacionVinculado().getFechaDefuncion()));
            database.AddInXmlParameter(command, "@registroCivilDefuncion", solicitud.getInformacionVinculado().getRegistroCivilDefuncion());
            database.AddInXmlParameter(command, "@tipoDocumento", solicitud.getInformacionVinculado().getIdentificacion().getTipoDocumento());
            database.AddInXmlParameter(command, "@numeroDocumento", solicitud.getInformacionVinculado().getIdentificacion().getNumeroDocumento());

            database.executeNonQuery(command);

        } catch (Exception e) {
            HashMap<String, String> metaData = new HashMap<String, String>();
            metaData.put(ConstantesLoggerServicios.METADATA_TIPO_DOCUMENTO, solicitud.getInformacionVinculado().getIdentificacion().getTipoDocumento());
            metaData.put(ConstantesLoggerServicios.METADATA_NUM_DOCUMENTO, solicitud.getInformacionVinculado().getIdentificacion().getNumeroDocumento());
            throw new DataAccessException(null, metaData, e);
        }
    }    
    
    /**
     * Método para consultar el código de radicación de una solicitud de devolución de ahorros a herederos.
     * 
     * @param numeroRadicacion
     *            número de radicación de la solicitud.
     * @return String
     *            número de radicación encontrado. Null si no lo encuentra.
     * @throws DataAccessException
     *            excepción generada al realizar la consulta.
     */
    public String consultarNumeroRadicacion(String numeroRadicacion) throws DataAccessException {
        String numRadicacion = null;
        DbCommand command = null;

        try {
            DatabaseManager database = new DatabaseManager(TipoConexionBaseDatosEnum.SQL_SERVER);
            command = database.GetXmlCommand("PR_ConsultarNumeroRadicacion");
            command.setCommandType(CommandType.Text);
            database.AddInXmlParameter(command, "@osd_numero_radicado", numeroRadicacion);

            DataTable data = database.ExecuteDataTableCommandText(command);
            
            if (data.getRows().size() > 0) {
                numRadicacion = data.getRows().get(0).getValue("osd_numero_radicado").toString();
            }

        } catch (Exception e) {
            HashMap<String, String> metaData = new HashMap<String, String>();
            metaData.put(ConstantesLoggerServicios.METADATA_NUM_RADICADO, numeroRadicacion);
            throw new DataAccessException(null, metaData, e);
        }
        return numRadicacion;
    }

    /**
     * Consulta los estados pensionales parametrizados
     * @return mapa con el código estado de pensión como llave y valor la descripción del estado
     * @throws DataAccessException
     */
    public Map<String, String> consultarEstadosPensionalParametrizados() throws DataAccessException {
        DbCommand command = null;
        Map<String, String> mapaEstadoPensionRais=new HashMap<String, String>();
        try {
            DatabaseManager database = new DatabaseManager(TipoConexionBaseDatosEnum.SQL_SERVER);
            command = database.GetXmlCommand("PR_ConsultarEstadoPensionParametrico");
            command.setCommandType(CommandType.Text);

            DataTable data = database.ExecuteDataTableCommandText(command);
            
            for (DataRow dataRow : data.getRows()) {
                String key=dataRow.getValue("codigo").toString();
                String valor=dataRow.getValue("descripcion").toString();
                mapaEstadoPensionRais.put(key, valor);
            }

        } catch (Exception e) {
            HashMap<String, String> metaData = new HashMap<String, String>();
            throw new DataAccessException(null, metaData, e);
        }
        return mapaEstadoPensionRais;
    }
}
