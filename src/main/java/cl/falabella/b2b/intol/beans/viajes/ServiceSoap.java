package cl.falabella.b2b.intol.beans.viajes;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.11
 * Wed Jan 22 09:56:52 CLST 2014
 * Generated source version: 2.2.11
 * 
 */
 
@WebService(targetNamespace = "http://tempuri.org/", name = "ServiceSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface ServiceSoap {

    @WebResult(name = "inputViajeResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "inputViaje", targetNamespace = "http://tempuri.org/", className = "org.tempuri.InputViaje")
    @WebMethod(action = "http://tempuri.org/inputViaje")
    @ResponseWrapper(localName = "inputViajeResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.InputViajeResponse")
    public int inputViaje(
        @WebParam(name = "XML", targetNamespace = "http://tempuri.org/")
        java.lang.String xml
    );
}