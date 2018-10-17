package cl.falabella.b2b.intol.service;

import cl.falabella.b2b.intol.service.impl.IntolException;
import cl.falabella.b2b.intol.ws.entregadocumento.beans.request.EntregaDocumentoRequest;
import cl.falabella.b2b.intol.ws.entregadocumento.beans.response.Message;

import cl.falabella.b2b.intol.ws.trl.ce.beans.request.InfoCambioestadoRequest;

import java.util.Date;
import java.util.Map;

public interface TrlService
{
    public Map<String, Object> cambioEstado(int nroOper, 
                                            int codViaje, 
                                            String local, 
                                            String fechaEvento, 
                                            int estado, 
                                            String cadena, 
    String xml);
    public String getParamValue(String paramName);
    public String addQueueMessage(EntregaDocumentoRequest doc, String request);
    
    public Map<String, Object> regEntregaDocumento(EntregaDocumentoRequest doc, String request);
}
