package week1;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase4 {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers1\\chromedriver.exe");
		ChromeDriver c1 = new ChromeDriver();
		c1.get("http://127.0.0.1:81/login.do");
		c1.findElement(By.name("username")).sendKeys("admin");
		c1.findElement(By.name("pwd")).sendKeys("manager");
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_ENTER);
		WebElement w1 =c1.findElement(By.xpath("//select[@name = 'customerProject.shownCustomer']"));
		Select s1 = new Select(w1);
		s1.selectByVisibleText("vijayanirmala");
		

	}

}
