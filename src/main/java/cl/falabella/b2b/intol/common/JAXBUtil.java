package cl.falabella.b2b.intol.common;

import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;


public class JAXBUtil
{
   private static Log log = LogFactory.getLog(JAXBUtil.class);

   public static JAXBUtil instance = new JAXBUtil();
   
   public static JAXBUtil getInstance()
   {
      return instance;   
   }
   
   @SuppressWarnings("unchecked")
   public Object unmarshal(Class klass, Reader reader)
   {
      try
      {
         // create a JAXBContext capable of handling classes generated into
         // the org.example package
         JAXBContext jc = JAXBContext.newInstance(new Class[] {klass});

         // create an Unmarshaller
         Unmarshaller u = jc.createUnmarshaller();

         // unmarshal a po instance document into a tree of Java content
         // objects composed of classes from the primer.po package.
         Object o = u.unmarshal(reader);

         // get XML content.
         // normalize that unmarshal returns either JAXBElement OR
         // class annotated with @XmlRootElement.
         return (o instanceof JAXBElement ?
                  ((JAXBElement)o).getValue() : o);
      }
      catch (JAXBException je)
      {
         log.error(je, je);
      }
      return null;
   }

   @SuppressWarnings("unchecked")
   public String marshal(Class klass, Object o) throws IOException
   {
      return this.marshal(klass, o, null);
   }
   
   @SuppressWarnings("unchecked")
   public String marshal(Class klass, Object o, OutputFormat of) throws IOException
   {
      // Luego se Parsea el XML.
      try
      {
         JAXBContext jc = JAXBContext.newInstance(new Class[] {klass});
         
         // create an Unmarshaller
         Marshaller ma = jc.createMarshaller();
         ma.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
         
         StringWriter writer = new StringWriter();
         if( of == null )
            ma.marshal(o, writer);
         else
         {
            XMLSerializer serializer = new XMLSerializer(of);
            serializer.setOutputCharStream(writer);
            ma.marshal(o, serializer.asContentHandler() );
         }

         return writer.getBuffer().toString();
      }
      catch(JAXBException je)
      {
         log.error(je, je);   
      }
      return null;
   }
}
