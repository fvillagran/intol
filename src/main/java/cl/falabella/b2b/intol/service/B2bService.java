package cl.falabella.b2b.intol.service;

import cl.falabella.b2b.intol.beans.Archivo;
import cl.falabella.b2b.intol.beans.Credencial;
import cl.falabella.b2b.intol.beans.ExtraInfo;
import cl.falabella.b2b.intol.beans.Rut;
import cl.falabella.b2b.intol.beans.Tupla;
import cl.falabella.b2b.intol.service.impl.IntolException;

import java.math.BigInteger;

import java.util.Date;
import java.util.List;

public interface B2bService {

    public Date getFechaSistema();

    public String getUserPassword(Rut rutEmpresa, Rut rutUsuario);

    public ExtraInfo getTelefonoTamano(BigInteger f12, List<Long> skus);

    public long addLogRequest(String tipo, Date fecha, String xml);

    public void addLogResponse(long id, Date fecha, String xml, int codigo, String descripcion);

    public Tupla setFile(long proveedor, long usuario, String extension, String tipoDocumento);

    public void addFile(Long recepcion, byte[] archivo);

    public List<Archivo> getFile(Long recepcion, Date fechaDesde, Date fechaHasta, String tipo, long proveedor);

    public void setFlagFile(Long recepcion);

    public Credencial getCredencialByUser(long rutEmpresa, long rutUsuario);

    public void addFileDetalle(long id, long estado, String tipo, long usuario, long proveedor, String extension);

    public List<Tupla> getError(long folio);

    public Archivo getFile(Long id);

    public String getParametroGeneral(String cparamst, String xparamst);

    public String getParametroGeneralByCodigo(String cparamst);

}
