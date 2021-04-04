package learning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.http.cookie.Cookie;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;

public class SwitchTabs {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VISHAL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Load the website
		driver.get("http://google.com/");
//		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
//		driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL + "t");
		((JavascriptExecutor)driver).executeScript("window.open();");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("http://facebook.com");
		driver.switchTo().window(tabs.get(0));	
		driver.findElement(By.name("q")).sendKeys("Vanad Joshi");
		System.out.println("Hello world");	
		driver.switchTo().window(tabs.get(1));		
		driver.findElement(By.id("email")).sendKeys("Vanad Joshi");		
		// It will return the parent window name as a String
	}
}
