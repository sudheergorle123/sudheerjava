package week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers1\\chromedriver.exe");
		ChromeDriver c1 = new ChromeDriver();
		c1.get("http://127.0.0.1:81/login.do");
		c1.findElement(By.name("username")).sendKeys("admin");
		c1.findElement(By.name("pwd")).sendKeys("manager");
		c1.findElement(By.xpath("//input[@type = 'submit']")).click();
		c1.findElement(By.linkText("Projects & Customers")).click();
		c1.findElement(By.xpath("//input[@value = 'Add New Project']")).click();
		WebElement w1 = c1.findElement(By.xpath("//select[@name = 'customerId']"));
		Select s1 = new Select(w1);
		s1.selectByVisibleText("vijayanirmala");
		c1.findElement(By.xpath("//input[@name = 'name']")).sendKeys("student333");
		c1.findElement(By.xpath("//textarea[@name = 'description']")).sendKeys("which class are u studying");
		c1.findElement(By.xpath("//input[@name = 'createProjectSubmit']")).click();
		String s11 = c1.findElement(By.xpath("//span[@class = 'successmsg']")).getText();
		System.out.println(s11);
		c1.manage().window().maximize();
		c1.findElement(By.xpath("//img[@class='logoutImg']")).click();
		//c1.close();
	}

}
