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

public class Challenge4 {
	public static void main(String[] args) throws InterruptedException, AWTException {
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
		 // Click login and type a email in email text-box
		 WebElement signIn =driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		 ele.moveToElement(signIn).perform();
		 driver.findElement(By.xpath("(//span[text()='Sign in'])[1]")).click();
		 // and type a email in email text-box
		 WebElement type=driver.findElement(By.xpath("//input[@type='email']"));
		 ele.sendKeys("Rajkumar");
		 ele.doubleClick(type).perform();
		 // select email and right click
		 ele.contextClick(type).perform();
		 //  and click cut
		 Robot r=new Robot();
		 for(int i=0;i<6;i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		 }     
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER); 
}
}
