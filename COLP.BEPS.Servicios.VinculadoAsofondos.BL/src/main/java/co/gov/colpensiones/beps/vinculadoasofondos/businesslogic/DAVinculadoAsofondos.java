package co.gov.colpensiones.beps.vinculadoasofondos.businesslogic;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import co.gov.colpensiones.beps.comunes.enumeraciones.TipoConexionBaseDatosEnum;
import co.gov.colpensiones.beps.comunes.utilidades.ConstantesLoggerServicios;
import co.gov.colpensiones.beps.comunes.utilidades.DatabaseManager;
import co.gov.colpensiones.beps.dal.utilidades.CommandType;
import co.gov.colpensiones.beps.dal.utilidades.DataRow;
import co.gov.colpensiones.beps.dal.utilidades.DataStoredProcedure;
import co.gov.colpensiones.beps.dal.utilidades.DataTable;
import co.gov.colpensiones.beps.dal.utilidades.DbCommand;
import co.gov.colpensiones.beps.dal.utilidades.DbType;
import co.gov.colpensiones.beps.excepciones.DataAccessException;

/**
 * <b>Descripción:</b> Clase encargada de la lógica de negocio para la interacción con las fuentes de datos. <br/>
 *
 * @author Yesika Ramirez <yeramirez@heinsohn.com.co>
 */
public class DAVinculadoAsofondos {
    
    /**
     * Método que permite consultar los parámetros de base de datos para revisar los campos que deben ser visibles.
     * @return Map con los parámetros para la visualizacion del resultado <String,String> Nombre-Valor
     */
     public Map<String, Object> consultarParametrosVisibles() throws Exception{
    	 
	    	DatabaseManager database = new DatabaseManager(TipoConexionBaseDatosEnum.SQL_SERVER);
	        DbCommand command = null;
	        DataStoredProcedure data = null;
	        Map<String, Object> parametros=new HashMap<String, Object>();
	        
	        command = database.GetXmlCommand("SP_consultaCamposVisibles");
	        command.setCommandType(CommandType.StoredProcedure);
	
	        /* parámetros que salen del SP */
	        database.AddOutParameter(command, "@indicadorRetorno", DbType.VARCHAR, 1);
	        data = database.executeGenericStoredProcedure(command);
	        
	        /* Trasfiere los datos del procedimiento almacenado a un mapa*/
	        DataTable resultSet = data.getTablaResultSet();
	        for (DataRow fila : resultSet.getRows()) {
	            parametros.put(fila.getValue("nombre").toString(), fila.getValue("visualizar"));
	        }
	        
	        return parametros;
    }
    
     /**
      * Método que permite consultar el saldo total de la cuenta individual
      * @param numeroDocumento del solicitante 
      * @return saldoTotal
      * 	   BigDecimal con el valor del saldoTotal
      */
     public BigDecimal consultarSaldoTotal(String numeroDocumento) throws Exception{

    	 DatabaseManager database = new DatabaseManager(TipoConexionBaseDatosEnum.SQL_SERVER);
    	 DbCommand command = null;
    	 DataStoredProcedure resultadoConsulta = null;
    	 BigDecimal saldoTotal = null;
    	 command = database.GetXmlCommand("SP_consultaSaldoTotal");
    	 command.setCommandType(CommandType.StoredProcedure);

    	 /* parámetros que salen del SP */
    	 database.AddInXmlParameter(command, "@numeroDocumento", numeroDocumento); 
    	 database.AddOutParameter(command, "@indicadorRetorno", DbType.VARCHAR, 1);
    	 resultadoConsulta = database.executeGenericStoredProcedure(command);

    	 if (resultadoConsulta.getTablaResultSet().getRows().size()>0){
    		 saldoTotal = (BigDecimal) resultadoConsulta.getTablaResultSet().getRows().get(0).getValue("saldoTotal");
    	 }
    	 return saldoTotal;
     }
     
     /**
      * Método que permite consultar la descripcion de Colombia Mayor
      * @param id de Colombia Mayor 
      * @return descripcion
      * 	   String con el valor del descripcion de Colombia Mayor
      */
     public String consultarDescripcionColombiaMayor(String id) throws Exception{

    	 DatabaseManager database = new DatabaseManager(TipoConexionBaseDatosEnum.SQL_SERVER);
    	 DbCommand command = null;
    	 DataTable resultadoConsulta = null;
    	 String descripcion = "";
    	 command = database.GetXmlCommand("SP_consultaDescripcionColombiaMayor");
    	 command.setCommandType(CommandType.Text);

    	 /* parámetros que salen del SP */
    	 database.AddInXmlParameter(command, "@id", id); 
    	 
    	 resultadoConsulta = database.ExecuteDataTableCommandText(command);

    	 if (resultadoConsulta.getRows().size() > 0) {
    		 Object descripcionColombiaMayor = resultadoConsulta.getRows().get(0).getValue("descripcion");
    		 descripcion = descripcionColombiaMayor !=null ? descripcionColombiaMayor.toString() : "";
         }
    	 
    	 return descripcion;
     }
     
     /**
      * Método que permite consultar la descripcion de una Causal de No Viabilidad
      * @param id de causa no viable 
      * @return descripcion
      * 	   String con el valor del descripcion de causa no viable
      */
     public String consultarDescripcionCausaNoViabilidad(String id) throws Exception{

    	 DatabaseManager database = new DatabaseManager(TipoConexionBaseDatosEnum.SQL_SERVER);
    	 DbCommand command = null;
    	 DataTable resultadoConsulta = null;
    	 String descripcion = "";
    	 command = database.GetXmlCommand("SP_consultaCausalNoViabilidad");
    	 command.setCommandType(CommandType.Text);

    	 /* parámetros que salen del SP */
    	 database.AddInXmlParameter(command, "@id", id); 
    	 
    	 resultadoConsulta = database.ExecuteDataTableCommandText(command);

    	 if (resultadoConsulta.getRows().size() > 0) {
    		 Object descripcionCausa = resultadoConsulta.getRows().get(0).getValue("descripcion");
    		 descripcion = descripcionCausa !=null ? descripcionCausa.toString() : "";
         }
    	 
    	 return descripcion;
     }
     
     public String consultarParametroOtorgamiento(String nombreParametro) throws DataAccessException {
         DbCommand command = null;
         String valorParametro = null;
         try {
        	 DatabaseManager database = new DatabaseManager(TipoConexionBaseDatosEnum.SQL_SERVER_ALT);
             command = database.GetXmlCommand("PR_VincConsultarParametroOtorgamiento");
             command.setCommandType(CommandType.Text);
             database.AddInXmlParameter(command, "@nombreParametro", nombreParametro);

             /* Se ejecuta el query de consulta */
             DataTable data = database.ExecuteDataTable(command);
             if (data != null && data.getRows().size() > 0) {
                 valorParametro = data.getRows().get(0).getValue("opg_valor").toString();
             }

         } catch (Exception e) {
             HashMap<String, String> metaData = new HashMap<String, String>();
             metaData.put(ConstantesLoggerServicios.METADATA_CONSULTA, "PR_VincConsultarParametroOtorgamiento");
             metaData.put(ConstantesLoggerServicios.METADATA_PARAMETRO, nombreParametro);
             throw new DataAccessException(null, metaData, e);
         }
         return valorParametro;
     }
     
     
     /**
      * Método que permite consultar la descripcion del estado de un solicitante
      * @param id de estado 
      * @return descripcion
      * 	   String con el valor del descripcion del estado
      */
     public String consultarDescripcionEstado(String id) throws Exception{

    	 DatabaseManager database = new DatabaseManager(TipoConexionBaseDatosEnum.SQL_SERVER);
    	 DbCommand command = null;
    	 DataTable resultadoConsulta = null;
    	 String descripcion = "";
    	 command = database.GetXmlCommand("SP_consultaDescrpcionEstado");
    	 command.setCommandType(CommandType.Text);

    	 /* parámetros que salen del SP */
    	 database.AddInXmlParameter(command, "@id", id); 
    	 
    	 resultadoConsulta = database.ExecuteDataTableCommandText(command);

    	 if (resultadoConsulta.getRows().size() > 0) {
    		 Object descripcionCausa = resultadoConsulta.getRows().get(0).getValue("descripcion");
    		 descripcion = descripcionCausa !=null ? descripcionCausa.toString() : "";
         }
    	 
    	 return descripcion;
     }
     
}