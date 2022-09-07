package actionUsingcoding;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Challenge16 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//Disable notifications in sites
		 ChromeOptions options=new ChromeOptions();
		 options.addArguments("--disable-notifications");
		 //Launch browser
		 ChromeDriver driver=new ChromeDriver(options);  
		 //get 
		 driver.get("https://www.flipkart.com");
		 //manage and maximize the window
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 // Perform Action
		 Thread.sleep(2000);
		 Actions ele =new Actions(driver);
		 // click Top offers
		 driver.findElement(By.xpath("(//div[@class='xtXmba'])[1]")).click();
		 // Electronics is mousehover
		 Thread.sleep(500);
		 WebElement electronics =driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[1]"));
		 ele.moveToElement(electronics).perform();
		 // Search Realme
		 Thread.sleep(500);
		driver.findElement(By.xpath("//a[@title='Realme']")).click();
		// Click 1st Product name
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
}
}
