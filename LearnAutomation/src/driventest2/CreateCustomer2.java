package driventest2;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateCustomer2 {
	@Test
	
		public void testCreatecustomer() throws EncryptedDocumentException, IOException
		{
			
			String url = XlOperation.readData("Sheet1", 0, 1);
			String un = XlOperation.readData("Sheet1", 0, 2);
			String pwd = XlOperation.readData("Sheet1", 0, 3);
			String cn = XlOperation.readData("Sheet1", 0, 4);
			String exp = XlOperation.readData("Sheet1", 0, 5);
			System.setProperty("webdriver.chrome.driver", "C:\\drivers1\\chromedriver.exe");
			ChromeDriver c1 = new ChromeDriver();
			c1.get(url);
			c1.findElement(By.name("username")).sendKeys(un);
			c1.findElement(By.name("pwd")).sendKeys(pwd+Keys.ENTER);
			c1.findElement(By.linkText("Projects & Customers")).click();
			c1.findElement(By.xpath("//input[@value ='Add New Customer']")).click();
			c1.findElement(By.name("name")).sendKeys(cn);
			c1.findElement(By.name("createCustomerSubmit")).click();
			String act = c1.findElement(By.xpath("//span[@class ='successmsg']")).getText();
			System.out.println("required option:"+act);
			if(exp.contains(act))
			{
				XlOperation.writeData("sheet1", 0, 6, "pass");
			}
			else
			{
				XlOperation.writeData("sheet1", 0, 6, "fail");
			}
			
		}
	}


