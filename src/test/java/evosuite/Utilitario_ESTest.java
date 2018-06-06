/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 06 17:43:19 GMT 2018
 */

package evosuite;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.andreendo.testgenerationexamples.ex1.Extremos;
import com.github.andreendo.testgenerationexamples.ex1.Utilitario;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Utilitario_ESTest extends Utilitario_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Utilitario utilitario0 = new Utilitario();
      int[] intArray0 = new int[1];
      intArray0[0] = 3658;
      Extremos extremos0 = utilitario0.acharExtremos(intArray0);
      assertEquals(3658, extremos0.getMenor());
      assertEquals(0, extremos0.getIndiceMaior());
      assertEquals(0, extremos0.getIndiceMenor());
      assertEquals(3658, extremos0.getMaior());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Utilitario utilitario0 = new Utilitario();
      int[] intArray0 = new int[1];
      intArray0[0] = (-1);
      Extremos extremos0 = utilitario0.acharExtremos(intArray0);
      assertEquals((-1), extremos0.getMenor());
      assertEquals((-1), extremos0.getMaior());
      assertEquals(0, extremos0.getIndiceMaior());
      assertEquals(0, extremos0.getIndiceMenor());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Utilitario utilitario0 = new Utilitario();
      int[] intArray0 = new int[13];
      intArray0[7] = 155;
      Extremos extremos0 = utilitario0.acharExtremos(intArray0);
      assertEquals(7, extremos0.getIndiceMaior());
      assertEquals(155, extremos0.getMaior());
      assertEquals(0, extremos0.getIndiceMenor());
      assertEquals(0, extremos0.getMenor());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Utilitario utilitario0 = new Utilitario();
      int[] intArray0 = new int[13];
      intArray0[9] = (-20);
      Extremos extremos0 = utilitario0.acharExtremos(intArray0);
      assertEquals(9, extremos0.getIndiceMenor());
      assertEquals((-20), extremos0.getMenor());
      assertEquals(0, extremos0.getMaior());
      assertEquals(0, extremos0.getIndiceMaior());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Utilitario utilitario0 = new Utilitario();
      int[] intArray0 = new int[0];
      try { 
        utilitario0.acharExtremos(intArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // vetor com zero elementos
         //
         verifyException("com.github.andreendo.testgenerationexamples.ex1.Utilitario", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Utilitario utilitario0 = new Utilitario();
      try { 
        utilitario0.acharExtremos((int[]) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // vetor nao pode ser nulo
         //
         verifyException("com.github.andreendo.testgenerationexamples.ex1.Utilitario", e);
      }
  }
}
