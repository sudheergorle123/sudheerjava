package week1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers1\\chromedriver.exe");
		 ChromeDriver c1 = new ChromeDriver();
		 c1.get("http://127.0.0.1:81/login.do");
		 c1.findElement(By.name("username")).sendKeys("admin");
		 c1.findElement(By.name("pwd")).sendKeys("manager");
		 c1.findElement(By.xpath("//input[@type='submit']")).click();
		 c1.findElement(By.linkText("Projects & Customers")).click();
		 c1.findElement(By.xpath("//input[@value = 'Archive Selected Customers & Projects']")).click();
		 String s1 = c1.switchTo().alert().getText();
		 System.out.println(s1);
		 c1.switchTo().alert().accept();

	}

}
