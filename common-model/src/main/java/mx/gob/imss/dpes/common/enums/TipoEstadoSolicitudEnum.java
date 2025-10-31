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
 * @author eduardo.loyo
 */
public enum TipoEstadoSolicitudEnum {

    INICIADO(1L, "Iniciado"),
    POR_AUTORIZAR(2L, "Por autorizar"),
    AUTORIZADO(3L, "Pendiente por cargar comprobante"),
    PENDIENTE_CARGA_COMPROBANTE(4L, "Pendiente por carga comprobante"),
    PENDIENTE_MONTO_LIQUIDAR(5L, "Pendiente monto a liquidar"),
    CANCELADO(6L, "Cancelado"),
    PRESTAMO(7L, "Prestamo suspendido"),
    PRESTAMO_RECUPERACION(8L, "Prestamo en recuperacion"),
    BAJA_LIQUIDACION_ANTICIPADA(9L, "Baja por liquidación anticipada"),
    BAJA_COMPRA_CARTERA(10L, "Baja por compra de cartera"),
    BAJA_LIQUIDACION_TOTAL(11L, "Baja por liquidación total"),
    BAJA_DEFUNCION_IRRECUPERABLE(12L, "Baja por defunción o Irrecuperable"),
    BAJA_IMPROCEDENCIA(13L, "Baja por improcedencia"),
    POR_AUTORIZAR_RENOVACION(14L, "Por autorizar renovación"),
    POR_ASIGNAR_PROMOTOR(15L, "Por asignar personal operativo"),
    PRESTAMOS_SUSPENSION_REANUDADA(16L, "Prestamo suspension reanudada"),
    PRESTAMO_OTORGADO(17L, "Préstamo otorgado"),
    PRESTAMO_ERROR_SPES(18L, "Préstamo con error SPES"),
    PRE_SIMULACION(20L, "Pre-Simulación"),
    CANCELADO_DIFERENTE_TABLA_AMORTIZACION(21L, "Cancelado por diferencias en la tabla de amortización"),
    DESCUENTOS_NO_APLICADOS(22L, "Descuentos no aplicados");

    private static final Map<Long, TipoEstadoSolicitudEnum> map = new HashMap<>();

    static {
        map.put(INICIADO.tipo, INICIADO);
        map.put(POR_AUTORIZAR.tipo, POR_AUTORIZAR);
        map.put(AUTORIZADO.tipo, AUTORIZADO);
        map.put(PENDIENTE_CARGA_COMPROBANTE.tipo, PENDIENTE_CARGA_COMPROBANTE);
        map.put(PENDIENTE_MONTO_LIQUIDAR.tipo, PENDIENTE_MONTO_LIQUIDAR);
        map.put(CANCELADO.tipo, CANCELADO);
        map.put(PRESTAMO.tipo, PRESTAMO);
        map.put(PRESTAMO_RECUPERACION.tipo, PRESTAMO_RECUPERACION);
        map.put(BAJA_LIQUIDACION_ANTICIPADA.tipo, BAJA_LIQUIDACION_ANTICIPADA);
        map.put(BAJA_COMPRA_CARTERA.tipo, BAJA_COMPRA_CARTERA);
        map.put(BAJA_LIQUIDACION_TOTAL.tipo, BAJA_LIQUIDACION_TOTAL);
        map.put(BAJA_DEFUNCION_IRRECUPERABLE.tipo, BAJA_DEFUNCION_IRRECUPERABLE);
        map.put(BAJA_IMPROCEDENCIA.tipo, BAJA_IMPROCEDENCIA);
        map.put(POR_AUTORIZAR_RENOVACION.tipo, POR_AUTORIZAR_RENOVACION);
        map.put(POR_ASIGNAR_PROMOTOR.tipo, POR_ASIGNAR_PROMOTOR);
        map.put(PRESTAMOS_SUSPENSION_REANUDADA.tipo, PRESTAMOS_SUSPENSION_REANUDADA);
        map.put(PRESTAMO_OTORGADO.tipo, PRESTAMO_OTORGADO);
        map.put(PRESTAMO_ERROR_SPES.tipo, PRESTAMO_ERROR_SPES);
        map.put(PRE_SIMULACION.tipo, PRE_SIMULACION);
        map.put(CANCELADO_DIFERENTE_TABLA_AMORTIZACION.tipo, CANCELADO_DIFERENTE_TABLA_AMORTIZACION);
        map.put(DESCUENTOS_NO_APLICADOS.tipo, DESCUENTOS_NO_APLICADOS);
    }
    @Getter
    final String descripcion;
    @Getter
    Long tipo;

    TipoEstadoSolicitudEnum(Long tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    @JsonCreator
    public static TipoEstadoSolicitudEnum forValue(Long value) {
        return map.get(value);
    }

    @JsonValue
    public Long toValue() {
        for (Map.Entry<Long, TipoEstadoSolicitudEnum> entry : map.entrySet()) {
            if (entry.getValue() == this) {
                return entry.getKey();
            }
        }
        return null;
    }

}
