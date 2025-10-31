/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.baseback.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import mx.gob.imss.dpes.common.entity.LogicDeletedEntity;
import mx.gob.imss.dpes.common.model.IdentityBaseModel;
import mx.gob.imss.dpes.common.model.PageRequestModel;
import mx.gob.imss.dpes.baseback.persistence.BaseSpecification;
import mx.gob.imss.dpes.baseback.persistence.RegistroActivoSpecification;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

/**
 *
 * @author antonio
 * @param <M> Model
 * @param <E> Entity
 */
public abstract class BasePageableCRUDService<M extends IdentityBaseModel<Q>, 
        E extends LogicDeletedEntity<I>, I extends Serializable, Q extends Serializable>
        extends BaseCRUDService<M, E, I, Q> 
{

  public static final int TAMANIO_PAGINA = 10;
  
  public Page<E> load(Collection<BaseSpecification> constraints, int pageNumber,
          List<Sort.Order> orders) {
    List<RegistroActivoSpecification<E>> registroActivoConstraint = Arrays.
            asList(new RegistroActivoSpecification<E>());
    Pageable request = new PageRequest(pageNumber, TAMANIO_PAGINA, new Sort(
            orders));
    constraints.addAll(registroActivoConstraint);
    return getRepository().findAll( prepareConstraints(constraints), request);
  }
  
  public Page<E> load(Collection<BaseSpecification> constraints, int pageNumber,int pageSize,List<Sort.Order> orders) {
    List<RegistroActivoSpecification<E>> registroActivoConstraint = Arrays.asList(new RegistroActivoSpecification<E>());
    Pageable request = new PageRequest(pageNumber, pageSize, new Sort(orders));
    constraints.addAll(registroActivoConstraint);
    return getRepository().findAll( prepareConstraints(constraints), request);
  }
  
  public List<E> loadAll(Collection<BaseSpecification> constraints) {
    List<RegistroActivoSpecification<E>> registroActivoConstraint = Arrays.asList(new RegistroActivoSpecification<E>());
    constraints.addAll(registroActivoConstraint);
    return getRepository().findAll( prepareConstraints(constraints));
  }

  public Page<E> loadInactives(Collection<BaseSpecification> constraints,
          int pageNumber, List<Sort.Order> orders) {
    Pageable request = new PageRequest(pageNumber, TAMANIO_PAGINA, new Sort(
            orders));
    return getRepository().findAll(
            prepareConstraints(constraints), request);
  }
  
  @SuppressWarnings("empty-statement")
  public Page<E> fetch(
          PageRequestModel<M> pageRequest) {
    List<Sort.Order> orders = new ArrayList<>();
    orders.add(new Sort.Order("id"));
    
    return fetch(pageRequest, orders);
  }
  
  public Page<E> fetch(
          PageRequestModel<M> pageRequest, List<Sort.Order> orders) {
        log.log(Level.INFO, " desde FETCH ERPE 1 {0}",pageRequest);
                log.log(Level.INFO, " desde FETCH ERPE2  {0}",orders);

    List<BaseSpecification> especificaciones =
            new ArrayList<>();
    especificaciones.addAll (customConstraints());
    if( pageRequest.getModel() != null){
      especificaciones.addAll (customConstraints( pageRequest.getModel() ));
    }
        log.log(Level.INFO, " desde FETCH ERPE4  especificaciones  nulos{0} ",especificaciones);

    //Eliminamos los nulos
    while(especificaciones.remove(null));
    log.log(Level.INFO, " desde FETCH ERPE4  especificaciones {0} ",especificaciones);
    log.log(Level.INFO, " desde FETCH ERPE 5 page {0} ",pageRequest.getPage() -
            1);
    log.log(Level.INFO, " desde FETCH ERPE  6orders {0} ",orders);
   
    Page<E> load = this.load(especificaciones,
            pageRequest.getPage() -
            1, orders);
    return load;
  }
  
  public Page<E> fetch(PageRequestModel<M> pageRequest,int pageSize, List<Sort.Order> orders) {
    log.log(Level.INFO, ">>>BasePageableCRUDService pageRequest={0}",pageRequest);
    log.log(Level.INFO, ">>>BasePageableCRUDService orders={0}",orders);

    List<BaseSpecification> especificaciones = new ArrayList<>();
    especificaciones.addAll (customConstraints());
    if( pageRequest.getModel() != null){
      especificaciones.addAll (customConstraints( pageRequest.getModel() ));
    }
    
    //Eliminamos los nulos
    while(especificaciones.remove(null));
    log.log(Level.INFO, ">>>BasePageableCRUDService especificaciones={0}",especificaciones);
    log.log(Level.INFO, ">>>BasePageableCRUDService page={0}",pageRequest.getPage() - 1);
    
    Page<E> load = this.load(especificaciones,pageRequest.getPage() - 1,pageSize, orders);
    return load;
  }
  
  public List<E> fetchAll(PageRequestModel<M> pageRequest) {
    List<BaseSpecification> especificaciones = new ArrayList<>();
    especificaciones.addAll (customConstraints());
    if( pageRequest.getModel() != null){
      especificaciones.addAll (customConstraints( pageRequest.getModel() ));
    }
    //Eliminamos los nulos
    while(especificaciones.remove(null));
    log.log(Level.INFO, ">>>BasePageableCRUDService.fetchAll especificaciones={0}",especificaciones);
    
    List<E> load = this.loadAll(especificaciones);
    return load;
  }
  
  public Collection<BaseSpecification<E>> customConstraints(M model) {
    log.log(Level.INFO,"{0}", model);
    return Collections.emptyList();
  }

  

}
