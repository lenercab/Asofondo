
package co.gov.colpensiones.beps.contracts._1_0.certificados;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import co.gov.colpensiones.beps.schemas._1_0.certificados.TipoInformacionCertificado;
import co.gov.colpensiones.beps.schemas._1_0.certificados.TipoInformacionContexto;
import co.gov.colpensiones.beps.schemas._1_0.certificados.TipoRespuestaCertificadoDTO;


/**
 * Este objeto contiene métodos de fábrica para cada 
 * Interfaz de contenido Java y la interfaz elemento Java 
 * generada en el paquete co.gov.colpensiones.beps.contracts._1_0.certificados. 
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

    private final static QName _InformacionContexto_QNAME = new QName("http://www.colpensiones.gov.co/beps/contracts/1.0/certificados", "InformacionContexto");
    private final static QName _TipoInformacionCertificado_QNAME = new QName("http://www.colpensiones.gov.co/beps/contracts/1.0/certificados", "tipoInformacionCertificado");
    private final static QName _TipoRespuestaCertificadoDTO_QNAME = new QName("http://www.colpensiones.gov.co/beps/contracts/1.0/certificados", "tipoRespuestaCertificadoDTO");
    private final static QName _TipoInformacionContexto_QNAME = new QName("http://www.colpensiones.gov.co/beps/contracts/1.0/certificados", "tipoInformacionContexto");

    /**
     * Crea un nuevo ObjectFactory que se puede utilizar para crear nuevas instancias de clases de esquema derivado para el paquete: co.gov.colpensiones.beps.contracts._1_0.certificados
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Crear una instancia de {@link JAXBElement }{@code <}{@link TipoInformacionContexto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/certificados", name = "InformacionContexto")
    public JAXBElement<TipoInformacionContexto> createInformacionContexto(TipoInformacionContexto value) {
        return new JAXBElement<TipoInformacionContexto>(_InformacionContexto_QNAME, TipoInformacionContexto.class, null, value);
    }

    /**
     * Crear una instancia de {@link JAXBElement }{@code <}{@link TipoInformacionCertificado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/certificados", name = "tipoInformacionCertificado")
    public JAXBElement<TipoInformacionCertificado> createTipoInformacionCertificado(TipoInformacionCertificado value) {
        return new JAXBElement<TipoInformacionCertificado>(_TipoInformacionCertificado_QNAME, TipoInformacionCertificado.class, null, value);
    }

    /**
     * Crear una instancia de {@link JAXBElement }{@code <}{@link TipoRespuestaCertificadoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/certificados", name = "tipoRespuestaCertificadoDTO")
    public JAXBElement<TipoRespuestaCertificadoDTO> createTipoRespuestaCertificadoDTO(TipoRespuestaCertificadoDTO value) {
        return new JAXBElement<TipoRespuestaCertificadoDTO>(_TipoRespuestaCertificadoDTO_QNAME, TipoRespuestaCertificadoDTO.class, null, value);
    }

    /**
     * Crear una instancia de {@link JAXBElement }{@code <}{@link TipoInformacionContexto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/certificados", name = "tipoInformacionContexto")
    public JAXBElement<TipoInformacionContexto> createTipoInformacionContexto(TipoInformacionContexto value) {
        return new JAXBElement<TipoInformacionContexto>(_TipoInformacionContexto_QNAME, TipoInformacionContexto.class, null, value);
    }

}
