package demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class method1 {

	public static WebDriver getDriver(String name) {
	
		if(name=="IE")
		{
		String  iePath = "C:\\Users\\Training_b6b.01.09\\Desktop\\Selenium jars\\IEDriverServer.exe";
	    System.setProperty("webdriver.ie.driver",iePath);
		WebDriver driver = new InternetExplorerDriver();
	
		driver.get("http://google.co.in/");

		}
		else if(name=="gc")
		{
			String chromePath= "C:\\Users\\Training_b6b.01.09\\Desktop\\Selenium jars\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chromePath);
			WebDriver driver = new ChromeDriver();
			driver.get("https://google.com");
		}
		
		else if(name=="fire")
		{
			String firePath = "C:\\Users\\Training_b6b.01.09\\Desktop\\Selenium jars\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver",firePath);
			WebDriver driver = new FirefoxDriver();
			driver.get("https://google.com");

		}
		else
		{
			System.out.println("No Browser selected");
		}
		return null;
		
	
	}

}
