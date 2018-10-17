
package cl.falabella.b2b.intol.ws.agendaunica.service;

import cl.falabella.b2b.intol.beans.agendaunicahorario.Archivo;
import cl.falabella.b2b.intol.common.IntolUtil;
import cl.falabella.b2b.intol.service.impl.IntolException;
import cl.falabella.b2b.intol.ws.agendaunica.beans.agendaunicacalculaventana.AguPlanification;
import cl.falabella.b2b.intol.ws.client.agendaunica.appointment.service.AppointmentPt;
import cl.falabella.b2b.intol.ws.client.agendaunica.appointment.service.AppointmentService;
import cl.falabella.b2b.intol.ws.client.agendaunica.appointment.beans.req.AppointmentReq;
import cl.falabella.b2b.intol.ws.client.agendaunica.appointment.beans.req.AppointmentReq.Message.Appointment;
import cl.falabella.b2b.intol.ws.client.agendaunica.appointment.beans.req.ChannelTYPE;
import cl.falabella.b2b.intol.ws.client.agendaunica.appointment.beans.req.CommerceTYPE;
import cl.falabella.b2b.intol.ws.client.agendaunica.appointment.beans.req.CountryTYPE;
import cl.falabella.b2b.intol.ws.client.agendaunica.appointment.beans.resp.AppointmentRespTYPE;
import java.math.BigInteger;
import java.net.URL;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author HectorOlivares
 */
public class AgendaUnicaServiceImpl implements AgendaUnicaService {

    private static Log log = LogFactory.getLog(AgendaUnicaServiceImpl.class);
    private cl.falabella.b2b.intol.service.AgendaUnicaService aguService;

    public static final String AGENDA_APPOINTMENT               = "B2B_Appointment_";
    public static final String TIPO_SISTEMA                     = "WMOS"; 
    public static final String RESPUESTA_AGENDAUNICAB2B_OK      = "0";
    public static final String RESPUESTA_AGENDAUNICAB2B_ERROR   = "1";
    public static final String NEGOCIO_FALABELLA                = "FALA";
    public static final String NEGOCIO_SODIMAC                  = "SOD";
    
    public AgendaUnicaServiceImpl(cl.falabella.b2b.intol.service.AgendaUnicaService service) {
        this.aguService = service;
    }

    public Archivo consultaHorario(Archivo request) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        request = aguService.getConsultaAgendaHorario(request);
        return request;
    }

    @Override
    public cl.falabella.b2b.intol.ws.agendaunica.beans.agendaunicacalculaventanaresp.Archivo calculaVentana(AguPlanification request) {

        log.debug("calculaVentana ws");
        
        cl.falabella.b2b.intol.ws.agendaunica.beans.agendaunicacalculaventanaresp.Archivo response = this.aguService.getcalculaVentana(request);

        return response;
    }

    @Override
    public cl.falabella.b2b.intol.ws.agendaunica.beans.agendaagendar.Archivo agendar(cl.falabella.b2b.intol.ws.agendaunica.beans.agendaagendar.Archivo request) {

        log.debug("Agendar ws");
        
        cl.falabella.b2b.intol.ws.agendaunica.beans.agendaagendar.to.AgendaUnicaAgendarTo agendaB2B =null;
        
        try {
            
            //agendar en b2b
            agendaB2B = this.aguService.reservaAgenda(request);
                        
            if(RESPUESTA_AGENDAUNICAB2B_OK.equals(agendaB2B.getArchivo().getError().getCodigo())){

                // identificador de referencia para sistemas externos 
                String idReference = this.aguService.getIdReferenceSeq()+"";                
                
                // agendar WMOS (appointment) solo si la respuesta de agendar B2B es correcta y si es SODIMAC            
                String negocio = this.aguService.getParametroGeneralByCodigo("B2B_NEGOCIO");            
                if(NEGOCIO_SODIMAC.equalsIgnoreCase(negocio)){

                    // enlazar parametro url
                    String urlString= this.aguService.getParametroGeneralByCodigo("URL_WS_APPOINTMENT");
                    
                    //URL url = new URL(urlString);
                    URL url = new URL(urlString.concat("?wsdl"));
                    //QName SERVICE_NAME = new QName("http://mdwcorp.falabella.com/LOG/CORP/WLS/wsdl/WMOS/Appointment/v1.0", "AppointmentService");                        
                    QName SERVICE_NAME = new QName(urlString, "AppointmentService");                        
                    
                    AppointmentService service = new AppointmentService(url, SERVICE_NAME);
                    
                    AppointmentPt client = service.getAppointmentPort();
                    
                    BindingProvider bp = (BindingProvider)client;
                    bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,urlString);
  
                    // request appointment
                    AppointmentReq requestAppointment = new AppointmentReq();                     
                    
                    // header
                    AppointmentReq.Header appointmentHeader = new AppointmentReq.Header();
                    appointmentHeader.setSource(ChannelTYPE.B_2_B.value());
                    appointmentHeader.setActionType("create");
                    appointmentHeader.setSequenceNumber(idReference);
                    appointmentHeader.setReferenceId(AGENDA_APPOINTMENT+idReference);            
                    appointmentHeader.setMessageType("Appointment");
                    appointmentHeader.setCompanyId("1");
                    
                    // client service            
                    AppointmentReq.ClientService appoinntmentClientService = new AppointmentReq.ClientService();
                    appoinntmentClientService.setCountry(CountryTYPE.CL);                                        
                    appoinntmentClientService.setCommerce(CommerceTYPE.SODIMAC);
                    appoinntmentClientService.setChannel(ChannelTYPE.B_2_B);
                    
                    // payload
                    AppointmentReq.Message appointmentMessage = new AppointmentReq.Message();                    
                    
                    Appointment ap = new Appointment();
                    ap.setAppointmentId(request.getEntradaUnica());         // numero de cita
                    ap.setAppointmentType("LiveLoad");
                    ap.setFacilityAliasId(request.getAlmacen());            // id de bodega
                    ap.setAppointmentStatus("Scheduled");
                    ap.setSealNumber("N/A");
                    ap.setScheduledDateTime(request.getFechaEntrega());     // fecha de agenda
                    
                    // resta horarioTermino - horarioInicio
                    String ventanaPeriodos=IntolUtil.diferenciaPeriodos(request.getHoraInicio(), request.getHoraTermino(),15)+"";
                    ap.setDriverDurationInMin(ventanaPeriodos);
                    ap.setTrailerDurationInMinutes(new BigInteger(ventanaPeriodos));                    
                    ap.setBusinessUnit("1");
                    ap.setRequestedTime(request.getFechaEntrega());         // fecha de agenda                    
                    
                    Appointment.ApptObject appObject = new Appointment.ApptObject();
                    appObject.setObjectType("ASN");            
                    Appointment.ApptObject.PurchaseOrder po = new Appointment.ApptObject.PurchaseOrder();
                    appObject.getPurchaseOrder().add(po);
                    ap.getApptObject().add(appObject);
                    
                    Appointment.AppointmentSlots appSlots = new Appointment.AppointmentSlots();            
                    ap.getAppointmentSlots().add(appSlots);                    
                    
                    appointmentMessage.getAppointment().add(ap);

                    requestAppointment.setHeader(appointmentHeader);
                    requestAppointment.setClientService(appoinntmentClientService);
                    requestAppointment.setMessage(appointmentMessage);          

                    AppointmentRespTYPE resultAppointment = client.appointmentOp(requestAppointment);
                    resultAppointment.getRespuestaConsulta();
                    
                }
                
                // reservar agenda para proveedor                    
                int codigoRespuestaAppointment = this.aguService.preProcesamiento(idReference, agendaB2B.getCodAgenda()+"", negocio, agendaB2B.getCodAgenda());
                if(codigoRespuestaAppointment == 1)                                            
                    log.debug("Appointment realizado correctamente. ID_REFERENCIA : " + idReference);
                else
                    log.debug("Appointment realizado con error. ID_REFERENCIA : " + idReference);                
                
            
            }
            else{            
                log.debug("Error al enviar reserva de agenda unica");
            }
 
        } catch (Exception e) {
            
            log.error("Error al enviar reserva de agenda unica", e);
            cl.falabella.b2b.intol.ws.agendaunica.beans.agendaagendar.Error error = new cl.falabella.b2b.intol.ws.agendaunica.beans.agendaagendar.Error();
            error.setCodigo("1");
            error.setDescripcion(e.getMessage());
            request.setError(error);
            return request;

        }
        return agendaB2B.getArchivo();
    }

}
