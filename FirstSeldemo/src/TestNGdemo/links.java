package TestNGdemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromePath= "C:\\Users\\Training_b6b.01.09\\Desktop\\Selenium jars\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println("number of links:"+linklist.size());
		for(WebElement link:linklist) {
			System.out.println(link.getText()+":"+link.getAttribute("href"));
		}
		driver.close();

	}

}
