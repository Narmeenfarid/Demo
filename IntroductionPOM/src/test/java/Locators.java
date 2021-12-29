import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Narmeen\\Downloads\\chromedriver_win32\\chromedriver.exe");
ChromeDriver driver= new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://rahulshettyacademy.com/locatorspractice/");
driver.findElement(By.id("inputUsername")).sendKeys("rahul");
driver.findElement(By.name("inputPassword")).sendKeys("hello123");
driver.findElement(By.className("submit")).click();
System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
driver.findElement(By.linkText("Forgot your password?")).click();
driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("John@rsa.com");
//driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
//driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("John@gmail.com");
driver.findElement(By.xpath("//form/input[3]")).sendKeys("03420024336");
driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
System.out.println(driver.findElement(By.cssSelector("form p")).getText());

driver.findElement(By.xpath("//button[contains(@class,'go')]")).click();
Thread.sleep(1000);
driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
driver.findElement(By.cssSelector("input[type*='pass'")).sendKeys("rahulshettyacademy");
driver.findElement(By.id("chkboxOne")).click();
driver.findElement(By.id("chkboxTwo")).click();
driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();



	}

}
