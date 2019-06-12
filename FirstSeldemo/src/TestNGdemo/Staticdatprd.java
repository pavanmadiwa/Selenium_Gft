package TestNGdemo;

import org.testng.annotations.Test;

public class Staticdatprd {
  @Test(dataProvider = "dp", dataProviderClass = datapvd2.class)
  public void test1(Integer a, String a1) {
	  System.out.println("test is: Data(" + a + ","+ "String is"+" - "+a1+")");
  }
  @Test(dataProvider = "dp1", dataProviderClass = datapvd2.class)
  public void test2(Integer p, String p1) {
	  System.out.println("test is: Data(" + p + ","+ "String is"+" - "+p1+")");
  }
}
