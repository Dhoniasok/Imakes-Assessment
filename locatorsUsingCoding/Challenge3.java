package locatorsUsingCoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Challenge3 {
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		//Launch browser
		 WebDriver driver=new ChromeDriver();
		 //get 
		 driver.get("https://www.amazon.in/");
		 //manage and maximize the window
		 driver.manage().window().maximize();
		 //Enter iphone 
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		 //and search
		 driver.findElement(By.id("nav-search-submit-button")).click();

}
}

