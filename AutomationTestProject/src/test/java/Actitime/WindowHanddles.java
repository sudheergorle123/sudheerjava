package Actitime;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class WindowHanddles {
	
	@Test
	public void testWindowHandle() throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers_folder/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:81/login.do");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin"+Keys.TAB+"manager"+Keys.ENTER);
		driver.findElement(By.linkText("Reports")).click();
		driver.findElement(By.xpath("//img[@alt = 'Click Here to Pick up the date']")).click();
		String currentwindow = driver.getWindowHandle();
		Set<String> a1 = driver.getWindowHandles();
		for(String a :a1)
		{
			driver.switchTo().window(a);
			if(driver.getTitle().contains("Calendar"))
			{
				
				driver.manage().window().maximize();
				EventFiringWebDriver e1 = new EventFiringWebDriver(driver);
				File f1 = e1.getScreenshotAs(OutputType.FILE);
				File f2 = new File("D:\\screenshot\\calendar.jpg");
				FileUtils.moveFile(f1, f2);
				driver.findElement(By.className("calendarCurrentDay")).click();
				
				break;
				
			}
		}
		
		driver.switchTo().window(currentwindow);
		driver.findElement(By.xpath("//img[@class = 'logoutImg']")).click();
		driver.close();
	}
	

}
