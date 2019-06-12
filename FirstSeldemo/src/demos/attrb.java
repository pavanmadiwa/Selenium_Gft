package demos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class attrb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromePath= "C:\\Users\\Training_b6b.01.09\\Desktop\\Selenium jars\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath); 
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.MINUTES);
		driver.get("http://www.demoaut.com");
	    WebElement Unme = driver.findElement(By.name("userName"));
	   Unme.sendKeys("mercury");
	   String txt = Unme.getAttribute("value");
	   System.out.println(txt);
	   WebElement pwd = driver.findElement(By.name("password"));
	   pwd.sendKeys("mercury");
	   String txt1 = pwd.getAttribute("value");
	   System.out.println(txt1);
	   driver.findElement(By.name("password")).clear();
	  driver.findElement(By.name("login")).click();
	  
	    
	}

}
