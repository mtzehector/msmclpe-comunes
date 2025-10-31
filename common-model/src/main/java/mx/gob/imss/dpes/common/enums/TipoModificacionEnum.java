package mx.gob.imss.dpes.common.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public enum TipoModificacionEnum {

    CORREO_ELECTRONICO(1L, "Correo electrónico"),
    TELEFONO_LOCAL(2L, "Teléfono"),
    TELEFONO_CELULAR(3L, "Teléfono móvil");

    private static final Map<Long, TipoModificacionEnum> map = new HashMap<>();

    static {
        map.put(CORREO_ELECTRONICO.tipo, CORREO_ELECTRONICO);
        map.put(TELEFONO_LOCAL.tipo, TELEFONO_LOCAL);
        map.put(TELEFONO_CELULAR.tipo, TELEFONO_CELULAR);
    }

    @Getter
    final String descripcion;
    @Getter
    Long tipo;

    TipoModificacionEnum(Long tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    @JsonCreator
    public static TipoModificacionEnum forValue(Long value) {
        return map.get(value);
    }

    @JsonValue
    public Long toValue() {
        for (Map.Entry<Long, TipoModificacionEnum> entry : map.entrySet()) {
            if (entry.getValue() == this) {
                return entry.getKey();
            }
        }
        return null;
    }

}
