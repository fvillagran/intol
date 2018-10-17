package cl.falabella.b2b.intol.servlet;

import cl.falabella.b2b.intol.service.SabService;
import cl.falabella.b2b.intol.service.impl.SabServiceImpl;

import java.io.IOException;

import java.util.Date;
import java.util.Properties;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

public class SabInfoViajeServlet extends HttpServlet{
    
    private static Log log = LogFactory.getLog(SabInfoViajeServlet.class);
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException{
    
        try
        {   
           WebApplicationContext applicationContext = ContextLoader.getCurrentWebApplicationContext();
           SabService sabService=(SabService) applicationContext.getBean("sabService");
           sabService.getSabViajesNoProcesados();   
        }

        catch (Exception e)
        {
            log.error("Error al ejecutar SabInfoViaje '", e);
        }    
    
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException{
        doGet(request, response);  
    }
    
    /*
    public void init(ServletConfig servletConfig)
    {
       try
       {
          WebApplicationContext applicationContext = ContextLoader.getCurrentWebApplicationContext();
          SabService sabService=(SabService) applicationContext.getBean("sabService");
          sabService.getSabViajesNoProcesados();
           
       }

       catch (Exception e)
       {
           log.error("Error al ejecutar SabInfoViaje '", e);
       }
    }
    */

}
