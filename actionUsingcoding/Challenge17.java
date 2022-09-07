package actionUsingcoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Challenge17 {
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
		 // Perform Action
		 Thread.sleep(2000);
		 Actions ele =new Actions(driver);
		 // click Top offers
		 driver.findElement(By.xpath("(//div[@class='xtXmba'])[1]")).click();
		 // Appliances is First mousehover
		 Thread.sleep(500);
		 WebElement appliances =driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[2]"));
		 ele.moveToElement(appliances).perform();
         // Television is Second mousehover(not available in site)
		 // Click Mi (32) 4A Pro Android TV
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[text()='Mi (32) 4A Pro Android TV']")).click();
}
}
