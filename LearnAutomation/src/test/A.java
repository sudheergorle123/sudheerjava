package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class A {
	public static WebDriver driver;
	
	@BeforeTest
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers1\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@AfterTest
	 public void closeBrowser()
	 {
		 driver.close();
	 }
	 
	@BeforeClass
	 public void login()
	 {
		 driver.findElement(By.name("username")).sendKeys("admin");
		 driver.findElement(By.name("pwd")).sendKeys("manager"+Keys.ENTER);
		 
	 }
	 
	@AfterClass
	 public void logout()
	 {
		 driver.findElement(By.xpath("//img[@class ='logoutImg']")).click();
	 }
}
