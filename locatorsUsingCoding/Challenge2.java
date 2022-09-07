package locatorsUsingCoding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Challenge2 {
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		//Launch browser
		 WebDriver driver=new ChromeDriver();
		 //get 
		 driver.get("https://www.gmail.com/");
		 //manage and maximize the window
		 driver.manage().window().maximize();
		 
		 
		 

}
}