package seleniumDemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10actitime {
	public static WebDriver driver;
	public static void main(String[] args) {
		openBrowser();
		WebElement w1 = driver.findElement(By.name("username"));
		inputData(w1,"admin");
		WebElement w2 = driver.findElement(By.name("pwd"));
		inputData(w2,"manager");
		
		WebElement w3 = driver.findElement(By.xpath("//input[@type =\"submit\"]"));
		onClick(w3);
		

	}
	
	@SuppressWarnings("deprecation")
	public static void openBrowser()
	{
		System.setProperty("webDriver.chrome.driver", "./drivers_folder/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://127.0.0.1:81/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public static void inputData(WebElement e1,String data)
	{
		try {
			e1.sendKeys(data);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	public static void onClick(WebElement e2)
	{
		try {
			e2.click();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
		

}
