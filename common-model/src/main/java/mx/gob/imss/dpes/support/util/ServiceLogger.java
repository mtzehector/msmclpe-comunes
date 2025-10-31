/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.support.util;

import java.util.logging.Level;
import java.util.logging.Logger;
import mx.gob.imss.dpes.interfaces.bitacora.model.BitacoraInterfaz;

/**
 *
 * @author gabriel.rios
 */
public class ServiceLogger {

    protected static Logger log = Logger.getLogger(ServiceLogger.class.getName());
    protected static Long DEFAULT_SERVICE_TYPE = 9L;
    protected static int DESC_LEN = 4000;

    public static BitacoraInterfaz creaObjetoBI(Object request, Object response, String endpoint, boolean isSuccess, Long sesion) {
        BitacoraInterfaz bitacoraInterfaz = new BitacoraInterfaz();
        bitacoraInterfaz.setDescRequest(request.toString());
        bitacoraInterfaz.setEndpoint(endpoint);
        bitacoraInterfaz.setReponseEndpoint(response.toString());
        bitacoraInterfaz.setExito((isSuccess) ? 1 : 0);
        bitacoraInterfaz.setIdSolicitud(1L);
        bitacoraInterfaz.setIdTipoServicio(1L);
        bitacoraInterfaz.setNumTiempoResp(0L);
        if (sesion == null) {
            bitacoraInterfaz.setSesion(0L);
        } else {
            bitacoraInterfaz.setSesion(sesion);
        }
        log.log(Level.INFO, "bitacoraInterfaz JGV {0}", bitacoraInterfaz);

        return bitacoraInterfaz;
    }

    public static BitacoraInterfaz log(Class sourceClass, Class targetClass, Object requestObject, Object responseObject, Long serviceTypeSrc, boolean errorSrc) {
        String source = "";
        String target = "";
        String request;
        String response;
        boolean isError;
        Long serviceType;
        if (sourceClass != null) {
            source = sourceClass.getName();
        }
        if (targetClass != null) {
            target = targetClass.getName();
        }
        request = requestObject.toString();
        response = responseObject.toString();
        isError = errorSrc;
        serviceType = serviceTypeSrc;
        source = substringOfLen(source);
        target = substringOfLen(target);
        request = substringOfLen(request);
        response = substringOfLen(response);

        StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
        int cont = 0;
//        for(StackTraceElement element:stacktrace){
//            log.log(Level.INFO, "           >>>ServiceLogger "+source+" ["+(cont++)+"-] element.class="+element.getClassName()+" element.method="+element.getMethodName());
//        
//        }
        //log.log(Level.INFO, ">>>ServiceLogger source=" + source + " [class=" + stacktrace[3].getClassName() + " method=" + stacktrace[3].getMethodName() + "] ==> target=" + target + " request=" + request + " response=" + response + " isError=" + isError + " serviceType=" + serviceType);
        BitacoraInterfaz bitacoraInterfaz = new BitacoraInterfaz();
        bitacoraInterfaz.setDescRequest("class => " + stacktrace[3].getClassName() + " method=" + stacktrace[3].getMethodName() + "| request=> " + request);
        //bitacoraInterfaz.setDescRespuesta(response);
        bitacoraInterfaz.setReponseEndpoint(response);
        bitacoraInterfaz.setExito(isError ? 0 : 1);
        bitacoraInterfaz.setIdSolicitud(1L);
        bitacoraInterfaz.setIdTipoServicio(serviceType);
        bitacoraInterfaz.setNumTiempoResp(0L);
        bitacoraInterfaz.setSesion(0L);
        return bitacoraInterfaz;
    }

    public static BitacoraInterfaz log(Class sourceClass, Class targetClass, Object requestObject, Object responseObject) {
        return log(sourceClass, targetClass, requestObject, responseObject, DEFAULT_SERVICE_TYPE, false);
    }

    public static BitacoraInterfaz log(Object requestObject, Object responseObject) {
        return log(null, null, requestObject, responseObject, DEFAULT_SERVICE_TYPE, false);
    }

    public static BitacoraInterfaz log(Object requestObject, Object responseObject, Long serviceTypeSrc, boolean isErrorSrc) {
        return log(null, null, requestObject, responseObject, serviceTypeSrc, isErrorSrc);
    }

    public static BitacoraInterfaz log(Object requestObject, Object responseObject, Long serviceTypeSrc) {
        return log(null, null, requestObject, responseObject, serviceTypeSrc, false);
    }

    public static BitacoraInterfaz log(Object requestObject, Object responseObject, boolean isErrorSrc) {
        return log(null, null, requestObject, responseObject, DEFAULT_SERVICE_TYPE, isErrorSrc);
    }

    public static String substringOfLen(String str) {
        if (str != null && str.length() > DESC_LEN) {
            return str.substring(0, DESC_LEN);
        }
        return str;
    }

}
