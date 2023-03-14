package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginLogout {
	@Parameters({"t1","t2"})
	@Test
	public void testLoginLogout(String un,String psd)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\drivers1\\chromedriver.exe");
		
		ChromeDriver c1 = new ChromeDriver();
		c1.get("http://127.0.0.1:81/login.do");
		c1.findElement(By.xpath("//input[@name = 'username']")).sendKeys(un);
		c1.findElement(By.xpath("//input[@name='pwd']")).sendKeys(psd);
		c1.findElement(By.xpath("//input[@type='submit']")).click();
	
	}

}
