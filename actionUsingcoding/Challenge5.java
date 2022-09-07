package actionUsingcoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Challenge5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//Launch browser
		 WebDriver driver=new ChromeDriver();
		 //get 
		 driver.get("https://www.shopclues.com/wholesale.html");
		 //manage and maximize the window
		 driver.manage().window().maximize();
		 // Perform Action
		 Thread.sleep(2000);
		 Actions ele =new Actions(driver);
		 // Sports&more is first mouse-hover
		 WebElement sport =driver.findElement(By.xpath("//li[@id='nav_45']"));
		 ele.moveToElement(sport).perform();
		 // Click weights gainers
		 driver.findElement(By.xpath("//a[text()='Weight Gainers']")).click();

}
}
