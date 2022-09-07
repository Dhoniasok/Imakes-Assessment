package actionUsingcoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Challenge3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//Launch browser
		 WebDriver driver=new ChromeDriver();
		 //get 
		 driver.get("http://www.flipkart.com");
		 //manage and maximize the window
		 driver.manage().window().maximize();
		 // Perform Action
		 Thread.sleep(2000);
		 Actions ele =new Actions(driver);
		 // Home & Furniture is first mouse hover
		 WebElement home =driver.findElement(By.xpath("(//div[@class='xtXmba'])[6]"));
		 ele.moveToElement(home).perform();
		 driver.findElement(By.linkText("Home Furnishings")).click();
		 Thread.sleep(2000);
		 WebElement homeAndFurniture =driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		 ele.moveToElement(homeAndFurniture).perform();
		 // Click Bath Towels and print any product name
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Bath Towels']")).click();
		Thread.sleep(2000);
		WebElement name=driver.findElement(By.xpath("(//a[text()='vibe bath Cotton 500 GSM Bath Towel'])[1]"));
		System.out.println(name.getText());
}
}
