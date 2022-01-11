import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LiveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Narmeen\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		//capture all the elements in the list
		List<WebElement> elementsList=driver.findElements(By.xpath("//tr/td[1]"));
		//2.Capture text of all elements
		//the below statement iterate through each and every element of the list
		//storing al the elements in the new list
		List<String> originalist=elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		//sort the original list and again collect it into new list
		List<String> sortedlist=originalist.stream().sorted().collect(Collectors.toList());
		//compare original list vs sorted list
		Assert.assertTrue(originalist.equals(sortedlist));
		List<String>price;
		do
		{
			List<WebElement> rows=driver.findElements(By.xpath("//tr/td[1]"));
		price=rows.stream().filter(s -> s.getText().contains("Rice"))

.map(s -> getPriceVeggie(s)).collect(Collectors.toList());
		price.forEach(s->System.out.println(s));
		if(price.size()<1) {
			driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
		}
		} while(price.size()<1);
	}

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		
		String pricevalue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}

}
