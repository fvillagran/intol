
package cl.falabella.b2b.intol.ws.adminarchivo.beans.carga.response;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.falabella.b2b.intol.ws.adminarchivo.beans.carga.response package. 
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

    private final static QName _AdminArchivoCargaResponse_QNAME = new QName("http://b2b.falabella.com/schemas/ol/admin-archivo-carga-response", "admin-archivo-carga-response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.falabella.b2b.intol.ws.adminarchivo.beans.carga.response
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Messages }
     * 
     */
    public Messages createMessages() {
        return new Messages();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link AdminArchivoCargaResponse }
     * 
     */
    public AdminArchivoCargaResponse createAdminArchivoCargaResponse() {
        return new AdminArchivoCargaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminArchivoCargaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://b2b.falabella.com/schemas/ol/admin-archivo-carga-response", name = "admin-archivo-carga-response")
    public JAXBElement<AdminArchivoCargaResponse> createAdminArchivoCargaResponse(AdminArchivoCargaResponse value) {
        return new JAXBElement<AdminArchivoCargaResponse>(_AdminArchivoCargaResponse_QNAME, AdminArchivoCargaResponse.class, null, value);
    }

}
