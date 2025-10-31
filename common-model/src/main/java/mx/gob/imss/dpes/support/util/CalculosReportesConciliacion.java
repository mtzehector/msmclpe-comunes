package mx.gob.imss.dpes.support.util;

import mx.gob.imss.dpes.common.constants.Constantes;
import mx.gob.imss.dpes.interfaces.entidadfinanciera.model.ReporteEFPorCuentaContable;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculosReportesConciliacion {

    /*
    public static BigDecimal obtenerImporteCostoAdministrativo(BigDecimal importeTotalRecuperado){
        if (importeTotalRecuperado != null && importeTotalRecuperado.doubleValue() > 0){
            BigDecimal resultado = new BigDecimal(Constantes.PORCENTAJE_COSTO_ADMINISTRATIVO).divide(new BigDecimal(Constantes.CIEN));
            return resultado.multiply(importeTotalRecuperado).setScale(2, RoundingMode.HALF_UP);
        }
        return new BigDecimal(0.0);
    }
     */

    /*
    public static BigDecimal obtenerImporteIva(BigDecimal importeCostoAdministrativo){
        if (importeCostoAdministrativo != null && importeCostoAdministrativo.doubleValue() > 0){
            BigDecimal resultado = new BigDecimal(Constantes.IVA).divide(new BigDecimal(Constantes.CIEN));
            return resultado.multiply(importeCostoAdministrativo).setScale(2, RoundingMode.HALF_UP);
        }
        return new BigDecimal(0.0);
    }
    */

    public static BigDecimal obtenerImporteTasa(BigDecimal tasa, BigDecimal importe){
        if (tasa != null && tasa.doubleValue() >= 0 && importe != null && importe.doubleValue() >= 0) {
            return tasa.multiply(importe).setScale(2, RoundingMode.HALF_UP);
        }
        return new BigDecimal(0.0);
    }

    /*
    public static BigDecimal obtenerImporteBruto(BigDecimal importeTotalRecuperado, BigDecimal importeCostoAdministrativo, BigDecimal importeIva){
        if ( (importeTotalRecuperado != null && importeTotalRecuperado.doubleValue() > 0) &&
                (importeCostoAdministrativo != null && importeCostoAdministrativo.doubleValue() > 0) &&
                (importeIva != null && importeIva.doubleValue() > 0) ){
            return importeTotalRecuperado.subtract(importeCostoAdministrativo)
                    .subtract(importeIva)
                    .setScale(2,RoundingMode.HALF_UP);
        }
        return new BigDecimal(0.0);
    }
    */

    public static BigDecimal obtenerImporteBruto(BigDecimal importeTotalRecuperado,
        BigDecimal importeCostoAdministrativo, BigDecimal importeIVACostoAdministrativo,
        BigDecimal importePermisoItinerante, BigDecimal importeIVAPermisoItinerante) {
        if (
            (importeTotalRecuperado != null && importeTotalRecuperado.doubleValue() >= 0) &&
            (importeCostoAdministrativo != null && importeCostoAdministrativo.doubleValue() >= 0) &&
            (importeIVACostoAdministrativo != null && importeIVACostoAdministrativo.doubleValue() >= 0) &&
            (importePermisoItinerante != null && importePermisoItinerante.doubleValue() >= 0) &&
            (importeIVAPermisoItinerante != null && importeIVAPermisoItinerante.doubleValue() >= 0)
        ) {
            return importeTotalRecuperado.subtract(importeCostoAdministrativo)
                    .subtract(importeIVACostoAdministrativo)
                    .subtract(importePermisoItinerante)
                    .subtract(importeIVAPermisoItinerante)
                    .setScale(2,RoundingMode.HALF_UP);
        }
        return new BigDecimal(0.0);
    }

    public static BigDecimal obtenerImporteNeto(BigDecimal importeBruto, BigDecimal importeCobradoDemasia){
        if ( (importeBruto != null && importeBruto.doubleValue() >= 0) && (importeCobradoDemasia != null && importeCobradoDemasia.doubleValue() >= 0)  )
            return importeBruto.subtract(importeCobradoDemasia).setScale(2, RoundingMode.HALF_UP);

        return new BigDecimal(0.0);
    }

    /*
    public static BigDecimal obtenerImporteNetoPagar(ReporteEFPorCuentaContable source){

        BigDecimal retencion = source.getRETENCIONNACIONAL() == null ? new BigDecimal("0") : source.getRETENCIONNACIONAL();
        BigDecimal costoAdmin = source.getCOSTOADMINISTRATIVO() == null? new BigDecimal("0") : source.getCOSTOADMINISTRATIVO();
        BigDecimal ivaCostoAdmin = source.getIVACOSTOADMINISTRATIVO() == null ? new BigDecimal("0") : source.getIVACOSTOADMINISTRATIVO();
        BigDecimal costoItinerante = source.getCOSTOPERMISOITINERANTE() == null ? new BigDecimal("0") : source.getCOSTOPERMISOITINERANTE();
        BigDecimal ivaCostoItinerante = source.getIVACOSTOPERMISOITINERANTE() == null ? new BigDecimal("0") : source.getIVACOSTOPERMISOITINERANTE();
        BigDecimal recuperacionFallecidos = source.getRECUPERACIONFALLECIDOS() == null ? new BigDecimal("0") : source.getRECUPERACIONFALLECIDOS();

        return retencion.subtract(costoAdmin)
                 .subtract(ivaCostoAdmin)
                 .subtract(costoItinerante)
                 .subtract(ivaCostoItinerante)
                 .subtract(recuperacionFallecidos)
                .setScale(2, RoundingMode.HALF_UP);
    }

     */
}
