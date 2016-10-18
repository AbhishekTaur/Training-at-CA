
package wstest2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wstest2 package. 
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

    private final static QName _HighestNumberResponse_QNAME = new QName("http://wstest2/", "highestNumberResponse");
    private final static QName _UpperStringResponse_QNAME = new QName("http://wstest2/", "upperStringResponse");
    private final static QName _UpperString_QNAME = new QName("http://wstest2/", "upperString");
    private final static QName _ConcatStringResponse_QNAME = new QName("http://wstest2/", "concatStringResponse");
    private final static QName _HighestNumber_QNAME = new QName("http://wstest2/", "highestNumber");
    private final static QName _ConcatString_QNAME = new QName("http://wstest2/", "concatString");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wstest2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConcatString }
     * 
     */
    public ConcatString createConcatString() {
        return new ConcatString();
    }

    /**
     * Create an instance of {@link HighestNumber }
     * 
     */
    public HighestNumber createHighestNumber() {
        return new HighestNumber();
    }

    /**
     * Create an instance of {@link ConcatStringResponse }
     * 
     */
    public ConcatStringResponse createConcatStringResponse() {
        return new ConcatStringResponse();
    }

    /**
     * Create an instance of {@link HighestNumberResponse }
     * 
     */
    public HighestNumberResponse createHighestNumberResponse() {
        return new HighestNumberResponse();
    }

    /**
     * Create an instance of {@link UpperStringResponse }
     * 
     */
    public UpperStringResponse createUpperStringResponse() {
        return new UpperStringResponse();
    }

    /**
     * Create an instance of {@link UpperString }
     * 
     */
    public UpperString createUpperString() {
        return new UpperString();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HighestNumberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wstest2/", name = "highestNumberResponse")
    public JAXBElement<HighestNumberResponse> createHighestNumberResponse(HighestNumberResponse value) {
        return new JAXBElement<HighestNumberResponse>(_HighestNumberResponse_QNAME, HighestNumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpperStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wstest2/", name = "upperStringResponse")
    public JAXBElement<UpperStringResponse> createUpperStringResponse(UpperStringResponse value) {
        return new JAXBElement<UpperStringResponse>(_UpperStringResponse_QNAME, UpperStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpperString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wstest2/", name = "upperString")
    public JAXBElement<UpperString> createUpperString(UpperString value) {
        return new JAXBElement<UpperString>(_UpperString_QNAME, UpperString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConcatStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wstest2/", name = "concatStringResponse")
    public JAXBElement<ConcatStringResponse> createConcatStringResponse(ConcatStringResponse value) {
        return new JAXBElement<ConcatStringResponse>(_ConcatStringResponse_QNAME, ConcatStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HighestNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wstest2/", name = "highestNumber")
    public JAXBElement<HighestNumber> createHighestNumber(HighestNumber value) {
        return new JAXBElement<HighestNumber>(_HighestNumber_QNAME, HighestNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConcatString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wstest2/", name = "concatString")
    public JAXBElement<ConcatString> createConcatString(ConcatString value) {
        return new JAXBElement<ConcatString>(_ConcatString_QNAME, ConcatString.class, null, value);
    }

}
