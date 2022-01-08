import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Narmeen\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://qaclickacademy.com/");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='sumome-react-svg-image-container']")));

		// driver.findElement(By.xpath("//div[@class='sumome-react-svg-image-container']"));
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//div[@class='sumome-react-svg-image-container']"))).click()
				.build().perform();

		driver.findElement(By.linkText("PRACTICE")).click();
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		WebElement columndriver=footerdriver.findElement(By.xpath("//tbody/tr/td[1]/ul[1]"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++) {
			String clickonlink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			Thread.sleep(5000L);
			
		} //opens all the tabs
			Set<String> abc=driver.getWindowHandles();
			Iterator<String> it=abc.iterator();
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			
			
		

	}

}
