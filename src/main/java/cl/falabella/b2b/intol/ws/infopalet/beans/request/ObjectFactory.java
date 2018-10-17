
package cl.falabella.b2b.intol.ws.infopalet.beans.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.falabella.b2b.intol.ws.infopalet.beans.request package. 
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

    private final static QName _InfoPaletRequest_QNAME = new QName("http://b2b.falabella.com/schemas/ol/info-palet-request", "info-palet-request");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.falabella.b2b.intol.ws.infopalet.beans.request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InfoPaletRequest }
     * 
     */
    public InfoPaletRequest createInfoPaletRequest() {
        return new InfoPaletRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfoPaletRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://b2b.falabella.com/schemas/ol/info-palet-request", name = "info-palet-request")
    public JAXBElement<InfoPaletRequest> createInfoPaletRequest(InfoPaletRequest value) {
        return new JAXBElement<InfoPaletRequest>(_InfoPaletRequest_QNAME, InfoPaletRequest.class, null, value);
    }

}
