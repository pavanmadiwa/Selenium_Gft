package TestNGdemo;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class datapvd2 {
  @Test(dataProvider = "dp1")
  public void Dat(Integer age, String name)
	{
		System.out.print("age is"+" "+age + "/");
		System.out.println("name is"+" "+name);
	
}


  @DataProvider
  public static Object[][] dp() {
    return new Object[][] {{25,"PAV"}};
    }
  public static Object[][] dp1() {
	    return new Object[][] {{26,"pavan"}};
	    }
  
  }

