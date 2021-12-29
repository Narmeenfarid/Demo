import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowactivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Narmeen\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		ChromeDriver driver= new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.google.com");
		WebDriver driver= new FirefoxDriver();
		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
		driver.navigate().back();
		driver.navigate().forward();
		
		
		
	}

}
