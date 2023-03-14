package Datadriventesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateCustomer {
	@Test
	public void testcreateCustomer() throws EncryptedDocumentException, IOException
	{
		String url = ExcelOperation.readdata("Sheet1", 1, 0);
		String un = ExcelOperation.readdata("Sheet1", 1, 1);
		String pwd = ExcelOperation.readdata("Sheet1", 1, 2);
		String cn = ExcelOperation.readdata("Sheet1", 1, 3);
		String exp = ExcelOperation.readdata("Sheet1", 1, 4);
		System.setProperty("webdriver.chrome.driver","./drivers_folder/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.name("username")).sendKeys(un+Keys.TAB+pwd+Keys.ENTER);
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.xpath("//input[@value = 'Add New Customer']")).click();
		driver.findElement(By.xpath("//input[@name = 'name']")).sendKeys(cn);
		driver.findElement(By.name("createCustomerSubmit")).click();
		String act = driver.findElement(By.className("successmsg")).getText();
		ExcelOperation.writeData("Sheet1", 1, 5, act);
		if(exp.contains(act))
		{
			ExcelOperation.writeData("Sheet1", 1, 6, "pass");
			
		}
		else 
		{
			ExcelOperation.writeData("Sheet1", 1, 6, "fail");
		}
		
	}

}
