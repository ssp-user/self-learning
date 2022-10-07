package revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//vishaljoshi//Documents//git//self-learning//chromeDriver//v105//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.yahoo.com/");
		driver.manage().window().maximize();
		driver.quit();
	}

}
