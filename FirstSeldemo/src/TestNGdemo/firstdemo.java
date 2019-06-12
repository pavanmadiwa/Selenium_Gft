package TestNGdemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class firstdemo {
	
	@BeforeClass
	public void openBrowser()
	{
		System.out.println("opening browser for running application");
	}
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("closing the browser");
	}
	@BeforeMethod
	public void Home()
	{
		System.out.println("directing to homepage");
	}
	@AfterMethod
	public void signout()
	{
		System.out.println("signing out ");
	}
	@Test(priority = 200)
	public void run1()
	{
		System.out.println("Hi, u r inside run1");
		
	}
	@Test(priority = 100,enabled = false)
	public void run2() 
	{
		System.out.println("hey, u r inside run2");
	}
	@Test(priority = 300)
	public void run3() 
	{
		System.out.println("hey man, u  r inside run3");
	}
	@Test(priority = 50)
	public void run4()
	{
		System.out.println("Hoo ,finally u r finished");
	}
 
}
