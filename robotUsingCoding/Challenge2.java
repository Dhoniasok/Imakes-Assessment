package robotUsingCoding;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Challenge2 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		//Launch browser
		 WebDriver driver=new ChromeDriver();
		 //get 
		 driver.get("https://www.google.co.in");
		 //manage and maximize the window
		 driver.manage().window().maximize();
		 // Perform Action
		 Thread.sleep(2000);
		 Actions ele =new Actions(driver);
		 //Enter Inmakes Infotech 
		 WebElement click=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		 click.sendKeys("Inmakes_Infotech");
		 //and select Inmakes Infotech using double click
		 ele.doubleClick(click).perform();

}
}
