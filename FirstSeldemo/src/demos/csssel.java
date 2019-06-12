package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class csssel {

	public static void main(String[] args) {
		String chromePath= "C:\\Users\\Training_b6b.01.09\\Desktop\\Selenium jars\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath); 
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.demoaut.com/");
		
		
		driver.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("mercury");
		driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("mercury");
		driver.findElement(By.cssSelector("input[name=\"login\"]")).click();
		
		driver.findElement(By.cssSelector("a[href ='mercurywelcome.php']")).click();

	}

}
