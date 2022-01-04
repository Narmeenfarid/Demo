import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Narmeen\\Downloads\\chromedriver_win32\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.manage().window().maximize();
driver.get("https://jqueryui.com/droppable/");
//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
System.out.println(driver.findElements(By.tagName("iframe")).size());
driver.switchTo().frame(0);
//driver.findElement(By.cssSelector("#draggable p")).getText();
Actions a =new Actions(driver);
WebElement source=driver.findElement(By.id("draggable"));
WebElement target=driver.findElement(By.id("droppable"));
a.dragAndDrop(source, target).build().perform();
driver.switchTo().defaultContent();
System.out.println(driver.findElement(By.className("entry-title")));
	}

}
