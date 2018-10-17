package cl.falabella.b2b.intol.dao.impl;

import cl.falabella.b2b.intol.dao.TrlDAO;

import cl.falabella.b2b.intol.service.impl.IntolException;

import cl.falabella.b2b.intol.ws.entregadocumento.beans.request.EntregaDocumentoRequest;
import cl.falabella.b2b.intol.ws.trl.ce.service.InfoCambioEstadoServiceImpl;

import java.math.BigDecimal;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.orm.ibatis.SqlMapClientTemplate;


public class TrlDAOImpl implements TrlDAO{

    private static Log log = LogFactory.getLog(TrlDAOImpl.class);

    private SqlMapClientTemplate sqlMapClientTemplate;

    final SimpleDateFormat sdfFechaHora = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    final SimpleDateFormat sdfFecha = new SimpleDateFormat("dd-MM-yyyy");

    public void setSqlMapClientTemplate(SqlMapClientTemplate sqlMapClientTemplate){
       this.sqlMapClientTemplate = sqlMapClientTemplate;
    }

    /**
     * Cambio de estado Viaje TRL
     * @param nroOper
     * @param codViaje
     * @param local
     * @param fechaEvento
     * @param estado
     * @param cadena
     * @param xml
     * @throws IntolException
     */
    public Map<String, Object> cambioEstado(int nroOper, int codViaje, String local, 
                             String fechaEvento, int estado, String cadena, 
                             String xml){

        Map<String, Object> map = new HashMap<String, Object>();                             
        try {
            map.put("P_OPERACION", new BigDecimal(nroOper));
            map.put("P_CVIAJE", new BigDecimal(codViaje));
            map.put("P_CLOCAL", local);
            map.put("P_DFECHA", sdfFechaHora.parse(fechaEvento));
            map.put("P_CEVENTO", new BigDecimal(estado));
            map.put("P_CADENA", cadena);
            map.put("P_MSG", xml);
        
            sqlMapClientTemplate.queryForObject("callCambioEstadoIngCamTRL", map);
            
            log.debug("response codigo : " + map.get("P_ESTPROC"));
            log.debug("response descripcion : " + map.get("P_SALIDA"));        
        }
        catch (Exception e) {
            e.printStackTrace();
            map.put("P_ESTPROC",1);
            map.put("P_SALIDA","Error al realizar cambio de estado");
        }
        
        return map;
        
    }
    
    /**
     * Obtiene parametro
     * @param paramName
     * @return
     */
    public String getParamValue(String paramName){
    
       Map<String, Object> map = new HashMap<String, Object>();
       map.put("parametro", paramName);
       return (String)sqlMapClientTemplate.queryForObject("getParamValue", map);
    }
    
    /**
     * Agrega mensaje en la cola de TRL
     * @param paramName
     * @return
     */
    public String addQueueMessage(EntregaDocumentoRequest doc, String request)
    {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("tipoMensaje", "ENTD");
        map.put("sistema", "B2B");
        map.put("cadena", 1);
        map.put("consigna", "1");
        map.put("pais", "1");
        map.put("idMensaje", 1);
        map.put("mensaje", request);

        return (String)sqlMapClientTemplate.queryForObject("addQueueMessage", map);
    }

    /**
     * Registra mensaje de Entrega Documento en TRL (sincrono)
     * @param doc
     * @param request
     * @return 
     */
    @Override
    public Map<String, Object> regEntregaDocumento(EntregaDocumentoRequest doc, String request) {

        Map<String, Object> map = new HashMap<String, Object>();                             
        
        try {        
        
            map.put("MENSAJE", request);       
        
            sqlMapClientTemplate.queryForObject("callEntregaDocumento", map);
            
            log.debug("response codigo : " + map.get("P_ESTPROC"));
            log.debug("response descripcion : " + map.get("P_DESCPROC"));        
        }
        catch (Exception e) {
            
            log.debug("Error al realizar entrega documento en TRL ",e);
            
            map.put("p_estproc",1);
            map.put("p_descproc","Error al realizar entrega documento en TRL");
        }
        
        return map;
    }
    
}


