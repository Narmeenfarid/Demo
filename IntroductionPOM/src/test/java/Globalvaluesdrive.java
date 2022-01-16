import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Globalvaluesdrive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
Properties prop=new Properties();
FileInputStream fls=new FileInputStream("D:\\eclipse-workspace\\git\\Demo\\IntroductionPOM\\src\\test\\java\\data.properties");
	
prop.load(fls);
	System.out.println(prop.getProperty("browser"));
	System.out.println(prop.getProperty("url"));
	prop.setProperty("browser", "firefox");
	FileOutputStream fos=new FileOutputStream("D:\\eclipse-workspace\\git\\Demo\\IntroductionPOM\\src\\test\\java\\data.properties");
	prop.store(fos, null);
	}

}
