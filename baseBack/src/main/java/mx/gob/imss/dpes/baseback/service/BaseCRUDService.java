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
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import mx.gob.imss.dpes.common.entity.LogicDeletedEntity;
import mx.gob.imss.dpes.common.model.IdentityBaseModel;
import mx.gob.imss.dpes.baseback.persistence.BaseSpecification;
import mx.gob.imss.dpes.baseback.persistence.RegistroActivoSpecification;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 *
 * @author antonio
 * @param <M> Model
 * @param <E> Entity
 */
public abstract class BaseCRUDService<M extends IdentityBaseModel<Q>, E extends LogicDeletedEntity<I>, I extends Serializable, Q extends Serializable>
        extends BaseSpecificationService<E>
{

  public abstract JpaSpecificationExecutor<E> getRepository();

  public List<E> load(Collection<BaseSpecification> constraints) {
    List<RegistroActivoSpecification<E>> registroActivoConstraint = Arrays.
            asList(new RegistroActivoSpecification<E>());
    constraints.addAll(registroActivoConstraint);
    return getRepository().findAll( prepareConstraints(constraints));
  }

  public List<E> load(Collection<BaseSpecification> constraints,
          List<Sort.Order> orders) {
      Iterator it = constraints.iterator();
      while(it.hasNext()){
         log.info("iteradorr en base"+it);
         it.next();
      }
    return getRepository().findAll( prepareConstraints(constraints), new Sort(orders));
  }

  public Collection<BaseSpecification<E>> customConstraints() {
    return Collections.emptyList();
  }

  public List<E> load() {
    List<RegistroActivoSpecification<E>> registroActivoConstraint = Arrays.
            asList(new RegistroActivoSpecification<E>());
    Collection<BaseSpecification> aux = new ArrayList<BaseSpecification>();
    aux.addAll(registroActivoConstraint);
    aux.addAll(customConstraints());
    return getRepository().findAll( prepareConstraints(aux));
  }

  public E update(E model) {
    return getJpaRepository().save(preUpdate( model, getJpaRepository().findOne(
                    model.getId())));
  }

  public E save(E model) {
    if (model.getId() != null ) {
      return update(model);
    } else {
      return getJpaRepository().saveAndFlush(preInsert(model));
    }
  }

  public void delete(I model) {
    getJpaRepository().save(preDelete(getJpaRepository().findOne( model )));

  }

  public E preDelete(E entity) {
    LogicDeletedEntity logicDeletedEntity = (LogicDeletedEntity) entity;
    logicDeletedEntity.setBajaRegistro(new Date() );    
    return entity;
  }

  public E preInsert(E entity) {    
    LogicDeletedEntity logicDeletedEntity = (LogicDeletedEntity) entity;
    logicDeletedEntity.setAltaRegistro(new Date());   
    return entity;
  }

  public E preUpdate(E entity, E findOne) {
    LogicDeletedEntity logicDeletedEntity = (LogicDeletedEntity) entity;
    logicDeletedEntity.setActualizacionRegistro(new Date());
    ((LogicDeletedEntity) entity).setAltaRegistro(
            ((LogicDeletedEntity) findOne).getAltaRegistro());    
    return entity;
  }

  public E findOne(I id) {
    return getJpaRepository().findOne(id);
  }

  public E findOne(Collection<BaseSpecification> constraints) {
    constraints.add( new RegistroActivoSpecification<E>() );
    return getRepository().findOne(prepareConstraints(constraints));
  }

  public abstract JpaRepository<E, I> getJpaRepository();

}
