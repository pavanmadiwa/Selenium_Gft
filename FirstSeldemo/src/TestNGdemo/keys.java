package TestNGdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class keys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String chromePath= "C:\\Users\\Training_b6b.01.09\\Desktop\\Selenium jars\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement search = driver.findElement(By.cssSelector("input[value='Search store']"));
		Actions act = new Actions(driver);
		act.keyDown(search,Keys.SHIFT).sendKeys("computer").keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Assert.assertTrue(driver.getTitle().contains("Build your own expensive computer"));
		driver.close();
		

	}

}
