package co.gov.colpensiones.beps.certificados.businesslogic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import co.gov.colpensiones.beps.comunes.enumeraciones.TipoConexionBaseDatosEnum;
import co.gov.colpensiones.beps.comunes.utilidades.Constantes;
import co.gov.colpensiones.beps.comunes.utilidades.DatabaseManager;
import co.gov.colpensiones.beps.dal.utilidades.CommandType;
import co.gov.colpensiones.beps.dal.utilidades.DataColumn;
import co.gov.colpensiones.beps.dal.utilidades.DataRow;
import co.gov.colpensiones.beps.dal.utilidades.DataStoredProcedure;
import co.gov.colpensiones.beps.dal.utilidades.DataTable;
import co.gov.colpensiones.beps.dal.utilidades.DbCommand;
import co.gov.colpensiones.beps.dal.utilidades.DbType;
import co.gov.colpensiones.beps.excepciones.DataAccessException;
import co.gov.colpensiones.beps.excepciones.FunctionalException;
import co.gov.colpensiones.beps.generadorcertificados.constantes.ConstantesGeneracionCertificados;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoDocumentoPersonaNatural;

/**
 * <b>Descripción:</b> Clase encargada de la lógica de negocio para la interacción con las fuentes de datos. <br/>
 *
 * @author Cristian Alexander Salazar Perdomo <csalazar@heinsohn.com.co>
 */
public class DACertificado {
    
    /**
     * Método que realiza la consulta de información del vinculado en la base de datos del sistema de gestión Beps.
     * @param vinculado, contiene tipo y numero documento
     * @return datos asociados al vinculado
     * @throws DataAccessException 
     */
    public Map<String,Object> consultarInformacionVinculado(TipoDocumentoPersonaNatural vinculado) throws Exception{
    	DatabaseManager database = new DatabaseManager(TipoConexionBaseDatosEnum.SQL_SERVER);
        DbCommand command = null;
        DataStoredProcedure data = null;

        command = database.GetXmlCommand("SP_VinculadoCertificado");
        command.setCommandType(CommandType.StoredProcedure);

        /* parametros que ingresan al SP */
        database.AddInXmlParameter(command, "@tipoDocumento", vinculado.getTipoDocumento());
        database.AddInXmlParameter(command, "@numDocumento", vinculado.getNumeroDocumento());
      
        /* parámetros que salen del SP */
        database.AddOutParameter(command, "@indicadorRetorno", DbType.VARCHAR, 1);

        data = database.executeListResultSet(command);
        Map<String, Object> datos=new HashMap<String, Object>();
        /* Trasfiere los datos del procedimiento almacenado a un mapa*/
        for(DataTable resultSet : data.getResultSetList()){
        	List<DataColumn> columnas = resultSet.getColumns();
        	for(DataRow fila : resultSet.getRows()){
        		for(DataColumn columna : columnas){
        			datos.put(columna.getColumnName(), fila.getValue(columna.getColumnName()));
        		}
        	}    	
        }
        
        return datos;
    }
    
    /**
     * Método que realiza la consulta de información del vinculado otorgado en la base de datos del sistema de gestión Beps.
     * @param vinculado, contiene tipo y numero documento
     * @return datos asociados al vinculado
     * @throws DataAccessException 
     */
    public Map<String,Object> consultarInformacionVinculadoOtorgado(TipoDocumentoPersonaNatural vinculado) throws Exception{
    	DatabaseManager database = new DatabaseManager(TipoConexionBaseDatosEnum.SQL_SERVER);
        DbCommand command = null;
        DataStoredProcedure data = null;

        command = database.GetXmlCommand("SP_VinculadoCertificadoOtorgado");
        command.setCommandType(CommandType.StoredProcedure);

        /* parámetros que ingresan al SP */
        database.AddInXmlParameter(command, "@tipoDocumento", vinculado.getTipoDocumento());
        database.AddInXmlParameter(command, "@numDocumento", vinculado.getNumeroDocumento());
      
        /* parámetros que salen del SP */
        database.AddOutParameter(command, "@indicadorRetorno", DbType.VARCHAR, 1);

        data = database.executeListResultSet(command);
        Map<String, Object> datos=new HashMap<String, Object>();
        /* Trasfiere los datos del procedimiento almacenado a un mapa*/
        for(DataTable resultSet : data.getResultSetList()){
        	List<DataColumn> columnas = resultSet.getColumns();
        	for(DataRow fila : resultSet.getRows()){
        		for(DataColumn columna : columnas){
        			datos.put(columna.getColumnName(), fila.getValue(columna.getColumnName()));
        		}
        	}    	
        }
        
        return datos;
    }
    /**
     * Método que realiza la consulta de información del vinculado en la base de datos del sistema de gestión Beps.
     * @param vinculado,contiene tipo y numero documento
     * @return datos asociados al vinculado
     * @throws DataAccessException 
     */
    public Map<String,Object> consultarInformacionNoVinculado(TipoDocumentoPersonaNatural vinculado) throws Exception{
    	DatabaseManager database = new DatabaseManager(TipoConexionBaseDatosEnum.SQL_SERVER);
        DbCommand command = null;
        DataStoredProcedure data = null;

        command = database.GetXmlCommand("SP_NoVinculadoCertificado");
        command.setCommandType(CommandType.StoredProcedure);

        /* parametros que ingresan al SP */
        database.AddInXmlParameter(command, "@tipoDocumento", vinculado.getTipoDocumento());
        database.AddInXmlParameter(command, "@numDocumento", vinculado.getNumeroDocumento());
      
        /* parámetros que salen del SP */
        database.AddOutParameter(command, "@indicadorRetorno", DbType.VARCHAR, 1);

        data = database.executeListResultSet(command);
        
        String indicadorRetorno=data.getParametrosSalida().get(0).getParameterValue().toString();;
        Map<String, Object> datos=new HashMap<String, Object>();
        if(ConstantesGeneracionCertificados.INDICADOR_RETORNO.equals(indicadorRetorno))
        {
        	throw new FunctionalException(new HashMap<String,Object>(), new HashMap<String,String>(), new Exception(Constantes.MSJ_DOCUMENTO_ECONTRADO_VINCULADO));
        }
        else
        {
        	/* Trasfiere los datos del procedimiento almacenado a un mapa*/
            for(DataTable resultSet : data.getResultSetList()){
            	List<DataColumn> columnas = resultSet.getColumns();
            	for(DataRow fila : resultSet.getRows()){
            		for(DataColumn columna : columnas){
            			datos.put(columna.getColumnName(), fila.getValue(columna.getColumnName()));
            		}
            	}    	
            }
            
        }
        
        return datos;
    }
    
    /**
     * Método que permite consultar los parámetros de base de datos para la generación de los certificados.
     * @param sistemaOrigen,  Sistema origen desde el que se genera el certificado
     * @return HashMap con los parámetros para la generación del certificado <String,String> Nombre-Valor
     */
     public Map<String, Object> consultarParametrosCertificados(String codigoMunicipio,String sistemaOrigen) throws Exception{
     	DatabaseManager database = new DatabaseManager(TipoConexionBaseDatosEnum.SQL_SERVER);
        DbCommand command = null;
        DataStoredProcedure data = null;

        command = database.GetXmlCommand("SP_ParametroCertificado");
        command.setCommandType(CommandType.StoredProcedure);

        /* parametros que ingresan al SP */
        database.AddInXmlParameter(command, "@codigoDane", codigoMunicipio);
        database.AddInXmlParameter(command, "@sistemaOrigen", sistemaOrigen);
        
        /* parámetros que salen del SP */
        database.AddOutParameter(command, "@indicadorRetorno", DbType.VARCHAR, 1);

        data = database.executeListResultSet(command);
        Map<String, Object> parametros=new HashMap<String, Object>();
        
        /* Trasfiere los datos del procedimiento almacenado a un mapa*/
        for(DataTable resultSet : data.getResultSetList()){
        	for(DataRow fila : resultSet.getRows()){
        		parametros.put(fila.getValue(0).toString(), fila.getValue(1));
        	}    	
        }
        
        return parametros;
    }
    
}