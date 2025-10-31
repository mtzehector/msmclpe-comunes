/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.support.util;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author gabriel.rios
 */
public class DateUtils {
    protected static Logger log = Logger.getLogger(DateUtils.class.getName());
    
    
    public static Date calcularFechaLimite(List<Date> diasFestivos, Calendar calAux, Integer horasParaAniadir) {
        log.log(Level.INFO,">>><<<DateUtils.calcularFechaLimite horasParaAniadir=" + horasParaAniadir);

        Integer horasAniadidas = 0;
        
        // Genera mapa de días inhabiles
        Map<String, Date> fechasStringMap = mapFechaUtil(diasFestivos);

        log.log(Level.INFO,"Fechas Map : " + fechasStringMap.toString());

        // Inicia ciclo para asignar tiempo limite
        while (horasAniadidas <= horasParaAniadir) {
            // Valida si ya se excedió el tiempo añadido
            if (horasAniadidas >= horasParaAniadir) {
                break;
            }
            // Se añade un día
            calAux.add(Calendar.HOUR, 24);

            log.log(Level.INFO,"    Fecha parcial : " + calAux.getTime());

            // Se valida si el día esta entre Lunea a Viernes
            int dow = calAux.get(Calendar.DAY_OF_WEEK);
            boolean isWeekday = ((dow >= Calendar.MONDAY) && (dow <= Calendar.FRIDAY));
            log.log(Level.INFO,"    HORAS AÑADIDAS : " + horasAniadidas + " / " + horasParaAniadir);

            // Valida si es día entre semana
            if (isWeekday) {

                SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
                String dateAux = sdf.format(calAux.getTime());

                // Valida si no es día festivo
                if (!fechasStringMap.containsKey(dateAux)) {
                    log.log(Level.INFO,"Entre Semana: " + calAux.getTime());
                    // se registran las horas añadidas
                    horasAniadidas += 24;
                }

            } else {
                // Es fin de semana
                log.log(Level.INFO,"            FIN DE SEMANA: " + calAux.getTime());
            }
        }
        return calAux.getTime();
    }

    public static Map<String, Date> mapFechaUtil(List<Date> fechas) {
        Map<String, Date> fechasMap = new HashMap<>();
        for (Date d : fechas) {

            SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
            String date = sdf.format(d);

            fechasMap.put(date, d);
        }
        return fechasMap;
    }
    
    public static String numeroDeMesALetra (int mesPeticion) {
        Locale lugar = new Locale("es", "ES");
        Month mes = Month.of(mesPeticion);
        return mes.getDisplayName(TextStyle.FULL, lugar);
    }
    
}
