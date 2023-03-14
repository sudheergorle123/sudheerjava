package seleniumDemos;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10Screenshot {
	public static WebDriver driver;

	public static void main(String[] args) {
		openBrowser();
		screenShot();

	}
	
	@SuppressWarnings("deprecation")
	public static void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers_folder/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://127.0.0.1:81/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public static void screenShot()
	{
		/*String filename = (new Date()).toString().replace(" ","_").replace(".","-").trim()+".png";
		String destinationFilePath = System.getProperty("user.dir")+File.separator+"ScreenShots/"+filename;
		System.out.println(destinationFilePath);
		try {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File f1 = ts.getScreenshotAs(OutputType.FILE);
		File f2 = new File(destinationFilePath);
		FileUtils.moveFile(f1, f2);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
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
			 
			finally {
			}
			
		
		
	}
	

}
