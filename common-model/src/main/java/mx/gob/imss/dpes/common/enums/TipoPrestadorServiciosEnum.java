package mx.gob.imss.dpes.common.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public enum TipoPrestadorServiciosEnum {

    CERTIFICADO(1, "Prestador de servicios de certificación"),
    VALIDACION_BIOMETRICA(2, "Prestador de servicios de validación biométrica");

    private static final Map<Integer, TipoPrestadorServiciosEnum> map = new HashMap<>();

    static {
        map.put(CERTIFICADO.tipo, CERTIFICADO);
        map.put(VALIDACION_BIOMETRICA.tipo, VALIDACION_BIOMETRICA);
    }

    @Getter
    final String descripcion;
    @Getter
    final Integer tipo;

    TipoPrestadorServiciosEnum(Integer tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    @JsonCreator
    public static TipoPrestadorServiciosEnum forValue(Integer value) {
        return map.get(value);
    }

    @JsonValue
    public Integer toValue() {
        for (Map.Entry<Integer, TipoPrestadorServiciosEnum> entry : map.entrySet()) {
            if (entry.getValue() == this) {
                return entry.getKey();
            }
        }
        return null;
    }
}
