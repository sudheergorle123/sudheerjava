package week1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers1\\chromedriver.exe");
		ChromeDriver c1 = new ChromeDriver();
		c1.get("https://www.eenadu.net/telugu-news/movies/telugu-news-interesting-facts-about-allu-arjun-pushpa-the-rise/0212/121256806");

	}

}
