package alertUsingCoding;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Challenge3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//Launch browser
		 WebDriver driver=new ChromeDriver();
		 //get 
		 driver.get("http://demo.automationtesting.in/Alerts.html");
		 //manage and maximize the window
		 driver.manage().window().maximize();
		 // Click Alert with text box button
		 driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		 // Click button to demonstrate an prompt box
		 driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		 // Perform prompt alert
		 Thread.sleep(1000);
		 Alert a= driver.switchTo().alert();
		 a.sendKeys("Imakes Solution");
		 a.accept();

}
}
