
package co.gov.colpensiones.beps.schemas._1_0.vinculadoasofondos;

import javax.xml.bind.annotation.XmlRegistry;

import co.gov.colpensiones.beps.schemas._1_0.comun.TipoInformacionContexto;
import co.gov.colpensiones.beps.schemas._1_0.comun.TipoInformacionContextoExterno;


/**
 * Este objeto contiene métodos de fábrica para cada 
 * Interfaz de contenido Java y la interfaz elemento Java 
 * generada en el paquete co.gov.colpensiones.beps.schemas._1_0.vinculadoasofondos. 
 * <p>Un ObjectFactory le permite programáticamente 
 * construir nuevas instancias de la representación de Java 
 * para el contenido de XML. La representación de Java XML 
 * contenido puede consistir en las interfaces de esquema derivado 
 * y las clases que representa la unión de esquema 
 * definiciones de tipo, declaraciones de elementos y el modelo 
 * grupos. Métodos de fábrica para cada uno de estos son 
 * proporcionado en esta clase.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Crea un nuevo ObjectFactory que se puede utilizar para crear nuevas instancias de clases de esquema derivado para el paquete: co.gov.colpensiones.beps.schemas._1_0.vinculadoasofondos
     * 
     */
    public ObjectFactory() {
    }

   /**
     * Crear una instancia de {@link TipoInformacionContexto }
     * 
     */
    public TipoInformacionContextoExterno createTipoInformacionContexto() {
        return new TipoInformacionContextoExterno();
    }

}
