package seleniumDemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbCreateAccount {
	public static WebDriver driver;

	public static void main(String[] args) {
		openBrowser();
		WebElement e1 = driver.findElement(By.xpath("//form[@data-testid =\"royal_login_form\"]/div[5]/a"));
		clickButton(e1);
		WebElement w1 = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		isSelectByIndex(w1,30);
		
		WebElement w2 = driver.findElement(By.xpath("//select[@aria-label ='Month']"));
		isSelectByValue(w2,"2");
		
		
		WebElement w3 = driver.findElement(By.xpath("//select[@aria-label ='Year']"));
		isSelectByVisibleText(w3,"1996");

	}
	
	@SuppressWarnings("deprecation")
	public static void openBrowser() {
		System.setProperty("webDriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	public static void clickButton(WebElement ele) {
		if(ele.isDisplayed())
		{
			ele.click();
		}
		else
		{
			System.out.println("element is not visible");
		}
	}
	
	public static void isSelectByIndex(WebElement ele1,int i)
	{
		if(ele1.isDisplayed())
		{
			Select s1 = new Select(ele1);
			s1.selectByIndex(i);
		}
		else
		{
			System.out.println("not displayed");
		}
	}
	
	public static void isSelectByValue(WebElement ele2,String s)
	{
		if(ele2.isDisplayed())
		{
			Select s2 = new Select(ele2);
			s2.selectByValue(s);
			
		}
		else
		{
			System.out.println("no string displayed");
		}
		
	}
	
	public static void isSelectByVisibleText(WebElement ele3,String s2)
	{
		if(ele3.isDisplayed())
		{
			Select s3 = new Select(ele3);
			s3.selectByVisibleText(s2);
		}
		else
		{
			System.out.println("no string displayed");
		}

	}
	

}
