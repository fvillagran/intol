package cl.falabella.b2b.intol.dao.impl;

import cl.falabella.b2b.intol.beans.viajes.infoviaje.SabViaje;
import cl.falabella.b2b.intol.dao.SabTottusDAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.orm.ibatis.SqlMapClientTemplate;


public class SabTottusDAOImpl implements SabTottusDAO
{
   private SqlMapClientTemplate sqlMapClientTemplate;
   private static Log log = LogFactory.getLog(SabTottusDAOImpl.class);

   public void setSqlMapClientTemplate(SqlMapClientTemplate sqlMapClientTemplate)
   {
      this.sqlMapClientTemplate = sqlMapClientTemplate;
   }

    /**
     * @author Jmoraga
     * @date 13/05/2014 
     * @return List
     */
    public List getSabViajesNoProcesados()
    {
        return (List<SabViaje>)sqlMapClientTemplate.queryForList("getSabViajes");
            
    }
    /**
      * @author Jmoraga
      * @date 13/05/2014 
      * @return void
      */
     public void setSabViajeProcesado(Long viaje, String procesado)
     {
         Map<String, Object> map = new HashMap<String, Object>();
          map.put("procesado", procesado);
          map.put("viaje", viaje);
        sqlMapClientTemplate.update("setSabViajeProcesadosetSabViajeProcesado", map);
             
     }
   

}
