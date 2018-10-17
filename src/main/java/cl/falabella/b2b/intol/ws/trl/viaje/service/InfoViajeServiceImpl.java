package cl.falabella.b2b.intol.ws.trl.viaje.service;

import cl.falabella.b2b.intol.beans.viajes.InputViaje;
import cl.falabella.b2b.intol.beans.viajes.Service;
import cl.falabella.b2b.intol.beans.viajes.ServiceSoap;
import cl.falabella.b2b.intol.service.TrlService;
import cl.falabella.b2b.intol.ws.trl.ce.service.InfoCambioEstadoServiceImpl;
import cl.falabella.b2b.intol.ws.trl.viaje.bean.request.InfoViajeRequest;
import cl.falabella.b2b.intol.ws.trl.viaje.bean.response.InfoViajeResponse;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class InfoViajeServiceImpl implements InfoViajeService{

    private static Log log = LogFactory.getLog(InfoViajeServiceImpl.class);

    private TrlService trlService;

    public InfoViajeServiceImpl(TrlService trlService) {
        this.trlService = trlService;    
    }

    /**
     * informa viaje a GPS
     * @param request
     * @return
     */
    public InfoViajeResponse informarViaje(InfoViajeRequest request) {
        
        log.debug("infoviaje ws");
        InfoViajeResponse response = new InfoViajeResponse();
        try {        
            URL wsdlURL = new URL(trlService.getParamValue("WS_INF_VIAJE"));
            QName SERVICE_NAME = new QName("http://tempuri.org/", "Service");
            
            Service service = new Service(wsdlURL, SERVICE_NAME);            
            ServiceSoap infoViajeSoap = service.getServiceSoap();            
            response.setResponse(""+infoViajeSoap.inputViaje(request.getRequest()));
            
        } catch (Exception e) {
            log.debug("Error al informar viaje a GPS : " + e.getMessage());
            response.setResponse("1");
        }
        
        return response;
    }
}
