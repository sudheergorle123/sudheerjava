package gorle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\drivers1\\chromedriver.exe");
		ChromeDriver c1 = new ChromeDriver();
		c1.get("http://127.0.0.1:81/login.do");
		c1.findElement(By.name("username")).sendKeys("admin"+Keys.TAB+"manager"+Keys.ENTER);
		c1.findElement(By.linkText("Projects & Customers")).click();
		c1.findElement(By.xpath("//input[@value='Add New Customer']")).click();
		c1.findElement(By.name("name")).sendKeys("krishna");
		c1.findElement(By.linkText("Open Tasks")).click();
		String s1 = c1.findElement(By.xpath("//input[@value='Cancel Customer Creation and Proceed']")).getAttribute("value");
		System.out.println(s1);
		c1.findElement(By.xpath("//input[@value='Cancel Customer Creation and Proceed']")).click();
		
	}

}
