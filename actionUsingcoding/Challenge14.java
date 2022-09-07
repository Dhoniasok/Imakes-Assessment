package actionUsingcoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Challenge14 {
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
		 // // click Top offers
		 driver.findElement(By.xpath("(//div[@class='xtXmba'])[1]")).click();
		 // womens is mouse-hover
		 WebElement womens =driver.findElement(By.xpath("(//div[@class='_1psGvi SLyWEo'])[1]"));
		 ele.moveToElement(womens).perform();
		 WebElement womensFootwear =driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		 ele.moveToElement(womensFootwear).perform();
		 // Click flat slipper
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//a[@class='_6WOcW9 _3YpNQe'])[2]")).click();

}
}
