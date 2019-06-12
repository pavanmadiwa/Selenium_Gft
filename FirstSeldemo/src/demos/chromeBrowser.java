package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class chromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String chromePath= "C:\\Users\\Training_b6b.01.09\\Desktop\\Selenium jars\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement Fname =  driver.findElement(By.name("firstName"));
		Fname.sendKeys("pav");
		Fname.getText();
		WebElement Lname =  driver.findElement(By.name("lastName"));
		Lname.sendKeys("kum");
		Lname.getText();                                               
		driver.findElement(By.name("phone")).sendKeys("123446");
		driver.findElement(By.id("userName")).sendKeys("p@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("smg,kar");
		driver.findElement(By.name("city")).sendKeys("smg");
		driver.findElement(By.name("state")).sendKeys("kar");
		driver.findElement(By.name("postalCode")).sendKeys("77846");
		Select sel = new Select(driver.findElement(By.name("country")));
		//sel.selectByVisibleText("INDIA");
		//sel.selectByValue("92");
		sel.selectByIndex(120);
		driver.findElement(By.name("email")).sendKeys("p@gmail.com");
		driver.findElement(By.name("password")).sendKeys("pav");
		driver.findElement(By.name("confirmPassword")).sendKeys("pav");
		driver.findElement(By.name("register")).click();
		
		//WebElement home = driver.findElement(By.linkText("register"));
		//String txt = home.getText();
		//System.out.println(txt);
		
		

	}

}
