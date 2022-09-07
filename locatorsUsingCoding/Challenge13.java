package locatorsUsingCoding;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Challenge13 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// Launch browser
		 WebDriver driver=new ChromeDriver();
		 // get 
		 driver.get("https://inmakesedu.com/");
		 // manage and maximize the window
		 driver.manage().window().maximize();
		 // Print Dubai address
		 List<WebElement> lst = driver.findElements(By.xpath("//a[@target='_blank']"));
		 for(int i=0;i<1;i++)
		 {
			 System.out.println(lst.get(i).getText());
		 }
	}		 
}
