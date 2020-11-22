package testcases;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_win32/chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	            
	    String baseUrl = "http://www.google.co.uk/";
	    driver.get(baseUrl);
	    Thread.sleep(5000);
	    ((JavascriptExecutor)driver).executeScript("window.open()");
//	    ((JavascriptExecutor)driver).executeScript("window.open()");	    

	    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    for (String string : tabs) {
			System.out.println("Value of tab is "+string);
		}
	    driver.switchTo().window(tabs.get(1)); //switches to new tab
	    driver.get("https://www.facebook.com");
	    
	    driver.switchTo().window(tabs.get(0)); // switch back to main screen        
	    driver.get("https://www.news.google.com");
	    Thread.sleep(10000);

	}

}
