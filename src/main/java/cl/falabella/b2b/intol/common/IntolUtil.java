
package cl.falabella.b2b.intol.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class IntolUtil {

    private static final Log log = LogFactory.getLog(IntolUtil.class);
    private static final SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    private static final SimpleDateFormat horaFormatter = new SimpleDateFormat("HH:mm");

    /**
     * convierte una fecha de tipo string a Date
     *
     * @param fechaString
     * @return
     * @throws java.lang.Exception
     */    
    public static Date converteStringToDate(String fechaString) throws Exception {

        try {

            Date date = formatter.parse(fechaString);

            return date;
        } catch (ParseException e) {
            log.info("ERROR: problemas con el campo fecha del ws calenario:'" + fechaString + "'" + e.getMessage().toString());
            throw new Exception();
        }

    }
    
    /**
     * Obtiene diferencia en minutos
     * @param hInicio, hora de inicio
     * @param hTermino, hora de termino
     * @param minutosPeriodo, minutos del periodo
     * @return 
     * @throws java.lang.Exception 
     */
    public static long diferenciaPeriodos(String hInicio, String hTermino, int minutosPeriodo)throws Exception{
        
        long totalPeriodos = 0;
        
        try{
            Date inicio  = horaFormatter.parse(hInicio);
            Date termino = horaFormatter.parse(hTermino);        
            
            double diferencia = ((termino.getTime() - inicio.getTime())/(3600*1000.0));
            
            long hora = (long)diferencia;
            
            log.debug("Diferencia en horas : " + hora);
            
            diferencia = ((diferencia - hora)*60);
            
            long minutos = (long)diferencia;
            
            log.debug("Diferencia en minutos : " + minutos);
            
            totalPeriodos = hora * 60 + minutos;
            
            log.debug("Total Ventanas: " + totalPeriodos / minutosPeriodo);
            
        }
        catch(Exception ex){
            log.error("Error al calcular diferencia en horas", ex);
            throw new Exception();
        }
    
        return totalPeriodos;
    }

}
