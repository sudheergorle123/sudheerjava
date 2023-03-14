package week1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe");
		WebDriver c1 = new ChromeDriver();
		c1.get("http://msi:81/login.do");

	}

}
