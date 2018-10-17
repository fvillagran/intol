package cl.falabella.b2b.intol.beans;

import java.text.ParseException;

public class Rut
{
   private long mantisa;
   private String dv;
   
   public static Rut parse(String rut) throws ParseException
   {
      try
      {
         long m = Long.parseLong(rut.substring(0, rut.indexOf("-")));
         String d = rut.substring(rut.indexOf("-")+1);
         return new Rut(m, d);
      }
      catch(Exception e)
      {
         throw new ParseException("Documento Identidad con formato incorrecto", 0);
      }
   }
   
   public Rut()
   {
      ;
   }
   
   public Rut(long mantisa, String dv)
   {
      this.mantisa = mantisa;
      this.dv = dv;
   }
   
   public void setMantisa(long mantisa)
   {
      this.mantisa = mantisa;
   }

   public long getMantisa()
   {
      return mantisa;
   }

   public void setDv(String dv)
   {
      this.dv = dv;
   }

   public String getDv()
   {
      return dv;
   }
}
