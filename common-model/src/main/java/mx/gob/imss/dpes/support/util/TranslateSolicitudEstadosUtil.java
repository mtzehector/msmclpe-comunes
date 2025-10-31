package mx.gob.imss.dpes.support.util;


import java.util.logging.Level;
import java.util.logging.Logger;
//import static javax.ws.rs.sse.SseEventSource.target;
//import static jdk.nashorn.internal.objects.NativeRegExp.source;
import mx.gob.imss.dpes.interfaces.solicitud.model.EstadoSolicitud;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabriel.rios
 */
public class TranslateSolicitudEstadosUtil {
    protected static Logger log = Logger.getLogger(TranslateSolicitudEstadosUtil.class.getName());
    
    
   public static EstadoSolicitud translateEstadoSolicitudSipre(String estado) {
        if(estado!=null){
           estado = estado.trim();
       }
        log.log(Level.INFO, "        >>>TranslateSolicitudEstadosUtil translateEstadoSolicitudSipre estado="+estado);
       
        EstadoSolicitud estadoSolicitud = new EstadoSolicitud();
        switch (estado) {
            case "B":
                estadoSolicitud.setId(7L);
                estadoSolicitud.setDesEstadoSolicitud("Baja Exitosa");
                estadoSolicitud.setDesPensionadoEstadoSolicitud("Baja del Préstamo");
                break;
            case "BE":
                estadoSolicitud.setId(8L);
                estadoSolicitud.setDesEstadoSolicitud("Baja enviada al SPES");
                estadoSolicitud.setDesPensionadoEstadoSolicitud("Baja del Préstamo");
                break;
            case "BF":
                estadoSolicitud.setId(9L);
                estadoSolicitud.setDesEstadoSolicitud("Baja por Improcedencia");
                estadoSolicitud.setDesPensionadoEstadoSolicitud("Baja del Préstamo");
                break;
            case "BL":
                estadoSolicitud.setId(10L);
                estadoSolicitud.setDesEstadoSolicitud("Préstamo Liquidado");
                estadoSolicitud.setDesPensionadoEstadoSolicitud("Préstamo Liquidado");
                break;
            case "BP":
                estadoSolicitud.setId(11L);
                estadoSolicitud.setDesEstadoSolicitud("Baja de Préstamo por defunción o irrecuperable");
                estadoSolicitud.setDesPensionadoEstadoSolicitud("Baja del Préstamo");
                break;
            case "BT":
                estadoSolicitud.setId(12L);
                estadoSolicitud.setDesEstadoSolicitud("Baja por Finiquito");
                estadoSolicitud.setDesPensionadoEstadoSolicitud("Baja del Préstamo");
                break;
            case "ER":
                estadoSolicitud.setId(13L);
                estadoSolicitud.setDesEstadoSolicitud("Préstamo con error al registrarse en SPES");
                estadoSolicitud.setDesPensionadoEstadoSolicitud("Error en Descuento");
                break;
            case "PE":
                estadoSolicitud.setId(14L);
                estadoSolicitud.setDesEstadoSolicitud("Préstamo Enviado a SPES");
                estadoSolicitud.setDesPensionadoEstadoSolicitud("Préstamo enviado a nómina");
                break;
            case "PO":
                estadoSolicitud.setId(15L);
                estadoSolicitud.setDesEstadoSolicitud("Préstamo Otorgado");
                estadoSolicitud.setDesPensionadoEstadoSolicitud("Préstamo en espera del primer descuento");
                break;
            case "RP":
                estadoSolicitud.setId(16L);
                estadoSolicitud.setDesEstadoSolicitud("Préstamo en recuperación");
                estadoSolicitud.setDesPensionadoEstadoSolicitud("Préstamo en Recuperación");
                break;
            default:
                estadoSolicitud.setId(404L);
                estadoSolicitud.setDesEstadoSolicitud("Estado SIPRE desconocido");
                estadoSolicitud.setDesPensionadoEstadoSolicitud("Estado SIPRE desconocido");
                break;

        }
        return estadoSolicitud;
    }
   
   public static EstadoSolicitud translateEstadoSolicitudMclpe(EstadoSolicitud estadoSolicitud) {
        log.log(Level.INFO, "       >>>TranslateSolicitudEstadosUtil translateEstadoSolicitudMclpe estadoSolicitud:getId="+estadoSolicitud.getId());
       switch (estadoSolicitud.getId().intValue()) {
            case 1:
                estadoSolicitud.setId(1L);
                estadoSolicitud.setDesEstadoSolicitud("Iniciado");
                estadoSolicitud.setDesPensionadoEstadoSolicitud("Solicitud Iniciada");
                
                break;
            case 15:
                estadoSolicitud.setId(15L);
                estadoSolicitud.setDesEstadoSolicitud("Por asignar promotor");
                estadoSolicitud.setDesPensionadoEstadoSolicitud("Solicitud Iniciada");
                
                break;
            case 2:
                estadoSolicitud.setId(2L);
                estadoSolicitud.setDesEstadoSolicitud("Por autorizar");
                estadoSolicitud.setDesPensionadoEstadoSolicitud("Documentacion Entregada");
                break;
            case 3:
                estadoSolicitud.setId(3L);
                estadoSolicitud.setDesEstadoSolicitud("Autorizado");
                estadoSolicitud.setDesPensionadoEstadoSolicitud("Autorizado");
                break;
            case 5:
                estadoSolicitud.setId(5L);
                estadoSolicitud.setDesEstadoSolicitud("Pendiente monto para liquidar");
                estadoSolicitud.setDesPensionadoEstadoSolicitud("En Trámite");
                break;
            case 4:
                estadoSolicitud.setId(4L);
                estadoSolicitud.setDesEstadoSolicitud("Anexar comprobante CEP");
                estadoSolicitud.setDesPensionadoEstadoSolicitud("Pendiente de Depósito");
                break;
            default:
                estadoSolicitud.setId(400L);
                estadoSolicitud.setDesEstadoSolicitud("Estado MCLPE desconocido");
                estadoSolicitud.setDesPensionadoEstadoSolicitud("Estado MCLPE desconocido");
                break;

        }
        return estadoSolicitud;
    }
    
}
