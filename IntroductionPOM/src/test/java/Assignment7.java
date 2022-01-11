import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Narmeen\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		WebElement table=driver.findElement(By.id("product"));
		int rowsize=table.findElements(By.tagName("tr")).size();
		System.out.println(rowsize);
		int columnsize=table.findElements(By.tagName("th")).size();
		System.out.println(columnsize);
		List<WebElement> rowdata=driver.findElements(By.xpath("//table[@name='courses']/tbody//tr[position()=3]"));
		System.out.println(rowdata.size());
		for(WebElement r: rowdata) {
			
			System.out.println(r.getText());
			
		}
		
		
		
		
		
		
	}

}
