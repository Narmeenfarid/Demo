import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		String name="rahul";
//		System.setProperty("webdriver.chrome.driver", 
//				"C:\\Users\\Narmeen\\Downloads\\chromedriver_win32\\chromedriver.exe");
//ChromeDriver driver= new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Narmeen\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
String password=getpassword(driver);
driver.get("https://rahulshettyacademy.com/locatorspractice/");
driver.findElement(By.id("inputUsername")).sendKeys(name);
driver.findElement(By.name("inputPassword")).sendKeys(password);
driver.findElement(By.className("submit")).click();


//driver.findElement(By.tagName("p")).getText();
Thread.sleep(2000);
String actual=driver.findElement(By.cssSelector("div[class='login-container'] p")).getText();
Assert.assertEquals(actual, "You are successfully logged in.");
driver.findElement(By.xpath("//button[text()='Log Out']")).click();

//Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
driver.close();
	}
	public static String getpassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String pwdtext=driver.findElement(By.cssSelector("form p")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		//0th index Please use temporary password 
		//1st index 'rahulshettyacademy' to Login.
		String[] PasswordArray=pwdtext.split("'");
		String[] PasswordArray2=PasswordArray[1].split("'");
		String password=PasswordArray2[0];
		return password;

		
	}

}
