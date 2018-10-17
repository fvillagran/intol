package cl.falabella.b2b.intol.ws.infodocumento.service;

import cl.falabella.b2b.intol.common.JAXBUtil;
import cl.falabella.b2b.intol.service.B2bService;
import cl.falabella.b2b.intol.service.SrxService;
import cl.falabella.b2b.intol.ws.infodocumento.beans.request.InfoDocumentoRequest;
import cl.falabella.b2b.intol.ws.infodocumento.beans.response.InfoDocumentoResponse;
import cl.falabella.b2b.intol.ws.infodocumento.beans.response.Message;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class InfoDocumentoServiceImpl implements InfoDocumentoService
{
   private static Log log = LogFactory.getLog(InfoDocumentoServiceImpl.class);
   
   private SrxService srxService;
   private B2bService b2bService;
   
   public InfoDocumentoServiceImpl(SrxService srxService, B2bService b2bService)
   {
      this.srxService = srxService;
      this.b2bService = b2bService;
   }
   
   public InfoDocumentoResponse infoDocumento(InfoDocumentoRequest request)
   {
      InfoDocumentoResponse response = new InfoDocumentoResponse();
      Message message = new Message();
      long id = -1;
      try {
         //agregamos el request al log
         String req = JAXBUtil.getInstance().marshal(InfoDocumentoRequest.class, request);
         id = b2bService.addLogRequest("INFO_DOCUMENTO", new Date(), req);
         
         message = this.srxService.getInfoDocumento(  request.getTipoDocumento(), 
                                                      request.getNumeroDocumento().longValue(), 
                                                      request.getPatenteCamion(), 
                                                      request.getRutMantisaCliente().longValue(),
                                                      request.getRutDigitoCliente(),
                                                      request.getFechaEvento().toGregorianCalendar().getTime(),
                                                      request.getLatitud() != null ? request.getLatitud().doubleValue() : null,
                                                      request.getLongitud() != null ? request.getLongitud().doubleValue() : null);
                                                      
         response.setMessage(message);
         
         //agregamos el response al log
         String res = JAXBUtil.getInstance().marshal(InfoDocumentoResponse.class, response);
         b2bService.addLogResponse(id, new Date(), res, message.getCode(), message.getValue());
      }
      catch(Exception e)
      {
         log.error(e, e);
         message.setCode(-10);
         message.setValue("Ha ocurrido un error inesperado al recuperar el documento");      
         response.setMessage(message);
      }
      finally
      {      
      }
      return response;
      
   }
   
}

