/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.common.rule;

import java.util.logging.Logger;
import mx.gob.imss.dpes.common.exception.BusinessException;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author antonio
 * @param <I>
 * @param <O>
 */
public abstract class BaseRule<I extends BaseModel, O extends BaseModel> {
  protected final Logger log = Logger.getLogger( getClass().getName() );
  
  public abstract O apply(I input) throws BusinessException;
}
