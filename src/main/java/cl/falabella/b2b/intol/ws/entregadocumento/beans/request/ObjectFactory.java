
package cl.falabella.b2b.intol.ws.entregadocumento.beans.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.falabella.b2b.intol.ws.entregadocumento.beans.request package. 
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

    private final static QName _EntregaDocumentoRequest_QNAME = new QName("http://b2b.falabella.com/schemas/ol/entrega-documento-request", "entrega-documento-request");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.falabella.b2b.intol.ws.entregadocumento.beans.request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EntregaDocumentoRequest }
     * 
     */
    public EntregaDocumentoRequest createEntregaDocumentoRequest() {
        return new EntregaDocumentoRequest();
    }

    /**
     * Create an instance of {@link Rut }
     * 
     */
    public Rut createRut() {
        return new Rut();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntregaDocumentoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://b2b.falabella.com/schemas/ol/entrega-documento-request", name = "entrega-documento-request")
    public JAXBElement<EntregaDocumentoRequest> createEntregaDocumentoRequest(EntregaDocumentoRequest value) {
        return new JAXBElement<EntregaDocumentoRequest>(_EntregaDocumentoRequest_QNAME, EntregaDocumentoRequest.class, null, value);
    }

}
