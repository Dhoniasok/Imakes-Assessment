package locatorsUsingCoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Challenge8 {
	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		//Launch browser
		 WebDriver driver=new ChromeDriver();
		 //get 
		 driver.get("https://www.cleartrip.com/trains");
		 //manage and maximize the window
		 driver.manage().window().maximize();
		 // Enter from
		 driver.findElement(By.xpath("//input[@title='From station']")).sendKeys("chennai");
		 // Enter To
		 driver.findElement(By.xpath("//input[@title='To station']")).sendKeys("mumbai");
		 // Click search
		 driver.findElement(By.xpath("//button[@id='trainFormButton']")).click();
		 
	}
}
