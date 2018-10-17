/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.falabella.b2b.intol.service;

import cl.falabella.b2b.intol.service.impl.IntolException;
import java.util.Date;

/**
 *
 * @author HectorOlivares
 */
public interface AgendaUnicaService {

    public cl.falabella.b2b.intol.beans.agendaunicahorario.Archivo getConsultaAgendaHorario(cl.falabella.b2b.intol.beans.agendaunicahorario.Archivo archivo);

    public cl.falabella.b2b.intol.ws.agendaunica.beans.agendaunicacalculaventanaresp.Archivo getcalculaVentana(cl.falabella.b2b.intol.ws.agendaunica.beans.agendaunicacalculaventana.AguPlanification aguPlanification);

    public cl.falabella.b2b.intol.ws.agendaunica.beans.agendaagendar.to.AgendaUnicaAgendarTo reservaAgenda(cl.falabella.b2b.intol.ws.agendaunica.beans.agendaagendar.Archivo request) throws IntolException;

    public String getParametroGeneralByCodigo(String cparamst);
    
    public int preProcesamiento(String IdReferencia, String llaveAgenda, String sistema,int codAgenda);
    
    public int getIdReferenceSeq();


}
