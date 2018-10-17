package cl.falabella.b2b.intol.ws.infopalet.service;

import cl.falabella.b2b.intol.beans.ExtraInfo;
import cl.falabella.b2b.intol.beans.Tupla;
import cl.falabella.b2b.intol.common.JAXBUtil;
import cl.falabella.b2b.intol.service.B2bService;
import cl.falabella.b2b.intol.service.SabService;
import cl.falabella.b2b.intol.service.impl.IntolException;
import cl.falabella.b2b.intol.ws.infopalet.beans.request.InfoPaletRequest;
import cl.falabella.b2b.intol.ws.infopalet.beans.response.InfoPalet;
import cl.falabella.b2b.intol.ws.infopalet.beans.response.InfoPaletResponse;
import cl.falabella.b2b.intol.ws.infopalet.beans.response.Message;
import cl.falabella.b2b.intol.ws.infopalet.beans.response.TipoProducto;

import java.io.IOException;

import java.security.Principal;

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.dao.DataAccessException;
import javax.annotation.Resource;

import javax.xml.ws.WebServiceContext;

public class InfoPaletServiceImpl implements InfoPaletService
{
    @Resource
    WebServiceContext wsc; 
    
   private static Log log = LogFactory.getLog(InfoPaletServiceImpl.class);
   
   private SabService sabService;
   private B2bService b2bService;
   
   private String empresa;
   private String tipoCarga;
   
   public InfoPaletServiceImpl(SabService sabService, B2bService b2bService, String empresa, String tipoCarga)
   {
      this.sabService = sabService;
      this.b2bService = b2bService;
      this.empresa = empresa;
      this.tipoCarga = tipoCarga;
   }
   
   public InfoPaletResponse infoPalet(InfoPaletRequest request)
   {
      String r1 = "";
      long id = -1;
      try
      {
         r1 = JAXBUtil.getInstance().marshal(InfoPaletRequest.class, request);
         id = b2bService.addLogRequest("INFO_PALET", new Date(), r1);
      }
      catch (IOException e)
      {
         log.error("Error Marshaling Request", e);
      }
      catch(Exception e)
      {
         log.error("Error trying to add a log for request: "+r1, e);
      }

      InfoPaletResponse response = new InfoPaletResponse();
      try
      {
        String tipoDespacho = null;
        String indicador = null;
        String rutValido = null;
        InfoPalet info = null;
        Tupla<InfoPalet, List<Long>> tupla =null;
        
        String negocio =  this.b2bService.getParametroGeneral("B2B_NEGOCIO", "LINEA DE NEGOCIO");
      
        if (negocio.equals("FAL")){ 
        
            Principal pr = wsc.getUserPrincipal();             
            String rutProveedor = pr.getName().substring(0, pr.getName().indexOf("-"));
        
             tupla = this.sabService.getInfoPalet(empresa, request.getNumeroPalet(), request.getNumeroExpedicion(), request.getCantidadBultos(), tipoCarga);
             info = tupla.getKey();
             tipoDespacho = this.sabService.getTipoDespacho(info.getNumeroF12().toString());
             
             //System.out.println("****************   tipoDespacho "+tipoDespacho);
             
             indicador = this.sabService.getIndicador(tipoDespacho);
             
            //System.out.println("****************   indicador "+indicador);
             
             if (indicador != null)             
                rutValido = this.sabService.getValidarRut(rutProveedor, indicador);
             //System.out.println("rutValido ---- > "+rutValido);
        }else{
        
            //tupla = this.daiService.getInfoPalet(empresa, request.getNumeroPalet(), request.getNumeroExpedicion(), request.getCantidadBultos(), tipoCarga);
            info = tupla.getKey();   
        }
          
         ExtraInfo extraInfo = this.b2bService.getTelefonoTamano(info.getNumeroF12(), tupla.getValue());


         if( extraInfo == null )
            throw new IntolException(-1, "No se posee informacion sobre tamano de SKU(S) asociados a Palet");
            
         info.setTipoProducto(TipoProducto.fromValue(extraInfo.getTipoProducto()));
         
         if( info.getDestinatario() != null )            
            info.getDestinatario().setTelefono(extraInfo.getTelefono() == null ? "" : extraInfo.getTelefono());

          /* Obtenemos el celular y mail, en caso de que el tipo de despacho entregado por SAB coincida
           * con lo que esta parametrizado en B2B los agregamos si no mandamos null*/
           
           if (rutValido != null) {
               info.getDestinatario().setCelular(extraInfo.getCelular());    
               info.getDestinatario().setMail(extraInfo.getMail());               
           }
           
           
         response.setInfoPalet(info);
      }
      catch(IntolException e)
      {
         // Aqui estan los tipos de error de Stored Procedures.. mayores que cero.
         Message error = new Message();
         error.setCode(e.getCode());
         error.setValue(e.getMessage());

         response.setError(error);
      }
      catch(DataAccessException e)
      {
         log.error(e,e);
         Message error = new Message();
         error.setCode(-2);
         error.setValue("Ha ocurrido un error de base de datos");

         response.setError(error);
      }
      catch(Exception e)
      {
         log.error(e,e);
         Message error = new Message();
         error.setCode(-10);
         error.setValue("Ha ocurrido un error inesperado en la consulta.");

         response.setError(error);
      }

      String r2 = "";
      try
      {
         if( id > -1 )
         {
            r2 = JAXBUtil.getInstance().marshal(InfoPaletResponse.class, response);
            int codigo = response.getError() != null ? response.getError().getCode() : 0;
            String descripcion = response.getError() != null ? response.getError().getValue() : "OK";

            b2bService.addLogResponse(id, new Date(), r2, codigo, descripcion);
         }
      }
      catch (IOException e)
      {
         log.error("Error Marshaling Response", e);
      }
      catch(Exception e)
      {
         log.error("Error trying to add a log for response: "+r2, e);
      }

      return response;
   }
}
