package friday08;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseClass1 {
	
	public static WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void openBrowser()
	{
		String browser = "chrome";
		String url ="http://127.0.0.1:81/login.do";
		if(browser.equals("chrome"))
		{
			System.setProperty("webDriver.chrome.driver", "C:\\drivers1\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webDriver.gecko.driver", "C:\\drivers1\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	
	@BeforeClass
	public void login()
	{
		String un = "admin";
		String pwd = "manager";
		driver.findElement(By.name("username")).sendKeys(un+Keys.TAB+pwd+Keys.ENTER);
	}
	
	@AfterClass
	public void logout()
	{
		driver.findElement(By.xpath("//img[@class = 'logoutImg']")).click();
	}
	

}
