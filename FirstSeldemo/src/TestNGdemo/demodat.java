package TestNGdemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class demodat {
  @Test(dataProvider = "loginData")
  public void testLogin(String username, String password) {
	  
	  System.out.print("username is "+ username);
	  System.out.println("password is"+ password);
	  
  }
  
  
  @DataProvider
  public Object [][] loginData()
  {
	return new Object[][]
			{
		new Object[]{"pav","pas12"},
		new Object[]{"pkum","pas123"},
		new Object[]{"pavlm","pas1234"},
			};
	  
  }
}
