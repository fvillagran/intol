package cl.falabella.b2b.intol.service;

import cl.falabella.b2b.intol.beans.ExtraInfo;
import cl.falabella.b2b.intol.ws.entregadocumento.beans.request.EntregaDocumentoRequest;
import cl.falabella.b2b.intol.ws.entregadocumento.beans.response.Message;

import java.util.Date;


public interface SrxService
{
   public Message entregaDocumento(EntregaDocumentoRequest doc, ExtraInfo extraInfo);
   public cl.falabella.b2b.intol.ws.infodocumento.beans.response.Message getInfoDocumento(String tipoDocumento,
                                                                                          long numeroDocumento,
                                                                                          String patente,
                                                                                          Long mantisa,
                                                                                          String digito,
                                                                                          Date fechaEvento,
                                                                                          Double latitud,
                                                                                          Double longitud);
}
