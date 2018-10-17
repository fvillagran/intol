package cl.falabella.b2b.intol.ws.descpalet.service;

import cl.falabella.b2b.intol.beans.Tupla;
import cl.falabella.b2b.intol.common.JAXBUtil;
import cl.falabella.b2b.intol.service.B2bService;
import cl.falabella.b2b.intol.service.SabService;
import cl.falabella.b2b.intol.service.impl.IntolException;
import cl.falabella.b2b.intol.ws.descpalet.beans.DescPaletRequest;

import cl.falabella.b2b.intol.ws.infopalet.beans.request.InfoPaletRequest;
import cl.falabella.b2b.intol.ws.infopalet.beans.response.InfoPalet;
import cl.falabella.b2b.intol.ws.infopalet.beans.response.Message;
import cl.falabella.b2b.intol.ws.infopalet.service.InfoPaletService;

import cl.falabella.b2b.intol.ws.infopalet.service.InfoPaletServiceImpl;

import java.io.IOException;

import java.util.Date;
import java.util.List;

import javax.jws.soap.SOAPBinding;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DescPaletServiceImpl implements DescPaletService{
  private static Log log = LogFactory.getLog(DescPaletServiceImpl.class);
    
    private SabService sabService;
    private B2bService b2bService;
    private String empresa;
    private String tipoCarga;
    
    public DescPaletServiceImpl(SabService sabService,B2bService b2bService,String empresa,String tipoCarga){
      this.sabService = sabService;
      this.b2bService = b2bService;
      this.empresa = empresa;
      this.tipoCarga = tipoCarga;
    }
    
    public void descPalet(DescPaletRequest request){
      String r1 = "";
      long id = -1;
      try
      {
         r1 = JAXBUtil.getInstance().marshal(DescPaletRequest.class, request);
         log.debug(r1);
         if(r1==null) 
          r1="";    
         id = b2bService.addLogRequest("DESC_PALET", new Date(), r1);
      }
      catch (IOException e)
      {
         log.error("Error Marshaling Request", e);
      }
      catch(Exception e)
      {
         log.error("Error trying to add a log for request: "+r1, e);
      }
  
      try
      {
        Tupla<InfoPalet, List<Long>> tupla = this.sabService.getInfoPalet(empresa, request.getNumeroPalet(), request.getNumeroExpedicion(), null, tipoCarga);
        
      }
      catch(IntolException e)
      {
        Message error = new Message();
        error.setCode(e.getCode());
        error.setValue(e.getMessage());
      }
      catch(Exception e)
      {
        Message error = new Message();
        error.setCode(-1);
        error.setValue(e.getMessage());
      }
  }
}
