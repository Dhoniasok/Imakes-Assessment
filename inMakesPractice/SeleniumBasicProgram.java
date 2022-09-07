package inMakesPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasicProgram {
	 public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 //Launch browser
		 WebDriver driver=new ChromeDriver();
		 //get 
		 driver.get("https://en-gb.facebook.com/");
		 //manage and maximize the window
		 driver.manage().window().maximize();
		 // get Title
		 String pageTitle=driver.getTitle();
		 System.out.println("The current page Title is : " +pageTitle);
		 //get url
		 String pageURL=driver.getCurrentUrl();
		 System.out.println("The current URL of the page : " +pageURL);
		 //close browser
		 driver.close();
		 //quit browser
		 driver.quit();
		}
}
