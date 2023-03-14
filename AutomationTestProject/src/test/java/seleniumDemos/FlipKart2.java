package seleniumDemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class FlipKart2 {
	
	public static WebDriver driver;

	@Test
	public void openFlipkart() {
		openBrowser();
		WebElement w1 =driver.findElement(By.xpath("//header[@id ='navbar-main']/div/div/div[3]/div[1]/a[2]/div/span[@id ='nav-link-accountList-nav-line-1']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(w1).perform();
		driver.findElement(By.xpath("//span[@class ='nav-action-inner']")).click();
		driver.findElement(By.xpath("//input[@type ='email']")).sendKeys("7989122950");
		driver.findElement(By.xpath("//input[@id ='continue']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sudheer@1");
		driver.findElement(By.xpath("//input[@id ='signInSubmit']")).click();
		WebElement w2 =driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"));
		Actions a2 = new Actions(driver);
		a2.moveToElement(w2).perform();
		driver.findElement(By.xpath("//header[@id ='navbar-main']/div/div[3]/div[3]/div[2]/div/div[2]/a[1]/span[@class='nav-text']")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div/div[3]/div[1]/a/div/div/div/div[2]/h2")).click();
		driver.findElement(By.xpath("//*[@id=\"ya-myab-address-add-link\"]/div/div/h2")).click();
		driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressFullName\"]")).sendKeys("sudheergorle");
		driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressPhoneNumber\"]")).sendKeys("7989122950");
		driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressPostalCode\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressPostalCode\"]")).sendKeys("532440");
		/*WebElement w11 = driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressStateOrRegion\"]/span/span"));
		Select s1 = new Select(w11);
		s1.selectByIndex(5);*/
		driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressLine1\"]")).sendKeys("marthahalli");
		driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressLine2\"]")).sendKeys("pedda veedhi");
		driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-landmark\"]")).sendKeys("near sachivalayam");
		driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-form-submit-button\"]/span/input")).click();
		driver.findElement(By.xpath("//*[@id=\"ya-myab-address-delete-btn-0\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"deleteAddressModal-0-submit-btn\"]/span/input")).click();
		
		
	}
	
	@SuppressWarnings("deprecation")
	public static void openBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "./drivers_folder/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}

}
