package week1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase8 {
	public static void main(String[]args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\drivers1\\chromedriver.exe");
		 ChromeDriver c1 = new ChromeDriver();
		 c1.get("http://127.0.0.1:81/login.do");
		 c1.findElement(By.name("username")).sendKeys("admin");
		 c1.findElement(By.name("pwd")).sendKeys("manager");
		 c1.findElement(By.xpath("//input[@type='submit']")).click();
		 c1.findElement(By.linkText("Users")).click();
		 c1.findElement(By.xpath("//input[@value = 'Add New User']")).click();
		 c1.findElement(By.xpath("//input[@name = 'username']")).sendKeys("gorle");
		 c1.findElement(By.xpath("//input[@name = 'passwordText']")).sendKeys("sudheer");
		 c1.findElement(By.xpath("//input[@name = 'passwordTextRetype']")).sendKeys("sudheer");
		 c1.findElement(By.xpath("//input[@name = 'firstName']")).sendKeys("gorle");
		 c1.findElement(By.xpath("//input[@name = 'lastName']")).sendKeys("sudheer");
		 c1.findElement(By.xpath("//input[@name = 'phone']")).sendKeys("9087663453");
		 c1.findElement(By.xpath("//input[@name = 'email']")).sendKeys("sudheergrole@gmail.com");
		 c1.findElement(By.xpath("//input[@name = 'mobile']")).sendKeys("9087663453");
		 c1.findElement(By.xpath("//input[@value = '   Create User   ']")).click();
		 String s1 = c1.findElement(By.xpath("//span[@class='successmsg']")).getText();
		 System.out.println(s1);
		 c1.findElement(By.xpath("//img[@class = 'logoutImg']")).click();
		
		 
	}

}
