package test;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class B extends A {
	
	@BeforeMethod
	public void clickonProjectsandCustomers()
	{
		driver.findElement(By.linkText("Projects & Customers")).click();
	}

	@Test
	public void testCreateCustomer()
	{
		driver.findElement(By.xpath("//input[@value = 'Add New Customer']")).click();
		 driver.findElement(By.xpath("//input[@name = 'name']")).sendKeys("shivajirai");
		 driver.findElement(By.linkText("Open Tasks")).click();
	}
	
	@AfterMethod
	public void retreiveSuccessMsg() {
		String s1  = driver.findElement(By.xpath("//span[@id ='ConfirmWarning']")).getText();
		 System.out.println(s1);
	}
}
