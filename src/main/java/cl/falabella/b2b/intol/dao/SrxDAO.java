package cl.falabella.b2b.intol.dao;

import java.math.BigInteger;

import java.util.Date;


public interface SrxDAO
{
   public String entregaDocumento(String tipoDocumento,
                                  BigInteger folio,
                                  String patente,
                                  String fecha,
                                  Double latitud,
                                  Double longitud,
                                  int noEntrega,
                                  Long rut,
                                  String dv,
                                  Integer parentesco,
                                  Integer bultos,
                                  Integer autorizacion,
                                  String rutProveedor
                                 );
    public String getInfoDocumento(  String tipoDocumento,
                                     long numeroDocumento,
                                     String patente,
                                     Long mantisa,
                                     String digito,
                                     Date fechaEvento,
                                     Double latitud,
                                     Double longitud
                                  );
    
    public String regEntregaDocumento(String tipoDocumento,
            BigInteger folio,
            String patente,
            String fecha
           );
}
