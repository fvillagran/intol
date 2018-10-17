/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.falabella.b2b.intol.ws.agendaunica.beans.agendaagendar.to;

/**
 *
 * @author HectorOlivares
 */
public class AgendaUnicaAgendarTo {
    
 private cl.falabella.b2b.intol.ws.agendaunica.beans.agendaagendar.Archivo archivo;
 private int codAgenda;

    /**
     * @return the archivo
     */
    public cl.falabella.b2b.intol.ws.agendaunica.beans.agendaagendar.Archivo getArchivo() {
        return archivo;
    }

    /**
     * @param archivo the archivo to set
     */
    public void setArchivo(cl.falabella.b2b.intol.ws.agendaunica.beans.agendaagendar.Archivo archivo) {
        this.archivo = archivo;
    }

    /**
     * @return the codAgenda
     */
    public int getCodAgenda() {
        return codAgenda;
    }

    /**
     * @param codAgenda the codAgenda to set
     */
    public void setCodAgenda(int codAgenda) {
        this.codAgenda = codAgenda;
    }
 
 
}
