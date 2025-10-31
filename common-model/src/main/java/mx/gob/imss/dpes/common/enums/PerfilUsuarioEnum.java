/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.common.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import lombok.Getter;

/**
 *
 * @author edgar.arenas
 */
public enum PerfilUsuarioEnum {
    
    PENSIONADO(1L, "Pensionado"),
    ADMINISTRADOR_EF(2L, "Administrador Entidad Financiera"),
    PROMOTOR(3L, "Promotor"),
    OPERADOR_EF(4l, "Operador EF"),
    ADMINISTRADOR_IMSS(5L, "Administrador IMSS"),
    OPERADOR_IMSS(6L, "Operador IMSS");
    
    private static final Map<Long, PerfilUsuarioEnum> map = new HashMap<>();
        
    static {
        map.put(PENSIONADO.tipo, PENSIONADO);
        map.put(ADMINISTRADOR_EF.tipo, ADMINISTRADOR_EF);
        map.put(PROMOTOR.tipo, PROMOTOR);
        map.put(OPERADOR_EF.tipo, OPERADOR_EF);
        map.put(ADMINISTRADOR_IMSS.tipo, ADMINISTRADOR_IMSS);
        map.put(OPERADOR_IMSS.tipo, OPERADOR_IMSS);
    }
    @Getter
    final String descripcion;
    @Getter
    Long tipo;
    
    PerfilUsuarioEnum(Long tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    @JsonCreator
    public static PerfilUsuarioEnum forValue(Long value) {
        return map.get(value);
    }

    @JsonValue
    public Long toValue() {
        for (Map.Entry<Long, PerfilUsuarioEnum> entry : map.entrySet()) {
            if (entry.getValue() == this) {
                return entry.getKey();
            }
        }
        return null;
    }
}
