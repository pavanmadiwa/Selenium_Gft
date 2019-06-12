package TestNGdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromePath= "C:\\Users\\Training_b6b.01.09\\Desktop\\Selenium jars\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[@href='/electronics']"))).perform();
		act.moveToElement(driver.findElement(By.xpath("//a[@href='/camera-photo']"))).click().build().perform();
		
		
		
		

	}

}
