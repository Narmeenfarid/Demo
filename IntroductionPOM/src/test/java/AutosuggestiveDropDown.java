import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//abcd
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Narmeen\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("india");
		Thread.sleep(2000);
		List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement option: options) {
			// loop will run and mje options me sy ek option chahie every time when loop iterates and return type
			//of that element will be WebElement
			if(option.getText().equalsIgnoreCase("India")){
				option.click();
				break;
			
			
			}
			
		}
		
	}

}
