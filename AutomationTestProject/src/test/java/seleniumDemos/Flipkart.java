package seleniumDemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		openbrowser();
		WebElement w1 = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		Actions a1 = new Actions(driver);
		a1.doubleClick(w1).build().perform();
		driver.findElement(By.xpath("//input[@class =\"_2IX_2- VJZDxU\"]")).sendKeys("sudheergorle.5@gmail.com");
		driver.findElement(By.xpath("//input[@class=\"_2IX_2- _3mctLh VJZDxU\"]")).sendKeys("HASINIPRIYA");
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span")).click();
		Thread.sleep(5000);
		WebElement w2 = driver.findElement(By.xpath("//div[@id =\"container\"]/div/div/div/div[2]/div[3]/div/div/div/div"));
		Actions a2 = new Actions(driver);
		a2.moveToElement(w2).build().perform();
		
	}
		@SuppressWarnings("deprecation")
		public static void openbrowser()
		{
			System.setProperty("webdriver.chrome.driver", "./drivers_folder/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			driver.get("https://flipkart.com");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}

	

}
