/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.reportes.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author juan.garfias
 */
public class PrestamoRecuperacionCompraCarteraEF extends BaseModel {

    @Getter
    @Setter
    String nombreComercial;
    @Getter
    @Setter
    String numeroDeProveedor;
    @Getter
    @Setter
    Date emision;
    @Getter
    @Setter
    String folio;
    @Getter
    @Setter
    String nss;
    @Getter
    @Setter
    String curp;
    @Getter
    @Setter
    String nombreCompleto;
    @Getter
    @Setter
    Double importe;
    @Getter
    @Setter
    Double descuento;
    @Getter
    @Setter
    Integer numDescuento;
    @Getter
    @Setter
    Double importeLiquidado;
    @Getter
    @Setter
    Double cat;
}
