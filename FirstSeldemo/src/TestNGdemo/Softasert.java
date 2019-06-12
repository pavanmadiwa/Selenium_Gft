package TestNGdemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softasert {
  @Test
  public void met1() {
    SoftAssert sa = new SoftAssert();
    System.out.println("Checking 1 validation");
    sa.assertEquals(10,10);
    
    System.out.println("Checking 2 validation");
    sa.assertEquals("Hello","Hell");
    
    sa.assertAll();
  }
}
