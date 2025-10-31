package mx.gob.imss.dpes.common.enums;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public enum SelloElectronicoEnum {

  NSS(1L,"Numero de Seguridad Social(NSS)"),
  FOLIOPRESTAMO(2L,"Folio del prestamo(FP)"),
  FECSOLICITUDPRESTAMO(3L,"Fecha de solicitud del prestamo(SP)"),
  TIPOCREDITO(4L,"Tipo de Credito Solicitado(TC)"),
  NUM_SEQ_NOTARIA(5L,"idSello"),
  REF_SELLO_DIGITAL(6L, "sello"),
  REF_CADENA_ORIGINAL(7L,"Cadena original" ),
  REF_NUM_SERIE_CERTIFICADO(8L, "noSerieSello"),
  FEC_INICIO_VIGENCIA_CERT(9L, "Fecha inicio de vigencia certificado"),
  FEC_FIN_VIGENCIA_CERT(10L, "Fecha inicio de vigencia certificado"),
  RFC(11L,"rfc");

  private static final Map<Long, SelloElectronicoEnum> map = new HashMap<>();

  static {
    map.put(NSS.tipo,NSS);
    map.put(FOLIOPRESTAMO.tipo,FOLIOPRESTAMO);
    map.put(FECSOLICITUDPRESTAMO.tipo, FECSOLICITUDPRESTAMO);
    map.put(TIPOCREDITO.tipo,TIPOCREDITO);
    map.put(NUM_SEQ_NOTARIA.tipo,NUM_SEQ_NOTARIA);
    map.put(REF_SELLO_DIGITAL.tipo,REF_SELLO_DIGITAL);
    map.put(REF_CADENA_ORIGINAL.tipo,REF_CADENA_ORIGINAL);
    map.put(REF_NUM_SERIE_CERTIFICADO.tipo,REF_NUM_SERIE_CERTIFICADO);
    map.put(FEC_INICIO_VIGENCIA_CERT.tipo, FEC_INICIO_VIGENCIA_CERT);
    map.put(FEC_FIN_VIGENCIA_CERT.tipo, FEC_FIN_VIGENCIA_CERT);
    map.put(RFC.tipo, RFC);
  }

  @Getter
  final String descripcion;
  @Getter
  Long tipo;

  SelloElectronicoEnum(Long tipo, String descripcion) {
    this.tipo = tipo;
    this.descripcion = descripcion;
  }

  public static SelloElectronicoEnum forValue(Long value){return map.get(value);}

  public Long toValue(){
    for (Map.Entry<Long, SelloElectronicoEnum> entry : map.entrySet()) {
      if(entry.getValue() == this)
        return entry.getKey();
    }
    return null;
  }
}
