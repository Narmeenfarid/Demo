import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Capabilities;

public class HTTPSCertifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		ch.acceptInsecureCerts();
ChromeOptions c=new ChromeOptions();
c.merge(ch);
	}

}
