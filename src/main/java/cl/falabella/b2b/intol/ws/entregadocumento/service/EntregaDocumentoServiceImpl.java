package cl.falabella.b2b.intol.ws.entregadocumento.service;

import cl.falabella.b2b.intol.beans.ExtraInfo;
import cl.falabella.b2b.intol.common.JAXBUtil;
import cl.falabella.b2b.intol.service.B2bService;
import cl.falabella.b2b.intol.service.SrxService;
import cl.falabella.b2b.intol.service.TrlService;
import cl.falabella.b2b.intol.ws.entregadocumento.beans.request.EntregaDocumentoRequest;
import cl.falabella.b2b.intol.ws.entregadocumento.beans.response.EntregaDocumentoResponse;
import cl.falabella.b2b.intol.ws.entregadocumento.beans.response.Message;

import java.io.IOException;

import java.security.Principal;

import java.util.Date;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.dao.DataAccessException;
import javax.annotation.Resource;

import javax.xml.ws.WebServiceContext;

public class EntregaDocumentoServiceImpl implements EntregaDocumentoService {

    @Resource
    WebServiceContext wsc;    

    private static Log log = LogFactory.getLog(EntregaDocumentoServiceImpl.class);

    private SrxService srxService;
    private B2bService b2bService;
    private TrlService trlService;
    
    public EntregaDocumentoServiceImpl(SrxService srxService, B2bService b2bService, TrlService trlService) {
        this.srxService = srxService;
        this.b2bService = b2bService;
        this.trlService = trlService;
    }

    @Override
    public EntregaDocumentoResponse entregaDocumento(EntregaDocumentoRequest request) {
        
        EntregaDocumentoResponse response = new EntregaDocumentoResponse();
        Message res = new Message();
        String mensajeRequest = null;
        long id = -1;
        
        try {
            mensajeRequest = JAXBUtil.getInstance().marshal(EntregaDocumentoRequest.class, request);
            id = b2bService.addLogRequest("ENTREGA_DOCUMENTO", new Date(), mensajeRequest);
        } catch (IOException e) {
            log.error("Error realizando marshall en Entrega Documento ", e);
        } catch (Exception e) {
            log.error("Error intentando agregar log de mensaje en Entrega Documento : " + mensajeRequest, e);
        }

        // obtener parametro que indica si origen de respuesta es OMS
        String isOrigenRespuestaOMS  = b2bService.getParametroGeneralByCodigo("OMS_ORDER_CAPTURE") != null ? b2bService.getParametroGeneralByCodigo("OMS_ORDER_CAPTURE") : "SRX";
        //String isOrigenRespuestaOMS  = "N";
        
        // enviando entrega documento a SRX
        try {
            Principal pr = wsc.getUserPrincipal();
            String rutProveedor = pr.getName().substring(0, pr.getName().indexOf("-"));

            ExtraInfo extraInfo = new ExtraInfo();
            extraInfo.setRutProveedor(rutProveedor);

            res = this.srxService.entregaDocumento(request, extraInfo);
            
            response.setResultado(res);

        } catch (DataAccessException e) {
            log.error("Error conectando a SRX en Entrega Documento ", e);            
            res.setCode(-2);
            res.setValue("Error conectando a SRX en Entrega Documento " + e);
        } catch (Exception e) {
            log.error("Error inesperado al conectar a SRX en Entrega Documento ", e);
            res.setCode(-10);
            res.setValue("Error inesperado al conectar a SRX en Entrega Documento " + e);
        }
        
        // enviando entrega documento a TRL
        try {

            //this.trlService.addQueueMessage(request, r1);
            Map<String, Object> respuesta = this.trlService.regEntregaDocumento(request, mensajeRequest);
            
            if("S".equalsIgnoreCase(isOrigenRespuestaOMS)){
                res.setCode((Integer)respuesta.get("P_ESTPROC"));
                res.setValue((String)respuesta.get("P_DESCPROC"));            
                response.setResultado(res);
            }
            
        } 
        catch (Exception e) {
            log.error("Error Entrega Documento TRL ", e);
            if("S".equalsIgnoreCase(isOrigenRespuestaOMS)){
                res.setCode(1);
                res.setValue("Error Entrega Documento TRL " + e);           
            }
        }

        String mensajeResponse = null;
        try {
            // siempre que esta registrado el mensaje de request, actualiza con la respuesta
            if (id > -1) {
                mensajeResponse = JAXBUtil.getInstance().marshal(EntregaDocumentoResponse.class, response);
                b2bService.addLogResponse(id, new Date(), mensajeResponse, res.getCode(), res.getValue());
            }
        } catch (IOException e) {
            log.error("Error realizando marshall en respuesta Entrega Documento", e);
        } catch (Exception e) {
            log.error("Error agregar log de respuesta en Entrega Documento : " + mensajeResponse, e);
        }
        return response;
    }
}
