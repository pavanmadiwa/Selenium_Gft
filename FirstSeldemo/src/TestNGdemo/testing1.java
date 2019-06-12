package TestNGdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class testing1 {
	String chromePath= "C:\\Users\\Training_b6b.01.09\\Desktop\\Selenium jars\\chromedriver.exe";
	 public String Url = "http://newtours.demoaut.com/";
	
	 //public String Url3=""
	 public WebDriver driver;
  @Test(priority = 1)
  public void regpage() {
	  
	  driver.findElement(By.linkText("REGISTER")).click();
		 String exp = "Register: Mercury Tours";
		
		 String act = driver.getTitle();
		 Assert.assertEquals(act, exp); 
		 driver.close();
  }
  @Test(priority = 2)
  public void supptpage()
  {
	  driver.findElement(By.linkText("SUPPORT")).click();
	  String exp = "Under Construction: Mercury Tours";
		 String act = driver.getTitle();
		 Assert.assertEquals(act, exp); 
		 driver.close();
  }
  @Test(priority = 3)
  public void contact()
  { 
	  driver.findElement(By.linkText("CONTACT")).click();
	  String exp = "Under Construction: Mercury Tours";
	 String act = driver.getTitle();
	 Assert.assertEquals(act, exp);  
	 
  }
  
  @BeforeMethod
  public void homepage()
  {   
	  driver = new ChromeDriver();
		 driver.get(Url);
		 //String exp = "Welcome: Mercury Tours";
		 //String act = driver.getTitle();
		 //Assert.assertEquals(act, exp);
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


