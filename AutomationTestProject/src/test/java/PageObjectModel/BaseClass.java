package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public static WebDriver driver;
	@BeforeTest
	public void openBrowser()
	{
		String browser = "chrome";
		String url ="http://127.0.0.1:81/login.do";
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers_folder/chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		
	}
	
	@BeforeClass
	public void login()
	{
		driver.findElement(By.name("username")).sendKeys("admin"+Keys.TAB+"manager"+Keys.ENTER);
	}
	
	@AfterClass
	public void logout()
	{
		driver.findElement(By.xpath("//img[@class = 'logoutImg']")).click();
	}

}
