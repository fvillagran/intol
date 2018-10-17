package cl.falabella.b2b.intol.beans;

import java.util.Date;

public class Archivo 
{
   private String tipo;
   private String extension;
   private String contenido;
   private byte[] data;

   private long id;
   private Tupla estado;
   private Date fechaCreacion;
   private String archivoGenerado;
   private boolean downloaded;

   public void setTipo(String tipo) {
      this.tipo = tipo;
   }

   public String getTipo() {
      return tipo;
   }

   public void setExtension(String extension) {
      this.extension = extension;
   }

   public String getExtension() {
      return extension;
   }

   public void setContenido(String contenido) {
      this.contenido = contenido;
   }

   public String getContenido() {
      return contenido;
   }

   public void setData(byte[] data) {
      this.data = data;
   }

   public byte[] getData() {
      return data;
   }

   public void setId(long id) {
      this.id = id;
   }

   public long getId() {
      return id;
   }

   public void setFechaCreacion(Date fechaCreacion) {
      this.fechaCreacion = fechaCreacion;
   }

   public Date getFechaCreacion() {
      return fechaCreacion;
   }

   public void setDownloaded(boolean downloaded) {
      this.downloaded = downloaded;
   }

   public boolean isDownloaded() {
      return downloaded;
   }

   public void setArchivoGenerado(String archivoGenerado) {
      this.archivoGenerado = archivoGenerado;
   }

   public String getArchivoGenerado() {
      return archivoGenerado;
   }

   public void setEstado(Tupla estado) {
      this.estado = estado;
   }

   public Tupla getEstado() {
      return estado;
   }
}
