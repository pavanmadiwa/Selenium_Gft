package demos;

import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class demo1 {

	public static void main(String[] args) {
		String ChromePath = "C:\\Users\\Training_b6b.01.09\\Desktop\\Selenium jars\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		//opening link
		driver.findElement(By.xpath("//a[contains(@href,'login')]")).click();
		driver.findElement(By.name("Email")).sendKeys("pa@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Password123");
	
		//driver.findElement(By.xpath("//input[@value,'Log in']")).click();
		driver.findElement(By.cssSelector("input[value=\"Log in\"]")).click();
		//driver.findElement(By.xpath("//input[@value='Log in']"));
		//driver.findElement(By.cssSelector("input[css=".login-button"]"));
		//String exp = "Demo Web Shop";
		//String act = driver.getTitle();
		//Assert.assertEquals(act,exp);	
		
		//closing link
		driver.findElement(By.xpath("//a[contains(@href,'logout')]")).click();
		driver.close();
		
    }

		
		
	}


