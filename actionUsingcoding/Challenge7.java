package actionUsingcoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Challenge7 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//Launch browser
		 WebDriver driver=new ChromeDriver();
		 //get 
		 driver.get("https://lh.inmakesedu.com/home");
		 //manage and maximize the window
		 driver.manage().window().maximize();
		 // Perform Action
		 Thread.sleep(2000);
		 Actions ele =new Actions(driver);
		 // Course is first mouse-hover
		 WebElement course =driver.findElement(By.xpath("//a[@class='nav-link']"));
		 ele.moveToElement(course).perform();
		 // Software testing training is second mouse-hover
		 WebElement softTest =driver.findElement(By.xpath("(//div[@class='dropdown dropright p-0 m-0'])[10]"));
		 ele.moveToElement(softTest).perform();
		 // Click selenium Advanced training
		 driver.findElement(By.xpath("//a[text()='ST Master Class']")).click();


}
}
