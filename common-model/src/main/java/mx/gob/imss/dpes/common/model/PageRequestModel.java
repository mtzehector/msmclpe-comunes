/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.common.model;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author antonio
 * @param <M> Modelo
 */
public class PageRequestModel<M extends BaseModel> extends BaseModel {

  @Getter
  @Setter
  private int page;
  @Getter
  @Setter
  private int pageSize;
  @Getter
  @Setter
  private int totalPages;
  @Getter
  @Setter
  private int totalElements;
  @Getter
  @Setter
  private int totalMclpeElements;
  @Getter
  @Setter
  private int numberOfElements;
  
  @Getter
  @Setter
  private M model;

}
