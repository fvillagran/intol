package cl.falabella.b2b.intol.beans;

public class Credencial 
{
   private long proveedor;
   private long usuario;

   public void setProveedor(long proveedor) {
      this.proveedor = proveedor;
   }

   public long getProveedor() {
      return proveedor;
   }

   public void setUsuario(long usuario) {
      this.usuario = usuario;
   }

   public long getUsuario() {
      return usuario;
   }
}
