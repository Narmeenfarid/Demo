import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Narmeen\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,5);
		String[] itemsneeded = { "Brocolli","Cucumber","Beetroot","Carrot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);
		additems(driver,itemsneeded);
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		driver.findElement(By.cssSelector("div[class='cart-preview active'] button[type='button']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoCode")));
		 		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		 		driver.findElement(By.className("promoBtn")).click();
		 		
		 		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		 		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		}

	
public static void additems(WebDriver driver,String[] itemsneeded) {
	int j = 0;
	List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
	
	for (int i = 0; i < product.size(); i++) {
		String[] name = product.get(i).getText().split("-");
		// format it to get actual vegetable name
		// trim to remove spaces from right and left
		String formatedname = name[0].trim();

		// convert array to array list
		List itemsneededlist = Arrays.asList(itemsneeded);

		
		if (itemsneededlist.contains(formatedname)) {
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			j++;
			if (j == itemsneeded.length) {
				break;
			}
		}
}
}
}
