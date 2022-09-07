package locatorsUsingCoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Challenge4 {
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
			//Launch browser
			 WebDriver driver=new ChromeDriver();
			 //get 
			 driver.get("https://www.facebook.com/");
			 //manage and maximize the window
			 driver.manage().window().maximize();
			 //Enter email
			 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("viratashok997@gmail.com");
			 //Enter Password
			 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");
			 //Click Login button
			 driver.findElement(By.name("login")).click();
	}

}
