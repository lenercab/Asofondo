package co.gov.colpensiones.contracts._1_0.personas;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.6
 * 2014-05-29T08:53:51.603-05:00
 * Generated source version: 2.4.6
 * 
 */
@WebServiceClient(name = "SvcAfiliado", 
                  wsdlLocation = "file:/D:/COLP_Beps/repositorioDocumetacion/Diseno_y_Desarrollo/Instructivos/Capacitaciones/ejercicioInicialWS/ContratoSvcAfiliado.wsdl",
                  targetNamespace = "http://www.colpensiones.gov.co/contracts/1.0/personas") 
public class SvcAfiliado extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "SvcAfiliado");
    public final static QName ContratoSvcAfiliadoImplPort = new QName("http://www.colpensiones.gov.co/contracts/1.0/personas", "ContratoSvcAfiliadoImplPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/COLP_Beps/repositorioDocumetacion/Diseno_y_Desarrollo/Instructivos/Capacitaciones/ejercicioInicialWS/ContratoSvcAfiliado.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SvcAfiliado.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/COLP_Beps/repositorioDocumetacion/Diseno_y_Desarrollo/Instructivos/Capacitaciones/ejercicioInicialWS/ContratoSvcAfiliado.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SvcAfiliado(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SvcAfiliado(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SvcAfiliado() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SvcAfiliado(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SvcAfiliado(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SvcAfiliado(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ContratoSvcAfiliado
     */
    @WebEndpoint(name = "ContratoSvcAfiliadoImplPort")
    public ContratoSvcAfiliado getContratoSvcAfiliadoImplPort() {
        return super.getPort(ContratoSvcAfiliadoImplPort, ContratoSvcAfiliado.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ContratoSvcAfiliado
     */
    @WebEndpoint(name = "ContratoSvcAfiliadoImplPort")
    public ContratoSvcAfiliado getContratoSvcAfiliadoImplPort(WebServiceFeature... features) {
        return super.getPort(ContratoSvcAfiliadoImplPort, ContratoSvcAfiliado.class, features);
    }

}
