package demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firePath = "C:\\Users\\Training_b6b.01.09\\Desktop\\Selenium jars\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",firePath);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");

	}

}
