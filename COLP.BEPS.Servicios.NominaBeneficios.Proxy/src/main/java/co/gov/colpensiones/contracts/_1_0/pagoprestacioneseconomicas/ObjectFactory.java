
package co.gov.colpensiones.contracts._1_0.pagoprestacioneseconomicas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import co.gov.colpensiones.schemas._1_0.pagoprestacioneseconomicas.TipoCriterioConsultaPensionado;
import co.gov.colpensiones.schemas._1_0.pagoprestacioneseconomicas.TipoCriteriosCertificacionFechaPeriodoDTO;
import co.gov.colpensiones.schemas._1_0.pagoprestacioneseconomicas.TipoCriteriosExistenciaPension;
import co.gov.colpensiones.schemas._1_0.pagoprestacioneseconomicas.TipoCriteriosExistenciaPensionDTO;
import co.gov.colpensiones.schemas._1_0.pagoprestacioneseconomicas.TipoInformacionAportesSaludDTO;
import co.gov.colpensiones.schemas._1_0.pagoprestacioneseconomicas.TipoInformacionConsultaGeneralPensionadoDTO;
import co.gov.colpensiones.schemas._1_0.pagoprestacioneseconomicas.TipoInformacionExistenciaPensionDTO;
import co.gov.colpensiones.schemas._1_0.personas.TipoIdentificacionPersona;
import co.gov.colpensiones.schemas._1_0.personas.TipoInformacionCertificacionDTO;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.gov.colpensiones.contracts._1_0.pagoprestacioneseconomicas package. 
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

    private final static QName _CriteriosExistenciaPensionDTO_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/pagoprestacioneseconomicas", "CriteriosExistenciaPensionDTO");
    private final static QName _InformacionCertificacion_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/pagoprestacioneseconomicas", "InformacionCertificacion");
    private final static QName _InformacionAportesSaludDTO_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/pagoprestacioneseconomicas", "InformacionAportesSaludDTO");
    private final static QName _TipoCriteriosCertificacionFechaPeriodoDTO_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/pagoprestacioneseconomicas", "tipoCriteriosCertificacionFechaPeriodoDTO");
    private final static QName _InformacionPensionado_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/pagoprestacioneseconomicas", "InformacionPensionado");
    private final static QName _CriterioConsultaPensionado_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/pagoprestacioneseconomicas", "CriterioConsultaPensionado");
    private final static QName _InformacionConsultaGeneralPensionadoDTO_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/pagoprestacioneseconomicas", "InformacionConsultaGeneralPensionadoDTO");
    private final static QName _CriteriosCertificacionFechaPeriodoDTO_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/pagoprestacioneseconomicas", "CriteriosCertificacionFechaPeriodoDTO");
    private final static QName _InformacionCertificacionDTO_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/pagoprestacioneseconomicas", "InformacionCertificacionDTO");
    private final static QName _CriteriosExistenciaPension_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/pagoprestacioneseconomicas", "CriteriosExistenciaPension");
    private final static QName _IdentificacionPersona_QNAME = new QName("http://www.colpensiones.gov.co/contracts/1.0/pagoprestacioneseconomicas", "IdentificacionPersona");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.colpensiones.contracts._1_0.pagoprestacioneseconomicas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoCriteriosExistenciaPensionDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/pagoprestacioneseconomicas", name = "CriteriosExistenciaPensionDTO")
    public JAXBElement<TipoCriteriosExistenciaPensionDTO> createCriteriosExistenciaPensionDTO(TipoCriteriosExistenciaPensionDTO value) {
        return new JAXBElement<TipoCriteriosExistenciaPensionDTO>(_CriteriosExistenciaPensionDTO_QNAME, TipoCriteriosExistenciaPensionDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionExistenciaPensionDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/pagoprestacioneseconomicas", name = "InformacionCertificacion")
    public JAXBElement<TipoInformacionExistenciaPensionDTO> createInformacionCertificacion(TipoInformacionExistenciaPensionDTO value) {
        return new JAXBElement<TipoInformacionExistenciaPensionDTO>(_InformacionCertificacion_QNAME, TipoInformacionExistenciaPensionDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionAportesSaludDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/pagoprestacioneseconomicas", name = "InformacionAportesSaludDTO")
    public JAXBElement<TipoInformacionAportesSaludDTO> createInformacionAportesSaludDTO(TipoInformacionAportesSaludDTO value) {
        return new JAXBElement<TipoInformacionAportesSaludDTO>(_InformacionAportesSaludDTO_QNAME, TipoInformacionAportesSaludDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoCriteriosCertificacionFechaPeriodoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/pagoprestacioneseconomicas", name = "tipoCriteriosCertificacionFechaPeriodoDTO")
    public JAXBElement<TipoCriteriosCertificacionFechaPeriodoDTO> createTipoCriteriosCertificacionFechaPeriodoDTO(TipoCriteriosCertificacionFechaPeriodoDTO value) {
        return new JAXBElement<TipoCriteriosCertificacionFechaPeriodoDTO>(_TipoCriteriosCertificacionFechaPeriodoDTO_QNAME, TipoCriteriosCertificacionFechaPeriodoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionConsultaGeneralPensionadoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/pagoprestacioneseconomicas", name = "InformacionPensionado")
    public JAXBElement<TipoInformacionConsultaGeneralPensionadoDTO> createInformacionPensionado(TipoInformacionConsultaGeneralPensionadoDTO value) {
        return new JAXBElement<TipoInformacionConsultaGeneralPensionadoDTO>(_InformacionPensionado_QNAME, TipoInformacionConsultaGeneralPensionadoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoCriterioConsultaPensionado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/pagoprestacioneseconomicas", name = "CriterioConsultaPensionado")
    public JAXBElement<TipoCriterioConsultaPensionado> createCriterioConsultaPensionado(TipoCriterioConsultaPensionado value) {
        return new JAXBElement<TipoCriterioConsultaPensionado>(_CriterioConsultaPensionado_QNAME, TipoCriterioConsultaPensionado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionConsultaGeneralPensionadoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/pagoprestacioneseconomicas", name = "InformacionConsultaGeneralPensionadoDTO")
    public JAXBElement<TipoInformacionConsultaGeneralPensionadoDTO> createInformacionConsultaGeneralPensionadoDTO(TipoInformacionConsultaGeneralPensionadoDTO value) {
        return new JAXBElement<TipoInformacionConsultaGeneralPensionadoDTO>(_InformacionConsultaGeneralPensionadoDTO_QNAME, TipoInformacionConsultaGeneralPensionadoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoCriteriosCertificacionFechaPeriodoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/pagoprestacioneseconomicas", name = "CriteriosCertificacionFechaPeriodoDTO")
    public JAXBElement<TipoCriteriosCertificacionFechaPeriodoDTO> createCriteriosCertificacionFechaPeriodoDTO(TipoCriteriosCertificacionFechaPeriodoDTO value) {
        return new JAXBElement<TipoCriteriosCertificacionFechaPeriodoDTO>(_CriteriosCertificacionFechaPeriodoDTO_QNAME, TipoCriteriosCertificacionFechaPeriodoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionCertificacionDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/pagoprestacioneseconomicas", name = "InformacionCertificacionDTO")
    public JAXBElement<TipoInformacionCertificacionDTO> createInformacionCertificacionDTO(TipoInformacionCertificacionDTO value) {
        return new JAXBElement<TipoInformacionCertificacionDTO>(_InformacionCertificacionDTO_QNAME, TipoInformacionCertificacionDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoCriteriosExistenciaPension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/pagoprestacioneseconomicas", name = "CriteriosExistenciaPension")
    public JAXBElement<TipoCriteriosExistenciaPension> createCriteriosExistenciaPension(TipoCriteriosExistenciaPension value) {
        return new JAXBElement<TipoCriteriosExistenciaPension>(_CriteriosExistenciaPension_QNAME, TipoCriteriosExistenciaPension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoIdentificacionPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/contracts/1.0/pagoprestacioneseconomicas", name = "IdentificacionPersona")
    public JAXBElement<TipoIdentificacionPersona> createIdentificacionPersona(TipoIdentificacionPersona value) {
        return new JAXBElement<TipoIdentificacionPersona>(_IdentificacionPersona_QNAME, TipoIdentificacionPersona.class, null, value);
    }

}
