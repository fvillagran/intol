package cl.falabella.b2b.intol.service.impl;

import cl.falabella.b2b.intol.beans.Tupla;
import cl.falabella.b2b.intol.beans.infopalet.F12Row;
import cl.falabella.b2b.intol.beans.infopalet.ProductoRow;
import cl.falabella.b2b.intol.beans.infopalet.Row;
import cl.falabella.b2b.intol.beans.infopalet.RowSet;
import cl.falabella.b2b.intol.beans.viajes.infoviaje.SabViaje;
import cl.falabella.b2b.intol.common.JAXBUtil;
import cl.falabella.b2b.intol.dao.SabDAO;
import cl.falabella.b2b.intol.dao.SabTottusDAO;
import cl.falabella.b2b.intol.service.SabService;
import cl.falabella.b2b.intol.ws.infopalet.beans.response.Destinatario;
import cl.falabella.b2b.intol.ws.infopalet.beans.response.Direccion;
import cl.falabella.b2b.intol.ws.infopalet.beans.response.InfoPalet;
import cl.falabella.b2b.intol.ws.infopalet.beans.response.Rut;
import cl.falabella.b2b.intol.ws.infopalet.beans.response.TipoDocumento;
import cl.falabella.b2b.intol.ws.infopalet.beans.response.TipoDocumentoTributario;
import cl.falabella.b2b.intol.ws.trl.viaje.bean.request.InfoViajeRequest;
import cl.falabella.b2b.intol.ws.trl.viaje.bean.response.InfoViajeResponse;
import cl.falabella.b2b.intol.ws.trl.viaje.service.InfoViajeService;

import java.io.StringReader;
import java.io.StringWriter;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class SabServiceImpl implements SabService
{
   private static Log log = LogFactory.getLog(SabServiceImpl.class);
   
   private SabDAO dao;
    private SabTottusDAO sabTottusDao;
    private InfoViajeService infoviajeServices;
   
   private final SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
   private final SimpleDateFormat formatoDeFecha = new SimpleDateFormat("dd/MM/yyyy");
   
   public SabServiceImpl(SabDAO dao, SabTottusDAO sabTottusDao, InfoViajeService infoviajeServices)
   {
      this.dao = dao;
      this.sabTottusDao = sabTottusDao;
      this.infoviajeServices=infoviajeServices;
   }

   public Tupla<InfoPalet, List<Long>> getInfoPalet(String empresa, String palet, BigInteger numeroExpedicion, BigInteger cantidadBultos, String tipoCarga) throws IntolException
   {
      String xml = dao.getInfoPalet(empresa, palet, numeroExpedicion, cantidadBultos, tipoCarga);
      
      if (tipoCarga.equals("C")){
        xml = xml.replaceAll("<ROWSET>", "<ROWSET xmlns=\"http://b2b.falabella.com/schemas/ol/info-palet-database\">");
        log.debug(xml);
        StringReader sr = new StringReader(xml);
      
        RowSet rowset = (RowSet)JAXBUtil.getInstance().unmarshal(RowSet.class, sr);

        // Si viene mas de 1 ROW, hay problemas...
        if( rowset.getROW().size() > 1 )
          throw new IntolException(1, "Palet posee muchos resultados.");
         
        Row row = rowset.getROW().get(0);
      
        if( row.getDERROR() != null )
          throw new IntolException(2, row.getDERROR() );
      
        // Sacamos la suma de largo, ancho y alto
        BigDecimal largo = new BigDecimal(0);
        BigDecimal ancho = new BigDecimal(0);
        BigDecimal alto = new BigDecimal(0);
        BigDecimal m3 = new BigDecimal(0);
        String contenido = "";
        List<Long> skus = new ArrayList<Long>();
        
        //recorremos los 2 primeros f12
        for(int i=0; i < row.getF12().getF12ROW().size() && i < 2 ;i++)
        {        
           F12Row frow = row.getF12().getF12ROW().get(i);         
           for(ProductoRow pr : frow.getPRODUCTOS().getPRODUCTOSROW())
           {
            BigDecimal cantidad = new BigDecimal(pr.getQCANTIDA());            
            largo = largo.add(pr.getNLARGO().multiply(cantidad));
            alto = alto.add(pr.getNALTO().multiply(cantidad));
            ancho = ancho.add(pr.getNANCHO().multiply(cantidad));
            m3 = m3.add( pr.getNLARGO().multiply(pr.getNANCHO().multiply(pr.getNALTO().multiply(cantidad))) );
            contenido += pr.getADETALLE() + " | ";
            skus.add( new Long(pr.getASKU()) );
           }
        }
        //ExtraInfo extraInfo = b2bDAO.getTelefonoTamano(row.getNF12(), skus);
      
        contenido = contenido.substring(0, contenido.length()-3);
      
        InfoPalet p = new InfoPalet();
        p.setNumeroPalet(row.getNPALLET());
        p.setSuborden(row.getCSOC());        
        p.setNumeroF12(row.getF12().getF12ROW().get(0).getNF12());
        p.setNumero2F12(row.getF12().getF12ROW().size() > 1 ? row.getF12().getF12ROW().get(1).getNF12() : null);
        p.setTipoDocumento(TipoDocumento.fromValue(row.getATIPO()));
        p.setCiudadOrigen(row.getAORIGEN() == null ? "" : row.getAORIGEN());
        p.setCiudadDestino(row.getADESTINO() == null ? "" : row.getADESTINO());
        p.setPesoCompleto(row.getCPESO());
        
        p.setCantidadBultos(row.getNBULTOS());
        p.setCantidadM3(m3);
        p.setAlto(alto);
        p.setAncho(ancho);
        p.setLargo(largo);
        p.setTipoDocumentoTributario(TipoDocumentoTributario.BOLETA);
        p.setTipoContenido(contenido);
        p.setMontoDeclarado(row.getNMONTO());
        p.setRegion(row.getAREGION() == null ? "" : row.getAREGION());

        String fechaStr = "";
        Date fecha;
        try {
           if( row.getFREP().length() > 10)
           {
              fecha = formatter.parse(row.getFREP());
              fechaStr = formatoDeFecha.format(fecha);
           }
           else if ( row.getFREP().length() == 10)
           {
              fecha = formatoDeFecha.parse(row.getFREP());
              fechaStr = formatoDeFecha.format(fecha);
           }
           else
              throw new ParseException("error", 0);
        } catch (ParseException e) {
           String arrStr[] = row.getFREP().replace("T", " ").split(" ");
           if(arrStr[0].length() == 10)
              fechaStr = arrStr[0];
           else
           {
              String arrFec[] = arrStr[0].split("/");
              fechaStr = (arrFec[0].length() > 1 ? arrFec[0] : "0" + arrFec[0]) + "/" + (arrFec[1].length() > 1 ? arrFec[1] : "0" + arrFec[1]) + "/" + arrFec[2];
           }
        } finally {
           try {
              formatoDeFecha.parse(fechaStr);
           }
           catch(ParseException e) {
              if(row.getFREP() == null)
                  throw new IntolException(0, "No se encuentra el dato fecha");
              else
                  throw new IntolException(0, "Error en el formato de la fecha");
           }
           p.setFechaF12(fechaStr);
        }
        
        Destinatario d = new Destinatario();
        d.setNombre(row.getANOMBRE() == null ? "" : row.getANOMBRE());
        
        Rut rut = new Rut();
        
        if (row.getARUT().indexOf("-")==-1){
          rut.setMantisa(new BigInteger(row.getARUT().substring(0, row.getARUT().length()-1)));
          rut.setDv(row.getARUT().substring(row.getARUT().length()-1, row.getARUT().length()));
        }else{
          rut.setMantisa(new BigInteger(row.getARUT().substring(0, row.getARUT().indexOf("-"))));
          rut.setDv(row.getARUT().substring(row.getARUT().indexOf("-")+1));         
        }
        
        d.setRut(rut);
        
        Direccion di = new Direccion();
        di.setCalle(row.getADIRECCION() == null ?  "" : row.getADIRECCION());
        di.setComuna(row.getACOMUNA() == null ? "" : row.getACOMUNA());
        d.setDireccion(di);
        
        p.setDestinatario(d);
      
      return new Tupla<InfoPalet, List<Long>>(p, skus);
      }else
        return  null;
   }
   
    public String getTipoDespacho(String nroF12)
    {
       return dao.getTipoDespacho(nroF12);
    }

 /**
     * Obtiene la agenda actual proveedor venta en verde
     * @param empresa
     * @param almacen
     * @param fechaEntrega
     * @param turno
     * @param tipoMuelle
     * @return
     * @throws IntolException
     */
    public String consultaSABAgendaActual(String empresa, String almacen, 
                                          String fechaEntrega, String turno, 
                                          String tipoMuelle) throws IntolException {

        log.info("consultaSABAgendaActual service");
                                          
        StringWriter xml = new StringWriter();
        try {
        
            // creando mensaje xml a SAB
            cl.falabella.b2b.intol.ws.agendaventaverde.beans.consmuelles.Archivo archivo = new cl.falabella.b2b.intol.ws.agendaventaverde.beans.consmuelles.Archivo();
            archivo.setEmpresa(empresa);
            archivo.setAlmacen(almacen);
            archivo.setFechaEntrega(fechaEntrega);
            archivo.setTurno(turno);
            archivo.setTipoMuelle(tipoMuelle);
        
            JAXBContext jaxbContext = JAXBContext.newInstance(cl.falabella.b2b.intol.ws.agendaventaverde.beans.consmuelles.Archivo.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            
            jaxbMarshaller.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");            
            jaxbMarshaller.marshal(archivo, xml);
                       
            log.debug("xml request consulta agenda actual : " + xml.toString());

        } catch (Exception e) {
            e.printStackTrace();
            log.error("Error al crear mensaje a SAB. Agenda actual proveedor venta en verde : " + e.getMessage());
            throw new IntolException(0, "Error al crear mensaje a SAB. Agenda actual proveedor venta en verde");
        }
       
        return dao.consultaAgendaActual(xml.toString());
    }

    /**
     * Obtiene las ventanas necesarias para una entrada unica proveedor venta en verde
     * @param consignatario
     * @param empresa
     * @param rutProveedor
     * @param almacen
     * @param tipoMuelle
     * @param entradaUnica
     * @return
     * @throws IntolException
     */
    public String consultaSABVentanas(String consignatario, String empresa, 
                                      String rutProveedor, String almacen, 
                                      String tipoMuelle, String entradaUnica) throws IntolException {

        log.info("consultaSABVentanas service");

        StringWriter xml = new StringWriter();
        try {
        
            cl.falabella.b2b.intol.ws.agendaventaverde.beans.consventanas.Archivo archivo = new cl.falabella.b2b.intol.ws.agendaventaverde.beans.consventanas.Archivo();
            archivo.setConsignatario(consignatario);
            archivo.setEmpresa(empresa);
            archivo.setProveedor(rutProveedor);
            archivo.setAlmacen(almacen);
            archivo.setTipoMuelle(tipoMuelle);
            archivo.setEntradaUnica(entradaUnica);
        
            JAXBContext jaxbContext = JAXBContext.newInstance(cl.falabella.b2b.intol.ws.agendaventaverde.beans.consventanas.Archivo.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            
            jaxbMarshaller.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");        
            jaxbMarshaller.marshal(archivo, xml);
                       
            System.out.print("xml request consulta ventanas : " + xml.toString());               

        } catch (Exception e) {
            e.printStackTrace();
            log.error("Error al crear mensaje a SAB. Ventanas necesarias proveedor venta en verde: " + e.getMessage());
            throw new IntolException(0, "Error al crear mensaje a SAB. Ventanas necesarias proveedor venta en verde");        
        }
       
        return dao.consultaVentanas(xml.toString());
    }

    /**
     * Envia una reserva de agenda proveedor venta en verde
     * @param consignatario
     * @param empresa
     * @param rutProveedor
     * @param almacen
     * @param tipoMuelle
     * @param entradaUnica
     * @param fechaEntrega
     * @param horaInicio
     * @return
     * @throws IntolException
     */
    public String reservaSABAgenda(String consignatario, String empresa, 
                                   String rutProveedor, String almacen, 
                                   String tipoMuelle, String entradaUnica, 
                                   String fechaEntrega, String horaInicio) throws IntolException {

        log.info("reservaSABAgenda service");
                                   
        StringWriter xml = new StringWriter();
        try {
        
            cl.falabella.b2b.intol.ws.agendaventaverde.beans.agenda.Archivo archivo = new cl.falabella.b2b.intol.ws.agendaventaverde.beans.agenda.Archivo();
            archivo.setConsignatario(consignatario);
            archivo.setEmpresa(empresa);
            archivo.setProveedor(rutProveedor);
            archivo.setAlmacen(almacen);
            archivo.setTipoMuelle(tipoMuelle);
            archivo.setEntradaUnica(entradaUnica);
            archivo.setFechaEntrega(fechaEntrega);
            archivo.setHoraInicio(horaInicio);
        
            JAXBContext jaxbContext = JAXBContext.newInstance(cl.falabella.b2b.intol.ws.agendaventaverde.beans.agenda.Archivo.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            
            jaxbMarshaller.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");           
            jaxbMarshaller.marshal(archivo, xml);
                       
            System.out.print("xml request reserva agenda : " + xml.toString());               

        } catch (Exception e) {
            e.printStackTrace();
            log.error("Error al crear mensaje a SAB. Reserva de agenda proveedor venta en verde : " + e.getMessage());
            throw new IntolException(0, "Error al crear mensaje a SAB. Reserva de agenda proveedor venta en verde");          
        }

        return dao.reservaAgenda(xml.toString());
    }

    public String getIndicador(String tipoDespacho)
    {
       return dao.getIndicador(tipoDespacho);
    }
    
    public String getValidarRut(String rutProveedor, String indicador) 
    {
       return dao.getValidarRut(rutProveedor, indicador); 
    }
	  /**
      * @author Jmoraga
      * @date 13/05/2014 
      * @return void
      */
     @Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false) 
     public void getSabViajesNoProcesados()
     {
     
        log.debug("Procesando viajes : getSabViajesNoProcesados()");
     
        List<SabViaje> viajes= sabTottusDao.getSabViajesNoProcesados();
        
        log.debug("Cantidad de viajes a procesar : " + viajes.size());
        
        for(SabViaje viaje: viajes){
            try{            
                InfoViajeRequest request = new InfoViajeRequest();
                request.setRequest(viaje.getMensaje());
                
                log.debug("Enviando viaje : " + viaje.getViaje());
                InfoViajeResponse response = infoviajeServices.informarViaje(request);
                log.debug("Respuesta a viaje : " + viaje.getViaje() + " : " + response.getResponse());
                if (response.getResponse().equals("0")){
                    log.debug("Actualizando viaje OK: " + viaje.getViaje());
                    sabTottusDao.setSabViajeProcesado(viaje.getViaje(),"T");
                    log.debug("Viaje actualizado OK : " + viaje.getViaje());
                }
                else{
                    log.debug("Actualizando viaje con ERROR : " + viaje.getViaje());
                    sabTottusDao.setSabViajeProcesado(viaje.getViaje(),"E");
                    log.debug("Viaje actualizado con ERROR : " + viaje.getViaje());                
                }                
              } catch (Exception e) {
                 log.debug("Error al informar viaje a GPS : " + e.getMessage());
                 continue;
            }          
      }
             
     }
}
