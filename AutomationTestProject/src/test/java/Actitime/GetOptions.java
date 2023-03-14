package Actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers_folder/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:81/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.xpath("//input[@value='Add New Project']")).click();
		WebElement w1 =driver.findElement(By.name("customerId"));
		Select s1 = new Select(w1);
		int i = s1.getOptions().size();
		System.out.println("no of options().size()="+i);

	}

}
