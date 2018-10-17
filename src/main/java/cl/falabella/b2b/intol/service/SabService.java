package cl.falabella.b2b.intol.service;

import cl.falabella.b2b.intol.beans.Tupla;
import cl.falabella.b2b.intol.service.impl.IntolException;
import cl.falabella.b2b.intol.ws.infopalet.beans.response.InfoPalet;

import java.math.BigInteger;

import java.util.List;


public interface SabService{

   public Tupla<InfoPalet, List<Long>> getInfoPalet(String empresa, String palet, BigInteger numeroExpedicion, BigInteger cantidadBultos, String tipoCarga) throws IntolException;
   public String consultaSABAgendaActual(String empresa, String almacen, String fechaEntrega, String turno, String tipoMuelle) throws IntolException;
   public String consultaSABVentanas(String consignatario, String empresa, String rutProveedor, String almacen, String tipoMuelle, String entradaUnica) throws IntolException;
   public String reservaSABAgenda(String consignatario, String empresa, String rutProveedor, String almacen, String tipoMuelle, String entradaUnica, String fechaEntrega, String horaInicio) throws IntolException;

   public String getTipoDespacho(String nroF12) throws IntolException;   

    public String getIndicador(String tipoDespacho) throws IntolException;

    public String getValidarRut(String rutProveedor, String indicador) throws IntolException;

   public void getSabViajesNoProcesados();
}
