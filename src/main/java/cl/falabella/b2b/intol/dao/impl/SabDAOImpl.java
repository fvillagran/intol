package cl.falabella.b2b.intol.dao.impl;

import cl.falabella.b2b.intol.beans.Archivo;
import cl.falabella.b2b.intol.beans.viajes.infoviaje.SabViaje;
import cl.falabella.b2b.intol.dao.SabDAO;

import cl.falabella.b2b.intol.ws.descpalet.service.DescPaletServiceImpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

public class SabDAOImpl implements SabDAO
{
   private SqlMapClientTemplate sqlMapClientTemplate;
   private static Log log = LogFactory.getLog(SabDAOImpl.class);

   public void setSqlMapClientTemplate(SqlMapClientTemplate sqlMapClientTemplate)
   {
      this.sqlMapClientTemplate = sqlMapClientTemplate;
   }

   public String getInfoPalet(String empresa, String palet, BigInteger numeroExpedicion, BigInteger cantidadBultos, String tipoCarga)
   {
     Map<String, Object> map = new HashMap<String, Object>();
      map.put("empresa", empresa);
      map.put("palet", palet);
      map.put("expedicion", new BigDecimal(numeroExpedicion));
      if(cantidadBultos!=null)
        map.put("bultos", new BigDecimal(cantidadBultos));
      else
        map.put("bultos", new BigDecimal(0));
      map.put("tipoCarga", tipoCarga);

      sqlMapClientTemplate.queryForObject("infoPalet", map);

      return (String)map.get("r");
   }


    public String getTipoDespacho(String nroF12)
    {
       Map<String, Object> map = new HashMap<String, Object>();
       map.put("nroF12", nroF12);
       return (String)sqlMapClientTemplate.queryForObject("getTipoDespacho", map);
    }

     /**
     * Obtiene agenda actual
     * @param xmlrequest
     * @return
     */
    public String consultaAgendaActual(String xmlrequest) {

        log.debug("consultaAgendaActual");
        Map<String, Object> model = new HashMap<String, Object>();

        xmlrequest = xmlrequest.replaceAll("xmlns=\"http://b2b.falabella.com/schemas/ol/ventaverde-muelles\"", "");

        model.put("xmlrequest", xmlrequest);
        sqlMapClientTemplate.queryForObject("callMuellesAgendaVVSABMap", model);

        String xmlresponse = (String) model.get("xmlresponse");
        xmlresponse = xmlresponse.replaceAll("xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"consultamuelles.xsd\"",
        "xmlns=\"http://b2b.falabella.com/schemas/ol/ventaverde-muelles\"");

        return xmlresponse;
    }

    /**
     * Obtiene ventanas disponibles
     * @param xmlrequest
     * @return
     */
    public String consultaVentanas(String xmlrequest) {

        log.debug("consultaVentanas");

        Map<String, Object> model = new HashMap<String, Object>();

        xmlrequest = xmlrequest.replaceAll("xmlns=\"http://b2b.falabella.com/schemas/ol/ventaverde-ventanas\"", "");

        model.put("xmlrequest", xmlrequest);
        sqlMapClientTemplate.queryForObject("callVentanasAgendaVVSABMap", model);

        String xmlresponse = (String) model.get("xmlresponse");

        xmlresponse = xmlresponse.replaceAll("xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"consultaventanas.xsd\"",
        "xmlns=\"http://b2b.falabella.com/schemas/ol/ventaverde-ventanas\"");

        return xmlresponse;
    }

    /**
     * Envia reserva de agenda
     * @param xmlrequest
     * @return
     */
    public String reservaAgenda(String xmlrequest) {

        log.debug("reservaAgenda");

        Map<String, Object> model = new HashMap<String, Object>();

        xmlrequest = xmlrequest.replaceAll("xmlns=\"http://b2b.falabella.com/schemas/ol/ventaverde-agenda\"", "");

        model.put("xmlrequest", xmlrequest);
        sqlMapClientTemplate.queryForObject("callReservaAgendaVVSABMap", model);

        String xmlresponse = (String) model.get("xmlresponse");

        xmlresponse = xmlresponse.replaceAll("xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"agendavv.xsd\"",
        "xmlns=\"http://b2b.falabella.com/schemas/ol/ventaverde-agenda\"");

        return xmlresponse;

    }

   public String getIndicador(String tipoDespacho)
    {
       Map<String, Object> map = new HashMap<String, Object>();
       map.put("tipoDespacho", tipoDespacho);
       return (String)sqlMapClientTemplate.queryForObject("getIndicador", map);
    }


     public String getValidarRut(String rutProveedor, String indicador)
    {
       Map<String, Object> map = new HashMap<String, Object>();
       
       System.out.println("rutProveedor ----> "+rutProveedor);
       System.out.println("indicador ----> "+indicador);
       map.put("rutProveedor", rutProveedor);
       map.put("indicador", indicador);
       return (String)sqlMapClientTemplate.queryForObject("getValidarRut", map);
    }	
}
