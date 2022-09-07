package robotUsingCoding;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Challenge5 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		//Launch browser
		 WebDriver driver=new ChromeDriver();
		 //get 
		 driver.get("https://www.snapdeal.com");
		 //manage and maximize the window
		 driver.manage().window().maximize();
		 // Perform Action
		 Thread.sleep(2000);
		 Actions ele =new Actions(driver);
		 // Select any item
		 WebElement product =driver.findElement(By.xpath("(//div[@class='product_name'])[5]"));
		// then right click and press open in a new window
		 ele.contextClick(product).perform();
		 // and press open in a new window
		 Robot r=new Robot();
		 for(int i=0;i<2;i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		 }     
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER); 
}
}
