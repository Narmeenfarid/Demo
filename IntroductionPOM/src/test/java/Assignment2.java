import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String text="Rahul";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Narmeen\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://me.cleartrip.com/");
		driver.findElement(By.cssSelector("input[class='field bw-1 bs-solid w-100p p-2 box-border br-4 fs-2 c-neutral-900 h-8 bc-neutral-100 c-neutral-900 focus:bc-secondary-500 flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 pr-2 pl-3 pt-2 pb-2 ba br-4 h-8 null']")).sendKeys("New");
		Thread.sleep(2000);
		List<WebElement> options=driver.findElements(By.xpath("(//li[@class='ls-reset br-4 w-100p px-2 dropdown__item c-neutral-900 fs-3 hover:bg-secondary-500 hover:c-white c-pointer'])"));
		for(WebElement option: options) {
			// loop will run and mje options me sy ek option chahie every time when loop iterates and return type
			//of that element will be WebElement
			if(option.getText().equalsIgnoreCase("New York, US - All airports (NYC)")){
				option.click();
				break;
			
			}
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,300)", "");
			WebElement adult= driver.findElement(By.cssSelector("div[class='mb-4'] select[class='bc-neutral-100 bg-transparent']"));
			Select s =new Select(adult);
			s.selectByValue("2");
		}
	}

}
