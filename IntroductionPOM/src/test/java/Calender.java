import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Narmeen\\Downloads\\chromedriver_win32\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://www.path2usa.com/travel-companions");
driver.findElement(By.id("travel_date")).click();
driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April");


while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch'] ")).getText().contains("April")) {
	driver.findElement(By.cssSelector("table[class=' table-condensed'] th[class='next']")).click();
}
List<WebElement> dates=driver.findElements(By.className("day"));
int count=driver.findElements(By.className("day")).size();
for(int i=0;i<count;i++) {
	String text=driver.findElements(By.className("day")).get(i).getText();
	if(text.equalsIgnoreCase("23")) {
		driver.findElements(By.className("day")).get(i).click();
		break;
	}
		
	
}
	}
}
