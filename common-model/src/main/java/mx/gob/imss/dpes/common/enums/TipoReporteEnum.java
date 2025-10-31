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
public enum TipoReporteEnum {
    REPORTE_CONCILIACION(1L, "Reporte Conciliación IMSS"),
    REPORTE_CONCILIACION_EF(2L, "Reporte Conciliación EF"),
    REPORTE_DESCUENTOS_EMITIDOS(3L, "Reporte Descuentos Emitidos"),
    REPORTE_COMPRAS_CARTERA_EF(4L, "Compras de Cartera de Entidades Financieras");

    private TipoReporteEnum(Long id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    @Getter
    Long id;
    @Getter
    final String descripcion;

    private static final Map<Long, TipoReporteEnum> map = new HashMap<>();

    static {
        map.put(REPORTE_CONCILIACION.id, REPORTE_CONCILIACION);
        map.put(REPORTE_CONCILIACION_EF.id, REPORTE_CONCILIACION_EF);
        map.put(REPORTE_DESCUENTOS_EMITIDOS.id, REPORTE_DESCUENTOS_EMITIDOS);
        map.put(REPORTE_COMPRAS_CARTERA_EF.id, REPORTE_COMPRAS_CARTERA_EF);
    }

    @JsonCreator
    public static TipoReporteEnum forValue(Long value) {
        return map.get(value);
    }

    @JsonValue
    public Long toValue() {
        for (Map.Entry<Long, TipoReporteEnum> entry : map.entrySet()) {
            if (entry.getValue() == this) {
                return entry.getKey();
            }
        }
        return null;
    }
}
