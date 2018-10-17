package cl.falabella.b2b.intol.dao;

import java.math.BigInteger;
import java.util.List;
public interface SabTottusDAO{

   public List getSabViajesNoProcesados();
   public void setSabViajeProcesado(Long viaje, String procesado);
}
