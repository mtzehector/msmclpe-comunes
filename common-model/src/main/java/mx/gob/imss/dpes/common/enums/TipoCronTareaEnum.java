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
 * 1	6	120	1,15,2	Inicia Simulación por Pensionado
2	6	120	2	Inicia Simulación por Promotor
3	6	120	1,15,2	Inicia Renovación por Pensionado
4	6	120	2	Inicia Renovación por Promotor
5	6	120	1,15,2	Inicia Compra de Cartera por Pensionado Mejor Opcion
6	15	120	5	Inicia Compra de Cartera o Mixto Pensionado Peor Opcion
7	6	120	1,15,2	Inicia Simulación Misma EF(Renovacion) Peor Opcion
8	6	120	2	Inicia Compra de Cartera o Mixto por Promotor Mejor opcion
9	15	120	5	Inicia Compra de Cartera o Mixto por Promotor Peor opcion
10	6	120	2	Inicia Compra de Cartera o Mixto por Promotor Mejor opcion
11	6	72	4	Pendiente cargar CEP

 */
public enum TipoCronTareaEnum {

    SIMULACION_NUEVO(1L, "Simulacion pensionado"),
    PROMOTOR_NUEVO(2L, "Simulacion Promotor"),
    SIMULACION_RENOVACION(3L, "Simulacion Renovacion Pensionado"),
    PROMOTOR_RENOVACION(4L, "Simulacion Renovacion Promotor"),
//    SIMULACION_RENOVACIONES_MEJOR_OPCION(5L, "Simulacion Misma EF(Renovaciones) Pensionado Mejor Opcion"),
    SIMULACION_COMPRA_CARTERA_MIXTO_MEJOR_OPCION(5L, "Simulacion Compra de Cartera o Mixto Pensionado Mejor Opcion"),
    SIMULACION_COMPRA_CARTERA_MIXTO_PEOR_OPCION(6L, "Simulacion Compra de Cartera o Mixto Pensionado Peor Opcion"),
    SIMULACION_RENOVACIONES_PEOR_OPCION(7L, "Simulación Misma EF(Renovaciones) Pensionado Peor Opcion"),
//    PROMOTOR_RENOVACIONES_MEJOR_OPCION(8L, "Promotor Misma EF(Renovaciones) Mejor opcion"),
    PROMOTOR_COMPRA_CARTERA_MIXTO_MEJOR_OPCION(8L, "Promotor Compra de Cartera o Mixto Mejor opcion"),
    PROMOTOR_COMPRA_CARTERA_MIXTO_PEOR_OPCION(9L, "Promotor Compra de Cartera o Mixto Peor opcion"),
    PROMOTOR_RENOVACIONES_PEOR_OPCION(10L, "Promotor Misma EF(Renovaciones) Peor Opcion"),
    PENDIENTE_CARGAR_CEP(11L, "Pendiente cargar CEP");
    
	

    private static final Map<Long, TipoCronTareaEnum> map = new HashMap<>();

    static {
        map.put(SIMULACION_NUEVO.tipo, SIMULACION_NUEVO);
        map.put(PROMOTOR_NUEVO.tipo, PROMOTOR_NUEVO);
        map.put(SIMULACION_RENOVACION.tipo, SIMULACION_RENOVACION);
        map.put(PROMOTOR_RENOVACION.tipo, PROMOTOR_RENOVACION);
        map.put(SIMULACION_COMPRA_CARTERA_MIXTO_MEJOR_OPCION.tipo, SIMULACION_COMPRA_CARTERA_MIXTO_MEJOR_OPCION);
        map.put(SIMULACION_COMPRA_CARTERA_MIXTO_PEOR_OPCION.tipo, SIMULACION_COMPRA_CARTERA_MIXTO_PEOR_OPCION);
        map.put(SIMULACION_RENOVACIONES_PEOR_OPCION.tipo, SIMULACION_RENOVACIONES_PEOR_OPCION);
        map.put(PROMOTOR_COMPRA_CARTERA_MIXTO_MEJOR_OPCION.tipo, PROMOTOR_COMPRA_CARTERA_MIXTO_MEJOR_OPCION);
        map.put(PROMOTOR_COMPRA_CARTERA_MIXTO_PEOR_OPCION.tipo, PROMOTOR_COMPRA_CARTERA_MIXTO_PEOR_OPCION);
        map.put(PROMOTOR_RENOVACIONES_PEOR_OPCION.tipo, PROMOTOR_RENOVACIONES_PEOR_OPCION);
        map.put(PENDIENTE_CARGAR_CEP.tipo, PENDIENTE_CARGAR_CEP);
        
    }
    @Getter
    final String descripcion;
    @Getter
    Long tipo;

    TipoCronTareaEnum(Long tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    @JsonCreator
    public static TipoCronTareaEnum forValue(Long value) {
        return map.get(value);
    }

    @JsonValue
    public Long toValue() {
        for (Map.Entry<Long, TipoCronTareaEnum> entry : map.entrySet()) {
            if (entry.getValue() == this) {
                return entry.getKey();
            }
        }
        return null;
    }

}
