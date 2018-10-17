package cl.falabella.b2b.intol.ws.agendaventaverde.service;

import cl.falabella.b2b.intol.common.JAXBUtil;
import cl.falabella.b2b.intol.service.B2bService;
import cl.falabella.b2b.intol.service.SabService;
import cl.falabella.b2b.intol.ws.agendaventaverde.beans.agenda.Archivo;
import cl.falabella.b2b.intol.ws.entregadocumento.beans.request.EntregaDocumentoRequest;
import cl.falabella.b2b.intol.ws.infopalet.beans.request.InfoPaletRequest;

import cl.falabella.b2b.intol.ws.infopalet.service.InfoPaletServiceImpl;

import java.io.IOException;

import java.io.StringReader;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class AgendaVerdeServiceImpl implements AgendaVerdeService{

    private static Log log = LogFactory.getLog(AgendaVerdeServiceImpl.class);

    private SabService sabService;
    public AgendaVerdeServiceImpl(SabService sabService){
       this.sabService = sabService;
    }

    public cl.falabella.b2b.intol.ws.agendaventaverde.beans.consmuelles.Archivo consultaAgendaActual(cl.falabella.b2b.intol.ws.agendaventaverde.beans.consmuelles.Archivo request) {
    
        log.debug("consultaAgendaActual ws");
        
        cl.falabella.b2b.intol.ws.agendaventaverde.beans.consmuelles.Archivo response = null;        
        try{    
            //consulta SAB
            String xmlresponse = sabService.consultaSABAgendaActual(request.getEmpresa(), request.getAlmacen(), request.getFechaEntrega(), request.getTurno(), request.getTipoMuelle());
            StringReader sr = new StringReader(xmlresponse);
            log.debug("xml response : " + xmlresponse);
               
            //unmarshal            
            response = (cl.falabella.b2b.intol.ws.agendaventaverde.beans.consmuelles.Archivo)JAXBUtil.getInstance()
                       .unmarshal(cl.falabella.b2b.intol.ws.agendaventaverde.beans.consmuelles.Archivo.class, sr);        
        }catch(Exception e){
            log.error("Error al obtener agenda actual proveedor venta en verde", e);
            cl.falabella.b2b.intol.ws.agendaventaverde.beans.consmuelles.Error error = new cl.falabella.b2b.intol.ws.agendaventaverde.beans.consmuelles.Error();
            error.setCodigo("1");
            error.setDescripcion(e.getMessage());
            request.setError(error);
            return request;
        }
        
        return response;
    }

    public cl.falabella.b2b.intol.ws.agendaventaverde.beans.consventanas.Archivo consultaVentanas(cl.falabella.b2b.intol.ws.agendaventaverde.beans.consventanas.Archivo request) {
        
        log.debug("consultaVentanas ws");
        
        cl.falabella.b2b.intol.ws.agendaventaverde.beans.consventanas.Archivo response = null;
        try{
            //consulta SAB
            String xmlresponse = sabService.consultaSABVentanas(request.getConsignatario(), request.getEmpresa(), request.getProveedor(), request.getAlmacen(), request.getTipoMuelle(), request.getEntradaUnica());
            StringReader sr = new StringReader(xmlresponse);
            log.debug("xmlresponse : " + xmlresponse);
        
            //unmarshal
            response = (cl.falabella.b2b.intol.ws.agendaventaverde.beans.consventanas.Archivo)JAXBUtil.getInstance()
                        .unmarshal(cl.falabella.b2b.intol.ws.agendaventaverde.beans.consventanas.Archivo.class, sr);        
        }catch(Exception e){
            log.error("Error al obtener ventanas disponibles proveedor venta en verde", e);
            cl.falabella.b2b.intol.ws.agendaventaverde.beans.consventanas.Error error = new cl.falabella.b2b.intol.ws.agendaventaverde.beans.consventanas.Error();
            error.setCodigo("1");
            error.setDescripcion(e.getMessage());
            request.setError(error);
            return request;   
        }
        
        return response;
    }

    public cl.falabella.b2b.intol.ws.agendaventaverde.beans.agenda.Archivo reservaAgenda(cl.falabella.b2b.intol.ws.agendaventaverde.beans.agenda.Archivo request) {
    
        log.debug("reservaAgenda ws");
        
        cl.falabella.b2b.intol.ws.agendaventaverde.beans.agenda.Archivo response = null;        
        try{    
            //consulta SAB
            String xmlresponse = sabService.reservaSABAgenda(request.getConsignatario(), request.getEmpresa(), request.getProveedor(), request.getAlmacen(), request.getTipoMuelle(), request.getEntradaUnica(), request.getFechaEntrega(), request.getHoraInicio());
            StringReader sr = new StringReader(xmlresponse);
            log.debug("xml response : " + xmlresponse);

            //unmarshal
            response =
                    (cl.falabella.b2b.intol.ws.agendaventaverde.beans.agenda.Archivo)JAXBUtil.getInstance()
                    .unmarshal(cl.falabella.b2b.intol.ws.agendaventaverde.beans.agenda.Archivo.class, sr);        
        }catch(Exception e){
            log.error("Error al enviar reserva de agenda proveedor venta en verde", e);
            cl.falabella.b2b.intol.ws.agendaventaverde.beans.agenda.Error error = new cl.falabella.b2b.intol.ws.agendaventaverde.beans.agenda.Error();
            error.setCodigo("1");
            error.setDescripcion(e.getMessage());
            request.setError(error);
            return request;            
        }
    
        return response;
    }

}
