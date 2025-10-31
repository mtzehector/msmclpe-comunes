/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.common.rule;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author antonio
 */
public class CatRuleTest {
  
  public CatRuleTest() {
  }

  @Test
  public void testSomeMethod() {
    
    CatRule rule = new CatRule();
    
    CatRule.Input input = rule.new Input(4000,12,406.11);
    
    CatRule.Output output = rule.apply(input);
    
    System.out.println( output.getCat() );
    
  }
  
}
