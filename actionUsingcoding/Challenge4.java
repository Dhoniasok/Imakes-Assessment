package actionUsingcoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Challenge4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//Launch browser
		 WebDriver driver=new ChromeDriver();
		 //get 
		 driver.get("https://www.shopclues.com/wholesale.html");
		 //manage and maximize the window
		 driver.manage().window().maximize();
		 // Perform Action
		 Thread.sleep(2000);
		 Actions ele =new Actions(driver);
		 // Mobile and electronics is first mouse-over
		 WebElement mobiles =driver.findElement(By.xpath("//li[@id='nav_44']"));
		 ele.moveToElement(mobiles).perform();
		 // Get the “Apple” name
		 Thread.sleep(2000);
		 WebElement getname=driver.findElement(By.xpath("(//a[@target='_blank'])[9]"));
		 System.out.println(getname.getText());

}
}
