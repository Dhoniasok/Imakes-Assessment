package actionUsingcoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Challenge12 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//Disable notifications in sites
		 ChromeOptions options=new ChromeOptions();
		 options.addArguments("--disable-notifications");
		 //Launch browser
		 ChromeDriver driver=new ChromeDriver(options);  
		 //get 
		 driver.get("https://www.amazon.in");
		 //manage and maximize the window
		 driver.manage().window().maximize();
		 // Perform Action
		 Thread.sleep(2000);
		 Actions ele =new Actions(driver);
		 // Sign-in is first mousehover
		 WebElement sigIn =driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		 ele.moveToElement(sigIn).perform();
		 // Click Register
		 driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]")).click();
		 // Give details for Register
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("viratashok997@gmail.com");
}
}
