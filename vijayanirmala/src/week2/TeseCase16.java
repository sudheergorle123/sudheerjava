package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class TeseCase16 {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\drivers1\\chromedriver.exe" );
			ChromeDriver c1 = new ChromeDriver();
			c1.get("http://127.0.0.1:81/login.do");
			c1.findElement(By.name("username")).sendKeys("admin"+Keys.TAB+"manager"+Keys.ENTER);

	}

}
