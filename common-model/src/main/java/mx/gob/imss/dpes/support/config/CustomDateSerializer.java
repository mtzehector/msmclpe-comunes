/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.support.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author antonio
 */
public class CustomDateSerializer extends StdSerializer<Date> {
      protected final Logger log = Logger.getLogger( getClass().getName() );
  
  private final SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

  public CustomDateSerializer() {
    this(null);
  }

  public CustomDateSerializer(Class t) {
    super(t);
  }

  @Override
  public void serialize(Date value, JsonGenerator gen, SerializerProvider arg2)
    throws IOException, JsonProcessingException {
      //log.log(Level.INFO, ">>>>>> CustomDateSerializer Date date={0}", value);
      String formatted = formatter.format(value);
      //log.log(Level.INFO, ">>>>>> CustomDateSerializer String formatted={0}", formatted);
      gen.writeString(formatted);
  }
}
