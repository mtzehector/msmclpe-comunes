/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.common.exception;

import java.io.IOException;
import java.io.InputStream;
import java.text.MessageFormat;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author antonio
 */
public abstract class MessageResolverGlobal {

  private static final Properties PROPERTIES = new Properties();
  private static final String PROPERTIES_FILE = "/global.faults.properties";
  
  static {
    InputStream stream = null;
    try {
      MessageResolverGlobal.class.getClassLoader().clearAssertionStatus();
      stream = MessageResolverGlobal.class.getClassLoader().getResourceAsStream(PROPERTIES_FILE);
      PROPERTIES.load(stream);
    } catch (IOException ex) {
      Logger.getLogger(MessageResolverGlobal.class.getName()).log(Level.SEVERE, null,ex);
    } finally {
      try {
        if (stream != null) {
          stream.close();
        }
      } catch (IOException ex) {
        Logger.getLogger(MessageResolverGlobal.class.getName()).
                log(Level.SEVERE, null, ex);
      }
    }
  }

  public static String getMessage(String key, Object[] data) {
Logger.getLogger(MessageResolverGlobal.class.getName()).log(Level.SEVERE,">>>MessageResolverGlobal  getMessage key={0}",key);
Logger.getLogger(MessageResolverGlobal.class.getName()).log(Level.SEVERE,">>>MessageResolverGlobal  getMessage PROPERTIES_FILE={0}",PROPERTIES_FILE);
    String message;
    message = (new MessageFormat(PROPERTIES.getProperty(key, ""))).format(data,
            new StringBuffer(), null).toString();
Logger.getLogger(MessageResolverGlobal.class.getName()).log(Level.SEVERE,">>>MessageResolverGlobal  getMessage message={0}",message);
    return message;
  }

}
