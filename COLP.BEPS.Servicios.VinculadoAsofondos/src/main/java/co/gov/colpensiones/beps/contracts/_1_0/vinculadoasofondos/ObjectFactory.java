
package co.gov.colpensiones.beps.contracts._1_0.vinculadoasofondos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import co.gov.colpensiones.beps.schemas._1_0.comun.TipoInformacionContexto;
import co.gov.colpensiones.beps.schemas._1_0.comun.TipoInformacionContextoExterno;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoDocumentoPersonaNatural;
import co.gov.colpensiones.beps.schemas._1_0.vinculadoasofondos.TipoInformacionSolicitanteDTO;


/**
 * Este objeto contiene métodos de fábrica para cada 
 * Interfaz de contenido Java y la interfaz elemento Java 
 * generada en el paquete co.gov.colpensiones.beps.contracts._1_0.vinculadoasofondos. 
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

   
    private final static QName _InformacionContexto_QNAME = new QName("http://www.colpensiones.gov.co/beps/contracts/1.0/comun", "informacionContexto");
    private final static QName _TipoDocumentoPersonaNatural_QNAME = new QName("http://www.colpensiones.gov.co/beps/schemas/1.0/personas", "tipoDocumentoPersonaNatural");
    private final static QName _TipoInformacionSolicitanteDTO_QNAME = new QName("http://www.colpensiones.gov.co/beps/contracts/1.0/vinculadoasofondos", "tipoInformacionSolicitanteDTO");
  
    /**
     * Crea un nuevo ObjectFactory que se puede utilizar para crear nuevas instancias de clases de esquema derivado para el paquete: co.gov.colpensiones.beps.contracts._1_0.vinculadoasofondos
     * 
     */
    public ObjectFactory() {
    }
      
    /**
     * Crear una instancia de {@link JAXBElement }{@code <}{@link TipoInformacionContexto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/comun", name = "informacionContexto")
    public JAXBElement<TipoInformacionContextoExterno> createInformacionContexto(TipoInformacionContextoExterno value) {
        return new JAXBElement<TipoInformacionContextoExterno>(_InformacionContexto_QNAME, TipoInformacionContextoExterno.class, null, value);
    }
    
    /**
     * Crear una instancia de {@link JAXBElement }{@code <}{@link TipoDocumentoPersonaNatural }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/beps/schemas/1.0/personas", name = "tipoDocumentoPersonaNatural")
    public JAXBElement<TipoDocumentoPersonaNatural> createTipoDocumentoPersonaNatural(TipoDocumentoPersonaNatural value) {
        return new JAXBElement<TipoDocumentoPersonaNatural>(_TipoDocumentoPersonaNatural_QNAME, TipoDocumentoPersonaNatural.class, null, value);
    }
    
    /**
     * Crear una instancia de {@link JAXBElement }{@code <}{@link TipoInformacionSolicitanteDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/vinculadoasofondos", name = "tipoInformacionSolicitanteDTO")
    public JAXBElement<TipoInformacionSolicitanteDTO> createTipoInformacionSolicitanteDTO(TipoInformacionSolicitanteDTO value) {
        return new JAXBElement<TipoInformacionSolicitanteDTO>(_TipoInformacionSolicitanteDTO_QNAME, TipoInformacionSolicitanteDTO.class, null, value);
    }
    
   
}
