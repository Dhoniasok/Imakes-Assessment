package locatorsUsingCoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Challenge16 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		// Launch browser
		 WebDriver driver=new ChromeDriver();
		 // get 
		 driver.get("https://www.shopclues.com/wholesale.html");
		 // manage and maximize the window
		 driver.manage().window().maximize();
		 // Search any product and click 1st product
		 driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Mobiles");
		 driver.findElement(By.xpath("//a[@class='srch_action btn orange']")).click();

}
}
