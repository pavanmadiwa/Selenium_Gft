package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		String chromePath= "C:\\Users\\Training_b6b.01.09\\Desktop\\Selenium jars\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath); 
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.demoaut.com/");
		
		driver.findElement(By.xpath("//td[2]/input")).sendKeys("mercury");
		driver.findElement(By.xpath("//tr[3]/td[2]/input")).sendKeys("mercury");
		driver.findElement((By.xpath("//div/input"))).click();
		driver.findElement(By.xpath("//a[contains(@href,'mercurywelcome.php')]")).click();

	}

}
