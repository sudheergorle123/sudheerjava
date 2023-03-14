package seleniumDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class A {
	WebDriver driver;
	@BeforeTest
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","/drivers_folder/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://127.0.0.1:81/login.do");
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	
	@BeforeClass
	public void login() {
		driver.findElement(By.name("username")).sendKeys("admin"+Keys.TAB+"manager"+Keys.ENTER);
	}

	@AfterClass
	public void logout()
	{
		driver.findElement(By.xpath("//img[@class ='logoutImg']")).click();
	}
	
	

}
