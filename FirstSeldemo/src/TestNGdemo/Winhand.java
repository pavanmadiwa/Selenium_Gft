package TestNGdemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Architecture;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Winhand {

	public static void main(String[] args) {
		String chromePath= "C:\\Users\\Training_b6b.01.09\\Desktop\\Selenium jars\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//a[contains(text(),'Click Here')]")).click();
		
		//handlers
		
		String Mainwind = driver.getWindowHandle();
		System.out.println("Main window no is"+Mainwind);
		
		//New window
		Set<String> s1 = driver.getWindowHandles();
		for(String string : s1) {
			String chldwind = string;
			System.out.println("child window no is:"+chldwind);
			
			driver.switchTo().window(chldwind);
		}                               
		
		driver.findElement(By.name("emailid")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		//Back to main window
		driver.switchTo().window(Mainwind);
		

	}

}
