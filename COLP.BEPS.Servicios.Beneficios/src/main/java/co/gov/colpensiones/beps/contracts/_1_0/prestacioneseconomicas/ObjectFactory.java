
package co.gov.colpensiones.beps.contracts._1_0.prestacioneseconomicas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import co.gov.colpensiones.beps.schemas._1_0.comun.TipoEstadoEjecucion;
import co.gov.colpensiones.beps.schemas._1_0.prestacioneseconomicas.TipoSolicitudDestinacionRecursos;
import co.gov.colpensiones.beps.schemas._1_0.prestacioneseconomicas.TipoSolicitudDevolucionAhorrosHerederos;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.gov.colpensiones.beps.contracts._1_0.prestacioneseconomicas package. 
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

    private final static QName _TipoEstadoEjecucion_QNAME = new QName("http://www.colpensiones.gov.co/beps/contracts/1.0/prestacioneseconomicas", "tipoEstadoEjecucion");
    private final static QName _InformacionSolicitudDestinacionRecursos_QNAME = new QName("http://www.colpensiones.gov.co/beps/contracts/1.0/prestacioneseconomicas", "informacionSolicitudDestinacionRecursos");
    private final static QName _EstadoEjecucion_QNAME = new QName("http://www.colpensiones.gov.co/beps/contracts/1.0/prestacioneseconomicas", "estadoEjecucion");
    private final static QName _InformacionSolicitudDevolucionAhorrosHerederos_QNAME = new QName("http://www.colpensiones.gov.co/beps/contracts/1.0/prestacioneseconomicas", "informacionSolicitudDevolucionAhorrosHerederos");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.colpensiones.beps.contracts._1_0.prestacioneseconomicas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEstadoEjecucion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/prestacioneseconomicas", name = "tipoEstadoEjecucion")
    public JAXBElement<TipoEstadoEjecucion> createTipoEstadoEjecucion(TipoEstadoEjecucion value) {
        return new JAXBElement<TipoEstadoEjecucion>(_TipoEstadoEjecucion_QNAME, TipoEstadoEjecucion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSolicitudDestinacionRecursos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/prestacioneseconomicas", name = "informacionSolicitudDestinacionRecursos")
    public JAXBElement<TipoSolicitudDestinacionRecursos> createInformacionSolicitudDestinacionRecursos(TipoSolicitudDestinacionRecursos value) {
        return new JAXBElement<TipoSolicitudDestinacionRecursos>(_InformacionSolicitudDestinacionRecursos_QNAME, TipoSolicitudDestinacionRecursos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/prestacioneseconomicas", name = "estadoEjecucion")
    public JAXBElement<String> createEstadoEjecucion(String value) {
        return new JAXBElement<String>(_EstadoEjecucion_QNAME, String.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSolicitudDevolucionAhorrosHerederosvalue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/prestacioneseconomicas", name = "informacionSolicitudDevolucionAhorrosHerederos")
    public JAXBElement<TipoSolicitudDevolucionAhorrosHerederos> createInformacionSolicitudDevolucionAhorrosHerederos(TipoSolicitudDevolucionAhorrosHerederos value) {
        return new JAXBElement<TipoSolicitudDevolucionAhorrosHerederos>(_InformacionSolicitudDevolucionAhorrosHerederos_QNAME, TipoSolicitudDevolucionAhorrosHerederos.class, null, value);
    }

}
