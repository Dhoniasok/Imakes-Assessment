package locatorsUsingCoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Challenge14 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		// Launch browser
		 WebDriver driver=new ChromeDriver();
		 // get 
		 driver.get("https://www.google.com/");
		 // manage and maximize the window
		 driver.manage().window().maximize();
		 //Search “Inmakes learning hub” and click first link
		 driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Inmakes learning hub");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//div[@class='wM6W7d'])[1]")).click();
		 
	}
}
