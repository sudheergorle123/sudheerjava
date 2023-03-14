package vijaya;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\drivers1\\chromedriver106.exe");
		ChromeDriver c1 = new ChromeDriver();
		c1.get("http://127.0.0.1:81/login.do");
		c1.findElement(By.name("username")).sendKeys("admin");
		c1.findElement(By.name("pwd")).sendKeys("manager");
		c1.findElement(By.xpath("//input[@type = 'submit']")).click();
		c1.findElement(By.linkText("Projects & Customers")).click();
		c1.findElement(By.xpath("//input[@value='Add New Customer']")).click();
		c1.findElement(By.name("name")).sendKeys("vijju1");
		c1.findElement(By.name("description")).sendKeys("very powerful");
		c1.findElement(By.name("createCustomerSubmit")).click();
		String s1 = c1.findElement(By.xpath("//span[@class='successmsg']")).getAttribute("class");
		System.out.println(s1);
		c1.findElement(By.className("logoutImg")).click();
		c1.close();
		

	}

}
