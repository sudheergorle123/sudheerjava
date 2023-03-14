package driventest3;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import Datadriventesting.ExcelOperation;

public class CreateCustomer extends Bsecalls{
	
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException
	{
	String url = ExlOperation.readData("Sheet1",0,0);
	String un = ExlOperation.readData("Sheet1", 0,1);
	String pwd = ExlOperation.readData("Sheet1",0,2);
	String cn = ExlOperation.readData("Sheet1",0,3);
	String exp = ExlOperation.readData("Sheet1",0,4);
	//System.setProperty("webdriver.chrome.driver","./drivers_folder/chromedriver.exe");
	//WebDriver c1 = new ChromeDriver();
	Bsecalls.openBrowser();
	c1.get(url);
	c1.findElement(By.name("username")).sendKeys(un);
	c1.findElement(By.name("pwd")).sendKeys(pwd+Keys.ENTER);
	c1.manage().window().maximize();
	c1.findElement(By.linkText("Projects & Customers")).click();
	c1.findElement(By.xpath("//input[@value = 'Add New Customer']")).click();
	c1.findElement(By.name("name")).sendKeys(cn);
	c1.findElement(By.xpath("//input[@value ='Create Customer']")).click();
	String act = c1.findElement(By.xpath("//span[@class = 'successmsg']")).getText();
	System.out.println(act);
	if(exp.contains(act))
	{
		ExlOperation.writeData("Sheet1",0,5,"pass");
	}
	else
	{
		ExlOperation.writeData("Sheet1",0,5,"fail");
	}
	ExcelOperation.writeData("Sheet1",0,6,act);
	c1.close();
	
	
	
	
	}
}
