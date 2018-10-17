package cl.falabella.b2b.intol.ws.descpalet.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(targetNamespace = "http://b2b.falabella.com/service/ol/desc-palet", name = "DescPaletService", serviceName = "DescPaletService")
@XmlSeeAlso( { cl.falabella.b2b.intol.ws.descpalet.beans.ObjectFactory.class })
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface DescPaletService{
  @WebMethod  
  public void descPalet(@WebParam(partName = "request", name = "desc-palet-request", targetNamespace = "http://b2b.falabella.com/schemas/ol/desc-palet-request")
      cl.falabella.b2b.intol.ws.descpalet.beans.DescPaletRequest request
  );

}
