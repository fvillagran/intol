package cl.falabella.b2b.intol.service.impl;

import cl.falabella.b2b.intol.beans.Archivo;
import cl.falabella.b2b.intol.beans.Credencial;
import cl.falabella.b2b.intol.beans.ExtraInfo;
import cl.falabella.b2b.intol.beans.Rut;
import cl.falabella.b2b.intol.beans.Tupla;

import cl.falabella.b2b.intol.dao.B2bDAO;
import cl.falabella.b2b.intol.service.B2bService;


import java.math.BigInteger;

import java.util.Date;
import java.util.List;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import cl.falabella.b2b.intol.beans.agendaunicahorario.Diario;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class B2bServiceImpl implements B2bService {

    private static Log log = LogFactory.getLog(B2bServiceImpl.class);

    private B2bDAO dao;

    public B2bServiceImpl(B2bDAO dao) {
        this.dao = dao;
    }

    public Date getFechaSistema() {
        return dao.getFechaSistema();
    }

    public String getUserPassword(Rut rutEmpresa, Rut rutUsuario) {
        return dao.getUserPassword(rutEmpresa, rutUsuario);
    }

    public ExtraInfo getTelefonoTamano(BigInteger f12, List<Long> skus) {
        return dao.getTelefonoTamano(f12, skus);
    }

    public long addLogRequest(String tipo, Date fecha, String xml) {
        return dao.addLogRequest(tipo, fecha, xml);
    }

    public void addLogResponse(long id, Date fecha, String xml, int codigo,
            String descripcion) {
        dao.addLogResponse(id, fecha, xml, codigo, descripcion);
    }

    public Tupla setFile(long proveedor, long usuario, String extension, String tipoDocumento) {
        return dao.setFile(proveedor, usuario, extension, tipoDocumento);
    }

    public void addFile(Long recepcion, byte[] archivo) {
        dao.addFile(recepcion, archivo);
    }

    public List<Archivo> getFile(Long recepcion, Date fechaDesde, Date fechaHasta, String tipo, long proveedor) {
        return dao.getFile(recepcion, fechaDesde, fechaHasta, tipo, proveedor);
    }

    public void setFlagFile(Long recepcion) {
        dao.setFlagFile(recepcion);
    }

    public Credencial getCredencialByUser(long rutEmpresa, long rutUsuario) {
        return dao.getCredencialByUser(rutEmpresa, rutUsuario);
    }

    public void addFileDetalle(long id, long estado, String tipo, long usuario, long proveedor, String extension) {
        dao.addFileDetalle(id, estado, tipo, usuario, proveedor, extension);
    }

    public List<Tupla> getError(long folio) {
        return dao.getError(folio);
    }

    public Archivo getFile(Long id) {
        return dao.getFile(id);
    }

    public String getParametroGeneral(String cparamst, String xparamst) {
        return dao.getParametroGeneral(cparamst, xparamst);
    }

    @Override
    public String getParametroGeneralByCodigo(String cparamst) {
        return dao.getParametroGeneralByCodigo(cparamst);
    }


}
