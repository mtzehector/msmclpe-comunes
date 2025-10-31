/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.baseback.persistence;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 *
 * @author antonio
 * @param <T> Model
 */
public class RegistroActivoSpecification<T> extends BaseSpecification<T> {

  private final static String NOMBRE_ATRIBUTO = "bajaRegistro";

  @Override
  public Predicate toPredicate(Root<T> root, CriteriaQuery<?> cq,
          CriteriaBuilder cb) {
    return cb.isNull(root.<Boolean>get(NOMBRE_ATRIBUTO));
  }
}
