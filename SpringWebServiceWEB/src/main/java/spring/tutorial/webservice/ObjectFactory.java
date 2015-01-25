
package spring.tutorial.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the spring.tutorial.webservice package. 
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

    private final static QName _GetUserDetails_QNAME = new QName("http://webservice.tutorial.spring/", "getUserDetails");
    private final static QName _AddUserDetails_QNAME = new QName("http://webservice.tutorial.spring/", "addUserDetails");
    private final static QName _GetUserDetailsResponse_QNAME = new QName("http://webservice.tutorial.spring/", "getUserDetailsResponse");
    private final static QName _AddUserDetailsResponse_QNAME = new QName("http://webservice.tutorial.spring/", "addUserDetailsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: spring.tutorial.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserDetails }
     * 
     */
    public GetUserDetails createGetUserDetails() {
        return new GetUserDetails();
    }

    /**
     * Create an instance of {@link AddUserDetails }
     * 
     */
    public AddUserDetails createAddUserDetails() {
        return new AddUserDetails();
    }

    /**
     * Create an instance of {@link GetUserDetailsResponse }
     * 
     */
    public GetUserDetailsResponse createGetUserDetailsResponse() {
        return new GetUserDetailsResponse();
    }

    /**
     * Create an instance of {@link AddUserDetailsResponse }
     * 
     */
    public AddUserDetailsResponse createAddUserDetailsResponse() {
        return new AddUserDetailsResponse();
    }

    /**
     * Create an instance of {@link UserDetails }
     * 
     */
    public UserDetails createUserDetails() {
        return new UserDetails();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tutorial.spring/", name = "getUserDetails")
    public JAXBElement<GetUserDetails> createGetUserDetails(GetUserDetails value) {
        return new JAXBElement<GetUserDetails>(_GetUserDetails_QNAME, GetUserDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tutorial.spring/", name = "addUserDetails")
    public JAXBElement<AddUserDetails> createAddUserDetails(AddUserDetails value) {
        return new JAXBElement<AddUserDetails>(_AddUserDetails_QNAME, AddUserDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tutorial.spring/", name = "getUserDetailsResponse")
    public JAXBElement<GetUserDetailsResponse> createGetUserDetailsResponse(GetUserDetailsResponse value) {
        return new JAXBElement<GetUserDetailsResponse>(_GetUserDetailsResponse_QNAME, GetUserDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tutorial.spring/", name = "addUserDetailsResponse")
    public JAXBElement<AddUserDetailsResponse> createAddUserDetailsResponse(AddUserDetailsResponse value) {
        return new JAXBElement<AddUserDetailsResponse>(_AddUserDetailsResponse_QNAME, AddUserDetailsResponse.class, null, value);
    }

}
