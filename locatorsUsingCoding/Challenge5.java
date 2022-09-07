package locatorsUsingCoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Challenge5 {
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
			// Launch browser
			 WebDriver driver=new ChromeDriver();
			 // get 
			 driver.get("https://demo.automationtesting.in/Register.html");
			 // manage and maximize the window
			 driver.manage().window().maximize();
			 // Enter First name
			 driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Kuamr");
			 // Enter Last name
			 driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("A");
			 // Enter email
			 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("viratashok997@gmail.com");
			 // Select Male
			 driver.findElement(By.xpath("//input[@type='radio']")).click();
			 // Enter Phone number
			 driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9950483678");
			 // Click Submit
			 driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
	}

}
