
package co.gov.colpensiones.schemas.indicios.pagoprestacioneseconomicas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import co.gov.colpensiones.schemas.indicios.comun.TipoPropiedadesCertificado;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.gov.colpensiones.schemas._1_0.pagoprestacioneseconomicas package. 
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

    private final static QName _TipoPropiedadesCertificado_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/pagoprestacioneseconomicas", "tipoPropiedadesCertificado");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.colpensiones.schemas._1_0.pagoprestacioneseconomicas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoPropiedadesCertificado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/pagoprestacioneseconomicas", name = "tipoPropiedadesCertificado")
    public JAXBElement<TipoPropiedadesCertificado> createTipoPropiedadesCertificado(TipoPropiedadesCertificado value) {
        return new JAXBElement<TipoPropiedadesCertificado>(_TipoPropiedadesCertificado_QNAME, TipoPropiedadesCertificado.class, null, value);
    }

}
