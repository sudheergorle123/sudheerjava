package driventest3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bsecalls {
	public static WebDriver c1 ;
	
	public static void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","./drivers_folder/chromedriver.exe");
		c1 = new ChromeDriver();
	}
	
	

}
