/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.common.model;

import java.util.Date;
import lombok.Getter;

/**
 *
 * @author antonio
 */
public class ErrorInfo extends FrontBaseModel{
  @Getter String dateTime = ( new Date() ).toString();
  @Getter String versionEnh = "20200717_0729";

}
