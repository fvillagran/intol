package cl.falabella.b2b.intol.service.impl;

public class IntolException extends Exception
{
   private int code;
   
   public IntolException(int code, String msg)
   {
      super(msg);
      this.code = code;
   }

   public int getCode()
   {
      return code;
   }
}
