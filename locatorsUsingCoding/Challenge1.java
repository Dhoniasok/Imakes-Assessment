package locatorsUsingCoding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Challenge1 {
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		//Launch browser
		 WebDriver driver=new ChromeDriver();
		 //get 
		 driver.get("https://www.facebook.com/");
		 //manage and maximize the window
		 driver.manage().window().maximize();
		 
	}

}
