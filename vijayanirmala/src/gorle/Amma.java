package gorle;

import org.openqa.selenium.chrome.ChromeDriver;

public class Amma {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\drivers1\\chromedriver.exe");
		ChromeDriver c1 = new ChromeDriver();
		c1.get("http://127.0.0.1:81/login.do");
		c1.manage().window().maximize();

	}

}
