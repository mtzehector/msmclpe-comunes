package mx.gob.imss.dpes.support.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public final class MontoUtils {
    private static final int ESCALA = 2;
    private static final RoundingMode MODO_REDONDEO = RoundingMode.HALF_UP;

    private MontoUtils() {}

    public static BigDecimal obtenerBigDecimalZero() {
        return BigDecimal.ZERO.setScale(ESCALA, MODO_REDONDEO);
    }

    public static BigDecimal redondear(BigDecimal monto) {
        if (monto == null)
            return obtenerBigDecimalZero();

        return monto.setScale(ESCALA, MODO_REDONDEO);
    }

    public static BigDecimal safe(BigDecimal val) {
        return val != null ? redondear(val) :
                obtenerBigDecimalZero();
    }

    public static BigDecimal sumar(BigDecimal a, BigDecimal b) {
        return redondear(safe(a).add(safe(b)));
    }

    public static BigDecimal restar(BigDecimal a, BigDecimal b) {
        return redondear(safe(a).subtract(safe(b)));
    }

    public static BigDecimal multiplicar(BigDecimal a, BigDecimal b) {
        return redondear(safe(a).multiply(safe(b)));
    }

    public static BigDecimal dividir(BigDecimal a, BigDecimal b) {
        if (BigDecimal.ZERO.compareTo(safe(b)) == 0)
            throw new ArithmeticException("División por cero no permitida.");

        return redondear(safe(a).divide(b, ESCALA, MODO_REDONDEO));
    }

    public static boolean esPositivo(BigDecimal monto) {
        if (monto == null)
            return false;

        return monto.compareTo(BigDecimal.ZERO) > 0;
    }

    public static boolean esCero(BigDecimal monto) {
        if (monto == null)
            return false;

        return monto.compareTo(BigDecimal.ZERO) == 0;
    }

    public static BigDecimal obtenerBigDecimal(Number numero) {
        if (numero == null)
            return obtenerBigDecimalZero();

        String valor = numero.toString();
        return redondear(new BigDecimal(valor));
    }

    public static double obtenerDouble(Number number) {
        return obtenerBigDecimal(number).doubleValue();
    }

    public static double obtenerDouble(BigDecimal value) {
        if (value == null)
            return obtenerBigDecimalZero().doubleValue();

        BigDecimal bd = redondear(value);
        return bd.doubleValue();
    }

    public static int comparar(BigDecimal a, BigDecimal b) {
        return safe(a).compareTo(safe(b));
    }

}
