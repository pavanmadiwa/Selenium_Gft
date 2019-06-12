package TestNGdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertex {

	

	public static void main(String[] args) {
		String chromePath= "C:\\Users\\Training_b6b.01.09\\Desktop\\Selenium jars\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("nshuyx345");
		driver.findElement(By.name("password")).sendKeys("pavab");
		driver.findElement(By.name("btnLogin")).submit();
		
		Alert alr = driver.switchTo().alert();
		String alrmsg = driver.switchTo().alert().getText();
		
		System.out.println("alrmsg");
		
		alr.accept();
		
		alr.dismiss();
		                                        	
		

	}

}
