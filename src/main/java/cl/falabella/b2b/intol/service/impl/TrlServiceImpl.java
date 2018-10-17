package cl.falabella.b2b.intol.service.impl;

import cl.falabella.b2b.intol.dao.SrxDAO;
import cl.falabella.b2b.intol.dao.TrlDAO;
import cl.falabella.b2b.intol.service.ParentescoService;
import cl.falabella.b2b.intol.service.SrxService;
import cl.falabella.b2b.intol.service.TrlService;
import cl.falabella.b2b.intol.ws.entregadocumento.beans.request.Autorizacion;
import cl.falabella.b2b.intol.ws.entregadocumento.beans.request.EntregaDocumentoRequest;
import cl.falabella.b2b.intol.ws.entregadocumento.beans.response.Message;

import cl.falabella.b2b.intol.ws.trl.ce.beans.request.InfoCambioestadoRequest;

import java.util.Date;
import java.util.Map;
import org.apache.log4j.Logger;

public class TrlServiceImpl implements TrlService{    

    private static final Logger logger = Logger.getLogger(TrlServiceImpl.class);
        
    private TrlDAO dao;

    public TrlServiceImpl(TrlDAO dao) {
        this.dao = dao;
    }

    /**
     * Cambio de estado viaje TRL
     * @param nroOper
     * @param codViaje
     * @param local
     * @param fechaEvento
     * @param estado
     * @param cadena
     * @param xml
     * @return
     */
    public Map<String, Object> cambioEstado(int nroOper, int codViaje, String local, 
                             String fechaEvento, int estado, String cadena, 
                             String xml){
    
        return dao.cambioEstado(nroOper, codViaje, local, fechaEvento, 
                         estado, cadena, xml);    
    }

    /**
     * Obtiene parametro desde TRL
     * @param paramName
     * @return
     */
    public String getParamValue(String paramName) {
        return dao.getParamValue(paramName);
    }
    
    /**
     * Agrega mensaje en la cola de TRL
     * @param doc
     * @param request
     * @return
     */
    @Override
    public String addQueueMessage(EntregaDocumentoRequest doc, String request)
    {
        logger.debug("addQueueMessage ");
        
        return dao.addQueueMessage(doc, request);
    }

    /**
     * Registra mensaje de Entrega Documento en TRL (sincrono)
     * @param doc
     * @param request
     * @return 
     */
    @Override
    public Map<String, Object> regEntregaDocumento(EntregaDocumentoRequest doc, String request) {
        
        logger.debug("regEntregaDocumento ");
        
        return dao.regEntregaDocumento(doc, request);
        
    }
}
