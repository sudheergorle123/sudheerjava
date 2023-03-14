package inheritance;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateCustomerTC extends BaseClass {
	@Test
	public void createCustomer()
	{
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.xpath("//input[@value = 'Add New Customer']")).click();
		driver.findElement(By.xpath("//input[@name = 'name']")).sendKeys("shivajiK0n");
		driver.findElement(By.name("createCustomerSubmit")).click();
	}
	

}
