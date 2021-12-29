
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Narmeen\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		
		   // driver.manage().window().maximize();
		  
		
		      
		//Launch the first URL
		driver.get("http://www.google.com");

		// below code will navigate you to your desirable Url
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open('https://www.facebook.com/', '_blank');");
		

	}

}
