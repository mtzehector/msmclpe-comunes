package mx.gob.imss.dpes.common.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class SecureModel extends BaseModel {
    private Long sesion;
    private String token;
}
