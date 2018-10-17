package cl.falabella.b2b.intol.ws.trl.ce.service;

import cl.falabella.b2b.intol.common.JAXBUtil;
import cl.falabella.b2b.intol.enumerator.PaisEnum;
import cl.falabella.b2b.intol.service.B2bService;
import cl.falabella.b2b.intol.service.SabService;
import cl.falabella.b2b.intol.service.SrxService;
import cl.falabella.b2b.intol.service.TrlService;
import cl.falabella.b2b.intol.ws.entregadocumento.service.EntregaDocumentoServiceImpl;
import cl.falabella.b2b.intol.ws.trl.ce.beans.request.InfoCambioestadoRequest;
import cl.falabella.b2b.intol.ws.trl.ce.beans.response.InfoCambioestadoResponse;

import cl.falabella.b2b.intol.ws.trl.ce.beans.response.Message;

import java.io.StringReader;

import java.io.StringWriter;

import java.math.BigDecimal;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class InfoCambioEstadoServiceImpl implements InfoCambioEstadoService{

    private static Log log = LogFactory.getLog(InfoCambioEstadoServiceImpl.class);

    private TrlService trlService;

    public InfoCambioEstadoServiceImpl(TrlService trlService) {
        this.trlService = trlService;
    }

    /**
     * recibe cambio de estado
     * @param request
     * @return
     */
    public InfoCambioestadoResponse cambioEstado(InfoCambioestadoRequest request) {

        log.debug("reservaAgenda ws");
              
        InfoCambioestadoResponse response = new InfoCambioestadoResponse();
        Message msg = new Message();
        try{    

            String xmlRequest = JAXBUtil.getInstance().marshal(InfoCambioestadoRequest.class, request);        
            log.debug("xmlRequest : " + xmlRequest);
        
            //cambio de estado para CHILE ("1")
            Map<String, Object> map = trlService.cambioEstado(request.getOperacion(), request.getViaje(), request.getLocal(), 
            request.getFhevento(), request.getEvento(), ""+PaisEnum.CHILE.getCode(), xmlRequest);
            
            response.setOperacion(request.getOperacion());
            response.setViaje(request.getViaje());
            response.setLocal(request.getLocal());
            response.setFhevento(request.getFhevento());
            response.setEvento(request.getEvento());

            msg.setCode(((BigDecimal)map.get("P_ESTPROC")).intValue());
            msg.setValue((String)map.get("P_SALIDA"));
            
        }catch(Exception e){
            log.debug("Error al realizar cambio de estado", e);
            msg.setCode(1);
            msg.setValue("Error al realizar Cambio de Estado");
        }

        response.setError(msg);
        
        return response;    
    }
}
