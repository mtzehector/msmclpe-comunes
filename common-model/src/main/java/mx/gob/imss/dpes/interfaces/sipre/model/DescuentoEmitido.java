/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.sipre.model;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;
/**
 *
 * *       "nss":"01735274753",
   *       "idGrupoFamiliar":"01",
   *       "movimiento":"NA",
   *       "delegacion":"15",
   *       "impRecuperado":1044.0,
   *       "aplicacionPeriodo":"201407",
   *       "idSolPrestFinanciero":"000076038",
   *       "idInstFincanciera":"001",
   *       "conceptoNomina":"301"
   
 * @author antonio
 */
public class DescuentoEmitido extends BaseModel{
  @Getter @Setter private String nss;
  @Getter @Setter private String idGrupoFamiliar;
  @Getter @Setter private String movimiento;
  @Getter @Setter private String delegacion;
  @Getter @Setter private Double impRecuperado;
  @Getter @Setter private String aplicacionPeriodo;
  @Getter @Setter private String idSolPrestFinanciero;
  @Getter @Setter private String idInstFincanciera;
  @Getter @Setter private String conceptoNomina;
    @Getter @Setter private String idNss;
    @Getter @Setter private String numMensualidad;
    @Getter @Setter private String numFolioSolicitud;
    
    
    public DescuentoEmitido() {
    }

    public DescuentoEmitido(String nss, String idGrupoFamiliar, String movimiento, String delegacion, Double impRecuperado, String aplicacionPeriodo, String idSolPrestFinanciero, String idInstFincanciera, String conceptoNomina) {
        this.nss = nss;
        this.idGrupoFamiliar = idGrupoFamiliar;
        this.movimiento = movimiento;
        this.delegacion = delegacion;
        this.impRecuperado = impRecuperado;
        this.aplicacionPeriodo = aplicacionPeriodo;
        this.idSolPrestFinanciero = idSolPrestFinanciero;
        this.idInstFincanciera = idInstFincanciera;
        this.conceptoNomina = conceptoNomina;
    }

    public DescuentoEmitido(String nss, String idGrupoFamiliar, String movimiento, String delegacion, Double impRecuperado, String aplicacionPeriodo, String idSolPrestFinanciero, String idInstFincanciera, String conceptoNomina, String idNss, String numMensualidad, String numFolioSolicitud) {
        this.nss = nss;
        this.idGrupoFamiliar = idGrupoFamiliar;
        this.movimiento = movimiento;
        this.delegacion = delegacion;
        this.impRecuperado = impRecuperado;
        this.aplicacionPeriodo = aplicacionPeriodo;
        this.idSolPrestFinanciero = idSolPrestFinanciero;
        this.idInstFincanciera = idInstFincanciera;
        this.conceptoNomina = conceptoNomina;
        this.idNss = idNss;
        this.numMensualidad = numMensualidad;
        this.numFolioSolicitud = numFolioSolicitud;
    }
    
}
