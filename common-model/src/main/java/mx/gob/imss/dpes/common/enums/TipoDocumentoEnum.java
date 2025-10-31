/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.common.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author antonio
 */
public enum TipoDocumentoEnum {

    RESUMEN_SIMULACION(1L, "Resumen simulación", "pdf"),
    CARTA_CAPACIDAD_CREDITO(2L, "Carta capacidad crédito", "pdf"),
    CARTA_INSTRUCCION(3L, "Carta de Libranza", "pdf"),
    IDENTIFICACION_OFICIAL(4L, "Identificación oficial ", "pdf"),
    CONTRATO(5L, "Contrato", "pdf"),
    TABLA_DE_AMORTIZACION_DE_CREDITO(6L, "Tabla de amortización de crédito", "pdf"),
    CEP_PENSIONADO(7L, "CEP Pensionado", "pdf"),
    CEP_ENTIDAD_FINANCIERA(8L, "CEP Entidad Financiera", "pdf"),
    //FOTOGRAFIA(9L, "Fotografía", "pdf"),
    FOTOGRAFIA(9L, "Fotografía", "jpeg"),
    COMPROBANTE_DE_DOMICILIO(10L, "Comprobante de domicilio", "pdf"),
    CARTA_RESPONSIVA(11L, "Carta responsiva", "pdf"),
    CEP_PENSIONADO_XML(12L, "CEP Pensionado XMLl", "xml"),
    CEP_ENTIDAD_FINANCIERA_XML(13L, "CEP Entidad Financiera XML", "xml"),
    NOTIFICACION(14L, "Notificación", "pdf"),
    LOGO(15L, "Logo", "jpeg"),
    NOTIFICACION_XML(16L, "Notificación XML", "xml"),
    REPORTE_CONCILIACION_XLSX(17L, "Reporte Conciliacion IMSS", "xlsx"),
    REPORTE_INCONSISTENCIAS(18L, "Reporte de inconsistencias", "txt"),
    REPORTE_DESCUENTOS_EMITIDOS_POR_EF(19L, "Reporte Descuentos Emitidos Por EF", "xlsx"),
    REPORTE_DESCUENTOS_EMITIDOS_POR_DEL(20L, "Reporte Descuentos Emitidos Por Delegación", "xlsx"),
    REPORTE_INCONSISTENCIAS_PRESTAMOS(21L, "Reporte de inconsistencias prestamos", "txt"),
    REPORTE_INCONSISTENCIAS_DESCUENTOS(22L, "Reporte de inconsistencias descuentos", "txt"),
    REPORTE_COMPRAS_CARTERA_EF(23L, "Reporte de Compras de Cartera EF", "xlsx"),
    CAT_MAXIMO(24L, "CAT Máximo", "pdf"),
    CON_ENT_FIN_PRESTADOR_SERV_CERT(25L,
            "Contrato de entidad financiera con el prestador de servicios de certificado", "pdf"),
    CON_ENT_FIN_PRESTADOR_SERV_VAL_BIO(26L,
            "Contrato de entidad financiera con el prestador de servicios de validación biométrica", "pdf"),
    DETALLE_CONCILIACION(27L, "Detalle de la conciliación", "pdf"),
    CARTA_RECIBO_SIN_FIRMA(28L, "Carta recibo sin firma", "pdf"),
    CARTA_RECIBO_CON_FIRMA(29L, "Carta recibo con firma Administrador EF", "pdf"),
    RESUMEN_CONCILIACION(30L, "Resumen de conciliación", "pdf"),
    SOLICITUD_TRANSFERENCIA_RECURSOS_RETENCIONES(31L, "Solicitud de transferencia de recursos por concepto de retenciones", "pdf"),
    REPORTE_RETENCIONES_EF_DESGLOSADO_CUENTA_CONTABLE(32L, "Reporte de retenciones por entidad financiera desglosado por cuenta contable", "pdf"),
    REPORTE_RETENCIONES_DELEGACION(33L, "Reporte de retenciones por delegación", "pdf"),
    CARTA_REINSTALACION(34L, "Carta de Reinstalación", "pdf"),
    CARTA_RECIBO_OPERADOR_EF(35L, "Carta Recibo con firma Operador EF", "pdf"),
    CARTA_RECIBO_TITULAR_DIVISION(36L, "Carta Recibo con firma Titular de la división", "pdf");

    private static final Map<Long, TipoDocumentoEnum> map = new HashMap<>();

    static {
        map.put(RESUMEN_SIMULACION.tipo, RESUMEN_SIMULACION);
        map.put(CARTA_CAPACIDAD_CREDITO.tipo, CARTA_CAPACIDAD_CREDITO);
        map.put(CARTA_INSTRUCCION.tipo, CARTA_INSTRUCCION);
        map.put(IDENTIFICACION_OFICIAL.tipo, IDENTIFICACION_OFICIAL);
        map.put(CONTRATO.tipo, CONTRATO);
        map.put(TABLA_DE_AMORTIZACION_DE_CREDITO.tipo, TABLA_DE_AMORTIZACION_DE_CREDITO);
        map.put(CEP_PENSIONADO.tipo, CEP_PENSIONADO);
        map.put(CEP_ENTIDAD_FINANCIERA.tipo, CEP_ENTIDAD_FINANCIERA);
        map.put(FOTOGRAFIA.tipo, FOTOGRAFIA);
        map.put(COMPROBANTE_DE_DOMICILIO.tipo, COMPROBANTE_DE_DOMICILIO);
        map.put(CARTA_RESPONSIVA.tipo, CARTA_RESPONSIVA);
        map.put(CEP_PENSIONADO_XML.tipo, CEP_PENSIONADO_XML);
        map.put(CEP_ENTIDAD_FINANCIERA_XML.tipo, CEP_ENTIDAD_FINANCIERA_XML);
        map.put(NOTIFICACION.tipo, NOTIFICACION);
        map.put(LOGO.tipo, LOGO);
        map.put(NOTIFICACION_XML.tipo, NOTIFICACION_XML);
        map.put(REPORTE_CONCILIACION_XLSX.tipo, REPORTE_CONCILIACION_XLSX);
        map.put(REPORTE_INCONSISTENCIAS.tipo, REPORTE_INCONSISTENCIAS);

        map.put(REPORTE_DESCUENTOS_EMITIDOS_POR_EF.tipo, REPORTE_DESCUENTOS_EMITIDOS_POR_EF);
        map.put(REPORTE_DESCUENTOS_EMITIDOS_POR_DEL.tipo, REPORTE_DESCUENTOS_EMITIDOS_POR_DEL);
        map.put(REPORTE_INCONSISTENCIAS_PRESTAMOS.tipo, REPORTE_INCONSISTENCIAS_PRESTAMOS);
        map.put(REPORTE_INCONSISTENCIAS_DESCUENTOS.tipo, REPORTE_INCONSISTENCIAS_DESCUENTOS);
        map.put(REPORTE_COMPRAS_CARTERA_EF.tipo, REPORTE_COMPRAS_CARTERA_EF);
        map.put(CAT_MAXIMO.tipo, CAT_MAXIMO);
        map.put(CON_ENT_FIN_PRESTADOR_SERV_CERT.tipo, CON_ENT_FIN_PRESTADOR_SERV_CERT);
        map.put(CON_ENT_FIN_PRESTADOR_SERV_VAL_BIO.tipo, CON_ENT_FIN_PRESTADOR_SERV_VAL_BIO);
        map.put(DETALLE_CONCILIACION.tipo, DETALLE_CONCILIACION);
        map.put(CARTA_RECIBO_SIN_FIRMA.tipo, CARTA_RECIBO_SIN_FIRMA);
        map.put(CARTA_RECIBO_CON_FIRMA.tipo, CARTA_RECIBO_CON_FIRMA);
        map.put(RESUMEN_CONCILIACION.tipo, RESUMEN_CONCILIACION);
        map.put(SOLICITUD_TRANSFERENCIA_RECURSOS_RETENCIONES.tipo, SOLICITUD_TRANSFERENCIA_RECURSOS_RETENCIONES);
        map.put(REPORTE_RETENCIONES_EF_DESGLOSADO_CUENTA_CONTABLE.tipo, REPORTE_RETENCIONES_EF_DESGLOSADO_CUENTA_CONTABLE);
        map.put(REPORTE_RETENCIONES_DELEGACION.tipo, REPORTE_RETENCIONES_DELEGACION);
        map.put(CARTA_REINSTALACION.tipo, CARTA_REINSTALACION);
        map.put(CARTA_RECIBO_OPERADOR_EF.tipo, CARTA_RECIBO_OPERADOR_EF);
        map.put(CARTA_RECIBO_TITULAR_DIVISION.tipo, CARTA_RECIBO_TITULAR_DIVISION);
    }

    @Getter
    final String descripcion;
    @Getter
    Long tipo;
    @Getter
    String media;

    TipoDocumentoEnum(Long tipo, String descripcion, String media) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.media = media;
    }

    @JsonCreator
    public static TipoDocumentoEnum forValue(Long value) {
        return map.get(value);
    }

    @JsonValue
    public Long toValue() {
        for (Map.Entry<Long, TipoDocumentoEnum> entry : map.entrySet()) {
            if (entry.getValue() == this) {
                return entry.getKey();
            }
        }
        return null;
    }
}
