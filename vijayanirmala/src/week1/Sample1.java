package week1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers1\\chromedriver.exe");
		ChromeDriver c1 = new ChromeDriver();
		c1.get("file:///D:/html/1.html");
		c1.findElement(By.xpath("//td[text()=' selenium ']/..//input[@type = 'checkbox']")).click();
		

	}

}
