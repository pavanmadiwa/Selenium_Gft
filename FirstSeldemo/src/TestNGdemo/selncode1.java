package TestNGdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class selncode1 {
	 String chromePath= "C:\\Users\\Training_b6b.01.09\\Desktop\\Selenium jars\\chromedriver.exe";
	 public String Url = "http://newtours.demoaut.com/";
	 public WebDriver driver;
  @Test
  public void homepage()
  {
		 driver = new ChromeDriver();
		 driver.get(Url);
		 String exp = "Welcome: Mercury Tours";
		 String act = driver.getTitle();
		 Assert.assertEquals(act, exp);	 
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("open the source");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("stand still");
  }

  @BeforeClass
 public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", chromePath); 
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
