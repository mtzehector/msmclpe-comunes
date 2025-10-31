/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.support.config;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
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
public class CustomDateDeserializer extends StdDeserializer<Date> {
     protected final Logger log = Logger.getLogger( getClass().getName() );
  
  private final SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
  private final SimpleDateFormat formatterNoTime = new SimpleDateFormat("dd/MM/yyyy");


  public CustomDateDeserializer() {
    this(null);
  }

  public CustomDateDeserializer(Class<?> vc) {
    super(vc);
  }

  @Override
  public Date deserialize(JsonParser jsonparser, DeserializationContext context)
  throws IOException, JsonProcessingException {
    String date = jsonparser.getText().trim();
    //log.log(Level.INFO, ">>>>>> CustomDateDeserializer String date={0}", date);
      
    try {
        Date ret;
        if(date.length()>10){
            ret = formatter.parse(date);
        }
        else{
            ret =  formatterNoTime.parse(date);
        }
        //log.log(Level.INFO, ">>>>>> CustomDateDeserializer Date ret={0}", ret);
        return ret;
    } catch (ParseException e) {
      throw new RuntimeException(e);
    }
  }
}
