
package cl.falabella.b2b.intol.ws.adminarchivo.beans.consulta.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.falabella.b2b.intol.ws.adminarchivo.beans.consulta.request package. 
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

    private final static QName _AdminArchivoConsultaRequest_QNAME = new QName("http://b2b.falabella.com/schemas/ol/admin-archivo-consulta-request", "admin-archivo-consulta-request");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.falabella.b2b.intol.ws.adminarchivo.beans.consulta.request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link File }
     * 
     */
    public File createFile() {
        return new File();
    }

    /**
     * Create an instance of {@link AdminArchivoConsultaRequest }
     * 
     */
    public AdminArchivoConsultaRequest createAdminArchivoConsultaRequest() {
        return new AdminArchivoConsultaRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminArchivoConsultaRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://b2b.falabella.com/schemas/ol/admin-archivo-consulta-request", name = "admin-archivo-consulta-request")
    public JAXBElement<AdminArchivoConsultaRequest> createAdminArchivoConsultaRequest(AdminArchivoConsultaRequest value) {
        return new JAXBElement<AdminArchivoConsultaRequest>(_AdminArchivoConsultaRequest_QNAME, AdminArchivoConsultaRequest.class, null, value);
    }

}
