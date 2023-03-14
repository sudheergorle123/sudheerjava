package seleniumDemos;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "./drivers_folder/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		String currentwindow = driver.getWindowHandle();
		System.out.println(currentwindow);
		Set<String> a1 = driver.getWindowHandles();
		for(String a : a1)
		{
			driver.switchTo().window(a);
			if(driver.getTitle().contains("https://demo.guru99.com/articles_popup.php"))
			{
				//Thread.sleep(3000);
				driver.switchTo().window(a);
				driver.findElement(By.name("emailid")).sendKeys("sudheer234@gmail.com");
				driver.findElement(By.xpath("//input[@name ='btnLogin']")).click();
				break;
				
			}
			/*driver.switchTo().window(currentwindow);
			driver.close();*/
		}
		

	}

}
