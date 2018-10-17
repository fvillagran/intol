package cl.falabella.b2b.intol.service;

import cl.falabella.b2b.intol.beans.Rut;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ws.security.WSPasswordCallback;

import org.springframework.dao.DataAccessException;
import org.springframework.security.authentication.encoding.PasswordEncoder;


public class ServerPasswordCallback implements CallbackHandler 
{
   private static Log log = LogFactory.getLog(ServerPasswordCallback.class);
   
   private B2bService b2bService;
   private PasswordEncoder passwordEncoder;
   private boolean ignorePasswordCase;
   
   public ServerPasswordCallback(B2bService b2bService, PasswordEncoder passwordEncoder, boolean ignorePasswordCase)
   {
      this.b2bService = b2bService;
      this.passwordEncoder = passwordEncoder;
      this.ignorePasswordCase = ignorePasswordCase;
   }
   
   public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException 
   {
      WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
      
      String ruts = pc.getIdentifier();
      if( ruts == null || ruts.indexOf("|") < 0 )
         throw new IOException("wrong username");
      if( pc.getPassword() == null )
         throw new IOException("empty password");
      try
      {
         String r1 = ruts.substring(0, ruts.indexOf("|"));
         String r2 = ruts.substring(ruts.indexOf("|")+1);
         
         Rut rut1 = Rut.parse(r1);
         Rut rut2 = Rut.parse(r2);
         
         String password1 = pc.getPassword();
         String password2 = b2bService.getUserPassword(rut1, rut2);
         
         String passwordE = passwordEncoder.encodePassword(password1, null);
         
         if( ignorePasswordCase )
         {
            password1 = password1.toUpperCase();
            password2 = password2.toUpperCase();
            passwordE = passwordE.toUpperCase();
         }
         
         if ( ! (password1.equals(password2) || passwordE.equals(password2)) ) 
         {
            throw new IOException("wrong password");
         }
      }
      catch(DataAccessException e)
      {
         throw new IOException("Error en el acceso a base de datos.");
      }
      catch(Exception e)
      {
         throw new IOException(e.getMessage());
      }
   }
}
