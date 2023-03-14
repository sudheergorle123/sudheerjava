package Actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentRepo {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		
		
		ExtentSparkReporter htmlreporter = new ExtentSparkReporter("Extentrepoert2.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		
		ExtentTest test1  = extent.createTest("testing started");
		
		System.setProperty("webdriver.chrome.driver", "./drivers_folder/chromedriver.exe");
		driver = new ChromeDriver();
		
		test1.log(Status.INFO, "testcase started");
		
		driver.get("http://127.0.0.1:81/login.do");
		driver.findElement(By.name("username")).sendKeys("admin"+Keys.TAB + "manager" +Keys.ENTER);
		test1.pass("Entered text in search box");
		
		driver.findElement(By.xpath("//img[@class ='logoutImg']")).click();
		test1.pass("testing completed");
		test1.info("Test completed");
		
		extent.flush();
		
		
		
		
		
		
		
		

	}

}
