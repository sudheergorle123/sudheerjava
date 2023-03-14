package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase14 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers1\\chromedriver.exe");
		 ChromeDriver c1 = new ChromeDriver();
		 c1.get("https://parabank.parasoft.com/parabank/index.htm");
		 c1.findElement(By.linkText("Register")).click();
		 c1.findElement(By.id("customer.firstName")).sendKeys("sudheer");
		 c1.findElement(By.id("customer.lastName")).sendKeys("gorle");
		 c1.findElement(By.id("customer.address.street")).sendKeys("thampatapalli");
		 c1.findElement(By.id("customer.address.city")).sendKeys("palakonda");
		 c1.findElement(By.id("customer.address.state")).sendKeys("srikakulam");
		 c1.findElement(By.id("customer.address.zipCode")).sendKeys("532440");
		 c1.findElement(By.id("customer.phoneNumber")).sendKeys("9805674321");
		 c1.findElement(By.id("customer.ssn")).sendKeys("34567");
		 c1.findElement(By.id("customer.username")).sendKeys("Double1");
		 c1.findElement(By.id("customer.password")).sendKeys("Dhamaka@1");
		 c1.findElement(By.id("repeatedPassword")).sendKeys("Dhamaka@1");
		 c1.findElement(By.xpath("//input[@value = 'Register']")).click();
		 c1.findElement(By.linkText("Log Out")).click();
		 c1.findElement(By.xpath("//input[@name = 'username']")).sendKeys("Double1");
		 c1.findElement(By.xpath("//input[@name='password']")).sendKeys("Dhamaka@1");
		 c1.findElement(By.xpath("//input[@value = 'Log In']")).click();
		 

		 

	}

}
