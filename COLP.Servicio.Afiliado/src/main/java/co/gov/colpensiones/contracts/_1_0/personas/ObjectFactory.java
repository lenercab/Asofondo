
package co.gov.colpensiones.contracts._1_0.personas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import co.gov.colpensiones.schemas._1_0.comun.errores.TipoEstadoEjecucion;
import co.gov.colpensiones.schemas._1_0.personas.TipoCriteriosCertificacionAfiliacionDTO;
import co.gov.colpensiones.schemas._1_0.personas.TipoEstadoAfiliacionFondosPrivadosDTO;
import co.gov.colpensiones.schemas._1_0.personas.TipoIdentificacionPersona;
import co.gov.colpensiones.schemas._1_0.personas.TipoInformacionActualizacionAfiliacionDTO;
import co.gov.colpensiones.schemas._1_0.personas.TipoInformacionBasicaIdentificacionPersona;
import co.gov.colpensiones.schemas._1_0.personas.TipoInformacionCertificacionDTO;
import co.gov.colpensiones.schemas._1_0.personas.TipoInformacionGeneralPersonaDTO;
import co.gov.colpensiones.schemas._1_0.personas.TipoInformacionRegistroInicialAfiliacionDTO;
import co.gov.colpensiones.schemas._1_0.personas.TipoInformacionRegistroRelacionLaboralDTO;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.gov.colpensiones.contracts._1_0.personas package. 
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

    private final static QName _CriteriosCertificacionAfiliacionDTO_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "CriteriosCertificacionAfiliacionDTO");
    private final static QName _InformacionBasicaAfiliado_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "InformacionBasicaAfiliado");
    private final static QName _InformacionActualizacionAfiliacionDTO_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "InformacionActualizacionAfiliacionDTO");
    private final static QName _InformacionRegistroRelacionLaboralDTO_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "InformacionRegistroRelacionLaboralDTO");
    private final static QName _InformacionRegistroInicialAfiliacionDTO_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "InformacionRegistroInicialAfiliacionDTO");
    private final static QName _InformacionGeneralPersonaDTO_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "InformacionGeneralPersonaDTO");
    private final static QName _IdentificacionPersona_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "IdentificacionPersona");
    private final static QName _EstadoEjecucion_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "EstadoEjecucion");
    private final static QName _EstadoAfiliacionFondosPrivadosDTO_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "EstadoAfiliacionFondosPrivadosDTO");
    private final static QName _InformacionCertificacionDTO_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "InformacionCertificacionDTO");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.colpensiones.contracts._1_0.personas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoCriteriosCertificacionAfiliacionDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/personas", name = "CriteriosCertificacionAfiliacionDTO")
    public JAXBElement<TipoCriteriosCertificacionAfiliacionDTO> createCriteriosCertificacionAfiliacionDTO(TipoCriteriosCertificacionAfiliacionDTO value) {
        return new JAXBElement<TipoCriteriosCertificacionAfiliacionDTO>(_CriteriosCertificacionAfiliacionDTO_QNAME, TipoCriteriosCertificacionAfiliacionDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionBasicaIdentificacionPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/personas", name = "InformacionBasicaAfiliado")
    public JAXBElement<TipoInformacionBasicaIdentificacionPersona> createInformacionBasicaAfiliado(TipoInformacionBasicaIdentificacionPersona value) {
        return new JAXBElement<TipoInformacionBasicaIdentificacionPersona>(_InformacionBasicaAfiliado_QNAME, TipoInformacionBasicaIdentificacionPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionActualizacionAfiliacionDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/personas", name = "InformacionActualizacionAfiliacionDTO")
    public JAXBElement<TipoInformacionActualizacionAfiliacionDTO> createInformacionActualizacionAfiliacionDTO(TipoInformacionActualizacionAfiliacionDTO value) {
        return new JAXBElement<TipoInformacionActualizacionAfiliacionDTO>(_InformacionActualizacionAfiliacionDTO_QNAME, TipoInformacionActualizacionAfiliacionDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionRegistroRelacionLaboralDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/personas", name = "InformacionRegistroRelacionLaboralDTO")
    public JAXBElement<TipoInformacionRegistroRelacionLaboralDTO> createInformacionRegistroRelacionLaboralDTO(TipoInformacionRegistroRelacionLaboralDTO value) {
        return new JAXBElement<TipoInformacionRegistroRelacionLaboralDTO>(_InformacionRegistroRelacionLaboralDTO_QNAME, TipoInformacionRegistroRelacionLaboralDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionRegistroInicialAfiliacionDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/personas", name = "InformacionRegistroInicialAfiliacionDTO")
    public JAXBElement<TipoInformacionRegistroInicialAfiliacionDTO> createInformacionRegistroInicialAfiliacionDTO(TipoInformacionRegistroInicialAfiliacionDTO value) {
        return new JAXBElement<TipoInformacionRegistroInicialAfiliacionDTO>(_InformacionRegistroInicialAfiliacionDTO_QNAME, TipoInformacionRegistroInicialAfiliacionDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionGeneralPersonaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/personas", name = "InformacionGeneralPersonaDTO")
    public JAXBElement<TipoInformacionGeneralPersonaDTO> createInformacionGeneralPersonaDTO(TipoInformacionGeneralPersonaDTO value) {
        return new JAXBElement<TipoInformacionGeneralPersonaDTO>(_InformacionGeneralPersonaDTO_QNAME, TipoInformacionGeneralPersonaDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoIdentificacionPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/personas", name = "IdentificacionPersona")
    public JAXBElement<TipoIdentificacionPersona> createIdentificacionPersona(TipoIdentificacionPersona value) {
        return new JAXBElement<TipoIdentificacionPersona>(_IdentificacionPersona_QNAME, TipoIdentificacionPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEstadoEjecucion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/personas", name = "EstadoEjecucion")
    public JAXBElement<TipoEstadoEjecucion> createEstadoEjecucion(TipoEstadoEjecucion value) {
        return new JAXBElement<TipoEstadoEjecucion>(_EstadoEjecucion_QNAME, TipoEstadoEjecucion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEstadoAfiliacionFondosPrivadosDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/personas", name = "EstadoAfiliacionFondosPrivadosDTO")
    public JAXBElement<TipoEstadoAfiliacionFondosPrivadosDTO> createEstadoAfiliacionFondosPrivadosDTO(TipoEstadoAfiliacionFondosPrivadosDTO value) {
        return new JAXBElement<TipoEstadoAfiliacionFondosPrivadosDTO>(_EstadoAfiliacionFondosPrivadosDTO_QNAME, TipoEstadoAfiliacionFondosPrivadosDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionCertificacionDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/personas", name = "InformacionCertificacionDTO")
    public JAXBElement<TipoInformacionCertificacionDTO> createInformacionCertificacionDTO(TipoInformacionCertificacionDTO value) {
        return new JAXBElement<TipoInformacionCertificacionDTO>(_InformacionCertificacionDTO_QNAME, TipoInformacionCertificacionDTO.class, null, value);
    }

}
