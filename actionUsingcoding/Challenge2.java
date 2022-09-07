package actionUsingcoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Challenge2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//Launch browser
		 WebDriver driver=new ChromeDriver();
		 //get 
		 driver.get("https://www.amazon.in/");
		 //manage and maximize the window
		 driver.manage().window().maximize();
		 // Perform Action
		 Thread.sleep(2000);
		 Actions ele =new Actions(driver);
		 // Try Prime first mouseHover
		 WebElement prime =driver.findElement(By.xpath("//span[text()='Prime']"));
		 ele.moveToElement(prime).perform();
		 // Click Free fast delivery on prime items
		 driver.findElement(By.xpath("//span[text()='Prime']")).click();

}
}
