package actionUsingcoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Challenge15 {
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
		 // Baby&Kids is mouse-hover
		 Thread.sleep(500);
		 WebElement babyKids =driver.findElement(By.xpath("//span[text()='Baby & Kids']"));
		 ele.moveToElement(babyKids).perform();
		// Click Remote Control Toys
		 Thread.sleep(500);
		 driver.findElement(By.xpath("//a[@title='Remote Control Toys']")).click();
		 

}
}
