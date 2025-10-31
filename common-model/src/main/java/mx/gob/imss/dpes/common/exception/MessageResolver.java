/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.common.exception;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.MessageFormat;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author antonio
 */
public abstract class MessageResolver {

    private static final Properties PROPERTIES = new Properties();
    private static final String PROPERTIES_FILE = "/errors.properties";

    static {
        InputStream stream = null;
        try {
            stream = MessageResolver.class.getClassLoader().getResourceAsStream(PROPERTIES_FILE);
            PROPERTIES.load(stream);
        } catch (IOException ex) {
            Logger.getLogger(MessageResolver.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (stream != null) {
                    stream.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(MessageResolver.class.getName()).
                        log(Level.SEVERE, null, ex);
            }
        }
    }

    public static String getMessage(String key, Object[] data) {

        String message;
        message = (new MessageFormat(PROPERTIES.getProperty(key, ""))).format(data,
                new StringBuffer(), null).toString();
        Logger.getLogger(MessageResolver.class.getName()).log(Level.SEVERE, ">>>MessageResolver  getMessage message={0}", message);
        return message;
    }

    public static String getMessage(URL propertiesURL, String key, Object[] data) {
        setPropertiesFile(propertiesURL);
        return getMessage(key, data);
    }

    public static void setPropertiesFile(URL propertiesURL) {
        InputStream stream = null;
        try {
            stream = propertiesURL.openStream();
            PROPERTIES.load(stream);
        } catch (IOException ex) {
            Logger.getLogger(MessageResolver.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (stream != null) {
                    stream.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(MessageResolver.class.getName()).
                        log(Level.SEVERE, null, ex);
            }
        }
    }

}
