/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.common.rule;

import javax.ws.rs.ext.Provider;
import lombok.Getter;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author antonio
 */
@Provider
public class MontoTotalRule extends BaseRule<MontoTotalRule.Input, MontoTotalRule.Output>{
  
  
  public static double calculaSumatoria( double catInicial, double pagoMensual, int numeroPagos){
    double suma = 0;
    for(double i=1; i<=numeroPagos; i++ ){       
      double part = Math.pow( catInicial , i / 12 );                
      suma = suma + pagoMensual/part;
    }
    return suma;
  }
  
  @Override
  public Output apply(Input input) {
    double suma = calculaSumatoria(input.cat+1, input.pagoMensual, input.numeroPagos);
    return new Output( Math.round(suma*100)/100d );
  }

  public class Input extends BaseModel{
    
    @Getter private final transient double pagoMensual; 
    @Getter private final transient int numeroPagos; 
    @Getter private final transient double cat;

    public Input( double pagoMensual, int numeroPagos, double cat ) {
      this.pagoMensual = pagoMensual;
      this.numeroPagos = numeroPagos;
      this.cat = cat;
    }
  }

  public class Output extends BaseModel{

    @Getter private final transient double monto;
    public Output(double monto) {
      this.monto = monto;
    }
  }
}
