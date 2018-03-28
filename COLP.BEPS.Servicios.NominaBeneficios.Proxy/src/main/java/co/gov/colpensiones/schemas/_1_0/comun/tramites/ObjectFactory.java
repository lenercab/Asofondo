
package co.gov.colpensiones.schemas._1_0.comun.tramites;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.gov.colpensiones.schemas._1_0.comun.tramites package. 
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

    private final static QName _TipoIdentificacionTramite_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/comun/tramites", "tipoIdentificacionTramite");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.colpensiones.schemas._1_0.comun.tramites
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoIdentificacionTramite }
     * 
     */
    public TipoIdentificacionTramite createTipoIdentificacionTramite() {
        return new TipoIdentificacionTramite();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoIdentificacionTramite }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/comun/tramites", name = "tipoIdentificacionTramite")
    public JAXBElement<TipoIdentificacionTramite> createTipoIdentificacionTramite(TipoIdentificacionTramite value) {
        return new JAXBElement<TipoIdentificacionTramite>(_TipoIdentificacionTramite_QNAME, TipoIdentificacionTramite.class, null, value);
    }

}
