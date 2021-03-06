package co.gov.colpensiones.beps.contracts._1_0.prestacioneseconomicas;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by Apache CXF 2.4.6
 * 2014-07-31T09:22:21.574-05:00
 * Generated source version: 2.4.6
 * 
 */

@WebServiceClient(name = "ContratoSvcBeneficios", 
                  wsdlLocation = "file:/D:/ambienteDesarrolloBeps/workspacePrueba/WSBeneficios/ContratoSvcBeneficios.wsdl",
                  targetNamespace = "http://www.colpensiones.gov.co/beps/contracts/1.0/prestacioneseconomicas") 
public class SvcBeneficios_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.colpensiones.gov.co/beps/contracts/1.0/prestacioneseconomicas", "SvcBeneficios");
    public final static QName SvcBeneficiosImplPort = new QName("http://www.colpensiones.gov.co/beps/contracts/1.0/prestacioneseconomicas", "SvcBeneficiosImplPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/ambienteDesarrolloBeps/workspacePrueba/WSBeneficios/ContratoSvcBeneficios.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SvcBeneficios_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/ambienteDesarrolloBeps/workspacePrueba/WSBeneficios/ContratoSvcBeneficios.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SvcBeneficios_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SvcBeneficios_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SvcBeneficios_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SvcBeneficios_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SvcBeneficios_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SvcBeneficios_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns SvcBeneficios
     */
    @WebEndpoint(name = "SvcBeneficiosImplPort")
    public SvcBeneficios getSvcBeneficiosImplPort() {
        return super.getPort(SvcBeneficiosImplPort, SvcBeneficios.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SvcBeneficios
     */
    @WebEndpoint(name = "SvcBeneficiosImplPort")
    public SvcBeneficios getSvcBeneficiosImplPort(WebServiceFeature... features) {
        return super.getPort(SvcBeneficiosImplPort, SvcBeneficios.class, features);
    }

}
