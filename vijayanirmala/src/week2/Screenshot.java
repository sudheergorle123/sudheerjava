package week2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

@SuppressWarnings("deprecation")
public class Screenshot {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers1\\chromedriver.exe");
		ChromeDriver c1 = new ChromeDriver();
		c1.get("http://127.0.0.1:81/login.do");
		c1.findElement(By.name("username")).sendKeys("admin"+Keys.TAB+"manager"+Keys.ENTER);
		c1.manage().window().maximize();
		EventFiringWebDriver e1 = new EventFiringWebDriver(c1);
		File f1 = e1.getScreenshotAs(OutputType.FILE);
		File f2 = new File("C:\\screenshot\\loginpage.jpg");
		FileUtils.moveFile(f1,f2);
	}

}
