
package cl.falabella.b2b.intol.ws.infodocumento.beans.response;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.falabella.b2b.intol.ws.infodocumento.beans.response package. 
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

    private final static QName _InfoDocumentoResponse_QNAME = new QName("http://b2b.falabella.com/schemas/ol/info-documento-response", "info-documento-response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.falabella.b2b.intol.ws.infodocumento.beans.response
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InfoDocumentoResponse }
     * 
     */
    public InfoDocumentoResponse createInfoDocumentoResponse() {
        return new InfoDocumentoResponse();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfoDocumentoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://b2b.falabella.com/schemas/ol/info-documento-response", name = "info-documento-response")
    public JAXBElement<InfoDocumentoResponse> createInfoDocumentoResponse(InfoDocumentoResponse value) {
        return new JAXBElement<InfoDocumentoResponse>(_InfoDocumentoResponse_QNAME, InfoDocumentoResponse.class, null, value);
    }

}
