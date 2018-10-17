
package cl.falabella.b2b.intol.ws.infopalet.beans.response;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.falabella.b2b.intol.ws.infopalet.beans.response package. 
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

    private final static QName _InfoPaletResponse_QNAME = new QName("http://b2b.falabella.com/schemas/ol/info-palet-response", "info-palet-response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.falabella.b2b.intol.ws.infopalet.beans.response
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Rut }
     * 
     */
    public Rut createRut() {
        return new Rut();
    }

    /**
     * Create an instance of {@link Destinatario }
     * 
     */
    public Destinatario createDestinatario() {
        return new Destinatario();
    }

    /**
     * Create an instance of {@link InfoPaletResponse }
     * 
     */
    public InfoPaletResponse createInfoPaletResponse() {
        return new InfoPaletResponse();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link InfoPalet }
     * 
     */
    public InfoPalet createInfoPalet() {
        return new InfoPalet();
    }

    /**
     * Create an instance of {@link Direccion }
     * 
     */
    public Direccion createDireccion() {
        return new Direccion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfoPaletResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://b2b.falabella.com/schemas/ol/info-palet-response", name = "info-palet-response")
    public JAXBElement<InfoPaletResponse> createInfoPaletResponse(InfoPaletResponse value) {
        return new JAXBElement<InfoPaletResponse>(_InfoPaletResponse_QNAME, InfoPaletResponse.class, null, value);
    }

}
