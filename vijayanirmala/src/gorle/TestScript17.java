package gorle;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TestScript17 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers1\\chromedriver.exe");
		ChromeDriver c1 = new ChromeDriver();
		c1.get("http://127.0.0.1:81/login.do");
		c1.findElement(By.name("username")).sendKeys("admin"+Keys.TAB+"manager"+Keys.ENTER);
		c1.findElement(By.linkText("Reports")).click();
		c1.manage().window().maximize();
		c1.findElement(By.xpath("//img[@alt='Click Here to Pick up the date']")).click();
		String currentwindow = c1.getWindowHandle();
		Set<String> a1 = c1.getWindowHandles();
		for(String a:a1)
		{
			c1.switchTo().window(a);
			if(c1.getTitle().contains("Calendar"))
			{
				c1.manage().window().maximize();
				c1.findElement(By.xpath("//span[text()='31']")).click();
				break;
			}
		}
		c1.switchTo().window(currentwindow);
		c1.findElement(By.className("logoutImg")).click();
		EventFiringWebDriver e1 = new EventFiringWebDriver(c1);
		File f1 = e1.getScreenshotAs(OutputType.FILE);
		File f2 = new File("C:\\screenshot\\logoutpage.jpg");
		FileUtils.moveFile(f1, f2);

	}

}
