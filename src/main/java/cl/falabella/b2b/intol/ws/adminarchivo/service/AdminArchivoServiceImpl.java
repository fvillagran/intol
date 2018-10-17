package cl.falabella.b2b.intol.ws.adminarchivo.service;

import cl.falabella.b2b.intol.beans.Archivo;
import cl.falabella.b2b.intol.beans.Credencial;
import cl.falabella.b2b.intol.beans.Tupla;
import cl.falabella.b2b.intol.service.B2bService;
import cl.falabella.b2b.intol.service.SrxService;
import cl.falabella.b2b.intol.ws.adminarchivo.beans.carga.request.AdminArchivoCargaRequest;
import cl.falabella.b2b.intol.ws.adminarchivo.beans.carga.response.AdminArchivoCargaResponse;
import cl.falabella.b2b.intol.ws.adminarchivo.beans.consulta.request.AdminArchivoConsultaRequest;
import cl.falabella.b2b.intol.ws.adminarchivo.beans.consulta.response.AdminArchivoConsultaResponse;
import cl.falabella.b2b.intol.ws.adminarchivo.beans.consulta.response.Estado;
import cl.falabella.b2b.intol.ws.adminarchivo.beans.descarga.request.AdminArchivoDescargaRequest;
import cl.falabella.b2b.intol.ws.adminarchivo.beans.descarga.response.AdminArchivoDescargaResponse;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import java.math.BigInteger;

import java.security.Principal;

import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import javax.annotation.Resource;

import javax.xml.ws.WebServiceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class AdminArchivoServiceImpl implements AdminArchivoService
{
   @Resource
   WebServiceContext wsc;   
   private static Log log = LogFactory.getLog(AdminArchivoServiceImpl.class);
   
   private SrxService srxService;
   private B2bService b2bService;
   
   public AdminArchivoServiceImpl(SrxService srxService, B2bService b2bService)
   {
      this.srxService = srxService;
      this.b2bService = b2bService;
   }
   
   public AdminArchivoCargaResponse cargaArchivo(AdminArchivoCargaRequest request)
   {
      Principal pr = wsc.getUserPrincipal();
      
      AdminArchivoCargaResponse response = new AdminArchivoCargaResponse();
      cl.falabella.b2b.intol.ws.adminarchivo.beans.carga.response.Messages messages = new cl.falabella.b2b.intol.ws.adminarchivo.beans.carga.response.Messages();
            
      try {
         
         for(cl.falabella.b2b.intol.ws.adminarchivo.beans.carga.request.File file : request.getFiles().getFile())
         {
            cl.falabella.b2b.intol.ws.adminarchivo.beans.carga.response.Message message = new cl.falabella.b2b.intol.ws.adminarchivo.beans.carga.response.Message();

            try {                           
               String tipo = file.getTipoArchivo();
               String extension = file.getExtensionArchivo();
               String contenido = file.getArchivo();
               
               String proveedor = pr.getName().substring(0, pr.getName().indexOf("|")).replace("-", "");
               String usuario = pr.getName().substring(pr.getName().indexOf("|")+1).replace("-","");
               
               //obtenemos los datos credenciales proveedor y usuario
               Credencial credencial = b2bService.getCredencialByUser(Long.valueOf(proveedor.substring(0, proveedor.length()-1)), Long.valueOf(usuario.substring(0, usuario.length()-1)));
                              
               //obtenemos la secuencia y el nombre del archivo generado
               Tupla arch = b2bService.setFile(credencial.getProveedor(), credencial.getUsuario(), extension, tipo);
               
               //insertamos el archivo
               b2bService.addFile((Long)arch.getKey(), compress(contenido));
               b2bService.addFileDetalle((Long)arch.getKey(), 1, tipo, credencial.getUsuario(), credencial.getProveedor(), extension);
                              
               message.setCode(arch.getKey().toString());
               message.setValue("Carga de archivo exitosa");               
            }
            catch(Exception e)
            {
               log.error(e, e);
               message.setCode("1");
               message.setValue(e.getMessage());
            }
            messages.getMessage().add(message);
         }         
      }
      catch(Exception e)
      {
         log.error(e, e);
         //message.setCode("-10");
         //message.setValue("Ha ocurrido un error inesperado al cargar el documento");      
         //response.setMessage(message);
      }
      finally
      {      
      }
      response.setMessages(messages);
      return response;
      
   }
   
   public AdminArchivoDescargaResponse descargaArchivo(AdminArchivoDescargaRequest request)
   {
      Principal pr = wsc.getUserPrincipal();
      final SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
      
      AdminArchivoDescargaResponse response = new AdminArchivoDescargaResponse();
      cl.falabella.b2b.intol.ws.adminarchivo.beans.descarga.response.Messages messages = new cl.falabella.b2b.intol.ws.adminarchivo.beans.descarga.response.Messages();
      try {
         for(cl.falabella.b2b.intol.ws.adminarchivo.beans.descarga.request.File file : request.getFiles().getFile())
         {
            try {
               Date fechaDesde = null;
               Date fechaHasta = null;
               Long id = null;
               
               //obtenemos los datos del request y 
               //lo seteamos en los beans correspondientes
               
                //tipo de documento
               String tipo = file.getTipo();
               
               //id de documento
               try {
                  id = file.getId() == null || "".equals(file.getId()) ? null : Long.valueOf(file.getId());
               }
               catch(Exception e)
               {
                  throw new RuntimeException("Debe ingresar un id de documento v\u00e1lido");
               }
               
               //fechas inicio y termino
               try {
                  fechaDesde = file.getFechaInicio() == null || "".equals(file.getFechaInicio()) ? null : formatter.parse(file.getFechaInicio());
                  fechaHasta = file.getFechaTermino() == null || "".equals(file.getFechaTermino()) ? null : formatter.parse(file.getFechaTermino());
               }
               catch(Exception e)
               {
                  throw new RuntimeException("Debe ingresar un formato de fecha yyyy-MM-ddThh:mm:ss");
               }               
               
               //validamos en caso que no venga algun dato
               if (fechaDesde != null && fechaHasta == null)
                  throw new RuntimeException("Debe ingresar la fecha final.");
               
               if (fechaDesde == null && fechaHasta != null)
                  throw new RuntimeException("Debe ingresar la fecha inicio.");
                  
               if (fechaDesde != null && fechaHasta != null && tipo == null)
                  throw new RuntimeException("Debe ingresar el tipo de documento a buscar.");
                  
               if (fechaDesde != null && fechaHasta != null)
               {
                  Calendar cal=Calendar.getInstance();
                  cal.setTime(fechaDesde);
                  cal.add(Calendar.DAY_OF_YEAR, 28);
                  Date fechaDesdeCalculada = cal.getTime();                  

                  if (fechaDesde.compareTo(fechaHasta) > 0)
                     throw new RuntimeException("La fecha Inicio debe ser menor a la fecha Final.");
                     
                  if (fechaDesdeCalculada.compareTo(fechaHasta) < 0)
                     throw new RuntimeException("El rango de fechas no puede exceder de 28 dias.");
               }
               
               //validamos si viene el tipo y las fechas
               if (tipo != null && fechaDesde == null && fechaHasta == null) //si no viene el rango de fechas se debe buscar los archivos cargados los ultimos 30 dias
               {
                  Date fechaActual = b2bService.getFechaSistema();
                  Calendar calDesde=Calendar.getInstance();
                  calDesde.setTime(fechaActual);
                  calDesde.add(Calendar.MONTH, -1);
                  fechaDesde = calDesde.getTime();
                  fechaHasta = fechaActual;
               }

               String proveedor = pr.getName().substring(0, pr.getName().indexOf("|")).replace("-", "");
               String usuario = pr.getName().substring(pr.getName().indexOf("|")+1).replace("-","");
               
               //obtenemos los datos credenciales proveedor y usuario
               Credencial credencial = b2bService.getCredencialByUser(Long.valueOf(proveedor.substring(0, proveedor.length()-1)), Long.valueOf(usuario.substring(0, usuario.length()-1)));
                              
               //ejecutamos la consulta
               List<Archivo> archivos = b2bService.getFile(id, fechaDesde, fechaHasta, tipo, credencial.getProveedor());
               
               if( archivos.size() == 0)
                  throw new RuntimeException("No se ha(n) encontrado documento(s) para esta consulta, puede que el estado o tipo del documento no sea correcto o ya fue descargado");
                     
               //recorremos los archivos
               for(Archivo archivo : archivos)
               {
                  //seteamos si la consulta tuvo exito
                  cl.falabella.b2b.intol.ws.adminarchivo.beans.descarga.response.Message message = new cl.falabella.b2b.intol.ws.adminarchivo.beans.descarga.response.Message();
                  message.setCode(archivo.getId()+"");
                  
                  message.setValue(decompress(archivo.getData()));
                  messages.getMessage().add(message);
                  
                  //actualizamos el flag del archivo
                  b2bService.setFlagFile(archivo.getId());
               }                                    
            }
            catch(Exception e)
            {
               cl.falabella.b2b.intol.ws.adminarchivo.beans.descarga.response.Message message = new cl.falabella.b2b.intol.ws.adminarchivo.beans.descarga.response.Message();
               message.setCode("1");
               message.setValue(e.getMessage());
               messages.getMessage().add(message);
            }            
         }         
         response.setMessages(messages);
      }
      catch(Exception e)
      {
         log.error(e, e);
         //message.setCode("1");
         //message.setValue("Ha ocurrido un error inesperado al cargar el documento");      
         //response.setMessage(message);
      }
      return response;
   }
   
   public AdminArchivoConsultaResponse consultaArchivo(AdminArchivoConsultaRequest request)
   {
      AdminArchivoConsultaResponse response = new AdminArchivoConsultaResponse();
      try 
      {
         cl.falabella.b2b.intol.ws.adminarchivo.beans.consulta.response.File file = new cl.falabella.b2b.intol.ws.adminarchivo.beans.consulta.response.File();
         cl.falabella.b2b.intol.ws.adminarchivo.beans.consulta.response.Status status = new cl.falabella.b2b.intol.ws.adminarchivo.beans.consulta.response.Status();
         cl.falabella.b2b.intol.ws.adminarchivo.beans.consulta.response.Errors errores = new cl.falabella.b2b.intol.ws.adminarchivo.beans.consulta.response.Errors();
         
         long folio = request.getFile().getId().longValue();
         
         Archivo archivo = b2bService.getFile(folio);
         if( archivo == null)
            throw new RuntimeException("No se ha encontrado el documento para el folio " + folio + " ingresado");
         
         try {         
            status.setId(new BigInteger(archivo.getId()+""));
         }
         catch(Exception e)
         {
            throw new RuntimeException("Debe ingresar un id de documento v\u00e1lido");
         }

         status.setTipo(archivo.getTipo());
         Estado estado = new Estado();
         estado.setCode(String.valueOf(archivo.getEstado().getKey()));
         estado.setValue(String.valueOf(archivo.getEstado().getValue()));
         status.setEstado(estado);
         
         //obtenemos los errores
         List<Tupla> errs = b2bService.getError(folio);
         
         if(errs != null && errs.size() > 0)
         {
            for(Tupla err : errs)
            {
               cl.falabella.b2b.intol.ws.adminarchivo.beans.consulta.response.Error e = new cl.falabella.b2b.intol.ws.adminarchivo.beans.consulta.response.Error();
               e.setCode(err.getKey().toString());
               e.setValue((String)err.getValue());
               errores.getError().add(e);
            }
            file.setErrors(errores);            
         }         

         file.setStatus(status);
         
         //seteamos el file
         response.setFile(file);
                  
      }
      catch(Exception e)
      {
         log.info(e,e);
         cl.falabella.b2b.intol.ws.adminarchivo.beans.consulta.response.Error error = new cl.falabella.b2b.intol.ws.adminarchivo.beans.consulta.response.Error();         
         error.setCode("1");
         error.setValue(e.getMessage());
         response.setError(error);
      }
      return response;
   }
   
   public static byte[] compress(String string) throws IOException 
   {
       ByteArrayOutputStream os = new ByteArrayOutputStream(string.length());
       GZIPOutputStream gos = new GZIPOutputStream(os);
       gos.write(string.getBytes());
       gos.close();
       byte[] compressed = os.toByteArray();
       os.close();
       return compressed;
   }
   
   public static String decompress(byte[] compressed) throws IOException 
   {
      String str = "";
      try
      {
         ByteArrayInputStream is = new ByteArrayInputStream(compressed);
         GZIPInputStream gis = new GZIPInputStream(is, compressed.length);
         StringBuilder string = new StringBuilder();
         byte[] data = new byte[compressed.length];
         int bytesRead;
         while ((bytesRead = gis.read(data)) != -1) {
           string.append(new String(data, 0, bytesRead));
         }
         gis.close();
         is.close();
         str = string.toString();
      }
      catch(Exception e)
      {
         str = new String(compressed);
      }
      return str;
   }
   
}
