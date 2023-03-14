package Actitime;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class Screenshot {
	@Test
	public void testScreenshot() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers_folder/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:81/login.do");
		driver.findElement(By.name("username")).sendKeys("admin"+Keys.TAB+"manager"+Keys.ENTER);
		EventFiringWebDriver e1 = new EventFiringWebDriver(driver);
		File f1 = e1.getScreenshotAs(OutputType.FILE);
		File f2 = new File("D:\\screenshot\\homepage.jpg");
		FileUtils.moveFile(f1, f2);
		
		
		
	}

}
