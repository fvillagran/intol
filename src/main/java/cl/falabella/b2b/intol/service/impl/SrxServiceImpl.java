package cl.falabella.b2b.intol.service.impl;

import cl.falabella.b2b.intol.beans.ExtraInfo;
import cl.falabella.b2b.intol.dao.SrxDAO;
import cl.falabella.b2b.intol.service.ParentescoService;
import cl.falabella.b2b.intol.service.SrxService;
import cl.falabella.b2b.intol.ws.entregadocumento.beans.request.Autorizacion;
import cl.falabella.b2b.intol.ws.entregadocumento.beans.request.EntregaDocumentoRequest;
import cl.falabella.b2b.intol.ws.entregadocumento.beans.response.Message;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class SrxServiceImpl implements SrxService
{
   private ParentescoService parentescoService;
   private SrxDAO dao;
   
   public static final int RESPUESTA_OK = 0;
   public static final int RESPUESTA_ERROR = 1;
   
   private static Log log = LogFactory.getLog(SrxServiceImpl.class);
   
   public SrxServiceImpl(ParentescoService parentescoService, SrxDAO dao){
      this.parentescoService = parentescoService;
      this.dao = dao;
   }

   public Message entregaDocumento(EntregaDocumentoRequest doc, ExtraInfo extraInfo){
   
       log.debug("Entrega Documento SRX " + extraInfo.getRutProveedor());
       
       
   
       SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
       formatter.setTimeZone(doc.getFechaEvento().toGregorianCalendar().getTimeZone());
       String fechaEvento = doc.getFechaEvento()!=null?formatter.format(doc.getFechaEvento().toGregorianCalendar().getTime()):null;
   
       String r = dao.entregaDocumento(doc.getTipoDocumento().value(),
                           doc.getFolio(),
                           doc.getPatente(),
                           fechaEvento,
                           doc.getLatitud(),
                           doc.getLongitud(),
                           doc.getCodigoNoEntrega(),
                           doc.getRutReceptor().getMantisa().longValue(),
                           doc.getRutReceptor().getDv(),
                           parentescoService.getCode(doc.getParentesco().value()),
                           doc.getBultos(),
                           Autorizacion.CON_AUTORIZACION.equals(doc.getAutorizacion()) ? 1 : 0,
                           extraInfo.getRutProveedor() 
                           );
      
      
        Message res = new Message();
	try{
            res.setCode( Integer.parseInt(r.substring(0, 2).trim()) );
            res.setValue( r.substring(2) );	  
        }
	catch(Exception ex){
            res.setCode( RESPUESTA_ERROR );
            res.setValue( "Error Entrega Documento SRX" );            
            log.error("Error Servicio Entrega Documento SRX sin respuesta", ex);
        }
      
      return res;
   }
   
   public cl.falabella.b2b.intol.ws.infodocumento.beans.response.Message getInfoDocumento(String tipoDocumento,
                                                                                          long numeroDocumento,
                                                                                          String patente,
                                                                                          Long mantisa,
                                                                                          String digito,
                                                                                          Date fechaEvento,
                                                                                          Double latitud,
                                                                                          Double longitud
                                                                                          )
   {
      String resp =  dao.getInfoDocumento(tipoDocumento, numeroDocumento, patente, mantisa, digito, fechaEvento, latitud, longitud);
      
      cl.falabella.b2b.intol.ws.infodocumento.beans.response.Message res = new cl.falabella.b2b.intol.ws.infodocumento.beans.response.Message();
      res.setCode( Integer.parseInt(resp.substring(0, 2).trim()) );
      res.setValue( resp.substring(2) );
      return res;      
      
   }
}
