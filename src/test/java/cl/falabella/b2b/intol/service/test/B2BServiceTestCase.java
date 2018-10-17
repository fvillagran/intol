
package cl.falabella.b2b.intol.service.test;

import cl.falabella.b2b.intol.ws.agendaunica.beans.agendaunicacalculaventana.AguPlanification;
import cl.falabella.b2b.intol.dao.B2bDAO;
import cl.falabella.b2b.intol.beans.agendaunicahorario.Archivo;
import cl.falabella.b2b.intol.beans.agendaunicahorario.TipoCalendario;
import cl.falabella.b2b.intol.ws.agendaunica.beans.agendaagendar.Muelle;
import cl.falabella.b2b.intol.ws.agendaunica.beans.agendaagendar.Muelles;
import cl.falabella.b2b.intol.ws.client.agendaunica.appointment.beans.req.AppointmentReq;
import cl.falabella.b2b.intol.ws.client.agendaunica.appointment.beans.req.AppointmentReq.ClientService;
import cl.falabella.b2b.intol.ws.client.agendaunica.appointment.beans.req.AppointmentReq.Header;
import cl.falabella.b2b.intol.ws.client.agendaunica.appointment.beans.req.AppointmentReq.Message;
import cl.falabella.b2b.intol.ws.client.agendaunica.appointment.beans.req.AppointmentReq.Message.Appointment;
import cl.falabella.b2b.intol.ws.client.agendaunica.appointment.beans.req.AppointmentReq.Message.Appointment.AppointmentSlots;
import cl.falabella.b2b.intol.ws.client.agendaunica.appointment.beans.req.AppointmentReq.Message.Appointment.ApptObject;
import cl.falabella.b2b.intol.ws.client.agendaunica.appointment.beans.req.AppointmentReq.Message.Appointment.ApptObject.PurchaseOrder;
import cl.falabella.b2b.intol.ws.client.agendaunica.appointment.beans.req.AppointmentReq.Message.Appointment.CustomAttribute;
import cl.falabella.b2b.intol.ws.client.agendaunica.appointment.beans.req.ChannelTYPE;
import cl.falabella.b2b.intol.ws.client.agendaunica.appointment.beans.req.CommerceTYPE;
import cl.falabella.b2b.intol.ws.client.agendaunica.appointment.beans.req.CountryTYPE;
import cl.falabella.b2b.intol.ws.client.agendaunica.appointment.beans.resp.AppointmentRespTYPE;
import cl.falabella.b2b.intol.ws.client.agendaunica.appointment.service.AppointmentPt;
import cl.falabella.b2b.intol.ws.client.agendaunica.appointment.service.AppointmentService;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;
import java.util.Date;
import javax.xml.ws.BindingProvider;
import org.springframework.beans.factory.annotation.Autowired;
import javax.xml.namespace.QName;
import java.net.URL;
import java.util.Calendar;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:b2b-test-ol-*.xml"})
public class B2BServiceTestCase {

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

    @Autowired    
    private B2bDAO b2bDAO;
    
    private static final Logger logger = Logger.getLogger(B2BServiceTestCase.class);
  
    @Test
    public void getFechaSistema() {        
        logger.debug("getFechaSistema");
        b2bDAO.getFechaSistema();             
    }

  @Test
    public void getConsultaHorario() {
        
        logger.debug("getFechaSistema ggg");
        
        String fechaEntrega = sdf.format(new Date());
        
        Archivo archivo = new Archivo();
        archivo.setAlmacen(10L);
        archivo.setConsignatario("FRCL");
        archivo.setEmpresa("11111111");        
        archivo.setFecha(fechaEntrega);
        archivo.setTurno("10");
        archivo.setProveedor("22222222");
        archivo.setTipoMuelle("10");
        
        Archivo response = b2bDAO.getconsultaAgendaHoario(archivo);
         logger.debug("getConsultaHorario 1");
       // Assert.isNull(response);
         logger.debug("getConsultaHorario 2");
     
    } 
    
    @Test
    public void getConsultaHorarioSemana() {
        
        logger.debug("getFechaSistema ggg");
    
        Archivo archivo = new Archivo();
        archivo.setAlmacen(944);
        archivo.setConsignatario("1");
        archivo.setEmpresa("F");        
        archivo.setFecha("24/05/2017");
        archivo.setTurno("D");
        archivo.setProveedor("85");
        archivo.setTipoMuelle("BT");
        archivo.setTipoCalendario(TipoCalendario.SEMANA);
        
        Archivo response = b2bDAO.getconsultaAgendaHoario(archivo);
         logger.debug("getConsultaHorario 1");
       // Assert.isNull(response);
         logger.debug("getConsultaHorario 2");
     
    } 
    
   



 @Test
    public void getcalculaVentana() {
        
        logger.debug("getcalculaVentana(end)");
        AguPlanification aguPLanificacion=new AguPlanification();
       
        aguPLanificacion.setConsignatario("consig");
        aguPLanificacion.setEmpresa("emp");
        aguPLanificacion.setProveedor("provedor");
        aguPLanificacion.setDataDelivery(null);
        aguPLanificacion.setDiProvider("1");
        aguPLanificacion.setEu("1");
        aguPLanificacion.setItems(null);
        aguPLanificacion.setPlaceDelivery("1");
        aguPLanificacion.setTurn("1");
        aguPLanificacion.setWarehouseType("1");
        
        cl.falabella.b2b.intol.ws.agendaunica.beans.agendaunicacalculaventanaresp.Archivo sa = b2bDAO.getCalculaVentanas(aguPLanificacion);
        sa.getVentanas();
        Assert.notNull(sa.getVentanas()!=null);
        
        logger.debug("getcalculaVentana(fin)");

    }
    
    
    @Test
    public void agendar() {
        
        logger.debug("agendar");
        cl.falabella.b2b.intol.ws.agendaunica.beans.agendaagendar.Archivo archivo=new cl.falabella.b2b.intol.ws.agendaunica.beans.agendaagendar.Archivo();
       
        archivo.setAlmacen("379");
        archivo.setNRut(new Long("77265150"));
        archivo.setConsignatario("consiganatario");
        archivo.setEmpresa("empesa");
        archivo.setEntradaUnica("1100001123");
        archivo.setFechaEntrega("17/07/2017");
        archivo.setHoraInicio("8:45");
        archivo.setHoraTermino("9:15");
        archivo.setOrgLvlChild(new Long(305));
        archivo.setVpcTechKey(new Long(1427));
        archivo.setProveedor("proveedor");
        archivo.setTipoAccion("I");
        archivo.setTipoMuelle("REG");
        archivo.setTurno("D");
        Muelles muelles=new Muelles();
        Muelle e=new Muelle();
        e.setCodigo("1");
        e.setNum(1);
        e.setUso("uso");
        muelles.getMuelle().add(e);
        archivo.setMuelles(muelles);
                                                        
        b2bDAO.reservaAgenda(archivo);
        
        //Assert.isTrue(archivo.getError().getCodigo().equals("1"));
        logger.debug("getcalculaVentana(fin)"+archivo.getError().getDescripcion());
        logger.debug("getcalculaVentana(fin)"+archivo.getError().getCodigo());
        
    }
   

    @Test
    public void getParamterAPPOINTMENT() {
        logger.debug("****************************");

        String salidA = b2bDAO.getParametroGeneralByCodigo("URL_WS_APPOINTMENT");
        logger.debug("*************URL_WS_APPOINTMENT=" + salidA + "***************");
    }
  
     @Test
    public void getPreprocesamiento() {
        logger.debug("***********getPreprocesamiento***********");

        int salida = b2bDAO.preProcesamiento("Test_id_referencia", "llave_test", "sistema_test", 123);
        logger.debug("*************URL_WS_APPOINTMENT=" + salida + "***************");
        
        Assert.notNull(salida > 0);
        
    }
    
      @Test
    public void getIdReference() {
        logger.debug("***********getIdReference***********");

        int salida = b2bDAO.getIdReferenceSeq();
        logger.debug("ID reference : " + salida);
        
        Assert.isTrue(salida > 0, salida+"");
        
    }

    @Test
    public void getServiceAppointment(  ) {
        
        logger.debug("***********getServiceAppointment***********");
                
        try{
        
            // enlazar parametro url
            URL url = new URL("file:/F:/proyectos/AGENDA_UNICA/CM/PRAGMA_INTOL/files/AppointmentService.wsdl");
            QName SERVICE_NAME = new QName("http://mdwcorp.falabella.com/LOG/CORP/WLS/wsdl/WMOS/Appointment/v1.0", "AppointmentService");
            
            AppointmentService service = new AppointmentService(url, SERVICE_NAME);            
            
            int idreference = b2bDAO.getIdReferenceSeq();        
            
            AppointmentPt client = service.getAppointmentPort();
            
            BindingProvider bp = (BindingProvider)client;
            bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://middlewaretest.falabella.cl/logi/producer/WMOS/Appointment/v1.0");
            
            final String AGENDA_APPOINTMENT="B2B_Appointment_";
            int ID_REFERENCE_SEQUENCE=idreference;            

            // request
            AppointmentReq request = new AppointmentReq(); 

            // header
            Header appointmentHeader = new Header();
            appointmentHeader.setSource(ChannelTYPE.B_2_B.value());
            appointmentHeader.setActionType("update");
            appointmentHeader.setSequenceNumber(ID_REFERENCE_SEQUENCE+"");
            appointmentHeader.setReferenceId(AGENDA_APPOINTMENT+ID_REFERENCE_SEQUENCE);            
            appointmentHeader.setMessageType("Appointment");
            appointmentHeader.setCompanyId("1");        

            // client service            
            ClientService appoinntmentClientService = new AppointmentReq.ClientService();
            appoinntmentClientService.setCountry(CountryTYPE.CL);
            appoinntmentClientService.setCommerce(CommerceTYPE.SODIMAC);
            appoinntmentClientService.setChannel(ChannelTYPE.B_2_B);          

            // payload
            Message appointmentMessage = new Message();

            Appointment ap = new Appointment();
            ap.setAppointmentId("1ART010001");              // numero de cita
            ap.setAppointmentType("LiveLoad");
            ap.setFacilityAliasId("1701");
            ap.setAppointmentStatus("Scheduled");
            ap.setSealNumber("N/A");
            //ap.setCarrierCode("");
            ap.setScheduledDateTime("07/14/2017 12:00");    // fecha de agenda
            //ap.setActualCheckInDateTime("");
            //ap.setCheckOutDateTime("");
            //ap.setLoadUnloadStartDateTime("");
            //ap.setLoadUnloadEndDateTime("");
            //ap.setAppointmentPriority("High");
            ap.setDriverDurationInMin("15");
            //ap.setControlNumber("");
            //ap.setRequestorName("");
            //ap.setRequestorType("");
            //ap.setReservedAppointmentId("");
            //ap.setTpCompanyId("");
            //ap.setAppointmentReasonId("");
            //ap.setAppointmentReasonCode("");
            ap.setTrailerDurationInMinutes(new BigInteger("15"));
            //ap.setDriverId("");
            //ap.setCancelReasonCode("");
            //ap.setCancelReasonCode("");
            //ap.setCommunicationMode("");
            //ap.setAppointmentComments("");
            //ap.setBusinessPartner("");
            //ap.setCancelIndicator("");
            //ap.setLoadPosition("Nose");
            ap.setBusinessUnit("1");
            ap.setRequestedTime("07/14/2017 12:00"); // fecha de agenda
            //ap.setTemplateId("");
            //ap.setCancelledAppointmentId("");
            //ap.setAppointmentSource("");
            //ap.setLoadConfiguration("");
            //ap.setEquipment("");
            //ap.setEquipmentId("");
            //ap.setEquipmentCode("");
            //ap.setTractorId("");
            //ap.setTractorType("");
            //ap.setEquipment("");
            //ap.setDockId("");
            //ap.setDoorId("");
            
            ApptObject appObject = new ApptObject();
            appObject.setObjectType("ASN");            
            PurchaseOrder po = new PurchaseOrder();
            appObject.getPurchaseOrder().add(po);
            ap.getApptObject().add(appObject);
                        
            AppointmentSlots appSlots = new AppointmentSlots();            
            ap.getAppointmentSlots().add(appSlots);
            
            /*
            CustomAttribute customAttribute = new CustomAttribute();
            customAttribute.setAttributeName("");
            customAttribute.setAttributeValue("");            
            ap.getCustomAttribute().add(customAttribute);
            */
            
            appointmentMessage.getAppointment().add(ap);
          
            request.setHeader(appointmentHeader);
            request.setClientService(appoinntmentClientService);
            request.setMessage(appointmentMessage);          

            AppointmentRespTYPE result = client.appointmentOp(request);
            result.getRespuestaConsulta();
            
            logger.info("REFERENCIA : " + AGENDA_APPOINTMENT+ID_REFERENCE_SEQUENCE);
            
            logger.info("RESPUESTA SERVICIO : " + result.getRespuestaConsulta());
            
            Assert.notNull(result, result.getRespuestaConsulta());
        }
        catch(Exception ex){
            logger.error("Error al consumir WSDL", ex);
        }
    }    

     @Test
    public void getDiferenciaEnMinutosA() {
                
        SimpleDateFormat parser = new SimpleDateFormat("HH:mm");
        
        try{
            Date inicio  = parser.parse("10:15");
            Date termino = parser.parse("13:45");        
            
            double diferencia = ((termino.getTime() - inicio.getTime())/(3600*1000.0));
            
            long hora = (long)diferencia;
            
            logger.info("Diferencia en horas : " + hora);
            
            diferencia = ((diferencia - hora)*60);
            
            long minutos = (long)diferencia;
            
            logger.info("Diferencia en minutos : " + minutos);
            
            long totalMinutos = hora * 60 + minutos;
            
            logger.info("Total Ventanas: " + totalMinutos / 15);
            
        }
        catch(Exception ex){
            logger.error("Error al consumir WSDL", ex);
        }


        
    }   
    
}
