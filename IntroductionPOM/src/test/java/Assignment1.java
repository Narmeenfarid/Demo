import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Narmeen\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
		
		System.out.println((driver.findElement(By.id("checkBoxOption1")).isSelected()));
		
		driver.findElement(By.id("checkBoxOption1")).click();
		
		System.out.println((driver.findElement(By.id("checkBoxOption1")).isSelected()));
		
	System.out.println(driver.findElements(By.xpath("(//input[@type='checkbox'])[position()<=2]")).size());
		
		

	}

}
