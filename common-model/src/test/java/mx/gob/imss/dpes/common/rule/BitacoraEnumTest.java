/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.common.rule;

import mx.gob.imss.dpes.common.enums.BitacoraEnum;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author antonio
 */
public class BitacoraEnumTest {
  
  public BitacoraEnumTest() {
  }

  @Test
  public void testSomeMethod() {
    
    BitacoraEnum val = BitacoraEnum.forValue(4L);
    System.out.println(val);
    assertNotNull(val);
  }
  
}
