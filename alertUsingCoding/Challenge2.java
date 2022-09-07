package alertUsingCoding;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Challenge2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//Launch browser
		 WebDriver driver=new ChromeDriver();
		 //get 
		 driver.get("http://demo.automationtesting.in/Alerts.html");
		 //manage and maximize the window
		 driver.manage().window().maximize();
		 // Click Alert with ok & cancel button
		 driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		 // Click button to display an confirm box
		 driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		 // Perform confirm alert
		 Thread.sleep(1000);
		 Alert a= driver.switchTo().alert();
		 a.accept();

}
}
