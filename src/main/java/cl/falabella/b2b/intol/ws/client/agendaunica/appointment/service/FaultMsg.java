
package cl.falabella.b2b.intol.ws.client.agendaunica.appointment.service;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.2.11
 * Wed Jul 12 16:38:39 GMT-04:00 2017
 * Generated source version: 2.2.11
 * 
 */

@WebFault(name = "Fault", targetNamespace = "http://schemas.xmlsoap.org/soap/envelope/")
public class FaultMsg extends Exception {
    public static final long serialVersionUID = 20170712163839L;
    
    private cl.falabella.b2b.intol.ws.client.agendaunica.appointment.beans.envelope.Fault fault;

    public FaultMsg() {
        super();
    }
    
    public FaultMsg(String message) {
        super(message);
    }
    
    public FaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public FaultMsg(String message, cl.falabella.b2b.intol.ws.client.agendaunica.appointment.beans.envelope.Fault fault) {
        super(message);
        this.fault = fault;
    }

    public FaultMsg(String message, cl.falabella.b2b.intol.ws.client.agendaunica.appointment.beans.envelope.Fault fault, Throwable cause) {
        super(message, cause);
        this.fault = fault;
    }

    public cl.falabella.b2b.intol.ws.client.agendaunica.appointment.beans.envelope.Fault getFaultInfo() {
        return this.fault;
    }
}
