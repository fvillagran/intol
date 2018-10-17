
package cl.falabella.b2b.intol.ws.client.agendaunica.appointment.beans.resp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.falabella.b2b.intol.ws.client.agendaunica.appointment.beans.resp package. 
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

    private final static QName _AppointmentResp_QNAME = new QName("http://mdwcorp.falabella.com/LOG/CORP/WLS/schema/WMOS/Appointment/Resp/v2017.02", "AppointmentResp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.falabella.b2b.intol.ws.client.agendaunica.appointment.beans.resp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AppointmentRespTYPE }
     * 
     */
    public AppointmentRespTYPE createAppointmentRespTYPE() {
        return new AppointmentRespTYPE();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppointmentRespTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdwcorp.falabella.com/LOG/CORP/WLS/schema/WMOS/Appointment/Resp/v2017.02", name = "AppointmentResp")
    public JAXBElement<AppointmentRespTYPE> createAppointmentResp(AppointmentRespTYPE value) {
        return new JAXBElement<AppointmentRespTYPE>(_AppointmentResp_QNAME, AppointmentRespTYPE.class, null, value);
    }

}
