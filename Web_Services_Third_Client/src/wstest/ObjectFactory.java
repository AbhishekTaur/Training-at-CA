
package wstest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wstest package. 
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

    private final static QName _SubtractNumbers_QNAME = new QName("http://wstest/", "subtractNumbers");
    private final static QName _SubtractNumbersResponse_QNAME = new QName("http://wstest/", "subtractNumbersResponse");
    private final static QName _AddNumbers_QNAME = new QName("http://wstest/", "addNumbers");
    private final static QName _AddNumbersResponse_QNAME = new QName("http://wstest/", "addNumbersResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wstest
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddNumbers }
     * 
     */
    public AddNumbers createAddNumbers() {
        return new AddNumbers();
    }

    /**
     * Create an instance of {@link AddNumbersResponse }
     * 
     */
    public AddNumbersResponse createAddNumbersResponse() {
        return new AddNumbersResponse();
    }

    /**
     * Create an instance of {@link SubtractNumbers }
     * 
     */
    public SubtractNumbers createSubtractNumbers() {
        return new SubtractNumbers();
    }

    /**
     * Create an instance of {@link SubtractNumbersResponse }
     * 
     */
    public SubtractNumbersResponse createSubtractNumbersResponse() {
        return new SubtractNumbersResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubtractNumbers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wstest/", name = "subtractNumbers")
    public JAXBElement<SubtractNumbers> createSubtractNumbers(SubtractNumbers value) {
        return new JAXBElement<SubtractNumbers>(_SubtractNumbers_QNAME, SubtractNumbers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubtractNumbersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wstest/", name = "subtractNumbersResponse")
    public JAXBElement<SubtractNumbersResponse> createSubtractNumbersResponse(SubtractNumbersResponse value) {
        return new JAXBElement<SubtractNumbersResponse>(_SubtractNumbersResponse_QNAME, SubtractNumbersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNumbers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wstest/", name = "addNumbers")
    public JAXBElement<AddNumbers> createAddNumbers(AddNumbers value) {
        return new JAXBElement<AddNumbers>(_AddNumbers_QNAME, AddNumbers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNumbersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wstest/", name = "addNumbersResponse")
    public JAXBElement<AddNumbersResponse> createAddNumbersResponse(AddNumbersResponse value) {
        return new JAXBElement<AddNumbersResponse>(_AddNumbersResponse_QNAME, AddNumbersResponse.class, null, value);
    }

}
