package mx.gob.imss.dpes.common.service;

import java.util.logging.Logger;

public abstract class BaseService {

  protected final Logger log = Logger.getLogger( getClass().getName() );
  
  /*
   * Transforma una cadena con formato yyyy-mm-dd a dd/mm/yyyy 00:00:00
   */
  protected String toFormatedDate(String date){
    if( date != null && date.length()>= 10 ){
      StringBuilder sb = new StringBuilder();
      sb.append(date.substring(8, 10));
      sb.append("/");
      sb.append(date.substring(5, 7));
      sb.append("/");
      sb.append(date.substring(0, 4));
      sb.append(" 00:00:00");
      return sb.toString();
    }
    return "";
  }
}
