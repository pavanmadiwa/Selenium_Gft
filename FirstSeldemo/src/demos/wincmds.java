package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wincmds {

	public static void main(String[] args) throws InterruptedException  {
				String chromePath= "C:\\Users\\Training_b6b.01.09\\Desktop\\Selenium jars\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", chromePath); 
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("http://seleniumhq.org/");
				driver.manage().window().maximize();
				driver.findElement(By.linkText("Download")).click();
				driver.navigate().back();
				Thread.sleep(0);
				driver.navigate().to("http://google.com");
				driver.navigate().refresh();
				String txt=driver.getTitle();
				System.out.println(txt);
				String url =driver.getCurrentUrl();
				System.out.println(url);

		


	}

}
