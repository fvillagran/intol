package cl.falabella.b2b.intol.beans.viajes.infoviaje;

import java.util.Date;

public class SabViaje {
private Date fechaProceso;
private Date creacion;
private Long viaje;
private String mensaje;
private String procesado;


    public void setFechaProceso(Date fechaProceso) {
        this.fechaProceso = fechaProceso;
    }

    public Date getFechaProceso() {
        return fechaProceso;
    }

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }

    public Date getCreacion() {
        return creacion;
    }

    public void setViaje(Long viaje) {
        this.viaje = viaje;
    }

    public Long getViaje() {
        return viaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setProcesado(String procesado) {
        this.procesado = procesado;
    }

    public String getProcesado() {
        return procesado;
    }
}

