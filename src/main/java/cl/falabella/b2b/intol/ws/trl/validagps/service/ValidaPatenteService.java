package cl.falabella.b2b.intol.ws.trl.validagps.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.2
 * Tue Nov 03 10:03:27 CLST 2015
 * Generated source version: 2.2
 * 
 */
 
@WebService(targetNamespace = "http://b2b.falabella.com/service/ol/valida-patente", name = "ValidaPatenteService")
@XmlSeeAlso({cl.falabella.b2b.intol.ws.trl.validagps.beans.request.ObjectFactory.class,cl.falabella.b2b.intol.ws.trl.validagps.beans.response.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ValidaPatenteService {

    @WebResult(name = "valida-patente-response", targetNamespace = "http://b2b.falabella.com/schemas/ol/valida-patente-response", partName = "response")
    @WebMethod
    public cl.falabella.b2b.intol.ws.trl.validagps.beans.response.ValidaPatenteResponse validarGpsPatenteViaje(
        @WebParam(partName = "request", name = "valida-patente-request", targetNamespace = "http://b2b.falabella.com/schemas/ol/valida-patente-request")
        cl.falabella.b2b.intol.ws.trl.validagps.beans.request.ValidaPatenteRequest request
    );
}