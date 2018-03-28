
package co.gov.colpensiones.beps.contracts._1_0.personas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import co.gov.colpensiones.beps.schemas._1_0.comun.TipoEstadoEjecucion;
import co.gov.colpensiones.beps.schemas._1_0.comun.TipoInformacionContexto;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoInformacionBasicaSisben;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoInformacionPrevinculado;
import co.gov.colpensiones.beps.schemas._1_0.personas.TipoRespuestaCalculoNivelSisbenDTO;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.gov.colpensiones.beps.contracts._1_0.personas package. 
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

    private final static QName _RespuestaCalculo_QNAME = new QName("http://www.colpensiones.gov.co/beps/contracts/1.0/personas", "respuestaCalculo");
    private final static QName _DatosCalculo_QNAME = new QName("http://www.colpensiones.gov.co/beps/contracts/1.0/personas", "datosCalculo");
    private final static QName _InformacionPrevinculado_QNAME = new QName("http://www.colpensiones.gov.co/beps/contracts/1.0/personas", "InformacionPrevinculado");
    private final static QName _EstadoEjecucion_QNAME = new QName("http://www.colpensiones.gov.co/beps/schemas/1.0/comun", "EstadoEjecucion");
 
    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.colpensiones.beps.contracts._1_0.personas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoRespuestaCalculoNivelSisbenDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/personas", name = "respuestaCalculo")
    public JAXBElement<TipoRespuestaCalculoNivelSisbenDTO> createRespuestaCalculo(TipoRespuestaCalculoNivelSisbenDTO value) {
        return new JAXBElement<TipoRespuestaCalculoNivelSisbenDTO>(_RespuestaCalculo_QNAME, TipoRespuestaCalculoNivelSisbenDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionBasicaSisben }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/personas", name = "datosCalculo")
    public JAXBElement<TipoInformacionBasicaSisben> createDatosCalculo(TipoInformacionBasicaSisben value) {
        return new JAXBElement<TipoInformacionBasicaSisben>(_DatosCalculo_QNAME, TipoInformacionBasicaSisben.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionPrevinculado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/personas", name = "InformacionPrevinculado")
    public JAXBElement<TipoInformacionPrevinculado> createInformacionPrevinculado(TipoInformacionPrevinculado value) {
        return new JAXBElement<TipoInformacionPrevinculado>(_InformacionPrevinculado_QNAME, TipoInformacionPrevinculado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEstadoEjecucion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/beps/schemas/1.0/comun", name = "EstadoEjecucion")
    public JAXBElement<TipoEstadoEjecucion> createEstadoEjecucion(TipoEstadoEjecucion value) {
        return new JAXBElement<TipoEstadoEjecucion>(_EstadoEjecucion_QNAME, TipoEstadoEjecucion.class, null, value);
    }



}
