/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.baseback.service;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import mx.gob.imss.dpes.baseback.persistence.BaseSpecification;
import mx.gob.imss.dpes.common.service.BaseService;
import org.springframework.data.jpa.domain.Specification;

/**
 *
 * @author antonio
 * @param <E> Entity
 */
public abstract class BaseSpecificationService<E>
        extends BaseService {

  public Specification<E> prepareConstraints(
          final Collection<BaseSpecification> constraints) {
    return new Specification<E>() {
      @Override
      public Predicate toPredicate(Root<E> root, CriteriaQuery<?> query,
              CriteriaBuilder cb) {

        List<Predicate> predicates = new ArrayList<>();
        for (BaseSpecification constraint : constraints) {
          predicates.add(constraint.toPredicate(root, query, cb));
        }

        return cb.and(predicates.toArray(new Predicate[]{}));
      }
    };

  }

}
