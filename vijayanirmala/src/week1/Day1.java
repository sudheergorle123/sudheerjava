package week1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers1\\chromedriver.exe");
		ChromeDriver c1 = new ChromeDriver();
		c1.get("http://127.0.0.1:81/login.do");
		c1.manage().window().maximize();
		Dimension d1 = new Dimension(500,500);
		c1.manage().window().setSize(d1);
		c1.findElement(By.xpath("//input[@type = 'text']")).sendKeys("admin");
		c1.findElement(By.xpath("//input[@type = 'password']")).sendKeys("manager");
		c1.findElement(By.xpath("//input[@type = 'submit']")).click();
		c1.manage().window().maximize();
		
		
		
	}
}
