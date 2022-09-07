package locatorsUsingCoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Challenge7 {
	
	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		//Launch browser
		 WebDriver driver=new ChromeDriver();
		 //get 
		 driver.get("https://www.redbus.in/");
		 //manage and maximize the window
		 driver.manage().window().maximize();
		 // Click signUp/SignIn
		 driver.findElement(By.xpath("//div[@id='sign-in-icon-down']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//li[text()='Sign In/Sign Up']")).click();
		 
}
}
