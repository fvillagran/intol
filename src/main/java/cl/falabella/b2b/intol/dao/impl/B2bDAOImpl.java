package cl.falabella.b2b.intol.dao.impl;

import cl.falabella.b2b.intol.beans.Archivo;
import cl.falabella.b2b.intol.beans.Credencial;
import cl.falabella.b2b.intol.beans.ExtraInfo;
import cl.falabella.b2b.intol.beans.Rut;
import cl.falabella.b2b.intol.beans.Tupla;
import cl.falabella.b2b.intol.beans.agendaunicahorario.Error;
import cl.falabella.b2b.intol.beans.agendaunicahorario.ObjectFactory;
import cl.falabella.b2b.intol.common.IntolUtil;
import cl.falabella.b2b.intol.dao.B2bDAO;
import cl.falabella.b2b.intol.ws.agendaunica.beans.agendaagendar.to.AgendaUnicaAgendarTo;
import cl.falabella.b2b.intol.ws.agendaunica.beans.agendaunicacalculaventana.AguPlanification;
import cl.falabella.b2b.intol.ws.agendaunica.beans.agendaunicahorario.TipoCalendario;
import java.io.StringReader;
import java.io.StringWriter;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.sql.Timestamp;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.dao.DataAccessException;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

public class B2bDAOImpl implements B2bDAO {

    private SqlMapClientTemplate sqlMapClientTemplate;
    private static Log log = LogFactory.getLog(B2bDAOImpl.class);

    public void setSqlMapClientTemplate(SqlMapClientTemplate sqlMapClientTemplate) {
        this.sqlMapClientTemplate = sqlMapClientTemplate;
    }

    public Date getFechaSistema() {
        return (Date) sqlMapClientTemplate.queryForObject("getFechaSistema");
    }

    public String getUserPassword(Rut rutEmpresa, Rut rutUsuario) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("rutEmpresa", rutEmpresa.getMantisa());
        map.put("rutUsuario", rutUsuario.getMantisa());
        return (String) sqlMapClientTemplate.queryForObject("getUserPassword", map);
    }

    public ExtraInfo getTelefonoTamano(BigInteger f12, List<Long> skus) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("f12", new BigDecimal(f12));
        map.put("skus", skus);

        return (ExtraInfo) sqlMapClientTemplate.queryForObject("getTelefonoTamano", map);
    }

    public long addLogRequest(String tipo, Date fecha, String xml) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("tipo", tipo);
        map.put("fecha", new Timestamp(fecha.getTime()));
        map.put("xml", xml);

        sqlMapClientTemplate.insert("addLogRequest", map);
        long id = (Long) map.get("id");
        return id;
    }

    public void addLogResponse(long id, Date fecha, String xml, int codigo, String descripcion) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", id);
        map.put("fecha", new Timestamp(fecha.getTime()));
        map.put("xml", xml);
        map.put("codigo", codigo);
        map.put("descripcion", descripcion);
        sqlMapClientTemplate.update("addLogResponse", map);
    }

    public Tupla setFile(long proveedor, long usuario, String extension, String tipoDocumento) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("proveedor", proveedor);
        map.put("usuario", usuario);
        map.put("extension", extension);
        map.put("tipoDocumento", tipoDocumento);

        sqlMapClientTemplate.update("setFile", map);

        //obtenemos la respuesta del servicio
        Tupla arch = new Tupla();
        arch.setKey(Long.valueOf((String) map.get("recepcion")));
        arch.setValue((String) map.get("archivoGenerado"));

        return arch;
    }

    public void addFile(Long recepcion, byte[] archivo) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("recepcion", recepcion);
        map.put("archivo", archivo);

        sqlMapClientTemplate.update("addFile", map);
    }

    public List<Archivo> getFile(Long recepcion, Date fechaDesde, Date fechaHasta, String tipo, long proveedor) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("recepcion", recepcion);
        map.put("fechaDesde", fechaDesde);
        map.put("fechaHasta", fechaHasta);
        map.put("tipo", tipo);
        map.put("proveedor", proveedor);

        return (List<Archivo>) sqlMapClientTemplate.queryForList("getFile", map);
    }

    public void setFlagFile(Long recepcion) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("recepcion", recepcion);

        sqlMapClientTemplate.update("setFlagFile", map);
    }

    public Credencial getCredencialByUser(long rutEmpresa, long rutUsuario) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("rutEmpresa", rutEmpresa);
        map.put("rutUsuario", rutUsuario);

        return (Credencial) sqlMapClientTemplate.queryForObject("getCredencialByUser", map);
    }

    public List<Tupla> getError(long folio) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("folio", folio);

        return (List<Tupla>) sqlMapClientTemplate.queryForList("getErrorByFolio", map);
    }

    public Archivo getFile(Long id) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", id);

        return (Archivo) sqlMapClientTemplate.queryForObject("getFileById", map);
    }

    public void addFileDetalle(long id, long estado, String tipo, long usuario, long proveedor, String extension) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", id);
        map.put("estado", estado);
        map.put("tipo", tipo);
        map.put("usuario", usuario);
        map.put("proveedor", proveedor);
        map.put("extension", extension);

        sqlMapClientTemplate.update("addFileDetalle", map);
    }

    /*   
   public void addFileDetalle(Archivo detalle, long proveedor, long usuario, Date fechaActual)
   {
      Map<String, Object> map = new HashMap<String, Object>();
      map.put("recepcion", detalle.getId());
      map.put("extension", detalle.getExtension());
      map.put("estado", (String)detalle.getEstado().getKey());
      map.put("tipo", detalle.getTipo());
      map.put("fechaCreacion", fechaActual);
      map.put("usuario", usuario);
      map.put("proveedor", proveedor);
      map.put("archivoGenerado", detalle.getArchivoGenerado());
      map.put("download", "F");

      sqlMapClientTemplate.update("addFileDetalle", map);
   }*/
    @Override
    public String getParametroGeneral(String cparamst, String xparamst) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("cparamst", cparamst);
        map.put("xparamst", xparamst);
        return (String) sqlMapClientTemplate.queryForObject("getParametroGeneral", map);
    }

    @Override
    public String getParametroGeneralByCodigo(String cparamst) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("cparamst", cparamst);
        return (String) sqlMapClientTemplate.queryForObject("getParametroGeneralByCodigo", map);

    }



    @Override
    public cl.falabella.b2b.intol.beans.agendaunicahorario.Archivo getconsultaAgendaHoario(cl.falabella.b2b.intol.beans.agendaunicahorario.Archivo archivo) {

        cl.falabella.b2b.intol.beans.agendaunicahorario.Archivo archivoSalida = new cl.falabella.b2b.intol.beans.agendaunicahorario.Archivo();
        Error errorSalida = new Error();
        try {

            Map<String, Object> map = new HashMap<String, Object>();

            map.put("P_ALMACEN", archivo.getAlmacen());
            map.put("P_TIPOMUELLE", archivo.getTipoMuelle());
            map.put("P_TURNO", archivo.getTurno());
            map.put("P_FECHA", IntolUtil.converteStringToDate(archivo.getFecha()));
             
            log.debug("fecha completa="+map.get("P_FECHA"));
            log.debug("fecha converte="+IntolUtil.converteStringToDate(archivo.getFecha()));
            log.debug("tipoCalendario:="+archivo.getTipoCalendario()); 
            
            if( archivo.getTipoCalendario()!=null && archivo.getTipoCalendario().equals(cl.falabella.b2b.intol.beans.agendaunicahorario.TipoCalendario.DIA))
            {
              sqlMapClientTemplate.queryForObject("getconsultaAgendaHorario", map);
            }
            else if( archivo.getTipoCalendario()!=null && archivo.getTipoCalendario().equals(cl.falabella.b2b.intol.beans.agendaunicahorario.TipoCalendario.SEMANA))
            {
              sqlMapClientTemplate.queryForObject("getconsultaAgendaHorarioSemanal", map);   
            }
            else
            {
              sqlMapClientTemplate.queryForObject("getconsultaAgendaHorario", map);   
            }
            
            
            log.debug("******************************************************");
            log.debug("P_CALXML=" + (String) map.get("P_CALXML"));
            log.debug("******************************************************");

            JAXBContext jaxbContext = jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
            Unmarshaller unmarshaller = unmarshaller = jaxbContext.createUnmarshaller();
            StringReader reader = new StringReader(map.get("P_CALXML").toString());
            cl.falabella.b2b.intol.beans.agendaunicahorario.Archivo unmarshalledObject = (cl.falabella.b2b.intol.beans.agendaunicahorario.Archivo) unmarshaller.unmarshal(reader);
            
            unmarshalledObject.setConsignatario(archivo.getConsignatario());
            unmarshalledObject.setEmpresa(archivo.getEmpresa());
            unmarshalledObject.setProveedor(archivo.getProveedor());
            
            return unmarshalledObject;

        } catch (JAXBException ex) {
            Logger.getLogger(B2bDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            errorSalida.setCodigo("0");
            errorSalida.setDescripcion("ERROR: problemas con el parceo del xml:" + ex.getMessage());
        } catch (DataAccessException dataAccessException) {
            errorSalida.setCodigo("1");
            errorSalida.setDescripcion("ERROR: transacion consulta agenda Horario ");
            log.info("ERROR:  agendar hora " + dataAccessException.getCause());
        } catch (Exception ex) {
            Logger.getLogger(B2bDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return archivoSalida;
    }

    @Override
    public cl.falabella.b2b.intol.ws.agendaunica.beans.agendaunicacalculaventanaresp.Archivo getCalculaVentanas(AguPlanification aguPlanification) {

        cl.falabella.b2b.intol.ws.agendaunica.beans.agendaunicacalculaventanaresp.Archivo salidaArchivo = new cl.falabella.b2b.intol.ws.agendaunica.beans.agendaunicacalculaventanaresp.Archivo();

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(cl.falabella.b2b.intol.ws.agendaunica.beans.agendaunicacalculaventana.AguPlanification.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");

            StringWriter xml = new StringWriter();
            jaxbMarshaller.marshal(aguPlanification, xml);
            

            Map<String, Object> map = new HashMap<String, Object>();
            String inputString = xml.toString().replaceAll("xmlns=\"http://b2b.falabella.com/schemas/ol/agenda_unica_calcula_ventana\"", "");
            map.put("P_XML", inputString);

            log.debug("XML==" + inputString);
            
            sqlMapClientTemplate.queryForObject("getCalculaVentanas", map, null);
            log.debug("1.-P_VETANAS=" + ((Integer) map.get("P_VENTANAS")).toString());
            log.debug("2.-P_CODERROR=" + map.get("P_CODERROR"));
            log.debug("3.-P_DESCERROR=" + map.get("P_DESCERROR"));

            cl.falabella.b2b.intol.ws.agendaunica.beans.agendaunicacalculaventanaresp.Error error = new cl.falabella.b2b.intol.ws.agendaunica.beans.agendaunicacalculaventanaresp.Error();
            error.setCodigo(map.get("P_CODERROR").toString());
            error.setDescripcion(map.get("P_DESCERROR").toString());

            salidaArchivo.setAlmacen(Long.parseLong(aguPlanification.getPlaceDelivery()));
            salidaArchivo.setConsignatario(aguPlanification.getConsignatario());
            salidaArchivo.setEmpresa(aguPlanification.getEmpresa());
            salidaArchivo.setEntradaUnica(aguPlanification.getEu());
            salidaArchivo.setError(error);
            salidaArchivo.setProveedor(aguPlanification.getProveedor());
            salidaArchivo.setTipoMuelle(aguPlanification.getWarehouseType());
            salidaArchivo.setTurno(aguPlanification.getTurn());
            salidaArchivo.setVentanas(map.get("P_VENTANAS").toString());

            return salidaArchivo;

        } catch (JAXBException ex) {
            Logger.getLogger(B2bDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DataAccessException dataAccessException) {

            salidaArchivo.setError(null);
            cl.falabella.b2b.intol.ws.agendaunica.beans.agendaunicacalculaventanaresp.Error error = new cl.falabella.b2b.intol.ws.agendaunica.beans.agendaunicacalculaventanaresp.Error();
            error.setCodigo("1");
            error.setDescripcion("ERROR: transaccion calcula ventana :");
            log.info("ERROR calcular ventanas:  " + dataAccessException.getCause().toString());
            salidaArchivo.setError(error);
        }

        return salidaArchivo;
    }
    
    
     
   
    @Override
    public cl.falabella.b2b.intol.ws.agendaunica.beans.agendaagendar.to.AgendaUnicaAgendarTo reservaAgenda(cl.falabella.b2b.intol.ws.agendaunica.beans.agendaagendar.Archivo archivo) {

        Map<String, Object> map = new HashMap<String, Object>();
        Integer nrutInteger = null;
        Integer vpcTechKeyInteger = null;
        Integer orglvlChildInteger = null;
        AgendaUnicaAgendarTo agenTo=new AgendaUnicaAgendarTo();

        try {
            nrutInteger = (archivo.getNRut() != null) ? Integer.parseInt(archivo.getNRut().toString()) : 0;
            vpcTechKeyInteger = (archivo.getVpcTechKey() != null) ? Integer.parseInt(archivo.getVpcTechKey().toString()) : 0;
            orglvlChildInteger = (archivo.getOrgLvlChild() != null) ? Integer.parseInt(archivo.getOrgLvlChild().toString()) : 0;

        } catch (NumberFormatException e) {
            nrutInteger = 0;
            vpcTechKeyInteger = 0;
            orglvlChildInteger = 0;
        }

        

        cl.falabella.b2b.intol.ws.agendaunica.beans.agendaagendar.Error error = new cl.falabella.b2b.intol.ws.agendaunica.beans.agendaagendar.Error();

        try {

            map.put("P_ACCION", archivo.getTipoAccion());
            map.put("P_MUELLE", "1");
            map.put("P_ALMACEN", archivo.getAlmacen());
            map.put("P_ORG_LVL_CHILD", orglvlChildInteger);
            map.put("P_VPC_TECH_KEY", vpcTechKeyInteger);
            map.put("P_NRUT", nrutInteger);
            map.put("P_TURNO", archivo.getTurno());
            map.put("P_FECHA_AGENDA", IntolUtil.converteStringToDate(archivo.getFechaEntrega()));
            map.put("P_ENTRADA_UNICA", archivo.getEntradaUnica());
            map.put("P_HORA_INICIO", archivo.getHoraInicio());
            map.put("P_HORA_FIN", archivo.getHoraTermino());
            map.put("P_TIPO_MUELLE", archivo.getTipoMuelle());
            map.put("P_NUM_MUELLE", archivo.getMuelles().getMuelle().get(0).getNum());

            for (String key : map.keySet()) {
                log.debug(key + "-----> " + map.get(key));
            }

            sqlMapClientTemplate.queryForMap("AgendaUnicaAgendar", map, null);

            log.debug("******************************************************");
            log.debug("mapResponce=" + map.get("P_CODERROR"));
            log.debug("mapResponce=" + map.get("P_DESCERROR"));
            log.debug("******************************************************");

            error.setCodigo(map.get("P_CODERROR").toString());
            error.setDescripcion(map.get("P_DESCERROR").toString());
            
            archivo.setError(error);
            
        agenTo.setArchivo(archivo);
        agenTo.setCodAgenda(Integer.parseInt(map.get("P_COD_AGENDA").toString()));
		

        } catch (DataAccessException dataAccessException) {

            archivo.setError(null);
            error.setCodigo("1");
            error.setDescripcion("ERROR:  transaccion agendar ");
            log.info("ERROR reservar agenda: " + dataAccessException.getCause().toString());
            archivo.setError(error);
        } catch (Exception ex) {
            Logger.getLogger(B2bDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        return agenTo;
    }

    @Override
    public int preProcesamiento(String IdReferencia, String llaveAgenda, String sistema,int codAgenda) {

      Map<String, Object> map = new HashMap<String, Object>();
     
       map.put("IdReferencia", IdReferencia);
       map.put("FechaSistema", new Date());
       map.put("LlaveAgenda", llaveAgenda);
       map.put("Sistema", sistema);
       map.put("codAgenda",codAgenda);
       
       sqlMapClientTemplate.insert("addPreProcesamiento", map);

        return Integer.parseInt(map.get("id").toString());
    }

    @Override
    public int getIdReferenceSeq() {
        
       return (Integer) sqlMapClientTemplate.queryForObject("getReferenceId");
    }

}
