/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.common.rule;

import lombok.Getter;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author antonio
 */
public class CatRule extends BaseRule<CatRule.Input, CatRule.Output>{
  
  private static final double PRECISION = 0.001;
  private static final double PASO = 0.1;
  private static final int MAX = 1000;
  private static final double CAT_INICIAL = 1.5;
  
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
    double catInicial = CAT_INICIAL;
    int iteracion = 1;
    int escala = 0;
    double diferencia;
    double suma;
    boolean sumar = true;
    do{
      suma = calculaSumatoria(catInicial, input.pagoMensual, input.numeroPagos);
      diferencia = input.prestamo-suma;        
      if( diferencia < 0 ){
        if( sumar ){
          escala++;
          sumar = false;
        }
        catInicial += PASO / Math.pow(2,escala);
      }else{
        if( !sumar ){
          escala++;
          sumar = true;
        }
        catInicial -= PASO / Math.pow(2,escala);
      }
      iteracion++;
    }
    while( iteracion < MAX && Math.abs( diferencia ) >= PRECISION );


    return new Output( Math.round( (catInicial - 1)*10000 ) /10000d );
  }

  public class Input extends BaseModel{
    
    @Getter private final double prestamo; 
    @Getter private final int numeroPagos; 
    @Getter private final double pagoMensual;

    public Input( double prestamo, int numeroPagos, double pagoMensual ) {
      this.prestamo = prestamo;
      this.numeroPagos = numeroPagos;
      this.pagoMensual = pagoMensual;
    }
  }

  public class Output extends BaseModel{

    @Getter private final double cat;
    public Output(double cat) {
      this.cat = cat;
    }
  }
}
