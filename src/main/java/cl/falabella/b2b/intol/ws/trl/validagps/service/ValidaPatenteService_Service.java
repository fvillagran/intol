
/*
 * 
 */

package cl.falabella.b2b.intol.ws.trl.validagps.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.2
 * Tue Nov 03 10:03:27 CLST 2015
 * Generated source version: 2.2
 * 
 */


@WebServiceClient(name = "ValidaPatenteService", 
                  wsdlLocation = "file:/C:/xsd/b2b-valida-patente-service.wsdl",
                  targetNamespace = "http://b2b.falabella.com/service/ol/valida-patente") 
public class ValidaPatenteService_Service extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://b2b.falabella.com/service/ol/valida-patente", "ValidaPatenteService");
    public final static QName ValidaPatenteService = new QName("http://b2b.falabella.com/service/ol/valida-patente", "ValidaPatenteService");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/xsd/b2b-valida-patente-service.wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from file:/C:/xsd/b2b-valida-patente-service.wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public ValidaPatenteService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ValidaPatenteService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ValidaPatenteService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     * 
     * @return
     *     returns ValidaPatenteService
     */
    @WebEndpoint(name = "ValidaPatenteService")
    public ValidaPatenteService getValidaPatenteService() {
        return super.getPort(ValidaPatenteService, ValidaPatenteService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ValidaPatenteService
     */
    @WebEndpoint(name = "ValidaPatenteService")
    public ValidaPatenteService getValidaPatenteService(WebServiceFeature... features) {
        return super.getPort(ValidaPatenteService, ValidaPatenteService.class, features);
    }

}
