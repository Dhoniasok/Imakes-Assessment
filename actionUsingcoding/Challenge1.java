package actionUsingcoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Challenge1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//Launch browser
		 WebDriver driver=new ChromeDriver();
		 //get 
		 driver.get("https://demo.guru99.com/test/drag_drop.html");
		 //manage and maximize the window
		 driver.manage().window().maximize();
		 // Perform Action
		 Thread.sleep(6000);
		 Actions ele =new Actions(driver);
		// Drag and drop bank in Account ,5000 in amount at debited side
		 WebElement acctoDrag=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		 WebElement acctoDrop=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		 ele.dragAndDrop(acctoDrag, acctoDrop).perform();
		 Thread.sleep(2000);
		 WebElement amttoDrag=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		 WebElement amttoDrop=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		 ele.dragAndDrop(amttoDrag, amttoDrop).perform();
		 //Drag and drop sales in Account ,5000 in amount at credited side
		 Thread.sleep(2000);
		 WebElement acctoDrag1=driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		 WebElement acctoDrop1=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		 ele.dragAndDrop(acctoDrag1, acctoDrop1).perform();
		 Thread.sleep(2000);
		 WebElement amttoDrag1=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		 WebElement amttoDrop1=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		 ele.dragAndDrop(amttoDrag1, amttoDrop1).perform();
	}

}
