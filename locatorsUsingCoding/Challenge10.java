package locatorsUsingCoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Challenge10 {
	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
			// Launch browser
			 WebDriver driver=new ChromeDriver();
			 // get 
			 driver.get("https://www.amazon.in/");
			 // manage and maximize the window
			 driver.manage().window().maximize();
			 // Click any product and search
			 driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
			 
	}
}
