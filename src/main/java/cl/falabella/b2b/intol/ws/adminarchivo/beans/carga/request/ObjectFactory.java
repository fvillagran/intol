
package cl.falabella.b2b.intol.ws.adminarchivo.beans.carga.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.falabella.b2b.intol.ws.adminarchivo.beans.carga.request package. 
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

    private final static QName _AdminArchivoCargaRequest_QNAME = new QName("http://b2b.falabella.com/schemas/ol/admin-archivo-carga-request", "admin-archivo-carga-request");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.falabella.b2b.intol.ws.adminarchivo.beans.carga.request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Files }
     * 
     */
    public Files createFiles() {
        return new Files();
    }

    /**
     * Create an instance of {@link AdminArchivoCargaRequest }
     * 
     */
    public AdminArchivoCargaRequest createAdminArchivoCargaRequest() {
        return new AdminArchivoCargaRequest();
    }

    /**
     * Create an instance of {@link File }
     * 
     */
    public File createFile() {
        return new File();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminArchivoCargaRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://b2b.falabella.com/schemas/ol/admin-archivo-carga-request", name = "admin-archivo-carga-request")
    public JAXBElement<AdminArchivoCargaRequest> createAdminArchivoCargaRequest(AdminArchivoCargaRequest value) {
        return new JAXBElement<AdminArchivoCargaRequest>(_AdminArchivoCargaRequest_QNAME, AdminArchivoCargaRequest.class, null, value);
    }

}
