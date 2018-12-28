
package co.gov.colpensiones.schemas._1_0.comun;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import co.gov.colpensiones.schemas._1_0.personas.TipoInformacionCertificacionDTO;
import co.gov.colpensiones.schemas._1_0.personas.TipoInformacionDocumentoCertificacion;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.gov.colpensiones.schemas._1_0.comun package. 
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

    private final static QName _TipoRespuestaRadicacionCasoBPMDTO_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/comun", "tipoRespuestaRadicacionCasoBPMDTO");
    private final static QName _TipoInformacionCertificacionDTO_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/comun", "tipoInformacionCertificacionDTO");
    private final static QName _TipoCriteriosConsultaPersonalizadaBPM_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/comun", "tipoCriteriosConsultaPersonalizadaBPM");
    private final static QName _TipoInformacionGeneralConsultaBPMDTO_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/comun", "tipoInformacionGeneralConsultaBPMDTO");
    private final static QName _TipoRespuestaConsultaEntidadBPM_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/comun", "tipoRespuestaConsultaEntidadBPM");
    private final static QName _TipoInformacionEventoCasoBPM_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/comun", "tipoInformacionEventoCasoBPM");
    private final static QName _TipoInformacionProcesoDTO_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/comun", "tipoInformacionProcesoDTO");
    private final static QName _TipoCriteriosConsultaProcesoDTO_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/comun", "tipoCriteriosConsultaProcesoDTO");
    private final static QName _TipoBanco_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/comun", "tipoBanco");
    private final static QName _TipoItem_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/comun", "tipoItem");
    private final static QName _TipoRespuestaRadicacionCasoBPM_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/comun", "tipoRespuestaRadicacionCasoBPM");
    private final static QName _TipoConfiguracionCertificado_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/comun", "tipoConfiguracionCertificado");
    private final static QName _TipoControlCambios_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/comun", "tipoControlCambios");
    private final static QName _TipoValor_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/comun", "tipoValor");
    private final static QName _TipoEstado_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/comun", "tipoEstado");
    private final static QName _TipoInformacionDocumentoCertificacion_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/comun", "tipoInformacionDocumentoCertificacion");
    private final static QName _TipoInformacionRadicacionCasoBPM_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/comun", "tipoInformacionRadicacionCasoBPM");
    private final static QName _TipoRangoFecha_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/comun", "tipoRangoFecha");
    private final static QName _TipoEntidadOrganizacional_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/comun", "tipoEntidadOrganizacional");
    private final static QName _TipoIdentificacionTarea_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/comun", "tipoIdentificacionTarea");
    private final static QName _TipoCriteriosEntidadNegocio_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/comun", "tipoCriteriosEntidadNegocio");
    private final static QName _TipoCredencialesAutorizacion_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/comun", "tipoCredencialesAutorizacion");
    private final static QName _TipoSucursalBanco_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/comun", "tipoSucursalBanco");
    private final static QName _TipoCausalError_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/comun", "tipoCausalError");
    private final static QName _TipoRespuestaTarea_QNAME = new QName("http://www.colpensiones.gov.co/schemas/1.0/comun", "tipoRespuestaTarea");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.colpensiones.schemas._1_0.comun
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoPropiedadesCertificado }
     * 
     */
    public TipoPropiedadesCertificado createTipoPropiedadesCertificado() {
        return new TipoPropiedadesCertificado();
    }

    /**
     * Create an instance of {@link TipoRangoFecha }
     * 
     */
    public TipoRangoFecha createTipoRangoFecha() {
        return new TipoRangoFecha();
    }

    /**
     * Create an instance of {@link TipoInformacionEventoCasoBPM }
     * 
     */
    public TipoInformacionEventoCasoBPM createTipoInformacionEventoCasoBPM() {
        return new TipoInformacionEventoCasoBPM();
    }

    /**
     * Create an instance of {@link TipoRespuestaTarea }
     * 
     */
    public TipoRespuestaTarea createTipoRespuestaTarea() {
        return new TipoRespuestaTarea();
    }

    /**
     * Create an instance of {@link TipoRespuestaRadicacionCasoBPM }
     * 
     */
    public TipoRespuestaRadicacionCasoBPM createTipoRespuestaRadicacionCasoBPM() {
        return new TipoRespuestaRadicacionCasoBPM();
    }

    /**
     * Create an instance of {@link TipoRespuestaConsultaEntidadBPM }
     * 
     */
    public TipoRespuestaConsultaEntidadBPM createTipoRespuestaConsultaEntidadBPM() {
        return new TipoRespuestaConsultaEntidadBPM();
    }

    /**
     * Create an instance of {@link TipoCausalError }
     * 
     */
    public TipoCausalError createTipoCausalError() {
        return new TipoCausalError();
    }

    /**
     * Create an instance of {@link TipoIdentificacionTarea }
     * 
     */
    public TipoIdentificacionTarea createTipoIdentificacionTarea() {
        return new TipoIdentificacionTarea();
    }

    /**
     * Create an instance of {@link TipoInformacionRadicacionCasoBPM }
     * 
     */
    public TipoInformacionRadicacionCasoBPM createTipoInformacionRadicacionCasoBPM() {
        return new TipoInformacionRadicacionCasoBPM();
    }

    /**
     * Create an instance of {@link TipoInformacionGeneralConsultaBPMDTO }
     * 
     */
    public TipoInformacionGeneralConsultaBPMDTO createTipoInformacionGeneralConsultaBPMDTO() {
        return new TipoInformacionGeneralConsultaBPMDTO();
    }

    /**
     * Create an instance of {@link TipoCriteriosConsultaPersonalizadaBPM }
     * 
     */
    public TipoCriteriosConsultaPersonalizadaBPM createTipoCriteriosConsultaPersonalizadaBPM() {
        return new TipoCriteriosConsultaPersonalizadaBPM();
    }

    /**
     * Create an instance of {@link TipoBanco }
     * 
     */
    public TipoBanco createTipoBanco() {
        return new TipoBanco();
    }

    /**
     * Create an instance of {@link TipoSucursalBanco }
     * 
     */
    public TipoSucursalBanco createTipoSucursalBanco() {
        return new TipoSucursalBanco();
    }

    /**
     * Create an instance of {@link TipoConfiguracionCertificado }
     * 
     */
    public TipoConfiguracionCertificado createTipoConfiguracionCertificado() {
        return new TipoConfiguracionCertificado();
    }

    /**
     * Create an instance of {@link TipoValor }
     * 
     */
    public TipoValor createTipoValor() {
        return new TipoValor();
    }

    /**
     * Create an instance of {@link TipoRespuestaRadicacionCasoBPMDTO }
     * 
     */
    public TipoRespuestaRadicacionCasoBPMDTO createTipoRespuestaRadicacionCasoBPMDTO() {
        return new TipoRespuestaRadicacionCasoBPMDTO();
    }

    /**
     * Create an instance of {@link TipoItem }
     * 
     */
    public TipoItem createTipoItem() {
        return new TipoItem();
    }

    /**
     * Create an instance of {@link TipoCriteriosEntidadNegocio }
     * 
     */
    public TipoCriteriosEntidadNegocio createTipoCriteriosEntidadNegocio() {
        return new TipoCriteriosEntidadNegocio();
    }

    /**
     * Create an instance of {@link TipoEntidadOrganizacional }
     * 
     */
    public TipoEntidadOrganizacional createTipoEntidadOrganizacional() {
        return new TipoEntidadOrganizacional();
    }

    /**
     * Create an instance of {@link TipoCriteriosConsultaProcesoDTO }
     * 
     */
    public TipoCriteriosConsultaProcesoDTO createTipoCriteriosConsultaProcesoDTO() {
        return new TipoCriteriosConsultaProcesoDTO();
    }

    /**
     * Create an instance of {@link TipoEstado }
     * 
     */
    public TipoEstado createTipoEstado() {
        return new TipoEstado();
    }

    /**
     * Create an instance of {@link TipoCredencialesAutorizacion }
     * 
     */
    public TipoCredencialesAutorizacion createTipoCredencialesAutorizacion() {
        return new TipoCredencialesAutorizacion();
    }

    /**
     * Create an instance of {@link TipoInformacionProcesoDTO }
     * 
     */
    public TipoInformacionProcesoDTO createTipoInformacionProcesoDTO() {
        return new TipoInformacionProcesoDTO();
    }

    /**
     * Create an instance of {@link TipoControlCambios }
     * 
     */
    public TipoControlCambios createTipoControlCambios() {
        return new TipoControlCambios();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoRespuestaRadicacionCasoBPMDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/comun", name = "tipoRespuestaRadicacionCasoBPMDTO")
    public JAXBElement<TipoRespuestaRadicacionCasoBPMDTO> createTipoRespuestaRadicacionCasoBPMDTO(TipoRespuestaRadicacionCasoBPMDTO value) {
        return new JAXBElement<TipoRespuestaRadicacionCasoBPMDTO>(_TipoRespuestaRadicacionCasoBPMDTO_QNAME, TipoRespuestaRadicacionCasoBPMDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionCertificacionDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/comun", name = "tipoInformacionCertificacionDTO")
    public JAXBElement<TipoInformacionCertificacionDTO> createTipoInformacionCertificacionDTO(TipoInformacionCertificacionDTO value) {
        return new JAXBElement<TipoInformacionCertificacionDTO>(_TipoInformacionCertificacionDTO_QNAME, TipoInformacionCertificacionDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoCriteriosConsultaPersonalizadaBPM }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/comun", name = "tipoCriteriosConsultaPersonalizadaBPM")
    public JAXBElement<TipoCriteriosConsultaPersonalizadaBPM> createTipoCriteriosConsultaPersonalizadaBPM(TipoCriteriosConsultaPersonalizadaBPM value) {
        return new JAXBElement<TipoCriteriosConsultaPersonalizadaBPM>(_TipoCriteriosConsultaPersonalizadaBPM_QNAME, TipoCriteriosConsultaPersonalizadaBPM.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionGeneralConsultaBPMDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/comun", name = "tipoInformacionGeneralConsultaBPMDTO")
    public JAXBElement<TipoInformacionGeneralConsultaBPMDTO> createTipoInformacionGeneralConsultaBPMDTO(TipoInformacionGeneralConsultaBPMDTO value) {
        return new JAXBElement<TipoInformacionGeneralConsultaBPMDTO>(_TipoInformacionGeneralConsultaBPMDTO_QNAME, TipoInformacionGeneralConsultaBPMDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoRespuestaConsultaEntidadBPM }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/comun", name = "tipoRespuestaConsultaEntidadBPM")
    public JAXBElement<TipoRespuestaConsultaEntidadBPM> createTipoRespuestaConsultaEntidadBPM(TipoRespuestaConsultaEntidadBPM value) {
        return new JAXBElement<TipoRespuestaConsultaEntidadBPM>(_TipoRespuestaConsultaEntidadBPM_QNAME, TipoRespuestaConsultaEntidadBPM.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionEventoCasoBPM }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/comun", name = "tipoInformacionEventoCasoBPM")
    public JAXBElement<TipoInformacionEventoCasoBPM> createTipoInformacionEventoCasoBPM(TipoInformacionEventoCasoBPM value) {
        return new JAXBElement<TipoInformacionEventoCasoBPM>(_TipoInformacionEventoCasoBPM_QNAME, TipoInformacionEventoCasoBPM.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionProcesoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/comun", name = "tipoInformacionProcesoDTO")
    public JAXBElement<TipoInformacionProcesoDTO> createTipoInformacionProcesoDTO(TipoInformacionProcesoDTO value) {
        return new JAXBElement<TipoInformacionProcesoDTO>(_TipoInformacionProcesoDTO_QNAME, TipoInformacionProcesoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoCriteriosConsultaProcesoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/comun", name = "tipoCriteriosConsultaProcesoDTO")
    public JAXBElement<TipoCriteriosConsultaProcesoDTO> createTipoCriteriosConsultaProcesoDTO(TipoCriteriosConsultaProcesoDTO value) {
        return new JAXBElement<TipoCriteriosConsultaProcesoDTO>(_TipoCriteriosConsultaProcesoDTO_QNAME, TipoCriteriosConsultaProcesoDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoBanco }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/comun", name = "tipoBanco")
    public JAXBElement<TipoBanco> createTipoBanco(TipoBanco value) {
        return new JAXBElement<TipoBanco>(_TipoBanco_QNAME, TipoBanco.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/comun", name = "tipoItem")
    public JAXBElement<TipoItem> createTipoItem(TipoItem value) {
        return new JAXBElement<TipoItem>(_TipoItem_QNAME, TipoItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoRespuestaRadicacionCasoBPM }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/comun", name = "tipoRespuestaRadicacionCasoBPM")
    public JAXBElement<TipoRespuestaRadicacionCasoBPM> createTipoRespuestaRadicacionCasoBPM(TipoRespuestaRadicacionCasoBPM value) {
        return new JAXBElement<TipoRespuestaRadicacionCasoBPM>(_TipoRespuestaRadicacionCasoBPM_QNAME, TipoRespuestaRadicacionCasoBPM.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoConfiguracionCertificado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/comun", name = "tipoConfiguracionCertificado")
    public JAXBElement<TipoConfiguracionCertificado> createTipoConfiguracionCertificado(TipoConfiguracionCertificado value) {
        return new JAXBElement<TipoConfiguracionCertificado>(_TipoConfiguracionCertificado_QNAME, TipoConfiguracionCertificado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoControlCambios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/comun", name = "tipoControlCambios")
    public JAXBElement<TipoControlCambios> createTipoControlCambios(TipoControlCambios value) {
        return new JAXBElement<TipoControlCambios>(_TipoControlCambios_QNAME, TipoControlCambios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoValor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/comun", name = "tipoValor")
    public JAXBElement<TipoValor> createTipoValor(TipoValor value) {
        return new JAXBElement<TipoValor>(_TipoValor_QNAME, TipoValor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEstado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/comun", name = "tipoEstado")
    public JAXBElement<TipoEstado> createTipoEstado(TipoEstado value) {
        return new JAXBElement<TipoEstado>(_TipoEstado_QNAME, TipoEstado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionDocumentoCertificacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/comun", name = "tipoInformacionDocumentoCertificacion")
    public JAXBElement<TipoInformacionDocumentoCertificacion> createTipoInformacionDocumentoCertificacion(TipoInformacionDocumentoCertificacion value) {
        return new JAXBElement<TipoInformacionDocumentoCertificacion>(_TipoInformacionDocumentoCertificacion_QNAME, TipoInformacionDocumentoCertificacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoInformacionRadicacionCasoBPM }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/comun", name = "tipoInformacionRadicacionCasoBPM")
    public JAXBElement<TipoInformacionRadicacionCasoBPM> createTipoInformacionRadicacionCasoBPM(TipoInformacionRadicacionCasoBPM value) {
        return new JAXBElement<TipoInformacionRadicacionCasoBPM>(_TipoInformacionRadicacionCasoBPM_QNAME, TipoInformacionRadicacionCasoBPM.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoRangoFecha }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/comun", name = "tipoRangoFecha")
    public JAXBElement<TipoRangoFecha> createTipoRangoFecha(TipoRangoFecha value) {
        return new JAXBElement<TipoRangoFecha>(_TipoRangoFecha_QNAME, TipoRangoFecha.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntidadOrganizacional }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/comun", name = "tipoEntidadOrganizacional")
    public JAXBElement<TipoEntidadOrganizacional> createTipoEntidadOrganizacional(TipoEntidadOrganizacional value) {
        return new JAXBElement<TipoEntidadOrganizacional>(_TipoEntidadOrganizacional_QNAME, TipoEntidadOrganizacional.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoIdentificacionTarea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/comun", name = "tipoIdentificacionTarea")
    public JAXBElement<TipoIdentificacionTarea> createTipoIdentificacionTarea(TipoIdentificacionTarea value) {
        return new JAXBElement<TipoIdentificacionTarea>(_TipoIdentificacionTarea_QNAME, TipoIdentificacionTarea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoCriteriosEntidadNegocio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/comun", name = "tipoCriteriosEntidadNegocio")
    public JAXBElement<TipoCriteriosEntidadNegocio> createTipoCriteriosEntidadNegocio(TipoCriteriosEntidadNegocio value) {
        return new JAXBElement<TipoCriteriosEntidadNegocio>(_TipoCriteriosEntidadNegocio_QNAME, TipoCriteriosEntidadNegocio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoCredencialesAutorizacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/comun", name = "tipoCredencialesAutorizacion")
    public JAXBElement<TipoCredencialesAutorizacion> createTipoCredencialesAutorizacion(TipoCredencialesAutorizacion value) {
        return new JAXBElement<TipoCredencialesAutorizacion>(_TipoCredencialesAutorizacion_QNAME, TipoCredencialesAutorizacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSucursalBanco }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/comun", name = "tipoSucursalBanco")
    public JAXBElement<TipoSucursalBanco> createTipoSucursalBanco(TipoSucursalBanco value) {
        return new JAXBElement<TipoSucursalBanco>(_TipoSucursalBanco_QNAME, TipoSucursalBanco.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoCausalError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/comun", name = "tipoCausalError")
    public JAXBElement<TipoCausalError> createTipoCausalError(TipoCausalError value) {
        return new JAXBElement<TipoCausalError>(_TipoCausalError_QNAME, TipoCausalError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoRespuestaTarea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/schemas/1.0/comun", name = "tipoRespuestaTarea")
    public JAXBElement<TipoRespuestaTarea> createTipoRespuestaTarea(TipoRespuestaTarea value) {
        return new JAXBElement<TipoRespuestaTarea>(_TipoRespuestaTarea_QNAME, TipoRespuestaTarea.class, null, value);
    }

}
