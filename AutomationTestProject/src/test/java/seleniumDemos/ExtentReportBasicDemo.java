package seleniumDemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportBasicDemo {

	private static WebDriver driver;

	public static void main(String[] args) {
	
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentRepoerts.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test1 = extent.createTest("Google Search Test one");
		
		System.setProperty("webdriver.chrome.driver", "D://drivers//chromedriver.exe");
		driver = new ChromeDriver();
		
		test1.log(Status.INFO, "Starting testcase");
		driver.get("https://google.com");
		test1.pass("navigated to google.com");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		test1.pass("Entered text in searchbox");
		
		//driver.findElement(By.name("btnK")).click();
		driver.close();
		driver.quit();
		
		test1.pass("closed the browser");
		test1.info("Test completed");
		
		extent.flush();
		
		
		
		
	}

}
