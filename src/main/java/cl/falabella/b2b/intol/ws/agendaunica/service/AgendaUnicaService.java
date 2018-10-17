package cl.falabella.b2b.intol.ws.agendaunica.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.2.11 Thu Apr 20 12:53:40 CLST 2017
 * Generated source version: 2.2.11
 *
 */
@WebService(targetNamespace = "http://b2b.falabella.com/service/ol/agenda-unica", name = "AgendaUnicaService")
@XmlSeeAlso({cl.falabella.b2b.intol.beans.agendaunicahorario.ObjectFactory.class, cl.falabella.b2b.intol.ws.agendaunica.beans.agendaunicacalculaventana.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)

public interface AgendaUnicaService {

    @WebMethod
    @WebResult(name = "Archivo", targetNamespace = "http://b2b.falabella.com/schemas/ol/agenda_unica_horario", partName = "response")
    public cl.falabella.b2b.intol.beans.agendaunicahorario.Archivo consultaHorario(
            @WebParam(partName = "request", name = "Archivo", targetNamespace = "http://b2b.falabella.com/schemas/ol/agenda_unica_horario") cl.falabella.b2b.intol.beans.agendaunicahorario.Archivo request
    );


    @WebResult(name = "Archivo", targetNamespace = "http://b2b.falabella.com/schemas/ol/agenda_unica_calcula_ventanaresp", partName = "response")
    @WebMethod
    public cl.falabella.b2b.intol.ws.agendaunica.beans.agendaunicacalculaventanaresp.Archivo calculaVentana(
            @WebParam(partName = "request", name = "agu-planification", targetNamespace = "http://b2b.falabella.com/schemas/ol/agenda_unica_calcula_ventana") cl.falabella.b2b.intol.ws.agendaunica.beans.agendaunicacalculaventana.AguPlanification request
    );

    @WebResult(name = "Archivo", targetNamespace = "http://b2b.falabella.com/schemas/ol/agenda_unica_agendar", partName = "response")
    @WebMethod
    public cl.falabella.b2b.intol.ws.agendaunica.beans.agendaagendar.Archivo agendar(
            @WebParam(partName = "request", name = "Archivo", targetNamespace = "http://b2b.falabella.com/schemas/ol/agenda_unica_agendar") cl.falabella.b2b.intol.ws.agendaunica.beans.agendaagendar.Archivo request
    );
}