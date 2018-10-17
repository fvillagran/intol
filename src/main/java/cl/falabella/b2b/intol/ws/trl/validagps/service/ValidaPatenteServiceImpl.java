package cl.falabella.b2b.intol.ws.trl.validagps.service;


import cl.falabella.b2b.intol.service.TrlService;
import cl.falabella.b2b.intol.ws.trl.validagps.beans.request.ValidaPatenteRequest;
import cl.falabella.b2b.intol.ws.trl.validagps.beans.response.ValidaPatenteResponse;

import cl.falabella.b2b.intol.ws.trl.validagps.cliente.Service;

import cl.falabella.b2b.intol.ws.trl.validagps.cliente.ServiceSoap;
import cl.falabella.b2b.intol.ws.trl.validagps.cliente.WMRETORNASTATUS;

import java.net.URL;

import javax.annotation.Resource;

import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceContext;

public class ValidaPatenteServiceImpl implements ValidaPatenteService {
    @Resource
    WebServiceContext wsc; 
    
    private TrlService trlService;
    
    public ValidaPatenteServiceImpl(TrlService trlService) {
        this.trlService = trlService; 
    }
    
    public ValidaPatenteResponse validarGpsPatenteViaje( ValidaPatenteRequest request){
        ValidaPatenteResponse response = new ValidaPatenteResponse();
        try { 
            String patente = request.getPatente();
            int idCliente = request.getIdCliente();
            
           // URL wsdlURL = new URL(trlService.getParamValue("WS_INF_VIAJE"));
            URL wsdlURL = new URL(trlService.getParamValue("WS_ESTADO_GPS"));
            QName SERVICE_NAME = new QName("http://tempuri.org/", "Service");
            
            Service service = new Service(wsdlURL, SERVICE_NAME);            
            ServiceSoap validaPatenteSoap = service.getServiceSoap();  
            
            response.setEstado(""+validaPatenteSoap.wmRETORNASTATUS(patente,idCliente));
            
        } catch (Exception e) {
            e.printStackTrace();
            response.setEstado("1");
        }
        
        
        return response;
    }
}
