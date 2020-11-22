package testcases;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StashExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://timesofindia.indiatimes.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		Set<String> s = driver.getWindowHandles();
		int i = 1;
		for (String string : s) {
			System.out.println("Handle of window "+ i + " is "+string);	
			driver.switchTo().window(string);
			Thread.sleep(5000);
			i++;
		}
	}

}
