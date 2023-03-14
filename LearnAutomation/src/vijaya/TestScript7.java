package vijaya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScript7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\drivers1\\chromedriver106.exe");
		ChromeDriver c1 = new ChromeDriver();
		c1.get("http://127.0.0.1:81/login.do");
		c1.findElement(By.name("username")).sendKeys("admin");
		c1.findElement(By.name("pwd")).sendKeys("manager");
		c1.findElement(By.xpath("//input[@type = 'submit']")).click();
		c1.findElement(By.linkText("Reports")).click();
		WebElement w1 = c1.findElement(By.name("users"));
		Select s1 = new Select(w1);
		s1.selectByIndex(0);
		s1.selectByIndex(1);
		s1.selectByIndex(2);
		s1.deselectByIndex(0);
		s1.deselectByIndex(1);
		WebElement w2 = c1.findElement(By.name("fromMonth"));
		Select s2 = new Select(w2);
		s2.selectByIndex(0);

	}

}
