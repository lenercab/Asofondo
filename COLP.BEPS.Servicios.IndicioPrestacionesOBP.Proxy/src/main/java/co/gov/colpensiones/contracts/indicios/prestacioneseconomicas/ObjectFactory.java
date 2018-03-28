
package co.gov.colpensiones.contracts.indicios.prestacioneseconomicas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import co.gov.colpensiones.schemas.indicios.comun.errores.TipoEstadoEjecucion;
import co.gov.colpensiones.schemas.indicios.personas.TipoIdentificacionPersona;
import co.gov.colpensiones.schemas.indicios.prestacioneseconomicas.TipoInformacionConsultaGeneralCausanteDTO;
import co.gov.colpensiones.schemas.indicios.prestacioneseconomicas.TipoInformacionPensionOBP;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.gov.colpensiones.contracts.indicios.prestacioneseconomicas package. 
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

    private final static QName _IdentificacionPersona_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/prestacioneseconomicas", "IdentificacionPersona");
    private final static QName _InformacionConsultaGeneralCausanteDTO_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/prestacioneseconomicas", "InformacionConsultaGeneralCausanteDTO");
    private final static QName _EstadoEjecucion_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/prestacioneseconomicas", "EstadoEjecucion");
    private final static QName _InformacionPensionOBP_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/prestacioneseconomicas", "InformacionPensionOBP");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.colpensiones.contracts.indicios.prestacioneseconomicas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoIdentificacionPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/prestacioneseconomicas", name = "IdentificacionPersona")
    public JAXBElement<TipoIdentificacionPersona> createIdentificacionPersona(TipoIdentificacionPersona value) {
        return new JAXBElement<TipoIdentificacionPersona>(_IdentificacionPersona_QNAME, TipoIdentificacionPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionConsultaGeneralCausanteDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/prestacioneseconomicas", name = "InformacionConsultaGeneralCausanteDTO")
    public JAXBElement<TipoInformacionConsultaGeneralCausanteDTO> createInformacionConsultaGeneralCausanteDTO(TipoInformacionConsultaGeneralCausanteDTO value) {
        return new JAXBElement<TipoInformacionConsultaGeneralCausanteDTO>(_InformacionConsultaGeneralCausanteDTO_QNAME, TipoInformacionConsultaGeneralCausanteDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEstadoEjecucion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/prestacioneseconomicas", name = "EstadoEjecucion")
    public JAXBElement<TipoEstadoEjecucion> createEstadoEjecucion(TipoEstadoEjecucion value) {
        return new JAXBElement<TipoEstadoEjecucion>(_EstadoEjecucion_QNAME, TipoEstadoEjecucion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionPensionOBP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/prestacioneseconomicas", name = "InformacionPensionOBP")
    public JAXBElement<TipoInformacionPensionOBP> createInformacionPensionOBP(TipoInformacionPensionOBP value) {
        return new JAXBElement<TipoInformacionPensionOBP>(_InformacionPensionOBP_QNAME, TipoInformacionPensionOBP.class, null, value);
    }

}
