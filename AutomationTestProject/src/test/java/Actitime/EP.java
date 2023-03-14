package Actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class EP {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		ExtentSparkReporter htmlrep = new ExtentSparkReporter("ep.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlrep);
		ExtentTest test =extent.createTest("testing strated");
		
		System.setProperty("webdriver.chrome.driver", "./drivers_folder/chromedriver.exe");
		driver = new ChromeDriver();
		test.log(Status.INFO,"test case started");
		
		driver.get("http://127.0.0.1:81/login.do");
		driver.findElement(By.name("username")).sendKeys("admin"+Keys.TAB+"manager"+Keys.ENTER);
		test.pass("entered the keys");
		
		driver.findElement(By.xpath("//img[@class ='logoutImg']")).click();
		test.pass("close the website");
		
		extent.flush();
		
		
		
		
		

	}

}
