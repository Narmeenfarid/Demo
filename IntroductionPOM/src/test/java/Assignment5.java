import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

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
driver.findElement(By.linkText("Nested Frames")).click();
//Number of Frames on a Page

int countIframesInPage = driver.findElements(By.tagName("frame")).size();
System.out.println("Number of Frames on a Page:" + countIframesInPage);
//Locate the frame1 on the webPage
WebElement frame1=driver.findElement(By.name("frame-top"));

//Switch to Frame1
driver.switchTo().frame(frame1);
WebElement frameinsideframe1=driver.findElement(By.name("frame-middle"));
driver.switchTo().frame(frameinsideframe1);
//print text

System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
//Locate the Element inside the Frame1
//WebElement frame1Element= driver.findElement(By.xpath("//div[@id='content']"));

//Get the text for frame1 element
//String frame1Text=frame1Element.getText();
//System.out.println("Frame1 is :"+frame1Text);
int countIframesInFrame1 =driver.findElements(By.tagName("frame")).size();
System.out.println("Number of iFrames inside the Frame1:" + countIframesInFrame1);


	}

}
