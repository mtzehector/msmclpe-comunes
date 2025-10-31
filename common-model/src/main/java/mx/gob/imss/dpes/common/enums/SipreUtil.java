/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.common.enums;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabriel.rios
 */
public class SipreUtil {

    protected static final Logger log = Logger.getLogger(SipreUtil.class.getName());

    private static final Map<Long, String> sipreMclpeMap = new HashMap<>();

    static {
        sipreMclpeMap.put(TipoEstadoSolicitudEnum.INICIADO.getTipo(), "S");
        sipreMclpeMap.put(TipoEstadoSolicitudEnum.AUTORIZADO.getTipo(), "A");
        sipreMclpeMap.put(TipoEstadoSolicitudEnum.BAJA_LIQUIDACION_ANTICIPADA.getTipo(), "B");
        sipreMclpeMap.put(TipoEstadoSolicitudEnum.BAJA_IMPROCEDENCIA.getTipo(), "B");
        sipreMclpeMap.put(TipoEstadoSolicitudEnum.CANCELADO.getTipo(), "C");
        sipreMclpeMap.put(TipoEstadoSolicitudEnum.PRESTAMO.getTipo(), "SP");
        sipreMclpeMap.put(TipoEstadoSolicitudEnum.PRESTAMO_RECUPERACION.getTipo(), "RP");

    }

    public SipreUtil() {

    }

    public static String getSipreStatusByTipoEstadoSolicitud(Long tipoEstadoSolicitud) {
        return sipreMclpeMap.get(tipoEstadoSolicitud);
    }

}
