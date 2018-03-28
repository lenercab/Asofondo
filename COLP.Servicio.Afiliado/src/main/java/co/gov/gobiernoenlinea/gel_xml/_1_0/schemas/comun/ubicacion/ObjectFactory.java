
package co.gov.gobiernoenlinea.gel_xml._1_0.schemas.comun.ubicacion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.gov.gobiernoenlinea.gel_xml._1_0.schemas.comun.ubicacion package. 
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

    private final static QName _TipoDatoTelefono_QNAME = new QName("http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/Comun/Ubicacion", "tipoDatoTelefono");
    private final static QName _EnumNomTipoTelefono_QNAME = new QName("http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/Comun/Ubicacion", "enumNomTipoTelefono");
    private final static QName _TipoTipoTelefono_QNAME = new QName("http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/Comun/Ubicacion", "tipoTipoTelefono");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.gobiernoenlinea.gel_xml._1_0.schemas.comun.ubicacion
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoDatoTelefono }
     * 
     */
    public TipoDatoTelefono createTipoDatoTelefono() {
        return new TipoDatoTelefono();
    }

    /**
     * Create an instance of {@link TipoTipoTelefono }
     * 
     */
    public TipoTipoTelefono createTipoTipoTelefono() {
        return new TipoTipoTelefono();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoDatoTelefono }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/Comun/Ubicacion", name = "tipoDatoTelefono")
    public JAXBElement<TipoDatoTelefono> createTipoDatoTelefono(TipoDatoTelefono value) {
        return new JAXBElement<TipoDatoTelefono>(_TipoDatoTelefono_QNAME, TipoDatoTelefono.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumNomTipoTelefono }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/Comun/Ubicacion", name = "enumNomTipoTelefono")
    public JAXBElement<EnumNomTipoTelefono> createEnumNomTipoTelefono(EnumNomTipoTelefono value) {
        return new JAXBElement<EnumNomTipoTelefono>(_EnumNomTipoTelefono_QNAME, EnumNomTipoTelefono.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoTipoTelefono }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/Comun/Ubicacion", name = "tipoTipoTelefono")
    public JAXBElement<TipoTipoTelefono> createTipoTipoTelefono(TipoTipoTelefono value) {
        return new JAXBElement<TipoTipoTelefono>(_TipoTipoTelefono_QNAME, TipoTipoTelefono.class, null, value);
    }

}
