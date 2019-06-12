package demos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demo2 {
		public static void main(String[] args) {
			String ChromePath = "C:\\Users\\Training_b6b.01.09\\Desktop\\Selenium jars\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", ChromePath);
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://demowebshop.tricentis.com/");
			driver.manage().window().maximize();
			String exp = "Demo Web Shop";
			String act = driver.getTitle();
			Assert.assertEquals(act, exp);
			List<WebElement> linklist = driver.findElements(By.tagName("a"));
			System.out.println("number of links:"+linklist.size());
			for(WebElement link:linklist)
			{
				System.out.println(link.getText()+":"+link.getAttribute("href"));
			}
			
}
}