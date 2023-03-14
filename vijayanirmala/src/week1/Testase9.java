package week1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testase9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers1\\chromedriver.exe");
		 ChromeDriver c1 = new ChromeDriver();
		 c1.get("http://127.0.0.1:81/login.do");
		 c1.findElement(By.name("username")).sendKeys("admin");
		 c1.findElement(By.name("pwd")).sendKeys("manager");
		 c1.findElement(By.xpath("//input[@type='submit']")).click();
		 c1.findElement(By.linkText("Reports")).click();
		 WebElement w1 =c1.findElement(By.xpath("//select[@name = 'users']"));
		 Select s1 = new Select(w1);
		 if(s1.isMultiple())
		 {
			 System.out.println("dd is multiselect");
			
		 }
		 else
			 System.out.println("dd is single selected");
		 int i = s1.getOptions().size();
		 System.out.println("no of options are:"+i);
		 List<WebElement> a1 = s1.getOptions();
		for(int i1 = 0 ; i1 < a1.size() ; i1++)
		{
			String s2 = a1.get(i1).getText();
			System.out.println(s2);
		}
		for(int j = 0 ; j < a1.size(); j++)
		{
			s1.selectByIndex(j);
		}
		s1.deselectAll();
		for(int k = 0 ; k < a1.size(); k++)
		{
			if(k%2 != 0)
			{
				s1.selectByIndex(k);
			}
			
		}
		s1.deselectAll();
		for( int l = a1.size()-1 ; l >= 0 ; l--)
		{
			s1.selectByIndex(l);
			
		}
		for( int l = a1.size()-1 ; l >= 0 ; l--)
		{
			s1.deselectByIndex(l);
			
		}
		c1.findElement(By.xpath("//img[@class = 'logoutImg']")).click();
	}

}
