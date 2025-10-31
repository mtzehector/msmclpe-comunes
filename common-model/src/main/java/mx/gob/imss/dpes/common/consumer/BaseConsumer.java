/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.common.consumer;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import mx.gob.imss.dpes.common.model.Message;
import mx.gob.imss.dpes.common.service.BaseService;

/**
 *
 * @author antonio
 */
public abstract class BaseConsumer extends BaseService
    implements MessageListener {
  
  @Inject private JMSContext context;
  
  protected abstract void proccess(Message message);
  
  @Override
  public void onMessage(javax.jms.Message msg) {
  
    if (msg instanceof ObjectMessage){
      try {
        ObjectMessage omsg = (ObjectMessage) msg;
        Message message = omsg.getBody(Message.class);
        proccess(message);
      } catch (JMSException ex) {
        log.log(Level.SEVERE, null,ex);
      }
    }
  }
  
}
