/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.support.util;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author gabriel.rios
 */
public class LoggerUtils {
     public static String JSon2Str(Object target){
       ObjectMapper Obj = new ObjectMapper(); 
        String jsonStr = null;
        try{
            jsonStr = Obj.writeValueAsString(target); 
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return jsonStr;
    }
    
}
