package demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class StartIEBrowser {
	public static void main(String[] args) {
		
		String  iePath = "C:\\Users\\Training_b6b.01.09\\Desktop\\Selenium jars\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver",iePath);
		WebDriver driver = new InternetExplorerDriver();
	
		driver.get("http://google.co.in/");	
	
	}

}
