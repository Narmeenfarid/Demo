import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Narmeen\\Downloads\\chromedriver_win32\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.manage().window().maximize();
driver.get("https://the-internet.herokuapp.com/");
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,2000)");
driver.findElement(By.linkText("Multiple Windows")).click();
driver.findElement(By.linkText("Click Here")).click();
Set<String> windows=driver.getWindowHandles();
Iterator<String>it=windows.iterator();
String parentId=it.next();
String childId=it.next();
driver.switchTo().window(childId);

System.out.println(driver.findElement(By.cssSelector(".example h3")).getText());
driver.switchTo().window(parentId);
System.out.println(driver.findElement(By.cssSelector(".example h3")).getText());

	}

}
