
package source;

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
@WebServiceClient(name = "StudentDataImplService", targetNamespace = "http://source/", wsdlLocation = "http://10.134.108.231:9090/ws2/StudentDataImpl?wsdl")
public class StudentDataImplService
    extends Service
{

    private final static URL STUDENTDATAIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException STUDENTDATAIMPLSERVICE_EXCEPTION;
    private final static QName STUDENTDATAIMPLSERVICE_QNAME = new QName("http://source/", "StudentDataImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.134.108.231:9090/ws2/StudentDataImpl?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        STUDENTDATAIMPLSERVICE_WSDL_LOCATION = url;
        STUDENTDATAIMPLSERVICE_EXCEPTION = e;
    }

    public StudentDataImplService() {
        super(__getWsdlLocation(), STUDENTDATAIMPLSERVICE_QNAME);
    }

    public StudentDataImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), STUDENTDATAIMPLSERVICE_QNAME, features);
    }

    public StudentDataImplService(URL wsdlLocation) {
        super(wsdlLocation, STUDENTDATAIMPLSERVICE_QNAME);
    }

    public StudentDataImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, STUDENTDATAIMPLSERVICE_QNAME, features);
    }

    public StudentDataImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StudentDataImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns StudentData
     */
    @WebEndpoint(name = "StudentDataImplPort")
    public StudentData getStudentDataImplPort() {
        return super.getPort(new QName("http://source/", "StudentDataImplPort"), StudentData.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StudentData
     */
    @WebEndpoint(name = "StudentDataImplPort")
    public StudentData getStudentDataImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://source/", "StudentDataImplPort"), StudentData.class, features);
    }

    private static URL __getWsdlLocation() {
        if (STUDENTDATAIMPLSERVICE_EXCEPTION!= null) {
            throw STUDENTDATAIMPLSERVICE_EXCEPTION;
        }
        return STUDENTDATAIMPLSERVICE_WSDL_LOCATION;
    }

}
