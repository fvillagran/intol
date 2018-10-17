package cl.falabella.b2b.intol.beans;

public class ExtraInfo
{
   private String telefono;
   private String tipoProducto;
   private String celular;
   private String mail;
   private String vpc;
   private String rutProveedor;
   
   

   public void setTelefono(String telefono)
   {
      this.telefono = telefono;
   }

   public String getTelefono()
   {
      return telefono;
   }

   public void setTipoProducto(String tipoProducto)
   {
      this.tipoProducto = tipoProducto;
   }

   public String getTipoProducto()
   {
      return tipoProducto;
   }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCelular() {
        return celular;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    public void setVpc(String vpc) {
        this.vpc = vpc;
    }

    public String getVpc() {
        return vpc;
    }

    public void setRutProveedor(String rutProveedor) {
        this.rutProveedor = rutProveedor;
    }

    public String getRutProveedor() {
        return rutProveedor;
    }
}
