
package cl.falabella.b2b.intol.ws.agendaunica.beans.agendaunicacalculaventana;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.falabella.b2b.intol.ws.agendaunica.beans.agendaunicacalculaventana package. 
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

    private final static QName _AguPlanification_QNAME = new QName("http://b2b.falabella.com/schemas/ol/agenda_unica_calcula_ventana", "agu-planification");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.falabella.b2b.intol.ws.agendaunica.beans.agendaunicacalculaventana
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Items }
     * 
     */
    public Items createItems() {
        return new Items();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link AguPlanification }
     * 
     */
    public AguPlanification createAguPlanification() {
        return new AguPlanification();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AguPlanification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://b2b.falabella.com/schemas/ol/agenda_unica_calcula_ventana", name = "agu-planification")
    public JAXBElement<AguPlanification> createAguPlanification(AguPlanification value) {
        return new JAXBElement<AguPlanification>(_AguPlanification_QNAME, AguPlanification.class, null, value);
    }

}
