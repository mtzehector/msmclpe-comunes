/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.common.model;

import java.io.Serializable;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author antonio
 * @param <M>
 */
public class PageModel<M extends Serializable> extends BaseModel{
  @Getter @Setter private List<M> content;
  @Getter @Setter private Long totalElements;
  @Getter @Setter private Long totalMclpeElements;
  @Getter @Setter private Integer numberOfElements;
  @Getter @Setter private Integer number;
  @Getter @Setter private Integer size;
  @Getter @Setter private Integer totalPages;
  @Getter @Setter private Integer pageSize;
}
