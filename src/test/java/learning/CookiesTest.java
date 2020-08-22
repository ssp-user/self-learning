package learning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.http.cookie.Cookie;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Setup\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/"); //Linkedin URL for testing
		driver.manage().window().maximize();	
		driver.manage().deleteAllCookies();
		
	}
}
