package actionUsingcoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Challenge8 {
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
		 // Heating and cooling is second mousehover
		 WebElement heatAndcool =driver.findElement(By.xpath("(//a[@data-level='Heating & Cooling'])[1]"));
		 ele.moveToElement(heatAndcool).perform();
		 // Air conditioners is third mousehover
		 WebElement airConditioner =driver.findElement(By.xpath("//a[@title='Air Conditioners']"));
		 ele.moveToElement(airConditioner).perform();
		 // Click portable air conditioners
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@title='Portable Air Conditioners']")).click();
		 

}
}
