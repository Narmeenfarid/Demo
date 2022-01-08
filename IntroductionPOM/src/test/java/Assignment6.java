import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Narmeen\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();

		String grabtext = driver.findElement(By.cssSelector("label[for='bmw']")).getText();
		System.out.println(grabtext);
		driver.findElement(By.id("dropdown-class-example")).click();
		WebElement dd = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(dd);
		s.selectByVisibleText(grabtext);

		driver.findElement(By.id("name")).sendKeys(grabtext);
		driver.findElement(By.id("alertbtn")).click();
		boolean alerttext = driver.switchTo().alert().getText().contains(grabtext);
		System.out.println(alerttext);
		//Assert.assertTrue(alerttext);
//		String[] alerttext = driver.switchTo().alert().getText().split(",");
//		String[] formattedtext = alerttext[0].split("Option1");
//		String formatted1 = System.out.println(fo);

	}

}
