package mx.gob.imss.dpes.common.model;


import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.enums.SexoEnum;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antonio
 */
public class UserProfile extends BaseModel{
  @Getter @Setter String nombre;
  @Getter @Setter String primerApellido;
  @Getter @Setter String segundoApellido;
  @Getter @Setter String correoElectronico;
  @Getter @Setter String telefono;
  @Getter @Setter SexoEnum sexo;
  @Getter @Setter Integer edad;
}
