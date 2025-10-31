/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.support.util;

import java.util.LinkedList;
import java.util.List;
import mx.gob.imss.dpes.common.exception.BusinessException;
import mx.gob.imss.dpes.common.exception.MandatoryFieldsEmptyException;
import mx.gob.imss.dpes.common.exception.ServiceNotAvailableException;


/**
 *
 * @author gabriel.rios
 */
public class ExceptionUtils {
    
   public static void throwServiceException(String service)throws BusinessException {
        List parameters = new LinkedList();
        parameters.add(service);
        throw new ServiceNotAvailableException(parameters);
    }
   
   //TODO: Extender para mostrar los nombres de los campos faltantes si es necesario
   public static void checkMandatoryFields(List<String> mandatoryFields) throws BusinessException {
       boolean empty = false;
       for(String field:mandatoryFields){
           if(field==null || field.isEmpty()){
               empty = true;
           }
       }
       if(empty) 
           throw new MandatoryFieldsEmptyException();
   }
    
}


