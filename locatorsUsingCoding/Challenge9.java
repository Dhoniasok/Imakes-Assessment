package locatorsUsingCoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Challenge9 {
	public static void main(String[] args) throws InterruptedException {
	 WebDriverManager.chromedriver().setup();
		// Launch browser
		 WebDriver driver=new ChromeDriver();
		 // get 
		 driver.get("https://www.flipkart.com/");
		 // manage and maximize the window
		 driver.manage().window().maximize();
		 // Click login
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@href='/account/login?ret=/']")).click();
		 // Enter user name
			WebElement ele1= driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			ele1.sendKeys("viratashok@1997");
		 // Enter password
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("8967564356");
}
	}

