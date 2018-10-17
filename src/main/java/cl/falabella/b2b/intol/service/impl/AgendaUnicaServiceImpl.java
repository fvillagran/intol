/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.falabella.b2b.intol.service.impl;

import cl.falabella.b2b.intol.beans.agendaunicahorario.Diario;
import cl.falabella.b2b.intol.dao.B2bDAO;
import cl.falabella.b2b.intol.service.AgendaUnicaService;
import java.util.Date;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author HectorOlivares
 */
public class AgendaUnicaServiceImpl implements AgendaUnicaService {

    private static Log log = LogFactory.getLog(AgendaUnicaServiceImpl.class);

    private B2bDAO dao;

    public AgendaUnicaServiceImpl(B2bDAO dao) {
        this.dao = dao;
    }

    @Override
    public cl.falabella.b2b.intol.beans.agendaunicahorario.Archivo getConsultaAgendaHorario(cl.falabella.b2b.intol.beans.agendaunicahorario.Archivo archivo) {

        cl.falabella.b2b.intol.beans.agendaunicahorario.Archivo archivoDao = dao.getconsultaAgendaHoario(archivo);

        archivoDao.getAlmacen();
        Diario diarioDao = archivoDao.getDiario();
        archivoDao.getEmpresa();
        archivoDao.getProveedor();
        archivoDao.getFecha();
        archivoDao.getTurno();

        return archivoDao;
    }

    @Override
    public cl.falabella.b2b.intol.ws.agendaunica.beans.agendaunicacalculaventanaresp.Archivo getcalculaVentana(cl.falabella.b2b.intol.ws.agendaunica.beans.agendaunicacalculaventana.AguPlanification aguPlanification) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        cl.falabella.b2b.intol.ws.agendaunica.beans.agendaunicacalculaventanaresp.Archivo calculaventanaSalida = dao.getCalculaVentanas(aguPlanification);
        return calculaventanaSalida;
    }

    @Override
    public cl.falabella.b2b.intol.ws.agendaunica.beans.agendaagendar.to.AgendaUnicaAgendarTo reservaAgenda(cl.falabella.b2b.intol.ws.agendaunica.beans.agendaagendar.Archivo request) throws IntolException {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        log.info("reservaB2BAgenda service");

        //StringWriter xml = new StringWriter();
        try {

        
            /*JAXBContext jaxbContext = JAXBContext.newInstance(cl.falabella.b2b.intol.ws.agendaunica.beans.agendaagendar.Archivo.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
            jaxbMarshaller.marshal(archivo, xml);
             
            System.out.print("xml request reserva agenda : " + xml.toString());*/

        } catch (Exception e) {
            e.printStackTrace();
            log.error("Error al crear mensaje a B2B. Reserva de agenda proveedor venta en verde : " + e.getMessage());
            throw new IntolException(0, "Error al crear mensaje a B2B. Reserva de agenda proveedor venta en verde");
        }

        return dao.reservaAgenda(request);
    }

    @Override
    public String getParametroGeneralByCodigo(String cparamst) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return dao.getParametroGeneralByCodigo(cparamst);
    }

    @Override
        public int preProcesamiento(String IdReferencia, String llaveAgenda, String sistema,int codagenda) {

        return dao.preProcesamiento(IdReferencia, llaveAgenda, sistema, codagenda);
    }


    @Override
    public int getIdReferenceSeq() {

        return dao.getIdReferenceSeq();
    }

}
