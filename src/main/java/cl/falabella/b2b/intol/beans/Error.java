package cl.falabella.b2b.intol.beans;

public class Error 
{
   private String codigo;
   private String descripcion;

   public void setCodigo(String codigo) {
      this.codigo = codigo;
   }

   public String getCodigo() {
      return codigo;
   }

   public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
   }

   public String getDescripcion() {
      return descripcion;
   }
}
