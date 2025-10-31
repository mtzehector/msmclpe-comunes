/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.baseback.persistence;


import java.util.logging.Logger;
import org.springframework.data.jpa.domain.Specification;

/**
 *
 * @author antonio
 */
public abstract class BaseSpecification<T>  implements
        Specification<T> {
  protected final transient Logger log = Logger.getLogger( getClass().getName() );
}
