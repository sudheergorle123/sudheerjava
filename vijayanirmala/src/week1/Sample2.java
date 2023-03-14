package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers1\\chromedriver.exe");
		ChromeDriver c1 = new ChromeDriver();
		c1.get("file:///D:/html/parent.html");
		c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		c1.findElement(By.xpath("//input[@placeholder = 'username']")).sendKeys("sudheer");
		c1.findElement(By.xpath("//input[@placeholder = 'password']")).sendKeys("gorle");
		c1.switchTo().frame(0);
		//c1.switchTo().frame("1.html");
		c1.findElement(By.xpath("//input[@type= 'checkbox']")).click();

	}

}
