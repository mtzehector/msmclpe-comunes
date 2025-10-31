/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.common.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import mx.gob.imss.dpes.common.exception.MessageResolver;

/**
 *
 * @author antonio
 */
public class Notice extends BaseModel {

    @Getter
    String messageKey;
    private final List<String> param = new ArrayList<String>();

    public Notice(String messageKey) {
        this.messageKey = messageKey;        
    }
    
    public Notice(String messageKey, String param) {
        this.messageKey = messageKey;
        this.param.add(param);
    }

    public Notice(String messageKey, String param1, String param2) {
        this.messageKey = messageKey;
        this.param.add(param1);
        this.param.add(param2);
    }

    public Object[] getParameters() {
      return param.toArray();
    }
    
    public String getMessage() {
        return MessageResolver.getMessage(messageKey, getParameters());
    }
}

