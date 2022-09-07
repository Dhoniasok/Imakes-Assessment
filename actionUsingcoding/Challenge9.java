package actionUsingcoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Challenge9 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//Disable notifications in sites
		 ChromeOptions options=new ChromeOptions();
		 options.addArguments("--disable-notifications");
		 //Launch browser
		 ChromeDriver driver=new ChromeDriver(options);  
		 //get 
		 driver.get("https://www.homedepot.com");
		 //manage and maximize the window
		 driver.manage().window().maximize();
		 // Perform Action
		 Thread.sleep(2000);
		 Actions ele =new Actions(driver);
		 // All department is first mousehover
		 WebElement allDepartment =driver.findElement(By.xpath("(//a[@data-id='departmentsFlyout'])[1]"));
		 ele.moveToElement(allDepartment).perform();
		 // Paint is second mousehover
		 Thread.sleep(1000);
		 WebElement paint =driver.findElement(By.xpath("(//a[@data-level='Paint'])[1]"));
		 ele.moveToElement(paint).perform();
		 // Interior painting is third mousehover
		 WebElement interior =driver.findElement(By.xpath("(//a[text()='Interior Paint'])[1]"));
		 ele.moveToElement(interior).perform();
		 // Click ceiling paint
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@title='Ceiling Paint']")).click();

}
}
