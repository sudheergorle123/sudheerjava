package week1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers1\\chromedriver.exe");
		 ChromeDriver c1 = new ChromeDriver();
		 c1.get("http://127.0.0.1:81/login.do");
		 c1.findElement(By.name("username")).sendKeys("admin");
		 c1.findElement(By.name("pwd")).sendKeys("manager");
		 c1.findElement(By.xpath("//input[@type='submit']")).click();
		 c1.findElement(By.linkText("Projects & Customers")).click();
		 c1.findElement(By.linkText("buildshop")).click();
		 c1.findElement(By.xpath("//input[@value = 'Delete This Project']")).click();
		 c1.switchTo().alert().dismiss();
		 c1.findElement(By.xpath("//input[@value = 'Archive This Project']")).click();
		 String s1 = c1.switchTo().alert().getText();
		 System.out.println("Print text on the console is:"+s1);
		 c1.switchTo().alert().accept();
		 c1.findElement(By.xpath("//img[@class ='logoutImg']")).click();
		 
	}

}
