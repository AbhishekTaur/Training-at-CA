
package wstest;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "hello", targetNamespace = "http://wstest/", wsdlLocation = "http://10.134.119.237:9090/WebServiceExampleProject/Math?wsdl")
public class Hello
    extends Service
{

    private final static URL HELLO_WSDL_LOCATION;
    private final static WebServiceException HELLO_EXCEPTION;
    private final static QName HELLO_QNAME = new QName("http://wstest/", "hello");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.134.119.237:9090/WebServiceExampleProject/Math?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HELLO_WSDL_LOCATION = url;
        HELLO_EXCEPTION = e;
    }

    public Hello() {
        super(__getWsdlLocation(), HELLO_QNAME);
    }

    public Hello(WebServiceFeature... features) {
        super(__getWsdlLocation(), HELLO_QNAME, features);
    }

    public Hello(URL wsdlLocation) {
        super(wsdlLocation, HELLO_QNAME);
    }

    public Hello(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HELLO_QNAME, features);
    }

    public Hello(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Hello(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MathService
     */
    @WebEndpoint(name = "MathServicePort")
    public MathService getMathServicePort() {
        return super.getPort(new QName("http://wstest/", "MathServicePort"), MathService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MathService
     */
    @WebEndpoint(name = "MathServicePort")
    public MathService getMathServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://wstest/", "MathServicePort"), MathService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HELLO_EXCEPTION!= null) {
            throw HELLO_EXCEPTION;
        }
        return HELLO_WSDL_LOCATION;
    }

}
