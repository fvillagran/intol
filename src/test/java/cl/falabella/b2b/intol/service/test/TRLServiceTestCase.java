
package cl.falabella.b2b.intol.service.test;

import cl.falabella.b2b.intol.dao.TrlDAO;
import cl.falabella.b2b.intol.service.TrlService;
import cl.falabella.b2b.intol.ws.entregadocumento.beans.request.EntregaDocumentoRequest;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:b2b-test-ol-*.xml"})
public class TRLServiceTestCase {
    
    private static final Logger logger = Logger.getLogger(TRLServiceTestCase.class);

    private TrlService trlService;    
    public void setTrlService(TrlService trlService) {
        this.trlService = trlService;
    }
    
    private TrlDAO trlDAO;
    public void setTrlDAO(TrlDAO trlDAO) {
        this.trlDAO = trlDAO;
    }
   
    @Test
    public void addTRLMessageQueue() {
        
        logger.debug("addTRLMessageQueue");
        
        /*
        EntregaDocumentoRequest doc = new EntregaDocumentoRequest();
        
        String xml ="<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                    "<entrega-documento-request xmlns=\"http://b2b.falabella.com/schemas/ol/entrega-documento-request\">\n" +
                    "	<tipo-documento>F12</tipo-documento>\n" +
                    "	<folio>12947777501</folio>\n" +
                    "	<patente>MT9087</patente>\n" +
                    "	<fecha-evento>2016-07-06T14:16:22</fecha-evento>\n" +
                    "	<latitud>10.0</latitud>\n" +
                    "	<longitud>20.0</longitud>\n" +
                    "	<codigo-no-entrega>99</codigo-no-entrega>\n" +
                    "	<rut-receptor>\n" +
                    "		<mantisa>13211691</mantisa>\n" +
                    "		<dv>1</dv>\n" +
                    "	</rut-receptor>\n" +
                    "	<parentesco>CLIENTE</parentesco>\n" +
                    "	<bultos>10</bultos>\n" +
                    "</entrega-documento-request>";
                
        String response = this.trlService.addQueueMessage(doc, xml);
        
        //String response = trlDAO.addQueueMessage(doc, xml);
        
        //String response = trlDAO.getParamValue("CORREO_CMOTIVO_ANULACION_SOLICITUD");
        */
        
        logger.debug("response : " + "");
     
    }
}
