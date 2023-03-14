package seleniumDemos;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9ScreenShot  {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webDriver.chrome.driver", "./drivers_folder/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		try {
		  try {
			String filename = (new Date()).toString().replace(" ","_").replace(":","-").trim()+".png";
			String destinationFilePath = System.getProperty("user.dir")+File.separator+"ScreenShots/"+filename;
			System.out.println(destinationFilePath);
			
			try
			{
			TakesScreenshot e1 = (TakesScreenshot)driver;
			File f1 = e1.getScreenshotAs(OutputType.FILE);
			
			File f2 = new File(destinationFilePath);
			FileUtils.moveFile(f1, f2);			
			}
		catch(Exception e)
		{
			System.out.println("Exception occured"+e.getMessage());
			
		}
		  }
		  catch(Exception e)
			{ 
			  e.printStackTrace();
			}
		}
		  catch(Exception e)
			{ 
			  e.printStackTrace();
			}
		finally {
		}
		
	}
}

		  
		





