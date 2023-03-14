package seleniumDemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;



@SuppressWarnings("deprecation")
public class Day8 {
	public static WebDriver driver; 
	public static void main(String[] args) {
		openBrowser();
		WebElement e3 = driver.findElement(By.xpath("//i[@class = 'oxd-icon bi-list oxd-topbar-header-hamburger']"));
		click(e3,"sudheer");
		WebElement e4 = driver.findElement(By.xpath("/html/body/div/div/div[1]/aside/nav/div[2]/ul/li[5]/a/span"));
		click(e4,"sudheer");
		

	}
	public static void openBrowser() {
		System.setProperty("webDriver.chrome.driver","./drivers_folder/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("flipkart.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("//input[@name = 'username']"));
		input(e1,"Admin","sudheer");
		WebElement e2 = driver.findElement(By.xpath("//input[@name = 'password']"));
		input(e2,"admin123","sudheer");
		WebElement e =driver.findElement(By.xpath("//button[@class= 'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		click(e,"sudheer");
		
		
	}
	
	public static void click(WebElement ele,String fieldname)
	{
		try
		{
		
			if(ele.isDisplayed())
			{
				ele.click();
			}
		}
		catch(Exception e)
		{
			Assert.fail("Element is not displayed at this point of time" + e.getMessage()); 
			
		}
		{
			
		}
	}
	
	public static void input(WebElement e,String data,String fieldname)
	{
		try
		{
			if(e.isDisplayed())
			{
				e.clear();
				e.sendKeys(data);
			}
		}
		catch(Exception e1)
		{
			Assert.fail("Element is not displayed at this point of time"+ e1.getMessage()+fieldname);
			
		}
	}


}
