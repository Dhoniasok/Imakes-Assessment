package alertUsingCoding;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Challenge1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//Launch browser
		 WebDriver driver=new ChromeDriver();
		 //get 
		 driver.get("http://demo.automationtesting.in/Alerts.html");
		 //manage and maximize the window
		 driver.manage().window().maximize();
		 // Click button to display an alert box
		 driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		 // and click OK button
		Alert a= driver.switchTo().alert();
		 a.accept();
	}
}
