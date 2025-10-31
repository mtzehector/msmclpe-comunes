/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.common.exception;

import mx.gob.imss.dpes.common.exception.BusinessException;

/**
 *
 * @author osiris.hernandez
 */
public class FechaVigenciaException extends BusinessException {

  private static final String KEY ="msg17";

  public FechaVigenciaException() {
    super(KEY);
  }
  @Override
    public String getMessage() {
        return MessageResolverGlobal.getMessage(messageKey, getParameters());
    }
}
