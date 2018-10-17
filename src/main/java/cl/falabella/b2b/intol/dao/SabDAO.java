package cl.falabella.b2b.intol.dao;

import java.math.BigInteger;
import java.util.List;
public interface SabDAO{

   public String getInfoPalet(String empresa, String palet, BigInteger numeroExpedicion, BigInteger cantidadBultos, String tipoCarga);
   public String getTipoDespacho (String nroF12);
   public String consultaAgendaActual(String xmlrequest);
   public String consultaVentanas(String xmlrequest);
   public String reservaAgenda(String xmlrequest);

   public String getIndicador (String tipoDespacho);

   public String getValidarRut(String rutProveedor, String indicador);
}
