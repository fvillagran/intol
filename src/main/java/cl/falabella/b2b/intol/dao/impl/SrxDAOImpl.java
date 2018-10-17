package cl.falabella.b2b.intol.dao.impl;

import cl.falabella.b2b.intol.dao.SrxDAO;

import java.math.BigInteger;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.orm.ibatis.SqlMapClientTemplate;


public class SrxDAOImpl implements SrxDAO
{
   private SqlMapClientTemplate sqlMapClientTemplate;

   final SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

   public void setSqlMapClientTemplate(SqlMapClientTemplate sqlMapClientTemplate)
   {
      this.sqlMapClientTemplate = sqlMapClientTemplate;
   }

   public String entregaDocumento(String tipoDocumento,
                                  BigInteger folio,
                                  String patente,
                                  String fecha,
                                  Double latitud,
                                  Double longitud,
                                  int noEntrega,
                                  Long rut,
                                  String dv,
                                  Integer parentesco,
                                  Integer bultos,
                                  Integer autorizacion, 
                                  String rutProveedor
                                 )
   {
      Map<String, Object> map = new HashMap<String, Object>();
      map.put("tipoDocumento", tipoDocumento);
      map.put("folio", folio.toString());
      map.put("patente", patente);
      map.put("fecha", fecha);
      map.put("latitud", latitud);
      map.put("longitud", longitud);
      map.put("noEntrega", noEntrega);
      map.put("rut", rut+"");
      map.put("dv", dv+"");
      map.put("parentesco", parentesco);
      map.put("bultos", bultos);
      map.put("autorizacion", autorizacion+"");
      map.put("rutProveedor", Integer.parseInt(rutProveedor));
      
      sqlMapClientTemplate.queryForObject("entregaDocumento", map);
      
      return (String)map.get("r");
   }
   
   public String getInfoDocumento(  String tipoDocumento,
                                    long numeroDocumento,
                                    String patente,
                                    Long mantisa,
                                    String digito,
                                    Date fechaEvento,
                                    Double latitud,
                                    Double longitud
                                 )
   {
      Map<String, Object> map = new HashMap<String, Object>();
      map.put("tipoDocumento", tipoDocumento);
      map.put("numeroDocumento", numeroDocumento);
      map.put("patente", patente);
      map.put("mantisa", mantisa);
      map.put("digito", digito);
      map.put("fechaEvento", formatter.format(fechaEvento));
      map.put("latitud", latitud);
      map.put("longitud", longitud);
      
      sqlMapClientTemplate.queryForObject("infoDocumento", map);
      
      return (String)map.get("r");
   }
   
   public String regEntregaDocumento(String tipoDocumento,           BigInteger folio,           String patente,           String fecha          ){
	   Map<String, Object> map = new HashMap<String, Object>();
	   map.put("tipoDocumento", tipoDocumento);
	   map.put("folio", folio.toString());
	   map.put("patente", patente);
	   map.put("fecha", fecha);

	   sqlMapClientTemplate.queryForObject("regEntregaDocumento", map);

	   return "true";
}
   
}
